public class com.sun.jna.LastErrorException {
    private static java.lang.String formatMessage(int code) {
        return:String(ternaryop:String(invokestatic:boolean(Platform::isWindows), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("GetLastError() returned ")), code:int)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("errno was ")), code:int))))
    }
    
    private static java.lang.String parseMessage(java.lang.String m) {
        try {
            return:String(invokestatic:String(LastErrorException::formatMessage, invokestatic:int(Integer::parseInt, m:String)))
        }
        catch (java.lang.NumberFormatException var_3_0B) {
            return:String(m:String)
        }
    }
    
    public int getErrorCode() {
        return:int(getfield:int(LastErrorException::errorCode, this:LastErrorException))
    }
    
    public void LastErrorException(java.lang.String msg) {
        invokespecial:RuntimeException(RuntimeException::<init>, this:LastErrorException, invokestatic:String(LastErrorException::parseMessage, invokevirtual:String(String::trim, msg:String)))
        
        try {
            if (invokevirtual:boolean(String::startsWith, msg:String, ldc:String("["))) {
                msg = invokevirtual:String(String::substring, msg:String, ldc:int(1), invokevirtual:int(String::indexOf, msg:String, ldc:String("]")))
            }
            
            putfield:int(LastErrorException::errorCode, this:LastErrorException, invokestatic:int(Integer::parseInt, msg:String))
        }
        catch (java.lang.NumberFormatException var_4_2E) {
            putfield:int(LastErrorException::errorCode, this:LastErrorException, ldc:int(-1))
        }
    }
    
    public void LastErrorException(int code) {
        invokespecial:LastErrorException(LastErrorException::<init>, this:LastErrorException, code:int, invokestatic:String(LastErrorException::formatMessage, code:int))
    }
    
    public void LastErrorException(int code, java.lang.String msg) {
        invokespecial:RuntimeException(RuntimeException::<init>, this:LastErrorException, msg:String)
        putfield:int(LastErrorException::errorCode, this:LastErrorException, code:int)
    }
}
