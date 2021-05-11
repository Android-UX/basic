package ex.ex13;

class Ex13 {
    public static void main(String[] args) {
        //Employeeクラスのインスタンスを作る
        Employee employee = new Employee(1,"岡村","女",16);
        //表示する　テストして動かす
        System.out.println(employee);
        employee.setSales(1,500);
        employee.setSales(2,300);
        employee.setSales(3,200);
        employee.setSales(4,600);
        employee.setSales(5,100);
        employee.setSales(6,400);
        employee.setSales(7,1000);
        employee.setSales(8,100);
        employee.setSales(9,200);
        employee.setSales(10,700);
        employee.setSales(11,800);
        employee.setSales(12,300);

        System.out.println(employee.getSales(1));
        System.out.println(employee.getSum());
        System.out.println(employee.getAve());
        System.out.println(employee.getAllSales());
    }
}

