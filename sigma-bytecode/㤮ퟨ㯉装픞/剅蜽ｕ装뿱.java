public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u5245\u873d\uff55\u88c5\ubff1 {
    public void \u5245\u873d\uff55\u88c5\ubff1(com.mojang.serialization.Codec<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4bc8\u7bad\u92ff\ubefe\u8d90> p0, int p1, boolean p2, boolean p3) {
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
            invokespecial:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>(\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>::<init>, this:\u5245\u873d\uff55\u88c5\ubff1[expected:\u5654\u9937\u72f1\ud4fe\u0c95<\u4bc8\u7bad\u92ff\ubefe\u8d90>], p0:Codec<\u4bc8\u7bad\u92ff\ubefe\u8d90>)
            putfield:int(\u5245\u873d\uff55\u88c5\ubff1::\u5db4\u5bc4\u3a62\ud4fe\u9033\u527a, this:\u5245\u873d\uff55\u88c5\ubff1, p1:int)
            putfield:boolean(\u5245\u873d\uff55\u88c5\ubff1::\u6c52\u4ab3\u392e\u416d\uafe7\u6b0d, this:\u5245\u873d\uff55\u88c5\ubff1, p2:boolean)
            putfield:boolean(\u5245\u873d\uff55\u88c5\ubff1::\u6fb0\u12b2\uc84e\u600f\u3a62\u7006, this:\u5245\u873d\uff55\u88c5\ubff1, p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ud51e\u4c04\u97b7\u624e\u494c\ua6bd<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4bc8\u7bad\u92ff\ubefe\u8d90> \u4c04\u4975\ucef1\u3dd3\u6fb0\u92ff() {
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
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187 lambda$\u5d20\u51b2\u4bc8\u183a\u516c\u76bc$0(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0, int p1, int p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p3, int p4, long p5) {
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
            return:\u34df\uceb8\u34df\u8640\u1187(initobject:\u718f\ub102\uc4d2\ubff1\ud51e[expected:\u34df\uceb8\u34df\u8640\u1187](\u718f\ub102\uc4d2\ubff1\ud51e::<init>, this:\u5245\u873d\uff55\u88c5\ubff1, p1:int, p2:int, p3:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p4:int, p5:long))
        }
        
        goto(Label_0006)
    }
    
    public static int \ufe34\u7006\ubcb0\u527a\uc84e\u8413(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u5245\u873d\uff55\u88c5\ubff1 p0) {
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
            return:int(getfield:int(\u5245\u873d\uff55\u88c5\ubff1::\u5db4\u5bc4\u3a62\ud4fe\u9033\u527a, p0:\u5245\u873d\uff55\u88c5\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u718f\u92ff\u7330\u385b\u7e3f\u4f52(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u5245\u873d\uff55\u88c5\ubff1 p0) {
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
            return:boolean(getfield:boolean(\u5245\u873d\uff55\u88c5\ubff1::\u6c52\u4ab3\u392e\u416d\uafe7\u6b0d, p0:\u5245\u873d\uff55\u88c5\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u97e6\ud158\u9033\ub7dc\u8389\ua562(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u5245\u873d\uff55\u88c5\ubff1 p0) {
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
            return:boolean(getfield:boolean(\u5245\u873d\uff55\u88c5\ubff1::\u6fb0\u12b2\uc84e\u600f\u3a62\u7006, p0:\u5245\u873d\uff55\u88c5\ubff1))
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
    
    public void \u3e75\u5fe1\ud12e\u64ab\ub83f\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(-1381514799), ldc:int(-303795307))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\u873d\uff55\u88c5\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-38342153))
            var_5_7D = and:int(ldc:int(-14749), ldc:int(6556))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6441), ldc:int(-6442)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5DD:int, ldc:int(-302171745))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(12808), ldc:int(12809)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-32752), ldc:int(-32751)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_CA:int, ldc:int(-270066863))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(269), ldc:int(4323)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1453694441))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(85285722))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-287829046))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1849512293))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-34649225))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1600686469))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2082287524))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1953385542))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-836408651))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1064339031))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-98639757))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1303809305))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-809606883))
                        var_11_DB = and:int(ldc:int(12803), ldc:int(-12804))
                        goto(Label_1391)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-670630533))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-521112147))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1818479155))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-545024026))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1650031625))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1872112181))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1176384352))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1797190847))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(14098287))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1342210087))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1748310714))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1951536406))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1346387169))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(24), ldc:int(25))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(562841161))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(676670291))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1786299401))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-402288527))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-302761005))
                        var_11_DB = and:int(ldc:int(-27195), ldc:int(27154))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1455822330))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1754147567))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1221975244))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(863045771))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-269540493))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1790977825))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-778866963))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1167455564))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(492921423))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-789493178))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(2087868435))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1918043297))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1391)
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1371475925))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(909613291))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-957789030))
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1078568973))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1391:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1926648363))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(389002337))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1342392358))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-117792535))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1645304965))
                        var_17_5E8 = add:int(var_16_109:int, xor:int(ldc:int(516), ldc:int(517)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(-574742217))
                
                if (cmple:boolean(var_5_7D = var_17_5E8:int, sub:int(var_6_84:int, and:int(ldc:int(19331), ldc:int(13))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
