public class Real extends Moeda {

    public Real(double valor) {
        super(valor); // usa o construtor da classe mãe
    }

    @Override
    public void info() {
        System.out.println("Real: R$ " + valor);
    }

    @Override
    public double converter() {
        return valor; // Sem conversão, pois já está em real
    }
}
