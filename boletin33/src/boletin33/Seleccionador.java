
package boletin33;

public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
    }
    public void seleccionarJugador(){
        System.out.println("Selecciona un jugador el seleccionador");
    }
    @Override
    public void jugarPartido() {
        System.out.println("Juega el seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el seleccionador");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el seleccionador");
    }
    
}
