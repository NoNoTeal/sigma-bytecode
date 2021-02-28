public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5 {
    public void \u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5(boolean p0, boolean p1) {
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
    
    public boolean equals(java.lang.Object p0) {
        var_2_CC : int
        var_4_BA : \u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5
        stack_FA_0 : int [generated]
        
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
        var_2_CC = and:int(ldc:int(923286317), ldc:int(896490174))
        
        if (cmpeq:boolean(this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(7177), ldc:int(17159)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_CC:int, ldc:int(1024)), ldc:int(0))) {
                var_2_CC = and:int(var_2_CC:int, ldc:int(-1218555009))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5>(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::getClass, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        var_4_BA = checkcast:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5.class, p0:Object[expected:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5])
                        
                        if (logicaland:boolean(cmpeq:boolean(getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5), getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, var_4_BA:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)), cmpeq:boolean(getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\u120d\u5f50\uc84e\u8709\u40a9\u4975, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5), getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\u120d\u5f50\uc84e\u8709\u40a9\u4975, var_4_BA:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)))) {
                            stack_FA_0 = xor:int(ldc:int(192), ldc:int(193))
                        }
                        else {
                            var_2_CC = and:int(var_2_CC:int, ldc:int(889969380))
                            stack_FA_0 = and:int(ldc:int(14866), ldc:int(-14867))
                        }
                        
                        return:boolean(stack_FA_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(2147483647)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-11309), ldc:int(11304)))
            }
            
            var_2_CC = and:int(var_2_CC:int, ldc:int(926665879))
        }
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
            return:int(invokestatic:int(\u6c56\uafe7\uf995\ud523\u7006\u6b0d::\u7049\uae87\ubded\u927d\uc3e3\u3a62, getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5), getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\u120d\u5f50\uc84e\u8709\u40a9\u4975, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\ub83f\ub19c\u8350\u759a\u071d\u3504, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)), ldc:String("[writeColor=")), getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\ub70c\ua6bd\ud36e\ub6ab\u183a\u72f1, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)), ldc:String(", writeDepth=")), getfield:boolean(\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5::\u120d\u5f50\uc84e\u8709\u40a9\u4975, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5)), ldc:char(93))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3711\u74b1\uc31c\uc4d2\u120d\ud12e$1(boolean p0, boolean p1) {
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
            
            if (logicalnot:boolean(p0:boolean)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, xor:int[expected:boolean](ldc:int(2049), ldc:int(2048)))
            }
            
            if (logicalnot:boolean(p1:boolean)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, xor:int[expected:boolean](ldc:int(-24573), ldc:int(-24574)), and:int[expected:boolean](ldc:int(161), ldc:int(13121)), and:int[expected:boolean](ldc:int(2129), ldc:int(135)), and:int[expected:boolean](ldc:int(1), ldc:int(18947)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub19c\u600f\u0c95\u93a2\u51b2\uc2e8$0(boolean p0, boolean p1) {
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
            
            if (logicalnot:boolean(p0:boolean)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6435\uff55\u8640\ub6ab\u527a\u4179, p0:boolean)
            }
            
            if (logicalnot:boolean(p1:boolean)) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, p1:boolean, p1:boolean, p1:boolean, p1:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(-4857975), ldc:int(-51028053))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d98\u4daf\u2dcc\u8640\u64ab\u8aa5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1445423602))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-226525223))
            var_5_85 = and:int(ldc:int(-11325), ldc:int(11320))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6268), ldc:int(-6269)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60D:int, ldc:int(-92447251))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-30720), ldc:int(-30719)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2053), ldc:int(21091)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D2:int, ldc:int(-251666533))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(129), ldc:int(128)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-255478759))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1542889931))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1063030683))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1301218129))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1884571961))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-130195995))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1398838852))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1245421774))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-458815930))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-117473845))
                        var_11_E3 = and:int(ldc:int(15080), ldc:int(-31469))
                        goto(Label_1451)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(594027725))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-730405438))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(725160676))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1833806567))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-92839997))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1015344713))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(725435468))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1752304643))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1448624363))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-134881797))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(413813774))
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-185117263))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1513997688))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-42672007))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-793440275))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1456500525))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-518844998))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2091249975))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1916260636))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-34250793))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(2051), ldc:int(417))
                                goto(Label_1071)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1983761464))
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-618185836))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1589063623))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(405394129))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-67248241))
                        var_11_E3 = and:int(ldc:int(-17712), ldc:int(17711))
                    }
                    
                    Label_1071:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-336228240))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2119875356))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(727558816))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1183142298))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1061836823))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-113279553))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1196:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-391047797))
                        goto(Label_1462)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1071)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1048109056))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1981178525))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(786965934))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(279596903))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-862100921))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-184681045))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1451)
                    }
                    
                    Label_1341:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1462)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(858547741))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-664742840))
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-92938353))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1451:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1462:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-933538378))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(422530849))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-122298995))
                        var_17_618 = add:int(var_16_111:int, xor:int(ldc:int(96), ldc:int(97)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-126484581))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, and:int(ldc:int(7587), ldc:int(8193))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
