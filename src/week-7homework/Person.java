public class Person {
    //declared 3 instance variable
    String fName;
    String lName;
    int age;

    //declared one instance method return with no parameter
    public String getFirstName() {
        return fName;//return value in string
    }

    //declaring second instance return method with no parameters
    public String getLastName() {
        return lName;

    }

    //declaring thirs method withno parameter
    public int getAge() {
        return age;

    }

    //declaring fourth method with one parameter
    public String setFirstName(String fName) {
        this.fName = fName;
        return fName;
    }

    //declaring fifth method with one parameter
    public String setLastName(String lName) {
        this.lName = lName;
        return lName;
    }

    // declaring sixth method with parameter
    public int setAge(int age) {
        if (age < 0 || age > 100)
            age = 0;
        this.age = age;
        return age;

    }//declaring seventh method without parameter;

    public boolean isTeen() {
        boolean result;
        if (age > 12 && age < 20) {
            result = true;
        } else {
            result = false;
        }
        this.age = age;
        return result;
    }

    //declaring eighth method with no paramaeter
    public String getFullName() {

        String fullName = fName + lName;
        if ((fName.isEmpty()) && (lName.isEmpty())) {
            fullName = "";
        } else {
            if (fName.isEmpty()) {
                fullName = "";
            } else if (lName.isEmpty()) {
                lName = "";

            }
        }

        return fullName;
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");//firstname is set to empty string
        person.setLastName("");//lastname is set to empty string
        person.setAge(10);
        System.out.println("fullname= " + person.getFullName());
        System.out.println(("teen =" + person.isTeen()));
        person.setFirstName("john");//first name is set to john
        person.setAge(18);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("smith");//last name is set to smith
        System.out.println("fullname =" + person.getFullName());

    }
}
