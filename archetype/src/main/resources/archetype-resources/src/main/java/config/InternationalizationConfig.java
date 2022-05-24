package ${package}.config;

import com.viettel.vtskit.common.config.AbstractInternationalizationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class InternationalizationConfig extends AbstractInternationalizationConfig {

    @Override
    protected String getDefaultLanguage() {
        return LOCALE_VI.getLanguage();
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new InternationalizationConfig();
    }

}
