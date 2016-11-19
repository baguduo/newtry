package classes.NewTry.controller;

/**
 * Created by user on 2016/3/21.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InputProductController implements Controller {
    //private  static final Log logger=LogFactory.getLog(InputProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        int a = 9;
        //logger.info("InputProductController called");
        return new ModelAndView("hello");
    }

}
