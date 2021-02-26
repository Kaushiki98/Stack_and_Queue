public class Stack_Queue {
    Node top = null;
    public Object Create_Stack_UC1;

    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(top == null){
            //node.next = null;
            top = node;
        }
        else{
            node.next = top;
            top = node;
        }
    }
    public void show(){
        Node n = top;
        while(n.next != null){
            System.out.println("Data: "+n.data);
            n = n.next;
        }
        System.out.println("Data: "+n.data);
    }
}
