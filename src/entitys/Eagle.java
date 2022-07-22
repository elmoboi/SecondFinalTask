package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Eagle extends Animal {
    public Eagle() {
        super(6,4,1,5);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.EAGLE;
    }
}
