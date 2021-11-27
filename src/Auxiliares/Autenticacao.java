package Auxiliares;

import Interfaces.PermitirAcesso;

public class Autenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticarKey() {
        return permitirAcesso.autenticar();
    }

    public Autenticacao( PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }



}
