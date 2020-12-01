/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplopersona;

/**
 *
 * @author Equipo
 */
public class main {

    public static void main(String[] args) {
        //crear un objeto utilizando la definición de la clase Persona
        //1. instaciar la clase Persona, con el constructor que se desea utilizar
        Persona p1 = new Persona();
        p1.caminar();
        p1.setNombre("Luis Pérez");
        System.out.println(p1.getNombre());
        String decir = p1.hablar("Estoy hablando...");
        System.out.println(decir);
        p1.setEdad(25);
        p1.setSalario(500000.38);
        System.out.println(p1.getEdad());
        System.out.println(p1.getSalario());

        System.out.println("****************************************");
        System.out.println("****************************************");

        //crear un objeto utilizando la definición de la clase Persona
        //con el constructor con parámetros
        Persona p2 = new Persona("Julio Sosa", 38, 600000);
        System.out.println(p2.getNombre());
        System.out.println(p2.getEdad());
        System.out.println(p2.getSalario());

        System.out.println("****************************************");
        System.out.println("****************************************");

        String imprimirP1 = "";
        //Nombre de la persona: XX
        imprimirP1 = imprimirP1 + "Nombre de la persona: " + p1.getNombre();
        //Nombre de la persona: XX y tiene XX años
        imprimirP1 += " y tiene " + p1.getEdad() + " años";
        //Nombre de la persona: XX y tiene XX años y su salario es de XX colones
        imprimirP1 += " y su salario es de " + p1.getSalario() + " colones";

        System.out.println(imprimirP1);

        System.out.println("****************************************");
        System.out.println("****************************************");

        String imprimirP2 = "";
        //Nombre de la persona: XX
        //Edad: XX años
        //Salario: XX colones
        imprimirP2 += "Nombre de la persona: " + p2.getNombre() + "\n"
                + //Alt 92 (\)
                "Edad: " + p2.getEdad() + " años" + "\n"
                + "Salario: " + p2.getSalario() + " colones";

        System.out.println(imprimirP2);

    }
}
