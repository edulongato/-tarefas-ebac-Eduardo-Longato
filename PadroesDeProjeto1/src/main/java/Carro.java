public abstract class Carro {

    public Carro(CategoriaDoCarro model, Localizacao location){
        this.model = model;
        this.location = location;
    }

    public Carro(CategoriaDoCarro model){
        this.model = model;
    }

    protected abstract void construct();
    private CategoriaDoCarro model;
    private Localizacao location = null;

    public CategoriaDoCarro getModel() {
        return model;
    }

    public void setModel(CategoriaDoCarro model) {
        this.model = model;
    }

    public Localizacao getLocation() {
        return location;
    }

    public void setLocation(Localizacao location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Modelo- "+model + " Local de fabricacao: "+location+" \n";

    }
}
