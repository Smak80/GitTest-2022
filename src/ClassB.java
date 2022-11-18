public class ClassB extends ClassA{
    private int y;
    public ClassB(int x, int y) {
        super(x);
        this.y = y;
    }

    @Override
    public java.lang.String toString() {
        return super.toString() + ", y="+y;
    }
}
