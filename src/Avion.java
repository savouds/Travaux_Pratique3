/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Avion extends Vehicule {
     public Avion(){
         super();
     }
     public void rouler() throws Exception
     {
         if (altitude>0)
            throw new Exception("L'avion en vol ne peut rouler");
         else super.rouler();
     }

     
      public static void main(String[] args) {
 		Avion a = new Avion();}
}
