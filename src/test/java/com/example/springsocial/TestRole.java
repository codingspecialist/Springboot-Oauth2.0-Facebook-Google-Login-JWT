package com.example.springsocial;

import org.junit.jupiter.api.Test;

import com.example.springsocial.model.Role;

public class TestRole {

	@Test
	public void test1() {
		System.out.println(Role.USER);
		System.out.println(Role.USER.getKey());
		System.out.println(Role.valueOf("USER"));
		System.out.println(Role.USER.getTitle());
		System.out.println(Role.USER.name());
	}
}
