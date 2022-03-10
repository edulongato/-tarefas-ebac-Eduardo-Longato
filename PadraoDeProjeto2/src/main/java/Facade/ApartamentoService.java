package Facade;

public class ApartamentoService implements IApartamentoService{

    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {

        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastrado && !isCamposValidos){
            return false;
        }

        return null;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento){
        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento){
        return true;
    }
}
