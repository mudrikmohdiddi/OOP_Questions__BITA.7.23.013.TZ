public class RationalText {
    public static void main(String[] args) {
        Rational rational1 = new Rational();
        System.out.println("Rational1 ");
        System.out.println("Rational number = "+rational1.PrintingRational());
        System.out.println("Rational number = "+rational1.PrintingFloating());
        System.out.println("When add 3/8");
        rational1.AddingRational(3, 8);
        System.out.println("Rational number = "+rational1.PrintingRational());
        System.out.println("Rational number = "+rational1.PrintingFloating());
        rational1.SubtractingRational(5, 7);
        System.out.println("When minus 5/7");
        System.out.println("Rational number = "+rational1.PrintingRational());
        System.out.println("Rational number = "+rational1.PrintingFloating());
        rational1.MultiplyingRational(56, 81);
        System.out.println("When .Multiply 56/81");
        System.out.println("Rational number = "+rational1.PrintingRational());
        System.out.println("Rational number = "+rational1.PrintingFloating());
        rational1.DividingRational(50, 27);
        System.out.println("When Divid 50/27");
        System.out.println("Rational number = "+rational1.PrintingRational());
        System.out.println("Rational number = "+rational1.PrintingFloating());

        Rational rational2 = new Rational(22,85);
        System.out.println("\nRational2 ");
        System.out.println("Rational number = "+rational2.PrintingRational());
        System.out.println("Rational number = "+rational2.PrintingFloating());
        System.out.println("When add 3/8");
        rational2.AddingRational(3, 8);
        System.out.println("Rational number = "+rational2.PrintingRational());
        System.out.println("Rational number = "+rational2.PrintingFloating());
        rational2.SubtractingRational(5, 7);
        System.out.println("When minus 5/7");
        System.out.println("Rational number = "+rational2.PrintingRational());
        System.out.println("Rational number = "+rational2.PrintingFloating());
        rational2.MultiplyingRational(56, 81);
        System.out.println("When .Multiply 56/81");
        System.out.println("Rational number = "+rational2.PrintingRational());
        System.out.println("Rational number = "+rational2.PrintingFloating());
        rational2.DividingRational(50, 27);
        System.out.println("When Divid 50/27");
        System.out.println("Rational number = "+rational2.PrintingRational());
        System.out.println("Rational number = "+rational2.PrintingFloating());
    }
}
