package TemplateMethod;

public abstract class Trabalhador {

    public void executar(){
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();

    }

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa\n");
    }

    protected abstract void trabalhar();



    protected void irAoTrabalho() {
        System.out.println("Indo ao trabalho");
    }

    protected void iniciarRotina(){
        System.out.println("Iniciar rotina");
    }

    protected void levantar(){
        System.out.println("Levantando da cama");
    }
}
