public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 {
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 \u873d\u7006\u3dd3\u6c52\u97b7\u946b(java.lang.String p0, boolean p1, java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p2, \u5d20\u7043\u88c5\u5db4\uf94d.\u7ce1\ubb2b\uc31c\u6d69\u5654 p3, \u51fa\u12cb\u7330\u74b1\u6c52.\ub18d\ub171\u51fa\uafe7\u7049 p4, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p5) {
        var_6_61 : int
        var_8_73 : \u4f52\u7ce1\uc229\ucef1\ube23
        var_9_76 : Throwable
        var_10_85 : \u6198\ub113\u8709\uf9c5\u0a06
        var_10_140 : Throwable
        var_14_167 : Throwable
        var_8_18C : IOException
        
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
            var_6_61 = and:int(ldc:int(-1215233198), ldc:int(402160069))
            
            try {
                var_6_61 = and:int(var_6_61:int, ldc:int(2005569867))
                var_8_73 = checkcast:\u4f52\u7ce1\uc229\ucef1\ube23(\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23.class, invokeinterface:\u4f52\u7ce1\uc229\ucef1\ube23(Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>::get, p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>))
                var_9_76 = aconstnull:Throwable()
                
                try {
                    var_10_85 = checkcast:\u6198\ub113\u8709\uf9c5\u0a06(\u12b2\u4e72\u8df4\u67e9\u67e9.\u6198\ub113\u8709\uf9c5\u0a06.class, invokeinterface:\u6198\ub113\u8709\uf9c5\u0a06(\u4f52\u7ce1\uc229\ucef1\ube23::\u624e\ub8be\u4c2b\uc84e\u4975\u6fb0, var_8_73:\u4f52\u7ce1\uc229\ucef1\ube23, getstatic:\u8aa5\uc238\u61a4\ub32d\u8413[expected:\ub113\u8350\u839e\ubb2b\ub83f<\u6198\ub113\u8709\uf9c5\u0a06>](\u6198\ub113\u8709\uf9c5\u0a06::\uceb8\u5140\u8389\ub32d\ubcb0\u7006)))
                    
                    if (logicaland:boolean(p1:boolean, cmpeq:boolean(var_10_85:\u6198\ub113\u8709\uf9c5\u0a06, aconstnull:\u6198\ub113\u8709\uf9c5\u0a06()))) {
                        invokeinterface:void(Logger::error, getstatic:Logger(\ua61f\uae87\u36d3\u647c\u3d64::\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b), loadelement:String(getstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf), and:int(ldc:int(-7759), ldc:int(7758))))
                        var_10_85 = getstatic:\u6198\ub113\u8709\uf9c5\u0a06(\ua61f\uae87\u36d3\u647c\u3d64::\ub32d\u3e2a\uc7fe\u946b\u7d52\ua61f)
                    }
                    
                    if (cmpne:boolean(var_10_85:\u6198\ub113\u8709\uf9c5\u0a06, aconstnull:\u6198\ub113\u8709\uf9c5\u0a06())) {
                        return:\ua61f\uae87\u36d3\u647c\u3d64(invokeinterface:\ua61f\uae87\u36d3\u647c\u3d64(\u7ce1\ubb2b\uc31c\u6d69\u5654::\uff55\uc7fe\u8709\u99f7\uc9f6\u6d69, p3:\u7ce1\ubb2b\uc31c\u6d69\u5654, p0:String, p1:boolean, p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>, var_8_73:\u4f52\u7ce1\uc229\ucef1\ube23, var_10_85:\u6198\ub113\u8709\uf9c5\u0a06, p4:\ub18d\ub171\u51fa\uafe7\u7049, p5:\ud51e\u7ce1\ua61f\u183a\u1187))
                    }
                    
                    invokeinterface:void(Logger::warn, getstatic:Logger(\ua61f\uae87\u36d3\u647c\u3d64::\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b), loadelement:String(getstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf), and:int(ldc:int(24711), ldc:int(1049))), p0:String[expected:Object])
                    return:\ua61f\uae87\u36d3\u647c\u3d64(aconstnull:\ua61f\uae87\u36d3\u647c\u3d64())
                }
                catch (java.lang.Throwable var_10_140) {
                    var_9_76 = var_10_140:Throwable
                    athrow(var_10_140:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_8_73:\u4f52\u7ce1\uc229\ucef1\ube23, aconstnull:\u4f52\u7ce1\uc229\ucef1\ube23())) {
                        if (cmpne:boolean(var_9_76:Throwable, aconstnull:Throwable())) {
                            try {
                                invokeinterface:void(\u4f52\u7ce1\uc229\ucef1\ube23::close, var_8_73:\u4f52\u7ce1\uc229\ucef1\ube23)
                            }
                            catch (java.lang.Throwable var_14_167) {
                                invokevirtual:void(Throwable::addSuppressed, var_9_76:Throwable, var_14_167:Throwable)
                            }
                        }
                        else {
                            invokeinterface:void(\u4f52\u7ce1\uc229\ucef1\ube23::close, var_8_73:\u4f52\u7ce1\uc229\ucef1\ube23)
                        }
                    }
                }
            }
            catch (java.io.IOException var_8_18C) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\ua61f\uae87\u36d3\u647c\u3d64::\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b), loadelement:String(getstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf), and:int(ldc:int(4362), ldc:int(24771))), invokevirtual:String[expected:Object](Throwable::toString, var_8_18C:IOException[expected:Throwable]))
            }
            
            return:\ua61f\uae87\u36d3\u647c\u3d64(aconstnull:\ua61f\uae87\u36d3\u647c\u3d64())
        }
        
        goto(Label_0006)
    }
    
    public void \ua61f\uae87\u36d3\u647c\u3d64(java.lang.String p0, boolean p1, java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p2, net.minecraft.util.text.ITextComponent p3, net.minecraft.util.text.ITextComponent p4, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u67d0\u7c6b\u5db4\u8df4\u120d p5, \u51fa\u12cb\u7330\u74b1\u6c52.\ub18d\ub171\u51fa\uafe7\u7049 p6, boolean p7, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p8) {
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
            invokespecial:Object(Object::<init>, this:\ua61f\uae87\u36d3\u647c\u3d64)
            putfield:String(\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, this:\ua61f\uae87\u36d3\u647c\u3d64, p0:String)
            putfield:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>(\ua61f\uae87\u36d3\u647c\u3d64::\u8308\ubcb0\u7ce1\uafe7\u3bc9\ub113, this:\ua61f\uae87\u36d3\u647c\u3d64, p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>)
            putfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6198\u624e\u3504\u965f\u4c2b\ub8be, this:\ua61f\uae87\u36d3\u647c\u3d64, p3:ITextComponent)
            putfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, this:\ua61f\uae87\u36d3\u647c\u3d64, p4:ITextComponent)
            putfield:\u67d0\u7c6b\u5db4\u8df4\u120d(\ua61f\uae87\u36d3\u647c\u3d64::\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04, this:\ua61f\uae87\u36d3\u647c\u3d64, p5:\u67d0\u7c6b\u5db4\u8df4\u120d)
            putfield:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\uae87\ub171\ubff1\u5db4\u88c5\u3e2a, this:\ua61f\uae87\u36d3\u647c\u3d64, p1:boolean)
            putfield:\ub18d\ub171\u51fa\uafe7\u7049(\ua61f\uae87\u36d3\u647c\u3d64::\u4179\u873d\uc31c\u71ae\u6d99\uafe7, this:\ua61f\uae87\u36d3\u647c\u3d64, p6:\ub18d\ub171\u51fa\uafe7\u7049)
            putfield:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85, this:\ua61f\uae87\u36d3\u647c\u3d64, p7:boolean)
            putfield:\ud51e\u7ce1\ua61f\u183a\u1187(\ua61f\uae87\u36d3\u647c\u3d64::\u6c52\ucb79\ubefe\u8c8a\u7e3f\ubff1, this:\ua61f\uae87\u36d3\u647c\u3d64, p8:\ud51e\u7ce1\ua61f\u183a\u1187)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua61f\uae87\u36d3\u647c\u3d64(java.lang.String p0, boolean p1, java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u6198\ub113\u8709\uf9c5\u0a06 p4, \u51fa\u12cb\u7330\u74b1\u6c52.\ub18d\ub171\u51fa\uafe7\u7049 p5, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p6) {
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
            invokespecial:\ua61f\uae87\u36d3\u647c\u3d64(\ua61f\uae87\u36d3\u647c\u3d64::<init>, this:\ua61f\uae87\u36d3\u647c\u3d64, p0:String, p1:boolean, p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, invokeinterface:String(\u4f52\u7ce1\uc229\ucef1\ube23::\u8cae\u7d52\u647c\u3bd6\u0c95\u965f, p3:\u4f52\u7ce1\uc229\ucef1\ube23)), invokevirtual:ITextComponent(\u6198\ub113\u8709\uf9c5\u0a06::\u7873\ud12e\ubded\u8d98\u61a4\ub32d, p4:\u6198\ub113\u8709\uf9c5\u0a06), invokestatic:\u67d0\u7c6b\u5db4\u8df4\u120d(\u67d0\u7c6b\u5db4\u8df4\u120d::\u47c2\ubded\u600f\u120d\ubf56\u3776, invokevirtual:int(\u6198\ub113\u8709\uf9c5\u0a06::\u9255\ua61f\u8258\ufe34\u718f\u7bad, p4:\u6198\ub113\u8709\uf9c5\u0a06)), p5:\ub18d\ub171\u51fa\uafe7\u7049, and:int[expected:boolean](ldc:int(-28142), ldc:int(25832)), p6:\ud51e\u7ce1\ua61f\u183a\u1187)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u516c\u7d52\u3d64\u647c\uf9c5\u8d98() {
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
            return:ITextComponent(getfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6198\u624e\u3504\u965f\u4c2b\ub8be, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u392e\uc84e\ua562\u59ec\ud4fe\u7bad() {
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
            return:ITextComponent(getfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u3e2a\uafe7\u64ab\u6d99\uff55\u9033(boolean p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u67d0\u7c6b\u5db4\u8df4\u120d \u7d52\u93a2\u4daf\ub7dc\u56bd\u7049() {
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
            return:\u67d0\u7c6b\u5db4\u8df4\u120d(getfield:\u67d0\u7c6b\u5db4\u8df4\u120d(\ua61f\uae87\u36d3\u647c\u3d64::\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 \u67d0\uf9c5\u4c04\u4f4a\u67d0\u7043() {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(checkcast:\u4f52\u7ce1\uc229\ucef1\ube23(\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23.class, invokeinterface:\u4f52\u7ce1\uc229\ucef1\ube23(Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>::get, getfield:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>(\ua61f\uae87\u36d3\u647c\u3d64::\u8308\ubcb0\u7ce1\uafe7\u3bc9\ub113, this:\ua61f\uae87\u36d3\u647c\u3d64))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uc2bd\u12b2\u9937\ub102\u64f2\uc238() {
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
            return:String(getfield:String(\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud7e8\u5654\u62da\ub113\u960f\ub113() {
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
            return:boolean(getfield:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\uae87\ub171\ubff1\u5db4\u88c5\u3e2a, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u071d\u647c\u9033\u3dd3\u12b2\u3504() {
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
            return:boolean(getfield:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\ub18d\ub171\u51fa\uafe7\u7049 \u946b\u3776\u52d3\u3d64\u3dd3\u2dcc() {
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
            return:\ub18d\ub171\u51fa\uafe7\u7049(getfield:\ub18d\ub171\u51fa\uafe7\u7049(\ua61f\uae87\u36d3\u647c\u3d64::\u4179\u873d\uc31c\u71ae\u6d99\uafe7, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 \u6b5f\ud7e8\u0c95\u7af6\u6fb0\ub171() {
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
            return:\ud51e\u7ce1\ua61f\u183a\u1187(getfield:\ud51e\u7ce1\ua61f\u183a\u1187(\ua61f\uae87\u36d3\u647c\u3d64::\u6c52\ucb79\ubefe\u8c8a\u7e3f\ubff1, this:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
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
        
        if (cmpeq:boolean(this:\ua61f\uae87\u36d3\u647c\u3d64[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(11401), ldc:int(20771)))
        }
        
        if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, p0:Object)) {
            return:boolean(invokevirtual:boolean(String::equals, getfield:String(\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, this:\ua61f\uae87\u36d3\u647c\u3d64), getfield:String[expected:Object](\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, checkcast:\ua61f\uae87\u36d3\u647c\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, p0:Object[expected:\ua61f\uae87\u36d3\u647c\u3d64]))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-15307), ldc:int(4554)))
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(String::hashCode, getfield:String(\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, this:\ua61f\uae87\u36d3\u647c\u3d64)))
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.Style lambda$\u446c\u56bd\u3d4b\uae5d\ud36e\u88c5$0(boolean p0, net.minecraft.util.text.Style p1) {
        var_3_61 : int
        stack_80_1 : TextFormatting [generated]
        
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
            var_3_61 = and:int(ldc:int(798669299), ldc:int(-1344325517))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(530546027))
                stack_80_1 = getstatic:TextFormatting(TextFormatting::RED)
            }
            else {
                stack_80_1 = getstatic:TextFormatting(TextFormatting::GREEN)
            }
            
            return:Style(invokevirtual:Style(Style::setHoverEvent, invokevirtual:Style(Style::setInsertion, invokevirtual:Style(Style::setFormatting, p1:Style, stack_80_1:TextFormatting), invokestatic:String(StringArgumentType::escapeIfRequired, getfield:String(\ua61f\uae87\u36d3\u647c\u3d64::\u6435\u5bc4\uf9c5\u3dd3\u4f4a\u2dcc, this:\ua61f\uae87\u36d3\u647c\u3d64))), initobject:HoverEvent(HoverEvent::<init>, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT), invokeinterface:IFormattableTextComponent[expected:T](IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent[expected:TextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf), xor:int(ldc:int(12805), ldc:int(12806)))), getfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6198\u624e\u3504\u965f\u4c2b\ub8be, this:\ua61f\uae87\u36d3\u647c\u3d64)), loadelement:String(getstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf), xor:int(ldc:int(659), ldc:int(663)))), getfield:ITextComponent(\ua61f\uae87\u36d3\u647c\u3d64::\u6bb9\u71f1\ubded\u516c\u4f4a\u92ff, this:\ua61f\uae87\u36d3\u647c\u3d64)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2F6 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_27A_0 : byte[] [generated]
        stack_309_0 : byte[] [generated]
        stack_347_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        var_4_25B : int
        var_3_260 : byte[]
        var_5_261 : int
        var_0_294 : int
        expr_27A : byte [generated]
        stack_2C3_2 : byte [generated]
        stack_297_0 : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_335 : byte[]
        var_5_336 : int
        expr_112 : int [generated]
        var_3_38B : byte[]
        var_5_38C : int
        expr_39D : byte [generated]
        var_3_14B : String
        expr_153 : String[] [generated]
        expr_15D : String[] [generated]
        var_3_207 : String[]
        expr_212 : TranslationTextComponent [generated]
        expr_229 : TextFormatting[] [generated]
        
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
        var_0_2F6 = and:int(ldc:int(-631505917), ldc:int(-11796595))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_27A_0 = stack_309_0 = stack_347_0 = stack_39D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("PSfIsNjS+A5w0DAYsFIIhhhQmtBmANA4oCJY5gCAOHhQADoiTuZwEGi4MFLQ3rroLhiIIrC+YFgYcFCQOJoaTx7n6DBg6rC+0Fjw6gg+KKB66LYgWJoQhkgoMJDQUJqwhlh6yDYYeKiIaCjgABoonphiaBaQUEgwolg2IMrQvgjCEAaw4FowtvjYWIh4COhqUS7PaPiQGjCIEEbAGFIghhhQ6tDmOKAiaLYgyvAGGFDqACbBkE9o+JAaMIgYZuiaIAYYUOrwrigIEji2IJpyhqa4QIjQ0FiwWGmgF1CaOF4oyLDY0dhfEFBIMKN+kw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_25B = expr_6E:int
        var_3_260 = newarray:byte[](byte.class, expr_6E:int)
        var_5_261 = expr_6E:int
        Label_0611:
        
        while (cmpne:boolean(and:int(var_0_2F6:int, ldc:int(65536)), ldc:int(0))) {
            var_0_294 = and:int(var_0_2F6:int, ldc:int(-663749379))
            var_5_261 = add:int(var_5_261:int, ldc:int(-1))
            expr_27A = stack_2C3_2 = loadelement(stack_27A_0, var_5_261)
            
            if (cmplt:boolean(add:int(add:int(var_5_261:int, ldc:int(2)), neg:int(var_4_25B:int)), ldc:int(0))) {
                stack_2C3_2 = stack_297_0 = add:byte(expr_27A:byte, loadelement:byte(var_3_260:byte[], add:int(var_5_261:int, ldc:int(2))))
                goto(Label_0679)
            }
            
            Label_0647:
            
            if (cmpne:boolean(and:int(var_0_294:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_294 = and:int(var_0_294:int, ldc:int(-546312941))
                stack_2C3_2 = stack_297_0 = add:byte(expr_27A:byte, ldc:byte(2))
            }
            
            Label_0679:
            
            if (cmpne:boolean(and:int(var_0_294:int, ldc:int(16)), ldc:int(0))) {
                var_0_294 = and:int(var_0_294:int, ldc:int(-1692545599))
                goto(Label_0647)
            }
            
            var_0_2F6 = and:int(var_0_294:int, ldc:int(-607393139))
            storeelement:byte(var_3_260:byte[], var_5_261:int, stack_2C3_2:byte)
            
            if (cmpne:boolean(var_5_261:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_27A_0 = stack_309_0 = stack_347_0 = stack_39D_0 = var_3_260:byte[]
            goto(Label_0115)
        }
        
        Label_0745:
        
        while (cmpne:boolean(and:int(var_0_2F6:int, ldc:int(524288)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-581178499))
            var_5_261 = add:int(var_5_261:int, ldc:int(-1))
            storeelement:byte(var_3_260:byte[], var_5_261:int, xor:byte(add:byte(loadelement:byte(stack_309_0:byte[], var_5_261:int), ldc:byte(7)), ldc:byte(28)))
            
            if (cmpne:boolean(var_5_261:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_27A_0 = stack_309_0 = stack_347_0 = stack_39D_0 = var_3_260:byte[]
            goto(Label_0172)
        }
        
        var_0_2F6 = and:int(var_0_2F6:int, ldc:int(249556742))
        goto(Label_0611)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(73942226))
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(1284771665))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-656672377))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_25B = expr_A7:int
                var_3_260 = newarray:byte[](byte.class, expr_A7:int)
                var_5_261 = expr_A7:int
                goto(Label_0745)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_2F6:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-982337751))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_2F6:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-597270587))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-572522793))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_335 = newarray:byte[](byte.class, expr_E2:int)
                var_5_336 = expr_E2:int
                
                loop {
                    var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-665845867))
                    var_5_336 = add:int(var_5_336:int, ldc:int(-1))
                    storeelement:byte(var_3_335:byte[], var_5_336:int, add:int(shl:int(loadelement:byte(stack_347_0:byte[], var_5_336:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_336:int, xor:int(ldc:int(-16348), ldc:int(-16347)))), ldc:int(7)), xor:int(ldc:int(1472), ldc:int(1473)))))
                    
                    if (cmpne:boolean(var_5_336:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_27A_0 = stack_309_0 = stack_347_0 = stack_39D_0 = var_3_335:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(2048)), ldc:int(0))) {
                var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-266528263))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-77858679))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_38B = newarray:byte[](byte.class, expr_112:int)
                var_5_38C = expr_112:int
                
                loop {
                    var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-540279623))
                    var_5_38C = add:int(var_5_38C:int, ldc:int(-1))
                    expr_39D = loadelement:byte(stack_39D_0:byte[], var_5_38C:int)
                    storeelement:byte(var_3_38B:byte[], var_5_38C:int, or:int(and:int(shl:int(expr_39D:byte, and:int(ldc:int(38), ldc:int(597))), ldc:int(-16)), and:int(shr:int(expr_39D:byte[expected:int], and:int(ldc:int(20636), ldc:int(9764))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_38C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_110_0 = stack_112_0 = stack_13F_0 = stack_27A_0 = stack_309_0 = stack_347_0 = stack_39D_0 = var_3_38B:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_2F6:int, ldc:int(1)), ldc:int(0))) {
            var_0_2F6 = and:int(var_0_2F6:int, ldc:int(-828591535))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_2F6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_153 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10790), ldc:int(4103)))
            expr_15D = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9604), ldc:int(9602)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(67), ldc:int(6163)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-16450), ldc:int(16449)), and:int(ldc:int(-3948), ldc:int(874))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(4398), ldc:int(16581)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-1395), ldc:int(1362)), xor:int(ldc:int(-23040), ldc:int(-23039))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(3637), ldc:int(-3766)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-24559), ldc:int(-24560)), xor:int(ldc:int(1226), ldc:int(1112))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4641), ldc:int(4640)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(18650), ldc:int(10166)), xor:int(ldc:int(649), ldc:int(572))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(6409), ldc:int(6411)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(8373), ldc:int(7421)), xor:int(ldc:int(3653), ldc:int(3734))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(16722), ldc:int(16727)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16851), ldc:int(759)), xor:int(ldc:int(20610), ldc:int(20591))))
            putstatic:String[](\ua61f\uae87\u36d3\u647c\u3d64::\u6d69\u6b0d\u61a4\u416d\u416d\ufcaf, expr_15D:String[])
            var_3_207 = expr_153:String[]
            putstatic:Logger(\ua61f\uae87\u36d3\u647c\u3d64::\u8df4\u9033\uc7fe\u3a62\u8aa5\u3d4b, invokestatic:Logger(LogManager::getLogger))
            expr_212 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String[expected:String](var_3_207:String[], xor:int(ldc:int(1283), ldc:int(1286))))
            expr_229 = newarray:TextFormatting[](net.minecraft.util.text.TextFormatting.class, and:int(ldc:int(514), ldc:int(10698)))
            storeelement:TextFormatting(expr_229:TextFormatting[], and:int(ldc:int(11584), ldc:int(-11601)), getstatic:TextFormatting(TextFormatting::RED))
            storeelement:TextFormatting(expr_229:TextFormatting[], and:int(ldc:int(25345), ldc:int(237)), getstatic:TextFormatting(TextFormatting::ITALIC))
            putstatic:\u6198\ub113\u8709\uf9c5\u0a06(\ua61f\uae87\u36d3\u647c\u3d64::\ub32d\u3e2a\uc7fe\u946b\u7d52\ua61f, initobject:\u6198\ub113\u8709\uf9c5\u0a06(\u6198\ub113\u8709\uf9c5\u0a06::<init>, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, expr_212:TranslationTextComponent[expected:IFormattableTextComponent], expr_229:TextFormatting[]), invokeinterface:int(GameVersion::getPackVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub113\ub70c\u47c2\u97e6\u8cae\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(-495113165), ldc:int(1987952529))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua61f\uae87\u36d3\u647c\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1731165724))
            var_5_81 = and:int(ldc:int(8432), ldc:int(-8433))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28411), ldc:int(19682)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(1736288858))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(2305), ldc:int(28865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16458), ldc:int(16459)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(-93370249))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(33), ldc:int(3077)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1325055272))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-703350542))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1577885574))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-652270946))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1898248905))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-89353153))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-378774694))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1053689423))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1739000787))
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1469970962))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1975135446))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-206608771))
                        var_11_EB = and:int(ldc:int(-13931), ldc:int(13386))
                        goto(Label_1526)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1286873082))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(230845680))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1322346756))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-815325454))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1249509786))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1660797022))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1320652178))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-66076255))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(236882692))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-828180199))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(543338831))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1785500894))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(575201545))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2117032124))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(8193), ldc:int(23669))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(71448854))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(6464617))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-796862530))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1807490600))
                        var_11_EB = and:int(ldc:int(-12739), ldc:int(12738))
                    }
                    
                    Label_1119:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-399869985))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1084944191))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1421787513))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1878877192))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1267160139))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-237854233))
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(924931461))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-965569874))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1223335681))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1774649175))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(426633044))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-164694622))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1526)
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1452531282))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1032574687))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-155637106))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-219289953))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(301002490))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(756725903))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1097973333))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-231944764))
                        var_17_67D = add:int(var_16_119:int, and:int(ldc:int(261), ldc:int(1585)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(353761397))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-482396224))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, and:int(ldc:int(9409), ldc:int(2565))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(50740805))
            goto(Label_0108)
        }
    }
}
