package project.data;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import static project.data.player.ct;

public class manager extends player {
    double rate;
    
    public void rate (player y,double x){
        
        
        if(rate>0&&rate<10){
            String d;
            rate=input.nextDouble();
   //aa(String name,String password,int age ,int result,double weight,int rate);
         
        }else
        {
            System.out.println("entre the write input ");
        rate(y,x);
                
        }
        
//        public static void aa (String name,String password,int age ,int result,double weight,int rate) {
//             try{
//    File f=new File("players.txt");
//   FileWriter w=new FileWriter("player.txt");
//   w.write(name+" "+password + " "+age+" "+result+" "+weight+" "+rate +" ");
//   w.close();
//} catch(Exception ex){
//            System.out.println(ex.getMessage());
//}
//    
//    
    }
}
