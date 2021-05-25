package objectSample.fileSample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


//テキストファイルの読み込みその１　教科書に載っていない　大きなファイルを読み込むとメモリ不足になって失敗する　ストリーム処理ができていないので
class ReadSample1 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        try {
            //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#readAllLines(java.nio.file.Path)
            //小さなファイルを読み込む用　,で分割する　splitクラス
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line:lines) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}