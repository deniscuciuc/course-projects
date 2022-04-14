package Interface;

public class ClickerTestApp {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}
