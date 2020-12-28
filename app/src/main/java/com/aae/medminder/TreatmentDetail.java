package com.aae.medminder;

import android.util.Log;

public class TreatmentDetail {

    private Long medicineTreatmentID;
    private String medicineName;
    private String amount;
    private String time;
    private boolean expandable;
    private String treatementType;

    public TreatmentDetail(Long treatmetID, String medicineName, String amount, String time, String treatementType) {
        this.medicineTreatmentID = treatmetID;
        this.medicineName = medicineName;
        this.amount = amount;
        this.time = time;
        this.expandable = false;
    }

    public void increaseAmount(){
        if(Integer.parseInt(this.amount) < 9)
            this.amount = String.valueOf(Integer.parseInt(this.amount) + 1);
    }

    public void decreaseAmount(){
        if(Integer.parseInt(this.amount) > 0)
            this.amount = String.valueOf(Integer.parseInt(this.amount) - 1);
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public Long getMedicineTreatmentID() {
        return medicineTreatmentID;
    }

    public void setMedicineTreatmentID(Long medicineTreatmentID) {
        this.medicineTreatmentID = medicineTreatmentID;
    }

    public String getTreatementType() {
        return treatementType;
    }

    public void setTreatementType(String treatementType) {
        this.treatementType = treatementType;
    }

    @Override
    public String toString() {
        return "MedicineInfo{" +
                "medicineName='" + medicineName + '\'' +
                ", amount='" + amount + '\'' +
                ", time='" + time + '\'' +
                ", expandable=" + expandable +
                '}';
    }
}