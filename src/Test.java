import Model.DataBaseHelper;
import Model.EmploymentOrder;
import SubSystems.SMS;

import javax.sql.DataSource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Test {




    public static void main(String[] args) {
        SMS sms = new SMS("9145030651");
        sms.setMessage("hi");
        System.out.println(sms.send());
    }
}
