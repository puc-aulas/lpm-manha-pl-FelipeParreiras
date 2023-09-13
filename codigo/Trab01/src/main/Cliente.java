package java;

public class Cliente {

    private String nome;
    private int cpf;
    private Aluguel[] aluguel;
    
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Aluguel[] getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel[] aluguel) {
		this.aluguel = aluguel;
	}
    public void imprimirCliente() {
		System.out.println("Nome do Cliente: "+ this.getNome());
		System.out.println("CPF do Cliente: "+ this.getCpf());
    }
}
