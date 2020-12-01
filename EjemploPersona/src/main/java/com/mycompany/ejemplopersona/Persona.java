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
public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private double salario;
    
    //constructores
    //constructor por defecto
    public Persona(){
        this.nombre = "A";
        this.edad = 18;
    }
    
    //constructor sobrecargado
    public Persona(String pNombre, int pEdad, double pSalario){
        this.nombre = pNombre;
        this.edad = pEdad;
        this.salario = pSalario;  
    }
    
    //métodos de la clase
    //método sin parámetros
    public void caminar(){
        System.out.println("Estoy caminando");
    }
    
    //método con parámetros
    public String hablar(String texto){
        return texto;
    }
    
    //métodos encapsulados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}


















