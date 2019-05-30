public enum Item {

    MARS(25, "mars"),
    TWIX(35, "twix"),
    BOUNTY(45, "bounty");

    private int price;
    private String name;

    Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price = " + price +
                ", name = '" + name + '\'' +
                '}';
    }
}
