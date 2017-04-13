/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sepele Cyrille
 */
public class Vehicule {
    public int vitesse;
    public int position;
    public int altitude;
    public void rouler() throws Exception
     {
         position += vitesse;
     }

}
