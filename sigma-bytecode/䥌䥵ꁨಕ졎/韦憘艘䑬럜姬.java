public class \u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec {
    public static com.mojang.serialization.Codec<\u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec> \u8aa5\u4d85\uc4d2\uc9f6\ub83f\u12b2(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec> p0) {
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
    
    public void \u97e6\u6198\u8258\u446c\ub7dc\u59ec(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec> p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            invokespecial:Object(Object::<init>, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec)
            putfield:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ubff1\ua61f\u6c56\ub113\u9a18\ud7e8, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub102\u3a62\u6ec6\u51fa\uf995\u8709, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u3e75\uc3e3\uceb8\u88c5\u7c6b(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
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
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:int(\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\ud217\u5d20\u52d3\u92ee\u446c\ube23, getstatic:\ub1b9\uae87\uae5d\ua068\u647c\uc84e<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u7330\u7043\u3776\uc9f6\u74b1\u8df4), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub102\u3a62\u6ec6\u51fa\uf995\u8709, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u52d3\u4f4a\ubded\u527a\u7e3f\u5140() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u64f2\u3e2a\u71ae\ud171\ua068\u120d), invokevirtual:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec))), loadelement:String(getstatic:String[](\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub70c\u67e9\u12cb\u6bb9\u3711\u36d3), and:int(ldc:int(3624), ldc:int(-3689)))), invokestatic:String(\uc2bd\u6435\u3711\u6cfe\u40a9::toString, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub102\u3a62\u6ec6\u51fa\uf995\u8709, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec)))))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec> \u8389\u516c\u6fb0\u52d3\ubb2b\uae5d() {
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
            return:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(getfield:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ubff1\ua61f\u6c56\ub113\u9a18\ud7e8, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u7006\uae87\u9af2\u40a9\ud158\ud7e8() {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub102\u3a62\u6ec6\u51fa\uf995\u8709, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u8df4\u927d\u6ec6\u9937\u0800\uae87$1(\u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub102\u3a62\u6ec6\u51fa\uf995\u8709, p0:\u97e6\u6198\u8258\u446c\ub7dc\u59ec))
        }
        
        goto(Label_0006)
    }
    
    private static \u494c\u4975\ua068\u0c95\uc84e.\u97e6\u6198\u8258\u446c\ub7dc\u59ec lambda$\u4cd9\uafe7\u3776\ua6bd\u4975\u3d4b$0(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1) {
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
            return:\u97e6\u6198\u8258\u446c\ub7dc\u59ec(initobject:\u97e6\u6198\u8258\u446c\ub7dc\u59ec(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::<init>, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_18B_0 : byte[] [generated]
        stack_1CF_0 : byte[] [generated]
        stack_244_0 : byte[] [generated]
        stack_299_0 : byte[] [generated]
        var_4_16E : int
        var_3_173 : byte[]
        var_5_174 : int
        var_0_1C5 : int
        expr_1CF : byte [generated]
        stack_213_2 : byte [generated]
        stack_1F2_0 : byte [generated]
        expr_8E : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_233 : byte[]
        var_5_234 : int
        expr_EE : int [generated]
        var_3_288 : byte[]
        var_5_289 : int
        expr_299 : byte [generated]
        var_3_12A : String
        stack_15D_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(978944422), ldc:int(-769671445))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_18B_0 = stack_1CF_0 = stack_244_0 = stack_299_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Cak=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16E = expr_6B:int
        var_3_173 = newarray:byte[](byte.class, expr_6B:int)
        var_5_174 = expr_6B:int
        Label_0374:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(842499811))
            var_5_174 = add:int(var_5_174:int, ldc:int(-1))
            storeelement:byte(var_3_173:byte[], var_5_174:int, add:byte(loadelement:byte(stack_18B_0:byte[], var_5_174:int), ldc:byte(18)))
            
            if (cmpne:boolean(var_5_174:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_18B_0 = stack_1CF_0 = stack_244_0 = stack_299_0 = var_3_173:byte[]
            goto(Label_0112)
        }
        
        Label_0442:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1C5 = and:int(var_0_5F:int, ldc:int(287175606))
            var_5_174 = add:int(var_5_174:int, ldc:int(-1))
            expr_1CF = stack_213_2 = loadelement(stack_1CF_0, var_5_174)
            
            if (cmplt:boolean(add:int(add:int(var_5_174:int, ldc:int(5)), neg:int(var_4_16E:int)), ldc:int(0))) {
                stack_213_2 = stack_1F2_0 = add:byte(expr_1CF:byte, loadelement:byte(var_3_173:byte[], add:int(var_5_174:int, ldc:int(5))))
                goto(Label_0514)
            }
            
            Label_0476:
            
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(1096792210))
            }
            else {
                var_0_1C5 = and:int(var_0_1C5:int, ldc:int(-1114391106))
                stack_213_2 = stack_1F2_0 = add:byte(expr_1CF:byte, ldc:byte(5))
            }
            
            Label_0514:
            
            if (cmpne:boolean(and:int(var_0_1C5:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0476)
            }
            
            var_0_5F = and:int(var_0_1C5:int, ldc:int(468826155))
            storeelement:byte(var_3_173:byte[], var_5_174:int, stack_213_2:byte)
            
            if (cmpne:boolean(var_5_174:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_18B_0 = stack_1CF_0 = stack_244_0 = stack_299_0 = var_3_173:byte[]
            goto(Label_0147)
        }
        
        goto(Label_0374)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1166044614))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_16E = expr_8E:int
                var_3_173 = newarray:byte[](byte.class, expr_8E:int)
                var_5_174 = expr_8E:int
                goto(Label_0442)
            }
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-680851070))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1385098858))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1442053875))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_233 = newarray:byte[](byte.class, expr_C3:int)
                var_5_234 = expr_C3:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1962126830))
                    var_5_234 = add:int(var_5_234:int, ldc:int(-1))
                    storeelement:byte(var_3_233:byte[], var_5_234:int, add:int(shl:int(loadelement:byte(stack_244_0:byte[], var_5_234:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_234:int, xor:int(ldc:int(-24508), ldc:int(-24507)))), ldc:int(6)), and:int(ldc:int(5131), ldc:int(2839)))))
                    
                    if (cmpne:boolean(var_5_234:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_18B_0 = stack_1CF_0 = stack_244_0 = stack_299_0 = var_3_233:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1843053604))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1138917146))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_288 = newarray:byte[](byte.class, expr_EE:int)
                var_5_289 = expr_EE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-120351505))
                    var_5_289 = add:int(var_5_289:int, ldc:int(-1))
                    expr_299 = loadelement:byte(stack_299_0:byte[], var_5_289:int)
                    storeelement:byte(var_3_288:byte[], var_5_289:int, xor:int(or:int(and:int(shl:int(expr_299:byte, xor:int(ldc:int(10513), ldc:int(10517))), ldc:int(-16)), and:int(shr:int(expr_299:byte[expected:int], xor:int(ldc:int(10375), ldc:int(10371))), ldc:int(15))), ldc:int(24)))
                    
                    if (cmpne:boolean(var_5_289:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_18B_0 = stack_1CF_0 = stack_244_0 = stack_299_0 = var_3_288:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1632588126))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0147)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1460318862))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_15D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2304), ldc:int(2305)))
        expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(773), ldc:int(16417)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(18485), ldc:int(-18486)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(363), ldc:int(-364)), and:int(ldc:int(1825), ldc:int(2061))))
        putstatic:String[](\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\ub70c\u67e9\u12cb\u6bb9\u3711\u36d3, expr_13C:String[])
        putstatic:\u12b2\u3d4b\u6b0d\u6fb0\ubf56\u36d3<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>(\u97e6\u6198\u8258\u446c\ub7dc\u59ec::\u8d98\u7ce1\ubded\u8709\u0800\u6d99, initobject:\ud7e8\ua562\u0c95\u385b\u4f4a\u47c2[expected:\u12b2\u3d4b\u6b0d\u6fb0\ubf56\u36d3<\u97e6\u6198\u8258\u446c\ub7dc\u59ec>](\ud7e8\ua562\u0c95\u385b\u4f4a\u47c2::<init>))
    }
    
    public void \u6b0d\u0c95\ubb2b\u4975\u36d3\u6c52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_671 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_67C : int
        
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
        var_3_671 = and:int(ldc:int(1213052107), ldc:int(-926007457))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u97e6\u6198\u8258\u446c\ub7dc\u59ec[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
            var_3_671 = and:int(var_3_671:int, ldc:int(2102673255))
            var_5_7D = and:int(ldc:int(-1479), ldc:int(1474))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17295), ldc:int(910)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_671:int, ldc:int(-315164677))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, xor:int(ldc:int(34), ldc:int(35)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_671 = and:int(var_3_CD:int, ldc:int(2144697935))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(37), ldc:int(18571)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1228382146))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(695105680))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1005119759))
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-2091785462))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1946881863))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1600797299))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1383201079))
                    }
                    else {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-581665461))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0578)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0423:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-2139710146))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1023639116))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(286535578))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1871099235))
                            var_11_DE = and:int(ldc:int(-6854), ldc:int(6725))
                            goto(Label_1516)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0578:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1678957080))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-374508053))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-139698865))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1282056126))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-552560405))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1551127075))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-293603849))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1901918501))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-983822980))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(136088084))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1240415311))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1848463747))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1548221783))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(-31231), ldc:int(-31232))
                                goto(Label_1089)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1642036397))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(2089487252))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(183224390))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(-629689129))
                        var_11_DE = and:int(ldc:int(22797), ldc:int(-23376))
                    }
                    
                    Label_1089:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-384074995))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1914994031))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1505393466))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1311779017))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(469933389))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(1282406367))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-1490380217))
                        goto(Label_1527)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(951296845))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1089)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(1497552475))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-1187449161))
                            goto(Label_0423)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_671 = and:int(var_3_671:int, ldc:int(-12268897))
                            loopcontinue()
                        }
                        
                        var_3_671 = and:int(var_3_671:int, ldc:int(2049242847))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                        goto(Label_1516)
                    }
                    
                    Label_1363:
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1580589575))
                        goto(Label_1527)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(512)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-453818151))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1477479924))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1796856458))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(-331344696))
                        goto(Label_0423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(35811828))
                        loopcontinue()
                    }
                    
                    var_3_671 = and:int(var_3_671:int, ldc:int(1800386387))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1516:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1527:
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(20157412))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1089)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(2020597023))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(371256913))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(16)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(605310882))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(1119473187))
                        goto(Label_0423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_671:int, ldc:int(64)), ldc:int(0))) {
                        var_3_671 = and:int(var_3_671:int, ldc:int(2024144491))
                        var_17_67C = add:int(var_16_10C:int, and:int(ldc:int(14341), ldc:int(1579)))
                        looporswitchbreak()
                    }
                }
                
                var_3_671 = and:int(var_3_671:int, ldc:int(-317229837))
                
                if (cmple:boolean(var_5_7D = var_17_67C:int, sub:int(var_6_84:int, and:int(ldc:int(1089), ldc:int(23097))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_671:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
