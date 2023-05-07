
package datos;

import entidades.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaEmpleados {
    
    Empleado contratado = new EContratado();
    Empleado destajo = new EDestajo();
    
    public ArrayList<Empleado> agregarEmpleado(ArrayList<Empleado> lista){
        lista.add(contratado);
        lista.add(destajo);
        return lista;
    }
    
    public static void mostrarLista(ArrayList<Empleado> lista){
        for(Empleado el : lista){
            System.out.println(el);
            if(el instanceof EContratado){
                EContratado e = (EContratado)el;
                JOptionPane.showInputDialog(el.toString() + e.complementoSalarial());
            }
        }
    }
}
