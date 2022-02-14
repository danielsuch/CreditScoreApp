package mongoDB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class dbCollection {

    public static MongoCollection getCollection(String collection_name) {
        // connect to database
        MongoClient dbClient = connectDb.connectDb();

        MongoDatabase database = dbClient.getDatabase("CreditScoreApp");
        // get desired collection
        MongoCollection userCollection = database.getCollection(collection_name);
        // return a collection object
        return  userCollection;
    }
}
