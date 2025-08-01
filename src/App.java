public class App {
    public static void main(String[] args) throws Exception {
        
        AbstractShape abstractShape = new Circle(5);
        System.out.println(abstractShape.getName());
        abstractShape.display();

        abstractShape = new Rectangle(4, 6);
        System.out.println(abstractShape.getName());
        abstractShape.display();

        Box<AbstractShape> shapeBox = new Box<>();
        
        shapeBox.setItem(new Circle(5));
        AbstractShape boxShape = shapeBox.getItem();
        System.out.println(boxShape.getName());
        boxShape.display();

        shapeBox.setItem(new Rectangle(4, 6));
        boxShape = shapeBox.getItem();
        System.out.println(boxShape.getName());
        boxShape.display();
    }

}
