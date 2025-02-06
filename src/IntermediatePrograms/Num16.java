package IntermediatePrograms;

import java.util.Scanner;

// Reverse String

public class Num16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        char[] stringArray = name.toCharArray();

        int start = 0;
        int end = name.length()-1;

        while (start < end){
            swap(stringArray,start,end);
            start++;
            end--;
        }

        String reversedName = new String(stringArray);
        System.out.println("Reversed String: " + reversedName);
    }
    static void swap(char[] arr, int start,int end){
        char temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}
