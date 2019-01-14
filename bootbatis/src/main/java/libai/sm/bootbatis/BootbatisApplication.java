package libai.sm.bootbatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("libai.sm.bootbatis.dao")
public class BootbatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootbatisApplication.class, args);
	}

}

