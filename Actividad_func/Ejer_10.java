import javax.swing.JOptionPane;

public class Ejer_10 {
    public static void main(String[] args) {
        int num = 0;
        String Mnsj = "";
        int dbfact = 0;

        Mnsj = "Ingrese un número para hallar el doble factorial";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        dbfact = Funciones.dobleFactorial(num);
        Mnsj = ("El doble factorial de su número es: " + dbfact);
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
