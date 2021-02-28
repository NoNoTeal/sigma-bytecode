public class net.minecraft.util.text.CharacterManager {
    public void CharacterManager(net.minecraft.util.text.CharacterManager$ICharWidthProvider p_i232243_1_) {
        invokespecial:Object(Object::<init>, this:CharacterManager)
        putfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager, p_i232243_1_:CharacterManager$ICharWidthProvider)
    }
    
    public float func_238350_a_(java.lang.String p_238350_1_) {
        var_4_10 : MutableFloat
        
        if (cmpeq:boolean(p_238350_1_:String, aconstnull:String())) {
            return:float(ldc:float(0.0f))
        }
        
        var_4_10 = initobject:MutableFloat(MutableFloat::<init>)
        invokestatic:boolean(TextProcessing::func_238346_c_, p_238350_1_:String, getstatic:Style(Style::EMPTY), bind:\ub8be\u1187\ud523\u3c25\u8d98\u760c((p_238363_2_:int, p_238363_3_:Style, p_238363_4_:int) -> {
            invokevirtual:void(MutableFloat::add, var_4_10:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_238363_4_:int, p_238363_3_:Style))
            return:boolean(ldc:boolean(1))
        }))
        return:float(invokevirtual:float(MutableFloat::floatValue, var_4_10:MutableFloat))
    }
    
    public float func_238356_a_(net.minecraft.util.text.ITextProperties p_238356_1_) {
        var_4_0A : MutableFloat
        
        var_4_0A = initobject:MutableFloat(MutableFloat::<init>)
        invokestatic:boolean(TextProcessing::func_238343_a_, p_238356_1_:ITextProperties, getstatic:Style(Style::EMPTY), bind:\ub8be\u1187\ud523\u3c25\u8d98\u760c((p_238359_2_:int, p_238359_3_:Style, p_238359_4_:int) -> {
            invokevirtual:void(MutableFloat::add, var_4_0A:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_238359_4_:int, p_238359_3_:Style))
            return:boolean(ldc:boolean(1))
        }))
        return:float(invokevirtual:float(MutableFloat::floatValue, var_4_0A:MutableFloat))
    }
    
    public float func_243238_a(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p_243238_1_) {
        var_4_0A : MutableFloat
        
        var_4_0A = initobject:MutableFloat(MutableFloat::<init>)
        invokeinterface:boolean(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u416d\ufcaf\u759a\ubff1\ud7e8\u12cb, p_243238_1_:\u718f\u8413\u1833\u72f1\u5fe1\u927d, bind:\ub8be\u1187\ud523\u3c25\u8d98\u760c((p_243243_2_:int, p_243243_3_:Style, p_243243_4_:int) -> {
            invokevirtual:void(MutableFloat::add, var_4_0A:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_243243_4_:int, p_243243_3_:Style))
            return:boolean(ldc:boolean(1))
        }))
        return:float(invokevirtual:float(MutableFloat::floatValue, var_4_0A:MutableFloat))
    }
    
    public int func_238352_a_(java.lang.String p_238352_1_, int p_238352_2_, net.minecraft.util.text.Style p_238352_3_) {
        var_6_0E : CharacterManager$StringWidthProcessor
        
        var_6_0E = initobject:CharacterManager$StringWidthProcessor(CharacterManager$StringWidthProcessor::<init>, this:CharacterManager, i2f:float(p_238352_2_:int))
        invokestatic:boolean(TextProcessing::func_238341_a_, p_238352_1_:String, p_238352_3_:Style, var_6_0E:CharacterManager$StringWidthProcessor[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c])
        return:int(invokevirtual:int(CharacterManager$StringWidthProcessor::func_238398_a_, var_6_0E:CharacterManager$StringWidthProcessor))
    }
    
    public java.lang.String func_238361_b_(java.lang.String p_238361_1_, int p_238361_2_, net.minecraft.util.text.Style p_238361_3_) {
        return:String(invokevirtual:String(String::substring, p_238361_1_:String, ldc:int(0), invokevirtual:int(CharacterManager::func_238352_a_, this:CharacterManager, p_238361_1_:String, p_238361_2_:int, p_238361_3_:Style)))
    }
    
    public java.lang.String func_238364_c_(java.lang.String p_238364_1_, int p_238364_2_, net.minecraft.util.text.Style p_238364_3_) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.Style func_238357_a_(net.minecraft.util.text.ITextProperties p_238357_1_, int p_238357_2_) {
        return:Style(checkcast:Style(net.minecraft.util.text.Style.class, invokevirtual:Style(Optional<Style>::orElse, invokeinterface:Optional<Style>(ITextProperties::func_230439_a_, p_238357_1_:ITextProperties, bind:ITextProperties$IStyledTextAcceptor<Style>((p_238348_1_:Style, p_238348_2_:String) -> return:Optional<Style>(ternaryop:Optional<Style>(invokestatic:boolean(TextProcessing::func_238346_c_, p_238348_2_:String, p_238348_1_:Style, initobject:CharacterManager$StringWidthProcessor[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c](CharacterManager$StringWidthProcessor::<init>, this:CharacterManager, i2f:float(p_238357_2_:int))), invokestatic:Optional<Style>(Optional<T>::empty), invokestatic:Optional<Style>(Optional<T>::of, p_238348_1_:Style)))), getstatic:Style(Style::EMPTY)), checkcast:Style(net.minecraft.util.text.Style.class, aconstnull:Style()))))
    }
    
    public net.minecraft.util.text.Style func_243239_a(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p_243239_1_, int p_243239_2_) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.ITextProperties func_238358_a_(net.minecraft.util.text.ITextProperties p_238358_1_, int p_238358_2_, net.minecraft.util.text.Style p_238358_3_) {
        return:ITextProperties(checkcast:ITextProperties(net.minecraft.util.text.ITextProperties.class, invokevirtual:ITextProperties(Optional<ITextProperties>::orElse, invokeinterface:Optional<ITextProperties>(ITextProperties::func_230439_a_, p_238358_1_:ITextProperties, initobject:CharacterManager$1[expected:ITextProperties$IStyledTextAcceptor<ITextProperties>](CharacterManager$1::<init>, this:CharacterManager, initobject:CharacterManager$StringWidthProcessor(CharacterManager$StringWidthProcessor::<init>, this:CharacterManager, i2f:float(p_238358_2_:int))), p_238358_3_:Style), p_238358_1_:ITextProperties)))
    }
    
    public static int func_238351_a_(java.lang.String p_238351_0_, int p_238351_1_, int p_238351_2_, boolean p_238351_3_) {
        // java.lang.NullPointerException
    }
    
    public void func_238353_a_(java.lang.String p_238353_1_, int p_238353_2_, net.minecraft.util.text.Style p_238353_3_, boolean p_238353_4_, net.minecraft.util.text.CharacterManager$ISliceAcceptor p_238353_5_) {
        // java.lang.NullPointerException
    }
    
    public java.util.List<net.minecraft.util.text.ITextProperties> func_238365_g_(java.lang.String p_238365_1_, int p_238365_2_, net.minecraft.util.text.Style p_238365_3_) {
        var_6_08 : ArrayList
        
        var_6_08 = invokestatic:ArrayList(Lists::newArrayList)
        invokevirtual:void(CharacterManager::func_238353_a_, this:CharacterManager, p_238365_1_:String, p_238365_2_:int, p_238365_3_:Style, ldc:boolean(0), bind:CharacterManager$ISliceAcceptor((p_238354_2_:Style, p_238354_3_:int, p_238354_4_:int) -> {
            invokeinterface:boolean(List<ITextProperties>::add, var_6_08:ArrayList<ITextProperties>[expected:List<ITextProperties>], invokestatic:ITextProperties(ITextProperties::func_240653_a_, invokevirtual:String(String::substring, p_238365_1_:String, p_238354_3_:int, p_238354_4_:int), p_238354_2_:Style))
            return()
        }))
        return:List<ITextProperties>(var_6_08:ArrayList<ITextProperties>)
    }
    
    public java.util.List<net.minecraft.util.text.ITextProperties> func_238362_b_(net.minecraft.util.text.ITextProperties p_238362_1_, int p_238362_2_, net.minecraft.util.text.Style p_238362_3_) {
        var_6_08 : ArrayList
        
        var_6_08 = invokestatic:ArrayList(Lists::newArrayList)
        invokevirtual:void(CharacterManager::func_243242_a, this:CharacterManager, p_238362_1_:ITextProperties, p_238362_2_:int, p_238362_3_:Style, bind:BiConsumer<ITextProperties, Boolean>((p_243241_1_:ITextProperties, p_243241_2_:Boolean) -> {
            invokeinterface:boolean(List<ITextProperties>::add, var_6_08:ArrayList<ITextProperties>[expected:List<ITextProperties>], p_243241_1_:ITextProperties)
            return()
        }))
        return:List<ITextProperties>(var_6_08:ArrayList<ITextProperties>)
    }
    
    public void func_243242_a(net.minecraft.util.text.ITextProperties p_243242_1_, int p_243242_2_, net.minecraft.util.text.Style p_243242_3_, java.util.function.BiConsumer<net.minecraft.util.text.ITextProperties, java.lang.Boolean> p_243242_4_) {
        // java.lang.NullPointerException
    }
    
    private static java.util.Optional lambda$func_243242_a$8(java.util.List list, net.minecraft.util.text.Style p_238355_1_, java.lang.String p_238355_2_) {
        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p_238355_2_:String))) {
            invokeinterface:boolean(List<CharacterManager$StyleOverridingTextComponent>::add, list:List<CharacterManager$StyleOverridingTextComponent>, initobject:CharacterManager$StyleOverridingTextComponent(CharacterManager$StyleOverridingTextComponent::<init>, p_238355_2_:String, p_238355_1_:Style))
        }
        
        return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
    }
    
    private static void lambda$func_238362_b_$7(java.util.List list, net.minecraft.util.text.ITextProperties p_243241_1_, java.lang.Boolean p_243241_2_) {
        invokeinterface:boolean(List<ITextProperties>::add, list:List<ITextProperties>, p_243241_1_:ITextProperties)
    }
    
    private static void lambda$func_238365_g_$6(java.util.List list, java.lang.String p_238365_1_, net.minecraft.util.text.Style p_238354_2_, int p_238354_3_, int p_238354_4_) {
        invokeinterface:boolean(List<ITextProperties>::add, list:List<ITextProperties>, invokestatic:ITextProperties(ITextProperties::func_240653_a_, invokevirtual:String(String::substring, p_238365_1_:String, p_238354_3_:int, p_238354_4_:int), p_238354_2_:Style))
    }
    
    private static boolean lambda$func_243239_a$5(net.minecraft.util.text.CharacterManager$StringWidthProcessor charactermanager$stringwidthprocessor, org.apache.commons.lang3.mutable.MutableObject mutableobject, int p_243240_2_, net.minecraft.util.text.Style p_243240_3_, int p_243240_4_) {
        if (logicalnot:boolean(invokevirtual:boolean(CharacterManager$StringWidthProcessor::\ubcb0\u760c\ub32d\u927d\uc9f6\u64ab, charactermanager$stringwidthprocessor:CharacterManager$StringWidthProcessor, p_243240_2_:int, p_243240_3_:Style, p_243240_4_:int))) {
            invokevirtual:void(MutableObject::setValue, mutableobject:MutableObject, p_243240_3_:Style[expected:Object])
            return:boolean(ldc:boolean(0))
        }
        
        return:boolean(ldc:boolean(1))
    }
    
    private static java.util.Optional lambda$func_238357_a_$4(net.minecraft.util.text.CharacterManager$StringWidthProcessor charactermanager$stringwidthprocessor, net.minecraft.util.text.Style p_238348_1_, java.lang.String p_238348_2_) {
        return:Optional(ternaryop:Optional<Style>(invokestatic:boolean(TextProcessing::func_238346_c_, p_238348_2_:String, p_238348_1_:Style, charactermanager$stringwidthprocessor:CharacterManager$StringWidthProcessor[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c]), invokestatic:Optional<Style>(Optional<T>::empty), invokestatic:Optional<Style>(Optional<T>::of, p_238348_1_:Style)))
    }
    
    private boolean lambda$func_238364_c_$3(org.apache.commons.lang3.mutable.MutableFloat mutablefloat, int p_238364_2_, org.apache.commons.lang3.mutable.MutableInt mutableint, int p_238360_4_, net.minecraft.util.text.Style p_238360_5_, int p_238360_6_) {
        if (cmpgt:boolean(invokevirtual:float(MutableFloat::addAndGet, mutablefloat:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_238360_6_:int, p_238360_5_:Style)), i2f:float(p_238364_2_:int))) {
            return:boolean(ldc:boolean(0))
        }
        
        invokevirtual:void(MutableInt::setValue, mutableint:MutableInt, p_238360_4_:int)
        return:boolean(ldc:boolean(1))
    }
    
    private boolean lambda$func_243238_a$2(org.apache.commons.lang3.mutable.MutableFloat mutablefloat, int p_243243_2_, net.minecraft.util.text.Style p_243243_3_, int p_243243_4_) {
        invokevirtual:void(MutableFloat::add, mutablefloat:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_243243_4_:int, p_243243_3_:Style))
        return:boolean(ldc:boolean(1))
    }
    
    private boolean lambda$func_238356_a_$1(org.apache.commons.lang3.mutable.MutableFloat mutablefloat, int p_238359_2_, net.minecraft.util.text.Style p_238359_3_, int p_238359_4_) {
        invokevirtual:void(MutableFloat::add, mutablefloat:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_238359_4_:int, p_238359_3_:Style))
        return:boolean(ldc:boolean(1))
    }
    
    private boolean lambda$func_238350_a_$0(org.apache.commons.lang3.mutable.MutableFloat mutablefloat, int p_238363_2_, net.minecraft.util.text.Style p_238363_3_, int p_238363_4_) {
        invokevirtual:void(MutableFloat::add, mutablefloat:MutableFloat, invokeinterface:float(CharacterManager$ICharWidthProvider::getWidth, getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, this:CharacterManager), p_238363_4_:int, p_238363_3_:Style))
        return:boolean(ldc:boolean(1))
    }
    
    public static net.minecraft.util.text.CharacterManager$ICharWidthProvider access$300(net.minecraft.util.text.CharacterManager x0) {
        return:CharacterManager$ICharWidthProvider(getfield:CharacterManager$ICharWidthProvider(CharacterManager::field_238347_a_, x0:CharacterManager))
    }
}
