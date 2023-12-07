
package com.mycompany.graphtraversal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class DFS {
    public static void main(String[] args) {
       
        try {
            File file=new File("C:\\Users\\User\\Desktop\\rasel\\dfs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] firstLine = reader.readLine().split(" ");
            int node = Integer.parseInt(firstLine[0]);
            int edge = Integer.parseInt(firstLine[1]);
            
            Graph graph=new Graph(node);
            
              for (int i = 0; i < edge; i++) {
                String[] line = reader.readLine().split(" ");
                int source = Integer.parseInt(line[0]);
                int destination = Integer.parseInt(line[1]);
                 graph.addEdge(source, destination);
            }
              int startVertex=0;
              graph.startdfs(startVertex);
          
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
}
