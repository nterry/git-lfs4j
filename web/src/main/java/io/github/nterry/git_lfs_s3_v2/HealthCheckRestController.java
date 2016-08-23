package io.github.nterry.git_lfs_s3_v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nicholasterry on 8/22/16.
 */
@RestController
public class HealthCheckRestController {

  @RequestMapping(method = RequestMethod.GET, path = "/health", produces = "text/plain")
  public String health() {

    return "    _.-.\n" +
        "  '( ^{_}                                                  (\n" +
        "    `~\\`---------------------------------------------------'\\\n" +
        "       )_)-------------------------------------------------)_)\n" +
        "                       Long dog has latitude!";
  }
}

