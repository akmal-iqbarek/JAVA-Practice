/*
class forloop{
    public static void main(String args[]){
    
    for(int i=1; i<=5; i=i+1){
        System.out.println("Akmal");
    }
}
}



class forloop{
    public static void main(String args[]){
    
    for(int i=10; i>=1; i=i-1){
        System.out.println(i);
    }
}
}


import java.util.Scanner;
class forloop{
    public static void main(String args[]){
    Scanner myscan = new Scanner(System.in);
    int a = myscan.nextInt();
    int b = myscan.nextInt();

    
    for(int i=a; i<=b; i=i+1){
        System.out.println(i);
    }
}
}


import java.util.Scanner;
class forloop{
    public static void main(String args[]){

    for(int i=1; i<=10; i=i+1){
        if(i%2==0){
            System.out.println(i);
        }
        else{}

    }
}
}


import java.util.Scanner;
class forloop{
    public static void main(String args[]){
    int count = 0;

    for(int i=1; i<=20; i=i+1){
        if(i%2!=0){
            count=count+1;
        }
        else{}

    }
System.out.println(count);
}
}



//nested for loop

class forloop{
    public static void main(String args[]){
        for(int i = 1; i<=5; i=i+1){
            for(int j = 1; j<=2; j=j+1){
            System.out.println(j);
        }
        }

    }
}



class forloop{
    public static void main(String args[]){
        for(int i = 1; i<=3; i=i+1){
            for(int j = 1; j<=3; j=j+1){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
class forloop{
    public static void main(String args[]){
        for(int j = 1; j<=3; j=j+1){
            for(int i = 1; i<=j; i=i+1){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}