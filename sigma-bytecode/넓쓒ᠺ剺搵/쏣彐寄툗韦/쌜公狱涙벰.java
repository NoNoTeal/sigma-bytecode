public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u516c\u72f1\u6d99\ubcb0 {
    private void \uc31c\u516c\u72f1\u6d99\ubcb0() {
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
            invokespecial:Object(Object::<init>, this:\uc31c\u516c\u72f1\u6d99\ubcb0)
            putfield:Map<String, \uc31c\u516c\u72f1\u6d99\ubcb0>(\uc31c\u516c\u72f1\u6d99\ubcb0::\u927d\ub32d\u4e72\u1187\ud158\u983f, this:\uc31c\u516c\u72f1\u6d99\ubcb0, invokestatic:HashMap[expected:Map<String, \uc31c\u516c\u72f1\u6d99\ubcb0>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\u836c\u47c2\ubb2b\u8bb0\u6435(java.util.Iterator<java.lang.String> p0, long p1) {
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
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u516c\u72f1\u6d99\ubcb0 lambda$\ub7dc\ub1b9\u76bc\ub7dc\u6fb0\u3a62$0(java.lang.String p0) {
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
            return:\uc31c\u516c\u72f1\u6d99\ubcb0(initobject:\uc31c\u516c\u72f1\u6d99\ubcb0(\uc31c\u516c\u72f1\u6d99\ubcb0::<init>))
        }
        
        goto(Label_0006)
    }
    
    public static long \ub18d\u4975\u4975\u071d\u3e2a\uc910(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u516c\u72f1\u6d99\ubcb0 p0) {
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
            return:long(getfield:long(\uc31c\u516c\u72f1\u6d99\ubcb0::\u3e75\u446c\u7d52\u718f\ua61f\uc238, p0:\uc31c\u516c\u72f1\u6d99\ubcb0))
        }
        
        goto(Label_0006)
    }
    
    public static long \ub7dc\u624e\u74b1\uc3e3\u8753\u4f4a(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u516c\u72f1\u6d99\ubcb0 p0) {
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
            return:long(getfield:long(\uc31c\u516c\u72f1\u6d99\ubcb0::\u7006\u88c5\u5bc4\ud12e\u98a4\uae87, p0:\uc31c\u516c\u72f1\u6d99\ubcb0))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \ucef1\u4179\ufe34\ud12e\u4daf\uf94d(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc31c\u516c\u72f1\u6d99\ubcb0 p0) {
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
            return:Map(getfield:Map<String, \uc31c\u516c\u72f1\u6d99\ubcb0>(\uc31c\u516c\u72f1\u6d99\ubcb0::\u927d\ub32d\u4e72\u1187\ud158\u983f, p0:\uc31c\u516c\u72f1\u6d99\ubcb0))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u516c\u72f1\u6d99\ubcb0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u0800\u6b0d\u3e75\uc9f6\u3bc9 p0) {
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
            invokespecial:\uc31c\u516c\u72f1\u6d99\ubcb0(\uc31c\u516c\u72f1\u6d99\ubcb0::<init>, this:\uc31c\u516c\u72f1\u6d99\ubcb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u7bad\u12b2\ub83f\ud217\u72f1\u7ce1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_625 : int
        
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
        var_3_61A = and:int(ldc:int(1935345752), ldc:int(-4511521))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc31c\u516c\u72f1\u6d99\ubcb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-143668484))
            var_5_7D = and:int(ldc:int(17029), ldc:int(-27558))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7998), ldc:int(7741)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61A:int, ldc:int(2078277372))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(9730), ldc:int(9731)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8784), ldc:int(8785)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61A = and:int(var_3_D2:int, ldc:int(2138783194))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17696), ldc:int(17697)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-26313525))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1131003095))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-638883847))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-6289274))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-332888488))
                    }
                    else {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2003524315))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1912840926))
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(348801210))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-419783013))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1291950198))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1596146361))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1938779768))
                        var_11_E3 = and:int(ldc:int(-25331), ldc:int(24690))
                        goto(Label_1429)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-915763503))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1524290123))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(809886709))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1664730221))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1239801577))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1240263251))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-81043493))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1629571121))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-209865839))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-173854608))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-679203994))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-541953053))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-170284658))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1937721471))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1078233129))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1280097100))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(603260409))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-229011686))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2010106489))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(3712), ldc:int(3713))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(72409320))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-426107046))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1722746661))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2133577050))
                        var_11_E3 = and:int(ldc:int(15172), ldc:int(-15176))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(998156810))
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1911916087))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1318960780))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(583035929))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2138795228))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1227435429))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-204858436))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1948301458))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1944005499))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1429)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1440)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-87506102))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1158159537))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(865307151))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1309301423))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-559798750))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(2000388061))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1429:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_625 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1440:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1800302938))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2110333708))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1233343051))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1531136161))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(967515676))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2140928895))
                        var_17_625 = add:int(var_16_111:int, and:int(ldc:int(599), ldc:int(10377)))
                        looporswitchbreak()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(175697365))
                }
                
                var_3_61A = and:int(var_3_61A:int, ldc:int(2134858622))
                
                if (cmple:boolean(var_5_7D = var_17_625:int, sub:int(var_6_84:int, and:int(ldc:int(385), ldc:int(6663))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-2115758106))
            goto(Label_0106)
        }
    }
}
