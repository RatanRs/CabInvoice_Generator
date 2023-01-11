package com.bridgelabzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class RideHistory {
	Map<String, ArrayList<TotalRide>> userRides;

	public RideHistory() {
		this.userRides = new HashMap<String, ArrayList<TotalRide>>();
	}

	public void addRide(String userId, TotalRide[] rides) {
		this.userRides.put(userId, new ArrayList<TotalRide>(Arrays.asList(rides)));
	}

	public TotalRide[] getRides(String userId) {
		return this.userRides.get(userId).toArray(new TotalRide[0]);
	}
}

