
package com.mycompany.graphtraversal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class KruskalAlgorithm {
    public static void main(String[] args) {
         try {
            File file=new File("C:\\Users\\User\\Desktop\\rasel\\kruskal.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] firstLine = reader.readLine().split(" ");
            int node = Integer.parseInt(firstLine[0]);
            int edge = Integer.parseInt(firstLine[1]);
            
              Kruskal graph=new Kruskal(node, edge);
            
              for (int i = 0; i < edge; i++) {
                String[] line = reader.readLine().split(" ");
                int source = Integer.parseInt(line[0]);
                int destination = Integer.parseInt(line[1]);
                int weight=Integer.parseInt(line[2]);
                 
                graph.edge[i].src=source;
                graph.edge[i].dest=destination;
                graph.edge[i].weight=weight;
            }
              
              graph.KruskalMST();
            
             System.out.println("For Second Best");
             
           
             
          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
