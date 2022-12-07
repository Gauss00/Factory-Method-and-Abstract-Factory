package FactoryMethod;

import FactoryMethod.female.FemaleFactory;
import FactoryMethod.male.MaleFactory;

public class FactoryProducer {
    public enum HumanFactoryType{
        MALE,
        FEMALE;
    }
    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType){
        if(humanFactoryType == HumanFactoryType.MALE){
            return new MaleFactory();
        }else return new FemaleFactory();
    }
}
