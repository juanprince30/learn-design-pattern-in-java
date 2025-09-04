public class VeganBurgerBuilder implements BurgerBuilder{
    public Burger burger=new Burger();
    @Override
    public void buildCheese() {
        burger.setCheese("Fromage Suisse");
    }

    @Override
    public void buildBread() {
        burger.setBread("Pain");
    }

    @Override
    public void buildDrink() {
        burger.setDrink("Limonade");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Hummus");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Viande vegan");
    }

    @Override
    public void buildVegetable() {
        burger.setVegetabe("Comcombre, tomates, feuille de lecture, avocat");
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
