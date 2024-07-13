package produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeProdutos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		boolean registro = false;
		boolean nomeProdutc = false;
		boolean descrition = false;
		boolean preço = false;
		boolean qtd = false;

		String escolha;
		String ContemNumeros = "-?\\d+";
		String ApenasLetras = "^[a-zA-Z\\s]+$";
		String filtro = "[a-zA-Z0-9]+"; // expressão para validar se a String contém caracteres especiais

		System.out.println("************Sistema de cadastro de produto****************");
		System.out.println("******************* Mercadão E2E *************************");
		System.out.println("**********************************************************");
		System.out.println("");

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		ArrayList<Produto> Estoque = new ArrayList<Produto>();

		System.out.println("Insira o nome do Produto: ");

		while (!registro) {

			while (!nomeProdutc) {

				String nomeProduto = teclado.nextLine();
				if (nomeProduto.length() > 2 && !nomeProduto.isEmpty() && !nomeProduto.isBlank()) {
					System.out.println("Nome cadastrado com sucesso. ");

					while (!descrition) {
						System.out.println("Insira descrição do produto: ");
						String descrição = teclado.nextLine();
						if (descrição.length() > 4 && !descrição.isBlank() && !descrição.isEmpty()) {
							System.out.println("Descrição inserida com sucesso.");

							while (!preço) {
								System.out.println("Insira o preço do produto R$: ");
								String preço1 = teclado.nextLine();
								try {
									double valor = Double.parseDouble(preço1);
									System.out.println("Valor inserido com sucesso.");

									while (!qtd) {
										System.out.println("Insira a quantidade no estoque: ");
										String qtdUm = teclado.nextLine();
										try {
											int qttd = Integer.parseInt(qtdUm);
											Estoque.add(new Produto(nomeProduto, descrição, valor, qttd));
											System.out.println("Produto registrado com sucesso.");

											qtd = true;
										}

										catch (NumberFormatException e) {
											System.out.println("Tipo de dado invalido, insira novamente.");

										}

									}

								} catch (NumberFormatException e) {
									System.out.println("Insira um valor correto: ");
								}

								preço = qtd;

							}
						} else {
							System.out.println("Descrição invalida, precisa conter mais de 5 digitos");
						}

						descrition = preço;
					}

				} else {
					System.out.println("Nome do produto deve conter pelo menos 2 letras.");
				}

				nomeProdutc = descrition;

			}

			System.out.println("");
			System.out.println("Deseja cadastrar outro produto no estoque? Sim ou não");

			escolha = teclado.nextLine();
			if (escolha.equalsIgnoreCase("Sim")) {

				System.out.println("**********************************************************");
				System.out.println("************** Insira um novo produto ********************");
				System.out.println("**********************************************************");
				System.out.println("");

				System.out.println("Insira nome do Produto:");
				nomeProdutc = false;
				descrition = false;
				preço = false;
				qtd = false;

			} else {
				System.out.println("Obrigado pelo registro");
				registro = true;
			}

		}

		for (Produto produto : Estoque) {
		
			System.out.println(" ° " + produto);

		}

	}

}
