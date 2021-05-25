package objectSample.fileSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//テキストファイルの読み込みその２　教科書の例 p235の上のソースが重要
class ReadSample2 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        //buffer　緩衝　少しずつ読み込む
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#newBufferedReader(java.nio.file.Path)
        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line = br.readLine();//1行ずつ処理する　重要なメソッド
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}