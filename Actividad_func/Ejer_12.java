import javax.swing.JOptionPane;

public class Ejer_12 {
    public static void main(String[] args) {
        int num = 0;
        String Mnsj = "";
        int cantDivN = 0;

        Mnsj = "Ingrese un numero para encontrar la cantidad de divisores";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        cantDivN = Funciones.cantDivisoresNeg(num);
        Mnsj = ("La cantidad de divisores de su número es: " + cantDivN);
        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
