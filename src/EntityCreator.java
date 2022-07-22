import entitys.Animal;
import entitys.Entity;
import entitys.LiveableType;
import services.AnimalFactory;
import services.PlantFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class EntityCreator implements AnimalFactory {
    static AnimalFactory[] animalFactories;
    static PlantFactory[] plantFactories;

    public EntityCreator(AnimalFactory[] animalFactories, PlantFactory[] plantFactories) {
        EntityCreator.animalFactories = animalFactories;
        EntityCreator.plantFactories = plantFactories;
    }

    public static EntityCreator createAnimal = new EntityCreator(new AnimalFactory[]{
            new Fabric.WolfFactory(),
            new Fabric.BearFctory(),
            new Fabric.CaterpillarFctory(),
            new Fabric.CowFctory(),
            new Fabric.DeerFctory(),
            new Fabric.DuckFctory(),
            new Fabric.EagleFctory(),
            new Fabric.FoxFctory(),
            new Fabric.GoatFctory(),
            new Fabric.HamsterFctory(),
            new Fabric.HareFctory(),
            new Fabric.HorseFctory(),
            new Fabric.KangarooFctory(),
            new Fabric.SheepFctory(),
            new Fabric.SnakeFctory(),
    }, new PlantFactory[]{
            new Fabric.PlantFctory()
    });

    @Override
    public Animal create() {
        return createAnimal.create();
    }

    public static List<Entity> createEntity() {
        List<Entity> list = new ArrayList<>();
        int random;
        for(int i=0; i<animalFactories.length; i++) {
            if(i==0) {
                random = GetMaxCountAnimal.getRandomMaxCount("WOLF");
                for(int j=0; j<random; j++) {
                    Animal animalCheck = animalFactories[i].create();
                    list.add(animalFactories[i].create());
                }
            }else if(i==1) {
                random = GetMaxCountAnimal.getRandomMaxCount("BEAR");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==2) {
                random = GetMaxCountAnimal.getRandomMaxCount("CATERPILLAR");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==3) {
                random = GetMaxCountAnimal.getRandomMaxCount("COW");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==4) {
                random = GetMaxCountAnimal.getRandomMaxCount("DEER");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==5) {
                random = GetMaxCountAnimal.getRandomMaxCount("DUCK");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==6) {
                random = GetMaxCountAnimal.getRandomMaxCount("EAGLE");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==7) {
                random = GetMaxCountAnimal.getRandomMaxCount("FOX");
                for (int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==8) {
                random = GetMaxCountAnimal.getRandomMaxCount("GOAT");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==9) {
                random = GetMaxCountAnimal.getRandomMaxCount("HAMSTER");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==10) {
                random = GetMaxCountAnimal.getRandomMaxCount("HARE");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==11) {
                random = GetMaxCountAnimal.getRandomMaxCount("HORSE");
                for (int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==12) {
                random = GetMaxCountAnimal.getRandomMaxCount("KANGAROO");
                for(int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==13) {
                random = GetMaxCountAnimal.getRandomMaxCount("SHEEP");
                for (int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            } else if(i==14) {
                random = GetMaxCountAnimal.getRandomMaxCount("SNAKE");
                for (int j=0; j<random; j++) {
                    list.add(animalFactories[i].create());
                }
            }
        }
        for(int i=0; i<plantFactories.length; i++) {
            random = (int) (Math.random() * 10000);
            for(int j=0; j<random; j++) {
                list.add(plantFactories[i].createPlant());
            }
        }
        Collections.shuffle(list);
        return list;
    }
}

