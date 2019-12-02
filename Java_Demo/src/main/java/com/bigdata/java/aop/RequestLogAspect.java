/**
   guozh
 * 2019年12月2日
 */
package com.bigdata.java.aop;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author guozh
 *1、what
 *2、where @Pointcut
 *3、when
 * 创建时间：2019年12月2日 下午3:56:13
 */
@Aspect
@Component
public class RequestLogAspect {
	private static final Logger logger = LoggerFactory.getLogger(RequestLogAspect.class);
	
	@Pointcut("execution(public * com.bigdata.java.web..*.*(..))")
	public void webLog() {}
	
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) {
		//记录请求内容
		logger.info("logger 开始了");
	}
	
	@AfterReturning(returning ="ret" ,pointcut="webLog()")
	public void doAfter(Object ret) {
		logger.info("response: " + ret);
	}
	
}
