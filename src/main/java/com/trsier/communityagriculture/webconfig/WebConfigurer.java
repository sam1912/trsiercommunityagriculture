/**
 *
 * @project xundaowei
 * @filename WebConfigurer.java
 * @date 2016年12月8日
 * @author KeShanqiang
 *
 */

package com.trsier.communityagriculture.webconfig;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class WebConfigurer extends WebMvcConfigurerAdapter {
	@Value("${img.local.path}")
	private String imgPath;

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String localPath = "file://" + imgPath;
		
		String osName = System.getProperty("os.name");
		//判断操作系统类型
		if(osName.toLowerCase().contains("win")){
			localPath += "/";
		}
        registry.addResourceHandler("/upload/**").addResourceLocations(localPath);  
    }

	/*将新配置的MappingJackson2HttpMessageConverter添加到HttpMessageConverter中*/
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		converters.add(mappingJackson2HttpMessageConverter());
	}

	/*为MappingJackson2HttpMessageConverter配置新的ObjectMapper*/
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		return new MappingJackson2HttpMessageConverter(objectMapper());
	}

	/*配置Object的序列化器，解决new Object()返回时的错误*/
	@Bean
	public ObjectMapper objectMapper(){
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
		return objectMapper;
	}
}
