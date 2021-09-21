
class Stack{
    private int arr[];
    private int capacity;
    private int top;
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int value){
        if(isfull()){
            System.out.println("The element cannot be inserted");
        }
        else{
            top++;
            arr[top]=value;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty. Elements cannot be poped");
        }
        else{
            System.out.println("The poped element is"+arr[top]);
            top--;
        }
    }
    public boolean isfull(){
        if(top==capacity-1)
           return true;
        return false;
    }
    public boolean isEmpty(){
        if(top==-1)
           return true;
        return false;
    }
    public int size(){
        return top+1;
    }
}
class Array_Implementation_of_stack{
    public static void main(String args[]){
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
    }
}