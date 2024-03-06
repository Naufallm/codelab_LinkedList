package org.example;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LatihanLinkedListManual {
    public static void main(String[] args) {
        Node head = new Node(5);

        Node second = new Node(10);
        head.next = second;

        Node third = new Node(15);
        second.next = third;

        System.out.println("Daftar Angka : ");
        Node current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Elemen kedua : " + head.next.data);
        head.data = 25;

        System.out.println("Daftar angka setelah perubahan : ");
        current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
        head.next = head.next.next;

        System.out.println("Daftar angka setelah penghapusan : ");
        current = head;
        while
        (current != null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}