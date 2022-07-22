package entitys;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
public abstract class Entity {
    double weight;
    public abstract LiveableType getLiveableType();
}
