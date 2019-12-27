package indi.ZH.OfficialWeb;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@MapperScan("indi.ZH.OfficialWeb.persistence.mapper")
public class OfficialWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficialWebApplication.class, args);
	}

}
