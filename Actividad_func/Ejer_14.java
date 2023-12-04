import javax.swing.JOptionPane;

public class Ejer_14 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;
        int sumdivisorespos = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        sumdivisorespos = Funciones.sumDivisoresPos(num);
        Mnsj = "La suma de los divisores positivos de este numero son: " + sumdivisorespos;
        JOptionPane.showMessageDialog(null, Mnsj);
    }
}
