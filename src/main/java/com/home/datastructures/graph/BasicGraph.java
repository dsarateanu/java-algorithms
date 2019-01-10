package com.home.datastructures.graph;

import java.util.ArrayList;

public class BasicGraph {

    private int vCount; // number of vertices
    private int eCount; // number of edges

    private ArrayList[] adjacents;

    public BasicGraph(int vCount){
        this.vCount = vCount;
        this.eCount = 0;
        adjacents = new ArrayList[vCount];

        for(int i = 0; i < vCount; i++){
            adjacents[i] = new ArrayList();
        }
    }

    public int getVertexCount(){
        return vCount;
    }


    public int getEdgeCount(){
        return eCount;
    }

    public void addEdge(Integer src, Integer dest){
        adjacents[src].add(dest);
        eCount++;
    }

    public Object[] adj(int src){
        return adjacents[src].toArray();
    }

}
