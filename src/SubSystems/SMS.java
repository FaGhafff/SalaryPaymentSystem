package SubSystems;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class SMS {
    private final String USER_AGENT = "Mozilla/5.0";

    private String phoneNumber = "";
    private String message = "";
    private boolean status =false;

    public SMS(String phoneNumber) {
        if (phoneNumber.charAt(0)!='0')
            phoneNumber="0"+phoneNumber;
        this.phoneNumber = phoneNumber;
    }

    public void setMessage(String message) {
        String[] temp = message.split(" ");
        StringBuilder mes= new StringBuilder();
        for (String str :
                temp) {
            mes.append(str).append("%20");
        }
        this.message = mes.toString();
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String send() {
        try {
            String url = "https://raygansms.com/SendMessageWithCode.ashx?Username=a0forghani&Password=1346794613&Mobile=" + phoneNumber + "&Message=" + message;

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

//            int responseCode = con.getResponseCode();
//            System.out.println("\nSending 'GET' request to URL : " + url);
//            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            if (Integer.parseInt(response.toString()) > 2000) {
                status = true;
                return "پیام با موفقیت ارسال شد.";
            }else
                return response.toString();
        } catch (UnknownHostException e) {
            return "خطای اتصال به اینترنت";
        }catch (Exception e){
            return "حظا";
        }

    }


    public boolean getStatus() {
        return status;
    }
}
