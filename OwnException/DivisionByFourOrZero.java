package com.example.ownexception;

public class DivisionByFourOrZero extends Exception{
    public DivisionByFourOrZero(){}
    public DivisionByFourOrZero(String msgError){
        super(msgError);
    }
}
