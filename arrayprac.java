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
         Scanner myscan = new Scanner(System.in);

         System.out.println("Enter mark 1");
         marks[0] = myscan.nextInt();
         System.out.println("Enter mark 2");
         marks[1] = myscan.nextInt();
         System.out.println("Enter mark 3");
         marks[2] = myscan.nextInt();
         System.out.println("Enter mark 4");
         marks[3] = myscan.nextInt();
         System.out.println("Enter mark 5");
         marks[4] = myscan.nextInt();

         int tot = marks[0]+marks[1];
         System.out.print("the total is ");
         System.out.print(tot);


    }
}