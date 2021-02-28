public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u62da\u836c\u8753\u5bc4\u4bc8\u8350 {
    public void \u62da\u836c\u8753\u5bc4\u4bc8\u8350(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, byte[] p1, java.lang.String p2) {
        var_6_99 : int
        var_7_BD : int
        var_8_C9 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_9_DA : \ufe34\u960f\ua6bd\u71f1\u516c
        var_10_E1 : Throwable
        var_11_F4 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_12_FB : Throwable
        var_13_132 : int
        var_14_153 : byte
        var_13_1B9 : Throwable
        var_13_242 : Throwable
        var_13_25E : Throwable
        var_16_297 : Throwable
        var_11_2DF : Throwable
        var_11_2FD : Throwable
        var_18_338 : Throwable
        
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
            invokespecial:Object(Object::<init>, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350)
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u960f\u156b\u76bc\u74b1\u3504\ubefe, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>](Maps::newHashMap))
            putfield:\u6c52\u52d3\u516c\uae87\uae5d(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\uc87f\u4ab3\u9af2\uc238\u7d52\u8709, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, p0:\u6c52\u52d3\u516c\uae87\uae5d)
            putfield:byte[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, p1:byte[])
            putfield:String(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u120d\u8308\u8308\u965f\u5d20\uf9c5, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, p2:String)
            var_6_99 = and:int(ldc:int(6233), ldc:int(-22618))
            
            while (cmplt:boolean(var_6_99:int, xor:int(ldc:int(3123), ldc:int(3379)))) {
                var_7_BD = mul:int(var_6_99:int, and:int(ldc:int(274), ldc:int(2368)))
                var_8_C9 = invokespecial:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u8d98\u5140\u4c04\u4bc8\u59ec\u3d64, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, var_7_BD:int)
                
                try {
                    var_9_DA = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\uc87f\u4ab3\u9af2\uc238\u7d52\u8709, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350), var_8_C9:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
                    var_10_E1 = aconstnull:Throwable()
                    
                    try {
                        var_11_F4 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u3c25\u647c\u7006\u4e72\u9937\u385b, getstatic:\u3776\u71ae\u34df\ubff1\u98a4\u6b5f(\u3776\u71ae\u34df\ubff1\u98a4\u6b5f::\uafe7\u416d\u7006\u7049\uc910\u9af2), invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c))
                        var_12_FB = aconstnull:Throwable()
                        
                        try {
                            if (logicaland:boolean(cmpeq:boolean(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350), xor:int(ldc:int(16810), ldc:int(16554))), cmpeq:boolean(invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350), xor:int(ldc:int(1077), ldc:int(1333))))) {
                                var_13_132 = and:int(ldc:int(-15174), ldc:int(14661))
                                
                                while (cmplt:boolean(var_13_132:int, xor:int(ldc:int(-15126), ldc:int(-14870)))) {
                                    var_14_153 = loadelement:byte(p1:byte[], add:int(var_7_BD:int, var_13_132:int))
                                    
                                    if (logicaland:boolean(cmpne:boolean(var_14_153:byte, ldc:byte(0)), cmpgt:boolean(invokestatic:int(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u3e75\u416d\u8d98\u9a18\u8308\u1833, var_14_153:byte), invokestatic:int(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u3d4b\u5654\u71f1\u6bb9\uae5d\ucb79, var_14_153:byte)))) {
                                        storeelement:byte(p1:byte[], add:int(var_7_BD:int, var_13_132:int), and:int[expected:byte](ldc:int(-19029), ldc:int(2644)))
                                    }
                                    
                                    inc:int(var_13_132, ldc:int(1))
                                }
                                
                                if (cmpne:boolean(var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                                    if (cmpne:boolean(var_12_FB:Throwable, aconstnull:Throwable())) {
                                        try {
                                            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                                        }
                                        catch (java.lang.Throwable var_13_1B9) {
                                            invokevirtual:void(Throwable::addSuppressed, var_12_FB:Throwable, var_13_1B9:Throwable)
                                        }
                                    }
                                    else {
                                        invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                                    }
                                }
                                
                                goto(Label_0898)
                            }
                            
                            if (cmpeq:boolean(var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                                goto(Label_0695)
                            }
                            
                            if (cmpne:boolean(var_12_FB:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                                }
                                catch (java.lang.Throwable var_13_242) {
                                    invokevirtual:void(Throwable::addSuppressed, var_12_FB:Throwable, var_13_242:Throwable)
                                }
                                
                                goto(Label_0695)
                            }
                            
                            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                        }
                        catch (java.lang.Throwable var_13_25E) {
                            var_12_FB = var_13_25E:Throwable
                            athrow(var_13_25E:Throwable)
                        }
                        finally {
                            if (cmpne:boolean(var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                                if (cmpne:boolean(var_12_FB:Throwable, aconstnull:Throwable())) {
                                    try {
                                        invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                                    }
                                    catch (java.lang.Throwable var_16_297) {
                                        invokevirtual:void(Throwable::addSuppressed, var_12_FB:Throwable, var_16_297:Throwable)
                                    }
                                }
                                else {
                                    invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_11_F4:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                                }
                            }
                        }
                        
                        Label_0695:
                        
                        if (cmpeq:boolean(var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c, aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c())) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(var_10_E1:Throwable, aconstnull:Throwable())) {
                            try {
                                invokeinterface:void(Closeable::close, var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                            }
                            catch (java.lang.Throwable var_11_2DF) {
                                invokevirtual:void(Throwable::addSuppressed, var_10_E1:Throwable, var_11_2DF:Throwable)
                            }
                            
                            goto(Label_0858)
                        }
                        
                        invokeinterface:void(Closeable::close, var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                    }
                    catch (java.lang.Throwable var_11_2FD) {
                        var_10_E1 = var_11_2FD:Throwable
                        athrow(var_11_2FD:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c, aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c())) {
                            if (cmpne:boolean(var_10_E1:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokeinterface:void(Closeable::close, var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                                }
                                catch (java.lang.Throwable var_18_338) {
                                    invokevirtual:void(Throwable::addSuppressed, var_10_E1:Throwable, var_18_338:Throwable)
                                }
                            }
                            else {
                                invokeinterface:void(Closeable::close, var_9_DA:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                            }
                        }
                    }
                    
                    Label_0858:
                }
                catch (java.io.IOException var_9_361) {
                }
                
                invokestatic:void(Arrays::fill, p1:byte[], var_7_BD:int, add:int(var_7_BD:int, and:int(ldc:int(288), ldc:int(9473))), and:int[expected:byte](ldc:int(29721), ldc:int(-29722)))
                Label_0898:
                inc:int(var_6_99, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\u5db4\ud523\u7043\u6c52\u8308\u8350>[expected:Iterable<Object>](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>::values, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u960f\u156b\u76bc\u74b1\u3504\ubefe, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8d98\u5140\u4c04\u4bc8\u59ec\u3d64(int p0) {
        stack_A8_0 : String [generated]
        expr_6F : Object[] [generated]
        stack_A7_1 : int [generated]
        stack_A4_0 : String [generated]
        expr_8C : Object[] [generated]
        var_4_AE : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            stack_A8_0 = getfield:String(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u120d\u8308\u8308\u965f\u5d20\uf9c5, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350)
            expr_6F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4197), ldc:int(8833)))
            stack_A7_1 = and:int(ldc:int(-26239), ldc:int(16942))
            stack_A4_0 = loadelement:String(getstatic:String[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u93a2\u6c56\u0800\u51fa\u4975\u4bc8), and:int(ldc:int(21104), ldc:int(-21105)))
            expr_8C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1289), ldc:int(199)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(7049), ldc:int(-7066)), invokestatic:Integer[expected:Object](Integer::valueOf, div:int(p0:int, xor:int(ldc:int(8610), ldc:int(8354)))))
            storeelement:Object(expr_6F:Object[], stack_A7_1:int, invokestatic:String(String::format, stack_A4_0:String, expr_8C:Object[]))
            var_4_AE = initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokestatic:String(String::format, stack_A8_0:String, expr_6F:Object[]))
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u92ff\ubf56\ub8be\u647c\u624e\u0c95, var_4_AE:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u93a2\u6c56\u0800\u51fa\u4975\u4bc8), and:int(ldc:int(18449), ldc:int(13609)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\u3776\ubded\u88c5\u647c\u40a9\u494c, var_4_AE:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u8258\u8389\ub18d\u718f\u61a4\ubf56 \u5245\uae87\u3d64\u3e75\u6bb9\u4f52(int p0) {
        var_4_82 : byte
        var_5_AB : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_6_BE : int
        
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
        
        if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmple:boolean(p0:int, ldc:int(65535)))) {
            var_4_82 = loadelement:byte(getfield:byte[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350), p0:int)
            
            if (cmpne:boolean(var_4_82:byte, ldc:byte(0))) {
                var_5_AB = checkcast:\u5db4\ud523\u7043\u6c52\u8308\u8350(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350.class, invokeinterface:\u5db4\ud523\u7043\u6c52\u8308\u8350(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>::computeIfAbsent, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u960f\u156b\u76bc\u74b1\u3504\ubefe, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350), invokespecial:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u8d98\u5140\u4c04\u4bc8\u59ec\u3d64, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350, p0:int), invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u5db4\ud523\u7043\u6c52\u8308\u8350>(apply:(L\u51b2\u6fb0\ufcaf\u61a4\u0800/\uc7fe\ua61f\ub18d\u64ab\u4f4a/\u62da\u836c\u8753\u5bc4\u4bc8\u8350;)Ljava/util/function/Function;, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350)))
                
                if (cmpne:boolean(var_5_AB:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                    var_6_BE = invokestatic:int(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u3e75\u416d\u8d98\u9a18\u8308\u1833, var_4_82:byte)
                    return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(initobject:\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7(\u8350\u5fe1\u385b\u47c2\ua6bd\uafe7::<init>, add:int(mul:int(rem:int(p0:int, ldc:int(16)), ldc:int(16)), var_6_BE:int), mul:int(div:int(and:int(p0:int, and:int(ldc:int(255), ldc:int(15615))), ldc:int(16)), ldc:int(16)), sub:int(invokestatic:int(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u3d4b\u5654\u71f1\u6bb9\uae5d\ucb79, var_4_82:byte), var_6_BE:int), ldc:int(16), var_5_AB:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u8389\u4f4a\u7c6b\u4e72\ud12e\ubcb0()))
                }
            }
            
            return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(aconstnull:\u8258\u8389\ub18d\u718f\u61a4\ubf56())
        }
        
        return:\u8258\u8389\ub18d\u718f\u61a4\ubf56(aconstnull:\u8258\u8389\ub18d\u718f\u61a4\ubf56())
    }
    
    public it.unimi.dsi.fastutil.ints.IntSet \u516c\u34df\uc246\u6ec6\u7873\u64ab() {
        var_1_5F : int
        var_3_67 : IntOpenHashSet
        var_4_6F : int
        
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
            var_1_5F = and:int(ldc:int(748718629), ldc:int(-1473671177))
            var_3_67 = initobject:IntOpenHashSet(IntOpenHashSet::<init>)
            var_4_6F = and:int(ldc:int(-4531), ldc:int(4530))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1833931709))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1716244721))
                    
                    if (cmplt:boolean(var_4_6F:int, ldc:int(65535))) {
                        if (cmpne:boolean(loadelement:byte(getfield:byte[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350), var_4_6F:int), ldc:byte(0))) {
                            invokeinterface:boolean(IntSet::add, var_3_67:IntSet, var_4_6F:int)
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(-1700423059))
                        inc:int(var_4_6F, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:IntSet(var_3_67:IntOpenHashSet)
        }
        
        goto(Label_0006)
    }
    
    private \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \u64ab\u7e3f\u1833\u9255\u0c95\u4ab3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_2_5F : int
        var_4_6F : \ufe34\u960f\ua6bd\u71f1\u516c
        var_5_72 : Throwable
        var_6_B9 : Throwable
        var_9_E0 : Throwable
        var_4_FE : IOException
        
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
        var_2_5F = and:int(ldc:int(-719070676), ldc:int(1532991992))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-171723432))
            var_4_6F = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\uc87f\u4ab3\u9af2\uc238\u7d52\u8709, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_5_72 = aconstnull:Throwable()
            
            try {
                return:\u5db4\ud523\u7043\u6c52\u8308\u8350(invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u3c25\u647c\u7006\u4e72\u9937\u385b, getstatic:\u3776\u71ae\u34df\ubff1\u98a4\u6b5f(\u3776\u71ae\u34df\ubff1\u98a4\u6b5f::\uafe7\u416d\u7006\u7049\uc910\u9af2), invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_4_6F:\ufe34\u960f\ua6bd\u71f1\u516c)))
            }
            catch (java.lang.Throwable var_6_B9) {
                var_5_72 = var_6_B9:Throwable
                athrow(var_6_B9:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6F:\ufe34\u960f\ua6bd\u71f1\u516c, aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c())) {
                    if (cmpne:boolean(var_5_72:Throwable, aconstnull:Throwable())) {
                        try {
                            invokeinterface:void(Closeable::close, var_4_6F:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                        }
                        catch (java.lang.Throwable var_9_E0) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_72:Throwable, var_9_E0:Throwable)
                        }
                    }
                    else {
                        invokeinterface:void(Closeable::close, var_4_6F:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                    }
                }
            }
        }
        catch (java.io.IOException var_4_FE) {
            invokeinterface:void(Logger::error, getstatic:Logger(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u5fe1\u647c\u67d0\ud12e\uc9f6\uc31c), loadelement:String(getstatic:String[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u93a2\u6c56\u0800\u51fa\u4975\u4bc8), and:int(ldc:int(7754), ldc:int(8227))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], var_4_FE:IOException[expected:Object])
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350(aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
        }
    }
    
    private static int \u3e75\u416d\u8d98\u9a18\u8308\u1833(byte p0) {
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
            return:int(and:int(shr:int(p0:byte[expected:int], and:int(ldc:int(8725), ldc:int(196))), ldc:int(15)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u3d4b\u5654\u71f1\u6bb9\uae5d\ucb79(byte p0) {
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
            return:int(add:int(and:byte[expected:int](p0:byte, ldc:byte(15)), xor:int(ldc:int(768), ldc:int(769))))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u8258\u98a4\u4492\u527a\u2dcc\u4ab3() {
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
            return:Logger(getstatic:Logger(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u5fe1\u647c\u67d0\ud12e\uc9f6\uc31c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_21F : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_A7_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_10F_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_135_0 : byte[] [generated]
        stack_232_0 : byte[] [generated]
        stack_28E_0 : byte[] [generated]
        stack_315_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_1B9 : byte[]
        var_4_1BA : int
        expr_A9 : int [generated]
        var_5_20A : int
        var_3_20F : byte[]
        var_4_210 : int
        expr_232 : byte [generated]
        var_0_2A8 : int
        expr_28E : byte [generated]
        stack_2E0_2 : byte [generated]
        stack_2B4_0 : byte [generated]
        expr_E1 : int [generated]
        expr_111 : int [generated]
        var_3_303 : byte[]
        var_4_304 : int
        var_3_141 : String
        stack_1AA_0 : String[] [generated]
        expr_153 : String[] [generated]
        
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
            var_0_21F = and:int(ldc:int(-785131968), ldc:int(-75937287))
            expr_68 = var_2_6C = stack_A7_0 = stack_A9_0 = stack_DF_0 = stack_E1_0 = stack_10F_0 = stack_111_0 = stack_135_0 = stack_232_0 = stack_28E_0 = stack_315_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AH5ZSwpyhYAFke7eAnzs8ZiZeO2ZhPf56Yp9CojvE66eH543GQA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_1B9 = newarray:byte[](byte.class, expr_70:int)
                var_4_1BA = expr_70:int
                
                loop {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(2033570637))
                    var_4_1BA = add:int(var_4_1BA:int, ldc:int(-1))
                    storeelement:byte(var_3_1B9:byte[], var_4_1BA:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_1BA:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_1BA:int, xor:int(ldc:int(-14320), ldc:int(-14319)))), ldc:int(3)), and:int(ldc:int(671), ldc:int(4415)))))
                    
                    if (cmpne:boolean(var_4_1BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A9_0 = stack_A7_0 = stack_DF_0 = stack_E1_0 = stack_10F_0 = stack_111_0 = stack_135_0 = stack_232_0 = stack_28E_0 = stack_315_0 = var_3_1B9:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(274223265))
                    goto(Label_0278)
                }
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0230)
                }
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-1457035743))
                    goto(Label_0174)
                }
                
                var_0_21F = and:int(var_0_21F:int, ldc:int(1002305396))
                expr_A9 = arraylength:int(stack_A9_0:byte[])
                
                if (cmpeq:boolean(expr_A9:int, ldc:int(0))) {
                    goto(Label_0174)
                }
                
                var_5_20A = expr_A9:int
                var_3_20F = newarray:byte[](byte.class, expr_A9:int)
                var_4_210 = expr_A9:int
                Label_0530:
                
                while (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(128)), ldc:int(0))) {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-1100353299))
                    var_4_210 = add:int(var_4_210:int, ldc:int(-1))
                    expr_232 = loadelement:byte(stack_232_0:byte[], var_4_210:int)
                    storeelement:byte(var_3_20F:byte[], var_4_210:int, or:int(and:int(shl:int(expr_232:byte, and:int(ldc:int(17813), ldc:int(8238))), ldc:int(-16)), and:int(shr:int(expr_232:byte[expected:int], xor:int(ldc:int(20768), ldc:int(20772))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_210:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_DF_0 = stack_E1_0 = stack_10F_0 = stack_111_0 = stack_135_0 = stack_232_0 = stack_28E_0 = stack_315_0 = var_3_20F:byte[]
                    goto(Label_0174)
                }
                
                var_0_21F = and:int(var_0_21F:int, ldc:int(1875893750))
                Label_0631:
                
                while (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_2A8 = and:int(var_0_21F:int, ldc:int(2020564456))
                    var_4_210 = add:int(var_4_210:int, ldc:int(-1))
                    expr_28E = stack_2E0_2 = loadelement(stack_28E_0, var_4_210)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_210:int, ldc:int(6)), neg:int(var_5_20A:int)), ldc:int(0))) {
                        stack_2E0_2 = stack_2B4_0 = add:byte(expr_28E:byte, loadelement:byte(var_3_20F:byte[], add:int(var_4_210:int, ldc:int(6))))
                        goto(Label_0708)
                    }
                    
                    Label_0667:
                    
                    if (cmpeq:boolean(and:int(var_0_2A8:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(1506823162))
                    }
                    else {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(1999101138))
                        stack_2E0_2 = stack_2B4_0 = add:byte(expr_28E:byte, ldc:byte(6))
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_2A8 = and:int(var_0_2A8:int, ldc:int(1607415067))
                        goto(Label_0667)
                    }
                    
                    var_0_21F = and:int(var_0_2A8:int, ldc:int(-1149372962))
                    storeelement:byte(var_3_20F:byte[], var_4_210:int, stack_2E0_2:byte)
                    
                    if (cmpne:boolean(var_4_210:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A9_0 = stack_A7_0 = stack_DF_0 = stack_E1_0 = stack_10F_0 = stack_111_0 = stack_135_0 = stack_232_0 = stack_28E_0 = stack_315_0 = var_3_20F:byte[]
                    goto(Label_0230)
                }
                
                goto(Label_0530)
                Label_0174:
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-1517483072))
                    goto(Label_0278)
                }
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_21F = and:int(var_0_21F:int, ldc:int(-848603320))
                        loopcontinue()
                    }
                    
                    var_0_21F = and:int(var_0_21F:int, ldc:int(2017057883))
                    expr_E1 = arraylength:int(stack_E1_0:byte[])
                    
                    if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                        var_5_20A = expr_E1:int
                        var_3_20F = newarray:byte[](byte.class, expr_E1:int)
                        var_4_210 = expr_E1:int
                        goto(Label_0631)
                    }
                }
                
                Label_0230:
                
                if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0174)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(128)), ldc:int(0))) {
                        var_0_21F = and:int(var_0_21F:int, ldc:int(327311776))
                        loopcontinue()
                    }
                    
                    var_0_21F = and:int(var_0_21F:int, ldc:int(2004313712))
                    expr_111 = arraylength:int(stack_111_0:byte[])
                    
                    if (cmpne:boolean(expr_111:int, ldc:int(0))) {
                        var_3_303 = newarray:byte[](byte.class, expr_111:int)
                        var_4_304 = expr_111:int
                        
                        loop {
                            var_0_21F = and:int(var_0_21F:int, ldc:int(2071587162))
                            var_4_304 = add:int(var_4_304:int, ldc:int(-1))
                            storeelement:byte(var_3_303:byte[], var_4_304:int, add:byte(xor:byte(loadelement:byte(stack_315_0:byte[], var_4_304:int), ldc:byte(47)), ldc:byte(8)))
                            
                            if (cmpne:boolean(var_4_304:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A9_0 = stack_A7_0 = stack_DF_0 = stack_E1_0 = stack_10F_0 = stack_111_0 = stack_135_0 = stack_232_0 = stack_28E_0 = stack_315_0 = var_3_303:byte[]
                    }
                }
                
                Label_0278:
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0230)
                }
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0174)
                }
                
                if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_141 = initobject:String(String::<init>, stack_135_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1AA_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19507), ldc:int(4803)))
            expr_153 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20615), ldc:int(9235)))
            storeelement:String(expr_153:String[], and:int(ldc:int(23824), ldc:int(-23955)), invokevirtual:String[expected:String](String::substring, var_3_141:String, and:int(ldc:int(10216), ldc:int(-10217)), xor:int(ldc:int(14), ldc:int(10))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(16398), ldc:int(16396)), invokevirtual:String[expected:String](String::substring, var_3_141:String, and:int(ldc:int(1869), ldc:int(8196)), and:int(ldc:int(2366), ldc:int(8348))))
            storeelement:String(expr_153:String[], and:int(ldc:int(1377), ldc:int(2179)), invokevirtual:String[expected:String](String::substring, var_3_141:String, xor:int(ldc:int(-32492), ldc:int(-32504)), xor:int(ldc:int(6173), ldc:int(6200))))
            putstatic:String[](\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u93a2\u6c56\u0800\u51fa\u4975\u4bc8, expr_153:String[])
            putstatic:Logger(\u62da\u836c\u8753\u5bc4\u4bc8\u8350::\u5fe1\u647c\u67d0\ud12e\uc9f6\uc31c, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u527a\uc4d2\u927d\u3e75\u7e3f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68C : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_697 : int
        
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
        var_3_68C = and:int(ldc:int(-1480185867), ldc:int(-1476857995))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u62da\u836c\u8753\u5bc4\u4bc8\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_68C = and:int(var_3_68C:int, ldc:int(1607679014))
        }
        else {
            var_3_68C = and:int(var_3_68C:int, ldc:int(-1227544588))
            var_5_8A = and:int(ldc:int(8292), ldc:int(-8293))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15515), ldc:int(11402)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68C:int, ldc:int(-890722315))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(332), ldc:int(333)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(6177), ldc:int(9029)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68C = and:int(var_3_DA:int, ldc:int(-1359106178))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(2073), ldc:int(24583)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-589698991))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1213622525))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(835477416))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1606672090))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1619888555))
                    }
                    else {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1680834700))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1403121234))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1840334864))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(659575170))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1149915812))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-613649245))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1931902654))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-833451019))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1024215169))
                        var_11_EB = and:int(ldc:int(-15193), ldc:int(14680))
                        goto(Label_1543)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-2087672708))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-2050430311))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1386735754))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-959810418))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-470993026))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(449387114))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-647110359))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1007441400))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(172622790))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1643334646))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1598032406))
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-353718275))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1955552812))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1228576717))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-76467743))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1719417809))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(1490341203))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-672667651))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(2187), ldc:int(25665))
                                goto(Label_1172)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(872562987))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1932415859))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-352530063))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1008177291))
                        var_11_EB = and:int(ldc:int(-25435), ldc:int(24922))
                    }
                    
                    Label_1172:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1036999850))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-640901981))
                        goto(Label_1406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-760941304))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(142391919))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1141954563))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1406)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1172)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1797639746))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68C = and:int(var_3_68C:int, ldc:int(-1678346242))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1406:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1798026599))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-574404900))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1408319773))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-2125300071))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68C = and:int(var_3_68C:int, ldc:int(-2015166473))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_697 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(756560238))
                        goto(Label_1406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1210293484))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(1962336734))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-1469319059))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68C = and:int(var_3_68C:int, ldc:int(-875659402))
                        var_17_697 = add:int(var_16_119:int, and:int(ldc:int(3073), ldc:int(19)))
                        looporswitchbreak()
                    }
                    
                    var_3_68C = and:int(var_3_68C:int, ldc:int(681730658))
                }
                
                var_3_68C = and:int(var_3_68C:int, ldc:int(-624197642))
                
                if (cmple:boolean(var_5_8A = var_17_697:int, sub:int(var_6_91:int, xor:int(ldc:int(2112), ldc:int(2113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_68C:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
