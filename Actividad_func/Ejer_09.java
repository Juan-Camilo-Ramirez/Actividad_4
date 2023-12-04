import javax.swing.JOptionPane;

public class Ejer_09 {
    public static void main(String[] args) {
        int num = 0;
        String Mnsj = "";
        int factorial = 0;

        Mnsj = "Ingrese un número para hallar el factorial";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        factorial = Funciones.factorial(num);
        Mnsj = ("El factorial de su número es: " + factorial);
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
