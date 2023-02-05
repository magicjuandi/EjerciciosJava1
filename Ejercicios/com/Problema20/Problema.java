package com.Problema20;

public class Problema {
    public boolean pitido;
    public boolean  disc;
    public boolean unit;

    public String checkStatus(){
        if (pitido == true && disc == true){
            return "Averiado";
        } else if (pitido == true && unit == true ) {
            return "Contact Tecnico ";
        } else if (pitido == true && unit == false) {
            return "Verify contactos de la umidad";
        } else if (pitido == false && disc == false){
            return "LLevelo a reparar a la central";
        } else if (pitido == false && disc == true) {
            return "Compruebe conexiones de altavoces";
        }
        return null;
    }
}
