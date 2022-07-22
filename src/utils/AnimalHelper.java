package utils;

import entitys.Animal;

public class AnimalHelper {
    public static String getNameAnimal(Animal animal) {
        return animal.getClass().getName().split("\\.")[1];
    }
}
