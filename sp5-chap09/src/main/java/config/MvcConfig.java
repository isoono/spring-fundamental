package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc //스프링 mvc 설정 활성화
public class MvcConfig implements WebMvcConfigurer {

  @Override //DispatcherServlet의 매핑 경로를 '/'로 주었을때 정적파일을 처리하기위하 설정 추가
  public void configureDefaultServletHandling(
      DefaultServletHandlerConfigurer configurer
  ) {
    configurer.enable();
  }

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp("/WEB-INF/view/", ".jsp");
  }

}
