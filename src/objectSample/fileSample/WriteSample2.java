package objectSample.fileSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class WriteSample2 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(Arrays.asList(
                "相澤凜,女,1996-08-22",
                "伊藤樹,男,2002-02-07",
                "上野詩,女,1984-04-15",
                "遠藤蓮,男,1974-11-27",
                "太田紬,女,1968-01-23"
        ));

        Path path = Paths.get("src", "objectSample", "fileSample", "output2.csv");
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#newBufferedWriter(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
        https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/StandardOpenOption.html#APPEND
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {//appendは実行されるたびに末尾に追加されていく
            for (String line:data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}