package zlicense.create;



public class licenseCreateTest {
	public static void main(String[] args){
		CreateLicense cLicense = new CreateLicense();
		
		cLicense.setParam("src/main/resources/createparam.properties");
		//
		cLicense.create();
	}
}
