package com.gaming;

import java.util.*;


public class GamingTournament
{
 private ArrayList<String> players;
 private List<String> gameModes;
 private LinkedHashSet<String> teams;
 private Vector<Double> prizes;
 private Map<String,Integer> teamScores;
 
 public GamingTournament() {}

 public ArrayList<String> getPlayers() {
	return players;
 }

 public void setPlayers(ArrayList<String> players) {
	this.players = players;
 }

 public List<String> getGameModes() {
	return gameModes;
 }

 public void setGameModes(List<String> gameModes) {
	this.gameModes = gameModes;
 }

 public LinkedHashSet<String> getTeams() {
	return teams;
 }

 public void setTeams(LinkedHashSet<String> teams) {
	this.teams = teams;
 }

 public Vector<Double> getPrizes() {
	return prizes;
 }

 public void setPrizes(Vector<Double> prizes) {
	this.prizes = prizes;
 }

 public Map<String, Integer> getTeamScores() {
	return teamScores;
 }

 public void setTeamScores(Map<String, Integer> teamScores) {
	this.teamScores = teamScores;
 }

 @Override
 public String toString() {
	return "GamingTournament [players=" + players + ", gameModes=" + gameModes + ", teams=" + teams + ", prizes="
			+ prizes + ", teamScores=" + teamScores + "]";
 }


}
