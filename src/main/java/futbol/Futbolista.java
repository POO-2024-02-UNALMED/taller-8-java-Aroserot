package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private final String posicion;
    
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    
    public Futbolista() {
        this("Maradona", 30, "delantero");
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Futbolista f = (Futbolista) obj;
        return nombre.equals(f.nombre) && edad == f.edad && posicion.equals(f.posicion);
    }

    public abstract boolean jugarConLasManos();

    @Override
    public String toString() {
        return "El futbolista " + nombre +
               " tiene " + edad +
               ", y juega de " + posicion;
    }

    @Override
    public int compareTo(Futbolista o) {
        return Integer.compare(this.edad, o.edad);
    }
}
