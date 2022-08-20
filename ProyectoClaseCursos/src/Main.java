/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Cellad14
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        MantenimientoAlumnos llamar = new MantenimientoAlumnos(3, 1);
        int menuAdmin;
        /*
        Ejemplo de instancia
            Solucion llamar1 = new Solucion();
            llamar1.Ejercicio1();
        Print
        System.out.println("");
         */
        do {
            System.out.println("Bienvenid@ al Modo Administrador");
            System.out.println("1. Mantenimiento de Usuarios");
            System.out.println("2. Mantenimiento de Cursos");
            System.out.println("3. Mantenimiento de Rubros");
            System.out.println("4. Mantenimiento de Alumnos");
            System.out.println("5. Ver resultados finales de los cursos");
            System.out.println("6. Mantenimiento de Datos");
            System.out.println("7. Salir");
            menuAdmin = menu.nextInt();
            switch (menuAdmin) {
                //instancias
                case 1:

                    break;
                case 2:
                    int menuCursos;
                    do {
                        System.out.println("Mantenimiento de Cursos");
                        System.out.println("1. Listar Cursos");
                        System.out.println("2. Buscar Curso");
                        System.out.println("3. Agregar Curso");
                        System.out.println("4. Modificar Curso");
                        System.out.println("5. Eliminar Curso");
                        System.out.println("6. Cerrar Curso");
                        System.out.println("7. Menu anterior");
                        menuCursos = menu.nextInt();
                        switch (menuCursos) {
                            case 1:
                                System.out.println("Listar Cursos");
                                MemoriaEstatica.ListarCursos();
                                break;
                            case 2:
                                System.out.println("Buscar Cursos");
                                break;
                            case 3:
                                System.out.println("Agregar Curso");
                                break;
                            case 4:
                                System.out.println("Modificar Curso");
                                break;
                            case 5:
                                System.out.println("Eliminar Curso");
                                break;
                            case 6:
                                System.out.println("Cerrar Curso");
                                break;
                            case 7:
                                break;
                        }

                    } while (menuCursos < 7);

                case 3:

                    break;
                case 4:
                    int menuAlumnos;
                    do {
                        System.out.println("Mantenimiento de Alumnos");
                        System.out.println("1. Listar Alumnos");
                        System.out.println("2. Buscar Alumnos por curso");
                        System.out.println("3. Buscar Alumnos.");
                        System.out.println("4. Asociar Alumnos a Cursos");
                        menuAlumnos = menu.nextInt();
                        switch (menuAlumnos) {
                            case 1:
                                System.out.println("Listar Alumnos");
                                llamar.ListarAlumnos();
                                break;
                            case 2:
                                System.out.println("Buscar Alumnos por curso");
                                llamar.ListarAlumnosPorCurso();
                                break;
                            case 3:
                                System.out.println("Buscar Alumnos.");
                                llamar.BuscarCursoAlumno();
                                break;
                            case 4:
                                System.out.println("Asociar Alumnos a Cursos");
                                llamar.AsociarAlumnosACursos();
                                break;
                            case 5:
                                break;
                        }
                    } while (menuAlumnos < 5);

                case 5:
                    break;
                case 6:

                    break;
                case 7:
                    System.exit(0);
            }

        } while (menuAdmin < 7);
        // TODO code application logic here
    }

}
