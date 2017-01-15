import cn.lhl.entity.Dept;
import cn.lhl.entity.Emp;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by datou on 2017/1/15.
 */
public class text {
    public static void main(String[] args) {
        Session session=new Configuration().configure().buildSessionFactory().getCurrentSession();
        Transaction ts = session.beginTransaction();
        Emp emp1=new Emp();
        emp1.setEname("刘浩龙");
        Emp emp2=new Emp();
        emp2.setEname("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        Dept dept=new Dept();
        dept.setDname("测试部");
        emp1.setDept(dept);
        emp2.setDept(dept);
        session.save(emp1);
        session.save(emp2);
        ts.commit();
    }
            }
