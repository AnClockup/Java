/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada; //biblioteca

/**
 *
 * @author varja
 */
import javax.swing.JOptionPane; //biblioteca

public class Tabuada { //biblioteca
    public static void main(String[] args) { //declaração das variáveis
        for (int i = 6; i <= 10; i++) { //laço de repetição
            JOptionPane.showMessageDialog(null, "Tabuada do " + i + ":"); //saída de dados
            for (int j = 1; j <= 10; j++) { //laço de repetição
                JOptionPane.showMessageDialog(null, i + " x " + j + " = " + (i * j)); //saída de dados
            } // fim da exibição
        } //fim do laço
    } //fim do main
    
} //fim da classe
