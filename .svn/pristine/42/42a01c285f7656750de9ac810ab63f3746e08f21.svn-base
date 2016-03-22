package com.edot.support;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class PageAop {

    @Pointcut("execution(* com.edot.controller.*..*(..)) and @annotation(com.edot.support.Page)")
    public void point() {}

    @SuppressWarnings("unchecked")
	@Around("point()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
    	Method method = getMethod(joinPoint);
    	Page page = AnnotationUtils.findAnnotation(method, Page.class);
    	if (page != null) {
	        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	        for (Object arg : joinPoint.getArgs()) {
	        	if (arg instanceof Model) {
	        		Model model = (Model) arg;
	        		Map<String, String> params = new HashMap<>();
	        		Enumeration<String> names = request.getParameterNames();
	        		while (names.hasMoreElements()) {
	        			String name = names.nextElement();
	        			params.put(name, request.getParameter(name));
	        		}
	        		model.addAttribute("params", params);
	        		model.addAttribute("method", request.getMethod());
	        		model.addAttribute("uri", request.getRequestURI());
	        	}
	        }
    	}
        Object result = joinPoint.proceed();
        return result;
    }
    
    private Method getMethod(ProceedingJoinPoint joinPoint) throws NoSuchMethodException, SecurityException {
    	Signature sig = joinPoint.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Object target = joinPoint.getTarget();
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
        return currentMethod;
    }
}
