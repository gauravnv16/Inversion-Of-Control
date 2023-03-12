package com.example;

public class Airtel implements Sim{
    
    @Override public void calling()
    {
        System.out.println("airtel Calling");
    }
 
    @Override public void data()
    {
        System.out.println("airtel Data");
    }
}
