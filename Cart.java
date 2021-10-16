package holiday_lights_ordering_portal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    public List<String> itemnamecart;
    public List<Integer> itempricecart;
    public Cart(){
        itemnamecart = new ArrayList<>();
        itempricecart = new ArrayList<>();
    }
    public void addItem(String item, int price, int quantity){
        for (int  i=0 ; i<quantity; i++){
            itemnamecart.add(item);
            itempricecart.add(price);
        }
    }
    public void getPlacedOrder(){
        int quantity = 1;
        for (int i = 0; i< itemnamecart.size(); i++){
            if(i != itemnamecart.size()-1) {
                if (itemnamecart.get(i).equals(itemnamecart.get(i + 1))) {
                    quantity++;
                }
                else{
                    System.out.println("Quantity: " + quantity + " " + "Item: " + itemnamecart.get(i) + " " + "Price: " + quantity* itempricecart.get(i));
                    quantity  = 1;
                }
            }
            else{
                System.out.println("Quantity: " + quantity + " " + "Item: " + itemnamecart.get(i) + " " + "Price: " + quantity* itempricecart.get(i));
                quantity  = 1;
            }
        }
        int totalprice = 0;
        for (int i = 0; i<itempricecart.size(); i++){
            totalprice = totalprice + itempricecart.get(i);
        }
        System.out.println("Total Item: " + itemnamecart.size() + " " +"Total Price: " + totalprice);
    }
    public void editOrder() {
        System.out.println("0) Exit");
        for (int i = 0; i < itemnamecart.size(); i++) {
            System.out.println((i + 1) + ") " + itemnamecart.get(i) + " " + itempricecart.get(i));
        }
        System.out.print("Which item do youu want to remove? Enter Option: ");
        Scanner s3 = new Scanner(System.in);
        int inp = s3.nextInt();
        if (inp != 0) {
            itemnamecart.remove(inp - 1);
            itempricecart.remove(inp - 1);
            int quantity = 1;
            for (int i = 0; i < itemnamecart.size(); i++) {
                if (i != itemnamecart.size() - 1) {
                    if (itemnamecart.get(i).equals(itemnamecart.get(i + 1))) {
                        quantity++;
                    } else {
                        System.out.println(quantity + " " + itemnamecart.get(i) + " " + quantity * itempricecart.get(i));
                        quantity = 1;
                    }
                } else {
                    System.out.println(quantity + " " + itemnamecart.get(i) + " " + quantity * itempricecart.get(i));
                    quantity = 1;
                }
            }
            System.out.println("Cart Updated");
        }
        else{
            System.out.println("Cart Updated");
        }
    }

}
