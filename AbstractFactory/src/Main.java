public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world, programme start here!");
        FurnitureFactory modernfactory= new ModernFurnitureFactory();
        Chair modernchair=modernfactory.createChair();
        Sofa modernsofa=modernfactory.createSofa();
        modernsofa.lie_on();
        modernchair.sit_on();

        FurnitureFactory victorainfactory= new VictorianFurnitureFactory();
        Chair victorianChair=victorainfactory.createChair();
        Sofa victorianSofa=victorainfactory.createSofa();
        victorianSofa.lie_on();
        victorianChair.sit_on();
    }
}