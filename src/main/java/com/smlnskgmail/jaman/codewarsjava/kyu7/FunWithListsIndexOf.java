package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/581c6b075cfa83852700021f
public class FunWithListsIndexOf {

    private final Node<Object> node;
    private final Object value;

    public FunWithListsIndexOf(Node<Object> node, Object value) {
        this.node = node;
        this.value = value;
    }

    public int solution() {
        Node<Object> tempNode = node;
        int index = 0;
        while (tempNode != null) {
            if (tempNode.data.equals(value)) {
                return index;
            }
            tempNode = tempNode.next;
            index++;
        }
        return -1;
    }

    static class Node<T> {

        public Object data;
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
