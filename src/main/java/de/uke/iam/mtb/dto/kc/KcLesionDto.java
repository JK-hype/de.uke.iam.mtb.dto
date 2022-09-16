package de.uke.iam.mtb.dto.kc;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class KcLesionDto {

    private UUID id;
    private String lesion;
    private Date date;
    private String lesionType;
    private String patientId;

    public UUID getId() {
        if (this.id == null) {
            setId(UUID.randomUUID());
        }
        return this.id;
    }
}
