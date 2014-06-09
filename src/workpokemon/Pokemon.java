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
public class Pokemon {
    
       String name;
       
       public void attack(){
           System.out.println(this.name + " is attacking");
       }
    
        public void attack(String pokemonName){
            System.out.println(this.name + " is attacking"+pokemonName+".");
        }
        
        public void attack(PokemonOther pokemonOther){
            this.attack(pokemonOther.name);
        }
}
