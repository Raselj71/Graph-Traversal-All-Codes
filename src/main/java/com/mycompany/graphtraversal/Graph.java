
package com.mycompany.graphtraversal;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class Graph {
    
    private int V;
    private  List<List<Integer>> adjacencyList;
    
    public  Graph(int v){
        V=v;
        adjacencyList=new ArrayList<>();
        
        for(int i=0; i<v; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }
    
    public void addEdge(int v,int w){
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
        
    }
    
    public void startdfs(int startVertex){
        Scanner scan=new Scanner(System.in);
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack();
        Map<Integer,Integer> parentMap=new HashMap<>();
        
        visited[startVertex]=true;
        stack.push(startVertex);
        
         System.out.println("DFS traversal starting from vertex " + startVertex + ":");
         while(!stack.isEmpty()){
             int currentVertex=stack.pop();
             System.out.println(currentVertex+" ");
             for(int neighboure: adjacencyList.get(currentVertex)){
                 if(!visited[neighboure]){
                     visited[neighboure]=true;
                     parentMap.put(neighboure, currentVertex);
                     stack.push(neighboure);
                 }
             }
         }
         
         System.out.println();
         System.out.println("Enter your destination:");
         int destination=scan.nextInt();
         if(visited[destination]){
               System.out.print("Path from source to destination: ");
               List<Integer>path=new ArrayList<>();
               while(destination!=startVertex){
                   path.add(destination);
                   destination=parentMap.get(destination);
                   
               }
               path.add(startVertex);
               Collections.reverse(path);
                for (int vertex : path) {
                System.out.print(vertex + " ");
            }
            System.out.println();
         }else{
             System.out.println("Destination vertex is not reachable from the source.");
         }
    }
    
}
