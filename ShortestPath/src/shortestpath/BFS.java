/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpath;

/**
 *
 * @author mohamed
 */
public class BFS extends Graph {

    Queue q= new Queue();
    
    public BFS() {

    }

    void BFS(int initial_node , int n) {

        int u, i;
        u = initial_node;
        visited[initial_node] = 1;
        System.out.println("\nDFS traversal for given graph is : ");
        System.out.print(bij[initial_node]);
        q.insert(initial_node);
        while (q.empty() == 0) {
            u = q.remove();
            for (i = 1; i <n; i++) {
                if ((adj[u][i].equals("True")) && (visited[i] == 0)) {
                        if(bij[i].equals(dis))
                        {
                            System.out.println(" "+dis);
                            return;
                        }
                    q.insert(i);
                    visited[i] = 1;
                    System.out.print(" " + bij[i]);
                }

            }

        }

    }

}
