package com.PagoEmpleado;

public class pagoEmpleado {
    public int codEmpleado;
    private int salarioBasico;
    public int horasExtra;
    private int numeroHoras;
    private int descuento;
    private int descuentoPrestamo;
    private int bonificacion;
    private int neto;

    public int calcularValorHE(){

        return horasExtra = salarioBasico;

    }

    public int calcularDevengado(){

        return bonificacion = horasExtra*numeroHoras;

    }

    public int calcularDeducido(){

        return descuento = descuentoPrestamo;

    }
    public int calcularNeto(){
        return neto = ((salarioBasico + horasExtra)*numeroHoras)-descuento;

    }


    public int getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(int salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(int descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getNeto() {
        return neto;
    }

    public void setNeto(int neto) {
        this.neto = neto;
    }
}
