/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.api;

import com.amazon.selling.partner.ApiException;
import com.amazon.selling.partner.model.GetInvoiceStatusResponse;
import com.amazon.selling.partner.model.GetShipmentDetailsResponse;
import com.amazon.selling.partner.model.SubmitInvoiceRequest;
import com.amazon.selling.partner.model.SubmitInvoiceResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipmentInvoiceApi
 */
@Ignore
public class ShipmentInvoiceApiTest {

    private final ShipmentInvoiceApi api = new ShipmentInvoiceApi();

    
    /**
     * 
     *
     * Returns the invoice status for the shipment you specify.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceStatusTest() throws ApiException {
        String shipmentId = null;
        GetInvoiceStatusResponse response = api.getInvoiceStatus(shipmentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the shipment details required to issue an invoice for the specified shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipmentDetailsTest() throws ApiException {
        String shipmentId = null;
        GetShipmentDetailsResponse response = api.getShipmentDetails(shipmentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submits a shipment invoice document for a given shipment.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 1.133 | 25 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitInvoiceTest() throws ApiException {
        String shipmentId = null;
        SubmitInvoiceRequest body = null;
        SubmitInvoiceResponse response = api.submitInvoice(shipmentId, body);

        // TODO: test validations
    }
    
}
