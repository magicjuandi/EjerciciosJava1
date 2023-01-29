package com.Gym17;

public class Gym {
    public int type;
    public int day15 = 18000;
    public int day30 = 35000;
    public int month3 = 86000;
    public String howMuch(){
        if(type == 1){
            return "Pagara 18000 por 15 dias";
        }else if(type == 2){
            return "Pagara 35000 por 30 dias";
        }else if(type == 3){
            return "Pagara 86000 por 3 meses";
        }else{
            return "Error";
        }
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
}
