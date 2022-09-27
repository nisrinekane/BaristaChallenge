public class Item {
    // constructor
    private String name;
    private double price;

    public Item(String name, double price){
        this.name=name;
        this.price=price;
    }
    // getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setPrice( Double price ){
        this.price = price;
    }
    public String getItem() {
        return String.format("drink: %s - price: $%.2f", this.name, this.price);
    }

}