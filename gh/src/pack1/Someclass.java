package pack1;

public class Someclass {
	public static Myinterface getMyinterface() {
		return new Myinterface() {

			@Override
			public void disp() {
				// TODO Auto-generated method stub
				System.out.println("inside anonymous class");
			}
			
		};
	}

}
