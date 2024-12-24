public class ComplexText {
    public static void main(String[] args) {
        Complex complex1 = new Complex();
        complex1.Adding(12, 30);
        complex1.Subtracting(10, 20);
        System.out.println("Complex1 number = "+complex1.Printing());
        Complex complex2 = new Complex(40.5,60.8);
        complex2.Adding(15.5, 40.2);
        complex2.Subtracting(10.9, 150);
        System.out.println("Complex2 number = "+complex2.Printing());
    }
}
