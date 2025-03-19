package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoBancoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("Emprestimo");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServicoBanco servico = ServicoBancoFactory.obterServicoBanco("AberturaConta");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
