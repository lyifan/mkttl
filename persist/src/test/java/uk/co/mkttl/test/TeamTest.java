package uk.co.mkttl.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.testng.annotations.Test;

import uk.co.mkttl.persist.domain.Address;
import uk.co.mkttl.persist.domain.Name;
import uk.co.mkttl.persist.domain.Player;
import uk.co.mkttl.persist.domain.Team;

public class TeamTest extends TestBase  {

	@Test
	public void testAddTeam() {
		Address address = new Address();
		address.setNumber("2");
		address.setStreet("Wrens Park");
		address.setCity("Milton Keynes");
		address.setPostcode("MK10 9BH");
		
		Team team = new Team();
		team.setActive(true);
		team.setCaptain("Yifan");
		team.setName("MK Dons");
		team.setRegisterDate(Calendar.getInstance().getTime());
		
		address.setTeam(team);
		team.setAddress(address);
		
		List<Player> players = new ArrayList<Player>();
		Player player = new Player();
		player.setAge(20);
		Name name = new Name();
		name.firstName = "John";
		name.lastName = "Smith";
		player.setName(name);
		player.setTeam(team);
		players.add(player);
		team.setPlayers(players);
	
		super.persist(team);
	}
	
	@Test(dependsOnMethods = {"testAddTeam"})
	public void testUpdateTeam() {
//		Session hiberateSession = _sessionFactory.getCurrentSession();
//		
//		Team team = (Team) hiberateSession.get(Team.class, 1);
//		
//		team.setName("Updated Team Name");
//		
//		hiberateSession.persist(team);
	}
	
	@Test
	public void testAddPlayer() {
		Player player = new Player();
		player.setAge(20);
		Name name = new Name();
		name.firstName = "John";
		name.lastName = "Smith";
		player.setName(name);

		super.persist(player);
	}
}
