package br.com.phc.brasileiraoapi.util;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.phc.brasileiraoapi.dto.PartidaGoogleDTO;

public class ScrapingUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(ScrapingUtil.class);
	private static final String BASE_URL_GOOGLE = "https://www.google.com.br/search?q=";
	private static final String COMPLEMENTO_URL_GOOGLE = "&hl=pt-BR";

	public static void main(String[] args) {

		String url = BASE_URL_GOOGLE + "Palmeiras+x+corinhians+08/08/2020" + COMPLEMENTO_URL_GOOGLE;

		ScrapingUtil scraping = new ScrapingUtil();
		scraping.obtemInfoPartida(url);

	}

	public PartidaGoogleDTO obtemInfoPartida(String url) {

		PartidaGoogleDTO partida = new PartidaGoogleDTO();

		Document document = null;
		
		try{
			document = Jsoup.connect(url).get();	
			
			String title = document.title();
			LOGGER.info("Titulo da pagina:  {}", title);
			
		} catch (IOException e){
			LOGGER.error("Erro para conectar ao google com o JSOUP -> {}", e.getMessage());
			e.printStackTrace();
		}
		

		return partida;

	}

}
