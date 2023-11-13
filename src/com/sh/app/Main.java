package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Dog;
import com.sh.app.animal.Lion;
import com.sh.app.animal.Monkey;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		System.out.println("동물기능 시작~");
		System.out.println("Animal Go~");
		new Dog().bark();
		new Lion().walk();
		new Bird().fly();
		new Monkey().run();
	}
	
	public void test() {
		System.out.println("Main#test");
		System.out.println("Main#test");
	}
}
