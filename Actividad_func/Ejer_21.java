import javax.swing.JOptionPane;

public class Ejer_21 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num1 = 0;
        int num2 = 0;

        Mnsj = "Ingrese un numero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        Mnsj = "Ingrese otro numero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        if (Funciones.sonAmigos(num1, num2)) {
            Mnsj = "los numeros " + num1 + " y " + num2 + " si son amigos ";
        } else {
            Mnsj = "los numeros " + num1 + " y " + num2 + " no son amigos ";
        }
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
