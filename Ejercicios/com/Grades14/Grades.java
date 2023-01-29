package com.Grades14;

public class Grades {
    public double physics;
    public double chemistry;
    public double biology;
    public double maths;
    public double computerScience;
    public double finalGrade(){
        return (physics+chemistry+biology+maths+computerScience)/5;

    }
    public String showMessage(){
        if(finalGrade() <= 5.99){
            return ("La calificacion es mala");
        }else if(finalGrade() <= 8){
            return ("la calificaion es buena");
        }else if(finalGrade() > 8.01){
            return ("La calificacion es excelente");
        }else{
            return null;
        }
        
    }
    public double getPhysics() {
        return physics;
    }
    public void setPhysics(double physics) {
        this.physics = physics;
    }
    public double getChemistry() {
        return chemistry;
    }
    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }
    public double getBiology() {
        return biology;
    }
    public void setBiology(double biology) {
        this.biology = biology;
    }
    public double getMaths() {
        return maths;
    }
    public void setMaths(double maths) {
        this.maths = maths;
    }
    public double getComputerScience() {
        return computerScience;
    }
    public void setComputerScience(double computerScience) {
        this.computerScience = computerScience;
    }


}
