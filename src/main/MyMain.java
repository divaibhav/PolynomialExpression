package main;

import implementation.MyPolynomialExpression;
import implementation.Node;

public class MyMain {
    public static void main(String[] args) {
        //linked list for e1, add all the nodes
        MyPolynomialExpression linkedList1 = new MyPolynomialExpression();
        linkedList1.addLast(-4,2);
        linkedList1.addLast(2,1);
        linkedList1.addLast(1,0);
        linkedList1.traverse();
        //linked list for e2, add all the nodes
        MyPolynomialExpression linkedList2 = new MyPolynomialExpression();
        linkedList2.addLast(4,3);
        linkedList2.addLast(2,2);
        linkedList2.addLast(1,0);
        linkedList2.traverse();
        //call addExpressions (e1, e2);
        MyMain obj = new MyMain();
        MyPolynomialExpression result = obj.addExpressions(linkedList1,linkedList2);
        result.traverse();
    }
    public MyPolynomialExpression addExpressions(MyPolynomialExpression e1, MyPolynomialExpression e2){
        MyPolynomialExpression result = new MyPolynomialExpression();
        Node temp1 = e1.getHead();
        Node temp2 = e2.getHead();
        while(temp1 != null && temp2 != null){
            if(temp1.getPower() == temp2.getPower()){
                int coefficient = temp1.getCoefficient() + temp2.getCoefficient();
                result.addLast(coefficient, temp1.getPower());
                temp1 = temp1.getNext();
                temp2 = temp2.getNext();
            }
            else if(temp1.getPower() > temp2.getPower()){
                result.addLast(temp1.getCoefficient(),temp1.getPower());
                temp1 = temp1.getNext();
            }
            else if (temp1.getPower() < temp2.getPower()){
                result.addLast(temp2.getCoefficient(),temp2.getPower());
                temp2 = temp2.getNext();
            }
        }
        if (temp1 != null){
            while(temp1 != null){
                result.addLast(temp1.getCoefficient(),temp1.getPower());
                temp1 = temp1.getNext();
            }
        }
        else{
            while (temp2 != null){
                result.addLast(temp2.getCoefficient(),temp2.getPower());
                temp2 = temp2.getNext();
            }
        }
        return result;
    }
}
