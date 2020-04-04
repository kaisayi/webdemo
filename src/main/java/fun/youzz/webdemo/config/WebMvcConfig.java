package fun.youzz.webdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月04日 22:42
 *
 * 全面扩展 spring MVC  所有的请求都会经过 dispatchservlet
 * 如果想要定制化一些功能，只需要编写组件 并且交给 springboot, springboot 就会自动装配
 *
 * 如果要扩展 spring MVC ，官方建议， 但不能加上 @EnableWebMvc 功能就是导入一个类，一旦加上，所有的 webMVC 自动配置失效
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean  // 自定义视图解析器
    public ViewResolver getViewResolver() {
        return new MyViewResolver();
    }

    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/test").setViewName("hallo");
    }

    public static class MyViewResolver implements ViewResolver {

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
