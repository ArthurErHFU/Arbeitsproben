package a9_1;

public enum Rang {
	ASSISTENZARZT("Assistenzarzt", "Assistenz�rztin"), FACHARZT("Facharzt", "Fach�rztin"),
	OBERARZT("Oberarzt", "Ober�rztin"), LEITENDER_OBERARZT("Leitender Oberarzt", "Leitende Ober�rztin"),
	CHEFARZT("Chefarzt", "Chef�rztin"), DIREKTOR("Direktor", "Direktorin");

	protected String m;
	protected String w;

	private Rang(String m, String w) {
		this.m = m;
		this.w = w;
	}
}
