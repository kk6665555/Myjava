package tw.test;

public class J2EE03 {
	protected static final int Stop=1;
	protected static final int Up=2;
	protected static final int Down=3;
	protected static final int Left=4;
	protected static final int Right=5;
	
	
	public static void main(String[] args) {
		
		Zone zone1 =Zone.area2;
		Zone zone2 =Zone.area2;
		//System.out.println(zone1==zone2);
		System.out.println(zone1.getCode());
		switch(zone2) {
			case area1:
				break;
			case area2:
				break;
			case area3:
				break;
			case area4:
				break;
		}
		
		int mydir = J2EE03.Down;
		switch(mydir) {
		case J2EE03.Stop:
			break;
		case J2EE03.Up:
			break;	
		case J2EE03.Down:
			break;
		case J2EE03.Left:
			break;
		case J2EE03.Right:
			break;
		}
	}

	enum Dir{
		Stop,Up,Down,Right,left
	}
	//列舉
	enum Zone{
		area1("100"),area2("102"),area3("104"),area4("106");
		private String code;
		private Zone(String code) {
			//System.out.println("zone");
			this.code=code;
		}
		
	public String getCode() {
		return code;
	}
	}
}
