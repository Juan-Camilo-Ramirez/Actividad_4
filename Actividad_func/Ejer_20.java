import javax.swing.JOptionPane;

public class Ejer_20 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esPerfecto(num))
            Mnsj = "el numero " + num + " si es perfecto ";
        else
            Mnsj = "el numero " + num + " no es perfecto ";

        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
