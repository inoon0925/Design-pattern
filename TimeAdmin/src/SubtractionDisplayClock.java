public class SubtractionDisplayClock implements TimeAdmin{
    private int countDownValue = 1000;

    public void update(Subject subject) {
        --countDownValue;
        System.out.println(countDownValue);
    }
}