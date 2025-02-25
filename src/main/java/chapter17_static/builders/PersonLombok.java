package chapter17_static.builders;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder

public class PersonLombok {
    private String name;
    private int age;
    private String address;

}
