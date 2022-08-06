package com.estoque.lojaanimes;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.services.AutorService;
import com.estoque.lojaanimes.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;
import java.util.Set;

//@EnableJpaRepositories
@SpringBootApplication
public class LojaAnimesApplication {


/*
	private final GeneroService generoService;
	private final AutorService autorService;
	public LojaAnimesApplication(GeneroService generoService, AutorService autorService) {
		this.generoService = generoService;
		this.autorService = autorService;
	}
*/
	public static void main(String[] args) {

		SpringApplication.run(LojaAnimesApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hello World!!!!");
		System.out.println("Hello World!!!!");
		System.out.println("Hello World!!!!");
		System.out.println("Hello World!!!!");
		System.out.println("Hello World!!!!");

		List<GeneroModel> list = generoService.buscarTodos();
		list.forEach(System.out::println);

		System.out.println("================================================");

		generoService.deletarPorId(999L);

		System.out.println("================================================");

		list = generoService.buscarTodos();
		list.forEach(System.out::println);

		System.out.println("================================================");

		generoService.deletarPorId(101L);

		System.out.println("================================================");

		list = generoService.buscarTodos();
		list.forEach(System.out::println);

		System.out.println("================================================");


		GeneroModel g = generoService.save(new GeneroModel("Shounen", "Eis o estilo de mangá que rompeu fronteiras e levou os quadrinhos japoneses mundo afora. O shounen é o gênero de mangá voltado para o público infanto-juvenil masculino. Revistas famosas como a Shounen Jump, Shounen Sunday, Shounen Magazine e a Shounen Champion proveram o surgimento de alguns dos maiores sucessos da História dos quadrinhos japoneses. Dragon Ball, Os Cavaleiros do Zodíaco, Samurai X, Yu Yu Hakusho, Inu-Yasha, Fullmetal Alchemist, Yu-Gi-Oh, Naruto, One Piece, Death Note, Kuroko no Basket, Slam Dunk, Bakuman, Negima, Another, To Love-Ru entre tantos outros são exemplos de sucesso dos shounens. Entre as principais características desse estilo estão as histórias sempre voltadas para aventura, comédia e esportes. O traço usado pelos autores, embora seja cartunesco, é detalhado, preciso, forte e atrativo."));
		System.out.println(g);

		System.out.println("================================================");

		Set<AnimeModel> am = generoService.animesPorGenero("Açãoaa");
		am.forEach(System.out::println);


		//RETRIEVE
		List<AutorModel> autores = autorService.buscarTodos();
		autores.forEach(System.out::println);

		// CREATE

		AutorModel am = new AutorModel();
		//am.setId(222L);
		am.setNome("Autor 001");
		am.setExperiencia("Publicou varios animes!!");
		AutorModel a = autorService.save(am);
		System.out.println(a);



		//UPDATE
		AutorModel am2 = new AutorModel();
		am2.setId(21L);
		am2.setNome("Autor 1");
		am2.setExperiencia("Publicou varios animes");
		AutorModel a2 = autorService.save(am2);
		System.out.println(a2);

		//DELETE
		//autorService.deleteById(11L);

		autores = autorService.buscarTodos();
		autores.forEach(System.out::println);

		System.out.println(autorService.findById(11L));

	}*/
}
