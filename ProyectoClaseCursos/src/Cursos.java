/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cellad14
 */
public class Cursos {

    /*
    CRUD create, read, Update, delete
    Atributos
    ID
    String nombre curso
    Persona Profesor
    Array Personas ListaAlumnos[20]
    Char Dia
    int Hora
    metodos
    Curso lista cursos[20]
    hacer clase estatic para almacenar los cursos y no perderlos
    
     */
    //Atributos
    private int cursoID;//id + 1 para que no se repite
    private String nombreCurso;
    private Persona profesor;
    private Persona listaAlumnos[] = new Persona[20];
    private char dia;
    private int hora;

    //Propiedades
    //hacer gets y sets per set a la lista no
    public int getId() {
        return cursoID;
    }

    public void setId(int id) {
        this.cursoID = id;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Persona getProfesor() {
        return profesor;
    }

    public void setProfesor(Persona profesor) {
        this.profesor = profesor;
    }

    public Persona[] getListaAlumnos() {
        return listaAlumnos;
    }

    public char getDia() {
        return dia;
    }

    public void setDia(char dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    //constructores
    public Cursos() {

    }

    public Cursos(int id, String nombreCurso, Persona profesor, char dia, int hora) {
        this.cursoID = id;
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.dia = dia;
        this.hora = hora;
    }
    

}
