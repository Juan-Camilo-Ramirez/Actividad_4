import javax.swing.JOptionPane;

public class Ejer_11 {
    public static void main(String[] args) {
        int num = 0;
        String Mnsj = "";
        int cantDivP = 0;

        Mnsj = "Ingrese un numero para encontrar la cantidad de divisores";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        cantDivP = Funciones.cantDivisoresPos(num);
        Mnsj = ("La cantidad de divisores de su número es: " + cantDivP);
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
