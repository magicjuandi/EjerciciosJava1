package com.Lavadora12;

public class Lavadora {
    public int tipoLavadora;
    public int cantidad;
    public int horas;
    public int precio;

    public void asignarTipo(int next) {
        this.tipoLavadora = next;
    }

    public void asignarCantidad(int next) {
        this.cantidad = next;
    }

    public void asignarHoras(int next) {
        this.horas = next;
    }

    public void valor() {
        if (tipoLavadora == 1) {
            precio = 4000;
        } else {
            precio = 3000;
        }
    }


    public int valorTotal(){
        if (cantidad >= 3){
            return (int) ((precio*horas)-(((precio*horas)*0.03)));
        }else{
            return precio*horas;
        }
    }
    
}
