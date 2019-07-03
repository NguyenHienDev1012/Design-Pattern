package singleton_reflection;

import java.lang.reflect.Field;

public class TestField {
public static void main(String[] args) throws Exception{
	ReflectField r=new ReflectField();
	
	Field field1=ReflectField.class.getDeclaredField("name");
	field1.setAccessible(true);
    System.out.println(field1.get(r));
     
    Field field2=ReflectField.class.getDeclaredField("age");
    field2.setAccessible(true);
    
    field2.set(r, 10);
    System.out.println(field2.get(r));
}
}
