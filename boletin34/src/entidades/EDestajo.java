
package entidades;


public class EDestajo extends Empleado{
    
    private int numCliente;
    private float comisionCliente;
    
    public EDestajo(){
        
    }

    public EDestajo(int numCliente, float comisionCliente, String dni, String nombre, String apellidos, String fechaIngreso) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.numCliente = numCliente;
        this.comisionCliente = comisionCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    @Override
    public String toString() {
        return "EDestajo{" + "numCliente=" + numCliente + '}';
    }
    
}
