package in.Namitha.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
@Primary
public class Chip64Bit implements IChip{
	public Chip64Bit() {
		System.out.println("Chip 64 constructor");
	}
	
	@Override
	public boolean process() {
		System.out.println("64 chip bit created");
		return true;
	}

}
