package com.space;

import java.util.*;

public class SpaceMission
{
 private List<String> crewMembers;	
 private ArrayList<String> equipments;
 private Vector<String> missionStages;
 private Set<String> searchAreas;
 private LinkedHashSet<String> emergencyProtocols;
 private Map<String,String> crewRoles;
 
 public SpaceMission() {}

 public List<String> getCrewMembers() {
	return crewMembers;
 }

 public void setCrewMembers(List<String> crewMembers) {
	this.crewMembers = crewMembers;
 }

 public ArrayList<String> getEquipments() {
	return equipments;
 }

 public void setEquipments(ArrayList<String> equipments) {
	this.equipments = equipments;
 }

 public Vector<String> getMissionStages() {
	return missionStages;
 }

 public void setMissionStages(Vector<String> missionStages) {
	this.missionStages = missionStages;
 }

 public Set<String> getSearchAreas() {
	return searchAreas;
 }

 public void setSearchAreas(Set<String> searchAreas) {
	this.searchAreas = searchAreas;
 }

 public LinkedHashSet<String> getEmergencyProtocols() {
	return emergencyProtocols;
 }

 public void setEmergencyProtocols(LinkedHashSet<String> emergencyProtocols) {
	this.emergencyProtocols = emergencyProtocols;
 }

 public Map<String, String> getCrewRoles() {
	return crewRoles;
 }

 public void setCrewRoles(Map<String, String> crewRoles) {
	this.crewRoles = crewRoles;
 }

 @Override
 public String toString() {
	return "SpaceMission [crewMembers=" + crewMembers + ", equipments=" + equipments + ", missionStages="
			+ missionStages + ", searchAreas=" + searchAreas + ", emergencyProtocols=" + emergencyProtocols
			+ ", crewRoles=" + crewRoles + "]";
 }

}
