
package com.mycompany.graphtraversal;

import java.util.Scanner;



public class GraphTraversal {
      static  int[][] matrix;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         System.out.print("Enter the Number of vertices?");
         int n=scan.nextInt();
         matrix=new int[n][n];
         
         System.out.println("Enter the number of Edges?");
         int e=scan.nextInt();
         inmatrix(e);
         
         System.out.println("The output of Matrix: ");
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 System.out.print(matrix[i][j]+ " ");
             }
             System.out.println("");
         }
         BFS b = new BFS(matrix,n,e);
    }
    
    static void inmatrix(int e){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the all edges....");
        int i;
        char j,k;
      
         for( i=0; i<e; i++){
             j=scan.next().charAt(0);
             k=scan.next().charAt(0);
              
             matrix[(int) j-65][(int) k-65]=matrix[(int) k-65][(int)j-65]=1;
         }
        
    }
}
