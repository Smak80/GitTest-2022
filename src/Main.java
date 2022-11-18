public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Значение класса A:");
        ClassC c = new ClassC();
        String w = "Максим лучший командир!!!";
        c.Maksim(w);
        ClassA a = new ClassA(3);
        System.out.println(a);
    }
}
