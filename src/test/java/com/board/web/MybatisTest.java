package com.board.web;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/dataSource-context.xml" })
public class MybatisTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(MybatisTest.class);
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	public void testSessionFactory() {
		LOGGER.info("\n Session Factory : " + sessionFactory);
	}
	
	@Test
	public void testSqlSession() {
		try (SqlSession session = sessionFactory.openSession()) {
			LOGGER.info("\n Sql Session : " + session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
