import java.util.ArrayList;

public class Order {
    private String name;
    private boolean isReady;
    private ArrayList<Item> items;


    // constructor default
    public Order(){
        this.name = "guest";
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    // constructor with name
    public Order(String name){
        this.name = name;
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }

    // methods
    public String getName() {
        return this.name;
    }
    public boolean getIsReady() {
        return this.isReady;
    }
    public ArrayList<Item> getItems() {
        return this.items;
    }
    //
    public void setName(String name){
        this.name = name;
    }
    public void setIsReady(boolean isReady){
        this.isReady = isReady;
    }
    // add otems
    public void addItem(Item item){
        this.items.add(item);
    }
    // status message
    public String getStatusMessage() {
        if (this.isReady) {
            return "Your order is ready";
        }else{
            return "Thank for waiting. Your order will be ready at soon.";
        }
    }
    // display
    public void display() {
        System.out.println("customer name: " + this.name);
        double total = 0;
        for (Item item : this.items) {
            System.out.printf("%s : $%.2f\n",item.getName(),item.getPrice());
            total += item.getPrice();
        }
        System.out.printf("total: $%.2f\n",total);
        System.out.println(this.getStatusMessage());
    }
}