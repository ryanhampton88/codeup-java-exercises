import util.Input;

import java.util.HashMap;

public class GroceryListApp {

    public static void main(String[] args) {

        HashMap <String, Integer> groceries = new HashMap<>();

        System.out.println("Would you like to create a grocery list? Yes/No");

        Input groceryRequest = new Input();

        String groceryAnswer = groceryRequest.getStringAnswer();

        System.out.println(groceryAnswer);

        if (groceryAnswer.equalsIgnoreCase("Yes")) {
            System.out.println("What would you like to add a new item?");
            String addItemAnswer = groceryRequest.getStringAnswer();
            if (addItemAnswer.equalsIgnoreCase("Yes")){
                System.out.println("Choose the category you would like to shop:");
                System.out.printf("1. Dairy%n2. Meat%n3. Vegetables%n4. Frozen Foods%n5. Snacks%n");
                String itemSelection = groceryRequest.getStringAnswer();
                if (itemSelection.equals("1")) {
                    boolean shopping = true;
                    System.out.println("Enter an item from the 'Dairy' section:");
                    do {
                        String newItem = groceryRequest.getStringAnswer();
                        int numberOfItems = groceryRequest.getInt();
                        groceries.put(newItem, numberOfItems);
                        System.out.println("Would you like to add more items?");
                        String addMore = groceryRequest.getStringAnswer();
                        if (addMore.equalsIgnoreCase("no")) {
                            shopping = false;
                        }
                    } while (shopping);

                } else if (itemSelection.equals("2")) {
                    System.out.println("Enter an item from the Meat section:");
                }
            }

        }


    }






}
