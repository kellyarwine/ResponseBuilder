package builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

public class TemplaterTest {
  File workingDirectory;
  File publicDirectoryFullPath;

  @Before
  public void setUp() throws IOException {
    File workingDirectory = new File(new File(System.getProperty("user.dir")).getParent(), "Server");
    publicDirectoryFullPath = new File(workingDirectory, "test/public/");
    new Templater().copyTemplatesToDisk("/builder/templates/templates.zip", publicDirectoryFullPath);
  }

  @After
  public void tearDown() {
    deleteDirectory(new File(publicDirectoryFullPath, "/templates"));
  }

  @Test
  public void FourHundredFourTemplate() throws IOException {
    assertTrue(new File(publicDirectoryFullPath, "templates/404.html").exists());
  }

  @Test
  public void FileDirectoryTemplate() throws IOException {
    assertTrue(new File(publicDirectoryFullPath, "templates/file_directory.html").exists());
  }

  @Test
  public void FormTemplate() throws IOException {
    assertTrue(new File(publicDirectoryFullPath, "templates/form.html").exists());
  }

  @Test
  public void ParametersTemplate() throws IOException {
    assertTrue(new File(publicDirectoryFullPath, "templates/parameters.html").exists());
  }

  private void deleteDirectory(File directory) {
    if (directory.isDirectory()) {
      String[] children = directory.list();
      for (int i=0; i<children.length; i++) {
        deleteDirectory(new File(directory, children[i]));
      }
    }
    directory.delete();
  }
}