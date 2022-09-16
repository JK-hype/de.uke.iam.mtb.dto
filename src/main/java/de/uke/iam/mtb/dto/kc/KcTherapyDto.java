package de.uke.iam.mtb.dto.kc;

import java.sql.Date;
import java.util.UUID;

import lombok.Data;

@Data
public class KcTherapyDto {

    private UUID id;
    private String therapy;
    private Date start;
    private Date end;
    private String patientId;

    public UUID getId() {
        if (this.id == null) {
            setId(UUID.randomUUID());
        }
        return this.id;
    }
}
