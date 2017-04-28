package com.trsier.communityagriculture;

import com.trsier.communityagriculture.common.properties.WxAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

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
public class Application{


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}