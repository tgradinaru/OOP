package oop.inheritence;

import com.sun.istack.internal.localization.NullLocalizable;

public class GenericPackage {
    String uniqueID;    // cod unic pachet colet format din cifre
    double weight;      // greutate colt
    String packageName; // nume pachet
    String courierName = "DevCarry"; // numele firmei de curierat

    public GenericPackage(String uniqueID, double weight, String packageName) { //Constructor
            this.uniqueID = uniqueID;
            this.weight = weight;
            this.packageName = packageName;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setNewCourierName(String courierName) {
        this.courierName = courierName;
    }
    public void setPackageName(String packageName){
        if (this.packageName == null) {
            this.packageName = packageName;
        } else
        System.out.println("Package name was already set to "+ this.packageName);
    }
    public void  setUniqueID(){
        if (this.uniqueID == null) {
            this.uniqueID = packageName;
        } else
        System.out.println("Package name was already set to "+ this.uniqueID);
    }
}