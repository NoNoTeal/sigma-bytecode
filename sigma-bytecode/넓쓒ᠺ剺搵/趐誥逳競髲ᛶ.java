public class \ub113\uc4d2\u183a\u527a\u6435.\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6 {
    public void \u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua068\u392e\u3d64\u5db4\uc87f\u4c04 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff p2, \u5d20\u7043\u88c5\u5db4\uf94d.\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f p3) {
        var_7_BF : int
        var_8_C9 : int
        var_10_143 : int
        var_11_179 : Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::<init>, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)
            putfield:List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokestatic:ArrayList[expected:List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>](Lists::newArrayList))
            putfield:\ua068\u392e\u3d64\u5db4\uc87f\u4c04(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u6b5f\uc2e8\u4c04\u6b0d\u9255\u92ee, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\ua068\u392e\u3d64\u5db4\uc87f\u4c04)
            putfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p2:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)
            putfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\ufcaf\u392e\u5db4\u5d20\ud51e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokevirtual:\u718f\u8413\u1833\u72f1\u5fe1\u927d(LanguageMap::func_241870_a, invokestatic:LanguageMap(LanguageMap::getInstance), invokevirtual:ITextProperties(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u8389\ub32d\u3504\u1833\u9af2\ub19c, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:ITextComponent[expected:ITextProperties](\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u983f\ubf56\u8d98\u3c25\u9af2\u12cb, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f), xor:int(ldc:int(8459), ldc:int(8616)))))
            putfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokevirtual:float(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\ub6ab\ucb79\ua6bd\ub171\u4daf\u5d20, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f), ldc:float(28.0f))))
            putfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(invokevirtual:float(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u839e\u4bc8\ud217\u8709\u72f1\u156b, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f), ldc:float(27.0f))))
            var_7_BF = invokevirtual:int(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\uc87f\uae87\u6cfe\u8cae\ud158\u98a4, p2:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)
            var_8_C9 = invokevirtual:int(String::length, invokestatic:String(String::valueOf, var_7_BF:int))
            var_10_143 = add:int(add:int(ldc:int(29), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u4bc8\uc7fe\u3dd3\u3d64\u7043\u4c04, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\ufcaf\u392e\u5db4\u5d20\ud51e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), ternaryop:int(cmple:boolean(var_7_BF:int, xor:int(ldc:int(9504), ldc:int(9505))), and:int(ldc:int(-30433), ldc:int(22080)), add:int(add:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u4f52\u71ae\u4d85\u0c95\u3d4b\u62da), and:int(ldc:int(9596), ldc:int(-30079)))), mul:int(mul:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u4f52\u71ae\u4d85\u0c95\u3d4b\u62da), xor:int(ldc:int(18442), ldc:int(18443)))), var_8_C9:int), xor:int(ldc:int(2579), ldc:int(2577)))), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u4f52\u71ae\u4d85\u0c95\u3d4b\u62da), and:int(ldc:int(1026), ldc:int(19043)))))))
            putfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokevirtual:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(LanguageMap::func_244260_a, invokestatic:LanguageMap(LanguageMap::getInstance), invokespecial:List<ITextProperties>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8258\u4f4a\u92ee\u4c04\u8cae\u516c, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokestatic:IFormattableTextComponent[expected:ITextComponent](TextComponentUtils::func_240648_a_, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, invokevirtual:ITextComponent(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u51fa\u494c\ud12e\ub32d\u6d69\ubcb0, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f)), invokevirtual:Style(Style::setFormatting, getstatic:Style(Style::EMPTY), invokevirtual:TextFormatting(\u71ae\u4492\u71f1\u74b1\u51fa\u8709::\u7049\u7330\u5245\u64f2\uf94d\u3776, invokevirtual:\u71ae\u4492\u71f1\u74b1\u51fa\u8709(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\uceb8\u3e75\u8d90\u7c6b\u5654\ubff1, p3:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f)))), var_10_143:int)))
            var_11_179 = invokeinterface:Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::iterator, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_11_179:Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>)) {
                var_10_143 = invokestatic:int(Math::max, var_10_143:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u4bc8\uc7fe\u3dd3\u3d64\u7043\u4c04, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), checkcast:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d.class, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::next, var_11_179:Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>))))
            }
            
            putfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, add:int(add:int(var_10_143:int, xor:int(ldc:int(3074), ldc:int(3073))), xor:int(ldc:int(1606), ldc:int(1603))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static float \ubefe\u51fa\uc84e\uc4d2\u92ee\ub102(net.minecraft.util.text.CharacterManager p0, java.util.List<net.minecraft.util.text.ITextProperties> p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:float(d2f:float(invokevirtual:double(OptionalDouble::orElse, invokeinterface:OptionalDouble(DoubleStream::max, invokeinterface:DoubleStream(Stream<Object>::mapToDouble, invokeinterface:Stream<Object>(Collection<Object>::stream, p1:Collection<Object>), invokedynamic:ToDoubleFunction<ITextProperties>(applyAsDouble:(Lnet/minecraft/util/text/CharacterManager;)Ljava/util/function/ToDoubleFunction;, p0:CharacterManager))), ldc:double(0.0))))
        }
        
        goto(Label_0006)
    }
    
    private java.util.List<net.minecraft.util.text.ITextProperties> \u8258\u4f4a\u92ee\u4c04\u8cae\u516c(net.minecraft.util.text.ITextComponent p0, int p1) {
        var_5_6C : CharacterManager
        var_6_6F : List<ITextProperties>
        var_7_74 : float
        var_8_79 : int[]
        var_9_7E : int
        var_10_87 : int
        var_12_AB : List<ITextProperties>
        var_13_BA : float
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_6C = invokevirtual:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u92ff\u760c\u3bc9\u6198\ubff1\u64ab, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))
            var_6_6F = aconstnull:List<ITextProperties>()
            var_7_74 = ldc:float(3.4028235E38f)
            var_8_79 = getstatic:int[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\u5d20\ufe34\u6b0d\u8c8a\u8389)
            var_9_7E = arraylength:int(var_8_79:int[])
            var_10_87 = and:int(ldc:int(26196), ldc:int(-26197))
            
            while (cmplt:boolean(var_10_87:int, var_9_7E:int)) {
                var_12_AB = invokevirtual:List<ITextProperties>(CharacterManager::func_238362_b_, var_5_6C:CharacterManager, p0:ITextComponent[expected:ITextProperties], sub:int(p1:int, loadelement:int(var_8_79:int[], var_10_87:int)), getstatic:Style(Style::EMPTY))
                var_13_BA = invokestatic:float(Math::abs, sub:float(invokestatic:float(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ubefe\u51fa\uc84e\uc4d2\u92ee\ub102, var_5_6C:CharacterManager, var_12_AB:List<ITextProperties>), i2f:float(p1:int)))
                
                if (cmple:boolean(var_13_BA:float, ldc:float(10.0f))) {
                    return:List<ITextProperties>(var_12_AB:List<ITextProperties>)
                }
                
                if (cmplt:boolean(var_13_BA:float, var_7_74:float)) {
                    var_7_74 = var_13_BA:float
                    var_6_6F = var_12_AB:List<ITextProperties>
                }
                
                inc:int(var_10_87, ldc:int(1))
            }
            
            return:List<ITextProperties>(var_6_6F:List<ITextProperties>)
        }
        
        goto(Label_0006)
    }
    
    private \ub113\uc4d2\u183a\u527a\u6435.\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6 \u51fa\u8aa5\u7330\u67d0\u7873\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ucfaf\u836c\u836c\u120d\ua3b4\u92ff p0) {
        var_2_61 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(731362133), ldc:int(-548569636))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1415692332))
                    p0 = invokevirtual:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\ubff1\u6b5f\u4f52\u1833\u7873\ubded, p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff)
                    
                    if (cmpne:boolean(p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff, aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff())) {
                        if (cmpeq:boolean(invokevirtual:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u71ae\u5fe1\u8c8a\u5d20\u6198\u7043, p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f())) {
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(ternaryop:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(logicaland:boolean(cmpne:boolean(p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff, aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff()), cmpne:boolean(invokevirtual:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\u71ae\u5fe1\u8c8a\u5d20\u6198\u7043, p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f())), invokevirtual:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\ua068\u392e\u3d64\u5db4\uc87f\u4c04::\uc9f6\u9af2\u494c\u960f\u12b2\u6d99, getfield:\ua068\u392e\u3d64\u5db4\uc87f\u4c04(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u6b5f\uc2e8\u4c04\u6b0d\u9255\u92ee, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), p0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff), aconstnull:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6()))
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\ub102\ubefe\ub6ab\u5d20\ud523(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, boolean p3) {
        var_5_D9 : int
        var_7_92 : int
        var_8_A8 : int
        var_9_B6 : int
        var_10_C1 : int
        var_11_CC : int
        stack_EE_0 : int [generated]
        var_12_EE : int
        var_7_7D : Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_D9 = and:int(ldc:int(-1804406516), ldc:int(-1297121492))
            
            if (cmpne:boolean(getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6())) {
                var_7_92 = add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), ldc:int(13))
                var_8_A8 = add:int(add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), ldc:int(26)), and:int(ldc:int(613), ldc:int(9220)))
                var_9_B6 = add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), ldc:int(13))
                var_10_C1 = add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(13))
                var_11_CC = add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(13))
                
                if (logicalnot:boolean(p3:boolean)) {
                    var_5_D9 = and:int(var_5_D9:int, ldc:int(-680037394))
                    stack_EE_0 = ldc:int(-1)
                }
                else {
                    stack_EE_0 = ldc:int(-16777216)
                }
                
                var_5_D9 = and:int(var_5_D9:int, ldc:int(-42827825))
                var_12_EE = stack_EE_0:int
                
                if (logicalnot:boolean(p3:boolean)) {
                    var_5_D9 = and:int(var_5_D9:int, ldc:int(-101287140))
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_A8:int, var_7_92:int, var_9_B6:int, var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C1:int, var_8_A8:int, var_11_CC:int, var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u516c\uc87f\u8350\ubcb0\u9033\u4f4a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_A8:int, var_11_CC:int, var_9_B6:int, var_12_EE:int)
                }
                else {
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_A8:int, var_7_92:int, sub:int(var_9_B6:int, xor:int(ldc:int(-32592), ldc:int(-32591))), var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_8_A8:int, and:int(ldc:int(16457), ldc:int(903))), var_7_92:int, var_9_B6:int, var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_8_A8:int, var_7_92:int, add:int(var_9_B6:int, and:int(ldc:int(18465), ldc:int(9219))), var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C1:int, sub:int(var_8_A8:int, xor:int(ldc:int(5384), ldc:int(5385))), sub:int(var_11_CC:int, and:int(ldc:int(1281), ldc:int(25231))), var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C1:int, sub:int(var_8_A8:int, and:int(ldc:int(23), ldc:int(14337))), var_11_CC:int, var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ud217\ufe34\u5245\u71ae\u8aa5\u97e6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C1:int, sub:int(var_8_A8:int, and:int(ldc:int(4105), ldc:int(25735))), add:int(var_11_CC:int, xor:int(ldc:int(270), ldc:int(271))), var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u516c\uc87f\u8350\ubcb0\u9033\u4f4a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_8_A8:int, and:int(ldc:int(10785), ldc:int(4297))), var_11_CC:int, var_9_B6:int, var_12_EE:int)
                    invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u516c\uc87f\u8350\ubcb0\u9033\u4f4a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_8_A8:int, and:int(ldc:int(16385), ldc:int(1))), var_11_CC:int, var_9_B6:int, var_12_EE:int)
                }
            }
            
            var_7_7D = invokeinterface:Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>::iterator, getfield:List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_7D:Iterator)) {
                invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ud523\ub102\ubefe\ub6ab\u5d20\ud523, checkcast:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\ub113\uc4d2\u183a\u527a\u6435.\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6.class, invokeinterface:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>::next, var_7_7D:Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5d20\u4492\uff55\u8df4\uc2bd\u5fe1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2) {
        var_4_A8 : int
        stack_122_0 : float [generated]
        var_6_F8 : Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>
        var_4_120 : int
        var_7_136 : \u7ce1\u516c\uc238\u7d52\u6ec6\u8308
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_A8 = and:int(ldc:int(462907926), ldc:int(-631550333))
            
            if (invokevirtual:boolean(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u3d4b\u4e72\u6bb9\u7330\u983f\uc246, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))) {
                if (cmpeq:boolean(getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u6435\u0800\uae87\uc2e8\uc31c\u4e72())) {
                    goto(Label_0191)
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\uc84e\u3bc9\u760c\u5245\ua068\ud7e8, getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))) {
                    goto(Label_0191)
                }
            }
            
            Label_0111:
            
            if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0191)
            }
            
            if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_A8 = and:int(var_4_A8:int, ldc:int(-617182322))
                
                if (cmpeq:boolean(getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u6435\u0800\uae87\uc2e8\uc31c\u4e72())) {
                    stack_122_0 = ldc:float(0.0f)
                    goto(Label_0282)
                }
            }
            
            Label_0144:
            
            if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_A8:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_A8 = and:int(var_4_A8:int, ldc:int(-1083031553))
                    stack_122_0 = invokevirtual:float(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\ud171\u8413\u392e\u8389\u4492\ud4fe, getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
                    goto(Label_0282)
                }
                
                goto(Label_0111)
            }
            
            Label_0191:
            
            if (cmpeq:boolean(and:int(var_4_A8:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_A8 = and:int(var_4_A8:int, ldc:int(-1056602537))
                goto(Label_0144)
            }
            
            if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(32)), ldc:int(0))) {
                var_4_A8 = and:int(var_4_A8:int, ldc:int(-2113233252))
                goto(Label_0111)
            }
            
            var_6_F8 = invokeinterface:Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>::iterator, getfield:List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_F8:Iterator)) {
                invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u5d20\u4492\uff55\u8df4\uc2bd\u5fe1, checkcast:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\ub113\uc4d2\u183a\u527a\u6435.\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6.class, invokeinterface:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>::next, var_6_F8:Iterator<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int)
            }
            
            return:void()
            Label_0282:
            var_4_120 = and:int(var_4_A8:int, ldc:int(1050147718))
            
            if (cmplt:boolean(stack_122_0:float, ldc:float(1.0f))) {
                var_4_120 = and:int(var_4_120:int, ldc:int(2050129563))
                var_7_136 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
            }
            else {
                var_7_136 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
            }
            
            var_4_A8 = and:int(var_4_120:int, ldc:int(-1631937586))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8350\u7af6\u4cd9\ud51e\ud51e\u51fa))
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), xor:int(ldc:int(1028), ldc:int(1031))), add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), invokevirtual:int(\u71ae\u4492\u71f1\u74b1\u51fa\u8709::\u92ff\uc229\u0a06\u8258\u5db4\uc2bd, invokevirtual:\u71ae\u4492\u71f1\u74b1\u51fa\u8709(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\uceb8\u3e75\u8d90\u7c6b\u5654\ubff1, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), add:int(xor:int(ldc:int(-30609), ldc:int(-30481)), mul:int(invokevirtual:int(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ubefe\u92ee\u92ee\ub32d\u7330\u4e72, var_7_136:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308), ldc:int(26))), ldc:int(26), ldc:int(26))
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u62da\u4492\u6c56\u6cfe\ubded\u4cd9, invokevirtual:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u67e9\u8389\u3e75\u8cae\ub7dc\u12cb, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u183a\u8cae\uc4d2\u8753\u88c5\uc910, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(8)), add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), xor:int(ldc:int(22529), ldc:int(22532))))
            goto(Label_0191)
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\uff55\u3711\ud4fe\uc910\uafe7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\u6435\u0800\uae87\uc2e8\uc31c\u4e72)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\uc31c\u6c56\u8c8a\u7873\ud12e(\ub113\uc4d2\u183a\u527a\u6435.\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokeinterface:boolean(List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>::add, getfield:List<\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ube23\u3d4b\u98a4\ud158\u97b7\u718f, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), p0:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97b7\u9a18\u62da\u7043\u3dd3\u6b0d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3, int p4, int p5) {
        var_7_63 : int
        stack_A8_0 : int [generated]
        var_9_A8 : int
        var_10_C8 : String
        var_11_E9 : int
        var_12_11E : int
        var_13_136 : float
        var_14_143 : int
        var_15_16C : \u7ce1\u516c\uc238\u7d52\u6ec6\u8308
        var_16_171 : \u7ce1\u516c\uc238\u7d52\u6ec6\u8308
        var_17_176 : \u7ce1\u516c\uc238\u7d52\u6ec6\u8308
        var_18_1EB : int
        var_19_20A : int
        var_20_217 : int
        var_21_242 : int
        var_22_300 : int
        var_22_402 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_7_63 = and:int(ldc:int(-1228814623), ldc:int(1038909145))
            
            if (cmplt:boolean(add:int(add:int(add:int(add:int(p4:int, p1:int), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(26)), getfield:int(\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, invokevirtual:\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e(\ua068\u392e\u3d64\u5db4\uc87f\u4c04::\u7af6\ucb79\uc9f6\uc910\u74b1\ua068, getfield:\ua068\u392e\u3d64\u5db4\uc87f\u4c04(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u6b5f\uc2e8\u4c04\u6b0d\u9255\u92ee, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(-436714564))
                stack_A8_0 = and:int(ldc:int(-25171), ldc:int(25170))
            }
            else {
                stack_A8_0 = and:int(ldc:int(27777), ldc:int(4123))
            }
            
            var_9_A8 = stack_A8_0:int
            var_10_C8 = ternaryop:String(cmpne:boolean(getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u6435\u0800\uae87\uc2e8\uc31c\u4e72()), invokevirtual:String(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\u99f7\uc84e\u600f\u3a62\u12b2\ud523, getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), aconstnull:String())
            var_11_E9 = ternaryop:int(cmpne:boolean(var_10_C8:String, aconstnull:String()), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), var_10_C8:String), and:int(ldc:int(-23511), ldc:int(4806)))
            var_12_11E = ternaryop:int(cmpgt:boolean(sub:int(sub:int(sub:int(ldc:int(113), p2:int), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(26)), add:int(ldc:int(6), mul:int(invokeinterface:int(List<E>::size, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9)))), and:int(ldc:int(1638), ldc:int(-1639)), xor:int(ldc:int(20560), ldc:int(20561)))
            var_13_136 = ternaryop:float(cmpne:boolean(getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u6435\u0800\uae87\uc2e8\uc31c\u4e72()), invokevirtual:float(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\ud171\u8413\u392e\u8389\u4492\ud4fe, getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:float(0.0f))
            var_14_143 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(var_13_136:float, i2f:float(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))))
            
            if (cmplt:boolean(var_13_136:float, ldc:float(1.0f))) {
                if (cmpge:boolean(var_14_143:int, xor:int(ldc:int(1), ldc:int(3)))) {
                    if (cmple:boolean(var_14_143:int, sub:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), and:int(ldc:int(6170), ldc:int(8258))))) {
                        var_15_16C = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
                        var_16_171 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                        var_17_176 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                    }
                    else {
                        var_14_143 = div:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), and:int(ldc:int(11139), ldc:int(21570)))
                        var_15_16C = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
                        var_16_171 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
                        var_17_176 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                    }
                }
                else {
                    var_14_143 = div:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), and:int(ldc:int(25090), ldc:int(266)))
                    var_15_16C = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                    var_16_171 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                    var_17_176 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\u446c\u8df4\u56bd\u7873\u0800\u88c5)
                }
            }
            else {
                var_14_143 = div:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), and:int(ldc:int(28818), ldc:int(2055)))
                var_15_16C = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
                var_16_171 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
                var_17_176 = getstatic:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ub6ab\u92ee\u7330\uc2bd\u5fe1\u8d98)
            }
            
            var_18_1EB = sub:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), var_14_143:int)
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8350\u7af6\u4cd9\ud51e\ud51e\u51fa))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
            var_19_20A = add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            
            if (cmpeq:boolean(var_9_A8:int, ldc:int(0))) {
                var_20_217 = add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            }
            else {
                var_20_217 = add:int(add:int(sub:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(26)), ldc:int(6))
            }
            
            var_21_242 = add:int(ldc:int(32), mul:int(invokeinterface:int(List<E>::size, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9)))
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))) {
                if (cmpeq:boolean(var_12_11E:int, ldc:int(0))) {
                    invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3e2a\u983f\u8389\ub113\u7873\u34df, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_20_217:int, var_19_20A:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), var_21_242:int, ldc:int(10), xor:int(ldc:int(2101), ldc:int(2301)), ldc:int(26), and:int(ldc:int(23078), ldc:int(-23143)), ldc:int(52))
                }
                else {
                    invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3e2a\u983f\u8389\ub113\u7873\u34df, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_20_217:int, sub:int(add:int(var_19_20A:int, ldc:int(26)), var_21_242:int), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), var_21_242:int, ldc:int(10), xor:int(ldc:int(8259), ldc:int(8331)), ldc:int(26), and:int(ldc:int(16949), ldc:int(-16950)), ldc:int(52))
                }
            }
            
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_20_217:int, var_19_20A:int, and:int(ldc:int(19628), ldc:int(-24509)), mul:int(invokevirtual:int(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ubefe\u92ee\u92ee\ub32d\u7330\u4e72, var_15_16C:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308), ldc:int(26)), var_14_143:int, ldc:int(26))
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(var_20_217:int, var_14_143:int), var_19_20A:int, sub:int(and:int(ldc:int(460), ldc:int(18633)), var_18_1EB:int), mul:int(invokevirtual:int(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ubefe\u92ee\u92ee\ub32d\u7330\u4e72, var_16_171:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308), ldc:int(26)), var_18_1EB:int, ldc:int(26))
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), xor:int(ldc:int(1153), ldc:int(1154))), add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), invokevirtual:int(\u71ae\u4492\u71f1\u74b1\u51fa\u8709::\u92ff\uc229\u0a06\u8258\u5db4\uc2bd, invokevirtual:\u71ae\u4492\u71f1\u74b1\u51fa\u8709(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\uceb8\u3e75\u8d90\u7c6b\u5654\ubff1, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))), add:int(and:int(ldc:int(4292), ldc:int(16801)), mul:int(invokevirtual:int(\u7ce1\u516c\uc238\u7d52\u6ec6\u8308::\ubefe\u92ee\u92ee\ub32d\u7330\u4e72, var_17_176:\u7ce1\u516c\uc238\u7d52\u6ec6\u8308), ldc:int(26))), ldc:int(26), ldc:int(26))
            
            if (cmpeq:boolean(var_9_A8:int, ldc:int(0))) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u69d9\u4ab3\uc910\u8308\u516c\u7ce1, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\ufcaf\u392e\u5db4\u5d20\ud51e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), i2f:float(add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(32))), i2f:float(add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9))), ldc:int(-1))
                
                if (cmpne:boolean(var_10_C8:String, aconstnull:String())) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C8:String, i2f:float(sub:int(sub:int(add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), var_11_E9:int), and:int(ldc:int(2117), ldc:int(5791)))), i2f:float(add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9))), ldc:int(-1))
                }
            }
            else {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u69d9\u4ab3\uc910\u8308\u516c\u7ce1, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\ufcaf\u392e\u5db4\u5d20\ud51e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), i2f:float(add:int(var_20_217:int, and:int(ldc:int(111), ldc:int(19477)))), i2f:float(add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9))), ldc:int(-1))
                
                if (cmpne:boolean(var_10_C8:String, aconstnull:String())) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_C8:String, i2f:float(sub:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), var_11_E9:int)), i2f:float(add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9))), ldc:int(-1))
                }
            }
            
            if (cmpeq:boolean(var_12_11E:int, ldc:int(0))) {
                var_22_300 = and:int(ldc:int(-11676), ldc:int(3339))
                
                while (cmplt:boolean(var_22_300:int, invokeinterface:int(List<E>::size, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u8709\ub19c\ub8be\u52d3\u3dd3\u183a, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, checkcast:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d.class, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::get, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), var_22_300:int)), i2f:float(add:int(var_20_217:int, and:int(ldc:int(2317), ldc:int(711)))), i2f:float(add:int(add:int(add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(9)), ldc:int(17)), mul:int(var_22_300:int, ldc:int(9)))), ldc:int(-5592406))
                    inc:int(var_22_300, ldc:int(1))
                }
            }
            else {
                var_22_402 = and:int(ldc:int(25824), ldc:int(-25825))
                
                while (cmplt:boolean(var_22_402:int, invokeinterface:int(List<E>::size, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))) {
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u8709\ub19c\ub8be\u52d3\u3dd3\u183a, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, checkcast:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d.class, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::get, getfield:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), var_22_402:int)), i2f:float(add:int(var_20_217:int, and:int(ldc:int(16823), ldc:int(8205)))), i2f:float(add:int(add:int(sub:int(add:int(var_19_20A:int, ldc:int(26)), var_21_242:int), ldc:int(7)), mul:int(var_22_402:int, ldc:int(9)))), ldc:int(-5592406))
                    inc:int(var_22_402, ldc:int(1))
                }
            }
            
            invokevirtual:void(\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a::\u62da\u4492\u6c56\u6cfe\ubded\u4cd9, invokevirtual:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u67e9\u8389\u3e75\u8cae\ub7dc\u12cb, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ufcaf\u5245\u16f6\u92ee\ud36e\u0b8e, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u183a\u8cae\uc4d2\u8753\u88c5\uc910, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), add:int(add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), ldc:int(8)), add:int(add:int(p2:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), xor:int(ldc:int(1048), ldc:int(1053))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u983f\u8389\ub113\u7873\u34df(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p8:int, p9:int, p5:int, p5:int)
            invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(p1:int, p5:int), p2:int, sub:int(sub:int(p3:int, p5:int), p5:int), p5:int, add:int(p8:int, p5:int), p9:int, sub:int(sub:int(p6:int, p5:int), p5:int), p7:int)
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(add:int(p1:int, p3:int), p5:int), p2:int, sub:int(add:int(p8:int, p6:int), p5:int), p9:int, p5:int, p5:int)
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, sub:int(add:int(p2:int, p4:int), p5:int), p8:int, sub:int(add:int(p9:int, p7:int), p5:int), p5:int, p5:int)
            invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(p1:int, p5:int), sub:int(add:int(p2:int, p4:int), p5:int), sub:int(sub:int(p3:int, p5:int), p5:int), p5:int, add:int(p8:int, p5:int), sub:int(add:int(p9:int, p7:int), p5:int), sub:int(sub:int(p6:int, p5:int), p5:int), p7:int)
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(add:int(p1:int, p3:int), p5:int), sub:int(add:int(p2:int, p4:int), p5:int), sub:int(add:int(p8:int, p6:int), p5:int), sub:int(add:int(p9:int, p7:int), p5:int), p5:int, p5:int)
            invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, add:int(p2:int, p5:int), p5:int, sub:int(sub:int(p4:int, p5:int), p5:int), p8:int, add:int(p9:int, p5:int), p6:int, sub:int(sub:int(p7:int, p5:int), p5:int))
            invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, add:int(p1:int, p5:int), add:int(p2:int, p5:int), sub:int(sub:int(p3:int, p5:int), p5:int), sub:int(sub:int(p4:int, p5:int), p5:int), add:int(p8:int, p5:int), add:int(p9:int, p5:int), sub:int(sub:int(p6:int, p5:int), p5:int), sub:int(sub:int(p7:int, p5:int), p5:int))
            invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(add:int(p1:int, p3:int), p5:int), add:int(p2:int, p5:int), p5:int, sub:int(sub:int(p4:int, p5:int), p5:int), sub:int(add:int(p8:int, p6:int), p5:int), add:int(p9:int, p5:int), p6:int, sub:int(sub:int(p7:int, p5:int), p5:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u88c5\u2dcc\uc3e3\u7af6\u4e72(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {
        var_10_BD : int
        var_12_6C : int
        var_13_A0 : int
        var_14_AC : int
        var_15_B5 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_10_BD = and:int(ldc:int(-748158126), ldc:int(-51397254))
            var_12_6C = and:int(ldc:int(-3077), ldc:int(3076))
            
            loop {
                if (cmpeq:boolean(and:int(var_10_BD:int, ldc:int(67108864)), ldc:int(0))) {
                    var_10_BD = and:int(var_10_BD:int, ldc:int(-639240077))
                    
                    if (cmplt:boolean(var_12_6C:int, p3:int)) {
                        var_13_A0 = add:int(p1:int, var_12_6C:int)
                        var_14_AC = invokestatic:int(Math::min, p7:int, sub:int(p3:int, var_12_6C:int))
                        var_15_B5 = and:int(ldc:int(-22538), ldc:int(22537))
                        
                        loop {
                            var_10_BD = and:int(var_10_BD:int, ldc:int(-655196354))
                            
                            if (cmpge:boolean(var_15_B5:int, p4:int)) {
                                looporswitchbreak()
                            }
                            
                            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_13_A0:int, add:int(p2:int, var_15_B5:int), p5:int, p6:int, var_14_AC:int, invokestatic:int(Math::min, p8:int, sub:int(p4:int, var_15_B5:int)))
                            var_15_B5 = add:int(var_15_B5:int, p8:int)
                        }
                        
                        var_10_BD = and:int(var_10_BD:int, ldc:int(-647485422))
                        var_12_6C = add:int(var_12_6C:int, p7:int)
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_10_BD:int, ldc:int(2097152)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub1b9\u1833\u8640\u64ab\u8350\ud158(int p0, int p1, int p2, int p3) {
        var_5_7E : int
        var_5_89 : int
        var_7_91 : int
        var_8_98 : int
        var_9_A0 : int
        var_10_A7 : int
        stack_144_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_5_7E = and:int(ldc:int(-602303058), ldc:int(123379151))
        
        if (invokevirtual:boolean(\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f::\u3d4b\u4e72\u6bb9\u7330\u983f\uc246, getfield:\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))) {
            if (cmpeq:boolean(getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u6435\u0800\uae87\uc2e8\uc31c\u4e72())) {
                goto(Label_0204)
            }
            
            if (logicalnot:boolean(invokevirtual:boolean(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\uc84e\u3bc9\u760c\u5245\ua068\ud7e8, getfield:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u97e6\uc246\uafe7\ubf56\u3bd6\u6ec6, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))) {
                goto(Label_0204)
            }
        }
        
        Label_0111:
        
        if (cmpeq:boolean(and:int(var_5_7E:int, ldc:int(512)), ldc:int(0))) {
            var_5_89 = and:int(var_5_7E:int, ldc:int(-1005000713))
            var_7_91 = add:int(p0:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            var_8_98 = add:int(var_7_91:int, ldc:int(26))
            var_9_A0 = add:int(p1:int, getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
            var_10_A7 = add:int(var_9_A0:int, ldc:int(26))
            
            if (cmpge:boolean(p2:int, var_7_91:int)) {
                if (cmple:boolean(p2:int, var_8_98:int)) {
                    if (cmpge:boolean(p3:int, var_9_A0:int)) {
                        if (cmple:boolean(p3:int, var_10_A7:int)) {
                            stack_144_0 = and:int[expected:boolean](ldc:int(277), ldc:int(4233))
                            return:boolean(stack_144_0:boolean)
                        }
                    }
                }
            }
            
            var_5_89 = and:int(var_5_89:int, ldc:int(614375151))
            stack_144_0 = and:int[expected:boolean](ldc:int(14362), ldc:int(-14363))
            return:boolean(stack_144_0:boolean[expected:int])
        }
        
        var_5_7E = and:int(var_5_7E:int, ldc:int(523702401))
        Label_0204:
        
        if (cmpne:boolean(and:int(var_5_7E:int, ldc:int(8388608)), ldc:int(0))) {
            var_5_7E = and:int(var_5_7E:int, ldc:int(-1983435066))
            goto(Label_0111)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(713), ldc:int(-17098)))
    }
    
    public void \u6fb0\ua6bd\u8413\u6b5f\ua61f\ub102() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (cmpeq:boolean(getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6())) {
                if (cmpne:boolean(invokevirtual:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\ucfaf\u836c\u836c\u120d\ua3b4\u92ff::\ubff1\u6b5f\u4f52\u1833\u7873\ubded, getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)), aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff())) {
                    putfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, invokespecial:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u51fa\u8aa5\u7330\u67d0\u7873\u3dd3, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6, getfield:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)))
                    
                    if (cmpne:boolean(getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), aconstnull:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6())) {
                        invokevirtual:void(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc84e\uc31c\u6c56\u8c8a\u7873\ud12e, getfield:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc29a\u6435\ub1b9\ub18d\u0800\u873d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6), this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ua6bd\u5140\u983f\u97b7\u9a18\u8350() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u416d\ub113\u8bb0\u416d\u946b\u3504, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
        }
        
        goto(Label_0006)
    }
    
    public int \u6198\u4975\uc229\ub32d\u56bd\u3e75() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\uc910\u74b1\u4cd9\u3711\uc29a\u071d, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_248 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_26C_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        stack_32F_0 : byte[] [generated]
        stack_386_0 : byte[] [generated]
        var_4_233 : int
        var_3_238 : byte[]
        var_5_239 : int
        expr_26C : byte [generated]
        var_0_37C : int
        expr_386 : byte [generated]
        stack_3B6_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_2AE : byte[]
        var_5_2AF : int
        expr_D9 : int [generated]
        expr_112 : int [generated]
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        expr_1EC : int[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_248 = and:int(ldc:int(-2066363231), ldc:int(-1245602385))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_26C_0 = stack_2C0_0 = stack_32F_0 = stack_386_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("XkxbXOvk4q3tGRamL+gU5ysSGeca5gMY1Ano/eIn7BTQERDvhciJi4mE")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_233 = expr_6E:int
        var_3_238 = newarray:byte[](byte.class, expr_6E:int)
        var_5_239 = expr_6E:int
        Label_0571:
        
        while (cmpne:boolean(and:int(var_0_248:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(1024)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1402184727))
                goto(Label_0775)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-1125138540))
            var_5_239 = add:int(var_5_239:int, ldc:int(-1))
            expr_26C = loadelement:byte(stack_26C_0:byte[], var_5_239:int)
            storeelement:byte(var_3_238:byte[], var_5_239:int, add:int(or:int(and:int(shl:int(expr_26C:byte, xor:int(ldc:int(-28664), ldc:int(-28660))), ldc:int(-16)), and:int(shr:int(expr_26C:byte[expected:int], and:int(ldc:int(334), ldc:int(22533))), ldc:int(15))), ldc:int(40)))
            
            if (cmpne:boolean(var_5_239:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_26C_0 = stack_2C0_0 = stack_32F_0 = stack_386_0 = var_3_238:byte[]
            goto(Label_0115)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(97438339))
        goto(Label_0862)
        Label_0775:
        
        while (cmpeq:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0571)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-300736738))
            var_5_239 = add:int(var_5_239:int, ldc:int(-1))
            storeelement:byte(var_3_238:byte[], var_5_239:int, xor:byte(loadelement:byte(stack_32F_0:byte[], var_5_239:int), ldc:byte(101)))
            
            if (cmpne:boolean(var_5_239:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_26C_0 = stack_2C0_0 = stack_32F_0 = stack_386_0 = var_3_238:byte[]
            goto(Label_0222)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(-311157189))
        Label_0862:
        
        while (cmpne:boolean(and:int(var_0_248:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0571)
            }
            
            var_0_37C = and:int(var_0_248:int, ldc:int(-1978718910))
            var_5_239 = add:int(var_5_239:int, ldc:int(-1))
            expr_386 = loadelement:byte(stack_386_0:byte[], var_5_239:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_239:int, ldc:int(5)), neg:int(var_4_233:int)), ldc:int(0))) {
                var_0_37C = and:int(var_0_37C:int, ldc:int(1291543569))
                stack_3B6_2 = add:byte(expr_386:byte, ldc:byte(5))
            }
            else {
                stack_3B6_2 = add:byte(expr_386:byte, loadelement:byte(var_3_238:byte[], add:int(var_5_239:int, ldc:int(5))))
            }
            
            var_0_248 = and:int(var_0_37C:int, ldc:int(601745129))
            storeelement:byte(var_3_238:byte[], var_5_239:int, stack_3B6_2:byte)
            
            if (cmpne:boolean(var_5_239:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_26C_0 = stack_2C0_0 = stack_32F_0 = stack_386_0 = var_3_238:byte[]
            goto(Label_0279)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(1536837544))
        goto(Label_0775)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(1453233181))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(705820754))
        }
        else {
            var_0_248 = and:int(var_0_248:int, ldc:int(-1251277510))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_2AE = newarray:byte[](byte.class, expr_A9:int)
                var_5_2AF = expr_A9:int
                
                loop {
                    var_0_248 = and:int(var_0_248:int, ldc:int(-343069320))
                    var_5_2AF = add:int(var_5_2AF:int, ldc:int(-1))
                    storeelement:byte(var_3_2AE:byte[], var_5_2AF:int, add:int(shl:int(loadelement:byte(stack_2C0_0:byte[], var_5_2AF:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_2AF:int, xor:int(ldc:int(2596), ldc:int(2597)))), ldc:int(4)), and:int(ldc:int(1135), ldc:int(12575)))))
                    
                    if (cmpne:boolean(var_5_2AF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_26C_0 = stack_2C0_0 = stack_32F_0 = stack_386_0 = var_3_2AE:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(1024)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-412742666))
                goto(Label_0115)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(-536084815))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_233 = expr_D9:int
                var_3_238 = newarray:byte[](byte.class, expr_D9:int)
                var_5_239 = expr_D9:int
                goto(Label_0775)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-657321479))
        }
        else {
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1873232205))
                goto(Label_0115)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(1926977313))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_4_233 = expr_112:int
                var_3_238 = newarray:byte[](byte.class, expr_112:int)
                var_5_239 = expr_112:int
                goto(Label_0862)
            }
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(942805130))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(524288)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_153 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-15101), ldc:int(-15097)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18150), ldc:int(12556)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(31816), ldc:int(-32585)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-20534), ldc:int(4149)), and:int(ldc:int(131), ldc:int(6))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-32415), ldc:int(-32413)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(42), ldc:int(5698)), xor:int(ldc:int(4362), ldc:int(4361))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(18521), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(21003), ldc:int(135)), xor:int(ldc:int(2053), ldc:int(2049))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(-32639), ldc:int(-32638)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-28478), ldc:int(-28474)), and:int(ldc:int(14381), ldc:int(185))))
            putstatic:String[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u4f52\u71ae\u4d85\u0c95\u3d4b\u62da, expr_15D:String[])
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8350\u7af6\u4cd9\ud51e\ud51e\u51fa, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(expr_153:String[], and:int(ldc:int(20483), ldc:int(39)))))
            expr_1EC = newarray:int[](int.class, and:int(ldc:int(37), ldc:int(18445)))
            storeelement:int(expr_1EC:int[], and:int(ldc:int(13468), ldc:int(-30621)), and:int(ldc:int(-20018), ldc:int(19985)))
            storeelement:int(expr_1EC:int[], xor:int(ldc:int(8256), ldc:int(8257)), ldc:int(10))
            storeelement:int(expr_1EC:int[], xor:int(ldc:int(45), ldc:int(47)), ldc:int(-10))
            storeelement:int(expr_1EC:int[], and:int(ldc:int(16387), ldc:int(5931)), ldc:int(25))
            storeelement:int(expr_1EC:int[], and:int(ldc:int(134), ldc:int(5700)), ldc:int(-25))
            putstatic:int[](\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6::\u8308\u5d20\ufe34\u6b0d\u8c8a\u8389, expr_1EC:int[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A8 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6B3 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6A8 = and:int(ldc:int(-1216857750), ldc:int(-34738241))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\u8aa5\u9033\u7af6\u9af2\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(229221065))
        }
        else {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-637621275))
            var_5_8A = and:int(ldc:int(9589), ldc:int(-10102))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16126), ldc:int(7904)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6A8:int, ldc:int(-1746177042))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-30684), ldc:int(-30683)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(97), ldc:int(26625)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6A8 = and:int(var_3_E3:int, ldc:int(-1636176520))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-30715), ldc:int(-30716)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(77713977))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1770167776))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(260303572))
                    }
                    else {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1268088978))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1451851636))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1634301885))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-17926289))
                            var_11_F4 = and:int(ldc:int(-16806), ldc:int(16677))
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1526805573))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-742441309))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(560109235))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1470546566))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1736530076))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1080721681))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-142436623))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1287393745))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(751615948))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(356818017))
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(456844251))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(634861643))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-235177568))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1909340890))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1955190658))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-310567530))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-687653405))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1116165788))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-29440), ldc:int(-29439))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1248802622))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1585066670))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(2139548788))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1715672897))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1673514921))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-968587790))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1655576334))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1787842690))
                        var_11_F4 = and:int(ldc:int(9268), ldc:int(-25654))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-228511763))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(389860984))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(92505406))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(80857407))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1175212359))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1799184289))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-143852227))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-2060335189))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1634710389))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(112069308))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-117933775))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-158198256))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-167509666))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(835896599))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(591131231))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(260272680))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(781328358))
                        loopcontinue()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-613456601))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B3 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1514027515))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1160322005))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-37685702))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-75714184))
                        var_17_6B3 = add:int(var_16_122:int, xor:int(ldc:int(-30687), ldc:int(-30688)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1159392558))
                }
                
                var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1744999493))
                
                if (cmple:boolean(var_5_8A = var_17_6B3:int, sub:int(var_6_91:int, xor:int(ldc:int(1105), ldc:int(1104))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1741147280))
            goto(Label_0108)
        }
    }
}
