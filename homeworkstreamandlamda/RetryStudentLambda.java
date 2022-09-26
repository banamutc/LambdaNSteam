package homeworkstreamandlamda;
import java.util.ArrayList;
import java.util.List;
interface EditHuman {
    void edit(ArrayList<StudentLambda> people,String name, int age,int index);

}
interface DeleteHuman {
    void delete(ArrayList<StudentLambda> people, int index);
}
public class RetryStudentLambda {
    public static void main(String[] args) {
        ArrayList<StudentLambda> list = new ArrayList<>();
        StudentLambda student1 = new StudentLambda("nam", 22 );
        StudentLambda student2 = new StudentLambda("thang", 21);
        StudentLambda student3 = new StudentLambda("hiep", 21);
        StudentLambda student4 = new StudentLambda("cong", 25);
        StudentLambda student5 = new StudentLambda("duc", 19);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println("Danh sach: ");
        System.out.println(list);
        System.out.println("-----------------------------------------------");
        EditHuman editHuman = (people, name, age, index) -> {
            people.get(index).setName(name);
            people.get(index).setAge(age);
        };

        System.out.println("Danh sach sau khi sua la:");
        editHuman.edit(list, "hathang",19,2);
        System.out.println(list);
        System.out.println("-----------------------------------------------");
        DeleteHuman deleteHuman = (people, index) -> {
            people.remove(index);
        };

        System.out.println("Danh sach sau khi xoa la: ");
        deleteHuman.delete(list,1);
        System.out.println(list);
    }
}
