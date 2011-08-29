package nikos.util;

import java.io.File;

/**
 *
 * @author nikos
 */
public class CheckContentsUtil {

    public static boolean fileContains(File file, String value) {
        throw new RuntimeException("not ready yet");
    }
    
    public static String findFile(String fileNameExpr){
        return fileRecursion(new File("."), fileNameExpr);
    }
    
    private static String fileRecursion(File f,String pattern){                
        final String fileName = f.getName();
        if(fileName.matches(pattern)){
            return fileName;
        }
        
        if(f.isDirectory()){
            for(File child:f.listFiles()){
                final String fileName0 = fileRecursion(child,pattern);
                if(fileName0!=null){
                    return fileName0;
                }
            }
        }
        
        return null;
    }
}
