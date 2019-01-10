package com.home.datastructures.graph;

public class BetterGraph {

    private int vCount; // number of vertices
    private Vertex[] vertices;
    private boolean undirected = true;

    public BetterGraph(int size, String type) {
        if (type.equals("directed")) {
            undirected = false;
        }

        this.vertices = new Vertex[size];
    }

    public void addVertex(String vertexName) {
        this.vertices[vCount] = new Vertex(vertexName, null);
        vCount++;
    }

    public void addEdge(String src, String dest) {
        int v1Idx = indexForName(src);
        int v2Idx = indexForName(dest);

        this.vertices[v1Idx].adjList = new Node(v2Idx, this.vertices[v1Idx].adjList);
        if(undirected){
            this.vertices[v2Idx].adjList = new Node(v1Idx,  this.vertices[v1Idx].adjList);
        }
    }

    private int indexForName(String name) {
        for(int i = 0; i < vertices.length; i++){
            if(vertices[i].name.equals(name)){
                return i;
            }
        }
        return 0;
    }

    public int getVertexCount() {
        return vCount;
    }

    public void print() {
        System.out.println();
        for(int i = 0; i < vertices.length; i++){
            System.out.print(vertices[i].name);
            for (Node node = vertices[i].adjList; node != null; node = node.next){
                System.out.print(" ==> " + vertices[node.vertexIdx].name);
            }
            System.out.println("\n");
        }
    }

    public Vertex adj(int src) {
        return this.vertices[src];
    }

}
