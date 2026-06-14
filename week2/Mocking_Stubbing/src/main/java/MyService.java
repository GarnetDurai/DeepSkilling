public class MyService {
    ExternalApi api;
    MyService(ExternalApi api){
        this.api = api;
    }
    public void fetchData(){
        String s = api.getData();
        return;
    }
}
