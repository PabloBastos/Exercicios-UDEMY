package InterfaceExercicios.services;

public interface OnlinePaymentService {
    Double payment_FEE(Double amount);
    Double interest(Double amount, Integer months);
}
