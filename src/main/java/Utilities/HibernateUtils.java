package Utilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DomainModels.ChiTietDichVu;
import DomainModels.ChiTietHoaDon;
import DomainModels.ChuTro;
import DomainModels.Dien;
import DomainModels.KhachHang;
import DomainModels.Nuoc;
import DomainModels.Phong;
import DomainModels.TaiKhoan;
import DomainModels.DichVu;
import DomainModels.HoaDon;
import DomainModels.HopDong;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author admin
 */
public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=test05_db_du_an_1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "12345");
        properties.put(Environment.SHOW_SQL, "true");
        //gen DB t? �?ng
        //properties.put(Environment.HBM2DDL_AUTO, "create");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Nuoc.class);
        conf.addAnnotatedClass(Dien.class);
        conf.addAnnotatedClass(DichVu.class);
        conf.addAnnotatedClass(Phong.class);
        conf.addAnnotatedClass(ChiTietDichVu.class);
        conf.addAnnotatedClass(ChuTro.class);
        conf.addAnnotatedClass(TaiKhoan.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HopDong.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(ChiTietHoaDon.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}
