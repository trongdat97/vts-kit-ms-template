package ${package};

import com.viettel.vtskit.common.rest.AbstractApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class Application extends AbstractApplication {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
