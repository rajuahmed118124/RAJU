public class DataProcessing {
    public static void main(String[] args) {
    DatabasePipeline dbPipeline = new DatabasePipeline();
    CloudPipeline cldPipeline = new CloudPipeline();
    dbPipeline.processData("A randow URL");
    cldPipeline.processData("A randow URL");
    }
    }
    class DatabasePipeline {
    public boolean processData(String URL) {
    connectDatabase(URL);
    transformData();
    StoreDataInDatabase();
    return true;
    }
    public boolean connectDatabase(String URL)
    {
    boolean connected = false;
    System.out.println("connecting
    databases...");
    // do something and somehow got
    connected
    connected = true;
    return connected;
    }
    public boolean transformData() {
    boolean transformed = false;
    System.out.println("tranforming data
    in databases...");
    // do something and somehow got
    transformed
    transformed = true;
    return transformed;
    }
    public boolean StoreDataInDatabase() {
    boolean stored = false;
    System.out.println("storing data in
    databases...");
    // do something and somehow got
    stored
    stored = true;
    return stored;
    }
    }
    class CloudPipeline {
    public boolean processData(String URL) {
    connectCloud(URL);
    transformData();
    StoreDataInCloud();
    return true;
    }
    public boolean connectCloud(String URL) {
    boolean connected = false;
    System.out.println("connecting
    cloud...");
    // do something and somehow got
    connected
    connected = true;
    return connected;
    }
    public boolean transformData() {
    boolean transformed = false;
    System.out.println("tranforming data in
    cloud...");
    // do something and somehow got
    transformed
    transformed = true;
    return transformed;
    }
    public boolean StoreDataInCloud() {
    boolean stored = false;
    System.out.println("storing data in cloud...");
    // do something and somehow got stored
    stored = true;
    return stored;
    }
    }