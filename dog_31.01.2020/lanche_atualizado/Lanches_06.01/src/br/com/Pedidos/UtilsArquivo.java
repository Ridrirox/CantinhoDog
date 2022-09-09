package br.com.Pedidos;

import java.io.*;

/**
 *
 * @author kandrade
 */
public class UtilsArquivo {

	public static void salvar(String arquivo, String conteudo, boolean adicionar)
	throws IOException {
		FileWriter fw = new FileWriter(arquivo, adicionar);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(conteudo);
		pw.flush();
		pw.close();
	}

	public static String carregar(String arquivo)
	throws FileNotFoundException, IOException {

		File file = new File(arquivo);

		if (! file.exists()) {
			return null;
		}

		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		StringBuffer bufSaida = new StringBuffer();

		int c;
		while( (c = br.read()) > 1 ){
			bufSaida.append((char)c);
		}
		br.close();
		return bufSaida.toString();
	}

	public static void main(String[] args) {
		try {
			String texto = "Teste 12";

			UtilsArquivo.salvar("arquivo.txt", texto, false);

			String texto2 = "Teste 13";

			UtilsArquivo.salvar("arquivo.txt", texto2, true);

			texto = UtilsArquivo.carregar("arquivo.txt");

			texto2 = UtilsArquivo.carregar("arquivo.txt");

			System.out.println(texto);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}