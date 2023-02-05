package com.Operador22;

public class Operador {
    public String operador;
    public int minutoInter;
    public int datosPack;
    public int cargoFijo;
    public int minutosConsumidos;

    public void setOperador(String next){
        this.operador = next;
    }

    public void setMinutosConsumidos(int next){
        this.minutosConsumidos = next;
    }

    public void operadorPrecios(){
        switch (operador){
            case "Tigo":
                minutoInter = 200;
                datosPack = 12000;
                cargoFijo = 45000;
                break;
            case "Claro":
                minutoInter = 100;
                datosPack = 18000;
                cargoFijo = 30000;
                break;
            case "Movistar":
                minutoInter = 250;
                datosPack = 8000;
                cargoFijo = 40000;
                break;
        }
    }

    public int precioTotal(){
        return cargoFijo + datosPack + (minutoInter * minutosConsumidos);
    }
}
