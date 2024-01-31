package project.data;
   
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedWriter;

public class player {
  
    Scanner input=new Scanner(System.in);
private String name ,password;
int age ,result ;
double weight;
static int num;
 static int ct;
player()
{     
    name =" ";  password=null;  age=0;   result=0;  weight=0;
}

    public String getName() {
  
        return name;
    }

    public void setName() {
         name=input.next();
         this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword() {
        password=input.next();
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        age=input.nextInt();
        this.age = age;
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
        result=input.nextInt();
        this.result = result;
    }
    
    public void setWeight() {
        weight=input.nextInt();
        this.weight = weight;
    }


    public double getWeight() {
        
        return weight;
    }
    public static void add(String name,String password,int age ,int result,double weight) {
             try{
    File f=new File("player.txt");
   BufferedWriter w=new BufferedWriter(new FileWriter(f,true));
   w.write(name+" "+password + " "+age+" "+result+" "+weight+" ");
   w.close();
} catch(Exception ex){
            System.out.println(ex.getMessage());
}
}
   
    public void showdata(){
     ct=0;
 // String data;
        try {
            File f=new File("player.txt");
            Scanner read=new Scanner(f);
            while (read.hasNextLine());      
            //ct++;
             String data=read.nextLine();
           System.out.println("data"+data);
         read.close(); } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
}
 
 public void search(String p)
 {
   num=0;
   int c=0;
   String data;
         try {
            FileReader f=new FileReader("player.txt");
             Scanner read=new Scanner(f);
            while (read.hasNextLine());      
            num++;   
            data=read.nextLine();
            if(data.equals(p)){
      //      System.out.println("not found data");
            System.out.println("data"+data);
        } 
            else{
                 c=0;     }
          if(c==0){
              System.out.println("error");
          }
            read.close();
            
         }
          catch (Exception ex) {
         
              System.out.println(ex.getMessage());
        }
         
         
 }    
// public  void edit (String name,String password,String age ,String result,String weight){
// String h;
//int z=0;
//String d;
//	
//	
//    h = name+" ";
//            +password+" "+age+"  "+result "  "+weight+"  ";
//
// 
// 
// }
//    


public void dele(String name){
    int i=0;
      String data;
        try {
            FileReader f=new FileReader("player.txt");
             FileWriter w=new FileWriter("player1.txt");
            Scanner read=new Scanner(f);    
            while (read.hasNextLine());      
            i++;
            data=read.nextLine();
            if (i<num)
            {
            w.write(data+" ");
            }
            f.close();  w.close();
      ///////////////////////////remove/////////////////// rename 
      
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            }


   




    
}
