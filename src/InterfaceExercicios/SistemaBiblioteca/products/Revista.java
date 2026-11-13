package InterfaceExercicios.SistemaBiblioteca.products;

import InterfaceExercicios.SistemaBiblioteca.services.ItemBiblioteca;

public class Revista extends ItemBiblioteca {
    @Override
    public Integer prazoDias() {
        return 7;
    }

    @Override
    public Double multaPorDia() {
        return 1.0;
    }

    @Override
    public double calcularMulta(int diasComItem) {
        return super.calcularMulta(diasComItem);
    }
}
