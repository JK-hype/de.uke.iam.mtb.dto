package de.uke.iam.mtb.dto.miracum;

import de.uke.iam.mtb.dto.enums.Protocol;
import de.uke.iam.mtb.dto.enums.Sex;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MiracumInputDetailsDto {

    private String patientId;
    private Sex sex;
    private Boolean annotationOfGermlineFindings;
    private Protocol protocol;
    private String entity;
    private int numberOfFilePairs;
    private String patientFirstName;
    private String patientLastName;

    public String getPatientName() {
        return patientFirstName + "_" + patientLastName;
    }
}
