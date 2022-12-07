package FactoryMethod.female;

import FactoryMethod.AbstractFactory;
import FactoryMethod.Human;

public class FemaleFactory implements AbstractFactory {
    public Human getPerson(int age){
        if(age <= KidGirl.MAX_AGE){
            return new KidGirl();
        }if(age <= TeenGirl.MAX_AGE){
            return new TeenGirl();
        }else return new Woman();
    }
}
