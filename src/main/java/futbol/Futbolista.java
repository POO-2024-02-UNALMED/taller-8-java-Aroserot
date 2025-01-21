package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(){
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    public Boolean equals(Futbolista otroFutbolista){
        return otroFutbolista == this;
    }

    public abstract boolean jugarConLasManos();
    public abstract int compareTo(Object otroFutoblista);

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int nuevaEdad){
        edad = nuevaEdad;
    }

    public String getPosicion(){
        return posicion;
    }
}