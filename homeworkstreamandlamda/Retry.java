package homeworkstreamandlamda;

import java.util.ArrayList;
import java.util.List;

public class Retry {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        {
            studentList.add(new Student("nam",21,10D,10D));
            studentList.add(new Student("thang",20,8D,9D));
            studentList.add(new Student("hiep",21,7D,7D));
            studentList.add(new Student("cong",24,4D,3D));
            studentList.add(new Student("duc",22,9D,10D));
            studentList.add(new Student("quan",19,7D,6D));
            studentList.add(new Student("tan",20,6D,3D));
            studentList.add(new Student("thinh",29,8D,7D));
        }
        System.out.println(studentList);
        System.out.println("---------------------------------");
        System.out.println("danh sach sinh vien co diem trung binh < 5 la: ");

        studentList.stream()
                .filter(student -> (student.getMathScore() + student.getHistoryScore()) / 2 < 5)
                .forEach(student -> System.out.println(student));
        System.out.println("---------------------------------");
        System.out.println("danh sach sinh vien co diem toan > 5 va diem su < 7 la: ");

        studentList.stream()
                .filter(student -> student.getMathScore() > 5 && student.getHistoryScore() < 7)
                .forEach(student -> System.out.println(student));
        System.out.println("---------------------------------");
        System.out.println("danh sach sinh vien co tong diem tren 17 la: ");

        studentList.stream()
                .filter(student -> (student.getMathScore() + student.getHistoryScore()) > 17  )
                .forEach(student -> System.out.println(student));
        System.out.println("---------------------------------");
        System.out.println("Duyệt bỏ qua 2 học viên đầu tiên và 2 học sinh cuối cùng: ");

        studentList.stream()
                .skip(2)
                .limit(4)
                .forEach(student -> System.out.println(student));
        System.out.println("---------------------------------");
        System.out.println("Duyệt bỏ qua 2 học viên đầu tiên và 2 học sinh cuối cùng, và in ra màn hình các học sinh có age > 20 và < 25 tuổi:");

        studentList.stream()
                .skip(2)
                .limit(4)
                .filter(student -> 20 < student.getAge() && student.getAge() < 25)
                .forEach(student -> System.out.println(student));
        System.out.println("---------------------------------");
        System.out.println("sinh vien dep trai nhat: ");

        studentList.stream()
                .filter(student -> student.getName() == "nam"  )
                .forEach(student -> System.out.println(student.getName()));
    }

}
