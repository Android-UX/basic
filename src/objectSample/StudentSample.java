package objectSample;

public class StudentSample {
    public static void main(String[] args) {
        Student[] students = {
                new Student("にしだしおり",1,1,1 ),
                new Student("やまさきゆはね",2,2,2),
                new Student("まえだこころ",3,3,3),
        };

        for (Student student:students) {
            System.out.println(student);
        }
        }
}
