import javax.swing.JOptionPane;

public class Ejer_03 extends Base {
    public static void main(String[] args) {
        String Mnsj = "";
        int numero = 0;

        Mnsj = ("Ingresar el primer número para determinar si es par o impar");
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.esPar(numero)) {
            Mnsj = numero + " es par";
        } else {
            Mnsj = numero + " no es par";
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
