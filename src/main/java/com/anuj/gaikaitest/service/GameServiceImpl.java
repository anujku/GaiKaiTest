package com.anuj.gaikaitest.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.anuj.gaikaitest.model.Game;

public class GameServiceImpl implements GameService {

  public List<Game> getTopGames() {
    List<Game> games = new ArrayList<Game>();

    Document doc;
    try {
      doc =
          Jsoup
              .connect("http://www.metacritic.com/game/playstation-3")
              .userAgent("Mozilla").get();

      // get all links
      Elements links = doc.select("div.module");
      Game game;
      int count = 0;
      for (Element link : links) {
        game = new Game(link.text(), String.valueOf(count));
        System.out.println("\nlink : " + link.attr("href"));
        System.out.println("text : " + link.text());
        games.add(game);
        count++;
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return games;
  }

}
