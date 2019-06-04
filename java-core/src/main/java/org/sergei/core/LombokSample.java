package org.sergei.core;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString
class PojoTwo {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;

}

public class LombokSample {

    public static void main(String[] args) {
        PojoTwo pojoTwo = PojoTwo
                .builder()
                    .id(1L)
                    .firstName("John")
                    .lastName("Smith")
                    .age(21)
                .build();
        System.out.println(pojoTwo.toString());
    }

}
