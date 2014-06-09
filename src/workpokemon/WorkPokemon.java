/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package workpokemon;

/**
 *
 * @author mct
 */
public class WorkPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon rocon = new Pokemon();
        
        PokemonOther poppo = new PokemonOther("Poppo");
        PokemonOther concon = new PokemonOther("Concon");
        
        rocon.name = "Rocon";            
        rocon.attack(" Raishu");
        rocon.attack(" Poppo");
        rocon.attack(" Concon");
        
        
        
    }
    
}
