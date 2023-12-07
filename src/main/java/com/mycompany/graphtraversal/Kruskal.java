
package com.mycompany.graphtraversal;

import com.mycompany.graphtraversal.Kruskal.KruskalGraph;
import java.util.Arrays;


public class Kruskal {
    
    
    public class KruskalGraph implements Comparable<KruskalGraph>{
    
    int src,dest,weight;

    @Override
    public int compareTo(KruskalGraph compareEdge) {
       return this.weight-compareEdge.weight;
    }

   
    
    
}

    
    int V,E;
    
    KruskalGraph edge[];
    int leader[];

    public Kruskal(int v,int e) {
        
        V=v;
        E=e;
        leader=new int[v];
        edge=new KruskalGraph[E];
        
        for(int i=0; i<E;i++){
            edge[i]=new KruskalGraph();
        }
        
    }
    
    int find(int n){
        return leader[n];
    }
    
    void union(int rootU,int rootV){
        int newLeader;
        if(rootU<rootV){
            newLeader=rootU;
            for(int i=0; i<V; i++){
                if(leader[i]==rootV){
                    leader[i]=newLeader;
                }
            
        }
        }else{
            newLeader=rootV;
            for(int i=0; i<V; i++){
                if(leader[i]==rootU){
                    leader[i]=newLeader;
                }
            }
        }
        
        
        
    }
    
    void KruskalMST(){
        KruskalGraph result[]=new KruskalGraph[V-1];
        int i=0;
        
        for(i=0; i<result.length; i++){
            result[i]=new KruskalGraph(); 
        }
        
        Arrays.sort(edge);
        
        for( i=0; i<V; ++i){
            leader[i]=i;
            
            
            
        }
        i=0;
        for(int e=0; e<edge.length; e++){
            KruskalGraph next_edge=edge[e];
            
            int x=find(next_edge.src);
            int y=find(next_edge.dest);
            
            if(x!=y){
                result[i++]=next_edge;
                union(x, y);
            
        }
            
        }
        
        
        System.out.println("The MST Tree is: ");
        int minimumCost=0;
        for(i=0; i<result.length; i++){
            System.out.println(result[i].src + " --" + result[i].dest + " == "+ result[i].weight);

             minimumCost += result[i].weight;
             System.out.println("Minimum Cost Spanning Tree " + minimumCost);
        }
        
        System.out.println("The Second MST Tree is ");
        
        int sec_size=result.length-1;
        
        int source=result[sec_size].dest;
        leader[source]=source;
        
        
        
    }
    
    
    
}
