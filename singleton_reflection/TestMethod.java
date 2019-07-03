package singleton_reflection;

import java.lang.reflect.Method;

public class TestMethod {
	public static void main(String[] args) throws Exception{
		ReflectMethod m=new ReflectMethod("Hue",9);
		
		Method method=ReflectMethod.class.getDeclaredMethod("getName");
		method.setAccessible(true);
		
		Method m2=ReflectMethod.class.getDeclaredMethod("getAge");
		m2.setAccessible(true);
		System.out.println(m2.invoke(m));
		System.out.println(method.invoke(m));
	}

}
