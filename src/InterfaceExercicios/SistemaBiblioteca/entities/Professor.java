package InterfaceExercicios.SistemaBiblioteca.entities;

public class Professor extends Usuario{
    @Override
    public Integer limiteItens() {
        return 5;
    }
}
