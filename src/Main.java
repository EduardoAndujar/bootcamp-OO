import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do Curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição do Curso JavaScript");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição do Mentoria Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devEduardo = new Dev();
		devEduardo.setNome("Eduardo");
		devEduardo.inscreverBootcamp(bootcamp);
		System.out.println("Eduardo - Conteudos inscritos: " + devEduardo.getConteudosInscritos());
		devEduardo.progredir();
		System.out.println("Eduardo - Conteudos inscritos: " + devEduardo.getConteudosInscritos());
		System.out.println("Eduardo - Conteudos concluidos: " + devEduardo.getConteudosConcluidos());
		System.out.println("Eduardo - XP: " + devEduardo.calcularTotalXp());
		
		System.out.println("--------------------------------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Camila - Conteudos inscritos: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("Camila - Conteudos inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Camila - Conteudos concluidos: " + devCamila.getConteudosConcluidos());
		System.out.println("Camila - XP: " + devCamila.calcularTotalXp());

		
		System.out.println("--------------------------------");

		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("João - Conteudos inscritos: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("João - Conteudos inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("João - Conteudos concluidos: " + devJoao.getConteudosConcluidos());
		System.out.println("João - XP: " + devJoao.calcularTotalXp());


	}

}
