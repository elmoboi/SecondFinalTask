import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GetMaxCountAnimal {
    WOLF(30),//поменять на реальные
    BEAR(7),//поменять на реальные
    SNAKE(123),
    FOX(50),
    EAGLE(166),
    HORSE(23),
    DEER(41),
    GOAT(107),
    HARE(750),
    HAMSTER(10000),
    SHEEP(156),
    KANGAROO(149),
    COW(20),
    DUCK(500),
    CATERPILLAR(10000);
final int maxCountAnimal;

    public static int getRandomMaxCount(String animalName) {
        if(animalName == null) {
            return 0;
        }
        for(GetMaxCountAnimal animalSearch : values()) {
            if(animalSearch.name().equals(animalName)) {
                return (int) (Math.random() * animalSearch.maxCountAnimal);
            }
        }
        return 0;
    }
    public static int getMaxCount(String animalName) {
        if(animalName == null) {
            return 0;
        }
        for(GetMaxCountAnimal animalSearch : values()) {
            if(animalSearch.name().equals(animalName)) {
                return animalSearch.maxCountAnimal;
            }
        }
        return 0;
    }
}