public interface IDataStruct
{
    public boolean hasNext();
    public String grabNext();
    public void release();
    public IDataStruct copyMe();
}