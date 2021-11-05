package com.springbook.vo;

import lombok.Data;

@Data
public class BoardFileVO {
	private int seq;
	private int fSeq;
	private String originalFileName;
	private String filePath;
	private long fileSize;
}
