package shortestpath;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mohamed
 */
public class DFS extends Graph {

    //String currentCity;
   // String goalCity;
    Stack s=new Stack();
   ArrayList<Integer> list = new ArrayList<>();
    
     
    void DFSsearch(int initial_node , int n) {
        int u, i;
        s.top = -1;
        
        s.push(initial_node);
        System.out.println("\nDFS traversal for given graph is : ");
        while (!s.isempty()) {

            u = s.pop();
            if (visited[u] == 0) {
                System.out.print("\n" + bij[u]);
                visited[u] = 1;
            }
            
            for (i = 1; i < n; i++) {
                if ((adj[u][i].equals("True")) && (visited[i] == 0) ) {
                    s.push(u);
                    visited[i] = 1;
                    System.out.print(" " + bij[i]);
                  list.add(u);
                    if(bij[i].equals(dis))
                    { 
                        s.pop();
                        optimumPath(list); 
                         //s.display();
                          return;
                    }
                    u = i;

                }
            }
        }
    }
    void optimumPath( ArrayList list)
    {
        
        System.out.println("\n");
        for(int i=0;i<list.size();i++)
            for(int j=1+i;j<list.size();j++)
        {
            if(list.get(i)==list.get(j))
            {   
                while(j>i)
                {
                    list.remove(j);     
                    j--;
                }
            }
        }
       int i=0; 
        System.out.println("Your Optimum Path :");
        while(i<list.size())
        {
         System.out.print(bij[(int)list.get(i)]+" "); 
         i++; 
        }  
        System.out.print(dis+"\n");
}
}