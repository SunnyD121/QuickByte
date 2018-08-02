package com.revature.overknight.services;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.overknight.services.CommentService;

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
		fail("Not yet implemented");
	}

}
