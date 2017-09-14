package com.taotao.service;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface PictureService {
	
	public Map uploadPicture(MultipartFile uploadFile);
}
