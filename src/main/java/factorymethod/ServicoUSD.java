package factorymethod;

public class ServicoUSD implements IServico{
    public String comprar() {
        return "Moeda USD comprada!";
    }

    public String vender() {
        return "Moeda USD vendida!";
    }
}
