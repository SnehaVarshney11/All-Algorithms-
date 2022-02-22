package ARRAYS;

class FloydCycleFindingAlgorithm {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void detectLoop(){
        Node slow = head, fast = head;
        int flag = 0;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Loop found");
        }else{
            System.out.println("Loop not found");
        }
    }
}
