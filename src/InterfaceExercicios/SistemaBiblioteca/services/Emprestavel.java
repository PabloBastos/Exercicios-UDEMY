package InterfaceExercicios.SistemaBiblioteca.services;

public interface Emprestavel {
    public Integer prazoDias();
    public Double multaPorDia();

    default double calcularMulta(int diasComItem){
        if (diasComItem > prazoDias()){
            int diasAtraso = diasComItem - prazoDias();
            return diasAtraso * multaPorDia();
        }
        else{
            return 0;
        }
    }
}
