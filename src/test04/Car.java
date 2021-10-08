package test04;

public class Car {
	
	private Wheel Wheel;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(test04.Wheel wheel) {
		super();
		Wheel = wheel;
	}

	public Wheel getWheel() {
		return Wheel;
	}

	public void setWheel(Wheel wheel) {
		Wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [Wheel=" + Wheel + "]";
	}
	
	

}
