package org.example;

public class ServicoBancoSaque implements IServicoBanco {
    public String executar() {
        return "Saque realizado";
    }

    public String cancelar() {
        return "Saque cancelado";
    }
}