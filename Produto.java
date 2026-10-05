public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;

        setPreco(preco); 
        
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Erro: A quantidade inicial em estoque não pode ser negativa. Definida como 0.");
            this.quantidadeEstoque = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço do produto não pode ser negativo!");
        }
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas. Estoque atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Erro: A quantidade para adicionar deve ser maior que zero.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade para remover deve ser maior que zero.");
        } else if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas. Estoque atual: " + this.quantidadeEstoque);
        } else {
            System.out.println("Erro: Estoque insuficiente! Operação cancelada. Estoque atual: " + this.quantidadeEstoque);
        }
    }
}