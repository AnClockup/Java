/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veloxcarrental; // biblioteca

import javax.swing.JOptionPane; // biblioteca

/**
 *
 * @author varja
 */
public class VeloxCarRental { // biblioteca

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // declaração variáveis
        
        String carModel = JOptionPane.showInputDialog("Digite o modelo do carro:"); //variável de entrada
        String qdiasString = JOptionPane.showInputDialog("Digite a quantidade de dias da locação:"); //variável de entrada
        String valordiariaString = JOptionPane.showInputDialog("Digite o valor da diária da locação:"); //variável de entrada
        String kmpecorridoString = JOptionPane.showInputDialog("Digite Km percorridos:"); //variável de entrada

        int rentalDays = Integer.parseInt(qdiasString); //declaração variável
        double valordiaria = Double.parseDouble(valordiariaString); //declaração variável
        double kmpecorrido = Double.parseDouble(kmpecorridoString);//declaração variável

        double totalCost = (rentalDays * valordiaria) + (kmpecorrido * 0.79); // cálculo

        JOptionPane.showMessageDialog(null, "Modelo do carro: " + carModel + 
                "\nValor total a pagar: R$" + totalCost); // texto apresentado
    } // fim do main
    
} // fim da classe
