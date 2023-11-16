import java.util.Scanner;
public class StackArray{
  int top;
  int capacity;
  int[] stack;
  StackArray()
  {
    top=-1;
    capacity = 10;
    stack = new int[capacity];
  }
  public boolean isEmpty()
  {
    return top == -1;
  }
  public boolean isFull()
  {
    return top==capacity-1;
  }
  public int push(int data)
  {
    if(isFull()){
      System.out.println("Stack is full");
    }
    return stack[++top]=data;
  }
  public int pop()
  {
    if(isEmpty())
    {
      System.out.println("stack is empty");
    }
    return stack[top--];
  }
  public int peek()
  {
    return stack[top];
  }
  public  static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the stack");
    int n = sc.nextInt();
    StackArray st = new  StackArray();
    for(int i=0;i<n;i++) {
      System.out.println("enter the elements" + (i+1) + ":");
      int x = sc.nextInt();
      st.push(x);
    }
 
    System.out.println(st.isEmpty());
    System.out.println(st.isFull());
    System.out.println(st.capacity);
    System.out.println(st.peek());
    System.out.println(st.pop());
  }
}