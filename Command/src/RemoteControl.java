public class RemoteControl {
    private Command command= null;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        if(command !=null){
            command.execute();
        }
    }
}
