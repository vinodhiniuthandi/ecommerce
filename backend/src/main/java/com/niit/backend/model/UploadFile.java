package com.niit.backend.model;

import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {

	
	private String filename;
	@Transient
	private MultipartFile image;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}
