package InterfaceExercicios.SistemaBiblioteca.entities;

public class Aluno extends Usuario{

    @Override
    public Integer limiteItens() {
        return 3;
    }
}
