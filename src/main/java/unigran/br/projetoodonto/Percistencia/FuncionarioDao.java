
package unigran.br.projetoodonto.Percistencia;

import java.util.List;
import unigran.br.projetoodonto.Classes.Funcionario;
import unigran.br.projetoodonto.Percistencia.Dao;


public interface FuncionarioDao extends InterfaceDao{
    public  List listarbyNome(String nome);
    public Funcionario existePaci(String nome);
}
