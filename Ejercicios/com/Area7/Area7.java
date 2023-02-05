package com.Area7;

public class Area7 {
    public double altura;
    public double base;


    public String validarDatos(){

        return "The base is: " + base + "cm" + " and the high is: " + altura + "cm";
    }

    public double calcularArea() {

        return base * altura;
    }
}
