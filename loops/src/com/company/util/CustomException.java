package com.company.util;

public class CustomException extends Exception {
    int statusCode;

// --Commented out by Inspection START (12/21/2021 7:20 PM):
//    public CustomException(String message, int statusCode) {
//        super(message);
//        this.statusCode = statusCode;
//    }
// --Commented out by Inspection STOP (12/21/2021 7:20 PM)

    public int getStatusCode() {
        return statusCode;
    }


}