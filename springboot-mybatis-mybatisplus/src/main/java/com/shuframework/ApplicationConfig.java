package com.shuframework;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shuframework.*.dao")
public class ApplicationConfig {

	static Logger log = LoggerFactory.getLogger(ApplicationConfig.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
		log.info("=======启动==========");
	}
	
	//按照之前的操作，应该是需要注入sqlSession, 集成了mybatis-spring-boot-starter可以省略
//    @Bean
//    @ConfigurationProperties(prefix="spring.datasource")
//    public DataSource dataSource() {
//        return new org.apache.tomcat.jdbc.pool.DataSource();
//    }
// 
//    //提供SqlSeesion
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
// 
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource());
// 
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
// 
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
// 
//        return sqlSessionFactoryBean.getObject();
//    }
// 
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }

}