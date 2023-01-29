package com.Max15;

public class Max {
    public int number1;
    public int number2;
    public int number3;
    public String  max(){
        if(number1 > number2 & number1 > number3){
            return "El numero 1";
        }else if(number2 > number1 & number2 > number3){
            return "El numero 2";
        }else if(number3 > number1 & number3 > number2){
            return "El numero 3";
        }else if(number1 == number2 & number1 > number3){
            return "El numero 1 y 2 son los mayores";
        }else if(number1 > number2 & number1 == number3){
            return "El numero 1 y 3 son los mayores";
        }else if(number2 == number3 & number2 > number1){
            return "El numero 2 y 3 son los mayores";
        }else{
            return null;
        }
        
    }
    public int getNumber1() {
        return number1;
    }
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public int getNumber2() {
        return number2;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public int getNumber3() {
        return number3;
    }
    public void setNumber3(int number3) {
        this.number3 = number3;
    }
}
