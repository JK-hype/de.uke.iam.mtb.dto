package de.uke.iam.mtb.dto.kc;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class KcDiagnosisDto {

    private UUID id;
    private String diagnosis;
    private Date date;
    private String entity;
    private String patientId;

    public UUID getId() {
        if (this.id == null) {
            setId(UUID.randomUUID());
        }
        return this.id;
    }
}
