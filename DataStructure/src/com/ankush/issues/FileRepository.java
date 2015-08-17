package com.ankush.issues;

import java.util.List;

public interface FileRepository extends BaseRepository{
	public void commitData();
	public List<String> fileNames();
}
