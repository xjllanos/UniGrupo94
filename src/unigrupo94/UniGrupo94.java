
package unigrupo94;

import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
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
        
        Alumno pablo = ad.buscarAlumno(2);
        Materia lite = md.buscarMateria(1); 
        Inscripcion insc = new Inscripcion(pablo,lite,10); 
        
        //id.guardarInscripcion(insc);
        //id.actualizarNota(2, 1, 8);
        //id.borrarInscripcionMateriaAlumno(2, 1);
//        for (Inscripcion inscripcion:id.obtenerInscripciones()){
//        
//            System.out.println("id" + inscripcion.getIdInscripcion());
//            System.out.println("Apellido" + inscripcion.getAlumno().getApellido());
//            System.out.println("Materia" + inscripcion.getMateria().getNombre());
//        }

//        for (Materia materia : id.obtenerMateriasNOCursadas(6)){
//            System.out.println("nombre: " + materia.getNombre());
//        }

//        for (Inscripcion inscripcion:id.obtenerInscripcionesPorAlumno(8)){
//            System.out.println("ID" + inscripcion.getIdInscripcion());
//            System.out.println("Apellido " + inscripcion.getAlumno().getApellido());
//            System.out.println("Materia " + inscripcion.getMateria().getNombre());
//        }

//        for (Materia materia: id.obtenerMateriasCursadas(7)){
//            System.out.println("nombre: " + materia.getNombre());
//        } 
        Scanner sc = new Scanner(System.in);
        System.out.println("Igrese id de materia para obtener alumnos por materia :");
        int idMateria = sc.nextInt();
            
        for (Alumno alumno : id.obtenerAlumnosxMateria(idMateria)) {
            System.out.println("nombre: " + alumno.getNombre());
        }
        //TRAEMOS UNA LISTA DE ALUMNOS QUE CUMPLAN LA CONDICION 
    }
       
        
        
        
        
        
        
}
    

