package co.za.sovtech.assessment.softwareengineeringtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private List<Person> people;
}
