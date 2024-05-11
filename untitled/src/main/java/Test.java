import Mapper.EmployMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Employ;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;

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
        //增加员工
        Employ employ = new Employ();
        employ.setCid(100);
        employ.setCname("王昱龙");
        employ.setGender("男");
        if(mapper.add(employ) ==1){
            sqlSession.commit();
            System.out.println("插入成功");
            System.out.println(employ);
        }else {
            System.out.println("插入失败");
        }
        //删除id100员工信息
        if(mapper.delete(100)==1){
            sqlSession.commit();
            System.out.println("删除成功");
            System.out.println(employ);
        }else {
            System.out.println("删除失败");
        }
        //修改将id100员工姓名修改
        if(mapper.update()==1){
            sqlSession.commit();
            System.out.println("修改成功");
            System.out.println(employ);
        }else {
            System.out.println("修改失败");
        }
        //查询表中姓为张并且性别为男的员工
        List<Employ> list = mapper.findByName();
        System.out.println(list);
        // 归还连接给数据源
        sqlSession.close();
    }
}
