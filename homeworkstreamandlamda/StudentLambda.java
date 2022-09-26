package homeworkstreamandlamda;

public class StudentLambda {
    private String name;
    private int age;

    public StudentLambda() {
    }

    public StudentLambda(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "StudentLambda{" +
                " name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
