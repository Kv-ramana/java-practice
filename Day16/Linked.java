import java.util.*;
import java.util.Scanner;

public class Linked {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println("Enter the string 1:");
        ll.add(sc.nextLine());
        System.out.println("Enter the string 2:");
        ll.add(sc.nextLine());
        System.out.println("Enter the string 3:");
        ll.add(sc.nextLine());

        System.out.println("Enter element to be removed:");
        ll.remove(sc.nextLine());

        boolean isEmpty = ll.isEmpty();
        if (isEmpty) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        System.out.println("Enter the search element to be found:");
        String searchElement = sc.nextLine();

        boolean isFound = false;
        for (String s1 : ll) {
            if (s1.equals(searchElement)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
