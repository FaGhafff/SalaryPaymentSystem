package Model;
import java.util.Date;

/*          For Notification Handling
 * we have a table in DB that name is Notifications
 * at Sign in and in initializing we should check this table
 * and show notifications that they related to client
 * for increasing speed and make program better
 * we can use two tables for UnReadNotifications and ReadNotifications.
 *
 */

public class Notification {
    private Person from;     //in dataBase it can replace with personalCode
    private Person to;       //in dataBase it can replace with personalCode
    private String message;
    private Date date;

    public Person getFrom() {
        return from;
    }

    public void setFrom(Person from) {
        this.from = from;
    }

    public Person getTo() {
        return to;
    }

    public void setTo(Person to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
