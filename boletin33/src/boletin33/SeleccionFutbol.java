
package boletin33;


public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
    
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public abstract void jugarPartido();

    @Override
    public abstract void entrenar();

    @Override
    public abstract void viajar();

    @Override
    public abstract void concentrarse();

    @Override
    public String toString() {
        return "Id: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\n";
    }
    
    
    
}
