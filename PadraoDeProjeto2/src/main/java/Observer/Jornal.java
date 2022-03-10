package Observer;

public class Jornal implements Observer{


    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia via Jornal. " + subject.toString());
    }
}
