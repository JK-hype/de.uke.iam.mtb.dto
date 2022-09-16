package de.uke.iam.mtb.dto.kc;

import java.sql.Date;
import java.util.List;

import de.uke.iam.mtb.dto.enums.Sex;
import lombok.Data;

@Data
public class KcPatientDto {

    private String id;
    private Sex sex;
    private Date birthday;
    private String site;
    private String applicant;
    private List<KcBiosampleDto> biosampleList;
    private List<KcDiagnosisDto> diagnosisList;
    private List<KcLesionDto> lesionList;
    private List<KcMorphologyDto> morphologyList;
    private List<KcTherapyDto> therapyList;
    private List<KcMafDto> mafList;
}
