package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Bonds;

public class BondsFactory {
    public static Bonds getBonds(String bond){
        return  new Bonds.Builder().bond(bond)
                .build();
    }
}
