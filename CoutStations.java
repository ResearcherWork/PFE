/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmeEvaluation;

/**
 *
 * @author Tesnime
 */
public class CoutStations {
    
    
    private String NomStation1 ;
    private String NomStation2 ; 
    private int Cout ; 

    public CoutStations() {
    }

    public CoutStations(String NomStation1, String NomStation2, int Cout) {
        this.NomStation1 = NomStation1;
        this.NomStation2 = NomStation2;
        this.Cout = Cout;
    }

    public String getNomStation1() {
        return NomStation1;
    }

    public void setNomStation1(String NomStation1) {
        this.NomStation1 = NomStation1;
    }

    public String getNomStation2() {
        return NomStation2;
    }

    public void setNomStation2(String NomStation2) {
        this.NomStation2 = NomStation2;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(int Cout) {
        this.Cout = Cout;
    }

    public CoutStations(String NomStation1, String NomStation2) {
        this.NomStation1 = NomStation1;
        this.NomStation2 = NomStation2;
    }
    
    
}
