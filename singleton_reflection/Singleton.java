package singleton_reflection;

import java.lang.reflect.Constructor;

public class Singleton {
	private static Singleton s;
	private Singleton(){
		System.out.println("Testing...");
	};
	public static Singleton getInstance(){
		if(s==null){
			s=new Singleton();
		}
		return s;
	}
}


