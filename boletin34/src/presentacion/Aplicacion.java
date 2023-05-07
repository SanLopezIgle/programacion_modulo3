
package presentacion;

import datos.ListaEmpleados;
import entidades.Empleado;
import java.util.ArrayList;


public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList<>();
        ListaEmpleados empleados = new ListaEmpleados();
        empleados.agregarEmpleado(lista);
        empleados.mostrarLista(lista);
    }
    
}
