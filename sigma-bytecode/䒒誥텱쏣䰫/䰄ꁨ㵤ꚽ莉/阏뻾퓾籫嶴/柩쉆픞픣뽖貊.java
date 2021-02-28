public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u67e9\uc246\ud51e\ud523\ubf56\u8c8a {
    public void \u67e9\uc246\ud51e\ud523\ubf56\u8c8a(boolean p0, double p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p2, java.util.function.Predicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> p3) {
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
            invokespecial:Object(Object::<init>, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a)
            putfield:boolean(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\u97b7\ub18d\u5f50\u647c\uc246\u8aa5, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a, p0:boolean)
            putfield:double(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\ub8be\u527a\uc31c\ub171\u12cb\u92ee, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a, p1:double)
            putfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\u16f6\u839e\ub70c\u67d0\u74b1\u97b7, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a, p2:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)
            putfield:Predicate<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\ub70c\ub1b9\ubefe\u61a4\ucef1\u836c, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a, p3:Predicate<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\uc246\ud51e\ud523\ubf56\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
    
    public boolean \u99f7\u8d98\u1187\ua6bd\u6c56\ud158(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 p0) {
        var_2_5F : int
        stack_87_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(951743314), ldc:int(969142811))
            
            if (cmpne:boolean(getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\u16f6\u839e\ub70c\u67d0\u74b1\u97b7, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a), p0:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1106544298))
                stack_87_0 = and:int(ldc:int(8333), ldc:int(-12430))
            }
            else {
                stack_87_0 = and:int(ldc:int(22529), ldc:int(9285))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d64\u516c\u4179\u4492\u4e72\uc2bd(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec p1) {
        var_3_5F : int
        stack_9E_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-2052215587), ldc:int(-234246403))
            
            if (logicaland:boolean(invokeinterface:boolean(Predicate<\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec>::test, getfield:Predicate<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\ub70c\ub1b9\ubefe\u61a4\ucef1\u836c, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a), p1:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec), logicalnot:boolean(invokevirtual:boolean(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\ub70c\u4179\u759a\u7006\u61a4\u3d4b, invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, p0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), p1:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f])))) {
                stack_9E_0 = xor:int(ldc:int(4097), ldc:int(4096))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1278243649))
                stack_9E_0 = and:int(ldc:int(-10878), ldc:int(8825))
            }
            
            return:boolean(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u69d9\u527a\u64ab\ub19c\ud171\u67d0() {
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
            return:boolean(getfield:boolean(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\u97b7\ub18d\u5f50\u647c\uc246\u8aa5, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5245\u74b1\u8640\u52d3\u494c\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, boolean p2) {
        var_4_61 : int
        stack_9F_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(1389543840), ldc:int(-1702926917))
            
            if (cmple:boolean(getfield:double(\u67e9\uc246\ud51e\ud523\ubf56\u8c8a::\ub8be\u527a\uc31c\ub171\u12cb\u92ee, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a), sub:double(add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, p0:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u385b\ub83f\u47c2\u5245\u7c6b\uc31c))), ldc:double(9.999999747378752E-6)))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-226592527))
                stack_9F_0 = and:int(ldc:int(19113), ldc:int(-20218))
            }
            else {
                stack_9F_0 = and:int(ldc:int(28833), ldc:int(9))
            }
            
            return:boolean(stack_9F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c56\u5140\ud158\u88c5\u4c2b\uc9f6$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(21690), ldc:int(-21691)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5654\ubff1\u5fe1\u0a06\u6198\u71f1$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-27992), ldc:int(19719)))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u416d\u36d3\u34df\u93a2\u59ec\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_678 : int
        
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
        var_3_66D = and:int(ldc:int(-2126238316), ldc:int(-1445511777))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\uc246\ud51e\ud523\ubf56\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(-447692806))
            var_5_7D = and:int(ldc:int(177), ldc:int(-178))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22320), ldc:int(-24379)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_66D:int, ldc:int(-1049511493))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(4355), ldc:int(16921)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(18441), ldc:int(18440)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_66D = and:int(var_3_D2:int, ldc:int(-1684476994))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1027), ldc:int(4193)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(470772494))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1697493612))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2105427527))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(350472465))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1919237531))
                    }
                    else {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(333298617))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1536705823))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1797688108))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(218687017))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1322352127))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1225593495))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1157530658))
                        var_11_E3 = and:int(ldc:int(-32007), ldc:int(27910))
                        goto(Label_1524)
                    }
                    
                    Label_0584:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2031622170))
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(196366383))
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-279819740))
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1449341587))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1380897800))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0837)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1235306323))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1708819459))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1163314818))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(680004834))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2117324807))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0837:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(336508856))
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1577795981))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1743874195))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-646596151))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(261128094))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(5120), ldc:int(5121))
                                goto(Label_1119)
                            }
                        }
                    }
                    
                    Label_0960:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-31574764))
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1234982255))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1895485569))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-999950309))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1913540616))
                        var_11_E3 = and:int(ldc:int(-12632), ldc:int(4439))
                    }
                    
                    Label_1119:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1956612642))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0960)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1843345244))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(536992087))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-2030823572))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(55573456))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1243:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1012923202))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1119)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1978348544))
                            goto(Label_0960)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0837)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(408174678))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(2007865633))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-954468599))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1946053533))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1524)
                    }
                    
                    Label_1388:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1944493400))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(733231472))
                        goto(Label_1119)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0837)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1045936585))
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-565683691))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66D = and:int(var_3_66D:int, ldc:int(-705398382))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1524:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_678 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1535:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(268924862))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1119)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-885071854))
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1980251786))
                        goto(Label_0837)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1462096652))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(393736146))
                        var_17_678 = add:int(var_16_111:int, and:int(ldc:int(4645), ldc:int(193)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66D = and:int(var_3_66D:int, ldc:int(-172312140))
                
                if (cmple:boolean(var_5_7D = var_17_678:int, sub:int(var_6_84:int, and:int(ldc:int(449), ldc:int(11787))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(256)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(-689563529))
            goto(Label_0106)
        }
    }
}
