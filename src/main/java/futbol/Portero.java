package futbol;



public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;


    public Portero( String nombre,int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad , "Portero");
        this.dorsal = dorsal;
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre()+" tiene "+getEdad() +", y juega de "+getPosicion() +" con el dorsal " + dorsal +
                ". Le han marcado " + golesRecibidos ;
    }
    @Override
    public int compareTo(Object o) {
        Portero o1 = (Portero) o;
        if (this.getGolesRecibidos() - o1.getGolesRecibidos() < 0) {
            return -(this.getGolesRecibidos() - o1.getGolesRecibidos());
        } else {
            return this.getGolesRecibidos() - o1.getGolesRecibidos();
        }
    }

}