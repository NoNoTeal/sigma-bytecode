public class net.minecraft.util.text.ScoreTextComponent {
    private static \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 func_240707_c_(java.lang.String p_240707_0_) {
        try {
            return:\u7bad\u71ae\ua61f\ub102\u8413(invokevirtual:\u7bad\u71ae\ua61f\ub102\u8413(\u8413\uc4d2\u839e\u965f\u0800::\ud171\uceb8\u71ae\uae87\u74b1\ubb2b, initobject:\u8413\uc4d2\u839e\u965f\u0800(\u8413\uc4d2\u839e\u965f\u0800::<init>, initobject:StringReader(StringReader::<init>, p_240707_0_:String))))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_3_16) {
            return:\u7bad\u71ae\ua61f\ub102\u8413(aconstnull:\u7bad\u71ae\ua61f\ub102\u8413())
        }
    }
    
    public void ScoreTextComponent(java.lang.String nameIn, java.lang.String objectiveIn) {
        invokespecial:ScoreTextComponent(ScoreTextComponent::<init>, this:ScoreTextComponent, nameIn:String, invokestatic:\u7bad\u71ae\ua61f\ub102\u8413(ScoreTextComponent::func_240707_c_, nameIn:String), objectiveIn:String)
    }
    
    private void ScoreTextComponent(java.lang.String p_i232569_1_, \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 p_i232569_2_, java.lang.String p_i232569_3_) {
        invokespecial:TextComponent(TextComponent::<init>, this:ScoreTextComponent)
        putfield:String(ScoreTextComponent::name, this:ScoreTextComponent, p_i232569_1_:String)
        putfield:\u7bad\u71ae\ua61f\ub102\u8413(ScoreTextComponent::selector, this:ScoreTextComponent, p_i232569_2_:\u7bad\u71ae\ua61f\ub102\u8413)
        putfield:String(ScoreTextComponent::objective, this:ScoreTextComponent, p_i232569_3_:String)
    }
    
    public java.lang.String getName() {
        return:String(getfield:String(ScoreTextComponent::name, this:ScoreTextComponent))
    }
    
    public java.lang.String getObjective() {
        return:String(getfield:String(ScoreTextComponent::objective, this:ScoreTextComponent))
    }
    
    private java.lang.String func_240705_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_240705_1_) {
        var_4_12 : List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        
        if (cmpne:boolean(getfield:\u7bad\u71ae\ua61f\ub102\u8413(ScoreTextComponent::selector, this:ScoreTextComponent), aconstnull:\u7bad\u71ae\ua61f\ub102\u8413())) {
            var_4_12 = invokevirtual:List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u7bad\u71ae\ua61f\ub102\u8413::\ucb79\ub83f\u56bd\u7006\u6d69\u62da, getfield:\u7bad\u71ae\ua61f\ub102\u8413(ScoreTextComponent::selector, this:ScoreTextComponent), p_240705_1_:\u8413\u5140\u64f2\uc9f6\u9937)
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_4_12:List))) {
                if (cmpne:boolean(invokeinterface:int(List::size, var_4_12:List<\u7d52\u718f\u3776\u6fb0\ub83f>), ldc:int(1))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u600f\u9937\ub8be\ud171\u624e::\ud523\u61a4\u16f6\uc229\u3d4b\u3711)))
                }
                
                return:String(invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, var_4_12:List<\u7d52\u718f\u3776\u6fb0\ub83f>, ldc:int(0)))))
            }
        }
        
        return:String(getfield:String(ScoreTextComponent::name, this:ScoreTextComponent))
    }
    
    private java.lang.String func_240706_a_(java.lang.String p_240706_1_, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_240706_2_) {
        // java.lang.NullPointerException
    }
    
    public net.minecraft.util.text.ScoreTextComponent copyRaw() {
        return:ScoreTextComponent(initobject:ScoreTextComponent(ScoreTextComponent::<init>, getfield:String(ScoreTextComponent::name, this:ScoreTextComponent), getfield:\u7bad\u71ae\ua61f\ub102\u8413(ScoreTextComponent::selector, this:ScoreTextComponent), getfield:String(ScoreTextComponent::objective, this:ScoreTextComponent)))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent func_230535_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_230535_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_230535_2_, int p_230535_3_) {
        var_6_17 : String
        
        if (cmpeq:boolean(p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937, aconstnull:\u8413\u5140\u64f2\uc9f6\u9937())) {
            return:IFormattableTextComponent(initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, ldc:String("")))
        }
        
        var_6_17 = invokespecial:String(ScoreTextComponent::func_240705_a_, this:ScoreTextComponent, p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937)
        return:IFormattableTextComponent(initobject:StringTextComponent(StringTextComponent::<init>, invokespecial:String(ScoreTextComponent::func_240706_a_, this:ScoreTextComponent, ternaryop:String(logicaland:boolean(cmpne:boolean(p_230535_2_:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), invokevirtual:boolean(String::equals, var_6_17:String, ldc:String[expected:Object]("*"))), invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, p_230535_2_:\u7d52\u718f\u3776\u6fb0\ub83f), var_6_17:String), p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937)))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : ScoreTextComponent
        
        if (cmpeq:boolean(this:ScoreTextComponent[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.ScoreTextComponent.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:ScoreTextComponent(net.minecraft.util.text.ScoreTextComponent.class, p_equals_1_:Object[expected:ScoreTextComponent])
        return:boolean(logicaland:boolean(logicaland:boolean(invokevirtual:boolean(String::equals, getfield:String(ScoreTextComponent::name, this:ScoreTextComponent), getfield:String(ScoreTextComponent::name, var_4_17:ScoreTextComponent)), invokevirtual:boolean(String::equals, getfield:String(ScoreTextComponent::objective, this:ScoreTextComponent), getfield:String(ScoreTextComponent::objective, var_4_17:ScoreTextComponent))), invokespecial:boolean(TextComponent::equals, this:ScoreTextComponent[expected:TextComponent], p_equals_1_:Object)))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("ScoreComponent{name='")), getfield:String(ScoreTextComponent::name, this:ScoreTextComponent)), ldc:char(39)), ldc:String("objective='")), getfield:String(ScoreTextComponent::objective, this:ScoreTextComponent)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](ScoreTextComponent::siblings, this:ScoreTextComponent)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:ScoreTextComponent[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:ScoreTextComponent[expected:TextComponent](ScoreTextComponent::copyRaw, this:ScoreTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:ScoreTextComponent[expected:IFormattableTextComponent](ScoreTextComponent::copyRaw, this:ScoreTextComponent))
    }
}
