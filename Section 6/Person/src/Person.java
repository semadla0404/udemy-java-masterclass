public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        String nameStr = "";
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            nameStr = "";
        } else if(this.lastName.isEmpty()) {
            nameStr = this.firstName;
        } else if(this.firstName.isEmpty()) {
            nameStr = this.lastName;
        } else {
            nameStr = this.firstName + " " + this.lastName;
        }
        return nameStr;
    }

}
