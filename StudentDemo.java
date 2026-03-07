class Student {

    String name;
    int age;
    int rollNo;

    Student() {
        name = "Unknown";
        age = 0;
        rollNo = 0;
    }

    Student(String name) {
        this.name = name;
        age = 0;
        rollNo = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        rollNo = 0;
    }

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age + " Roll No: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Anu");
        Student s3 = new Student("Sourabh", 20);
        Student s4 = new Student("Mizhi", 21, 15);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
