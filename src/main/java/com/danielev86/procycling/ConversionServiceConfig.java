package com.danielev86.procycling;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import com.danielev86.procycling.converter.TeamDTOConverter;
import com.danielev86.procycling.converter.TeamDetailDTOConverter;


@Configuration
public class ConversionServiceConfig {

	@Bean
	public ConversionService conversionService() {
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		bean.setConverters(getConverter());
		bean.afterPropertiesSet();
		ConversionService object = bean.getObject();
		return object;
	}
	
	private Set<Converter> getConverter(){
		Set<Converter> converters = new HashSet<>();
		converters.add(new TeamDTOConverter());
		converters.add(new TeamDetailDTOConverter());
		return converters;
	}
}
