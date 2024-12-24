public class Invoice{
    private String number;
    private String description;
    private int quantity;
    private int price;
    public Invoice(String number,String description,int quantity,int price){
        this.number = number;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantity){
        if(quantity >= 0){
            this.quantity = quantity;
        }
        else{
            this.quantity = 0;
        }
    }
    public void setPrice(int price){
        if(price >= 0){
            this.price = price;
        }
        else{
            this.price = 0;
        }
    }
    public String getNumber(){
        return number;
    }
    public String getDescription(){
        return description;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getPrice(){
        return price;
    }
    public int getInvoiceAmount(){
        return price*quantity;
    }
}
