package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sheep extends Animal {
    public Sheep() {
        super(45,1,7,5);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.SHEEP;
    }
}
