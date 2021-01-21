package br.com.phc.brasileiraoapi.dto;

import java.io.Serializable;

public class PartidaGoogleDTO implements Serializable {

	private static long serialVersionUID = 1L;

	private String statusPartida;
	private String tempoPartida;

	private String nomeEquipeCasa;
	private String urlLogoEquipeCasa;
	private Integer placarEquipeCasa;
	private String golsEquipeCasa;
	private String placarEstendidoEquipeCasa;
	
	private String nomeEquipeVisitante;
	private String urlLogoEquipeVisitante;
	private Integer placarEquipeVisitante;
	private String golsEquipeVisitante;
	private String placarEstendidoEquipeVisitante;

}
