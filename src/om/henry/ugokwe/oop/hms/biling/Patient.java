package om.henry.ugokwe.oop.hms.biling;

public class Patient extends User{
private long patientId;
private boolean insured;
private HealthInsurancePlan insurancePlan = null;

public long getPatientId() {
	return patientId;
}
public void setPatientId(long patientId) {
	this.patientId = patientId;
}
public boolean isInsured() {
	return insured;
}
public void setInsured(boolean insured) {
	this.insured = insured;
}
public HealthInsurancePlan getInsurancePlan() {
	return insurancePlan;
}
public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
	this.insurancePlan = insurancePlan;
}
}
