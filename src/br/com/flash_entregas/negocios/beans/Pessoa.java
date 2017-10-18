package br.com.flash_entregas.negocios.beans;


public class Pessoa implements Comparable<Pessoa>{

	/**
	 * 
	 */
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String email;

	public Pessoa(){

	}

	public Pessoa(String nome, String cpf, String dataNascimento,String email){
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public boolean equals(Pessoa p){
		boolean retorno = false;
		if (p != null){
			
			retorno = (this.nome.equalsIgnoreCase(p.nome) && this.cpf.equals(p.cpf));
		}
		return retorno;		
	}
	
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("Nome: " +this.getNome()+ "\n");
		buffer.append("\nCPF: " + this.getCpf());
		
		return buffer.toString();
	}

	@Override
	public int compareTo(Pessoa p) {
		return this.nome.compareTo(p.getNome());
	}
}
