package com.lujianbuping.utils;

public class UUID {
	
	public static String randomUUIDWithOutConcatChar() {
		return java.util.UUID.randomUUID().toString().replace("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(randomUUIDWithOutConcatChar());
	}
}
