package com.covid19pune.covidbeds.model;

public class CovidHospital {
    private String hospitalName;
    private String hospitalAddress;
    private String number;
    private String bedCapacity;
    private String availableBedWithoutOxy;
    private String vacantBedWithoutOxy;
    private String AllocatedBedWithOxy;
    private String vacantBedWithOxy;
    private String allocatedBedIcuWithouVenti;
    private String vacantBedIcuWithoutVenti;
    private String allocatedBedWithVenti;
    private String vacantBedIcuWithVenti;



    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(String bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    public String getAvailableBedWithoutOxy() {
        return availableBedWithoutOxy;
    }

    public void setAvailableBedWithoutOxy(String availableBedWithoutOxy) {
        this.availableBedWithoutOxy = availableBedWithoutOxy;
    }

    public String getVacantBedWithoutOxy() {
        return vacantBedWithoutOxy;
    }

    public void setVacantBedWithoutOxy(String vacantBedWithoutOxy) {
        this.vacantBedWithoutOxy = vacantBedWithoutOxy;
    }

    public String getAllocatedBedWithOxy() {
        return AllocatedBedWithOxy;
    }

    public void setAllocatedBedWithOxy(String allocatedBedWithOxy) {
        this.AllocatedBedWithOxy = allocatedBedWithOxy;
    }

    public String getVacantBedWithOxy() {
        return vacantBedWithOxy;
    }

    public void setVacantBedWithOxy(String vacantBedWithOxy) {
        this.vacantBedWithOxy = vacantBedWithOxy;
    }

    public String getAllocatedBedIcuWithouVenti() {
        return allocatedBedIcuWithouVenti;
    }

    public void setAllocatedBedIcuWithouVenti(String allocatedBedIcuWithouVenti) {
        this.allocatedBedIcuWithouVenti = allocatedBedIcuWithouVenti;
    }

    public String getVacantBedIcuWithoutVenti() {
        return vacantBedIcuWithoutVenti;
    }

    public void setVacantBedIcuWithoutVenti(String vacantBedIcuWithoutVenti) {
        this.vacantBedIcuWithoutVenti = vacantBedIcuWithoutVenti;
    }

    public String getAllocatedBedWithVenti() {
        return allocatedBedWithVenti;
    }

    public void setAllocatedBedWithVenti(String allocatedBedWithVenti) {
        this.allocatedBedWithVenti = allocatedBedWithVenti;
    }

    public String getVacantBedIcuWithVenti() {
        return vacantBedIcuWithVenti;
    }

    public void setVacantBedIcuWithVenti(String vacantBedIcuWithVenti) {
        this.vacantBedIcuWithVenti = vacantBedIcuWithVenti;
    }

    @Override
    public String toString() {
        return "CovidHospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                '}';
    }
}
