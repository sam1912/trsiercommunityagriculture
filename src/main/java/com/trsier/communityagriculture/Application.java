package com.trsier.communityagriculture;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.trsier.communityagriculture.common.constant.ApiConstant;
import com.trsier.communityagriculture.common.properties.WxAuth;
import com.trsier.communityagriculture.entity.auth.AppKey;
import com.trsier.communityagriculture.repository.AppKeyRepository;
import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.SocketUtils;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Shanqiang Ke
 * @version 1.0.0
 * @blog http://nosqlcoco.cnblogs.com
 * @since 2016-10-15
 */
@SpringBootApplication
@ComponentScan(value = "com.trsier.communityagriculture")
@EnableConfigurationProperties(value={WxAuth.class})
public class Application implements CommandLineRunner{

	@Autowired
	private AppKeyRepository appKeyRepository;

	private static ImmutableMap<String,String> errorCodeMap = null;
	static {
		try{
			Properties properties = PropertiesLoaderUtils.loadAllProperties("error_code.properties");
			errorCodeMap = Maps.fromProperties(properties);
		}catch (IOException e){
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(errorCodeMap);
	}

	@Override
	public void run(String... strings) throws Exception {
		appKeyRepository.deleteAll();
		String[] apiNames = new String[]{ApiConstant.GET_USER,ApiConstant.POST_USER,ApiConstant.PUT_USER,
				ApiConstant.DELETE_USER,ApiConstant.WX_CODE,ApiConstant.WX_DECODE_USERINFO};
		Map<String,Map<String,Integer>> apiMap = Maps.newHashMap();
		for(String apiName:apiNames){
			Map<String,Integer> tmpMap = new HashMap<String, Integer>();
			tmpMap.put("calltimes",0);
			tmpMap.put("alltimes",10000);
			apiMap.put(apiName,tmpMap);
		}
		appKeyRepository.save(new AppKey("JWEJIJ345QHWJKENVKF", "sdsd", new Date(), new Date(), "1", false, apiMap));
	}
	@Bean
	public ImmutableMap<String, String> errorCodeMap(){
		return errorCodeMap;
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		tomcat.addAdditionalTomcatConnectors(createStandardConnector());
		return tomcat;
	}

	@Bean
	public Integer port() {
		return SocketUtils.findAvailableTcpPort();
	}

	private Connector createStandardConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		connector.setPort(port());
		return connector;
	}
}