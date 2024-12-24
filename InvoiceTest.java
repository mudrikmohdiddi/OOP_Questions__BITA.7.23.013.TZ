public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Part 1","Car lorry",3,300);
        System.out.println("Patr number "+invoice.getNumber());
        System.out.println("Description "+invoice.getDescription());
        System.out.println("Quatities "+invoice.getQuantity());
        System.out.println("Price "+invoice.getPrice());
        System.out.println("Total amount "+invoice.getInvoiceAmount());
        System.out.println("When reset price to be 500 and Quatities -300");
        invoice.setQuantity(-300);
        invoice.setPrice(500);
        invoice.setDescription("Machine");
        invoice.setNumber("Part 2");
        System.out.println("Patr number "+invoice.getNumber());
        System.out.println("Description "+invoice.getDescription());
        System.out.println("Quatities "+invoice.getQuantity());
        System.out.println("Price "+invoice.getPrice());
        System.out.println("Total amount "+invoice.getInvoiceAmount());
    
    }
}
