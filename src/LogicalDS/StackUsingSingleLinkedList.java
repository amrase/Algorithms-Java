package LogicalDS;

public class StackUsingSingleLinkedList {

    public static void main(String[] args)
    {
        // create Object of Implementing class
        StackUsingSingleLinkedList obj = new StackUsingSingleLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        obj.display();


    }


    //A linked list node
    private class Node{
        int data; // integer data type
        Node link; //reference variable node type
    }
    // global top reference variable
    Node top;

    //Constructor
    StackUsingSingleLinkedList(){
        this.top = null;
    }

    //method to add an element x in the stack
    public void push(int x) {
        //create a new node temp and allocate memory
        Node temp = new Node();

        //check if stack heap is full
        if (temp == null) {
            System.out.println("\nHeap Overflow");
            return;
        }

        temp.data = x;
        temp.link = top;

        //update top reference
        top = temp;
    }

    public void display(){
        //check for stack underflow
        if(top ==null){
            System.out.println("\nStack Underflow");
            return;
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.printf("%d->",temp.data);

                temp = temp.link;
            }
        }
    }
}
