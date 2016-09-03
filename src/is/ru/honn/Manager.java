package is.ru.honn;

import java.util.GregorianCalendar;

/**
 * Klasinn Manager (Manager.java)
 * TODO: Add description
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
public class Manager extends Employee {

    protected String title;

    public Manager() {}

    public Manager(String name, String title, GregorianCalendar dateOfBirth, GregorianCalendar dateOfHire) {
        this.name = name;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "Manager: " + getName() + ", " + getTitle();
    }
}
