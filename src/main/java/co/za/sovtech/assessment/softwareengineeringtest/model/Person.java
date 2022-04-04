package co.za.sovtech.assessment.softwareengineeringtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int height;
    private double mass;
    private String gender;
    private String homeGround;
}
