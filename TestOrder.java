import java.util.ArrayList;

public class TestOrder  {
    public static void main(String[] args) {
        // creando una lista vacia de orders
        ArrayList<Order> orderList = new ArrayList<Order>();
        // creando el menu
        Item drip = new Item("Drip Coffee",2.75);
        Item latte = new Item("Cafe Latte",3.75);
        Item macha = new Item("mocca",3);
        Item capuccino = new Item("capuchinno",4);
        Item mocha = new Item("caramel Machiatto",5);
        System.out.println("///////////////////////////////////");
        System.out.println("Barista Menu:");
        System.out.println(drip.getItem());
        System.out.println(latte.getItem());
        System.out.println(macha.getItem());
        System.out.println(capuccino.getItem());
        System.out.println(mocha.getItem());

        // add orders guests
        Order order1 =  new Order();
        Order order2 =  new Order();
        //add named orders
        Order order3 = new Order("lee");
        Order order4 = new Order("noah");
        Order order5 = new Order("lyla");
        //add items ot orders
        order1.addItem(drip);
        order1.addItem(latte);
        order1.addItem(macha);

        order2.addItem(drip);
        order2.addItem(capuccino);
        order2.addItem(mocha);

        order3.addItem(drip);
        order3.addItem(latte);
        order3.addItem(mocha);

        order4.addItem(drip);
        order4.addItem(macha);
        order4.addItem(mocha);

        order5.addItem(latte);
        order5.addItem(capuccino);
        order5.addItem(mocha);
        //  status message
        order1.setIsReady(true);
        order5.setIsReady(true);

        // display
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // order list
        orderList.add(order1);
        orderList.add(order3);

        // printOrderList(orderList);
    }
    public static void printOrderList(ArrayList<Order> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.printf("order #%d ",i+1);
            orderList.get(i).display();
        }
    }
}