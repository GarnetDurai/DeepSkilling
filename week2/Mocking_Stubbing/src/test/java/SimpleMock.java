import org.junit.Test;

import static org.mockito.Mockito.*;

public class SimpleMock {

    @Test
    public void TestServic(){
        //Mocking
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        //Stubbing
        when(mockApi.getData()).thenReturn("Mock Data");
        //when -> thenReturn cant have an void method
        //for void method use when -> doNothing instead of thenReturn
        service.fetchData();
        //Mock Verification
        verify(mockApi).getData();
    }

}
