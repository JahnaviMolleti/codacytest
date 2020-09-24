package com.trisor.user.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.trisor.user.model.User;
import com.trisor.user.service.UserService;

@Component
public class UserMutation implements GraphQLMutationResolver {

	@Autowired
	private UserService userService;
	
	public User createUser(String firstName,String familyName, String email) {
		return userService.createUser(firstName, familyName, email);
	}
}
