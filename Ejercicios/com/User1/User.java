package com.User1;

import java.util.Objects;

public class User {
    public String userBase;
    public String userEnter;
    public String keyBase;
    public String keyEnter;
    public boolean statusSystem = true;

    public String checkStatus() {
        if (statusSystem) {
            return "Good Condition";
        } else {
            return "Bad Condition";

        }
    }

    public boolean getAcces(){
        if (Objects.equals(userBase, userEnter) && Objects.equals(keyBase, keyEnter)){
            return true;
        }else{
           return false;
        }
    }
}
