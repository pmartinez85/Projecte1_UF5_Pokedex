package proves;


import java.util.*;

/**
 *
 * @author pedro
 */
                                // Això es una classe de prova, actualment no implementada al sistema
public class LlistaPokemon {
    
    
    public static void main(String[] args) {
        
		// ArrayList
		Collection pkm = new ArrayList<>();
 
		// Afegim nodes y creem un Iterator
		pkm.add("Bulbasour");
                pkm.add("Ivysour");
                pkm.add("Venusour");
		pkm.add("Charmander");
                pkm.add("Charmilion");
                pkm.add("Charizard");
		pkm.add("Squirtle");
                pkm.add("Wartortle");
                pkm.add("Blastoise");
                pkm.add("Pikachu");
                pkm.add("Raichu");
		Iterator iterador2 = pkm.iterator();
 
		// Recorrem y mostrem la llista
		while (iterador2.hasNext()) {
			String element = (String) iterador2.next();
			System.out.print(element + " ");
		}
		System.out.println("--ArrayList--");
	}

    
}
