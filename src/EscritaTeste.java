import java.io.*;

public class EscritaTeste {
    public static void main(String[] args) throws IOException {

        OutputStream outputStream = new FileOutputStream("arquivo2.txt"); // leitura de bytes
        Writer writer = new OutputStreamWriter(outputStream); // transforma byte em caractere
        BufferedWriter bufferedWriter = new BufferedWriter(writer); // lê caracteres

        bufferedWriter.write("Apenas um teste de escrita em arquivos!");
        bufferedWriter.newLine();
        bufferedWriter.write("Escrevendo na linha de baixo!");


        bufferedWriter.close();
    }
}
