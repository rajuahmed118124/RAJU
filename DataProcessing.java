abstract class DataPipeline 
{
    public final boolean processData(String URL) 
    {
        connect(URL);
        transformData();
        storeData();
        return true;
    }

    protected abstract void connect(String URL);
    protected abstract void transformData();
    protected abstract void storeData();
}


class DatabasePipeline extends DataPipeline 
{
    @Override
    protected void connect(String URL) 
    {
        System.out.println("Connecting to database...");
    }

    @Override
    protected void transformData() 
    {
        System.out.println("Transforming data in database...");
    }

    @Override
    protected void storeData() 
    {
        System.out.println("Storing data in database...");
    }
}


class CloudPipeline extends DataPipeline 
{
    @Override
    protected void connect(String URL) 
    {
        System.out.println("Connecting to cloud...");
    }

    @Override
    protected void transformData() 
    {
        System.out.println("Transforming data in cloud...");
    }

    @Override
    protected void storeData() 
    {
        System.out.println("Storing data in cloud...");
    }
}


public class DataProcessing 
{
    public static void main(String[] args) 
    {
        DataPipeline dbPipeline = new DatabasePipeline();
        DataPipeline cldPipeline = new CloudPipeline();
        
        dbPipeline.processData("A random URL");
        cldPipeline.processData("A random URL");
    }
}