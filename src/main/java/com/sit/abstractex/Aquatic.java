package com.sit.abstractex;
class Aquatic extends Animal 
{ 
       
    // constructor 
    Aquatic(String name) 
    { 
        super(name);
    } 
       
    @Override
    public void habitat()  
    { 
        System.out.println("It leaves in water and");  
    } 
       
    @Override
    public void respiration()  
    { 
        System.out.println("respire through gills or their skin. ");  
    }
}