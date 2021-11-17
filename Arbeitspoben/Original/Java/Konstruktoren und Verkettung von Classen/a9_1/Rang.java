package a9_1;

public enum Rang {
	ASSISTENZARZT("Assistenzarzt", "Assistenzärztin"), FACHARZT("Facharzt", "Fachärztin"),
	OBERARZT("Oberarzt", "Oberärztin"), LEITENDER_OBERARZT("Leitender Oberarzt", "Leitende Oberärztin"),
	CHEFARZT("Chefarzt", "Chefärztin"), DIREKTOR("Direktor", "Direktorin");

	protected String m;
	protected String w;

	private Rang(String m, String w) {
		this.m = m;
		this.w = w;
	}
}
