public class ClassA {
    private int x = 0;
    public ClassA(int x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "A x="+x;
    }
}
