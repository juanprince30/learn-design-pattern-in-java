public class CheeseBurgerBuilder implements BurgerBuilder{
    public Burger burger=new Burger();
    @Override
    public void buildCheese() {
        burger.setCheese("Fromage Chedahh");
    }

    @Override
    public void buildBread() {
        burger.setBread("Pain au Sesame");
    }

    @Override
    public void buildDrink() {
        burger.setDrink("Coca Cola");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Ketchup et Moutarde");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Viande de Boeuf");
    }

    @Override
    public void buildVegetable() {
        burger.setVegetabe("Ognion, tomates, feuille de lecture");
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
