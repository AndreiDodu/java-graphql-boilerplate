package com.andreidodu.boilerplate.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.boilerplate.dto.DataBis;
import com.andreidodu.boilerplate.service.DataBisService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class DataBisResolver implements GraphQLQueryResolver {

	@Autowired
	private DataBisService dataBisService;

	public DataBis getDataBis(Long id) {
		return this.dataBisService.findById(id);
	}

}
