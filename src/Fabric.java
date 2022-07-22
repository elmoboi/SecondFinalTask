import entitys.*;
import entitys.Plant;
import services.AnimalFactory;
import services.PlantFactory;

public class Fabric {

    public static class WolfFactory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Wolf();
        }
    }
    public static class BearFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Bear();
        }
    }
    public static class CaterpillarFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Caterpillar();
        }
    }
    public static class CowFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Cow();
        }
    }
    public static class DeerFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Deer();
        }
    }
    public static class DuckFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Duck();
        }
    }
    public static class EagleFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Eagle();
        }
    }
    public static class FoxFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Fox();
        }
    }
    public static class GoatFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Goat();
        }
    }
    public static class HamsterFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Hamster();
        }
    }
    public static class HareFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Hare();
        }
    }
    public static class HorseFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Horse();
        }
    }
    public static class KangarooFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Kangaroo();
        }
    }
    public static class SheepFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Sheep();
        }
    }
    public static class SnakeFctory implements AnimalFactory {
        @Override
        public Animal create() {
            return new Snake();
        }
    }
    public static class PlantFctory implements PlantFactory {
        @Override
        public Plant createPlant() {
            return new Plant();
        }
    }
}
