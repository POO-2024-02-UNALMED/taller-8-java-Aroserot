package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;
    
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Futbolista o) {
        if (o instanceof Portero) {
            Portero otroPortero = (Portero) o;
            return Short.compare(this.golesRecibidos, otroPortero.golesRecibidos);
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + 
               ", y juega de " + getPosicion() + " con el dorsal " + dorsal + 
               ". Le han marcado " + golesRecibidos;
    }
}
