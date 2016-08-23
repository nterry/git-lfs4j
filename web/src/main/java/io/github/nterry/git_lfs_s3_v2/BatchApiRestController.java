package io.github.nterry.git_lfs_s3_v2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller implementing the v1.3 batch API.
 * See the <a href="https://github.com/github/git-lfs/blob/master/docs/api/v1.3/http-v1.3-batch.md">v1.3 docs</a> for more details.
 */
@RestController
public class BatchApiRestController {

  /**
   * Batch API endpoint
   *
   * @param batchRequest The {@link BatchRequest} from the client
   * @return An {@link ResponseEntity<BatchResponse>} with the required data to perform the requested actions
   */
  @RequestMapping(method = RequestMethod.POST, path = "/objects/batch", consumes = "application/vnd.git-lfs+json", produces = "application/vnd.git-lfs+json")
  public ResponseEntity<BatchResponse> objectsBatch(@RequestBody BatchRequest batchRequest) {
    return null;
  }
}
