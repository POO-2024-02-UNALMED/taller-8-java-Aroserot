package futbol;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;

    public Jugador( String nombre,int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.dorsal = dorsal;
        this.golesMarcados = golesMarcados;
    }

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public short getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre()+" tiene "+getEdad() +", y juega de "+getPosicion() +" con el dorsal " + dorsal +
                ". Ha marcado " + golesMarcados ;
    }
    @Override
    public int compareTo(Object o) {
        Futbolista o1 = (Futbolista) o;
        if (this.getEdad() - o1.getEdad() < 0) {
            return -(this.getEdad() - o1.getEdad());
        } else {
            return this.getEdad() - o1.getEdad();
        }
    }

}