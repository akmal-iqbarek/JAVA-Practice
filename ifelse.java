/*
class ifelse{
    public static void main(String args[]){
        //System.out.print("Hi");
        boolean rain = false;

        if(rain){
            System.out.println("Take umbrella");
        }
        else{
            System.out.println("Enjoy sunshine");
        }
        


       System.out.print(3>5);
    }
}

//string comparison

class ifelse{
    public static void main(String args[]){
       String f1= "apple";
       String f2= "apple";
       System.out.println(f1==f2);

       String T1 = new String("Bus");
       String T2 = new String("Bus");
       System.out.println(T1==T2);
       System.out.println(T1.equals(T2));
    }
}


class ifelse{
    public static void main(String args[]){
       String a = "one";
       String b = "one";
       String c = b;
       System.out.println(a==c); //true
    }
}


class ifelse{
    public static void main(String args[]){
       String a = "one";
       String b = new String("one");
       String c = b;
       System.out.println(a==c); //false
    }
}

import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
       Scanner inscan = new Scanner(System.in);
       String meghana = inscan.nextLine();

       if(meghana.equals("dead")){
        System.out.println("surya meets ramya");
       }

       else{
        System.out.println("surya weds meghana");
       }
    }
}

import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
       Scanner inscan = new Scanner(System.in);
       int num = inscan.nextInt();

       if(num%2==0){
        System.out.println("even");
       }

        else{
        System.out.println("odd");
        }
    }
}
*/
//else if and nested if

 //ternary operator

import java.util.Scanner;
class ifelse{
    public static void main(String args[]){
       Scanner inscan = new Scanner(System.in);
       int num1 = inscan.nextInt();
       int num2 = inscan.nextInt();

       boolean dat = num1>num2;
       String result = dat?"num1 great":"num2 great";
       System.out.println(result);

}
}