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

public class Graph {
    Scanner file;
    int MAXSIZE = 51;
    int eleSize = 11;
    int AlshohdaNo;
    int BerketAlseb3No;
    int QuesnaNo;
    int ShebinElkomNo;
    int MinoufNo;
    int SirsAllyanNo;
    int ElbagoorNo;
    int AshmoonNo;
    int ElsadatNo;
    int TalaNo;
    int initialNode;
    int disNode;
    String dis;
    
     int a[]=new int [2];
    int  retValue[]=new int[2];
    String adj[][] = new String[MAXSIZE][MAXSIZE];
    int visited[] = new int[MAXSIZE];

    String bij[];
Scanner s=new Scanner(System.in);
    // Constructor 
    public Graph() {    
        bij = new String[]{"","Elsadat", "Ashmoon", "Minouf", "SirsAllyan", "ShebinElkom", "Alshohda", "Elbagoor", "Quesna", "BerketAlsb3",
                           "Tala"};
                            
        TalaNo          = 10;
        BerketAlseb3No  = 9;
        QuesnaNo        = 8;
        ElbagoorNo      = 7; 
        AlshohdaNo      = 6;
        ShebinElkomNo   = 5;
        SirsAllyanNo    = 4;
        MinoufNo        = 3;
        AshmoonNo       = 2;
        ElsadatNo       = 1;

        for (int i = 1; i < eleSize; i++) {
            for (int j = 1; j < eleSize; j++) {
                adj[i][j] = "0";
            }
        }

        adj[ElsadatNo][AshmoonNo] = "True";
        adj[AshmoonNo][ElsadatNo] = "True";

        adj[ElsadatNo][MinoufNo] = "True";
        adj[MinoufNo][ElsadatNo] = "True";

        adj[MinoufNo][SirsAllyanNo] = "True";
        adj[SirsAllyanNo][MinoufNo] = "True";

        adj[MinoufNo][ShebinElkomNo] = "True";
        adj[ShebinElkomNo][MinoufNo] = "True";

        adj[MinoufNo][AlshohdaNo] = "True";
        adj[AlshohdaNo][MinoufNo] = "True";

        adj[SirsAllyanNo][ElbagoorNo] = "True";
        adj[ElbagoorNo][SirsAllyanNo] = "True";

        adj[ShebinElkomNo][QuesnaNo] = "True";
        adj[QuesnaNo][ShebinElkomNo] = "True";

        adj[QuesnaNo][BerketAlseb3No] = "True";
        adj[BerketAlseb3No][QuesnaNo] = "True";

        adj[BerketAlseb3No][ShebinElkomNo] = "True";
        adj[ShebinElkomNo][BerketAlseb3No] = "True";

        adj[ShebinElkomNo][TalaNo] = "True";
        adj[TalaNo][ShebinElkomNo] = "True";
    }

    int[] printAdjMatrix(Scanner f) {
        file=f;
       
        System.out.println("Adjacency matrix for your graph is :\n");
        System.out.printf("%-10s", "");
        for (int i = 1; i < bij.length; i++) {
            System.out.printf("%-12s", bij[i]);
        }
        System.out.println("\n");
        for (int i = 1; i < bij.length; i++) {
            System.out.printf("%-12s", bij[i]);
            for (int j = 1; j <bij.length ; j++) {
                System.out.printf("%-12s", adj[i][j]);
            }
            System.out.println("\n");
        }

        System.out.println("Your Undirected Graph is :\n");
        for (int i = 1; i < bij.length; i++) {
            System.out.print("\nThe town of " + bij[i] + " is connected to : ");
            for (int j = 1; j < bij.length; j++) {
                if (adj[i][j].equals("True")) {
                    System.out.print(" " + bij[j]);
                }
                
            }
  
        }
       System.out.println("\nEnter your current city:");
        String input=file.next();
         System.out.println("\nEnter your distination:");
          dis=file.next(); 
        
        for(int i=1;i<bij.length;i++)
        {
            if(bij[i].equals(input))
               a[0]  =i;
            if(bij[i].equals(dis))
                 a[1]=i;
        }
        
        return a; 
    }
}
