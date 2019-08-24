package pokemon;

/**
 * Implementación de un pokemón.
 * @author Méndez Oliveros Victor Hugo.
 * @author Mercado Ayala Arturo.
 */
public class Pokemon {

    /**
     * Número del pokemón.
     */
    private int id;
    
    /**
     * Nombre del pokemón.
     */
    private String nombre;
    
    /**
     * Tipo de pokemón.
     */
    private String tipo;
    
    /**
     * Cantidad de vida que posee.
     */
    private int vida;
    
    /**
     * Potencia de su ataque.
     */
    private int ataque;
    
    /**
     * Capacidad para defenderse.
     */
    private int defensa;
    
    /**
     * Velocidad que posee.
     */
    private int velocidad;
    
    /**
     * Generación a la que pertenece.
     */
    private int generacion;
    
    /**
     *true si el pokemón es legendario.
     */
    private boolean legendario;

    /**
     * Cosntructor con los datos que llevará el pokemón.
     * @param id número de pokemón.
     * @param nombre Nombre.
     * @param tipo Tipo.
     * @param vida Vida.
     * @param ataque Ataque.
     * @param defensa Defensa.
     * @param velocidad Velocidad.
     * @param generacion Generación.
     * @param legendario Legendario.
     */
    public Pokemon( int id, String nombre, String tipo, 
                    int vida, int ataque, int defensa,
                    int velocidad, int generacion, 
                    boolean legendario){
        
        this.id = id; 
        this.nombre = nombre; 
        this.tipo = tipo; 
        this.vida = vida; 
        this.ataque = ataque; 
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.generacion = generacion; 
        this.legendario = legendario;
    
    }
    
    /**
     * DEvuelve el id del pokemón.
     * @return id.
     */
    public int getId(){
    return id;
    }
    
    /**
     * Devuelve el nombre del pokemón.
     * @return nombre
     */
    public String getNombre(){
    return nombre;
    }
    
    /**
     * Devuelve el tipo de pokemón.
     * @return tipo
     */
    public String getTipo(){
    return tipo;
    }
    
    /**
     * Devuelve la cantida de vida del pokemón.
     * @return vida
     */
    public int getVida(){
    return vida;
    }
    
    /**
     * Devuelve el ataque del pokemón.
     * @return ataque
     */
    public int getAtaque(){
    return ataque;
    }
    
    /**
     * Devuelve la defensa del pokemón.
     * @return defensa
     */
    public int getDefensa(){
    return defensa;
    }
    
    /**
     * Devuelve la velocidad del pokemón.
     * @return velocidad
     */
    public int getVelocidad(){
    return velocidad;
    }
    
    /**
     * Devuelve la generación del pokemón.
     * @return generacion
     */
    public int getGeneracion(){
    return generacion;
    }
    
    /**
     * Devuelve true si el pokemón es legendario.
     * @return legendario.
     */
    public boolean getLegendario(){
    return legendario;
    }
    
    /**
     * Nuevo id del pokemón.
     * @param id.
     */
    public void setId(int id){
    this.id = id;
    }
    
    /**
     * Nuevo nombre del pokemón.
     * @param nombre
     */
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    /**
     * Nuevo tipo de pokemón.
     * @param tipo
     */
    public void setTipo(String tipo){
    this.tipo = tipo;
    }
    
    /**
     * Asigna una cantidad de vida al pokemón.
     * @param vida
     */
    public void setVida(int vida){
    this.vida = vida; 
    }
    
    /**
     * Asigna su ataque al pokemón.
     * @param ataque
     */
    public void setAtaque(int ataque){
    this.ataque = ataque;
    }
    
    /**
     * Asigna su defensa al pokemón.
     * @param defensa
     */
    public void setDefensa(int defensa){
    this.defensa = defensa;
    }
    
    /**
     * Asigna una velocidad al pokemón.
     * @param velocidad
     */
    public void setVelocidad(int velocidad){
    this.velocidad = velocidad;
    }
    
    /**
     * Asigna la generación al pokemón.
     * @param generacion
     */
    public void setGeneracion(int generacion){
    this.generacion = generacion;
    }
    
    /**
     * Asigna el valor de legendario al pokemón.
     * @param legendario
     */
    public void setLegendario(boolean legendario){
    this.legendario = legendario;
    }
    
    /**
     * Devuelve true si y sólo sí los 
     * pokemónes a comparar tienen 
     * los mismos atributos.
     * @param pokemon Pokemón a ser comparado 
     * con el pokemón en cuestión.
     * @return booleano
     */
    public boolean equals(Pokemon pokemon){
    
        return ((this.id == pokemon.id)&&
                (this.nombre.equals(pokemon.nombre))&&
                (this.tipo.equals(pokemon.tipo))&&
                (this.vida == pokemon.vida)&&
                (this.ataque == pokemon.ataque)&&
                (this.defensa == pokemon.defensa) &&
                (this.velocidad == pokemon.velocidad)&&
                (this.generacion == pokemon.generacion)&&
                (this.legendario == pokemon.legendario));
        
    }
    
    /**
     * Información del pokemón.
     * @return Cadena con información.
     */
    @Override
    public String toString(){
        
        String info = "****************************** \n\t"  
                + id + "  " + nombre +"\n"
                + "******************************"
                + "\n TIPO: " + tipo
                + "\n VIDA: " + vida
                + "\n ATAQUE: " + ataque
                + "\n DEFENSA: " + defensa
                + "\n VELOCIDAD: " + velocidad
                + "\n GENERACION: " + generacion
                + "\n LEGENDARIO: " + legendario
                +"\n------------------------------- \n\n" ;
        
        return info;
    }
    
}