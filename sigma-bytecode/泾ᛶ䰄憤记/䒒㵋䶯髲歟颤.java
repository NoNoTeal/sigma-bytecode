public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4 {
    public boolean \uae87\ubff1\uc246\ub113\uc4d2\ufcaf() {
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
            return:boolean(getfield:boolean(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u6c56\uc9f6\u5654\u183a\uf94d\ucfaf, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u392e\u7330\u4f52\u99f7\u7043\u647c p1) {
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
            putfield:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u8aa5\u960f\u8753\u97e6\uc238\u0800, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4, p0:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258)
            invokespecial:Object(Object::<init>, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4)
            putfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4, p1:\u392e\u7330\u4f52\u99f7\u7043\u647c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8df4\u97b7\ud217\u4e72\u8389\u6fb0(java.util.function.Consumer<\u56bd\u8413\u647c\u5bc4\ud158.\u392e\u7330\u4f52\u99f7\u7043\u647c> p0) {
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
    
    public void \uf995\u5bc4\u56bd\u4ab3\u8308\u7bad() {
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
            putfield:boolean(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u6c56\uc9f6\u5654\u183a\uf94d\ucfaf, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4, xor:int[expected:boolean](ldc:int(132), ldc:int(133)))
            invokevirtual:void(\u0b8e\u8709\u40a9\ud217\u960f\u99f7::\uf9c5\u7873\u3d4b\u8cae\u9af2\u6c56, invokestatic:\u0b8e\u8709\u40a9\ud217\u960f\u99f7(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\u8753\u7c6b\ud523\ua562\u8413\u12b2, getfield:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u8aa5\u960f\u8753\u97e6\uc238\u0800, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4)), getfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
            putfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4, aconstnull:\u392e\u7330\u4f52\u99f7\u7043\u647c())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3a62\u600f\uc910\u6198\ufcaf\u8d90$0(java.util.function.Consumer p0) {
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
            
            if (cmpne:boolean(getfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4), aconstnull:\u392e\u7330\u4f52\u99f7\u7043\u647c())) {
                invokeinterface:void(Consumer<\u392e\u7330\u4f52\u99f7\u7043\u647c>::accept, p0:Consumer<\u392e\u7330\u4f52\u99f7\u7043\u647c>, getfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u392e\u7330\u4f52\u99f7\u7043\u647c \u183a\u392e\ubf56\u3bc9\u69d9\uf94d(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4 p0) {
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
            return:\u392e\u7330\u4f52\u99f7\u7043\u647c(getfield:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u3504\u3bc9\u3711\u183a\u527a\uff55, p0:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
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
    
    public void \u92ff\ud36e\uae5d\u9937\u6bb9\u8308(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(-1586099078), ldc:int(-1690580520))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1061000724))
        }
        else {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1539275834))
            var_5_85 = and:int(ldc:int(-15909), ldc:int(14884))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12911), ldc:int(12334)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FC:int, ldc:int(1672617343))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32766), ldc:int(-32765)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(859), ldc:int(17409)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_D2:int, ldc:int(1471860094))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-31424), ldc:int(-31423)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(12832331))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-173849537))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(163438866))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1122736550))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1161517757))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1382159135))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-978913170))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2088725760))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-461083111))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1054116540))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1102936434))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1305066016))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-210069415))
                        var_11_E3 = and:int(ldc:int(-13195), ldc:int(12682))
                        goto(Label_1399)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(155284546))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1484926765))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(843518493))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(494905659))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-828122190))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1285006479))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2103621278))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1390387183))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1791870019))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(690012084))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1960911628))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-689639887))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1702020996))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1945690889))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-310678693))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(2317), ldc:int(1153))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1132940033))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(883639221))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(208624894))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(416785602))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-747397443))
                        var_11_E3 = and:int(ldc:int(-18500), ldc:int(18499))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1780707724))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(534414099))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1999394976))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-524855587))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-339828769))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-368690828))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(27428934))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(573383804))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(154836505))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1399)
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-889947844))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1717170060))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2068730128))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1334904389))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1912631590))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1629949828))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2137323659))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1342726465))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-2069358543))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1987698062))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(259135996))
                        var_17_607 = add:int(var_16_111:int, and:int(ldc:int(17411), ldc:int(12385)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(99104753))
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(1103080126))
                
                if (cmple:boolean(var_5_85 = var_17_607:int, sub:int(var_6_8C:int, and:int(ldc:int(9), ldc:int(12547))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
