package inheritanceTypes.SingleTable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentor extends User {
    private String company;
}
