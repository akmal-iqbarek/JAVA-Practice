/* 
class arrayprac{
    public static void main(String args[]){
         String[] playlist = new String[3];
         playlist[0]="song1";
         playlist[1]="song1";
         playlist[2]="song1";
         System.out.println(playlist[0]);


    }
}
*/
import java.util.Scanner;
class arrayprac{
    public static void main(String args[]){
         int[] marks = new int[5];
         Scanner mycan = new Scanner(System.in);

         System.out.println("Enter mark 1");
         marks[0] = mycan.nextInt();
         System.out.println("Enter mark 2");
         marks[1] = mycan.nextInt();
         System.out.println("Enter mark 3");
         marks[2] = mycan.nextInt();
         System.out.println("Enter mark 4");
         marks[3] = mycan.nextInt();
         System.out.println("Enter mark 5");
         marks[4] = mycan.nextInt();

         int tot = marks[0]+marks[1];
         System.out.print("the total is ");
         System.out.print(tot);


    }
}