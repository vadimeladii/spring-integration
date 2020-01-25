package md.springboot;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Service
@MessagingGateway(defaultRequestChannel="textInChannel")
public interface FileWriterGateway {

  void writeToFile(
          @Header(FileHeaders.FILENAME) String filename,
          String data);
  
}
