/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.selling.partner.api;

import com.amazon.selling.partner.ApiException;
import com.amazon.selling.partner.model.CancelReportResponse;
import com.amazon.selling.partner.model.CancelReportScheduleResponse;
import com.amazon.selling.partner.model.CreateReportResponse;
import com.amazon.selling.partner.model.CreateReportScheduleResponse;
import com.amazon.selling.partner.model.CreateReportScheduleSpecification;
import com.amazon.selling.partner.model.CreateReportSpecification;
import com.amazon.selling.partner.model.GetReportDocumentResponse;
import com.amazon.selling.partner.model.GetReportResponse;
import com.amazon.selling.partner.model.GetReportScheduleResponse;
import com.amazon.selling.partner.model.GetReportSchedulesResponse;
import com.amazon.selling.partner.model.GetReportsResponse;
import java.time.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ReportsApi api = new ReportsApi();

    
    /**
     * 
     *
     * Cancels the report that you specify. Only reports with processingStatus&#x3D;IN_QUEUE can be cancelled. Cancelled reports are returned in subsequent calls to the getReport and getReports operations.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelReportTest() throws ApiException {
        String reportId = null;
        CancelReportResponse response = api.cancelReport(reportId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Cancels the report schedule that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelReportScheduleTest() throws ApiException {
        String reportScheduleId = null;
        CancelReportScheduleResponse response = api.cancelReportSchedule(reportScheduleId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a report.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportTest() throws ApiException {
        CreateReportSpecification body = null;
        CreateReportResponse response = api.createReport(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a report schedule. If a report schedule with the same report type and marketplace IDs already exists, it will be cancelled and replaced with this one.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportScheduleTest() throws ApiException {
        CreateReportScheduleSpecification body = null;
        CreateReportScheduleResponse response = api.createReportSchedule(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report details (including the reportDocumentId, if available) for the report that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2.0 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportTest() throws ApiException {
        String reportId = null;
        GetReportResponse response = api.getReport(reportId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the information required for retrieving a report document&#39;s contents. This includes a presigned URL for the report document as well as the information required to decrypt the document&#39;s contents.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0167 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportDocumentTest() throws ApiException {
        String reportDocumentId = null;
        GetReportDocumentResponse response = api.getReportDocument(reportDocumentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report schedule details for the report schedule that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportScheduleTest() throws ApiException {
        String reportScheduleId = null;
        GetReportScheduleResponse response = api.getReportSchedule(reportScheduleId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report schedule details that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportSchedulesTest() throws ApiException {
        List<String> reportTypes = null;
        GetReportSchedulesResponse response = api.getReportSchedules(reportTypes);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns report details for the reports that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReportsTest() throws ApiException {
        List<String> reportTypes = null;
        List<String> processingStatuses = null;
        List<String> marketplaceIds = null;
        Integer pageSize = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        GetReportsResponse response = api.getReports(reportTypes, processingStatuses, marketplaceIds, pageSize, createdSince, createdUntil, nextToken);

        // TODO: test validations
    }
    
}
