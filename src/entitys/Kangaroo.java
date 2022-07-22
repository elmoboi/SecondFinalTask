package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kangaroo extends Animal {
    public Kangaroo() {
        super(47,2,7,8);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.KANGAROO;
    }
}
