public class Inheritance {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.showParent();
        c.showChild();
        c.showParent();
    }
}

class Parent {

    public void showParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {

    public void showChild() {
        System.out.println("This is child class");
    }
}