package com.home.datastructures.graph;

public class Main {

    public static void main(String[] args) {
        BetterGraph graph = new BetterGraph(5, "directed");

        graph.addVertex("State");
        graph.addVertex("Avenel");
        graph.addVertex("Elm");
        graph.addVertex("Pocono");
        graph.addVertex("William");

        graph.addEdge("Avenel", "Pocono");
        graph.addEdge("State", "Elm");
        graph.addEdge("Elm", "Avenel");
        graph.addEdge("Elm", "William");
        graph.addEdge("William", "State");
        graph.addEdge("William", "Pocono");
        graph.addEdge("Pocono", "Elm");
        graph.addEdge("State", "Avenel");

        graph.print();

    }
}
