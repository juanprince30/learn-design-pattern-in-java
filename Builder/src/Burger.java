public class Burger {
    private String Bread;
    private String Meat;
    private String Cheese;
    private String Vegetabe;
    private String Sauce;
    private String Drink;

    public Burger(){
        this.Bread=null;
        this.Meat=null;
        this.Cheese=null;
        this.Vegetabe=null;
        this.Sauce=null;
        this.Drink=null;

    }

    public String getBread() {
        return Bread;
    }

    public String getCheese() {
        return Cheese;
    }

    public String getDrink() {
        return Drink;
    }

    public String getSauce() {
        return Sauce;
    }

    public String getMeat() {
        return Meat;
    }

    public String getVegetabe() {
        return Vegetabe;
    }

    public void setBread(String bread) {
        Bread = bread;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public void setVegetabe(String vegetabe) {
        Vegetabe = vegetabe;
    }

    public void setSauce(String sauce) {
        Sauce = sauce;
    }
}
