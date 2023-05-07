
package boletin33;

public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;
    
    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planifica el entrenamiento el entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el entrenador");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el entrenador");
    }

    @Override
    public String toString() {
        return super.toString() + "Id federacion: " + idFederacion;
    }
    
    
}
