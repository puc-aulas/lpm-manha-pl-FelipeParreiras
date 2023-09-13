package java;

public class Aluguel {

	private int idaluguel;
	private int diasAlugados;
	private double valorDiario;
	private Cliente cliente;
	private Equipamento equipamento;
	
//	public Aluguel(int idaluguel, int diasAlugados,double valorDiario,Cliente cliente,Equipamento equipamento) {
//		
//		this.idaluguel = idaluguel;
//		this.diasAlugados = diasAlugados;
//		this.valorDiario = valorDiario;
//		this.cliente = cliente;
//		this.equipamento = equipamento;
//	}
	
	public int getIdaluguel() {
		return idaluguel;
	}
	public void setIdaluguel(int idaluguel) {
		this.idaluguel = idaluguel;
	}
	public int getDiasAlugados() {
		return diasAlugados;
	}
	public void setDiasAlugados(int diasAlugados) {
		this.diasAlugados = diasAlugados;
	}
	public double getValorDiario() {
		return valorDiario;
	}
	public void setValorDiario(double valorDiario) {
		this.valorDiario = valorDiario;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public double calcularAluguel() {

		return this.valorDiario * this.diasAlugados;
		
	}
	public void imprirmirAluguel() {
		System.out.println("Id do aluguel: "+ this.getIdaluguel());
		System.out.println("Dias do aluguel: "+ this.getDiasAlugados());
		System.out.println("Valor diario do aluguel: "+ this.getValorDiario());
		this.cliente.imprimirCliente();
		this.equipamento.imprimirEquipamento();
	}
}
