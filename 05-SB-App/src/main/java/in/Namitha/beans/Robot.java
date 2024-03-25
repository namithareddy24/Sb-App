package in.Namitha.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//ByType
//@Qualifier("chip64")
public class Robot {
	@Autowired
	/* byName
	private IChip chip32;*/	
	private IChip chip;
	public Robot() {
		System.out.println("Robot constructor");
	}
	public void doWork() {
		/* byName
		  boolean status=chip32.process();*/
		boolean status=chip.process();
		if(status) {
			System.out.println("Working");
		}
		else {
			System.out.println("Not working");
		}
	}

}
