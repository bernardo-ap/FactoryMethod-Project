package factorymethod;

public class ServicoBRL implements IServico {
    public String comprar() {
        return "Moeda BRL comprada!";
    }

    public String vender() {
        return "Moeda BRL vendida!";
    }
}
