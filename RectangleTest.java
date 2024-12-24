public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 30);
        System.out.println("Length = "+rect.getLength());
        System.out.println("The width = "+rect.getWidth());
        System.out.println("Perimeter = "+rect.getPerimeter());
        System.out.println("Area = "+rect.getArea());
        System.out.println("When set length = 5 and width = 11");
        rect.setLength(5);
        rect.setWidth(11);
        System.out.println("Length = "+rect.getLength());
        System.out.println("The width = "+rect.getWidth());
        System.out.println("Perimeter = "+rect.getPerimeter());
        System.out.println("Area = "+rect.getArea());

    }
}
