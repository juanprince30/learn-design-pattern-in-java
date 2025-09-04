public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! My Programme Starts here");
        BuilderDirector director= new BuilderDirector();

        //build cheeseburger
        BurgerBuilder cheeseBurgerBuilder= new CheeseBurgerBuilder();
        director.setBurgerBuilder(cheeseBurgerBuilder);
        director.constructBurger();

        Burger cheeseBurger=cheeseBurgerBuilder.getBurger();
        System.out.println("Vegetables: "+cheeseBurger.getVegetabe());
        System.out.println("Cheese: "+cheeseBurger.getCheese());
        System.out.println("Drink: "+cheeseBurger.getDrink());
        System.out.println("Sauce: "+cheeseBurger.getSauce());
        System.out.println("Bread: "+cheeseBurger.getBread());
        System.out.println("Meat: "+cheeseBurger.getMeat());

        //build vegan burger
        BurgerBuilder veganBurgerBuilder= new VeganBurgerBuilder();
        director.setBurgerBuilder(veganBurgerBuilder);
        director.constructBurger();

        Burger veganBurger=veganBurgerBuilder.getBurger();
        System.out.println("\n\nVegetables: "+veganBurger.getVegetabe());
        System.out.println("Cheese: "+veganBurger.getCheese());
        System.out.println("Drink: "+veganBurger.getDrink());
        System.out.println("Sauce: "+veganBurger.getSauce());
        System.out.println("Bread: "+veganBurger.getBread());
        System.out.println("Meat: "+veganBurger.getMeat());


    }
}