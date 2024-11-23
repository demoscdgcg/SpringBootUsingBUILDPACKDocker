package com.example.Loan.controller;

import com.example.Loan.dto.LoanDto;
import com.example.Loan.dto.Result;
import com.example.Loan.iLoanService.ILoanService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/loan", produces = (MediaType.APPLICATION_JSON_VALUE))
@Tag(name = "loan", description = "APIs for managing customer accounts.")
public class LoanController {

    @Autowired
    private static final Logger LOGGER = LoggerFactory.getLogger(LoanController.class);

    @Autowired
    private ILoanService iLoanService;

    @Operation(
            summary = "Create a new loan",
            description = "This endpoint allows you to create a new loan by providing necessary details in the requstparam.",
            tags = {"loan"}
    )
    //http://localhost:7777/api/loan/create
    @PostMapping("/create")
    public Result createLoan(@RequestParam("mobileNumber") String mobileno) {
        Result loan = iLoanService.createLoan(mobileno);
        return loan;
    }


    @Operation(
            summary = "Get the loan by mobileno",
            description = "This endpoint allows you to fetch a new loan by providing necessary details in the requstparam.",
            tags = {"loan"}
    )
    //http://localhost:7777/api/loan/get
    @GetMapping("/get")
    public Result getLoanByMobileNo(@RequestParam("mobileno") String mobileNo) {
        Result result = iLoanService.featchLoan(mobileNo);
        return result;
    }


    @Operation(
            summary = "Get the loan by mobileno",
            description = "This endpoint allows you to update a new loan by providing necessary details in the requstparam.",
            tags = {"loan"}
    )
    //http://localhost:7777/api/loan/update
    @PutMapping("/update")
    public Result updateLoan(@RequestBody LoanDto loanDto, @RequestParam("mobileNO") String mobileNo) {
        Result result = iLoanService.updateLoan(loanDto, mobileNo);
        return result;
    }

    @Operation(
            summary = "Get the loan by mobileno",
            description = "This endpoint allows you to delete a new loan by providing necessary details in the requstparam.",
            tags = {"loan"}
    )
    //http://localhost:7777/api/loan/delete
    @DeleteMapping("/delete")
    public Result deleteLoan(@RequestParam("mobileno") String mobileNo) {
        Result result = iLoanService.deleteLoan(mobileNo);
        return result;
    }
}
