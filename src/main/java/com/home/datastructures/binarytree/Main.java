package com.home.datastructures.binarytree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<String> binarySearchTree = new BinarySearchTree<>();

        binarySearchTree.addNode(10, "10");
        binarySearchTree.addNode(4, "4");
        binarySearchTree.addNode(2, "2");
        binarySearchTree.addNode(5, "5");
        binarySearchTree.addNode(8, "8");
        binarySearchTree.addNode(9, "9");
        binarySearchTree.addNode(20, "20");
        binarySearchTree.addNode(18, "18");
        binarySearchTree.addNode(17, "17");
        binarySearchTree.addNode(19, "19");
        binarySearchTree.addNode(22, "22");
        binarySearchTree.addNode(21, "21");
        binarySearchTree.addNode(24, "24");
        binarySearchTree.addNode(33, "33");
        System.out.println("---------------");
        binarySearchTree.display();
//        System.out.println("---------------");
//        System.out.println(binarySearchTree.findMax().getKey());
//        System.out.println(binarySearchTree.findMin().getKey());
//        System.out.println("---------------");
//        binarySearchTree.remove(14);
//        binarySearchTree.display();
    }
}
