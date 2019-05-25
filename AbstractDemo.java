abstract class A{
    public abstract int b();
    // 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    // public abstract int c(){ System.out.println("Hello"); }
    public void d(){
        System.out.println("world");
    }
}

class B extends A{
    @Override
    public int b() {
        return 1;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // A obj = new A();
        B obj = new B();
    }
}
