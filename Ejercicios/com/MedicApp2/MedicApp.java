package com.MedicApp2;

public class MedicApp {
    public int codApp;
    public String date;
    public int room;
    public String hour;
    public String nameDoc;
    public String namePacient;
    private String medCenter;

    public String getMedCenter() {
        return medCenter;
    }

    public void setMedCenter(String medCenter) {
        this.medCenter = medCenter;
    }

    public String makeApp() {
        return "Sir " + namePacient + " your appoiment is code " + codApp + " at " + hour + " on " + date + " with " + nameDoc + " in " + getMedCenter() + " room " + room;
    }

    public String checkData() {
        return "Pacient: " + namePacient + " Code: " + codApp + "  Date: " + date + "  Hour: " + hour + "  Consulting Room: " + room + "  Doctor: " + nameDoc + " Place: " + getMedCenter();
    }

    public String changeHour(){
        return "New hour is at "+ hour;
    }
}
