import java.util.Random;
/* 
class whileloop {
    public static void main(String args[]){

        Random rand = new Random();
        int newnum = 0;

        while(newnum!=5){
            newnum = rand.nextInt(11);
            System.out.println(newnum);
        }
    }
}

//do while loop

class whileloop {
    public static void main(String args[]){
        int count = 1;
        do{
            System.out.println("John");
            count = count+1;
        }while(count<=10);
    }
}
*/
import java.util.Scanner;
class whileloop {
    public static void main(String args[]){
        Scanner myscan = new Scanner(System.in);
        int a = 0;
        do{
            a = myscan.nextInt();
        }while(a<10);
    }
}