package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HelloController {

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(method = RequestMethod.POST, value = "/api/javainuse/phoneNumberData")
	public ResponsePhoneData numberInformation(@RequestBody RequestPayload requestPayload) {
		int n = requestPayload.phoneNumber.length();
		PermutationData permutation = new PermutationData();
		ResponsePhoneData rd = new ResponsePhoneData();

		permutation.permute(requestPayload.phoneNumber, 0, n-1, requestPayload.page);
		rd.setTotal(permutation.arr.size());
		rd.setList(permutation.arr);
		return rd;
	}
}
