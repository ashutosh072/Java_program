
public class SWITCH {

	public static void main(String[] args) {
		getMoth(Moth.MARCH);
	}



	public static void getMoth(Moth month) { 
		switch (month){
		case JANUARY:
			System.out.println("winter sesson");
			break;
		case FEBRUARY:
			System.out.println("spring ");
			break;
		case MARCH:
			System.out.println("winter sesson with summer ");
			break;
		case APRIL:
			System.out.println("winter sesson");
			break;

		default:
			System.out.println("not found ");




		}
	}

}
