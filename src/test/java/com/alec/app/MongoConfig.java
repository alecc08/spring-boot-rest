package com.alec.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

@Configuration
@EnableReactiveMongoRepositories
public class MongoConfig extends AbstractReactiveMongoConfiguration {

	@Value("#{systemProperties['MONGO_DB']}")
	private String database;

	@Override
	protected String getDatabaseName() {
		return database;
	}

	@Override
	public MongoClient reactiveMongoClient() {
		return MongoClients.create();
	}
}