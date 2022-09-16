package de.uke.iam.mtb.dto.enums;

public enum Sex {
    MALE("XY", "Männlich"), FEMALE("XX", "Weiblich");

    private final String annotation;
    private final String germanName;

    private Sex(String annotation, String germanName) {
        this.annotation = annotation;
        this.germanName = germanName;
    }

    public static Sex getSexByAnnotation(String annotation) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "Annotation of sex can only " + MALE.getAnnotation() + " or " + FEMALE.getAnnotation() + ". Cannot be "
                        + annotation);
        if (annotation != null) {
            if (annotation.equals(MALE.getAnnotation())) {
                return MALE;
            } else if (annotation.equals(FEMALE.getAnnotation())) {
                return FEMALE;
            } else {
                throw exception;
            }
        } else {
            throw exception;
        }
    }

    public static Sex getSexByGermanName(String germanName) {
        IllegalArgumentException exception = new IllegalArgumentException(
                "GermanName of sex can only " + MALE.getGermanName() + " or " + FEMALE.getGermanName() + ". Cannot be "
                        + germanName);
        if (germanName != null) {
            if (germanName.equals(MALE.getGermanName())) {
                return MALE;
            } else if (germanName.equals(FEMALE.getGermanName())) {
                return FEMALE;
            } else {
                throw exception;
            }
        } else {
            throw exception;
        }
    }

    public String getAnnotation() {
        return this.annotation;
    }

    public String getGermanName() {
        return this.germanName;
    }
}
