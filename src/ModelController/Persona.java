package ModelController;


class Persona {
    
    private String nombre;
    private int edad;
    private String fecha;
    private String eps;

    public Persona(String nombre, int edad, String fecha, String eps) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.eps = eps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    } 
}
