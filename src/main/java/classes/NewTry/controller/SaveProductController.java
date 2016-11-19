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
import classes.NewTry.domain.Product;
import classes.NewTry.form.ProductForm;


public class SaveProductController implements Controller {
    private static final Log logger = LogFactory.getLog(SaveProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("saveProductController called");
        ProductForm productform = new ProductForm();
        productform.setName(request.getParameter("name"));
        productform.setName(request.getParameter("description"));
        productform.setName(request.getParameter("price"));

        Product product = new Product();
        product.setName(productform.getName());
        product.setDescription(productform.getDescription());
        product.setPrice(productform.getPrice());

        return new ModelAndView("ProductDetails");
    }

}
