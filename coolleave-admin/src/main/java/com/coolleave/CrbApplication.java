package com.coolleave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author coolleave
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CrbApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CrbApplication.class, args);
        System.out.println("传染病上报与预警系统启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
