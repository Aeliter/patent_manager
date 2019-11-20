package com.suixingpay.log.logvalue;

public enum OPERATIONTYPE {

    NULLTYPE,

    UPDATA,

    DELETE,

    INSERT;

    public String getString() {
        switch (this) {
            case NULLTYPE:
                return "NULLTYPE";
            case INSERT:
                return "INSERT";
            case UPDATA:
                return "UPDATA";
            case DELETE:
                return "DELETE";
        }
        return "NULLTYPE";
    }
}
