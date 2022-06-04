package database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
    private static final String database = "cliente.txt";

    public static String read() {
        String conteudo = "";

        try {
            FileReader arq = new FileReader(database);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                System.out.println("Erro ao ler arquivo!");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo não encontrado!");
        }
        return conteudo;
    }

    public static boolean write(String texto) {

        try {
            FileWriter arq = new FileWriter(database);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
