/*Print All Negative Elements in an Array: Write a program to take an array as input and print all negative elements present in the array.*/

import java.util.Scanner;
public class NegativeElements {
    public static void printNegativeElements(int arr[]) {
        System.out.println("The negative elements are:");
      
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                System.out.println(arr[i] + " ");
            }
          else {
            System.out.println("there is no negative elemetns");
          
        }
      
    }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        printNegativeElements(arr);
    }
}

