package kr.java.springweb;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;
import kr.java.springweb.config.AppConfig;
import kr.java.springweb.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // Context를 만드는 작업 -> Context를 Tomcat
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(AppConfig.class); // config
        ctx.register(WebConfig.class); // config

        // DispatcherServlet <- 중앙에 위치시킨 다음에 Spring에서 등록된 여러 페이지들을 알아서 배치 (Controller)
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ctx);
        ServletRegistration.Dynamic registration =
                servletContext.addServlet("dispatcher", dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
