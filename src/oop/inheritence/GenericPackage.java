package oop.inheritence;

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

    public void setPackageName(String packageName) {
        if (this.packageName == null) {
            this.packageName = packageName;
        } else
            System.out.println("Package name was already set to " + this.packageName);
    }

    public void setUniqueID() {
        if (this.uniqueID == null) {
            this.uniqueID = packageName;
        } else
            System.out.println("Package name was already set to " + this.uniqueID);
    }

    public void addItem(double itemWeight) {
        if (!(itemWeight >= 0)) {
            System.out.println("You can't add a negative value");
        }
        this.weight += itemWeight;
        System.out.println(this.packageName + " has a new weight " + this.weight);
    }

    public boolean checkID() {
        if (!((this.uniqueID.length() > 9) && (this.uniqueID.length() < 13))) {
            System.out.println("Invalid code! - Too short or too long");
            return false;
        }
        int checker = 0;
        for (int i = 0; i < this.uniqueID.length(); i++) {
            int asciiCode = this.uniqueID.charAt(i);
            if (asciiCode >= 48 && asciiCode <= 57) {
                checker++;
            }
        }
        if (checker != this.uniqueID.length()) {
            System.out.println("Invalid code! - some character(s) in the code - not numbers");
            return false;
        }
        for (int i = 0; i < this.uniqueID.length() - 1; i++) {
            if (Math.abs(this.uniqueID.charAt(i) - this.uniqueID.charAt(i + 1)) > 4) {
                System.out.println("Invalid code! - the difference between two consecutive numbers is greater than 4");
                return false;
            }
        }
        checker = 0;
        for (int i = 0; i < this.uniqueID.length(); i++) {
            checker += (this.uniqueID.charAt(i) - 48);
        }
        if (checker % 4 != 0) {
            System.out.println("Invalid code - the sum of the numbers in the code is not divided by 4");
            return false;
        }
        checker = 0;
        for (int i = 0; i < this.uniqueID.length(); i++) { //count the odd numbers in the code
            if (this.uniqueID.charAt(i) % 2 != 0) {
                checker++;
            }
        }
        if (checker % 3 != 0) {
            System.out.println("The number of odd numbers in the code is not divided by 3");
            return false;
        }
        return true;
    }


    public String computeDetails() {
        return "The package{ '" +  this.packageName + "' uniqueID='" + uniqueID +
                "' weight=" + weight +
                "Kg, has the courierName='" + courierName + '\'' +
                '}';
    }
}