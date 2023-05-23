package listas;
import entidades.Feedbacks;
public class ListaAsc {

  

    private class Node {
        Feedbacks fb;
        Node next;
    }

    private Node head = null;

    public boolean isEmpty() {
        if (head == null)
            return true;

        else
            return false;

    }

    public void add(Feedbacks fb) {
        Node newNode = new Node();
        newNode.fb = fb;

        if (head == null) {
            newNode.next = null;
            head = newNode;
        }

        else {

            if (newNode.fb.getDataEntrada().isBefore(head.fb.getDataEntrada())) {
                newNode.next = head;
                head = newNode;
            } else {
                Node aux = head;
                boolean found = false;

                while (aux.next != null && !found) {
                    if (aux.next.fb.getDataEntrada().isBefore(newNode.fb.getDataEntrada())) {
                        aux = aux.next;

                    } else
                        found = true;

                }
                newNode.next = aux.next;
                aux.next = newNode;

            }

        }
    }

    public void show() {
        Node aux = head;
        while (aux != null) {
            System.out.println(aux.fb.toString());
            aux = aux.next;
        }
    }
}
