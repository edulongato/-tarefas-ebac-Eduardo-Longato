package Facade;

public class Apartamento {

    private Long cod;
    private String end;

    public Apartamento(Long cod, String end) {
        this.cod = cod;
        this.end = end;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
