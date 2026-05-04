public class CarroBasico implements ICarro {

    public float preco;

    public CarroBasico(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return "Carro básico";
    }
}