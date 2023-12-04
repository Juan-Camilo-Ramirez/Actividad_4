import javax.swing.JOptionPane;

public class Ejer_19 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;
        int primorial = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        primorial = Funciones.Primorial(num);
        Mnsj = "EL primorial de este numero es: " + primorial;
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
