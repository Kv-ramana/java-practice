import java.util.Scanner;
public class CountFrequencyElement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the array size: ");
        int n=scanner.nextInt();
        System.out.println("enter the elements of the array");
        int x[]=new int[n];
        for(int i=0;i<n;i++) {
            x[i]=scanner.nextInt();
        }
        CountFrequencyElement.elements(x,n);//calling methode
    }
    public static void elements (int arr[],int n) {
        boolean visited[]=new boolean[n];
        for(int m=0;m<n;m++) {
            visited [m]=false;
        }

        System.out.println("elements\t\t count");
        for(int i=0;i<n;i++) {
            if(visited[i]==true)
            continue;
            int count = 1;
            for(int j=i+1;j<n;j++) {
                if (arr[i]==arr[j]) {
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+"\t" + count);
        }

    } 
    }
