package cputProject.factory.Exchange;

import cputProject.domain.Exchange.Bonds;
import cputProject.util.Misc;

public class BondsFactory {
    public static Bonds getBonds(String bond){
        return  new Bonds.Builder().bond(bond).id(Misc.generateId())
                .build();
    }
}
