import entitys.Plant;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class PlantGrowing {
    RandomManager randomManager = RandomManager.getRandomManager();

    public void grow(Field field) {
        ThreadLocalRandom random = randomManager.getRandom();

        field.getCells()
                .stream()
                .flatMap(Collection::stream)
                .forEach(
                        cell -> {
                            int i = random.nextInt(0,100);
                            IntStream.range(0,i)
                                    .forEach(j -> cell.getListAnimal()
                                            .add(new Plant()));
                        }
                );
    }
}
