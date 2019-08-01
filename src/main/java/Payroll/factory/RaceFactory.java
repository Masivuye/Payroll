package Payroll.factory;

import Payroll.domain.Race;

public class RaceFactory {
    public static Race getRace(String african,String coloured, String white){
        return new Race.Builder().african(african)
                .coloured(coloured)
                .white(white)
                .build();
    }
}
