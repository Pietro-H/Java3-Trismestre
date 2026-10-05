public class main4 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        
        p1.setPreco(-500); 
        
        
        p1.adicionarEstoque(5); 
        p1.removerEstoque(7);   
        
        
        p1.removerEstoque(20);  
    }
}

    

