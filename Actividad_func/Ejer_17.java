import javax.swing.JOptionPane;

public class Ejer_17 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esCompuesto(num))
            Mnsj = "el numero " + num + " si es compuesto ";
        else
            Mnsj = "el numero " + num + " no es compuesto ";

        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
