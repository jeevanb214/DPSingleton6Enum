package com.client;

import com.singleton.Singleton;

public class ClientTest {

	public static void main(String[] args) {

		Singleton singleton1=Singleton.GetInstance;
		Singleton singleton2=Singleton.GetInstance;
		
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
		System.out.println(singleton1.welcome());
		
		

	}
}
