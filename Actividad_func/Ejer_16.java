import javax.swing.JOptionPane;

public class Ejer_16 {
    public static void main(String[] args) {
        String Mnsj = "";
        int num = 0;
        int sumdivisores = 0;

        Mnsj = "Ingrese un numero";
        num = Integer.parseInt(JOptionPane.showInputDialog(null, Mnsj));
        sumdivisores = Funciones.sumDivisores(num);

        Mnsj = "La suma de los divisores de este numero son: " + sumdivisores;

        JOptionPane.showMessageDialog(null, Mnsj);
    }

}
