
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cellad14
 */
public class MantenimientoAlumnos {

    //Atributos
    private String[] listaAlumnos;
    private int[][] AlumnosYCursos;
    private int cantidadAlumnos;
    private int cantidadCursos;
    public static int AlumnoID = 0;
    //Propiedades

    public String[] getListaAlumnos() {
        return listaAlumnos;
    }
    

    public int[][] getAlumnosYCursos() {
        return AlumnosYCursos;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }
    //Constructores

    public MantenimientoAlumnos(int cantidadAlumnos, int cantidadCursos) {
        this.cantidadAlumnos = cantidadAlumnos;
        this.cantidadCursos = cantidadCursos;

        this.listaAlumnos = new String[this.cantidadAlumnos];
        this.AlumnosYCursos = new int[this.cantidadAlumnos][this.cantidadCursos];

    }

    //Metodos
    public void ListarAlumnos() {
        for (int i = 0; i < this.listaAlumnos.length; i++) {
            System.out.println(String.format("%d. Nombre[%d]: %s", (i + 1), i, this.listaAlumnos[i]));
        }

    }

    public void ListarAlumnosPorCurso() {
        for (int i = 0; i < this.listaAlumnos.length; i++) {
            System.out.println(String.format("%d. Nombre[%d]: %s", (i + 1), i, this.listaAlumnos[i]));
            for (int j = 0; j < this.AlumnosYCursos[i].length; j++) {
                System.out.println(String.format("Los alumnos y sus cursos son: %d", AlumnosYCursos[i][j]));
            }
        }
    }
    public void MostrarCursosAlumno(int indiceAlumno) {
        if (indiceAlumno < listaAlumnos.length) {
            for (int j = 0; j < this.AlumnosYCursos[indiceAlumno].length; j++) {
                System.out.println(String.format("El curso del alumno es: %d", AlumnosYCursos[indiceAlumno][j]));
            }
        } else {
            System.out.println("El indice indicado es invalido");
        }
    }
    public void BuscarCursoAlumno(String nombreAlumno){
            for (int i = 0; i<listaAlumnos.length; i++){
            if(listaAlumnos[i].getNombre().equals(nombreAlumno)){
                return listaAlumnos[i];
            }
        }
    }
    
    public boolean AgregarAlumno(Persona itemAlumno){
        AlumnoID++;
        itemAlumno.setCedula(AlumnoID);
        //[C3,C32,null,null...]
        for (int i = 0; i<listaAlumnos.length; i++){
            if (listaAlumnos[i]== null){
                 listaAlumnos[i]=itemAlumno;
                 return true;
            }
         //Si sale del ciclo el arreglo está lleno
        }
        
        return false;
    }
    
    public void ModificarAlumno(Persona alumnoModificado){
        for (int i = 0; i<listaAlumnos.length; i++){
            if(listaAlumnos[i].getCedula()== alumnoModificado.getCedula()){
                listaAlumnos[i]=alumnoModificado;
            
            }
        }
    }    
        
    public void EliminarAlumno(int alumnoCedula){
      for (int i = 0; i<listaAlumnos.length; i++){
            if(listaAlumnos[i].getCedula()== alumnoCedula){
                listaAlumnos[i]=null;
            
            }
        }  
    }       
        
    public void AsociarAlumnosACursos() {
        Scanner cursos = new Scanner(System.in);
        for (int i = 0; i < this.AlumnosYCursos.length; i++) {
            for (int j = 0; j < this.AlumnosYCursos[i].length; j++) {
                System.out.println(String.format("Asocie el curso del alumno en la posicion[%d][%d]", i, j));
                this.AlumnosYCursos[i][j] = cursos.nextInt();
            }
        }
    }

}
