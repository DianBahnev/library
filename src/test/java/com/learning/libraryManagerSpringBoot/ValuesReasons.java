package com.learning.libraryManagerSpringBoot;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum ValuesReasons {

    LOGIN_CONTEXT(0, "LoginContext"),
    ADMIN(1, "Admin"),
    RESET(2, "Reset"),
    UNKNOWN(-99, "UnknownStatus");

    private final int statusCode;

    private final String humanReadableCode;

    ValuesReasons(final int statusCode, final String messageToHuman) {
        this.statusCode = statusCode;
        humanReadableCode = messageToHuman;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public String getHumanReadableCode() {
        return humanReadableCode;
    }

    public static Optional<ValuesReasons> getReasonFromStatus(int statusCode) {

        return Arrays.stream(ValuesReasons.values())
                .filter(valuesReasons -> valuesReasons.statusCode == statusCode)
                .findFirst();

    }

    public static ValuesReasons getEnumBasedOn ( final int code){
        return Stream.of(ValuesReasons.values())
                .filter(el -> code == el.statusCode)
                .findFirst().orElse(UNKNOWN);
    }

}
