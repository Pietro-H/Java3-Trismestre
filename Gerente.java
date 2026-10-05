public class Gerente extends Funcionario {
    private String departmento;

   
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario); 
        this.departmento = departamento;
    }
    public void gerenciar() {
        System.out.println("O gerente " + getNome() + " está gerenciando o departamento " + this.departmento + ".");
    }
    public String getDepartmento() {
        return departmento;
    }
    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }
}
