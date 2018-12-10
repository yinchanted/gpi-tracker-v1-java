package com.swift.gpi.tracker.v1sdk.api;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.swift.gpi.tracker.v1sdk.ApiException;
import com.swift.gpi.tracker.v1sdk.ApiResponse;
import com.swift.gpi.trackerv1sdk.model.CamtA0400102;
import com.swift.gpi.trackerv1sdk.model.CamtA0400202;
import com.swift.gpi.trackerv1sdk.model.GetChangedPaymentTransactionsRequest;

/**
 * API tests for GetChangedPaymentTransactionsApi
 */

public class GetChangedPaymentTransactionsApiTest {

	ApiResponse<CamtA0400202> mock_ApiResponse = (ApiResponse<CamtA0400202>) mock(ApiResponse.class);
	GetChangedPaymentTransactionsApi test = mock(GetChangedPaymentTransactionsApi.class);

	@Test
	public void getChangedPaymentTransactionsPostTest() throws ApiException {
		CamtA0400102 requestBody = new CamtA0400102();
		requestBody.setGetChangedPaymentTransactionsRequest(new GetChangedPaymentTransactionsRequest());
		List<String> myInstitution = asList("CCLABEB0");
		requestBody.getGetChangedPaymentTransactionsRequest().setMyInstitution(myInstitution);
		requestBody.getGetChangedPaymentTransactionsRequest().setStartTime("2017-05-25T09:24:41.174Z");

		when(test.getChangedPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
				"e802ab96-bb3a-4965-9139-5214b9f0f074",
				"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
				"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"))
						.thenReturn(mock_ApiResponse);

		Assert.assertEquals(
				test.getChangedPaymentTransactionsPostWithHttpInfo("001", "1.0", "2018-03-23T15:56:26.728Z",
						"e802ab96-bb3a-4965-9139-5214b9f0f074",
						"(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])",
						"U1khA8h9Lm1PqzB99fG6uw", "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B", requestBody, "0"),
				mock_ApiResponse);

		System.out.println("Passed Test getChangedPaymentTransactionsPostWithHttpInfoShouldReturnResponse");
	}

}
