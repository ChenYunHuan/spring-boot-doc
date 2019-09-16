package com.itstyle.doc.common.interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
/**
 * 拦截配置--调用链
 *
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// addPathPatterns 用于添加拦截规则 excludePathPatterns 用户排除拦截
		String[] patterns = new String[] { "/list","/modfiy" };
		registry.addInterceptor(new SysInterceptor()).addPathPatterns(patterns);
		super.addInterceptors(registry);
	}

}