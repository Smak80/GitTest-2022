public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Значение класса A:");
        ClassA a = new ClassA(3);
        System.out.println(a);
        System.out.println("Значение класса B:");
        ClassB b = new ClassB(5, 6);
        System.out.println(b);
    }
}
