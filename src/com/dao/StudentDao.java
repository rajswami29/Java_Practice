package com.dao;

import java.io.FileNotFoundException;

public interface StudentDao {
	public void setStudent();
	public void getStudent() throws FileNotFoundException;
}
