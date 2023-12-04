import javax.swing.JOptionPane;

public class Ejer_18 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esPrimo(num))
            Mnsj = "el numero " + num + " si es primo ";
        else
            Mnsj = "el numero " + num + " no es primo ";

        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
