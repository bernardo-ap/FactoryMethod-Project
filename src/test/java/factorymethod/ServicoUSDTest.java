package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoUSDTest {
    @Test
    void deveExecutarCompra() {
        IServico servico = ServicoFactory.obterServico("USD");
        assertEquals("Moeda USD comprada!", servico.comprar());
    }

    @Test
    void deveExecutarVenda() {
        IServico servico = ServicoFactory.obterServico("BRL");
        assertEquals("Moeda BRL vendida!", servico.vender());
    }

}