package ru.perm.v.configserver1client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Properties;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/ctrl2")
public class Ctrl2 {

	@Value("${nameProp}")
	String prop;

	@Autowired
	Environment springEnv;

	@GetMapping("")
	public String getProp() {
		Properties props = new Properties();
		MutablePropertySources propSrcs = ((AbstractEnvironment) springEnv).getPropertySources();
		StreamSupport.stream(propSrcs.spliterator(), false)
				.filter(ps -> ps instanceof EnumerablePropertySource)
				.map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
				.flatMap(Arrays::<String>stream)
				.forEach(propName -> props.setProperty(propName, springEnv.getProperty(propName)));
		return prop;
	}

	/**
	 * Вывод всех свойств
	 * @return
	 */
	@GetMapping("/props")
	public Properties getallProps() {
		Properties props = new Properties();
		MutablePropertySources propSrcs = ((AbstractEnvironment) springEnv).getPropertySources();
		StreamSupport.stream(propSrcs.spliterator(), false)
				.filter(ps -> ps instanceof EnumerablePropertySource)
				.map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
				.flatMap(Arrays::<String>stream)
				.forEach(propName -> props.setProperty(propName, springEnv.getProperty(propName)));
		return props;
	}
}
