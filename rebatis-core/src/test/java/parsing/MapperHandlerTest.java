package parsing;

import org.gosky.mapping.MapperHandler;
import org.gosky.mapping.SqlFactory;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Map;

public class MapperHandlerTest {


    @Test
    public void test() {
        MapperHandler mapperHandler = new MapperHandler();
        mapperHandler.parsingInterface("org.gosky.mapping");
        Map<Method, SqlFactory> serviceMethodList = mapperHandler.getMethodMapperList();
        SqlFactory sqlFactory = serviceMethodList.get(0);
        String sql = sqlFactory.getSql();
        System.out.println(sql);
        System.out.println(serviceMethodList);
    }
}