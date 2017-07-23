package tw.test;

import java.lang.reflect.Constructor;

public class J2EE04 {

	public static void main(String[] args) {
		String[] name = {"Mike"};
		Class mikeclass = name.getClass();	
		System.out.println(mikeclass.getName());
		System.out.println(mikeclass.isInterface());
		System.out.println(mikeclass.isPrimitive());
		System.out.println(mikeclass.isArray());
		System.out.println(mikeclass.getSuperclass().getName());
		System.out.println("-----");
		Class strclass = String.class;
		System.out.println(strclass.getName());
		System.out.println(strclass.isInterface());
		System.out.println(strclass.isPrimitive());
		System.out.println(strclass.isArray());
		System.out.println(strclass.getSuperclass().getName());
		System.out.println("-----");
		
		try {
			Class c1 = Class.forName("tw.test.J2EE041");
			c1.newInstance();//產生物件實體
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("------");
		try {
			Class c2 = Class.forName("tw.test.one.J2EE01");
			System.out.println(c2.getName());
			System.out.println(c2.getPackage().getName());
			Constructor[] cs = c2.getConstructors();//建構式
			System.out.println(cs.length);
			for(Constructor cc:cs) {
				Class[] types =  cc.getParameterTypes();
				for(Class type:types) {
					System.out.println(type.getName());
				}
				System.out.println("---");
			}
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}



class J2EE041{
	static {
		System.out.println("Load J2ee041");
		
	}
	{
		System.out.println("J2ee041");
	}
	
}

