import javax.swing.JOptionPane;

public class Ejer_15 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;
        int sumdivisoresneg = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        sumdivisoresneg = Funciones.sumDivisoresNeg(num);
        Mnsj = "La suma de los divisores negativos de este numero son: " + sumdivisoresneg;
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
