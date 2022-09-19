package de.uke.iam.mtb.dto.miracum;

import lombok.Data;

@Data
public class MiracumPathsDto {

    private String patientId;
    private String pathToOutput;
    private String pathToMaf;
    private String pathToReport;
    private String pathToInput;
    private String pathToLogs;
}
