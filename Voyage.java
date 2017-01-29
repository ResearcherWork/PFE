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
    
    private Stations Depart ;
    private Stations Arrive ; 
    private int TDepart ;
  
    
        public Voyage() {
    }

    public Voyage(Stations Depart, Stations Arrive, int TDepart) {
        this.Depart = Depart;
        this.Arrive = Arrive;
        this.TDepart = TDepart;
        
    }

    public Stations getDepart() {
        return Depart;
    }

    public void setDepart(Stations Depart) {
        this.Depart = Depart;
    }

    public Stations getArrive() {
        return Arrive;
    }

    public void setArrive(Stations Arrive) {
        this.Arrive = Arrive;
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