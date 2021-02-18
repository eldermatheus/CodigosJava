package estudodirigido;

import java.util.Scanner;
import java.util.ArrayList;
import estudodirigido.Carro;
import estudodirigido.Moto;
import estudodirigido.Onibus;
import estudodirigido.Veiculo;

public class AppLocadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		ArrayList<Veiculo> Veiculo = new ArrayList();
		int resp = 1;

		while (resp != 9) {
			System.out.println("1 - Incluir um Veículo");
			System.out.println("2 - Incluir uma Moto");
			System.out.println("3 - Incluir um Carro");
			System.out.println("4 - Incluir um Ônibus");
			System.out.println("5 - Listar veículos cadastrados");
			System.out.println("9 - Sair");
			System.out.println("");
			resp = ler.nextInt();

			if (resp == 1) {
				// Atributos Veículo
				System.out.println("Placa :");
				String placa = ler.next();
				System.out.println("Ano Fabricação: ");
				int anoFabricacao = ler.nextInt();
				System.out.println("Ano Modelo: ");
				int anoModelo = ler.nextInt();
				System.out.println("Cor: ");
				String cor = ler.next();
				System.out.println("Chassi: ");
				String chassi = ler.next();
				System.out.println("Quilometragem: ");
				int quilometragem = ler.nextInt();
				System.out.println("Valor Diária: ");
				double valorDiaria = ler.nextDouble();
				Veiculo.add(new Veiculo(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria));
			}

			if (resp == 2) {
				// Atributos Moto
				System.out.println("Placa :");
				String placa = ler.next();
				System.out.println("Ano Fabricação: ");
				int anoFabricacao = ler.nextInt();
				System.out.println("Ano Modelo: ");
				int anoModelo = ler.nextInt();
				System.out.println("Cor: ");
				String cor = ler.next();
				System.out.println("Chassi: ");
				String chassi = ler.next();
				System.out.println("Quilometragem: ");
				int quilometragem = ler.nextInt();
				System.out.println("Valor Diária: ");
				double valorDiaria = ler.nextDouble();

				System.out.println("Tipo Moto: ");
				String tipoMoto = ler.next();
				System.out.println("Tipo Corrente: ");
				String tipoCorrente = ler.next();

				Veiculo.add(new Veiculo(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria));
			}

			if (resp == 3) {
				// Atributos Carro
				System.out.println("Placa :");
				String placa = ler.next();
				System.out.println("Ano Fabricação: ");
				int anoFabricacao = ler.nextInt();
				System.out.println("Ano Modelo: ");
				int anoModelo = ler.nextInt();
				System.out.println("Cor: ");
				String cor = ler.next();
				System.out.println("Chassi: ");
				String chassi = ler.next();
				System.out.println("Quilometragem: ");
				int quilometragem = ler.nextInt();
				System.out.println("Valor Diária: ");
				double valorDiaria = ler.nextDouble();

				System.out.println("Tipo Carro: ");
				String tipoCarro = ler.next();
				System.out.println("Porta Malas: ");
				int portaMalas = ler.nextInt();

				Veiculo.add(new Veiculo(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria));
			}

			if (resp == 4) {
				// Atributos Onibus
				System.out.println("Placa :");
				String placa = ler.next();
				System.out.println("Ano Fabricação: ");
				int anoFabricacao = ler.nextInt();
				System.out.println("Ano Modelo: ");
				int anoModelo = ler.nextInt();
				System.out.println("Cor: ");
				String cor = ler.next();
				System.out.println("Chassi: ");
				String chassi = ler.next();
				System.out.println("Quilometragem: ");
				int quilometragem = ler.nextInt();
				System.out.println("Valor Diária: ");
				double valorDiaria = ler.nextDouble();

				System.out.println("Tipo Onibus: ");
				String tipoOnibus = ler.next();
				System.out.println("Janelas: ");
				int janelasEmergencia = ler.nextInt();

				Veiculo.add(new Veiculo(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria));
			}

			if (resp == 5) {
				for (Veiculo v : Veiculo) {
					System.out.println(
							v.getPlaca()  + " "
							+ v.getAnoFabricacao() + " "
							+ v.getanoModelo() + " "
							+ v.getCor() + " "
							+ v.getChassi() + " "
							+ v.getQuilometragem() + " " 
							+ v.getValorDiaria());
				}
			}

		}
		ler.close();
	}
}
