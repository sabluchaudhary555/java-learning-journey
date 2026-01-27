package p2methods.method;

// Public class - accessible from anywhere
public class AccessModifiers {

    // 1. PUBLIC - accessible everywhere
    public String publicName = "Public Variable";

    // 2. PRIVATE - accessible only in this class
    private int privateAge = 25;

    // 3. PROTECTED - accessible in package + subclasses
    protected double protectedSalary = 50000.0;

    // 4. DEFAULT (package-private) - accessible only in package
    String defaultDepartment = "Engineering";

    // PUBLIC METHOD
    public void displayPublicInfo() {
        System.out.println("Public Name: " + publicName);
        accessPrivateInfo(); // Can access private within class
    }

    // PRIVATE METHOD - only within this class
    private void accessPrivateInfo() {
        System.out.println("Private Age: " + privateAge);
        System.out.println("Can access private members here!");
    }

    // PROTECTED METHOD
    protected void displayProtectedInfo() {
        System.out.println("Protected Salary: " + protectedSalary);
    }

    // DEFAULT METHOD
    void displayDefaultInfo() {
        System.out.println("Default Department: " + defaultDepartment);
    }

    // PUBLIC GETTER for private variable (ENCAPSULATION)
    public int getAge() {
        return privateAge;
    }

    // PUBLIC SETTER for private variable (ENCAPSULATION)
    public void setAge(int newAge) {
        if(newAge > 0 && newAge < 150) {
            this.privateAge = newAge;
        }
    }
}

// ANOTHER CLASS IN SAME PACKAGE
class PackageClass {
    public void testAccess() {
        AccessModifiers obj = new AccessModifiers();

        // Can access PUBLIC
        System.out.println(obj.publicName);

        // CANNOT access PRIVATE
        // System.out.println(obj.privateAge); // ERROR

        // Can access PROTECTED (same package)
        System.out.println(obj.protectedSalary);

        // Can access DEFAULT (same package)
        System.out.println(obj.defaultDepartment);
    }
}

// MAIN CLASS TO TEST
 class TestAccess {
    public static void main(String[] args) {
        AccessModifiers demo = new AccessModifiers();

        // Access public members
        demo.displayPublicInfo();
        demo.setAge(30);
        System.out.println("Age via getter: " + demo.getAge());

        // Access protected (same package)
        demo.displayProtectedInfo();

        // Access default (same package)
        demo.displayDefaultInfo();

        // Cannot access private directly
        // demo.accessPrivateInfo(); // ERROR
        // System.out.println(demo.privateAge); // ERROR
    }
}