package org;

public class Laxman {
	public void lx() {
		System.out.println("Laxman is the brother of Ram");// eg for public
	}
	
//	 PUBLIC : ACCESSED THROUGHOUT THE PACKAGE AND OUTSIDE THE PACKAGE.
	
	protected void lxmn() {
		System.out.println("Laxman is the cousin of Ram");// eg for protected
	}
//	PROTECTED : ACCESSED THROUGHOUT THE PACKAGE AND ACCESSED OUTSIDE THE PACKAGE WITH THE HELP OF IS-A-RELATIONSHIP. We have to create a method & invoke the method.

	void laxmn() {
		System.out.println("Laxman is the little brother of Ram");// eg for default
	}
//	DEFAULT : ACCESSED THROUGHOUT THE PACKAGE.

	private void lxman() {
		System.out.println("Laxman is the little cousin of Ram");// eg for private
	}
//	PRIVATE : ACCESSED THROUGHOUT THE CLASS.

	public static void main(String[] args) {
		Laxman l = new Laxman();
		l.lxman();// private
	}

}
