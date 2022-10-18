package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Recursos;


public class RecursosDto {

	private Long id;
	private LocalDateTime dataCriacao;
	private String marca;
	private String modelo;
	private String imei;
	private String ram;
	private String processador;
	private String condicao;
	private String observacao;
	private String tag;
	private String numChip;
	private String status;
	private String codChip;
	private String keyLicenca;
	private String mac;
	
	public RecursosDto(Recursos recursos) {	
		this.id = recursos.getId() != null ? recursos.getId():null; //codigo do leandro do esclamação para frente, serve para tratar campo null no banco de dados;
		this.dataCriacao = recursos.getDataCriacao();
		this.marca = recursos.getMarca();
		this.modelo = recursos.getModelo();
		this.imei = recursos.getImei();
		this.ram = recursos.getRam();
		this.processador = recursos.getProcessador(); 
		this.condicao = recursos.getCondicao();
		this.observacao = recursos.getObservacao();
		this.tag = recursos.getTag();
		this.numChip = recursos.getNumChip();
		this.status = recursos.getStatus();
		this.codChip = recursos.getCodChip();
		this.keyLicenca = recursos.getKeyLicença();
		this.mac = recursos.getMac();
	
		
	}
	


	public Long getId() {
		return id;
	}



	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}



	public String getMarca() {
		return marca;
	}



	public String getModelo() {
		return modelo;
	}



	public String getImei() {
		return imei;
	}



	public String getRam() {
		return ram;
	}



	public String getProcessador() {
		return processador;
	}



	public String getCondicao() {
		return condicao;
	}



	public String getObservacao() {
		return observacao;
	}



	public String getTag() {
		return tag;
	}



	public String getNumChip() {
		return numChip;
	}



	public String getStatus() {
		return status;
	}



	public String getCodChip() {
		return codChip;
	}



	public String getKeyLicenca() {
		return keyLicenca;
	}



	public static List<RecursosDto> converter(List<Recursos> recursos) {
		
		return recursos.stream().map(RecursosDto::new).collect(Collectors.toList());
	}



	public String getMac() {
		return mac;
	}



	
	
}
