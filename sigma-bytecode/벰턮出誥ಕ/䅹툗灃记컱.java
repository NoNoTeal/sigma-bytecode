public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 {
    private void \u4179\ud217\u7043\u8bb0\ucef1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4bc8\uf9c5\u6b5f\u7006\ub171 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8[] p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] p2) {
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
            invokespecial:Object(Object::<init>, this:\u4179\ud217\u7043\u8bb0\ucef1)
            putfield:\u4bc8\uf9c5\u6b5f\u7006\ub171(\u4179\ud217\u7043\u8bb0\ucef1::\uc7fe\u718f\u8aa5\u62da\ucb79\u64f2, this:\u4179\ud217\u7043\u8bb0\ucef1, p0:\u4bc8\uf9c5\u6b5f\u7006\ub171)
            putfield:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u4179\ud217\u7043\u8bb0\ucef1::\u5fe1\u759a\uae87\u8753\ua562\u839e, this:\u4179\ud217\u7043\u8bb0\ucef1, p1:\u92ee\u8d90\u5f50\uf94d\ud7e8[])
            putfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u4179\ud217\u7043\u8bb0\ucef1::\u16f6\uc3e3\u873d\u4f4a\u8640\u4179, this:\u4179\ud217\u7043\u8bb0\ucef1, p2:\uf9c5\u7d52\u839e\u16f6\u4492[])
            putfield:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u4179\ud217\u7043\u8bb0\ucef1::\u3dd3\ub171\u392e\u3d4b\u718f\u7049, this:\u4179\ud217\u7043\u8bb0\ucef1, invokestatic:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u16f6\ub102\u6435\u0800\u3d4b::\u5bc4\u965f\u965f\u3d4b\u392e\uff55, p2:\uf9c5\u7d52\u839e\u16f6\u4492[][expected:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u47c2\u51fa\u2dcc\ub1b9\u34df\u0a06(java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0) {
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
    
    public void \u9937\u5140\u4c2b\u946b\u7c6b\u6ec6(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p0, java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1) {
        var_3_5F : int
        var_5_90 : Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_6_96 : \u92ee\u8d90\u5f50\uf94d\ud7e8[]
        var_7_9B : int
        var_8_A4 : int
        
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
            var_3_5F = and:int(ldc:int(584980583), ldc:int(1390263527))
            
            if (logicalnot:boolean(invokevirtual:boolean(\uf9c5\u7043\u0c95\u76bc\u8389::\ub102\u9255\u7ce1\u4ab3\uc2bd\u4f4a, p0:\uf9c5\u7043\u0c95\u76bc\u8389, this:\u4179\ud217\u7043\u8bb0\ucef1))) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u4179\ud217\u7043\u8bb0\ucef1::\u67e9\u4492\ufcaf\ubefe\u5140\ud4fe), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), and:int(ldc:int(-22233), ldc:int(18136))))
            }
            else {
                var_5_90 = invokestatic:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\uf9c5\u7d52\u839e\u16f6\u4492::\u8413\u6ec6\u927d\u61a4\u71f1\uc87f, getfield:BiFunction<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, \uf9c5\u7043\u0c95\u76bc\u8389, \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u4179\ud217\u7043\u8bb0\ucef1::\u3dd3\ub171\u392e\u3d4b\u718f\u7049, this:\u4179\ud217\u7043\u8bb0\ucef1), p1:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p0:\uf9c5\u7043\u0c95\u76bc\u8389)
                var_6_96 = getfield:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u4179\ud217\u7043\u8bb0\ucef1::\u5fe1\u759a\uae87\u8753\ua562\u839e, this:\u4179\ud217\u7043\u8bb0\ucef1)
                var_7_9B = arraylength:int(var_6_96:\u92ee\u8d90\u5f50\uf94d\ud7e8[])
                var_8_A4 = and:int(ldc:int(20022), ldc:int(-28472))
                
                loop {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1680818241))
                    
                    if (cmpge:boolean(var_8_A4:int, var_7_9B:int)) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u5db4\u6d69\u6d99\u71f1\u3d64\u74b1, loadelement:\u92ee\u8d90\u5f50\uf94d\ud7e8(var_6_96:\u92ee\u8d90\u5f50\uf94d\ud7e8[], var_8_A4:int), var_5_90:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p0:\uf9c5\u7043\u0c95\u76bc\u8389)
                    inc:int(var_8_A4, ldc:int(1))
                }
                
                invokevirtual:void(\uf9c5\u7043\u0c95\u76bc\u8389::\u71ae\u3711\u8709\u760c\ub83f\u64ab, p0:\uf9c5\u7043\u0c95\u76bc\u8389, this:\u4179\ud217\u7043\u8bb0\ucef1)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\uc246\u3bc9\ua61f\uae87\u5654(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p0, java.util.function.Consumer<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1) {
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
            invokevirtual:void(\u4179\ud217\u7043\u8bb0\ucef1::\u9937\u5140\u4c2b\u946b\u7c6b\u6ec6, this:\u4179\ud217\u7043\u8bb0\ucef1, p0:\uf9c5\u7043\u0c95\u76bc\u8389, invokestatic:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u4179\ud217\u7043\u8bb0\ucef1::\u47c2\u51fa\u2dcc\ub1b9\u34df\u0a06, p1:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u6d69\uc246\u3bc9\ua61f\uae87\u5654(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p0) {
        var_4_63 : ArrayList
        
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
            var_4_63 = invokestatic:ArrayList(Lists::newArrayList)
            invokevirtual:void(\u4179\ud217\u7043\u8bb0\ucef1::\u6d69\uc246\u3bc9\ua61f\uae87\u5654, this:\u4179\ud217\u7043\u8bb0\ucef1, p0:\uf9c5\u7043\u0c95\u76bc\u8389, invokedynamic:Consumer<Object>(accept:(Ljava/util/List;)Ljava/util/function/Consumer;, var_4_63:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            return:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(var_4_63:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4bc8\uf9c5\u6b5f\u7006\ub171 \u8d90\u6cfe\u16f6\ucb79\u3504\u1833() {
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
            return:\u4bc8\uf9c5\u6b5f\u7006\ub171(getfield:\u4bc8\uf9c5\u6b5f\u7006\ub171(\u4179\ud217\u7043\u8bb0\ucef1::\uc7fe\u718f\u8aa5\u62da\ucb79\u64f2, this:\u4179\ud217\u7043\u8bb0\ucef1))
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\uff55\ud171\ufcaf\u6435\ub1b9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4f4a\uafe7\u64ab\uf995\u99f7 p0) {
        var_2_5F : int
        var_4_67 : int
        var_4_9A : int
        
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
            var_2_5F = and:int(ldc:int(1829594955), ldc:int(189627166))
            var_4_67 = and:int(ldc:int(-28171), ldc:int(28170))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-350259271))
                    
                    if (cmplt:boolean(var_4_67:int, arraylength:int(getfield:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u4179\ud217\u7043\u8bb0\ucef1::\u5fe1\u759a\uae87\u8753\ua562\u839e, this:\u4179\ud217\u7043\u8bb0\ucef1)))) {
                        invokevirtual:void(\u92ee\u8d90\u5f50\uf94d\ud7e8::\u76bc\uf9c5\ud4fe\u7043\u8d90\u4f4a, loadelement:\u92ee\u8d90\u5f50\uf94d\ud7e8(getfield:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u4179\ud217\u7043\u8bb0\ucef1::\u5fe1\u759a\uae87\u8753\ua562\u839e, this:\u4179\ud217\u7043\u8bb0\ucef1), var_4_67:int), invokevirtual:\u4f4a\uafe7\u64ab\uf995\u99f7(\u4f4a\uafe7\u64ab\uf995\u99f7::\u97e6\u40a9\u71f1\u9255\u51b2\u71ae, p0:\u4f4a\uafe7\u64ab\uf995\u99f7, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), and:int(ldc:int(21637), ldc:int(809)))), var_4_67:int), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), xor:int(ldc:int(261), ldc:int(263)))))))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-665666284))
            }
            
            var_4_9A = and:int(ldc:int(21767), ldc:int(-21800))
            
            while (cmplt:boolean(var_4_9A:int, arraylength:int(getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u4179\ud217\u7043\u8bb0\ucef1::\u16f6\uc3e3\u873d\u4f4a\u8640\u4179, this:\u4179\ud217\u7043\u8bb0\ucef1)))) {
                invokeinterface:void(\u6435\u3e2a\u120d\u494c\u5d20::\u6bb9\u6cfe\uc29a\u5f50\u7af6\u61a4, loadelement:\uf9c5\u7d52\u839e\u16f6\u4492(getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u4179\ud217\u7043\u8bb0\ucef1::\u16f6\uc3e3\u873d\u4f4a\u8640\u4179, this:\u4179\ud217\u7043\u8bb0\ucef1), var_4_9A:int), invokevirtual:\u4f4a\uafe7\u64ab\uf995\u99f7(\u4f4a\uafe7\u64ab\uf995\u99f7::\u97e6\u40a9\u71f1\u9255\u51b2\u71ae, p0:\u4f4a\uafe7\u64ab\uf995\u99f7, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), and:int(ldc:int(17923), ldc:int(10247)))), var_4_9A:int), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), and:int(ldc:int(643), ldc:int(4186)))))))
                inc:int(var_4_9A, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f52\u4ab3\u4f4a\u56bd\u647c\ubb2b(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p1) {
        var_3_FF : int
        var_5_65 : List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_6_6B : Random
        var_7_74 : List<Integer>
        var_8_8C : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_9_C7 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_3_108 : int
        
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
        var_3_FF = and:int(ldc:int(2117386090), ldc:int(-13176846))
        var_5_65 = invokevirtual:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u4179\ud217\u7043\u8bb0\ucef1::\u6d69\uc246\u3bc9\ua61f\uae87\u5654, this:\u4179\ud217\u7043\u8bb0\ucef1, p1:\uf9c5\u7043\u0c95\u76bc\u8389)
        var_6_6B = invokevirtual:Random(\uf9c5\u7043\u0c95\u76bc\u8389::\u647c\u647c\ucb79\ub171\u8bb0\u760c, p1:\uf9c5\u7043\u0c95\u76bc\u8389)
        var_7_74 = invokespecial:List<Integer>(\u4179\ud217\u7043\u8bb0\ucef1::\u7006\u873d\u40a9\ud171\ucef1\u4daf, this:\u4179\ud217\u7043\u8bb0\ucef1, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, var_6_6B:Random)
        invokespecial:void(\u4179\ud217\u7043\u8bb0\ucef1::\uae5d\u8389\u3bd6\u7006\u51b2\uc4d2, this:\u4179\ud217\u7043\u8bb0\ucef1, var_5_65:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, invokeinterface:int(List::size, var_7_74:List<Integer>), var_6_6B:Random)
        var_8_8C = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, var_5_65:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
        
        loop {
            if (cmpne:boolean(and:int(var_3_FF:int, ldc:int(33554432)), ldc:int(0))) {
                var_3_FF = and:int(var_3_FF:int, ldc:int(1391325167))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_8C:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)) {
                    var_9_C7 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_8_8C:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, var_7_74:List<Integer>))) {
                        loop {
                            if (cmpeq:boolean(and:int(var_3_FF:int, ldc:int(2048)), ldc:int(0))) {
                                var_3_108 = and:int(var_3_FF:int, ldc:int(-115298931))
                            }
                            else {
                                var_3_108 = and:int(var_3_FF:int, ldc:int(-684261386))
                                
                                if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_9_C7:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                                    invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(List<Integer>::remove, var_7_74:List<Integer>, sub:int(invokeinterface:int(List<E>::size, var_7_74:List<Integer>), and:int(ldc:int(1), ldc:int(10369)))))), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                                    looporswitchbreak()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_3_108:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_3_108 = and:int(var_3_108:int, ldc:int(1920397310))
                                invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(List<Integer>::remove, var_7_74:List<Integer>, sub:int(invokeinterface:int(List<E>::size, var_7_74:List<Integer>), xor:int(ldc:int(4166), ldc:int(4167)))))), var_9_C7:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                looporswitchbreak()
                            }
                            
                            var_3_FF = and:int(var_3_108:int, ldc:int(-921604460))
                        }
                        
                        var_3_FF = and:int(var_3_108:int, ldc:int(-147193886))
                        loopcontinue()
                    }
                    
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4179\ud217\u7043\u8bb0\ucef1::\u67e9\u4492\ufcaf\ubefe\u5140\ud4fe), loadelement:String(getstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179), xor:int(ldc:int(4355), ldc:int(4359))))
                    return:void()
                }
            }
            
            if (cmpeq:boolean(and:int(var_3_FF:int, ldc:int(4)), ldc:int(0))) {
                return:void()
            }
            
            var_3_FF = and:int(var_3_FF:int, ldc:int(1308094762))
        }
    }
    
    private void \uae5d\u8389\u3bd6\u7006\u51b2\uc4d2(java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p0, int p1, java.util.Random p2) {
        var_4_284 : int
        var_6_68 : ArrayList
        var_7_70 : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_8_110 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_8_1AC : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_10_1CF : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_4_284 = and:int(ldc:int(1271444973), ldc:int(1607464937))
            var_6_68 = invokestatic:ArrayList(Lists::newArrayList)
            var_7_70 = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            
            loop {
                Label_0114:
                
                if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(128)), ldc:int(0))) {
                    var_4_284 = and:int(var_4_284:int, ldc:int(1290573503))
                    goto(Label_0217)
                }
                
                if (cmpne:boolean(and:int(var_4_284:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_284 = and:int(var_4_284:int, ldc:int(-378667783))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_70:Iterator)) {
                        var_8_110 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_7_70:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                        
                        if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_8_110:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                            invokeinterface:void(Iterator::remove, var_7_70:Iterator)
                            goto(Label_0314)
                        }
                        
                        Label_0282:
                        
                        if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(536870912)), ldc:int(0))) {
                            var_4_284 = and:int(var_4_284:int, ldc:int(-268765703))
                            
                            if (cmpgt:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_8_110:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), and:int(ldc:int(33), ldc:int(11975)))) {
                                invokeinterface:boolean(List<? extends \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_6_68:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<? extends \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_8_110:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[expected:? extends \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56])
                                invokeinterface:void(Iterator<E>::remove, var_7_70:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
                            }
                        }
                        
                        Label_0314:
                        
                        if (cmpne:boolean(and:int(var_4_284:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_4_284 = and:int(var_4_284:int, ldc:int(-372703771))
                            loopcontinue()
                        }
                        
                        goto(Label_0282)
                    }
                }
                
                Label_0161:
                
                while (cmpne:boolean(and:int(var_4_284:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue(Label_0114)
                    }
                    
                    var_4_284 = and:int(var_4_284:int, ldc:int(-303431987))
                    
                    if (cmple:boolean(sub:int(sub:int(p1:int, invokeinterface:int(List<E>::size, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)), invokeinterface:int(List<E>::size, var_6_68:ArrayList<Object>[expected:List<Object>])), ldc:int(0))) {
                        goto(Label_0217)
                    }
                    
                    if (invokeinterface:boolean(List<E>::isEmpty, var_6_68:ArrayList<Object>)) {
                        goto(Label_0217)
                    }
                    
                    var_8_1AC = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::remove, var_6_68:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p2:Random, and:int(ldc:int(4953), ldc:int(-4958)), sub:int(invokeinterface:int(List<E>::size, var_6_68:ArrayList<Object>[expected:List<Object>]), and:int(ldc:int(513), ldc:int(14341))))))
                    var_10_1CF = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6c56\u759a\u93a2\u647c\u927d\u3dd3, var_8_1AC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u446c\u8aa5\ufcaf\u99f7\u6bb9\ub113, p2:Random, xor:int(ldc:int(-32637), ldc:int(-32638)), div:int(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_8_1AC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), and:int(ldc:int(13330), ldc:int(135)))))
                    
                    if (cmpgt:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_8_1AC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), and:int(ldc:int(10249), ldc:int(529)))) {
                        if (invokevirtual:boolean(Random::nextBoolean, p2:Random)) {
                            invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_6_68:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_8_1AC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                            goto(Label_0568)
                        }
                    }
                    
                    Label_0480:
                    
                    if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(16777216)), ldc:int(0))) {
                        var_4_284 = and:int(var_4_284:int, ldc:int(904156000))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(64)), ldc:int(0))) {
                        var_4_284 = and:int(var_4_284:int, ldc:int(-538029144))
                    }
                    else {
                        var_4_284 = and:int(var_4_284:int, ldc:int(2069888215))
                        invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_8_1AC:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_4_284:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_4_284:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0480)
                        }
                        
                        var_4_284 = and:int(var_4_284:int, ldc:int(-305466155))
                        
                        if (cmpgt:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_10_1CF:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), xor:int(ldc:int(4128), ldc:int(4129)))) {
                            if (invokevirtual:boolean(Random::nextBoolean, p2:Random)) {
                                invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_6_68:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_10_1CF:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                goto(Label_0686)
                            }
                        }
                    }
                    
                    Label_0609:
                    
                    if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(16777216)), ldc:int(0))) {
                        var_4_284 = and:int(var_4_284:int, ldc:int(-844998809))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_284:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0480)
                    }
                    
                    var_4_284 = and:int(var_4_284:int, ldc:int(1776991959))
                    invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_10_1CF:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    Label_0686:
                    var_4_284 = and:int(var_4_284:int, ldc:int(1232911591))
                }
                
                var_4_284 = and:int(var_4_284:int, ldc:int(1964057996))
                Label_0217:
                
                if (cmpeq:boolean(and:int(var_4_284:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0161)
                }
                
                if (cmpne:boolean(and:int(var_4_284:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::addAll, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_6_68:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:Collection<? extends \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
            invokestatic:void(Collections::shuffle, p0:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:Random)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.List<java.lang.Integer> \u7006\u873d\u40a9\ud171\ucef1\u4daf(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0, java.util.Random p1) {
        var_3_61 : int
        var_5_65 : ArrayList
        var_6_6E : int
        
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
            var_3_61 = and:int(ldc:int(-2051935173), ldc:int(598603755))
            var_5_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_6E = and:int(ldc:int(13516), ldc:int(-15600))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(1642460815))
                    
                    if (cmplt:boolean(var_6_6E:int, invokeinterface:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, p0:\ua61f\uae87\u6b5f\uc31c\ud12e))) {
                        if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ua61f\uae87\u6b5f\uc31c\ud12e::\u72f1\ubefe\u34df\u51b2\u4daf\u6bb9, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, var_6_6E:int))) {
                            invokeinterface:boolean(List<Integer>::add, var_5_65:ArrayList<Integer>[expected:List<Integer>], invokestatic:Integer(Integer::valueOf, var_6_6E:int))
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(938538283))
                        inc:int(var_6_6E, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokestatic:void(Collections::shuffle, var_5_65:ArrayList<Integer>[expected:List<?>], p1:Random)
            return:List<Integer>(var_5_65:ArrayList<Integer>)
        }
        
        goto(Label_0006)
    }
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\u2dcc\u873d\ubff1\u8df4\u183a \ub7dc\uc2bd\u67d0\u4492\u927d\u836c() {
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
            return:\u2dcc\u873d\ubff1\u8df4\u183a(initobject:\u2dcc\u873d\ubff1\u8df4\u183a(\u2dcc\u873d\ubff1\u8df4\u183a::<init>))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubb2b\u8709\ud523\u7af6\u527a\ua562$0(java.util.function.Consumer p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
        var_2_61 : int
        var_4_77 : int
        var_5_A2 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_2_61 = and:int(ldc:int(467870563), ldc:int(-1142744473))
            
            if (cmpge:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u5140\u6cfe\u5bc4\u4f52\u4cd9\uc87f, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(536791035))
                var_4_77 = invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                
                while (cmpgt:boolean(var_4_77:int, ldc:int(0))) {
                    var_5_A2 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc4d2\uc29a\uf94d\u6bb9\u97e6\u5d20, var_5_A2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, invokestatic:int(Math::min, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u5140\u6cfe\u5bc4\u4f52\u4cd9\uc87f, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), var_4_77:int))
                    var_4_77 = sub:int(var_4_77:int, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_5_A2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                    invokeinterface:void(Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::accept, p0:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_5_A2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                }
            }
            else {
                invokeinterface:void(Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::accept, p0:Consumer<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4179\ud217\u7043\u8bb0\ucef1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4bc8\uf9c5\u6b5f\u7006\ub171 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8[] p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] p2, \u56bd\u8413\u647c\u5bc4\ud158.\u6c56\ud12e\u839e\ub8be\u5d20 p3) {
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
            invokespecial:\u4179\ud217\u7043\u8bb0\ucef1(\u4179\ud217\u7043\u8bb0\ucef1::<init>, this:\u4179\ud217\u7043\u8bb0\ucef1, p0:\u4bc8\uf9c5\u6b5f\u7006\ub171, p1:\u92ee\u8d90\u5f50\uf94d\ud7e8[], p2:\uf9c5\u7d52\u839e\u16f6\u4492[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4bc8\uf9c5\u6b5f\u7006\ub171 \u8d98\u8d90\ucb79\u76bc\ub113\ub171(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 p0) {
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
            return:\u4bc8\uf9c5\u6b5f\u7006\ub171(getfield:\u4bc8\uf9c5\u6b5f\u7006\ub171(\u4179\ud217\u7043\u8bb0\ucef1::\uc7fe\u718f\u8aa5\u62da\ucb79\u64f2, p0:\u4179\ud217\u7043\u8bb0\ucef1))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u3504\ub113\u74b1\u12b2\u7873\ub83f() {
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
            return:Logger(getstatic:Logger(\u4179\ud217\u7043\u8bb0\ucef1::\u67e9\u4492\ufcaf\ubefe\u5140\ud4fe))
        }
        
        goto(Label_0006)
    }
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8[] \u4c2b\u0c95\u34df\u927d\ub1b9\uc229(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 p0) {
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
            return:\u92ee\u8d90\u5f50\uf94d\ud7e8[](getfield:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u4179\ud217\u7043\u8bb0\ucef1::\u5fe1\u759a\uae87\u8753\ua562\u839e, p0:\u4179\ud217\u7043\u8bb0\ucef1))
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492[] \u16f6\ub7dc\u1187\u5245\u0b8e\u6b0d(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4179\ud217\u7043\u8bb0\ucef1 p0) {
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
            return:\uf9c5\u7d52\u839e\u16f6\u4492[](getfield:\uf9c5\u7d52\u839e\u16f6\u4492[](\u4179\ud217\u7043\u8bb0\ucef1::\u16f6\uc3e3\u873d\u4f4a\u8640\u4179, p0:\u4179\ud217\u7043\u8bb0\ucef1))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_229 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_135_0 : byte[] [generated]
        stack_23C_0 : byte[] [generated]
        stack_277_0 : byte[] [generated]
        stack_2DD_0 : byte[] [generated]
        stack_35B_0 : byte[] [generated]
        var_4_214 : int
        var_3_219 : byte[]
        var_5_21A : int
        var_0_2F7 : int
        expr_2DD : byte [generated]
        stack_326_2 : byte [generated]
        stack_2FA_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_265 : byte[]
        var_5_266 : int
        expr_D9 : int [generated]
        expr_109 : int [generated]
        var_3_349 : byte[]
        var_5_34A : int
        expr_35E : byte [generated]
        var_3_141 : String
        stack_1E0_0 : String[] [generated]
        expr_153 : String[] [generated]
        
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
        var_0_229 = and:int(ldc:int(1899231580), ldc:int(1848113148))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_135_0 = stack_23C_0 = stack_277_0 = stack_2DD_0 = stack_35B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("En9RlBPuWsOv0ReuvVrake+V7+QQFUKRl9LQYBJsUkCSkVUsENBTwRQikmwR75NSFqBTV+zQE9UfkpFBUn/XLNJTVlGXUVJCU1BjL6KQUlCRFcsIyA7E")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_214 = expr_6E:int
        var_3_219 = newarray:byte[](byte.class, expr_6E:int)
        var_5_21A = expr_6E:int
        Label_0540:
        
        while (cmpne:boolean(and:int(var_0_229:int, ldc:int(16384)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(1933006820))
            var_5_21A = add:int(var_5_21A:int, ldc:int(-1))
            storeelement:byte(var_3_219:byte[], var_5_21A:int, xor:byte(loadelement:byte(stack_23C_0:byte[], var_5_21A:int), ldc:byte(16)))
            
            if (cmpne:boolean(var_5_21A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_135_0 = stack_23C_0 = stack_277_0 = stack_2DD_0 = stack_35B_0 = var_3_219:byte[]
            goto(Label_0115)
        }
        
        var_0_229 = and:int(var_0_229:int, ldc:int(786888629))
        Label_0702:
        
        while (cmpeq:boolean(and:int(var_0_229:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_2F7 = and:int(var_0_229:int, ldc:int(1711013870))
            var_5_21A = add:int(var_5_21A:int, ldc:int(-1))
            expr_2DD = stack_326_2 = loadelement(stack_2DD_0, var_5_21A)
            
            if (cmplt:boolean(add:int(add:int(var_5_21A:int, ldc:int(5)), neg:int(var_4_214:int)), ldc:int(0))) {
                stack_326_2 = stack_2FA_0 = add:byte(expr_2DD:byte, loadelement:byte(var_3_219:byte[], add:int(var_5_21A:int, ldc:int(5))))
                goto(Label_0778)
            }
            
            Label_0746:
            
            if (cmpne:boolean(and:int(var_0_2F7:int, ldc:int(4096)), ldc:int(0))) {
                var_0_2F7 = and:int(var_0_2F7:int, ldc:int(1954247154))
                stack_326_2 = stack_2FA_0 = add:byte(expr_2DD:byte, ldc:byte(5))
            }
            
            Label_0778:
            
            if (cmpeq:boolean(and:int(var_0_2F7:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_2F7 = and:int(var_0_2F7:int, ldc:int(-303821670))
                goto(Label_0746)
            }
            
            var_0_229 = and:int(var_0_2F7:int, ldc:int(1647038847))
            storeelement:byte(var_3_219:byte[], var_5_21A:int, stack_326_2:byte)
            
            if (cmpne:boolean(var_5_21A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_135_0 = stack_23C_0 = stack_277_0 = stack_2DD_0 = stack_35B_0 = var_3_219:byte[]
            goto(Label_0222)
        }
        
        var_0_229 = and:int(var_0_229:int, ldc:int(-2115275202))
        goto(Label_0540)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(4096)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(1374300824))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(1024)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(1822030006))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(262144)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(2126205821))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_265 = newarray:byte[](byte.class, expr_A9:int)
                var_5_266 = expr_A9:int
                
                loop {
                    var_0_229 = and:int(var_0_229:int, ldc:int(-185379360))
                    var_5_266 = add:int(var_5_266:int, ldc:int(-1))
                    storeelement:byte(var_3_265:byte[], var_5_266:int, add:int(shl:int(loadelement:byte(stack_277_0:byte[], var_5_266:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_266:int, xor:int(ldc:int(258), ldc:int(259)))), ldc:int(2)), and:int(ldc:int(5439), ldc:int(703)))))
                    
                    if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_135_0 = stack_23C_0 = stack_277_0 = stack_2DD_0 = stack_35B_0 = var_3_265:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(4096)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-1180114503))
        }
        else {
            if (cmpne:boolean(and:int(var_0_229:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_229 = and:int(var_0_229:int, ldc:int(-71862964))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_214 = expr_D9:int
                var_3_219 = newarray:byte[](byte.class, expr_D9:int)
                var_5_21A = expr_D9:int
                goto(Label_0702)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_229:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(64)), ldc:int(0))) {
                var_0_229 = and:int(var_0_229:int, ldc:int(-1401522721))
                goto(Label_0115)
            }
            
            var_0_229 = and:int(var_0_229:int, ldc:int(-48761515))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_349 = newarray:byte[](byte.class, expr_109:int)
                var_5_34A = expr_109:int
                
                loop {
                    var_0_229 = and:int(var_0_229:int, ldc:int(1816383846))
                    var_5_34A = add:int(var_5_34A:int, ldc:int(-1))
                    expr_35E = add:byte(loadelement:byte(stack_35B_0:byte[], var_5_34A:int), ldc:byte(27))
                    storeelement:byte(var_3_349:byte[], var_5_34A:int, or:int(and:int(shl:int(expr_35E:byte, and:int(ldc:int(20517), ldc:int(10374))), ldc:int(-16)), and:int(shr:int(expr_35E:byte[expected:int], and:int(ldc:int(8260), ldc:int(18447))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_34A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_135_0 = stack_23C_0 = stack_277_0 = stack_2DD_0 = stack_35B_0 = var_3_349:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(1)), ldc:int(0))) {
            var_0_229 = and:int(var_0_229:int, ldc:int(-61138228))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_229:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_229:int, ldc:int(64)), ldc:int(0))) {
            var_3_141 = initobject:String(String::<init>, stack_135_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1E0_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9297), ldc:int(9300)))
            expr_153 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21), ldc:int(5)))
            storeelement:String(expr_153:String[], and:int(ldc:int(26699), ldc:int(1047)), invokevirtual:String[expected:String](String::substring, var_3_141:String, and:int(ldc:int(-2067), ldc:int(2066)), xor:int(ldc:int(9), ldc:int(2))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(-32698), ldc:int(-32697)), invokevirtual:String[expected:String](String::substring, var_3_141:String, xor:int(ldc:int(10258), ldc:int(10265)), and:int(ldc:int(19474), ldc:int(278))))
            storeelement:String(expr_153:String[], and:int(ldc:int(5644), ldc:int(-5645)), invokevirtual:String[expected:String](String::substring, var_3_141:String, xor:int(ldc:int(-31217), ldc:int(-31203)), xor:int(ldc:int(8237), ldc:int(8218))))
            storeelement:String(expr_153:String[], and:int(ldc:int(541), ldc:int(16388)), invokevirtual:String[expected:String](String::substring, var_3_141:String, xor:int(ldc:int(4385), ldc:int(4374)), xor:int(ldc:int(-16376), ldc:int(-16291))))
            storeelement:String(expr_153:String[], xor:int(ldc:int(4290), ldc:int(4288)), invokevirtual:String[expected:String](String::substring, var_3_141:String, xor:int(ldc:int(8493), ldc:int(8568)), xor:int(ldc:int(2083), ldc:int(2165))))
            putstatic:String[](\u4179\ud217\u7043\u8bb0\ucef1::\u873d\ub171\u0b8e\u4bc8\u946b\u4179, expr_153:String[])
            putstatic:Logger(\u4179\ud217\u7043\u8bb0\ucef1::\u67e9\u4492\ufcaf\ubefe\u5140\ud4fe, invokestatic:Logger(LogManager::getLogger))
            putstatic:\u4179\ud217\u7043\u8bb0\ucef1(\u4179\ud217\u7043\u8bb0\ucef1::\u9937\u5654\uae87\u8c8a\uf995\ub83f, initobject:\u4179\ud217\u7043\u8bb0\ucef1(\u4179\ud217\u7043\u8bb0\ucef1::<init>, getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\u7d52\u8aa5\u71ae\u416d\ubb2b\u4cd9), newarray:\u92ee\u8d90\u5f50\uf94d\ud7e8[](\u56bd\u8413\u647c\u5bc4\ud158.\u92ee\u8d90\u5f50\uf94d\ud7e8.class, and:int(ldc:int(8765), ldc:int(-8766))), newarray:\uf9c5\u7d52\u839e\u16f6\u4492[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\uf9c5\u7d52\u839e\u16f6\u4492.class, and:int(ldc:int(19025), ldc:int(-19028)))))
            putstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\u4179\ud217\u7043\u8bb0\ucef1::\u0b8e\u5bc4\u76bc\ub113\u99f7\ua562, getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\ufe34\u3776\u98a4\u52d3\u9255\u47c2))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u4c04\u839e\uf9c5\u3bc9\u624e\u3bc9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_675 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_680 : int
        
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
        var_3_675 = and:int(ldc:int(-1824794073), ldc:int(-1813020758))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\ud217\u7043\u8bb0\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
            var_3_675 = and:int(var_3_675:int, ldc:int(-1758504297))
            var_5_81 = and:int(ldc:int(9308), ldc:int(-9309))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-26589), ldc:int(26004)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_675:int, ldc:int(-1089738213))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(8200), ldc:int(8201)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(20579), ldc:int(1041)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_675 = and:int(var_3_D1:int, ldc:int(-1281406249))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(515), ldc:int(19725)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1249413378))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(558183835))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-37414072))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-657563972))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1876210187))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-539230485))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1861523068))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(2059584781))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1141307282))
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1160171913))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-549717246))
                        var_11_E2 = and:int(ldc:int(-4069), ldc:int(4068))
                        goto(Label_1531)
                    }
                    
                    Label_0574:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1911205073))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(464622579))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(253315003))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-2106543704))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(493790590))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1148203161))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1901873987))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1356603024))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(227752070))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1814431702))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1152647466))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0838:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(711371944))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(908718648))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1209054666))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(514), ldc:int(515))
                                goto(Label_1138)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1710661250))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1935483559))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1081335608))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1595357086))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1260615725))
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(512)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-2109443454))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(933911431))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(230154406))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-215225758))
                        var_11_E2 = and:int(ldc:int(-28176), ldc:int(25103))
                    }
                    
                    Label_1138:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1023346853))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1681876628))
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-332467053))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-874615019))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1775527493))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-137639342))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1269:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-710690434))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1671685756))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1138)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1878399815))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(64)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1160430666))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-211031406))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1531)
                    }
                    
                    Label_1404:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-820360319))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(354409931))
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1177843635))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_675 = and:int(var_3_675:int, ldc:int(-67151270))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_680 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(161946982))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-640169198))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-2059727338))
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1153738125))
                        var_17_680 = add:int(var_16_110:int, and:int(ldc:int(983), ldc:int(6145)))
                        looporswitchbreak()
                    }
                    
                    var_3_675 = and:int(var_3_675:int, ldc:int(-872569352))
                }
                
                var_3_675 = and:int(var_3_675:int, ldc:int(-1752470690))
                
                if (cmple:boolean(var_5_81 = var_17_680:int, sub:int(var_6_88:int, and:int(ldc:int(10947), ldc:int(1045))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
