public class Equipamento {
    private String Tipo;
    private int CodEquip;
    private String descricao;
    private int numEquip;

    Equipamento(String Tipo, int CodEquip, String descricao, String HistEquip, int numEquip) {
        this.CodEquip = CodEquip;
        this.Tipo = Tipo;
        this.descricao = descricao;
        this.numEquip = numEquip;
    }
}
