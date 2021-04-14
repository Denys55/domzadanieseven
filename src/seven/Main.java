package seven;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];

        shape[0] = new Circle();
        shape[1] = new Quad();
        shape[2] = new Rhombus();
        shape[3] = new Triangle();
        shape[4] = new Rectangle();

        for(Shape s : shape){
            System.out.println(s.name());
        }

        TheName getName = new TheName();
        String name1 = getName.Name(shape[2]);
        System.out.println(name1);


    }
}
