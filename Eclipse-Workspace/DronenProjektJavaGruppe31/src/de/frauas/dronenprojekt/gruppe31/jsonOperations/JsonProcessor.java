package jsonOperations;

import org.json.*;

import Backend.Speicher;
import api.ApiConnection;
import droneStuff.Drone;
import droneStuff.DroneDynamic;
import droneStuff.DroneType;

public class JsonProcessor {

	ApiConnection apiConnection = new ApiConnection();

	public String processDroneTypes(String jsonAsString, Speicher speicher) {

		JSONObject j = new JSONObject(jsonAsString);

		JSONArray results = j.getJSONArray("results");

		for (int i = 0; i < results.length(); i++) {

			JSONObject droneTypesJson = results.getJSONObject(i);

			speicher.AddDroneType(new DroneType(droneTypesJson.getInt("id"), droneTypesJson.getString("manufacturer"),
					droneTypesJson.getString("typename"), droneTypesJson.getDouble("weight"),
					droneTypesJson.getDouble("max_speed"), droneTypesJson.getDouble("battery_capacity"),
					droneTypesJson.getDouble("control_range"), droneTypesJson.getDouble("max_carriage")));

		}

		if (j.get("next").equals(null)) {
			return null;
		}
		return j.getString("next");
	}

	public DroneType processDroneType(String jsonAsString) {

		JSONObject droneTypesJson = new JSONObject(jsonAsString);

		DroneType dt = new DroneType(droneTypesJson.getInt("id"), droneTypesJson.getString("manufacturer"),
				droneTypesJson.getString("typename"), droneTypesJson.getDouble("weight"),
				droneTypesJson.getDouble("max_speed"), droneTypesJson.getDouble("battery_capacity"),
				droneTypesJson.getDouble("control_range"), droneTypesJson.getDouble("max_carriage"));

		return dt;
	}

	public String processDrones(String jsonAsString, Speicher speicher) {

		JSONObject j = new JSONObject(jsonAsString);

		JSONArray results = j.getJSONArray("results");

		for (int i = 0; i < results.length(); i++) {

			JSONObject droneJson = results.getJSONObject(i);

			speicher.AddDrone(new Drone(droneJson.getInt("id"),
					processDroneType(apiConnection.FetchApiDataFromUrl(droneJson.getString("dronetype"))),
					droneJson.getString("created"), droneJson.getString("serialnumber"),
					droneJson.getDouble("carriage_weight"), droneJson.getString("carriage_type")));

		}

		if (j.get("next").equals(null)) {
			return null;
		}
		return j.getString("next");
	}

	public Drone processDrone(String jsonAsString) {

		JSONObject droneJson = new JSONObject(jsonAsString);

		Drone d = new Drone(droneJson.getInt("id"),
				processDroneType(apiConnection.FetchApiDataFromUrl(droneJson.getString("dronetype"))),
				droneJson.getString("created"), droneJson.getString("serialnumber"),
				droneJson.getDouble("carriage_weight"), droneJson.getString("carriage_type"));

		return d;
	}
	
	public String processDroneDynamics(String jsonAsString, Speicher speicher) {

		JSONObject j = new JSONObject(jsonAsString);

		JSONArray results = j.getJSONArray("results");

		for (int i = 0; i < results.length(); i++) {

			JSONObject droneDynamicJson = results.getJSONObject(i);

			speicher.AddDroneDynamic(new DroneDynamic());

		}

		if (j.get("next").equals(null)) {
			return null;
		}
		return j.getString("next");
	}
	
	
	

}
