package Practice;

public class MainClass {

	public static void main(String[] args) {

		String[] nameList = {"유빈", "지원", "근희"};
		int[] ageList = {30, 29, 30};
		
		Home home = new Home(nameList.length);
		
		for(int i = 0; i < home.getArr().length; i++) {
			home.getArr()[i] = new Person(nameList[i], ageList[i]);
			System.out.println(home.getArr()[i].getName() +  " " + home.getArr()[i].getAge());
		}
	}
}
