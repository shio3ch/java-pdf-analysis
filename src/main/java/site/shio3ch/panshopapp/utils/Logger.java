package site.shio3ch.panshopapp.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    private Logger() {
    }

    private final static Log log = LogFactory.getLog(Logger.class);

    @Before("execution(* site.test.pdfanalysis..*(..))")
    private void before(JoinPoint jp) {
        String str = "START: " + jp.getTarget().toString() + " / " + jp.getSignature().getName();
        log.info(str);
    }

    @After("execution(* site.test.pdfanalysis..*(..))")
    private void after(JoinPoint jp) {
        String str = "END: " + jp.getTarget().toString() + " / " + jp.getSignature().getName();
        log.info(str);
    }

}
