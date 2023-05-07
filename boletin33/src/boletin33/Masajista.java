
package boletin33;

public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private Integer aniosExperiencia;
    
    public Masajista(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    public void darMasaje(){
        System.out.println("Da un masaje el masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega el masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el masajista");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el masajista");
    }

    @Override
    public String toString() {
        return super.toString() + "Titulacion: " + titulacion
                + "\nAnios de experiencia: " + aniosExperiencia;
    }
    
    
}
