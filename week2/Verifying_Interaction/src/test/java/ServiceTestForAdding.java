import org.junit.Test;

import static org.mockito.Mockito.*;

public class ServiceTestForAdding {
    @Test
    public void simpleAddTest(){
        Calculator mockApi = mock(Calculator.class);
        MyService service = new MyService(mockApi);
        when(mockApi.addNum(2, 3)).thenReturn(5);
        int result = service.addIt(2, 3);
        verify(mockApi).addNum(2, 3);
    }

}
