import Mapper.EmployMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Employ;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 核心配置文件classpath路径
        String resource = "mybatis-config.xml";
        // 加载配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        // 构建会话工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 从SqlSessionFactory对象中获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployMapper mapper = sqlSession.getMapper(EmployMapper.class);
        List<Employ> employs = mapper.selectAll();
        System.out.println(employs);

        // 归还连接给数据源
        sqlSession.close();
    }
}
