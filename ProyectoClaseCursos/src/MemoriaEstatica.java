
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Cellad14
 */
public class MemoriaEstatica {

    //Aatributos
    public static Cursos[] listaCursos = new Cursos[20];
    public static int idCursos;
    public static String nombreCurso;

    //Propiedades
    //Constructores
    //Metodos
    public static void AgregarCursos(Cursos IDAgregado, Cursos nombreAgregado) {
        for (int i = 0; i < listaCursos.length; i++) {
            //System.out.println(String.format("Digite los nombres", i, listaCursos[i].setNombreCurso(nombreAgregado));
        }
        idCursos++;
        IDAgregado.setId(idCursos);
        for (int i = 0; i < listaCursos.length; i++) {
            if (listaCursos[i] == null) {
                listaCursos[i] = IDAgregado;
            }
        }

    }

    public static void ListarCursos() {
        for (int i = 0; i < listaCursos.length; i++) {
            System.out.println(String.format("Los cursos son", i, listaCursos[i].getId(), listaCursos[i].getNombreCurso()));
        }
    }
}
