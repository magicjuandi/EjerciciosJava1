package com.Juego24;

public class Juego {
    public int carta1Uno;
    public int carta2Uno;
    public int carta3Uno;
    public int carta1Dos;
    public int carta2Dos;
    public int carta3Dos;


    public void jugar(){
        int sumaJugador1 = carta1Uno + carta2Uno + carta3Uno;
        int sumaJugador2 = carta1Dos + carta2Dos + carta3Dos;
        if(sumaJugador1 > sumaJugador2 && sumaJugador1 <=21){
            System.out.println("gano el jugador 1");
        }else if(sumaJugador2 > sumaJugador1 && sumaJugador2 <=21){
            System.out.println("Gano el jugador 2 ");
        }else if(sumaJugador2 == sumaJugador1 && sumaJugador2 >= 21 && sumaJugador1 >=21){
            System.out.println("Hubo empate.. ");
        }
    }
}
