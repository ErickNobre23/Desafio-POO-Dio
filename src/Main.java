import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
//import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descricao curso js");
		curso2.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		
		System.out.println(mentoria);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devErick = new Dev();
		devErick.setNome("Erick");
		devErick.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Erick:" + devErick.getConteudosInscritos());
		devErick.progredir();
		
		System.out.println("------");
		System.out.println("Conteudos Inscritos Erick:" + devErick.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Erick:" + devErick.getConteudosConcluidos());
		System.out.println("XP:" + devErick.calcularTotalXp());
		
		System.out.println("=========================");
		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		
		System.out.println("------");
		System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

		
	}

}
