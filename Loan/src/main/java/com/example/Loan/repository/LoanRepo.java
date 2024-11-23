package com.example.Loan.repository;

import com.example.Loan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoanRepo extends JpaRepository<Loan,Long> {
    Optional<Loan> findByMobileNumber(String mobileNumber);
}
