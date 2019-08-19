package pokemon;

//@author Méndez Oliveros Victor Hugo

public class Pokemon {

    private int id;
    private String nombre; 
    private String tipo; 
    private int vida;
    private int ataque;
    private int defensa;
    private int velocidad;
    private int generacion;
    private boolean legendario;
    
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setGeneracion(int generacion) {
        this.generacion = generacion;
    }

    public void setLegendario(boolean legendario) {
        this.legendario = legendario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getGeneracion() {
        return generacion;
    }

    public boolean isLegendario() {
        return legendario;
    }
    
    public boolean equals(Pokemon pokemon){
    
        return ((this.id == pokemon.id)&&
                (this.nombre.equals(pokemon.nombre))&&
                (this.tipo.equals(pokemon.tipo))&&
                (this.vida == pokemon.vida)&&
                (this.ataque == pokemon.ataque)&&
                (this.defensa == pokemon.defensa) &&
                (this.velocidad == pokemon.velocidad)&&
                (this.generacion == pokemon.generacion)&&
                (this.legendario && pokemon.legendario));
        
    }
    
    @Override
    public String toString(){
        
        String leg = "";
        
        if (this.legendario){
            leg = "Sí";
        } else {
            leg = "No";
        }
    
        return String.format("\nId: %s \nNombre: %s \nTipo: %s "
                           + "\nVida: %s \nAtaque: %s"
                           + "\nDefensa: %s \nVelocidad: %s "
                           + "\nGeneracion: %s \nLegendario: ", 
                             this.id, this.nombre, this.tipo, 
                             this.vida, this.ataque, this.defensa, 
                             this.velocidad, this.generacion) + leg;
        
    }
}
