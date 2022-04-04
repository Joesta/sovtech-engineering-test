package co.za.sovtech.assessment.softwareengineeringtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page {
    private int pageNo;
    private People people;
}
