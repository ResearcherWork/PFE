/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PFERecherche;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tesnime
 */
public class Reseau {
    
    private int nbStation ;
    private int n,m;
    private int[][]MC = new int[n][m];
    ListeDeVoyages LV = new ListeDeVoyages();

    public int[][] MatriceG()
    {
     ArrayList<Voyage> A = new ArrayList<Voyage>();
     A=LV.ListV();
     for(int i=1;i <= A.size();i++)
     {  
        for(int j=2;j <= A.size();j++)
        {   if((i!=j)&&(i<j))
        {
        CoutStations C = new CoutStations(A.get(i).getSArrive(),A.get(j).getSDepart());
        CoutStations CS = new CoutStations(A.get(j).getSDepart(), A.get(j).getSArrive());
        if(A.get(i).CalculTArrive(A.get(i).getSDepart(), A.get(i).getSArrive())+ C.getCout() <= A.get(j).getTDepart())
        {
          MC[i][j]= C.getCout() + CS.getCout() ;
        }
        }
        }
       
             
        
            
     }
      return MC ;
    }
    
    
}
