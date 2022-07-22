import entitys.Animal;
import entitys.Entity;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Optional;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MultiplyCoordinator {
    MultiplyService multiplyService = new MultiplyService();

    public void multyplyEntity(Cell cell, Animal animal) {
        Optional<Animal> born = multiplyService.multiply(animal);
        born.ifPresent(animal1 -> cell.getListAnimal().add(animal));
    }
}
