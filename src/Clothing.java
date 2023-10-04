class Clothing {
    public String type;
    public String color;
    public String size;


    public static void main(String[] args) {
        Clothing ryanOutfit = new Clothing();
        ryanOutfit.type = "Shirt";
        ryanOutfit.color = "Brown";
        ryanOutfit.size = "Large";
        System.out.printf("Ryan's %s is a size %s and the color is %s.%n", ryanOutfit.type, ryanOutfit.size, ryanOutfit.color);

        Clothing charlieOutfit = new Clothing();
        charlieOutfit.type = "Jersey";
        charlieOutfit.color = "Black";
        charlieOutfit.size = "Medium";
        System.out.printf("Charlie's %s is a size %s and the color is %s.%n", charlieOutfit.type, charlieOutfit.size, charlieOutfit.color);
    }
}

