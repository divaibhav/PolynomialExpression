package implementation;

public class Node {
    private int coefficient;
    private int power;
    private Node next;

    public Node(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
        next = null;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
