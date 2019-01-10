package com.home.datastructures.graph;

public class Vertex {

    String name;
    Node adjList;

    Vertex(String name, Node node) {
        this.name = name;
        this.adjList = node;
    }
}
