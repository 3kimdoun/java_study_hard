package chapter18_generic;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Product<T> {
    private String productName;
//    private
    private T productInfo;
}
