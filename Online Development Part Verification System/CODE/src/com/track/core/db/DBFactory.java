package com.track.core.db;

import com.track.core.dao.AbstractDataAccessObject;

public class DBFactory
{
	public DBFactory()
	{
		new AbstractDataAccessObject().getConnection();
	}
}
