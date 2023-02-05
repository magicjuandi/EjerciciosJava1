package com.Copias19;

public class Copias {
    public int num_copias;
    public int price1;
    public int price2;
    public int price3;
    public int price4;

    public int price(){
        if(num_copias < 499 ){
            return price1;
        } else if (num_copias > 500 && num_copias < 749) {
            return price2;
        } else if (num_copias > 750 && num_copias < 999) {
            return price3;
        } else {
            return price4;
        }
    }
}
