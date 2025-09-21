public class LightOnCommande implements Command{
    private Light light;

    public LightOnCommande(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        if(light!=null){
            light.On();
        }
    }
}
