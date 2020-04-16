package com.ibmorgan.exerciseclinic.model;

import java.io.Serializable;
import java.util.Objects;

public class PatientPlanId implements Serializable {

    private long patient;
    private long plan;

    public long getPatient() {
        return patient;
    }

    public void setPatient(long patient) {
        this.patient = patient;
    }

    public long getPlan() {
        return plan;
    }

    public void setPlan(long plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatientPlanId)) return false;
        PatientPlanId that = (PatientPlanId) o;
        return getPatient() == that.getPatient() &&
                getPlan() == that.getPlan();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPatient(), getPlan());
    }
}
