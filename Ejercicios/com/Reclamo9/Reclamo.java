package com.Reclamo9;

public class Reclamo {
    public int numeroReclamo;
        private String nombrePersona;
        private String asunto;
        public String descripcionReclamos;
        private String estadoReclamo;

        public String getNombrePersona() {
            return nombrePersona;
        }

        public void setNombrePersona(String nombrePersona) {
            this.nombrePersona = nombrePersona;
        }

        public String getAsunto() {
            return asunto;
        }

        public void setAsunto(String asunto) {
            this.asunto = asunto;
        }

        public String getEstadoReclamo() {
            return estadoReclamo;
        }

        public void setEstadoReclamo(String estadoReclamo) {
            this.estadoReclamo = estadoReclamo;
        }

        public String validarEstadoReclamo() {
            if (estadoReclamo == ("in review")) {
                return "Your claim is being reviewed";
            } else {
                return "Your claim has not yet been reviewed";
            }
        }

        public String mensajeRecepcionReclamo(){
            return "The claim with the number: " + numeroReclamo + " of the person: " + nombrePersona + ". " + descripcionReclamos + ". Has been received.";
        }
}
