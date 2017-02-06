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
public class ListeDeVoyages {
    
    
    
    private ArrayList<Voyage> AV = new ArrayList <Voyage> ();
    
     public ListeDeVoyages() {
    }

    public ListeDeVoyages(ArrayList AV) {
        this.AV = AV;
    }
    
   public ArrayList getAV() {
        return AV;
    }

    public void setAV(ArrayList AV) {
        this.AV = AV;
    }
    public ArrayList<Voyage> ListV()
    {
     System.out.println("Donner le nombre de voyages");
     Scanner sc = new Scanner(System.in);
     int nb = sc.nextInt();
     System.out.println("Donner la station de depart");
     Scanner scc = new Scanner(System.in);
     String sd = scc.nextLine();
     System.out.println("Donner la station d'arrivée");
     Scanner sccc = new Scanner(System.in);
     String sa = sccc.nextLine();
     System.out.println("Donner le temps de depart");
     Scanner scccc = new Scanner(System.in);
     int td = scccc.nextInt();
     for(int i=0;i<nb;i++)
    {
      AV.add(new Voyage(sd,sa,td));
      
    }
     return AV;
     
    }
    
}
