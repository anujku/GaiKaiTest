package com.anuj.gaikaitest.web.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.anuj.gaikaitest.model.Game;
import com.anuj.gaikaitest.service.GameService;
import com.anuj.gaikaitest.service.GameServiceImpl;

@Path("/games")
public class GameRestService {

  @GET
  @Path("/game")
  @Produces(MediaType.APPLICATION_JSON)
  public String getTopGames() {
    GameService gameService = new GameServiceImpl();
    List<Game> games = gameService.getTopGames();
    return games.toString();
  }
}
