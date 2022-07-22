package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horse extends Animal {
    public Horse() {
        super(300,3,45,5);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.HORSE;
    }
}
