public class Som extends CarroDecorator {

    public Som(ICarro carro) {
        super(carro);
    }

    public float getPercentualPreco() {
        return 10.0f;
    }

    public String getNomeAdicional() {
        return "Som";
    }
}