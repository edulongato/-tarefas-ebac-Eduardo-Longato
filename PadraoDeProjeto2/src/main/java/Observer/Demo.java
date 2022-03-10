package Observer;

public class Demo {
    public static void main(String[] args) {
        Jornalista tv = new Jornalista();
        tv.add(new Tv());
        tv.notifyAll("Via Tv");

        Jornalista jor = new Jornalista();
        jor.add(new Jornal());
        jor.notifyAll("Via jornal");

        Jornalista web = new Jornalista();
        web.add(new WebSite());
        web.notifyAll("Web site");

    }
}
