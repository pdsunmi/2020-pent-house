package com.ssafy.happyhouse;

import java.util.Arrays;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ssafy.happyhouse.interceptor.JwtInterceptor;



@SpringBootApplication
@MapperScan(value = "com.ssafy.happyhouse.model.repo")
public class HappyHouseSpringApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(HappyHouseSpringApplication.class, args);
	}
	@Autowired
    private JwtInterceptor jwtInterceptor;

//    JWTInterceptor를 설치한다.
    @Override //이 조건에 만족하는 애들 검사하겠다. 
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwtInterceptor).addPathPatterns("/user/**") // 기본 적용 경로
                .excludePathPatterns(Arrays.asList("/user/confirm/**", "/user/register"));// 적용 제외 경로
    }// 유저안은 다 검사하는데 컨펌으로 들어가는건 검사 안하겠다. 

//    Interceptor를 이용해서 처리하므로 전역의 Corss Origin 처리를 해준다.
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("auth-token");
    }
	

}
