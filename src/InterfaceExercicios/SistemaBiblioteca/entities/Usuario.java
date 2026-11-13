package InterfaceExercicios.SistemaBiblioteca.entities;

import InterfaceExercicios.SistemaBiblioteca.services.LimiteEmprestimo;

public abstract class Usuario implements LimiteEmprestimo {
    private String name;
    private int quantidadeEmprestada;
}
