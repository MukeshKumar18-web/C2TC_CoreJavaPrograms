package packages_and_access_modifier_eg;

public class Test_access {

		public static void main(String[] args) {
			
			AccessModifiers amd = new AccessModifiers ();
			
			System.out.println("Public Variable: "+amd.publicVar);
			System.out.println("Protected Variable: "+amd.protectedvar);
			//System.out.println("Private Variable: "+amd.privateVar);
			System.out.println("Default Variable: "+amd.defaultvar);

		}

	}


