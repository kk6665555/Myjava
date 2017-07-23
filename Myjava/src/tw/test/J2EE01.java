package tw.test;


/*Annotation => key-value => metadata
1.Compile Time
2.發布時期
3.Run Time 執行階段
格式:@Entity
@Author(name="作者",date="作的時間")
@xxx(value="default")
@xxx("default")
可同時多個
@Author("作者1") 變為陣列
@Author("作者2")
@Author("作者3")
*/

public class J2EE01 {
	public static void main(String[] args) {
		test1 obg =new test1();
		
	obg.m1();
	obg.m2();
	}

}


class test1{
	void m1() {};
	
	@Deprecated//意味著以後可能遭到刪除
	void m2() {};
	
}

class test2 extends test1{
	@Override
	void m1() {}
	//@Override
	void m11() {}
	
}
