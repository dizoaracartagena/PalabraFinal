package test;

import domain.Empleado;
import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 15;
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nuevo nombre: " + persona1.getNombre());
        
        Empleado empleado1 = new Empleado();
        System.out.println("empleado1 = " + empleado1);
        empleado1.imprimirEmpleado();
    }
}
