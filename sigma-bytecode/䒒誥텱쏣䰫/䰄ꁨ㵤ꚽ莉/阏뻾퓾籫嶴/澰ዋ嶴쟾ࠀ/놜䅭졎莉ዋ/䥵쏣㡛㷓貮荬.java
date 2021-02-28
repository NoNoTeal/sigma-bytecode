public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u4975\uc3e3\u385b\u3dd3\u8cae\u836c {
    public void \u4975\uc3e3\u385b\u3dd3\u8cae\u836c(com.mojang.serialization.Codec<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e> p0) {
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
            invokespecial:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e>(\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e>::<init>, this:\u4975\uc3e3\u385b\u3dd3\u8cae\u836c[expected:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e>], p0:Codec<\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e p4) {
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
    
    public java.lang.String toString() {
        stack_8C_0 : String [generated]
        expr_69 : Object[] [generated]
        
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
            stack_8C_0 = ldc:String("< %s [%s] >")
            expr_69 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(74), ldc:int(13462)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(3299), ldc:int(-11748)), invokevirtual:String[expected:Object](Class<T>::getSimpleName, invokevirtual:Class<? extends \u4975\uc3e3\u385b\u3dd3\u8cae\u836c>(\u4975\uc3e3\u385b\u3dd3\u8cae\u836c::getClass, this:\u4975\uc3e3\u385b\u3dd3\u8cae\u836c)))
            storeelement:Object(expr_69:Object[], and:int(ldc:int(65), ldc:int(12593)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4975\uc3e3\u385b\u3dd3\u8cae\u836c>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u93a2\u1187\u5654\u8413\u3a62\ua61f<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u52d3\ucb79\u4975\uc2e8\uc87f\u836c), this:\u4975\uc3e3\u385b\u3dd3\u8cae\u836c))
            return:String(invokestatic:String(String::format, stack_8C_0:String, expr_69:Object[]))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p4) {
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
            return:boolean(invokevirtual:boolean(\u4975\uc3e3\u385b\u3dd3\u8cae\u836c::\uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a, this:\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:Random, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e.class, p4:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6[expected:\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e])))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u946b\u8cae\u4f52\ud217\u3504\uc246$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p2, java.util.Random p3, org.apache.commons.lang3.mutable.MutableBoolean p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5) {
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
            
            if (invokevirtual:boolean(\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<FC, F>::\ua562\ud12e\u8389\ub8be\u3d64\u8cae, checkcast:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>.class, invokeinterface:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>::get, getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e::\u7bad\u34df\u8753\u34df\u1833\ubb2b, p0:\u4e72\uc2bd\u7006\u56bd\u647c\u0b8e))), p1:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p2:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p3:Random, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                invokevirtual:void(MutableBoolean::setTrue, p4:MutableBoolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\ub18d\u5140\ucfaf\u392e\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(1741867872), ldc:int(-339541))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\uc3e3\u385b\u3dd3\u8cae\u836c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1859373608))
            var_5_7D = and:int(ldc:int(-307), ldc:int(306))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18950), ldc:int(-19079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(-285547097))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(16944), ldc:int(16945)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(36), ldc:int(37)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(-402793689))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(545), ldc:int(1227)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-997870626))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1487232953))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1129827314))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-180534435))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-420755273))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1061983837))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-512029890))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(27846499))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1450629765))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1759651207))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-26355855))
                        var_11_E3 = and:int(ldc:int(-27929), ldc:int(27928))
                        goto(Label_1416)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-952935897))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(632639438))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-715156227))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-756989320))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-181666946))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(164644992))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2002641888))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(176282360))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1648450727))
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1481508584))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(879693204))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-287371994))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2017663073))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-9775696))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1184782389))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(927260859))
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(273184912))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1627498631))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-146413970))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(12873), ldc:int(17443))
                                goto(Label_1079)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(286617544))
                        goto(Label_1302)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-991851089))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-11868764))
                        var_11_E3 = and:int(ldc:int(-27509), ldc:int(26708))
                    }
                    
                    Label_1079:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1212849228))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(894186501))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-287915423))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1302)
                            }
                        }
                    }
                    
                    Label_1180:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1788777087))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1079)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-928398218))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-535327530))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2040135))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1416)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1302:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1186225145))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-609079658))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(2120860846))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1416:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-451360266))
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1079)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(643932102))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1546551829))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(990801773))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2136067964))
                        var_17_608 = add:int(var_16_111:int, and:int(ldc:int(261), ldc:int(6355)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(2011620214))
                
                if (cmple:boolean(var_5_7D = var_17_608:int, sub:int(var_6_84:int, xor:int(ldc:int(2098), ldc:int(2099))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1789797538))
            goto(Label_0106)
        }
    }
}
