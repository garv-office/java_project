package a.b;
//default : package private
public class A {

	private int i=10;
	  int j=100;
	protected int k=1000;
	public int l=10000;
	
	private void fooPrivate() {
		System.out.println("private void fooPrivate()");
	}
	
	 void fooDefault() {
		System.out.println("void fooDefault() ");
	}
	
	protected void fooProtected() {
		System.out.println("protected void fooProtected()");
	}
	
	public void fooPublic() {
		System.out.println("public void fooPublic()");
	}
	
}
