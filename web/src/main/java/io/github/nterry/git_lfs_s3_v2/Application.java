package io.github.nterry.git_lfs_s3_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The application main class.
 *
 * @author Nicholas Terry
 */
@SpringBootApplication
@ComponentScan("io.github.nterry.git_lfs_s3_v2")
public class Application {

  /**
   * The application entry point.
   *
   * @param args The application arguments from the command line
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
