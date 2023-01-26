/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Doflamengo Onepiece
 */
@WebService(serviceName = "Time")
public class Time {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "time")
    public String time(@WebParam(name = "city") String city) {
      DateFormat dateFormat = new SimpleDateFormat("HH");
        Date date = new Date();
        String a = dateFormat.format(date);
        int b = Integer.parseInt(a);

        DateFormat dateFormat2 = new SimpleDateFormat("mm");
        Date date2 = new Date();
        String c = dateFormat2.format(date2);

        switch (city) {
            case "cairo":
                return (b*1)+":"+c;
            case "paris":
                return (b*1)+":"+c;
            case "london":
                return (b-1)+":"+c;
            case "bali":
                return (b+6)+":"+c;
        }
        return null;
    }
}
