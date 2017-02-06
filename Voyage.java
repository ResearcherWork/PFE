/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmeEvaluation;

import java.util.Date;

/**
 *
 * @author Tesnime
 */
public class Voyage {
    
    private String SDepart ;
    private String SArrive ; 
    private int TDepart ;
  
    
        public Voyage() {
    }

    public Voyage(String SDepart, String SArrive, int TDepart) {
        this.SDepart = SDepart;
        this.SArrive = SArrive;
        this.TDepart = TDepart;
    }

    public String getSDepart() {
        return SDepart;
    }

    public void setSDepart(String SDepart) {
        this.SDepart = SDepart;
    }

    public String getSArrive() {
        return SArrive;
    }

    public void setSArrive(String SArrive) {
        this.SArrive = SArrive;
    }

    

    public int getTDepart() {
        return TDepart;
    }

    public void setTDepart(int TDepart) {
        this.TDepart = TDepart;
    }

   
    public int CalculTArrive(String S1 , String S2)
    {
      int TA ;
      CoutStations CS = new CoutStations(S1,S2);
      TA = TDepart + CS.getCout();
      return TA ;
    }
    



    
    
    
    
}
