package linkedlist;





public class LinkedList {
    Node head;



    public static LinkedList insert(LinkedList list,int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }



}
/*
InsertInLinkedList(head,nodeValue,location){
        create a blank node,
        node.value = nodeValue;
        if(!existsLinkedList(head)){
            return error;//Linked List does not exist
        }
        else if(location equals 0){
            //insert into first position
            node.next = head;
            head = node;
        }
        else if(location equals last){
            //insert at last position
            node.next = null,
            tail.next = node;
            tail = node //This keeps tack of the last node
        else // insert at specific location
        loop tmpNode = 0 to location -1
        //loop till we reach specific node and end the loop
        node.next = tmpNode.next;
        tmpNode.next = node;

    }
}*/
/*TraverseLinkedList(head)
   if head == null then return
       loop head to tail
       print  currentNode.value
       TC - O(n) - because of the loop
       SP - O(1)
 */

//searchNode(head,nodeValue)
//    loop : tmpNode = start to tail
//        if(tmp.value == nodeValue )
//            print tmpNode.value
//        return
//    return // node not found
//    TC - O(n)
//    SC - O(n)


//deletionOfNode(head,location)
//    if(!existLinkedList(head))
//        return error // Linked List doesnt exist
//    else if(location == 0) // we have to delete first node
//        head = head.next
//        if this was the only element in list update tail= null
//    else if (location >=last)
//        if currentNode is only node in list then update head = tail = null ;return
//        loop till snd node (tmpNode)
//        tail = tmpNode ; tmpNode.next = null;
//    else // if any internal node needs to be deleted
//        loop : tmpNode = start to location - 1;//we need to traverse till we find the previous location
//        tmpNode.next = tmpNode.next.next // delete the require node
//
//    TC - O(n)
//    SC - O(1)


//deleteEntireLikedList(head,tail)
//    head = null,
//    tail = null,
//    TC - O(1)
//    SC - O(1)