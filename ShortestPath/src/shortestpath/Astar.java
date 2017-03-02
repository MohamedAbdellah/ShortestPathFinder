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
public class Astar extends Graph {

    double realDis[][];
    double heurDis[][] = new double[eleSize][eleSize];
    int flag=0;
    int sele;
    Queue q = new Queue();

    public Astar() {
        realDis = new double[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 75, 57, 62, 67, 78, 70, 87, 82, 77},
            {0, 75, 0, 24, 22, 39, 41, 21, 50, 51, 56},
            {0, 57, 24, 0, 9, 15, 22, 17, 33, 31, 32},
            {0, 62, 22, 9, 0, 16, 27, 8, 32, 30, 31},
            {0, 67, 39, 17, 16, 0, 14, 16, 18, 14, 16},
            {0, 78, 41, 22, 27, 14, 0, 30, 30, 28, 13},
            {0, 70, 21, 17, 8, 16, 30, 0, 33, 29, 31},
            {0, 87, 50, 33, 32, 18, 30, 33, 0, 17, 32},
            {0, 82, 51, 31, 30, 15, 28, 29, 17, 0, 19},
            {0, 77, 56, 32, 31, 16, 13, 31, 32, 19, 0}
        };
        heurDis = new double[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 41, 35, 50, 44, 37, 43, 57, 57, 46},
            {0, 41, 0, 19, 16, 29, 32, 15, 32, 35, 42},
            {0, 35, 19, 0, 6, 12, 14, 11, 22, 23, 21},
            {0, 50, 16, 6, 0, 13, 18, 7, 20, 25, 24},
            {0, 44, 29, 12, 13, 0, 10, 15, 12, 12, 15},
            {0, 37, 32, 14, 18, 10, 0, 23, 23, 18, 9},
            {0, 43, 15, 11, 7, 15, 23, 0, 16, 23, 30},
            {0, 57, 32, 22, 20, 12, 23, 16, 0, 11, 24},
            {0, 57, 35, 23, 25, 12, 18, 23, 11, 0, 14},
            {0, 46, 42, 21, 24, 15, 9, 30, 24, 14, 0}
        };

    }

    void ASearch(int initial_node, int n) {
        
        int u, i, index = 0;
        double totalDis = 1000;
        u = initial_node;
        visited[initial_node] = 1;
        System.out.println("\nA Star traversal for given graph is : ");
        System.out.print(bij[initial_node]);
        q.insert(initial_node);
        while (q.empty() == 0) {
            u = q.remove();
            for (int j = 1; j < n; j++) {
                if ((adj[u][j].equals("True")) && (visited[j] == 0)) {
                    if (totalDis > (realDis[u][j] + heurDis[j][a[1]])) //totalDis=Math.min(totalDis, (realDis[u][j])+heurDis[u][a[1]]);
                    {
                        totalDis = (realDis[u][j] + heurDis[j][a[1]]);
                        sele = j;
                    }
                }
            }

            totalDis = 1000;
            for (i = 1; i < n; i++) {
                if ((adj[u][i].equals("True")) && (visited[i] == 0) && (sele == i)) {
                    if (bij[i].equals(dis)) {
                        System.out.println(" " + dis);
                        return;                     
                    }
                    q.insert(i);
                    visited[i] = 1;
                    System.out.print(" " + bij[i]);
                    
                        
                    break;
                }

            }

        }
   
    }
}
