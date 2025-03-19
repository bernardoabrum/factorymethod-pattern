package org.example;

public class ServicoBancoTransferencia implements IServicoBanco {
    public String executar() {
        return "Transferência realizada";
    }

    public String cancelar() {
        return "Transferência cancelada";
    }
}
