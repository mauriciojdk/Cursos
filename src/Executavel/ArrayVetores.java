package Executavel;

import javax.swing.*;

public class ArrayVetores {
    public static void main(String[] args) {


        int posicoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições tera o array? "));

        double[] notas = new double[posicoes];

        for (int pos = 0; pos < notas.length; pos++){
            String valor = JOptionPane.showInputDialog("Digite o valor do array " + (pos + 1));
            notas[pos] = Double.parseDouble(valor);
        }

        for (int pos = 0; pos < notas.length; pos++){
            System.out.println("Nota " + (pos + 1) + " = " + notas[pos]);
        }
    }
}
