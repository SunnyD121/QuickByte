package com.revature.overknight.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.revature.overknight.dao.CommentDaoImpl;

public class CommentServiceTest {
	CommentService cs = null;
	
	@Before
	public void setUp() throws Exception {
		cs = new CommentService();
	}

	@After
	public void tearDown() throws Exception {
		cs = null;
	}

	@Test
	public void test() {
		CommentDaoImpl mockCommentDao = Mockito.mock(CommentDaoImpl.class);
		Mockito.when(mockCommentDao.insertComment(null)).thenReturn(1);
		cs.setCd(mockCommentDao);
		assertEquals(true, cs.createNewComment("username", "stuff and things and stuff and things"));
	}
 }
