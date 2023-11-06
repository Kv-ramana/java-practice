/*Find the Sum and Average: Write a program to take an array as input and calculate the sum and average of its elements. Display both the sum and average.*/
import java.util.Scanner;
public class SumOfAverage {
  public static void CalculateSumAndAverage(int []arr) {
    int sum=0;
    for(int i=0;i<=arr.length;i++) {
      sum=sum+i;
    }
     double average = sum/arr.length;
    System.out.println("the sum of the array is:"+sum);
    System.out.println("the average of the array is"+average);
  }
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter size of the array");
      int size =scanner.nextInt();
     
      int arr[]=new int[size];
      System.out.println("the array elements are:");
      for(int i=0;i<size;i++) {
        arr[i]=scanner.nextInt();
      }
      CalculateSumAndAverage(arr);
    }
  }

