package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;
    private File file = new File("D:/Interview/TestProject/TestFramework/src/main/java/framework/Config.Properties");

    private FileInputStream fileInput;
    {
        try {
            fileInput = new FileInputStream(file);
            prop = new Properties();
            prop.load(fileInput);

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String AppUrl(){
        return prop.getProperty("TestURL");
    }

    public static String PageHeader(){
        return prop.getProperty("AppHeader");
    }

    public static String ElementalUrl(){

        return prop.getProperty("ElementalSeleniumURL");
    }
    public static Integer ImageCount(){
        int Count = 0;
        String image = prop.getProperty("NoOfImage");
        Count = Integer.parseInt(image);
        return Count;
    }
    public static String Text(){
        return prop.getProperty("ImageText");
    }

    public static String GitHubLinkURL(){
        return prop.getProperty("GitHubURL");
    }
    public static String SpecificText(){
        return prop.getProperty("ColumnText");
    }

    public static String SpecificCellText(){
        return prop.getProperty("CellText");
    }
    public static String editClickOnRow(){
        return prop.getProperty("EditClickOnRow");
    }
    public static String editClickURL(){
        return prop.getProperty("EditClickURL");
    }
    public static String deleteClickOnRow(){
        return prop.getProperty("DeleteClickOnRow");
    }
    public static String deleteClickURL(){
        return prop.getProperty("DeleteClickURL");
    }
}
