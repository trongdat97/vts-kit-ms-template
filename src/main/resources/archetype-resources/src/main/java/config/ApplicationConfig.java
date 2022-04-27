#set( $symbol_dollar = '$' )
#set( $symbol_point = ':' )
package ${package}.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "ms-config")
@Data
public class ApplicationConfig {

    @Value("${symbol_dollar}{exampleValue${symbol_point}}")
    private String exampleValue;

    @Value("${symbol_dollar}{exampleSecure${symbol_point}}")
    private String exampleSecure;
}
