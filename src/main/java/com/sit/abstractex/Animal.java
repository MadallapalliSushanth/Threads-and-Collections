package com.sit.abstractex;
/**
 * abstract class can have 0 or more than one abstract methods.
 * abstract can have abstact methods as well as concerte methods
 * abstract method means which does not have any implemtaion, the implmentaion can be determined by child classes which are using abstarct class of abstarct methods
 * abstract class can not ne instatnited
 * abstract methods can not be drived in not abstcrt class, abstract methods can be implemeted in only child class itself.
 * abstract methods can be ended with ;
 * if a class extending abstarct class then all the abstrct methods must be override or else class itself need make as abstract class
 */

abstract class Animal{
     String AnimalName = " "; 
      
        Animal(String name) 
        { 
            this.AnimalName = name; 
        } 
           
        // declare non-abstract methods 
        // it has default implementation 
        public void BasicInfo(String details) 
        { 
            System.out.println(this.AnimalName + " " + details); 
        } 
           
        // abstract methods which will be 
        // implemented by its subclass(es) 
        abstract public void habitat(); 
        abstract public void respiration(); 
    }