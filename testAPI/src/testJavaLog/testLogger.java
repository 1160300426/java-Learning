package testJavaLog;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class testLogger {
	
	// ���������ڸ�ʽ
    public static final String DATE_PATTERN_FULL = "yyyy-MM-dd HH:mm:ss";

	public static void main(String[] args) {
		FileHandler fileHandler;
		final StringBuilder exceptionType = new StringBuilder();
		final StringBuilder exceptionConsequence = new StringBuilder();
		try {
            fileHandler = new FileHandler("src/testJavaLog/test.txt");
            fileHandler.setLevel(Level.INFO);
            fileHandler.setFormatter(new Formatter() {//����һ��������
                @Override
                public String format(LogRecord record) {
                    return "Time: " + getCurrentDateStr(DATE_PATTERN_FULL) + "\t" + "Type: " + exceptionType + "\t" +
                    		"ClassName: " + record.getSourceClassName() + "\t" + "MethodName: " + record.getSourceMethodName() + "\t"
                    		+ "Information: " + record.getMessage() + "\t" + "Consequence: " + exceptionConsequence + "\n";
                }
            });
            Logger logger = Logger.getLogger("hhh");
            if (!(exceptionType.length() == 0)) {
            	exceptionType.delete(0, exceptionType.length() - 1);
			}
            exceptionType.append(".");
            if (!(exceptionConsequence.length() == 0)) {
            	exceptionConsequence.delete(0, exceptionConsequence.length() - 1);
			}
            exceptionConsequence.append(",,");
            logger.addHandler(fileHandler);
            logger.info("����");
            
            logger = Logger.getLogger("hh");
            if (!(exceptionType.length() == 0)) {
            	exceptionType.delete(0, exceptionType.length() - 1);
			}
            exceptionType.append("..");
            if (!(exceptionConsequence.length() == 0)) {
            	exceptionConsequence.delete(0, exceptionConsequence.length() - 1);
			}
            exceptionConsequence.append(",,,,");
            logger.addHandler(fileHandler);
            logger.info("hei�㵱������");
            
            if (!(exceptionType.length() == 0)) {
            	exceptionType.delete(0, exceptionType.length() - 1);
			}
            exceptionType.append("...");
            if (!(exceptionConsequence.length() == 0)) {
            	exceptionConsequence.delete(0, exceptionConsequence.length() - 1);
			}
            exceptionConsequence.append(",,,,,,");
            F(fileHandler);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
     * ��ȡ��ǰʱ��
     * 
     * @return
     */
    public static String getCurrentDateStr(String pattern) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
	
	public static void F(FileHandler fileHandler) {
		try {
            Logger logger = Logger.getLogger("hhh586");
            logger.addHandler(fileHandler);
            logger.info("����dccdfd");
        } catch (SecurityException e) {
            e.printStackTrace();
        }
	}
}
