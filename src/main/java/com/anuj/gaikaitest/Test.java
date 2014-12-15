package com.anuj.gaikaitest;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.anuj.gaikaitest.model.Game;

// Parsing Metacritic’s PS3 Game Page
// Write an application which can do the following:
// 1. Parse the HTML for the “Top Playstation 3 Games (By Metascore)” on Metacritic’s PS3 page:
// (http://www.metacritic.com/game/playstation­3). Expose a method which can return the parsed
// information as an array of JSON elements that looks like the following:
// [
// {
// "title": "XCOM: Enemy Within",
// “score”: 88
// },
// {
// "title": "Assasin’s Creed IV: Black Flag",
// “score”: 88
// }
// ... etc ...
// ]
// 2. Expose a REST API for retrieving top PS3 games. There should be 2 exposed methods:
// ●
// ●
// A HTTP “GET” request a “/games” returns all top PS3 games on metacritic page
// A HTTP “GET” request at “/games/TITLE_OF_GAME_GOES_HERE” returns JSON for a
// specific job that matches the corresponding job title. For example, an HTTP GET at
// /games/Gran%20Turismo%206 should return an individual JSON object for Gran
// Turismo 6 like so:
// {
// "title": "Gran Turismo 6",
// “score”: 81
// }
// Ideally, you should be able to demonstrate that your functionality is working as expected via
// unit
// tests. Additionally, provide detailed “How­To” documentation that demonstrate that Steps 1 and
// 2 are complete and work as expected.
public class Test {
  public static void main(String[] args) {
    // Document doc;
    // try {
    //
    // // need http protocol
    // doc =
    // Jsoup
    // .connect("http://www.metacritic.com/game/playstation-3")
    // .userAgent("Mozilla").get();
    //
    // // get page title
    // String title = doc.title();
    // System.out.println("title : " + title);
    //
    // // get all links
    // Elements links = doc.select("div.module");
    // for (Element link : links) {
    // // get the value from href attribute
    // System.out.println("\nlink : " + link.attr("href"));
    // System.out.println("text : " + link.text());
    // }
    //
    // } catch (IOException e) {
    // e.printStackTrace();
    // }

    Game game = new Game("Anuj", "Kulkarni");
    System.out.println(game);

  }
}
