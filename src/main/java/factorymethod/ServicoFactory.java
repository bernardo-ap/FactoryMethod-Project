package factorymethod;

public class ServicoFactory {
    public static IServico obterServico(String moeda) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Servico" + moeda);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }
}

