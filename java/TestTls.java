import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import javax.net.ssl.SSLContext;
import java.net.SocketException;
import java.io.IOException;

class TestTls {
  public static void main(String[] args) {
    try {
      String contexts = String.join(", ", SSLContext.getDefault().getSupportedSSLParameters().getProtocols());
      System.out.println("Supported Contexts: " + contexts);
    } catch (NoSuchAlgorithmException e) {
      System.out.println("Error listing available contexts: " + e.getMessage());
    }

    URL url = null;
    try {
      url = new URL("https://api.opentok.com");
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setRequestMethod("GET");
      connection.connect();
      System.out.println(
          "Connection successfully established with your current TLS configuration, no further action required.");
    } catch (MalformedURLException urlException) {
      System.out.println("No legal protocol found in string or the URL could not be parsed.");
    } catch (SocketException socketException) {
      System.out
          .println("Failed to connect to OpenTok, please check your system and upgrade your environment as needed.");
    } catch (IOException e) {
      System.out.println("Unknown error talking to OpenTok, please try again later: " + e.getMessage());
    }
  }
}
