package singleton_reflection;

import java.lang.reflect.Constructor;

public class TestSingleton {
	public static void main(String[] args) throws Exception {

		Constructor<Singleton> construct = Singleton.class.getDeclaredConstructor();
		construct.setAccessible(true);
		System.out.println("Reflection constructor");
		Singleton i1 = construct.newInstance();
		Singleton i2 = construct.newInstance();

		System.out.println("_________________");
		System.out.println("Singleton");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}
