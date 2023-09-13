package java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Felipe");
		cliente.setCpf(01);
		
		Equipamento equipamento = new Equipamento();
		equipamento.setIdEquip(01);
		equipamento.setDescricao("Pá de ferro feita para cavar");
		
		Equipamento equipamento2 = new Equipamento();
		equipamento2.setIdEquip(02);
		equipamento2.setDescricao("Carrinho de mão para transportar materiais");

		Scanner scan = new Scanner(System.in);

			System.out.println("Você gostaria de Alugar quantos Equipamentos?");
			int num = scan.nextInt();
			Aluguel[] alugueis = new Aluguel[num];
			for (int i = 0; i<num; i++){
				System.out.println("Insira as informações do aluguel " + (i+1));
				Aluguel a = new Aluguel();
				
				a.setIdaluguel(i);
							
				a.setCliente(cliente);
				
				System.out.println("Qual sera o equipamento? ");
				int oEquipamento = scan.nextInt();
				if(oEquipamento == 1) {
				a.setEquipamento(equipamento);
				}else {
				a.setEquipamento(equipamento2);
				}
				
				System.out.println("O aluguel vai durar quantos dias? ");
				int diasAlugados = scan.nextInt();
				a.setDiasAlugados(diasAlugados);
				
				System.out.println("O valor diario do aluguel? ");
				double valorDiario = scan.nextDouble();
				a.setValorDiario(valorDiario);
				
				System.out.println("O valor total do aluguel e de: " + a.calcularAluguel());
				alugueis[i]=a;
			}
			
			System.out.println("Você gostaria de ver o historico de alugueis?");
			int resposta = scan.nextInt();
			if(resposta == 1){
				for (int i = 0; i<num; i++){
					System.out.println("Informações do aluguel: " + (i+1));
					alugueis[i].imprirmirAluguel();
				}
			}
			
}}
