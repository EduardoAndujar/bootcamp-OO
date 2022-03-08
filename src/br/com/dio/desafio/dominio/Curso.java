package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

	private int cargaHoraria;
	
	// Metodos
	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}
	
	// Getters and Setters
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	// toString
	@Override
	public String toString() {
		return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
}
