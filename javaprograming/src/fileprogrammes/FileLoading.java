package fileprogrammes;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLoading {
	public static void main(String[] args) throws Exception {

        Properties prop = new Properties();
        prop.load(new FileInputStream("config.properties"));
        System.out.println(prop.getProperty("url"));
    }


}
