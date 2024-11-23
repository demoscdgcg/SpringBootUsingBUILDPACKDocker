package com.example.Loan.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "loan")
public class Loan extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loanId;

    @Column(name="mobileNumber")
    private String mobileNumber;

    @Column(name="loanNumber")
    private String loanNumber;

    @Column(name="loanType")
    private String loanType;

    @Column(name = "totalLoan")
    private int totalLoan;

    @Column(name = "amountPaid")
    private int amountPaid;

    @Column(name="outstandingAmount")
    private int outStandingAmount;
}
