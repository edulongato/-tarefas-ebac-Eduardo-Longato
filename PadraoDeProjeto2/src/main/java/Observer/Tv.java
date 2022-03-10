package Observer;

public class Tv implements Observer{


    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia via Tv. " + subject.toString());
    }


}
