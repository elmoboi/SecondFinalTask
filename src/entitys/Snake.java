package entitys;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Snake extends Animal {
    public Snake() {
        super(2,1,0.3,15);
    }

    @Override
    public LiveableType getLiveableType() {
        return LiveableType.SNAKE;
    }
}
