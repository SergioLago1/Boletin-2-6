/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tarifa;
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("Prezo da Tarifa "));
        float pagado;
        pagado = Float.parseFloat(JOptionPane.showInputDialog("Cantidad Pagada "));
        float prezo;
        prezo = Float.parseFloat(JOptionPane.showInputDialog("Prezo do producto "));
        float desconto;
        int porcentaxe = 100;
    desconto= porcentaxe * (prezo - tarifa) / prezo;
    JOptionPane.showMessageDialog(null, "O desconto é de "+ desconto);
      System.out.println("O desconto é de "+ desconto);
    }
    
}
    
    

