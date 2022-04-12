package com.employee_Payroll_Service;

public class PayrollServiceException extends Exception {
    enum ExceptionType{
        CONNECTION_PROBLEM, RETRIEVAL_PROBLEM;
    }

    ExceptionType type;
    PayrollServiceException(String message, ExceptionType type){
        super(message);
        this.type = type;
    }
}

