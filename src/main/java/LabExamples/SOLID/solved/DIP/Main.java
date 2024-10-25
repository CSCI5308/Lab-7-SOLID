package LabExamples.SOLID.solved.DIP;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Developer backendDev = new BackEndDeveloper();
		Developer frontendDevs = new FrontEndDeveloper();
		List<Developer> devList = new ArrayList<Developer>();
		devList.add(backendDev);
		devList.add(frontendDevs);
		Project pr = new Project(devList);
		pr.implement();
	}

}
