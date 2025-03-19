package org.example;

public class ServicoBancoDeposito implements IServicoBanco {
    public String executar() {
        return "Depósito realizado";
    }

    public String cancelar() {
        return "Depósito cancelado";
    }
}
