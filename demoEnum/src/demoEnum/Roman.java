package demoEnum;

public enum Roman {
	I(1), II(2), III(3), V(5), X(10), L(50), C(100), D(500), M(1000);

	private int value;

	Roman(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
