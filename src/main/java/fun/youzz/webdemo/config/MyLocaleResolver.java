package fun.youzz.webdemo.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author : kaisayi
 * @Project: webdemo
 * @date Date : 2020年04月05日 22:40
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        // 获取参数中的语言
        String lang = httpServletRequest.getParameter("l");
        System.out.println("LANG: " + lang);
        Locale locale = Locale.getDefault();
        if (!StringUtils.isEmpty(lang)) {
            String[] fields = lang.split("_");
            locale = new Locale(fields[0], fields[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
