package java;

public class Equipamento {

	private int idEquip;
	private String descricao;
	
	
	public int getIdEquip() {
		return idEquip;
	}
	public void setIdEquip(int idEquip) {
		this.idEquip = idEquip;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length() >= 5) {
		this.descricao = descricao;
	}else {
		throw new IllegalArgumentException("Descrição Invalida. Minimo 5 caracteres");
	}
	}
    public void imprimirEquipamento() {
		System.out.println("Id do Equipamento: "+ this.getIdEquip());
		System.out.println("Descrição do Equipamento: "+ this.getDescricao());
    }
}