package com.sit.abstractex;
class AbstractClassDemo
{ 
    public static void main (String[] args)  
    { 
       
        // creating the Object of Terrestrial class 
        // and using Animal class reference. 
        Animal object1 = new Terrestrial("Humans"); 
        object1.BasicInfo("are terrestrial beings, they "); 
        object1.habitat(); 
        object1.respiration(); 
          
           
        System.out.println(" "); 
           
        // creating the Objects of circle class 
        Animal object2 = new Aquatic("Fishes"); 
        object2.BasicInfo("are aqautic beings, they "); 
        object2.habitat(); 
        object2.respiration();
    }
}
       
        
