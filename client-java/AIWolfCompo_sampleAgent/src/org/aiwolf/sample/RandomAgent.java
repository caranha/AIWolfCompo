package org.aiwolf.sample;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.aiwolf.client.lib.*;
import org.aiwolf.common.data.Agent;
import org.aiwolf.common.data.Player;
import org.aiwolf.common.data.Role;
import org.aiwolf.common.net.GameInfo;
import org.aiwolf.common.net.GameSetting;

/**
 * author: ehauckdo
 * Sample Java agent for the AIWolf Competition
 * behaves randomly
 */
public class RandomAgent implements Player {

	Agent myself;
	List<Agent> aliveOthers;
	
	@Override
	public String getName() {
		return "SampleJavaRandomAgent";
	}

	@Override
	public void update(GameInfo gameInfo) {
		aliveOthers = new ArrayList<>(gameInfo.getAliveAgentList());
		aliveOthers.remove(myself);
	}

	@Override
	public void initialize(GameInfo gameInfo, GameSetting gameSetting) {
		myself = gameInfo.getAgent();
	}

	@Override
	public void dayStart() {
	
	}

	@Override
	public String talk() {
		// get a random agent and declare vote against him
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return new Content(new EstimateContentBuilder(selectedAgent, Role.WEREWOLF)).getText();
	}

	@Override
	public String whisper() {
		// get a random agent and declare vote against him
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return new Content(new AttackContentBuilder(selectedAgent)).getText();
	}

	@Override
	public Agent vote() {
		// get a random agent to vote against
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return selectedAgent;
	}

	@Override
	public Agent attack() {
		// get a random agent to attack
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return selectedAgent;
	}

	@Override
	public Agent divine() {
		// get a random agent to divine on
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return selectedAgent;
	}

	@Override
	public Agent guard() {
		// get a random agent to guard
		Agent selectedAgent = aliveOthers.get((new Random()).nextInt(aliveOthers.size()));
		return selectedAgent;
	}

	@Override
	public void finish() {
		
	}

}
