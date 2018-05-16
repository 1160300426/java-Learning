package testJavaLog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class testLogger {

	public static void main(String[] args) {
		try {
            FileHandler fileHandler = new FileHandler("src/testJavaLog/test.txt");
            fileHandler.setLevel(Level.INFO);
            fileHandler.setFormatter(new Formatter() {//定义一个匿名类
                @Override
                public String format(LogRecord record) {
                    return record.getLevel() + ":" + record.getMessage() + "\n";
                }
            });
            Logger logger = Logger.getLogger("hhh");
            logger.addHandler(fileHandler);
            logger.info("测试");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
