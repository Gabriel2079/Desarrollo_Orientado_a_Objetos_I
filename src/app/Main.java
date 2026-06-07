package app;

import model.Direccion;
import model.Persona;
import model.Empleado;
import model.Rut; // inclui RUT

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTIÓN - LLANQUIHUE TOUR v1.2     ");
        System.out.println("=================================================\n");

        // Crear direcciones
        Direccion dir1 = new Direccion("San Camilo", 130, "52", "Llanquihue", "De los Lagos");
        Direccion dir2 = new Direccion("Fray Camilo Henríquez", 166, "Oficina 130-52", "Santiago Centro", "Metropolitana");
        Direccion dir3 = new Direccion("Los Ciervos", 89, "Casa B", "Llanquihue", "De los Lagos");

        // Instanciar objetos de prueba
        Persona cliente = new Persona(new Rut("12.345.678-9"), "Giusy Sanchez", "giusy.artes@mail.com", dir1);
        Persona cliente2 = new Persona(new Rut("12.345.677-2"), "Antonella Borjas", "anto.artes@mail.com", dir1);
        Empleado guia = new Empleado(new Rut("12.234.670-1"), "Gabriel Márquez", "g.marquez@llanquihuetour.cl", dir2, "Guía de Excursiones", 650000);
        Empleado operador = new Empleado(new Rut("33.333.333-k"), "Arianna Borjas", "a.borjas@llanquihuetour.cl", dir3, "Operador de Rutas", 700000);

        // Imprimir registros en consola
        System.out.println("--- REGISTRO DE CLIENTES ---");
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println();

        System.out.println("--- REGISTRO DE COLABORADORES / EMPLEADOS ---");
        System.out.println(guia);
        System.out.println(operador);
        System.out.println("\n=================================================");
    }
}