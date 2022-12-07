package FactoryMethod.male;

import FactoryMethod.AbstractFactory;
import FactoryMethod.Human;

public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(age <= KidBoy.MAX_AGE){
            return new KidBoy();
        }if(age <= TeenBoy.MAX_AGE){
            return new TeenBoy();
        }else return new Man();
    }
}
