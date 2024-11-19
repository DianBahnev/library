package com.learning.libraryManagerSpringBoot;

public class WhatHappensAtWork {

    public void setReason(int code) {
        this.reason = ValuesReasons.getEnumBasedOn(code);
    }

    public void setReasonString(int code){
        this.reasonString = ValuesReasons.getEnumBasedOn(code).getHumanReadableCode();
    }

    public ValuesReasons reason;

    public String reasonString;
}
