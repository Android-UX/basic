package ex.ex13;


class Ex132 {
    public static void main(String[] args) {
        Branch1 branch = new Branch1("モーニング娘`21 15期");

        //検索の実行
        System.out.println(branch.searchEmployee(1));
        System.out.println(branch.searchEmployee(4));
    }
}
