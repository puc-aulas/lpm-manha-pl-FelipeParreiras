public class projeto1 {
    public static void main(String[] args) {

    }
}

class Equipamento {
    private String Tipo;
    private int CodEquip;
    private String descricao;
    private String HistEquip;
    private int numEquip;

    Equipamento(String Tipo, int CodEquip, String descricao, String HistEquip, int numEquip) {
        this.CodEquip = CodEquip;
        this.HistEquip = HistEquip;
        this.Tipo = Tipo;
        this.descricao = descricao;
        this.numEquip = numEquip;
    }
}

class Cliente {
    private String nome;
    private int CPF;
    private String CodCliente;
    private String HistPedidos;

    Cliente(String nome, int CPF, String CodCliente, String HistPedidos) {
        this.nome = nome;
        this.CPF = CPF;
        this.CodCliente = CodCliente;
        this.HistPedidos = HistPedidos;
    }

}

class Aluguel {
    private int idaluguel;
    private int dataini;
    private int datafim;
    private double valoraluguel;
    private int quantprod;

    Aluguel(int idaluguel, int dataini, int datafim, double valoraluguel, int quantprod) {
        this.idaluguel = idaluguel;
        this.dataini = dataini;
        this.datafim = datafim;
        this.valoraluguel = valoraluguel;
        this.quantprod = quantprod;
    }
}