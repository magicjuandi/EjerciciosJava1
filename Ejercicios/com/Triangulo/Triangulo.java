package com.Triangulo;

public class Triangulo {
    public int num1;
    public int num2;
    public int num3;

    public int SUMA = num1 + num2 + num3;

    public boolean VERIFICACIÓN() {
        if (SUMA == 180) {
            return true;
        } else {
            return false;
            }
        }
}
