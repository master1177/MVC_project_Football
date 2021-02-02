package softuni.exam.util;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;

public interface XMLParser {

    <T> T convertFromFile (String filePath, Class<T> tClass) throws JAXBException, FileNotFoundException;

    <T> void convertToFile (String filePath, Class<T> rootDto) throws JAXBException;
}
