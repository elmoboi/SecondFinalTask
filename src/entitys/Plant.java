package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plant extends Entity {
    public Plant() {
        super(1);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.PLANT;
    }
}
