/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpath;

//import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author mohamed
 */
public class ShortestPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        File f = new File("src/shortestpath/newfile.txt");
        Scanner s = new Scanner(f);
int n;
int a[]=new int[2];
        System.out.println("For DFS press 1 , For BFS Press 2 , For A* press 3");
n=s.nextInt();
        switch(n)
        {
        /* ===================== DFS PART ===========================================*/
        case 1 :      
        DFS d1=new DFS(); 
        a=d1.printAdjMatrix(s);
        d1.DFSsearch(a[0],11);
        break; 
 /* ====================== BFS PART ==========================================*/
     case 2 :
     BFS b1=new BFS();
     a=b1.printAdjMatrix(s);
     b1.BFS(a[0],11);
     break;    
 /* ====================== A Star PART =======================================*/
     case 3:
    Astar a1=new Astar();
    a=a1.printAdjMatrix(s);
    a1.ASearch(a[0],11);
    break;
    }

}
}
