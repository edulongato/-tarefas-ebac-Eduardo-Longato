package Observer;

public class WebSite implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a por website. " + subject.toString());
    }
}
