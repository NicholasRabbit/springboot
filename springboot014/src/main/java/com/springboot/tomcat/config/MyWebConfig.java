package com.springboot.tomcat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
                //设置浏览器地址栏访问路径
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:" + "E:\\localfile\\recycle\\photos" + "/" );  //设置路径对应的服务器本地根路径
        /*
        1,注意这两个参数的路径写法，"/image/**"后面有两个星号，表示多重url路径匹配
        2,第二个“file”参数不能忘记，后面的路径分割符“/”注意加上
        3,这两个参数也可再application.yml文件里设置，参照coal项目WebMvcConfig.java
        4,访问路径是:  项目根路径 + /image/ + 图片相对路径
          项目根路径：http://localhost:8080/urlmpper/bing.jpg
          例：http://localhost:8080/urlmpper/bing.jpg, 如果还有文件夹“E:\localfile\recycle\photos\football” ，则加上文件加名localhost:8080/urlmpper/football/bing.jpg
        * */
    }
}
