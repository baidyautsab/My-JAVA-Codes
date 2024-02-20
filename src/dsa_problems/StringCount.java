package dsa_problems;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string with space separated: ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        LinkedHashMap<String, Integer> l1 = new LinkedHashMap<>();

        for(String ele: arr){
            if(l1.containsKey(ele))
                l1.put(ele, l1.get(ele) + 1);
            else
                l1.put(ele, 1);
        }
        System.out.println(l1);
    }
}
