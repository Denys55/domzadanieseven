package seven;

public abstract class Shape {

    private String name;

    abstract String name();

    @Override
    public String toString() {
        return name;
    }
}
