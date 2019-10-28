class A extends B {
    String name = "a";

    public A() {
        System.out.println(this.name);
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        A a = new A();
    }
}