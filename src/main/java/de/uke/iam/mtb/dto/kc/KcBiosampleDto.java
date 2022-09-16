package de.uke.iam.mtb.dto.kc;

import lombok.Data;

@Data
public class KcBiosampleDto {

    private String id;
    private String sequencing;
    private Boolean sequenced;
    private String patientId;
}
