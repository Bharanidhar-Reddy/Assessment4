package com.process;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Mongoclient {
	private static MongoClient mongo;

	public static MongoClient getmongo() {
		if(mongo==null) {
			mongo=MongoClients.create("mongodb://localhost:27017");
		}
		return mongo;
	}

		public static MongoDatabase getdb(String name) {
		return  getmongo().getDatabase(name);
	}
		public static void close() {
			getmongo().close();
}
}
