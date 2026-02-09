package com.hk.boot.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目的启动类
 *
 * @author maxiaodong
 */
@SuppressWarnings("SpringComponentScan") // 忽略 IDEA 无法识别 ${huike.info.base-package}
@SpringBootApplication(scanBasePackages = {"${huike.info.base-package}.server", "${huike.info.base-package}.module"})
public class HuikeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuikeServerApplication.class, args);

    }

}
