package br.com.alura.forum.modelo;

	import java.time.LocalDateTime;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.Lob;


	@Entity
	public class Recursos {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private LocalDateTime dataCriacao = LocalDateTime.now();
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
		@Lob
		private byte[] imagem;
		
		
		

		
		public Recursos() {

		}


		public Recursos(String marca, String modelo, String imei, String ram, String processador, String condicao, String observacao, String tag, String numChip, String status, String codChip, String keyLicenca, String mac ) {
			
			this.marca = marca;
			this.modelo = modelo;
			this.imei = imei;
			this.ram = ram;
			this.processador = processador; 
			this.condicao = condicao;
			this.observacao = observacao;
			this.tag = tag;
			this.numChip = numChip;
			this.status = status;
			this.codChip = codChip;
			this.keyLicenca = keyLicenca;
			this.mac = mac;
			
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public LocalDateTime getDataCriacao() {
			return dataCriacao;
		}


		public void setDataCriacao(LocalDateTime dataCriacao) {
			this.dataCriacao = dataCriacao;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public String getImei() {
			return imei;
		}


		public void setImei(String imei) {
			this.imei = imei;
		}


		public String getRam() {
			return ram;
		}


		public void setRam(String ram) {
			this.ram = ram;
		}


		public String getProcessador() {
			return processador;
		}


		public void setProcessador(String processador) {
			this.processador = processador;
		}


		public String getCondicao() {
			return condicao;
		}


		public void setCondicao(String condicao) {
			this.condicao = condicao;
		}


		public String getObservacao() {
			return observacao;
		}


		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}


		public String getTag() {
			return tag;
		}


		public void setTag(String tag) {
			this.tag = tag;
		}


		public String getNumChip() {
			return numChip;
		}


		public void setNumChip(String numChip) {
			this.numChip = numChip;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public String getCodChip() {
			return codChip;
		}


		public void setCodChip(String codChip) {
			this.codChip = codChip;
		}


		public String getKeyLicença() {
			return keyLicenca;
		}


		public void setKeyLicença(String keyLicenca) {
			this.keyLicenca = keyLicenca;
		}


		public String getMac() {
			return mac;
		}


		public void setMac(String mac) {
			this.mac = mac;
		}


		public byte[] getImagem() {
			return imagem;
		}


		public void setImagem(byte[] imagem) {
			this.imagem = imagem;
		}
		
		
		



	}



