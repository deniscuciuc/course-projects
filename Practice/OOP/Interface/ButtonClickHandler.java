package Interface;

class ButtonClickHandler implements  EventHandler{
    @Override
    public void execute() {
        System.out.println("Button clicked!");
    }
}
