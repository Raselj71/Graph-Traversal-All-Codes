
package com.mycompany.graphtraversal;

import java.util.LinkedList;
import java.util.Queue;


public class BFS {

    public BFS(int matrix[][],int node,int edge) {
        
        st(matrix, node, edge);
        
    }
    
    void st(int matrix[][],int node,int edge){
        
        int[]visit=new int[node];
        int []level=new int[node];
        int []parent=new int[node];
        
        for(int i=0;i<node; i++){
            visit[i]=0;
            level[i]=99999;
        }
        
        int s=0;
        visit[s]=1;
        level[s]=0;
        parent[s]=-1;
        
        Queue<Integer> queue=new LinkedList<>();
        queue.add(s);
        
        while(!queue.isEmpty()){
            int u=queue.poll();
            for(int v=0; v<node; v++){
                if(matrix[u][v]==1 &&visit[v]==0){
                    visit[v]=1;
                    parent[v]=u;
                    level[v]=level[u]+1;
                    queue.add(v);
                }
            }
            
            visit[u]=2;
            
        }
        for(int i=0; i<node; i++){
            System.out.println("Node="+i+"  level="+level[i]+ " parent="+parent[i]);
        }
        
    }
    
    
}
