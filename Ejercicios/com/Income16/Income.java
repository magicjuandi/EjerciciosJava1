package com.Income16;

public class Income {
    public int sex;
    public int age;
    public int type1 = 120000;
    public int type2 = 100000;
    public int type3 = 40000;
   
    public int getSex() {
        return sex;
    }
    public void setSex(int i) {
        this.sex = i;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int confirmType(){
        if(sex == 1){
            if(age >= 50){
                return type1;
            }else if(age < 50 & age >30){
                return type2;
            }else{
                return 0;
            }
        }else if(sex == 2){
            return type3;
        }else{
            return 0;
        }
    }
}
