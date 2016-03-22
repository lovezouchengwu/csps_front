package com.edot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.edot.util.ExceptionUtils;
import com.edot.web.exception.BizException;
import com.edot.web.exception.BizJsonException;
import com.edot.web.exception.BizJsonExceptionResponse;

/**
 * 控制基类
 * Created by tony on 16/2/3.
 */
public class BaseController {

    private static final int BIZ_EXCEPTION_CODE = 210;

    private final Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private MessageSource messageSource;
    
    @InitBinder  
    public void initBinder(WebDataBinder binder) {  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        dateFormat.setLenient(false);  
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));  
    }

    @ExceptionHandler({BizJsonException.class})
    @ResponseBody
    public BizJsonExceptionResponse handleBizJsonException(BizJsonException bizJsonException, HttpServletResponse response) {
        BizJsonExceptionResponse bizJsonExceptionResponse = new BizJsonExceptionResponse();
        bizJsonExceptionResponse.setCode(bizJsonException.getCode());
        bizJsonExceptionResponse.setMessage(messageSource.getMessage(bizJsonException.getCode(), null, null));
        bizJsonExceptionResponse.setData(bizJsonException.getData());
        response.setStatus(BIZ_EXCEPTION_CODE);
        return bizJsonExceptionResponse;
    }

    @ExceptionHandler({BizException.class})
    public ModelAndView handleBizException(BizException bizException) {
        ModelAndView mav = new ModelAndView("error/bizError");
        logger.error(ExceptionUtils.getExceptionTrace(bizException));
        mav.addObject("error", bizException.getMessage());
        return mav;
    }

    @ExceptionHandler({Exception.class})
    public ModelAndView handleException(Exception exception) {
        ModelAndView mav = new ModelAndView("error/error");
        logger.error(ExceptionUtils.getExceptionTrace(exception));
        mav.addObject("error", exception.getMessage());
        return mav;
    }
}
