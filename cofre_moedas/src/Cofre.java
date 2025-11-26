import java.util.ArrayList;

public class Cofre {

    ArrayList<Moeda> lista = new ArrayList<>();

    public void adicionar(Moeda m) {
        lista.add(m);
    }

    public void remover(Moeda m) {

        // Procura uma moeda com mesmo tipo e valor
        for (int i = 0; i < lista.size(); i++) {
            Moeda atual = lista.get(i);

            // Verifica se é o mesmo tipo
            if (atual.getClass() == m.getClass()) {

                // Verifica se tem o mesmo valor
                if (atual.valor == m.valor) {
                    lista.remove(i);
                    System.out.println("Moeda removida!");
                    return;
                }
            }
        }

        System.out.println("Moeda não encontrada.");
    }

    public void listar() {
        if (lista.isEmpty()) {
            System.out.println("Cofre vazio.");
        } else {
            for (Moeda m : lista) {
                m.info();
            }
        }
    }

    public double totalEmReais() {
        double soma = 0;
        for (Moeda m : lista) {
            soma += m.converter();
        }
        return soma;
    }
}
