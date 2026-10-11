/* 
import java.util.Scanner;

public class TestProg1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner myscan = new Scanner(System.in);
        
        // FIX: Variable name changed from 'numlist' to 'nums' to match declaration
        nums[0] = myscan.nextInt();
        nums[1] = myscan.nextInt();
        nums[2] = myscan.nextInt();
        nums[3] = myscan.nextInt();
        nums[4] = myscan.nextInt();
        nums[5] = myscan.nextInt();
        nums[6] = myscan.nextInt();
        nums[7] = myscan.nextInt();
        nums[8] = myscan.nextInt();
        nums[9] = myscan.nextInt();
        
        myscan.close();
    }
}




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestProg2 {
    private static final int SIZE = 10;

    public static void main(String[] args) {

        int[] nums = new int[SIZE]; // Mandatory array size declaration
        Scanner myscan = new Scanner(System.in);

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter the number for index " + i + ":");
            nums[i] = myscan.nextInt();
        }

        int total = 0;
        for (int num : nums) {
            total += num;
        }

        // FIX: Replaced printing `nums` directly (which prints array hashcode) with Arrays.toString()
        System.out.println("The sum of all numbers in array " + Arrays.toString(nums) + " is: " + total);

        Arrays.sort(nums);

        System.out.println("After Sorting Array:");
        for (int num : nums) {
            System.out.println(num);
        }

        // Generics & Collections: JCF only supports wrapper classes (Integer, Double, etc.), not primitives
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(160);
        list.add(-533);
        list.add(240);

        playWithList(list);
        
        myscan.close();
    }

    public static void playWithList(List<Integer> list) {
        System.out.println("\nPrinting List:");
        for (int num : list) {
            System.out.println(num);
        }

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
*/

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // FIX 1: Fixed typo in package import `java.uti` -> `java.util`
        // FIX 2: Fixed syntax error ` HashMap <Integer, String>)();` -> `new HashMap<>();`
        Map<Integer, String> students = new HashMap<>();

        // FIX 3: Key 'a' was unquoted/undefined. Keys are Integers here, so pass an integer literal (e.g. 1)
        students.put(1, "Nipun");
        students.put(2, "Amjand");

        // Duplicate keys update existing values
        students.put(2, "Replaced Amjand"); 

        // Print entire map
        System.out.println("Students Map: " + students);
    }
}