package TemplateMethod;

public class Bombeiro extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como bombeiro");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantar as 8h");
    }
}
