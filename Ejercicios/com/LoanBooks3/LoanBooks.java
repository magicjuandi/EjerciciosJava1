package com.LoanBooks3;

public class LoanBooks {
    public int codLoan;
    public String dateLoan;
    public String nameBook;
    public int codUser;
    public int daysLoan;
    public boolean statusLoan = true;

    public String checkStatus(){
        if(statusLoan){
            return "On Stock";
        }else {
            return  "Out Stock";
        }
    }

    public String checkData(){
        return "Code: " + codLoan + " Book Name: "+ nameBook + " Date: " + dateLoan + " User Code: " + codUser + " Loan Days: " + daysLoan;
    }
}
