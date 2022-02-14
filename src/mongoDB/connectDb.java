package mongoDB;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


public class connectDb {
    public static MongoClient connectDb() {

        // ten ConnectionString poniżej nie może być wrzucony tak otwarcie na gita
        ConnectionString connectionString = new ConnectionString($CONNECTION_STRING);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        final MongoClient mongoClient = MongoClients.create(settings);
        return mongoClient;

    }

}
