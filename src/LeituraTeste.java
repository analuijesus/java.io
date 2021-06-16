import java.io.*;

public class LeituraTeste {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("arquivo.txt"); // leitura de bytes
        Reader reader = new InputStreamReader(fileInputStream); // transforma byte em caractere
        BufferedReader bufferedReader = new BufferedReader(reader); // lê caracteres

        String lerLinha = bufferedReader.readLine();

        while (lerLinha != null) {
            System.out.println(lerLinha);
            lerLinha = bufferedReader.readLine();
        }
        bufferedReader.close();

    }
}
