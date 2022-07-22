package entitys;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Animal extends Entity {
    int speed;
    double food;
    int lifeTime;

    public Animal(double weight, int speed, double food, int lifeTime) {
        super(weight);
        this.speed = speed;
        this.food = food;
        this.lifeTime = lifeTime;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "speed=" + speed +
                ", food=" + food +
                ", lifeTime=" + lifeTime +
                '}';
    }
}
