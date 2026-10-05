public class main4 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", 8000.0, "Tecnologia");

        gerente.gerenciar();
        System.out.println("Salário antigo: R$ " + gerente.getSalario());
        gerente.aumentarSalario(10); 
        System.out.println("Novo salário após aumento: R$ " + gerente.getSalario());
    }
}


