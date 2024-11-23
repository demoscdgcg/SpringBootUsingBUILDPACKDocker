package com.example.Loan.mapper;

import com.example.Loan.dto.LoanDto;
import com.example.Loan.model.Loan;

public class LoanMapper {

    public static Loan mapToLoan(LoanDto loanDto){
        Loan loan=new Loan();
        loan.setLoanType(loanDto.getLoanType());
        loan.setLoanNumber(loanDto.getLoanNumber());
        loan.setAmountPaid(loanDto.getAmountPaid());
        loan.setMobileNumber(loanDto.getMobileNumber());
        loan.setTotalLoan(loanDto.getTotalLoan());
        loan.setOutStandingAmount(loanDto.getOutstandingAmount());
        return loan;
    }

    public static LoanDto mpaToLoanDto(Loan loan){
        LoanDto loanDto=new LoanDto();
        loanDto.setLoanNumber(loan.getLoanNumber());
        loanDto.setLoanType(loan.getLoanType());
        loanDto.setAmountPaid(loan.getAmountPaid());
        loanDto.setMobileNumber(loan.getMobileNumber());
        loanDto.setOutstandingAmount(loan.getOutStandingAmount());
        loanDto.setTotalLoan(loan.getTotalLoan());
        return loanDto;
    }
}
