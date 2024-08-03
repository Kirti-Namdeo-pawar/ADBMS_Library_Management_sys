package LibraryManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aarad
 */





import com.mongodb.MongoClientURI;
 import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;
import javax.swing.table.DefaultTableModel;
 import org.bson.Document; 
public class MongoDBConnection {
    private static final String HOST = "localhost";
    private static final int PORT = 27017;
    private static final String DATABASE_NAME = "library";
    private static final String BOOKS_COLLECTION_NAME = "books";
    private static final String STUDENTS_COLLECTION_NAME = "students";
    private static final String BORROWED_BOOKS_COLLECTION_NAME = "borrowed_books";
    private static final String BOOK_INFO_COLLECTION_NAME = "books";
     private static final String  STUDENTS_RECORDS_COLLECTION_NAME= "students";
     private static MongoClient mongoClient;
    private static MongoDatabase database;
     
    private static final String  ISSUED_BOOKS_COLLECTION_NAME= "issued_books";
   // private static final String  INFO_BOOKS_COLLECTION_NAME= "issued_books";
 private MongoCollection<Document> collection;

    /**
     *
     * @return
     */
   /*  public boolean authenticateUser(String username, String password) {
        // Check if the username and password match in the database
        Document query = new Document("admin", username)
                            .append("admin", password);
        Document user = collection.find(query).first();
        return user != null;
    }*/
 public static MongoDatabase connect() {
        if (mongoClient == null) {
            // MongoDB connection string
            String connectionString = "mongodb+srv://<username>:<password>@<cluster-address>/<database-name>?retryWrites=true&w=majority";
            MongoClientURI uri = new MongoClientURI(connectionString);
            mongoClient = new MongoClient(uri);
        }
        // Get the database
        if (database == null) {
            database = mongoClient.getDatabase("<database-name>");
        }
        return database;
    }
    public static MongoCollection<Document> getBooksCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(BOOKS_COLLECTION_NAME);
    }

    public static MongoCollection<Document> getStudentsCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(STUDENTS_COLLECTION_NAME);
    }
public static MongoCollection<Document> getStudentsRercordsCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(STUDENTS_RECORDS_COLLECTION_NAME);
    }
    public static MongoCollection<Document> getBorrowedBooksCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(BORROWED_BOOKS_COLLECTION_NAME);
    }
    
    public static MongoCollection<Document> getIssuedBooksCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(ISSUED_BOOKS_COLLECTION_NAME);
    
    }
    public static MongoCollection<Document> getBookInfoCollection() {
        MongoClient mongoClient = new MongoClient(HOST, PORT);
        MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
        return database.getCollection(BOOK_INFO_COLLECTION_NAME);
    
    }
    
     public static void connectToMongoDB() {
        mongoClient = (MongoClient) MongoClients.create("mongodb://localhost:27017"); // Connect to MongoDB instance
        database = mongoClient.getDatabase("library"); // Specify your database name
    }

   /* public static MongoCollection<Document> getCollection() {
        return database.getCollection(BOOKS_COLLECTION_NAME);
    }*/

  /*  static MongoCollection<Document> getCollection(String BOOKS_COLLECTION_NAME) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    static void closeConnection() {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     *
     * @return
     */
   
}
  

