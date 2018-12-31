package com.home.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T> {

    private Node<T> root;

    public void addNode(Integer key, T value) {
        Node<T> node = new Node(key, value);
        if (this.root == null) {
            this.root = node;
            System.out.println("Added first node: " + node.toString());
        } else {
            Node<T> current = this.root;
            while (true) {
                if (current.getKey() > key) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(node);
                        System.out.println("Added node to left: " + node.toString());
                        break;
                    } else {
                        current = current.getLeftChild();
                    }
                } else if (current.getKey() < key) {
                    if (current.getRightChild() == null) {
                        current.setRightChild(node);
                        System.out.println("Added node to right: " + node.toString());
                        break;
                    } else {
                        current = current.getRightChild();
                    }
                } else {
                    System.out.println("The key exists in the tree");
                    break;
                }
            }
        }
    }

    public boolean remove(int key) {

        Node<T> currentNode = root;
        Node<T> parentNode = root;

        boolean isLeftChild = false;

        //Searching
        while (currentNode.getKey() != key) {
            parentNode = currentNode;
            if (key < currentNode.getKey()) {
                isLeftChild = true;
                currentNode = currentNode.getLeftChild();
            } else {
                isLeftChild = false;
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) {
                return false;
            }
        }

        // if node is a leaf
        if (currentNode.getRightChild() == null && currentNode.getLeftChild() == null) {
            if (currentNode == root) {
                root = null;
            } else if (isLeftChild) {
                parentNode.setLeftChild(null);
            } else {
                parentNode.setRightChild(null);
            }
        }

        // if node has a child
        else if (currentNode.getRightChild() == null) {
            if (currentNode == root) {
                root = currentNode.getLeftChild();
            } else if (isLeftChild) {
                parentNode.setLeftChild(currentNode.getLeftChild());
            } else {
                parentNode.setRightChild(currentNode.getLeftChild());
            }
        } else if (currentNode.getLeftChild() == null) {
            if (currentNode == root) {
                root = currentNode.getRightChild();
            } else if (isLeftChild) {
                parentNode.setLeftChild(currentNode.getRightChild());
            } else {
                parentNode.setRightChild(currentNode.getRightChild());
            }
        }

        // if node has two children
        else {
            Node<T> successor = findSuccessor(currentNode);
            if (currentNode == root) {
                root = successor;
            } else if (isLeftChild) {
                parentNode.setLeftChild(successor);
            } else {
                parentNode.setRightChild(successor);
            }
            successor.setLeftChild(currentNode.getLeftChild());
        }

        return true;
    }

    public Node<T> findMin() {
        Node<T> current = this.root;
        Node<T> last = null;

        while (current != null) {
            last = current;
            current = current.getLeftChild();
        }
        return last;
    }

    public Node<T> findSuccessor(Node<T> node) {
        Node<T> successorParent = node;
        Node<T> successor = node;

        Node<T> current = node.getRightChild();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if (successor != node.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }
        return successor;
    }

    public Node<T> findMax() {
        Node<T> current = this.root;
        Node<T> first = null;

        while (current != null) {
            first = current;
            current = current.getRightChild();
        }
        return first;
    }

    public void display() {
        Integer maxDepth = maxDepth(this.root);
        int stringLength = (int) (Math.pow(2, maxDepth) * 2 * 2);

        StringBuilder string = new StringBuilder(" ");
        for (int j = 0; j < stringLength; j++) {
            string.append(" ");
        }
        string.append(" ");


        List<StringBuilder> strings = new ArrayList<>();
        int temp = stringLength;
        for (int i = 0; i < maxDepth + 1; i++) {
            StringBuilder stringBuilder = new StringBuilder(string);
            int halfOfString = temp / 2;
            for (int j = halfOfString; j < stringLength; j = j + halfOfString * 2) {
                stringBuilder.replace(j, j + 2, "__");
            }
            strings.add(stringBuilder);
            temp = halfOfString;
        }

        display(this.root, strings);

        for (StringBuilder stringBuilder : strings) {
            System.out.println(stringBuilder.toString());
        }
    }

    public void display(Node<T> node, List<StringBuilder> strings) {
        int level = getLevel(this.root, node.getKey());
        StringBuilder rowLevel = strings.get(level - 1);
        int indexToReplace = rowLevel.indexOf("__");
        rowLevel.replace(indexToReplace, indexToReplace + 2, node.getKey().toString());

        if (node.getLeftChild() != null) {
            display(node.getLeftChild(), strings);
        } else {
            replaceNullValues(level, strings);
        }

        if (node.getRightChild() != null) {
            display(node.getRightChild(), strings);
        } else {
            replaceNullValues(level, strings);
        }
    }

    private void replaceNullValues(Integer level, List<StringBuilder> strings){
        int executions = 1;
        for (int i = level; i < strings.size(); i++) {
            for (int j = 0; j < executions; j++) {
                StringBuilder rowLevel = strings.get(i);
                int indexToReplaceRight = rowLevel.indexOf("__");
                rowLevel.replace(indexToReplaceRight, indexToReplaceRight + 2, "--");
            }
            executions *= 2;
        }
    }

    /* Returns level of given data value */
    int getLevel(Node node, int data) {
        return getLevelUtil(node, data, 1);
    }

    int getLevelUtil(Node<T> node, Integer key, int level) {
        if (node == null)
            return 0;

        if (node.getKey() == key)
            return level;

        int downlevel = getLevelUtil(node.getLeftChild(), key, level + 1);
        if (downlevel != 0)
            return downlevel;

        downlevel = getLevelUtil(node.getRightChild(), key, level + 1);
        return downlevel;
    }

    int maxDepth(Node<T> node) {
        if (node == null) {
            return (-1); // an empty tree  has height −1
        } else {
            // compute the depth of each subtree
            int leftDepth = maxDepth(node.getLeftChild());
            int rightDepth = maxDepth(node.getRightChild());
            // use the larger one
            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }
}
