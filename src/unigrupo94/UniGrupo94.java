
package unigrupo94;

import java.sql.Connection;
import java.time.LocalDate;
import unigrupo94.AccesoADatos.AlumnoData;
import unigrupo94.AccesoADatos.Conexion;
import unigrupo94.AccesoADatos.InscripcionData;
import unigrupo94.AccesoADatos.MateriaData;
import unigrupo94.Entidades.Alumno;
import unigrupo94.Entidades.Inscripcion;
import unigrupo94.Entidades.Materia;


public class UniGrupo94 {

    
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion(); 
        //Alumno Juan = new Alumno (9,25324439, "luis", "David", LocalDate.of(1990, 3, 20), true);
        //AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(Juan);
        //alu.modificarAlumno(Juan);
        //alu.eliminarAlumno(8);
        /*Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(33214568);
        System.out.println("dni: " + alumnoEncontrado.getDni());
                System.out.println( "apellido: " + alumnoEncontrado.getApellido());*/
        /*AlumnoData alu = new AlumnoData();
        for (Alumno alumno:alu.listarAlumnos()){
            
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
            
        }*/
        
        //Materia mate = new Materia(1, " Literatura ", 2 , true);
        //MateriaData md = new MateriaData();
        //md.guardarMateria(mate);
        //md.modificarMateria(mate);
        //md.eliminarMateria(2);
        //Materia materiaEncontrada = md.buscarMateria(3);
        //System.out.println("nombre: " + materiaEncontrada.getNombre()); 
        //for (Materia materia:md.listarMaterias()){
        //    System.out.println(materia.getNombre());
        //    System.out.println(materia.getAnio());
        
        AlumnoData ad = new AlumnoData ();
        MateriaData md = new MateriaData ();
        InscripcionData id = new InscripcionData ();
        
        Alumno carlos = ad.buscarAlumno(7);
        Materia mate = md.buscarMateria(2); 
        Inscripcion insc = new Inscripcion(carlos,mate,9); 
        
        id.guardarInscripcion(insc);
        
        
    }
       
        
        
        
        
        
        
}
    

