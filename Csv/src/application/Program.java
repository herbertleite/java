package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		// System.out.println("Enter file path: ");
		// String sourceFileStr = sc.nextLine();
		String sourceFileStr = "C:\\Users\\herbe\\Desktop\\csv.csv";

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();

		boolean success = new File(sourceFolderStr + "\\out").mkdir();//criando pasta no diretorio

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";//arquivo no diretorio

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {//

			String itemCsv = br.readLine();
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}
/*
 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
 * itens vendidos. Cada item possui um nome, preço unitário e quantidade,
 * separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
 * localizado em uma subpasta chamada "out" a partir da pasta original do
 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
 * (preço unitário multiplicado pela quantidade), conforme exemplo.
 */