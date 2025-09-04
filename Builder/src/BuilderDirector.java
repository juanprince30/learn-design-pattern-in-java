public class BuilderDirector {
    private BurgerBuilder burgerBuilder;

    public void setBurgerBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public void constructBurger(){
        this.burgerBuilder.buildBread();
        this.burgerBuilder.buildMeat();
        this.burgerBuilder.buildCheese();
        this.burgerBuilder.buildVegetable();
        this.burgerBuilder.buildSauce();
        this.burgerBuilder.buildDrink();
    }
}
