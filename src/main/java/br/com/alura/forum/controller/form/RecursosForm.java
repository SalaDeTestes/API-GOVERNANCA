	package br.com.alura.forum.controller.form;

	import javax.validation.constraints.NotEmpty;
	import javax.validation.constraints.NotNull;

	import br.com.alura.forum.modelo.Recursos;

	public class RecursosForm {
		
		@NotNull @NotEmpty
		private String marca;
		@NotNull @NotEmpty
		private String modelo;
		private String imei;
		private String ram;
		private String processador;
		@NotNull @NotEmpty
		private String condicao;
		private String observacao;
		@NotNull @NotEmpty
		private String tag;
		private String numChip;
		private String status;
		private String codChip;
		private String keyLicenca;
		private String mac;
		private byte[] imagem;

		
			
			
			
			public String getMac() {
			return mac;
		}



		public void setMac(String mac) {
			this.mac = mac;
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



		public String getKeyLicenca() {
			return keyLicenca;
		}



		public void setKeyLicenca(String keyLicenca) {
			this.keyLicenca = keyLicenca;
		}

			
		
		public byte[] getImagem() {
			return imagem;
		}



		public void setImagem(byte[] imagem) {
			this.imagem = imagem;
		}
		
		



		public Recursos formulario() {
			
			Recursos recursos = new Recursos();
			recursos.setMarca(marca);
			recursos.setModelo(modelo);
			recursos.setCodChip(codChip);
			recursos.setImei(imei);
			recursos.setKeyLicença(keyLicenca);
			recursos.setProcessador(processador);
			recursos.setObservacao(observacao);
			recursos.setTag(tag);
			recursos.setCondicao(condicao);
			recursos.setStatus(status);
			recursos.setNumChip(numChip);
			recursos.setRam(ram);
			recursos.setImagem(imagem);
			recursos.setMac(mac);
			
			return recursos;
		}


		
	

}
