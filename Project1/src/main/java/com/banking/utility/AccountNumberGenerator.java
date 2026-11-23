package com.banking.utility;

import java.util.Random;

public class AccountNumberGenerator {

    public static long generateAccountNumber() {

        Random random = new Random();

        return 1000000000L + random.nextInt(900000000);
    }

}
