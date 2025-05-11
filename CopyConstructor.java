package CoreJava;

public class CopyConstructor {
    String name;
    int marks;

    CopyConstructor(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    CopyConstructor(CopyConstructor c) {
        this.name = c.name;
        this.marks = c.marks;

    }

    void display() {
        System.out.println("Student name is: " + name + " Marks is : " + marks);
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor("sudip", 99);
        CopyConstructor c2 = new CopyConstructor(c1);
        c1.display();
        c2.display();
    }
}