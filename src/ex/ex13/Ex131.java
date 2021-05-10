package ex.ex13;

import java.util.Comparator;
import java.util.List;

class Ex131 {
    public static void main(String[] args) {
        Branch branch = new Branch("アップフロント");
        System.out.println(branch.getName());
        List<Employee> employees = branch.getEmployees();
        for (Employee employee:employees) {
            System.out.println(
                    employee + " " + employee.getAllSales() +
                            " " + employee.getSum() +
                            " " + employee.getAve());
        }

        //支店合計の表示 やることを順番に日本語で考える　
        // 何を？主語が難しい　パズル　何をどうする？　目的のデータを取り出して出力する　フィールドはExcelの列みたいなの
        int sum = 0;
        for (Employee employee:employees) {
            sum+=employee.getSum();
        }
        System.out.println("支店合計の表示");
        System.out.println(branch.getName() + ":" + sum);

        //支店の上位３名の表示
        System.out.println("支店売上TOP3");
        employees.sort(Comparator.comparing(Employee::getSum,Comparator.reverseOrder()));
        for (int i = 0; i < 3; i++) {
            System.out.println(employees.get(i).getName() + ":" +
                    employees.get(i).getSum());
        }
    }
}