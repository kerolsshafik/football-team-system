package project.data;
import static java.lang.System.exit;
import java.util.Scanner;

public class ProjectData {
    public static void main(String[] args) {
 int choose=0;
 Scanner input= new Scanner (System.in);
 
 
 for (;;){
     player x=new player ();  
     System.out.println("1 add");
     System.out.println("2 show");
     System.out.println("3 search");
     System.out.println("4 delete");
     System.out.println("5 exit");

          choose =input.nextInt();
        switch (choose){
            case 1:
    x.setName();
    x.setPassword();
    x.setAge();
    x.setResult();
    x.setWeight();  
        x.add(x.getName(),x.getPassword(),x.getAge(), x.getResult(), x.getWeight());
        break;
            case 2:
                x.showdata();
    break;
    case 3:
          x.search(x.getName());
    break;
    case 4:
        x.dele(x.getName());
        break;
        case 5:
       exit(0);
        break;
        
        }
        }
    }
    }