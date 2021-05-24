package javaapplication26;

import java.util.Date;
public class JavaApplication26 {

  
    public static void main(String[] args) {
      

        MobilePhone Samsung_A50 =new MobilePhone("Black",2010,"Manual",300);
        Samsung_A50.setRAM(2);
        System.out.println(Samsung_A50.getRAM());
        
        
 
  
        OPPO A70=new OPPO();
        A70.color="White";
       
        
        
        Iphone Pro_11=new Iphone();
        
        
        
        Samsung A90=new Samsung();
        A90.CPU=3;
        
        
        System.out.println(A70.color);
        System.out.println("The phone age is :"+Samsung_A50.getAge(Samsung_A50.getBirthdate()));
        
    }
    
}
