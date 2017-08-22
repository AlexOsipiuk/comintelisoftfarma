import com.intelisoft.dao.impl.CitiDaoImpl;
import com.intelisoft.dao.util.HibernateUtil;
import com.intelisoft.entity.City;
import com.intelisoft.farma.api.dao.ICityDao;
import com.intelisoft.farma.api.services.ICityServices;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CityServiceImpl implements ICityServices {
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();
    private final ICityDao cityDao = new CitiDaoImpl();


    public void add(City city) {
        Transaction transaction = null;
        try {
            Session session = hibernateUtil.getSession();
            transaction = session.getTransaction();
            cityDao.save(city, session);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.print("Not dood");
        }
    }

    public void delete(City city) {
    }
}
