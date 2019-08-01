package Payroll.factory;

import Payroll.domain.Gender;

public class GenderFactory {
    public static Gender getGender(String female, String male){
        return new Gender.Builder().female(female)
                .male(male)
                .build();
    }
}
