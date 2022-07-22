package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wolf extends Animal {
    public Wolf() {
        super(50,3,8,10);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.WOLF;
    }
}
