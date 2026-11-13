
import java.util.Scanner;

record Libro(String titulo, String autor, int anio) {

}

public class Main {

    public static void main(String[] args) {

        Libro[] libros = new Libro[100];
        int cantidadLibros = 0;

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("===== BIBLIOTECA DE LIBROS =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Consultar cantidad de libros");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            if (sc.hasNextInt()) {

                opcion = sc.nextInt();

            } else {

                System.out.println("Error: debe ingresar un número.");
                sc.nextLine();
                opcion = 0;

            }

            switch (opcion) {


                case 1:

                    if (cantidadLibros < libros.length) {

                        sc.nextLine();

                        System.out.print("Ingrese el título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Ingrese el autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Ingrese el año: ");

                        if (sc.hasNextInt()) {

                            int anio = sc.nextInt();

                            if (titulo.isBlank() || autor.isBlank()) {

                                System.out.println("Error: el título y el autor no pueden estar vacíos.");

                            } else if (anio < 1000 || anio > 2026) {

                                System.out.println("Error: año no válido.");

                            } else {

                                libros[cantidadLibros] = new Libro(titulo, autor, anio);

                                cantidadLibros++;

                                System.out.println("¡Libro registrado correctamente!");

                            }

                        } else {

                            System.out.println("Error: debe ingresar un número entero.");
                            sc.nextLine();

                        }

                    } else {

                        System.out.println("La biblioteca está llena.");

                    }

                    break;


                case 2:

                    if (cantidadLibros == 0) {

                        System.out.println("No hay libros registrados.");

                    } else {

                        for (int i = 0; i < cantidadLibros; i++) {

                            System.out.println("Título: " + libros[i].titulo());
                            System.out.println("Autor: " + libros[i].autor());
                            System.out.println("Año: " + libros[i].anio());
                            System.out.println("-------------------------");

                        }

                    }

                    break;

                case 3:

                    System.out.println(
                            "Cantidad de libros registrados: " + cantidadLibros
                    );

                    break;

                case 4:

                    System.out.println("Saliendo del programa...");

                    break;

                default:

                    System.out.println("Opción no válida.");

            }

        } while (opcion != 4);

        sc.close();

    }

}
