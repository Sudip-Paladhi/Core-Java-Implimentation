package CoreJava;

class A {
    void StudentName() {
        System.out.println("Name is sudip");
    }
}

class b extends A {
    void StudentName() {
        System.out.println("Name is Srijani");
    }
}

class c extends A {
    void StudentName() {
        System.out.println("Name is Sattwik");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        A a1 = new A();
        a1.StudentName();

        b b1 = new b();
        b1.StudentName();

        c c1 = new c();
        c1.StudentName();

    }
}