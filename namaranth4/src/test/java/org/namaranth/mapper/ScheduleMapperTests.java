package org.namaranth.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.namaranth.domain.CalendarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ScheduleMapperTests {

	@Autowired
	private ScheduleMapper mapper;
	
	@Autowired
	private CalendarMapper cMapper;
	
//	@Test
//	public void test() {
//		mapper.getSchedule();
//	}
	
//	@Test
//	public void test() {
//		cMapper.getList(1);
//	}
	
	@Test
	public void test() {
		cMapper.read(1);
	}
	

}
