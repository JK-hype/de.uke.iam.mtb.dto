package de.uke.iam.mtb.dto.miracum;

import de.uke.iam.mtb.dto.enums.Protocol;
import lombok.Data;

@Data
public class MiracumMafDto {

    private String patientId;
    private Protocol protocol;
    private String hugoSymbol;
    private String entrezGeneId;
    private String center;
    private String transcriptId;
    private String variantClassification;
    private String chromosome;
    private String variantType;
    private String startPosition;
    private String endPosition;
    private String ncbiBuild;
    private String referenceAllele;
    private String tumorSeqAllele1;
    private String tumorSeqAllele2;
    private String strand;
    private String dbsnpRs;
    private String dbsnpRsValStatus;
    private String tumorSampleBarcode;
    private String matchedNormSampleBarcode;
    private String matchedNormSeqAllele1;
    private String matchedNormSeqAllele2;
    private String tumorValidationAllele1;
    private String tumorValidationAllele2;
    private String matchedNormalValidationAllele1;
    private String matchedNormalValidationAllele2;
    private String verificationStatus;
    private String validationStatus;
    private String mutationStatus;
    private String sequencingPhase;
    private String sequencingSource;
    private String validationMethod;
    private String score;
    private String bamFile;
    private String sequencer;
    private String hgvspShort;
    private String aminoAcidChange;
    private String txChange;
    private String ensemblGeneId;
    private String refCountT;
    private String altCountT;
    private String refCountN;
    private String altCountN;
}
