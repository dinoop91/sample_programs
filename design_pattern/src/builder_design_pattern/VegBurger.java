package builder_design_pattern;

public class VegBurger extends Burger {
	@Override
	public float price() {
		return 25.0f;
	}
	@Override
	public String name() {
		return "Veg Burger";
	}
}
