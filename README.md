# Biblioteca de Libros

## Descripción

Biblioteca de Libros es una aplicación de consola desarrollada en Java 25 que permite registrar y visualizar información de libros mediante un menú interactivo.

El programa utiliza Records para representar los libros y un arreglo tradicional para almacenar los registros durante la ejecución.

## Tecnologías utilizadas

- Java 25.
- IntelliJ IDEA.
- Scanner para la entrada de datos.
- Records.
- Arreglos tradicionales.

## Características

La aplicación cuenta con las siguientes funcionalidades:

1. **Registrar libro:** permite ingresar el título, autor y año de publicación.
2. **Mostrar libros:** presenta todos los libros registrados.
3. **Consultar cantidad:** muestra el número total de libros almacenados.
4. **Salir:** permite finalizar la ejecución del programa.

## Validaciones

El programa incorpora validaciones para:

- Evitar títulos y autores vacíos.
- Comprobar que el año de publicación esté entre 1000 y 2026.
- Evitar entradas no numéricas en los campos que requieren números enteros.
- Impedir registros cuando el arreglo alcanza su capacidad máxima de 100 libros.
- Detectar opciones no válidas en el menú.

## Estructura del proyecto

- `Main.java`: contiene el record Libro y la lógica principal de la aplicación.
- `README.md`: contiene la descripción e instrucciones del proyecto.

## Instrucciones de ejecución

1. Instalar el JDK 25.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que el proyecto utilice Java 25.
4. Abrir el archivo `Main.java`.
5. Ejecutar el método `main`.

## Almacenamiento

Los registros se almacenan temporalmente en un arreglo durante la ejecución del programa. No se utiliza ninguna base de datos, por lo que la información no se conserva al cerrar la aplicación.

## Autor

Sophia Mendoza