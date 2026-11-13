package InterfaceExercicios.SistemaContratos.services;

import InterfaceExercicios.SistemaContratos.entities.Contract;
import InterfaceExercicios.SistemaContratos.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i=1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.payment_FEE(basicQuota + interest);

            double totalQuota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, totalQuota));
        }
    }
}
