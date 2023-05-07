
package boletin33;


public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String demarcacion;
    
    public Futbolista(Integer dorsal, String demarcacion, Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public void entrevista(){
        System.out.println("El futbolista hace una entrevista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el futbolista");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el futbolista");
    }

    @Override
    public String toString() {
        return super.toString() + "Dorsal: " + dorsal
                + "\nDemarcacion: " + demarcacion; 
    }
    
    
}

