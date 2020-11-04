package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/581e476d5f59408553000a4b
public class FunWithListsLength {

    private Node<Object> input;

    public FunWithListsLength(Node<Object> input) {
        this.input = input;
    }

    public int solution() {
        int length = 0;
        while (input != null) {
            length++;
            input = input.next;
        }
        return length;
    }

    static class Node<T> {

        public T data;
        public Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }

    }

}
