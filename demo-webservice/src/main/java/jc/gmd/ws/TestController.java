package jc.gmd.ws;


import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jc.common.util.GsonExtension;





@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping("/api")
	public String api() {
		Map<String, Object> result = new HashMap<>();
		result.put("request success:", true);
		result.put("method from demo-common:", new jc.gmd.common.Library().someLibraryMethod());
		result.put("method from demo-db:", new jc.gmd.db.Library().someLibraryMethod());
		result.put("method from demo-webservice:", new jc.gmd.ws.Library().someLibraryMethod());
		return GsonExtension.GsonString(result);
		
	}
}

