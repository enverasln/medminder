package com.aae.medminder.models;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.ToOne;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

@Entity (nameInDb = "MedicineTreatment")
public class MedicineTreatment {
    @Id (autoincrement = true)
    private Long medicineTreatmentID;

    private Long treatmentID;

    @ToOne (joinProperty = "treatmentID")
    private Treatment treatment;

    @Property(nameInDb = "time")
    private String time;

    @Property(nameInDb = "date")
    private String date;

    private Long medicineID;

    @ToOne (joinProperty = "medicineID")
    private Medicine medicine;

    @Property (nameInDb = "dosage")
    private Long dosage;

    @Property (nameInDb = "consumedDosage")
    private Long consumedDosage;

    @Property (nameInDb = "consumeType")
    private String cosumeType;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 457411753)
    private transient MedicineTreatmentDao myDao;

    @Generated(hash = 128962405)
    public MedicineTreatment(Long medicineTreatmentID, Long treatmentID,
            String time, String date, Long medicineID, Long dosage,
            Long consumedDosage, String cosumeType) {
        this.medicineTreatmentID = medicineTreatmentID;
        this.treatmentID = treatmentID;
        this.time = time;
        this.date = date;
        this.medicineID = medicineID;
        this.dosage = dosage;
        this.consumedDosage = consumedDosage;
        this.cosumeType = cosumeType;
    }

    @Generated(hash = 249418594)
    public MedicineTreatment() {
    }

    public Long getMedicineTreatmentID() {
        return this.medicineTreatmentID;
    }

    public void setMedicineTreatmentID(Long medicineTreatmentID) {
        this.medicineTreatmentID = medicineTreatmentID;
    }

    public Long getTreatmentID() {
        return this.treatmentID;
    }

    public void setTreatmentID(Long treatmentID) {
        this.treatmentID = treatmentID;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getMedicineID() {
        return this.medicineID;
    }

    public void setMedicineID(Long medicineID) {
        this.medicineID = medicineID;
    }

    public Long getDosage() {
        return this.dosage;
    }

    public void setDosage(Long dosage) {
        this.dosage = dosage;
    }

    public Long getConsumedDosage() {
        return this.consumedDosage;
    }

    public void setConsumedDosage(Long consumedDosage) {
        this.consumedDosage = consumedDosage;
    }

    public String getCosumeType() {
        return this.cosumeType;
    }

    public void setCosumeType(String cosumeType) {
        this.cosumeType = cosumeType;
    }

    @Generated(hash = 427483173)
    private transient Long treatment__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 104875332)
    public Treatment getTreatment() {
        Long __key = this.treatmentID;
        if (treatment__resolvedKey == null
                || !treatment__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TreatmentDao targetDao = daoSession.getTreatmentDao();
            Treatment treatmentNew = targetDao.load(__key);
            synchronized (this) {
                treatment = treatmentNew;
                treatment__resolvedKey = __key;
            }
        }
        return treatment;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1980563665)
    public void setTreatment(Treatment treatment) {
        synchronized (this) {
            this.treatment = treatment;
            treatmentID = treatment == null ? null : treatment.getTreatmentID();
            treatment__resolvedKey = treatmentID;
        }
    }

    @Generated(hash = 1842101333)
    private transient Long medicine__resolvedKey;

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 791122259)
    public Medicine getMedicine() {
        Long __key = this.medicineID;
        if (medicine__resolvedKey == null || !medicine__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MedicineDao targetDao = daoSession.getMedicineDao();
            Medicine medicineNew = targetDao.load(__key);
            synchronized (this) {
                medicine = medicineNew;
                medicine__resolvedKey = __key;
            }
        }
        return medicine;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1261703337)
    public void setMedicine(Medicine medicine) {
        synchronized (this) {
            this.medicine = medicine;
            medicineID = medicine == null ? null : medicine.getMedicineID();
            medicine__resolvedKey = medicineID;
        }
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 880567551)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getMedicineTreatmentDao() : null;
    }



}
