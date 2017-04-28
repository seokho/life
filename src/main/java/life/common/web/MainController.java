package life.common.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by odol on 2017-04-28.
 */
@Controller
public class MainController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/")
    public String Index(Locale locale, Model model) throws Exception {
        logger.info("index...");
        System.out.println("index");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);


        model.addAttribute("serverTime", formattedDate );

        return "home";
    }

    @RequestMapping("/main.do")
    public String Main(Model model) throws Exception {
        logger.info("main...");
        System.out.println("main");
        return "home";
    }
}
