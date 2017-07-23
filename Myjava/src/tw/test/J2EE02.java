package tw.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class J2EE02 {

	public static void main(String[] args) {
//		J2EE021 obj = new J2EE021();
//		obj.m1();
//		J2EE022 obj2 = new J2EE022();
//		obj2.m1();
//		J2EE023 obj3 = new J2EE023();
//		obj3.m1();
		J2EE025 obj5 = new J2EE025();
		obj5.m1();
	}

}

//Marker annotation => 自己本身提供資訊
@interface debug{}

class J2EE021{
	@debug
	void m1() {}
}

@interface debug2{
	String value();
}

class J2EE022{
	@debug2(value="試試")
	void m1() {}
	
}
class J2EE023{
	@debug2("試試")
	void m1() {}
}
//傳遞多個值
@interface debug3{
	String[] value();	
}
class J2EE024{
	@debug3(value={"1","2","3"})
	//@debug3({"1","2","3"})
	void m1() {}
}

@Retention(RetentionPolicy.RUNTIME) //宣告用來處理Runtime階段
@interface debug4{
	String[] value() default "ONE";
}
class J2EE025{
	@debug4()
	 public  void m1(){
	 	
		try {
			debug4 bug4 = getClass().getMethod("m1", null).getAnnotation(debug4.class);
			String[] values = bug4.value();
			for (String value : values) {
				System.out.println(value);
			}	
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}
}
@Retention(RetentionPolicy.RUNTIME)
@interface debug5{
	public enum Dir{
		Stop,Up,Down,Right,Left
	};
	Dir dir() default Dir.Stop;
	String[] names() default {"guest"};
	boolean iswinner() default false;
}

class J2EE026{
	@debug5(
		dir= debug5.Dir.Left,
		names= {"one","two"}
	)
	public void m1() {
		try {
			debug5 bug5 = getClass().getMethod("m1", null).getAnnotation(debug5.class);
			String[] names = bug5.names();
			for (String name : names) {
				System.out.println(name);
			}	
		} catch (NoSuchMethodException e) {
			System.out.println(e);
		} catch (SecurityException e) {
			System.out.println(e);
		}
	}
}