package pluralsight.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateContoller {

    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @Value("${connstring}")
    String connstring;

    @RequestMapping("/rate")
    public String getRate() {
        StringBuilder sb = new StringBuilder();
        sb.append(" rateamount : " + rate);
        sb.append(" lanes : " + lanecount);
        sb.append(" tollstart : " + tollstart);
        sb.append(" connstring : " + connstring);

        //name of view
        return String.valueOf(sb);
    }


}
