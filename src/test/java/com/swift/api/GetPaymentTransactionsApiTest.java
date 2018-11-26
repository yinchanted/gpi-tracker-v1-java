/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 1.2.37
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.ApiException;
import com.swift.ApiResponse;
import com.swift.model.CamtA0300102;
import com.swift.model.CamtA0300202;
import com.swift.model.GetPaymentTransactionsRequest;

public class GetPaymentTransactionsApiTest {

	ApiResponse<CamtA0300202> mock_ApiResponse = (ApiResponse<CamtA0300202>) mock(ApiResponse.class);
	GetPaymentTransactionsApi test = mock(GetPaymentTransactionsApi.class);

	@Test
	public void getPaymentTransactionsPostTest() throws ApiException {

		CamtA0300102 requestBody = new CamtA0300102();
		requestBody.setGetPaymentTransactionsRequest(new GetPaymentTransactionsRequest());
		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetPaymentTransactionsRequest().setMyInstitution(myInstitution);
		requestBody.getGetPaymentTransactionsRequest().setTimeWindow(new com.swift.model.DateTimePeriodDetails());
		requestBody.getGetPaymentTransactionsRequest().getTimeWindow().setFromDateTime("2017-06-17T09:45:16.058Z");
		requestBody.getGetPaymentTransactionsRequest().getTimeWindow().setToDateTime("2017-06-18T09:45:16.058Z");
		// requestBody.getGetPaymentTransactionsRequest().setEvent(PaymentTransactionState1Code.RCCA);
		requestBody.getGetPaymentTransactionsRequest().setMaximumNumber("10");

		when(test.getPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(
				test.getPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
						"e802ab96-bb3a-4965-9139-5214b9f0f074",
						"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
						"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"),
				mock_ApiResponse);

		System.out.println("Passed Test getPaymentTransactionsPostWithHttpInfoShouldReturnResponse");
		// TODO: test validations
	}

}
