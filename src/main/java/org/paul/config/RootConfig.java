package org.paul.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.paul.sample","org.paul.service", "org.paul.core"})
@ComponentScan(basePackages = "org.paul.aop")

@EnableAspectJAutoProxy
@EnableTransactionManagement

@MapperScan(basePackages = {"org.paul.mapper"})
public class RootConfig {
    @Bean
    public DataSource dataSource() {

        HikariConfig hikariConfig = new HikariConfig();
        //hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
        //hikariConfig.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/practice?characterEncoding=UTF-8&serverTimezone=UTC&verifyServerCertificate=false&useSSL=false");
        hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://127.0.0.1:3306/practice?characterEncoding=UTF-8&serverTimezone=UTC&verifyServerCertificate=false&useSSL=false&allowPublicKeyRetrieval=true");
        hikariConfig.setUsername("whybwhy");
        hikariConfig.setPassword("test2186!");

        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource());

        return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
