import entitys.Animal;
import entitys.Entity;
import entitys.LiveableType;
import entitys.Wolf;
import services.AnimalFactory;
import services.PlantFactory;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

public class MultiplyService {
    RandomManager randomManager = RandomManager.getRandomManager();


    public Optional<Animal> multiply(Animal animal) {
        ThreadLocalRandom random = randomManager.getRandom();
        int generateChance = random.nextInt(0,100);
        return Optional.of(animal)
                .filter(chance -> generateChance > 50);
        }
}
