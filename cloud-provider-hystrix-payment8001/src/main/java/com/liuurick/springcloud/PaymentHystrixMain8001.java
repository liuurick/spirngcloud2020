package com.liuurick.springcloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * Created by liubin on 2021/1/17
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8001 {
    /**
     *
     *    开启hystrix的仪表盘监控 坑的解决方案
     *
     *    此配置是为了服务监控而配置，与服务容错本身无关，SpringCloud升级后的坑
     *    ServletRegistrationBean 因为springboot的默认路径不是 "/hystrix.stream"
     *   只要在自己的项目里配置上下面的Servlet就可以了
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}



