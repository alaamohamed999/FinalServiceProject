/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Doflamengo Onepiece
 */
@WebService(serviceName = "curr")
public class curr {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Double operation(@WebParam(name = "from") String from, @WebParam(name = "to") String to, @WebParam(name = "v") double v) {
          if (from == "USD") {
            if (to == "USD") {
                v =  v *= 1.00;
                
            }

            if (to == "GBP") {
              v =  v *= 0.66;
               
            }

            if (to == "EUR") {
            v =    v *= 0.93;
               
            }

            if (to == "JPY") {
              v =  v *= 123.54;
               
            }
             return   (v);
        }

       else if (from == "GBP") {
            if (to == "USD") {
               v =  v *= 1.51;
                
            }

            if (to == "GBP") {
              v =  v *= 1.00;
                
            }

            if (to == "EUR") {
               v = v *= 1.41;
                
            }

            if (to == "JPY") {
               v = v *= 186.41;
                
            }
            return   (v);
        }

       else if (from == "EUR") {
            if (to == "USD") {
              v =  v *=1.073;
               
            }

            if (to == "GBP") {
              v =  v *= 0.71;
               
            }

            if (to == "EUR") {
             v =   v *= 1.00;
                
            }

            if (to == "JPY") {
               v = v *= 132.57;
               
            }
             return   (v);
        }

        else if (from == "JPY") {
            if (to == "USD") {
               v = v *= 0.008;
                
            }

            if (to == "GBP") {
             v =  v *= 0.005;
               
            }

            if (to == "EUR") {
               v =  v *= 0.007;
                
            }

            if (to == "JPY") {
                   v = v *= 1.000;
              
            }
             return   (v);
        }
        else{
         return   v *= 0.66;
        }
          }
}
