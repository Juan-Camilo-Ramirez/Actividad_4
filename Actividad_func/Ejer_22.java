import javax.swing.JOptionPane;

public class Ejer_22 {
    public static void main(String[] args) {
        String Mnsj = "";
        int liminf = 0;
        int limsup = 0;
        int numAleat = 0;

        Mnsj = "Ingrese un limite inferior";
        liminf = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = "Ingrese un limite superior";
        limsup = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        numAleat = Funciones.generarAleatorio(liminf, limsup);
        Mnsj = "EL numero aleatorio en el rango generado es: " + numAleat;
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
