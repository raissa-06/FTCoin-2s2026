import java.util.List;

// Contrato específico de Movimentacao: o CRUD genérico mais a consulta por carteira.
public interface MovimentacaoDAO extends DAO<Movimentacao, Integer> {

    List<Movimentacao> consultarPorCarteira(int idCarteira);
}

// Exceção de domínio: lançada quando uma regra de negócio é violada.
public class ValidacaoException extends RuntimeException {

    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}