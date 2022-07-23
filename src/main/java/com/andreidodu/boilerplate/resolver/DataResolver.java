package com.andreidodu.boilerplate.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andreidodu.boilerplate.dto.Data;
import com.andreidodu.boilerplate.service.DataService;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class DataResolver implements GraphQLQueryResolver {

	@Autowired
	private DataService domandaService;

	public Data getData(String id) {
		return this.domandaService.findById(id);
	}

}
