package com.revature.overknight.services;

import com.revature.overknight.beans.Tag;
import com.revature.overknight.dao.TagDaoImpl;

public class TagService {
	
	TagDaoImpl td = new TagDaoImpl();
	Tag tempTag = null;
	
	public Tag verifyOrCreateTag(String tag)
	{
		tempTag = td.selectTagByName(tag);
		if(tempTag != null)
		{
			return tempTag;
		}
		else
		{
			tempTag = new Tag(tag);
			td.insertTag(tempTag);
			return tempTag;
		}
	}

}
