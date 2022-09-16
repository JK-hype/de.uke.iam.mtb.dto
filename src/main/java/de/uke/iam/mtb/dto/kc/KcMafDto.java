package de.uke.iam.mtb.dto.kc;

import java.util.UUID;

import lombok.Data;

@Data
public class KcMafDto {

    private UUID id;
    private String biosampleId;
    private String[] genes;
    private String transcript;
    private String variantClassification;
    private String chromosome;
    private String variantType;
    private Long start;
    private Long end;
    private String refGenome;
    private String refSeq;
    private String refAllele;
    private String tumorSeqAllele1;
    private String tumorSeqAllele2;
    private String variantOnGene;
    private String variantOnProtein;
    private String dbsnpRs;
    private Integer nDepth;
    private Integer tDepth;
    private String proteinPosition;
    private String codons;
    private String strand;
    private String consequence;
    private String patientId;

    public UUID getId() {
        if (this.id == null) {
            setId(UUID.randomUUID());
        }
        return this.id;
    }
}