package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ, pattern = "member..*Dao")
)
public class AppCtx {


}
