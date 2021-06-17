import java.io.*;

public class EscritaLeituraTeste {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("arquivo.txt"); // leitura de bytes
        Reader reader = new InputStreamReader(fileInputStream); // transforma byte em caractere
        BufferedReader bufferedReader = new BufferedReader(reader); // lê caracteres

        OutputStream outputStream = new FileOutputStream("arquivo2.txt"); // leitura de bytes
        Writer writer = new OutputStreamWriter(outputStream); // transforma byte em caractere
        BufferedWriter bufferedWriter = new BufferedWriter(writer); // lê caracteres


        String lerLinha = bufferedReader.readLine();

        while (lerLinha != null && !lerLinha.isEmpty()) {
            bufferedWriter.write(lerLinha);
            bufferedWriter.newLine();
            lerLinha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
