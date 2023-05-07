
package boletin33;

public class Boletin33 {


    public static void main(String[] args) {
        
        SeleccionFutbol sf;
        System.out.println("**Seleccion futbol**");
        
        sf = new Futbolista(3, "defensa", 111, 0, "aaa", "bbb ccc", 23);
        System.out.println("\n-Futbolista:\n" + sf.toString());
        
        sf = new Entrenador(11, 0, "ggg", "hhh jjj", 40);
        System.out.println("\n-Entrenador:\n" + sf.toString());
        
        sf = new Masajista("titu", 5, 01, "kkk", "iii ppp", 33);
        System.out.println("\n-Masajista:\n" + sf.toString());
    }
    
}
