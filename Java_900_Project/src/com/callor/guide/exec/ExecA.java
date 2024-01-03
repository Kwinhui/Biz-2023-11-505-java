 package com.callor.guide.exec;

import com.callor.guide.service.GuideService;
import com.callor.guide.service.impl.GuideServiceImplV1;

public class ExecA {
	public static void main(String[] args) {
		GuideService guideService = new GuideServiceImplV1();
		
//		guideService.loadGuide();
		
		guideService.printGuideList();
	}
}
