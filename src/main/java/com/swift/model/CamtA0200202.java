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


package com.swift.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.model.GetPaymentTransactionDetailsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generated by SWIFT Standards 2017-03-22 00:13:52
 */
@ApiModel(description = "Generated by SWIFT Standards 2017-03-22 00:13:52")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-26T11:46:38.130-05:00")
public class CamtA0200202 {
  @SerializedName("get_payment_transaction_details_response")
  private GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse = null;

  public CamtA0200202 getPaymentTransactionDetailsResponse(GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse) {
    this.getPaymentTransactionDetailsResponse = getPaymentTransactionDetailsResponse;
    return this;
  }

   /**
   * Get getPaymentTransactionDetailsResponse
   * @return getPaymentTransactionDetailsResponse
  **/
  @ApiModelProperty(value = "")
  public GetPaymentTransactionDetailsResponse getGetPaymentTransactionDetailsResponse() {
    return getPaymentTransactionDetailsResponse;
  }

  public void setGetPaymentTransactionDetailsResponse(GetPaymentTransactionDetailsResponse getPaymentTransactionDetailsResponse) {
    this.getPaymentTransactionDetailsResponse = getPaymentTransactionDetailsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0200202 camtA0200202 = (CamtA0200202) o;
    return Objects.equals(this.getPaymentTransactionDetailsResponse, camtA0200202.getPaymentTransactionDetailsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPaymentTransactionDetailsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0200202 {\n");
    
    sb.append("    getPaymentTransactionDetailsResponse: ").append(toIndentedString(getPaymentTransactionDetailsResponse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

