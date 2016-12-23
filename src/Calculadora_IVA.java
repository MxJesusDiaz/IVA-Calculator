
/*
 *  Example  created by MxJesusDiaz on 22/12/16 04:19 PM
 */

import javax.swing.*;

public class Calculadora_IVA {
    public static void main(String[] args){

        //Declaramos una variable constante ya que el "IVA" no cambiara.
        final double IVA = 0.16;



        String valor = JOptionPane.showInputDialog("Introduce el valor del producto.");
        double precio = Double.parseDouble(valor);

        double PrecioFinal = precio+(precio*IVA);

        JOptionPane.showMessageDialog(null ,"El precion del producto mas el IVA es igual a: " +PrecioFinal );

    }
}
