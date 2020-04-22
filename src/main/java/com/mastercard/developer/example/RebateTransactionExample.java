package com.mastercard.developer.example;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openapitools.client.model.RebateTransactionRequest;
import org.openapitools.client.model.RebateTransactionRequestList;

/**
 * This is a rebate transaction example class, can be used to modify data to be passed to Rebate Transaction API.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RebateTransactionExample {

    /**
     * Create an instance of RebateTransactionRequest and set all required and (available) optional information of Account.
     * required:
     * - memberIca
     * - merchantCategoryCode
     * - merchantId
     * - rebateAmount
     * - rebateReversalIndicator
     * - rebateSourceCode
     * - transactionDescription
     * - transactionSequenceNumber
     *
     * @return An instance of RebateTransactionRequest
     * @implNote The required field values used in this tutorial are dummy and demo purposed only, please change it with valid one before running this application.
     */
    public static RebateTransactionRequest getRebateTransactionRequest() {
        RebateTransactionRequest rebateTransactionRequest = new RebateTransactionRequest();
        return rebateTransactionRequest.memberIca("47441")
                .accountIdentifier("65203356")
                .devicePrimaryAccountNumber("5100120000000004")
                .merchantCategoryCode("6555")
                .merchantId("6555")
                .rebateAmount("50")
                .rebateReversalIndicator("N")
                .rebateSourceCode("ext1")
                .transactionAmount("100")
                .transactionDate("2019-08-01")
                .transactionDescription("Rebate")
                .transactionSequenceNumber("11123");
    }

    /**
     * Create an instance of RebateTransactionRequestList. Pass list of RebateTransactionRequest object
     *
     * @return An instance of RebateTransactionRequestList
     */
    public static RebateTransactionRequestList getRebateTransactionRequestList() {
        RebateTransactionRequestList rebateTransactionList = new RebateTransactionRequestList();
        rebateTransactionList.addRebateTransactionRequestListItem(getRebateTransactionRequest());
        return rebateTransactionList;
    }
}