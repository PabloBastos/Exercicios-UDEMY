package InterfaceExercicios.SistemaBiblioteca.products;

import InterfaceExercicios.SistemaBiblioteca.services.ItemBiblioteca;

public class Livro extends ItemBiblioteca {

    @Override
    public Integer prazoDias() {
        return 14;
    }

    @Override
    public Double multaPorDia() {
        return 0.50;
    }

    @Override
    public double calcularMulta(int diasComItem) {
        return super.calcularMulta(diasComItem);
    }
}
