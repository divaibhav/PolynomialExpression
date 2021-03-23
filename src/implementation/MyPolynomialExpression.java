package implementation;

public class MyPolynomialExpression {
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addLast(int coefficient, int power){
        Node node = new Node(coefficient,power);
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail = node;
        }
        size++;

    }
    public void traverse(){
        Node temp = head;
        System.out.println("expression");
        while (temp != null){
            System.out.print("[" + temp.getCoefficient() + ","+ temp.getPower()+"] , " );
            temp = temp.getNext();
        }
        System.out.println();
    }
}
