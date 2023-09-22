package factorymethod;

public class ServicoEUR implements IServico {
    public String comprar() {
        return "Moeda EUR comprada!";
    }

    public String vender() {
        return "Moeda EUR vendida!";
    }
}
