package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object otroFutbolista){
        if(otroFutbolista instanceof Portero){
            return Math.abs(golesRecibidos - ((Portero )otroFutbolista).golesRecibidos);
        }

        return 0;
    }

    public boolean jugarConLasManos(){
        return true;
    }

    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}