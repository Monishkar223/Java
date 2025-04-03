import java.util.*;
class Stack{
    int a[];
    int size;
    int top=-1;
    
    Stack(int s){
        size=s;
        a=new int[size];
    }
    
    void push(int val){
        if (top==size-1){
            System.out.println("NO");
        }
        else{
            a[++top]=val;
        }
    }
    
    int pop(){
        if (top==-1){
            System.out.println("Empty");
        }
      
            return a[top--];
        
    }
    int peek(){
        if (top==-1)
            return -1;
        else
            return a[top];
    }
}
class StackArray {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
    }
}
