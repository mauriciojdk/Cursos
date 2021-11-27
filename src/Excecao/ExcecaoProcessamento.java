package Excecao;

public class ExcecaoProcessamento extends Exception{

    public ExcecaoProcessamento(String erro){
        super("O erro foi: " + erro);
    }


}
