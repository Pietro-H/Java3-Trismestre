public class main2 {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);

        // Chamando o método da própria classe Carro
        meuCarro.exibirInfo();

        // Chamando o método herdado da classe Veiculo
        meuCarro.buzinar();
    }
}
