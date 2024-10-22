package EE308FZ.Assignment1AddressBook.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class WebConfig implements WebMvcConfigurer {
    // 重写addCorsMappings方法以配置CORS映射
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**") // 允许所有路径
                .allowedOriginPatterns("http://127.0.0.1:5501")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .allowedHeaders("*") // 允许所有请求头
                .maxAge(3600);
    }
}
