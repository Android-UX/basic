package objectSample.fileSample;

import objectSample.exceptionSample.original.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//CSV→Personのインスタンス
class DataConvert {
    public static void main(String[] args) {
        //ファイルの読み込み
        //読み込みファイルの場所を設定
        Path path = Paths.get("src","objectSample","fileSample","input.csv");
        List<String> readData = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String line = br.readLine();//ファイルから1行読み込む
            while (line != null) {
                readData.add(line);//ArrayListに追加
                line = br.readLine();//次行を読み込む
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String line:readData) System.out.println(line);

        //文字列→Personのインスタンス Mapping　関連付ける　紐づける
        List<Person> personList = new ArrayList<>();

        for (String line:readData){
            String[] splitData = line.split(",",3);//データを分割
            /*
            System.out.println(splitData[0]);
            System.out.println(splitData[1]);
            System.out.println(splitData[2]);
             */
            String name = splitData[0];
            Gender gender = null;
            if ("男".equals(splitData[1])){
                gender = Gender.MEN;
            }else if ("女".equals(splitData[1])){
                gender = Gender.WOMEN;
            }
            LocalDate birth = LocalDate.parse(splitData[2]);

            Person person = new Person(name,gender,birth);
            personList.add(person);
        }
        //ArrayListを作成して処理できるようにする
        for (Person p:personList) System.out.println(p);

        //年齢の降順でソート
        personList.sort(Comparator.comparing(Person::getAge, Comparator.reverseOrder()));

        System.out.println("年齢の降順");
        for (Person p:personList) System.out.println(p);
    }
}
