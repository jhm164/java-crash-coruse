
class Parent {
    private String name = "John";

    void setName(String name) {
        this.name = "Romen";

    }

    String getName() {
        return this.name;
    }

}

class Child extends Parent {

    String fetchName() {
        return super.getName();
    }

}

public class inheritance {

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("Name=" + (c.fetchName()));
    }
}
