package com.Lights5;

public class Lights5 {
    public  String color;
    public boolean status;

    public String changeColor(){
        return "The traffic lights are " + color;
    }

    public String statusLight(){
        if (status == true){
            return "Turn On";
        }else {
            return "Turn Off";
        }
    }

    public String showMessage(){
        if (color.equals("Green")){
            return "Go...";
        }else if (color.equals("Red")){
            return "Stop!!!";
        }else {
            return "Wait.............";
        }
    }
}
