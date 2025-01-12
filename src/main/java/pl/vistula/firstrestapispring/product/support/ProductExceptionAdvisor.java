package pl.vistula.firstrestapispring.product.support;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.vistula.firstrestapispring.product.support.exception.ProductNotFoundException;

import pl.vistula.firstrestapispring.shared.api.response.ErrorMessageResponse;


@ControllerAdvice
public class ProductExceptionAdvisor {

    private static final Logger LOG = LoggerFactory.getLogger(ProductExceptionAdvisor.class);

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse productNotFound (Exception e) {
        LOG.error(e.getMessage(), e);
        return new ErrorMessageResponse(e.getLocalizedMessage());
    }
}
