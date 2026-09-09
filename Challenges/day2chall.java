/*import java.util.Scanner;

class day2chall{
    public static void main(String args[]){
        Scanner userin = new Scanner(System.in);
        var name = userin.nextLine();
        var age = userin.nextInt();
        System.out.println(name);
        System.out.print(age);
    }
}
*/
import java.util.Scanner;
class day2chall{
    public static void main(String args[]){
        Scanner userin = new Scanner(System.in);

        String name = userin.nextLine();
        int age = userin.nextInt();
        userin.nextLine();
        String address = userin.nextLine();

        System.out.println("My name is"+name);
        System.out.println("my age is"+age);
        System.out.print(address);
    }
}
