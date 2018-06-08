package com.cambeeler;

public class BinarySearchTree <T extends Comparable <T>> extends AbsElem{
    private Node <T> root;

    public BinarySearchTree(T value) {
        this.root = new Node<T> ( value);
    }

    public void insert(T value) {
        Node<T> node = new Node<T>(value);
        // insert logic goes here to search and insert
    }

    @Override
    AbsElem next() {
        return null;
    }

    @Override
    AbsElem previous() {
        return null;
    }

    @Override
    AbsElem setNext(Elem item) {
        return null;
    }

    @Override
    AbsElem setPrevious(Elem item) {
        return null;
    }

    @Override
    int compareTo(Elem item) {
        return 0;
    }
}
