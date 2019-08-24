package pokemon;
import java.util.Scanner;

/**
 * Prueba de la clase pokemón.
 * @author Méndez Oliveros Victor Hugo.
 * @author Mercado Ayala Arturo.
 */
public class PruebaPokemon {
    
    /**
     * Prueba.
     * @param args 
     */
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        //Creación de variables para guardar los atributos necesarios.
        int id;
        String nombre;
        String tipo;
        int vida;
        int ataque;
        int defensa;
        int velocidad;
        int generacion;
        boolean legendario;  
        
        //Creación de un arreglo para guardar los pokemónes en él.
        Pokemon pokedex [] = new Pokemon [5];
    
        /*A cada posición del arreglo le guardamos un pokemón creado
          con los datos ingresados.*/
        for(int i = 0 ; i < pokedex.length ; i++){
        
            System.out.printf("\nIngresa los datos del "
                            + "pokemón número %s", i+1);
        
            System.out.printf("\nIngresa su id: ");
            id = scanner.nextInt();
        
            System.out.printf("\nIngresa su nombre: ");
            nombre = scanner.next();
        
            System.out.printf("\nIngresa su tipo: ");
            tipo = scanner.next();
        
            System.out.printf("\nIngresa su vida: ");
            vida = scanner.nextInt();
        
            System.out.printf("\nIngresa su ataque: ");
            ataque = scanner.nextInt();
        
            System.out.printf("\nIngresa su defensa: ");
            defensa = scanner.nextInt();
        
            System.out.printf("\nIngresa su velocidad: ");
            velocidad = scanner.nextInt();
        
            System.out.printf("\nIngresa su generación: ");
            generacion = scanner.nextInt();
        
            System.out.printf("\nIngresa si el pokemón es legendario: ");
            legendario = scanner.nextBoolean();
        
            pokedex [i] = new Pokemon(id, nombre, tipo, vida, ataque, 
                        defensa, velocidad,generacion,legendario); 
        
            }
    
        //Impresión de cada pokemón en el pokedex.
        for (Pokemon pokemon : pokedex) {
            
            System.out.print(pokemon);
            
        }
    
    }
    
}