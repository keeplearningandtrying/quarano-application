/*
 * SORMAS REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.44.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.quarano.sormas.client.api;

import de.quarano.sormas.client.model.PathogenTestDto;
import de.quarano.sormas.client.model.PushResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PathogenTestControllerApi
 */
@Ignore
public class PathogenTestControllerApiTest {

    private final PathogenTestControllerApi api = new PathogenTestControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllActiveUuids5Test() {
        List<String> response = api.getAllActiveUuids5();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllPathogenTestsTest() {
        Long since = null;
        List<PathogenTestDto> response = api.getAllPathogenTests(since);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBySampleUuidsTest() {
        List<String> body = null;
        List<PathogenTestDto> response = api.getBySampleUuids(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByUuids12Test() {
        List<String> body = null;
        List<PathogenTestDto> response = api.getByUuids12(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeletedUuidsSince3Test() {
        Long since = null;
        List<String> response = api.getDeletedUuidsSince3(since);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPathogenTestsTest() {
        List<PathogenTestDto> body = null;
        List<PushResult> response = api.postPathogenTests(body);

        // TODO: test validations
    }
}
