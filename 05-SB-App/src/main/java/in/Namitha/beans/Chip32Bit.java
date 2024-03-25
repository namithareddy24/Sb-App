package in.Namitha.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip32")
//@Primary
public class Chip32Bit implements IChip{
	public Chip32Bit() {
		System.out.println("32 bit constructor");
	}
	@Override
	public boolean process() {
		System.out.println("32 chip bit created");
		return true;
		
	}
	

}
