
package entidades;

import java.util.GregorianCalendar;


public class EContratado extends Empleado{
    
    private float salario;

    public EContratado() {
    }

    public EContratado(float salario, String dni, String nombre, String apellidos, String fechaIngreso) {
        super(dni, nombre, apellidos, fechaIngreso);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "EContratado{" + "salario=" + salario + '}';
    }
    
    public float complementoSalarial(){
        String fechaIngreso = super.getFechaIngreso();
        String fechaPartes[] = fechaIngreso.split("/");
        int dia = Integer.parseInt(fechaPartes[0]);
        int mes = Integer.parseInt(fechaPartes[1]) - 1;
        int ano = Integer.parseInt(fechaPartes[2]);
        GregorianCalendar fecha1 = new GregorianCalendar(ano, mes, dia);
        GregorianCalendar fecha2 = new GregorianCalendar();
        long diferenciaEnMilisegundos = fecha1.getTimeInMillis() - fecha2.getTimeInMillis();
        double diferenciaEnAnios = Math.floor(diferenciaEnMilisegundos / (365.25 * 24 * 60 * 60 * 1000));
        if(diferenciaEnAnios >= 0 || diferenciaEnAnios <= 3){
            salario = (float) ((salario * 0.05) + salario);
        }else if (diferenciaEnAnios >= 4 || diferenciaEnAnios <= 7){
            salario = (float) ((salario * 0.10) + salario);
        }else if (diferenciaEnAnios >= 8 || diferenciaEnAnios <= 15){
            salario = (float) ((salario * 0.15) + salario);
        }else if (diferenciaEnAnios > 15){
            salario = (float) ((salario * 0.20) + salario);
        }
        return salario;
    }
}
