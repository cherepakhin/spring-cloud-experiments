package ru.perm.v.zuulclient1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableZuulProxy
public class ZuulConfiguration {
	private final static Logger logger = LoggerFactory.getLogger(ZuulConfiguration.class);

	@Bean
	public CommandLineRunner commandLineRunner(RouteLocator routeLocator) {
		return args -> routeLocator.getRoutes().forEach(
				r -> logger.info(String.format("%s (%s) %s", r.getId(), r.getLocation(), r.getFullPath()))
		);
	}
}
