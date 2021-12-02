package Executavel;

public class SplitArray {
    public static void main(String[] args) {

        String text = "mauricio, historia, 90, 80, 82, 66";

        String[] valoresArray = text.split(",");

        System.out.println("Nome:" + valoresArray[0]);
        System.out.println("Materia:" + valoresArray[1]);
        System.out.println("Nota1:" + valoresArray[2]);
        System.out.println("Nota2:" + valoresArray[3]);
        System.out.println("Nota3:" + valoresArray[4]);
        System.out.println("Nota4:" + valoresArray[5]);


    }

}
