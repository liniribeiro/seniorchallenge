package br.com.seniorchallenge.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.seniorchallenge.model.Mars;


@Path("/mars")
public class RobotService {
		
	@POST
	@Path("/{commands}")
	@Produces("text/plain")
	public String moveRobot(@PathParam("commands") final String commands) {
		Mars mars = new Mars();
		try {
			return mars.parseCommand(commands).toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}		
}
