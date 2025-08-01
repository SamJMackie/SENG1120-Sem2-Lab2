public class App {
    public static void main(String[] args) throws Exception {
        
        Shape shape = new Circle(5);
        System.out.println("Circle Area: " + shape.area());
        System.out.println("Circle Perimeter: " + shape.perimeter());
        
        shape = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + shape.area());
        System.out.println("Rectangle Perimeter: " + shape.perimeter());
    }
}
