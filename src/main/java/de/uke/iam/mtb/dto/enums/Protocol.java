package de.uke.iam.mtb.dto.enums;

import com.google.common.base.CaseFormat;

/*
 * there are 3 different options to choose from for protocol
 * - whole exome sequencing (wes)
 * - panel for tNGS (500 panel)
 * - tumor only
 */
public enum Protocol {
    WES, PANEL, TUMOR_ONLY;

    @Override
    public String toString() {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, this.name());
    }
}