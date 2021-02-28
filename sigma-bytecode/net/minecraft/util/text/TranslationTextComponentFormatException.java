public class net.minecraft.util.text.TranslationTextComponentFormatException {
    public void TranslationTextComponentFormatException(net.minecraft.util.text.TranslationTextComponent component, java.lang.String message) {
        invokespecial:IllegalArgumentException(IllegalArgumentException::<init>, this:TranslationTextComponentFormatException, invokestatic:String(String::format, ldc:String("Error parsing: %s: %s"), initarray:Object[](java.lang.Object[].class, component:TranslationTextComponent[expected:Object], message:String[expected:Object])))
    }
    
    public void TranslationTextComponentFormatException(net.minecraft.util.text.TranslationTextComponent component, int index) {
        invokespecial:IllegalArgumentException(IllegalArgumentException::<init>, this:TranslationTextComponentFormatException, invokestatic:String(String::format, ldc:String("Invalid index %d requested for %s"), initarray:Object[](java.lang.Object[].class, invokestatic:Integer[expected:Object](Integer::valueOf, index:int), component:TranslationTextComponent[expected:Object])))
    }
    
    public void TranslationTextComponentFormatException(net.minecraft.util.text.TranslationTextComponent component, java.lang.Throwable cause) {
        invokespecial:IllegalArgumentException(IllegalArgumentException::<init>, this:TranslationTextComponentFormatException, invokestatic:String(String::format, ldc:String("Error while parsing: %s"), initarray:Object[](java.lang.Object[].class, component:TranslationTextComponent[expected:Object])), cause:Throwable)
    }
}
