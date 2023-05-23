/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roleta;

/**
 *
 * @author ❣️🚀❣ ️Vitor de Jesus ❣️🚀❣️
 */
import javax.swing.JOptionPane;

public class Roleta {

    public static int number = 0;

    public static void main(String[] args) {
        // TODO code application logic here

        while (number != 50) {

            number = (int) (Math.random() * 100);
            System.out.println(number);
            JOptionPane.showMessageDialog(null, number);
        }

        JOptionPane.showMessageDialog(null, "Finalmente o numero sorteado foi " + number + ", parabens sua tortura acabou !");
    }

}
