public interface BurgerBuilder {
    Burger burger= new Burger();

    default void buildBread(){

    }
    public default void buildMeat(){

    }
    public default void buildCheese(){

    }
    public default void buildSauce(){

    }
    public default void buildDrink(){

    }
    public default void buildVegetable(){

    }

    public default Burger getBurger() {
        return null;
    }

}
