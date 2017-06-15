package com.boaglio.minhasmoedas.teste.core;

public enum Site {

	host("http://localhost:8081/"),
	homeTitle("Minhas Moedas"),
	user("boaglio"),
	password("boaglio"),
	login("/entrar"),
	loginWelcome("de hoje");


	Site (String n) {
		this.value=n;
	}

	private String value;

	public String value() {
		return value;
	}
}
