
package unigrupo94.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import unigrupo94.Entidades.Alumno;
import unigrupo94.Entidades.Materia;

public class MateriaData {
    private Connection con =null;
    
    public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        String sql = "INSERT INTO materia (nombre, anio, estado)"
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if (rs.next()){
                
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "materia guardada");
                
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al cargar los drivers");
        }
        
    }
    
    public void modificarMateria(Materia materia){
        
        /*String sql="UPDATE materia SET nombre= ?, anio = ?"
                + "WHERE idMateria = ? ";
        String sql="UPDATE materia SET nombre= ?, anio = ?, estado = ?"
                + "WHERE idMateria = ? ";*/
        String sql="UPDATE materia SET nombre=?,anio=?,estado=? WHERE idMateria";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            //ps.setInt(1, materia.getIdMateria());
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            if(exito==1){ 
                JOptionPane.showMessageDialog(null, "materia modificada");    
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }
        
        
    }
    
    
}
