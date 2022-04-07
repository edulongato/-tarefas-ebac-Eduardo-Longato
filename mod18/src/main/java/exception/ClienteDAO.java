package exception;

public class ClienteDAO {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoException{
        boolean isCadastro = false;

        if (!isCadastro){
            throw new ClienteNaoEncontradoException("Cliente não foi encontrado");
        }
    }
}
