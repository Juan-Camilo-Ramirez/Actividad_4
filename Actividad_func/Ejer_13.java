import javax.swing.JOptionPane;

public class Ejer_13 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;
        int cantdiv = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        cantdiv = Funciones.cantDivisores(num);
        Mnsj = "La cantidad de divisores de este numero son: " + cantdiv;
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
