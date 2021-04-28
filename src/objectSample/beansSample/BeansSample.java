package objectSample.beansSample;

import java.util.ArrayList;
import java.util.List;

//Beansの活用
class BeansSample {
    public static void main(String[] args) {
        List<StudentBean> list = new ArrayList<>();//データベースから読み込んだ時の配列をオブジェクトに変換
        //各項目のデータを用意する
        String name = "島倉";
        int grade = 1;
        int cl = 1;
        int no = 7;
        int jap = 85;
        int math = 69;
        int eng = 83;

        //Beansに追加する
        StudentBean studentBean = new StudentBean();//空のインスタンスを作る
        studentBean.setName(name);
        studentBean.setGrade(grade);
        studentBean.setCl(cl);
        studentBean.setNo(no);
        studentBean.setJap(jap);
        studentBean.setMath(math);
        studentBean.setEng(eng);
        list.add(studentBean);

    }
}
