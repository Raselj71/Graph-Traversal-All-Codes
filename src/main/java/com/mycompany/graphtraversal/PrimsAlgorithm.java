
package com.mycompany.graphtraversal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class PrimsAlgorithm {
    public static void main(String[] args) {
        try {
            File file=new File("C:\\Users\\User\\Desktop\\rasel\\Prims.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String[] firstLine = reader.readLine().split(" ");
            int node = Integer.parseInt(firstLine[0]);
            int edge = Integer.parseInt(firstLine[1]);
            
             int[][] metrix= new int[node][node];
            
              for (int i = 0; i < edge; i++) {
                String[] line = reader.readLine().split(" ");
                int source = Integer.parseInt(line[0]);
                int destination = Integer.parseInt(line[1]);
                int weight=Integer.parseInt(line[2]);
                
                metrix[source][destination]=metrix[destination][source]=weight;
                 
               
            }
              
             
              for(int i=0; i<node; i++){
                  for(int j=0; j<node; j++){
                      System.out.print(metrix[i][j] +" " );
                  }
                  System.out.println("");
              }
             
             
          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
