package com.kh.chap04_assist.part01_buffer.run;

import com.kh.chap04_assist.part01_buffer.model.dao.BurfferDao;

public class BufferRun {

	public static void main(String[] args) {

		
		BurfferDao dao = new BurfferDao();
//		dao.fileSave();
		dao.fileRead();
		
		
	}

}
