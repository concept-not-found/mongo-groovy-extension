package com.github.concept.not.found.mongo.groovy.util

import com.mongodb.*

class MongoUtils {
	def static connect(closure) {
		def mongo = new Mongo()
		try {
			mongo.metaClass.propertyMissing = {
				String databaseName ->
					def db = getDB(databaseName)
					db.metaClass.propertyMissing = {
						String collectionName ->
							db.getCollection(collectionName)
					}
					db
			}
			closure.call(mongo)
		} finally {
			mongo.close()
		}
	}
}
