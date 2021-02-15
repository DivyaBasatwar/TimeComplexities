package polynomialTime;

public class FindRootsOfEquation {

	public static void main(String[] args) {
		//find the roots of equation  3x + 9y + 8z = 79
		for(int i=0;i<79;i++) {
			for(int j=0;j<79;j++) {
				for(int k=0;k<79;k++) {
					if(((3*i) + (9*j) + (8*k))==79) {
						System.out.println("Roots of equation are...");
						System.out.println(i+" "+j+" "+k);
						break;
					}
				}
			}
		}

	}

}
