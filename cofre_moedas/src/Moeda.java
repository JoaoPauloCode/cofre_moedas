// Classe mãe abstrata: serve de modelo para todas as moedas
public abstract class Moeda {
    double valor;

    // Construtor básico
    public Moeda(double valor) {
        this.valor = valor;
    }

    // Cada tipo de moeda mostra sua informação do seu jeito
    public abstract void info();

    // Cada moeda sabe como converter seu valor para Real
    public abstract double converter();
}
