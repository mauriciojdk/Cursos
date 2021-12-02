package Executavel;

public class Matriz {
    public static void main(String[] args) {


        int notas[][] = new int[2][3];

        notas[0][0] = 11;
        notas[0][1] = 22;
        notas[0][2] = 33;

        notas[1][0] = 44;
        notas[1][1] = 55;
        notas[1][2] = 66;

        for (int poslinha = 0; poslinha < notas.length; poslinha++){

            for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++){

                System.out.println("Valor da matriz: " + notas[poslinha][poscoluna]);
            }

        }



    }
}
