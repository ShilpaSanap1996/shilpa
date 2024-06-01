package com.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class EnquireController {
	
	/**
	 * accepts:-(text,profile file,adhar file,pancard file)
	 * containt  key
	 * text      info
	 * profileImage  prof
	 * adharCard    adhar
	 * panCard		pan
	 * */
	
	@PostMapping("/enquiry")
	public String createEnquiry(@RequestPart("info")String enquiryJson,
								@RequestPart("prof")MultipartFile profimg,
								@RequestPart("adhar")MultipartFile adharDoc,
								@RequestPart("pan")MultipartFile panDoc)
	{
		System.out.println(enquiryJson);
		System.out.println(profimg.getOriginalFilename());
		System.out.println(adharDoc.getOriginalFilename());
		System.out.println(panDoc.getOriginalFilename());
		return "Enquiry registerd...!";
	}
}
