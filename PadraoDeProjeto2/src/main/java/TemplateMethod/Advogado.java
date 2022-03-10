package TemplateMethod;

public class Advogado extends Trabalhador{
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Advogado");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltando de carro para casa");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Indo de Uber");
    }

    @Override
    protected void iniciarRotina() {
        System.out.println("Iniciando rotina");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando as 9h");
    }

    @Override
    public void executar() {
        System.out.println("Advogado de trabalho remoto");
    }
}
