package javaapplication26;

import java.util.Date;

/**
 *
 * @author Copy Center
 */
public class MobilePhone{
   
    
    
    
    
    public MobilePhone()
    {
    
    }
    
    public MobilePhone( String color, int birthdate,String type,double CPU)
    {
        
        color=color;
        birthdate=birthdate;
        type=type;
        CPU=CPU;
    }
    
    

    
    
   
    
    private int RAM;
    String color;
    int birthdate;
    String type;
    double CPU;
    
    
    Date d=new Date();  
    int year=d.getYear()+1900;
        
    
    
    int getBirthdate(){
        return birthdate;
    }


    public void setRAM(int RAM)
    {
    
        this.RAM=RAM;
        
    }
    
    public int getRAM(){
        return RAM;
    }
    

    
    String getColor(){
        return color;
    }
    String getType(){
        return type;
    }
    
    int getAge(int birthdate){
        return year-birthdate;
    }


    double getCPU(){
        return CPU;
    }
}
