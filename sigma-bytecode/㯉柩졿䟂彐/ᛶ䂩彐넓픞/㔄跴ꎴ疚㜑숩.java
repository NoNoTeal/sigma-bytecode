public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229 {
    public static com.mojang.serialization.Codec<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229> \uc29a\u16f6\u64f2\ucb79\uc910\uff55(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229> p0) {
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
    
    public void \u3504\u8df4\ua3b4\u759a\u3711\uc229(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229> p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
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
            invokespecial:Object(Object::<init>, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229)
            putfield:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\ua6bd\u4bc8\ub7dc\u4492\u7ce1\u416d, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>)
            putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
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
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\uc84e\u0b8e\u8350\ub171\u3e75\u9255, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229))
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u64f2\u3e2a\u71ae\ud171\ua068\u120d), invokevirtual:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229))), loadelement:String(getstatic:String[](\u3504\u8df4\ua3b4\u759a\u3711\uc229::\ub7dc\u839e\u7330\ud217\u34df\u99f7), and:int(ldc:int(25777), ldc:int(-28338)))), invokevirtual:String(\u92ee\u5bc4\uc910\u7043\ud523::\u6b0d\u836c\ucef1\u6198\ucfaf\u93a2, initobject:\u92ee\u5bc4\uc910\u7043\ud523(\u92ee\u5bc4\uc910\u7043\ud523::<init>, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229)), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229)))))))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229> \u8389\u516c\u6fb0\u52d3\ubb2b\uae5d() {
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
            return:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(getfield:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\ua6bd\u4bc8\ub7dc\u4492\u7ce1\u416d, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \uc7fe\ud217\ud12e\u5bc4\u4975\u156b() {
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
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229))
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 lambda$\ud12e\u67d0\u8258\u5140\u97e6\u8640$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229 p0) {
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
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u600f\ua3b4\ubded\u62da\ua6bd\u8258, p0:\u3504\u8df4\ua3b4\u759a\u3711\uc229))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3504\u8df4\ua3b4\u759a\u3711\uc229 lambda$\uc238\u6cfe\u2dcc\u16f6\u3e2a\u4f52$0(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\ubff1\ud171\uceb8\u4492\u67d0\u8aa5 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
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
            return:\u3504\u8df4\ua3b4\u759a\u3711\uc229(initobject:\u3504\u8df4\ua3b4\u759a\u3711\uc229(\u3504\u8df4\ua3b4\u759a\u3711\uc229::<init>, p0:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<\u3504\u8df4\ua3b4\u759a\u3711\uc229>, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E7 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_153_0 : byte[] [generated]
        stack_155_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_200_0 : byte[] [generated]
        stack_250_0 : byte[] [generated]
        stack_2BB_0 : byte[] [generated]
        stack_306_0 : byte[] [generated]
        stack_37E_0 : byte[] [generated]
        var_4_1D4 : int
        var_3_1D9 : byte[]
        var_5_1DA : int
        expr_200 : byte [generated]
        var_0_2FC : int
        expr_306 : byte [generated]
        stack_34A_2 : byte [generated]
        stack_329_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_23F : byte[]
        var_5_240 : int
        expr_D9 : int [generated]
        expr_10B : int [generated]
        expr_155 : int [generated]
        var_3_36D : byte[]
        var_5_36E : int
        var_3_190 : String
        stack_1C3_0 : String[] [generated]
        expr_1A2 : String[] [generated]
        
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
        var_0_1E7 = and:int(ldc:int(910334565), ldc:int(-237256968))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IQA=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D4 = expr_6B:int
        var_3_1D9 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1DA = expr_6B:int
        Label_0476:
        
        while (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0663)
            }
            
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(1368103145))
            var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
            expr_200 = loadelement:byte(stack_200_0:byte[], var_5_1DA:int)
            storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, or:int(and:int(shl:int(expr_200:byte, xor:int(ldc:int(-31707), ldc:int(-31711))), ldc:int(-16)), and:int(shr:int(expr_200:byte[expected:int], xor:int(ldc:int(-32576), ldc:int(-32572))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = var_3_1D9:byte[]
            goto(Label_0112)
        }
        
        var_0_1E7 = and:int(var_0_1E7:int, ldc:int(390310435))
        goto(Label_0746)
        Label_0663:
        
        while (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(256)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-1157933567))
                goto(Label_0476)
            }
            
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(445052354))
            var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
            storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, add:byte(loadelement:byte(stack_2BB_0:byte[], var_5_1DA:int), ldc:byte(42)))
            
            if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = var_3_1D9:byte[]
            goto(Label_0222)
        }
        
        Label_0746:
        
        while (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0476)
            }
            
            var_0_2FC = and:int(var_0_1E7:int, ldc:int(1059050092))
            var_5_1DA = add:int(var_5_1DA:int, ldc:int(-1))
            expr_306 = stack_34A_2 = loadelement(stack_306_0, var_5_1DA)
            
            if (cmplt:boolean(add:int(add:int(var_5_1DA:int, ldc:int(3)), neg:int(var_4_1D4:int)), ldc:int(0))) {
                stack_34A_2 = stack_329_0 = add:byte(expr_306:byte, loadelement:byte(var_3_1D9:byte[], add:int(var_5_1DA:int, ldc:int(3))))
                goto(Label_0825)
            }
            
            Label_0787:
            
            if (cmpne:boolean(and:int(var_0_2FC:int, ldc:int(256)), ldc:int(0))) {
                var_0_2FC = and:int(var_0_2FC:int, ldc:int(-906563203))
            }
            else {
                var_0_2FC = and:int(var_0_2FC:int, ldc:int(-1244220730))
                stack_34A_2 = stack_329_0 = add:byte(expr_306:byte, ldc:byte(3))
            }
            
            Label_0825:
            
            if (cmpeq:boolean(and:int(var_0_2FC:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0787)
            }
            
            var_0_1E7 = and:int(var_0_2FC:int, ldc:int(1454870978))
            storeelement:byte(var_3_1D9:byte[], var_5_1DA:int, stack_34A_2:byte)
            
            if (cmpne:boolean(var_5_1DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = var_3_1D9:byte[]
            goto(Label_0272)
        }
        
        goto(Label_0663)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-826039298))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(1554837711))
        }
        else {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-656173622))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_23F = newarray:byte[](byte.class, expr_A7:int)
                var_5_240 = expr_A7:int
                
                loop {
                    var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-84478522))
                    var_5_240 = add:int(var_5_240:int, ldc:int(-1))
                    storeelement:byte(var_3_23F:byte[], var_5_240:int, add:int(shl:int(loadelement:byte(stack_250_0:byte[], var_5_240:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_240:int, and:int(ldc:int(16515), ldc:int(81)))), ldc:int(7)), xor:int(ldc:int(4641), ldc:int(4640)))))
                    
                    if (cmpne:boolean(var_5_240:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = var_3_23F:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(1265440087))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-1214081195))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1D4 = expr_D9:int
                var_3_1D9 = newarray:byte[](byte.class, expr_D9:int)
                var_5_1DA = expr_D9:int
                goto(Label_0663)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(8)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(1816382405))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(2043125749))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_1D4 = expr_10B:int
                var_3_1D9 = newarray:byte[](byte.class, expr_10B:int)
                var_5_1DA = expr_10B:int
                goto(Label_0746)
            }
        }
        
        Label_0272:
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(16)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-1588714613))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(16)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(322153412))
                goto(Label_0222)
            }
            
            if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(1389170660))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(8)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-2091757699))
                goto(Label_0112)
            }
            
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-66866729))
            expr_155 = arraylength:int(stack_155_0:byte[])
            
            if (cmpne:boolean(expr_155:int, ldc:int(0))) {
                var_3_36D = newarray:byte[](byte.class, expr_155:int)
                var_5_36E = expr_155:int
                
                loop {
                    var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-32329364))
                    var_5_36E = add:int(var_5_36E:int, ldc:int(-1))
                    storeelement:byte(var_3_36D:byte[], var_5_36E:int, xor:byte(loadelement:byte(stack_37E_0:byte[], var_5_36E:int), ldc:byte(113)))
                    
                    if (cmpne:boolean(var_5_36E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_200_0 = stack_250_0 = stack_2BB_0 = stack_306_0 = stack_37E_0 = var_3_36D:byte[]
            }
        }
        
        Label_0346:
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E7:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_1E7:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1E7:int, ldc:int(-1996269143))
            goto(Label_0112)
        }
        
        var_3_190 = initobject:String(String::<init>, stack_184_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1C3_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12577), ldc:int(16529)))
        expr_1A2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12325), ldc:int(16385)))
        storeelement:String(expr_1A2:String[], and:int(ldc:int(26822), ldc:int(-26856)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(-6726), ldc:int(2629)), xor:int(ldc:int(8289), ldc:int(8288))))
        putstatic:String[](\u3504\u8df4\ua3b4\u759a\u3711\uc229::\ub7dc\u839e\u7330\ud217\u34df\u99f7, expr_1A2:String[])
        putstatic:\u12b2\u3d4b\u6b0d\u6fb0\ubf56\u36d3<\u3504\u8df4\ua3b4\u759a\u3711\uc229>(\u3504\u8df4\ua3b4\u759a\u3711\uc229::\u74b1\u873d\u7af6\u4179\u385b\ua3b4, initobject:\ua562\ube23\u4c04\u0a06\u8350\u6b5f[expected:\u12b2\u3d4b\u6b0d\u6fb0\ubf56\u36d3<\u3504\u8df4\ua3b4\u759a\u3711\uc229>](\ua562\ube23\u4c04\u0a06\u8350\u6b5f::<init>))
    }
    
    public void \u8d98\u760c\ubb2b\u392e\u4cd9\ud217(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(-326229932), ldc:int(1336846275))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3504\u8df4\ua3b4\u759a\u3711\uc229[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(1586932199))
            var_5_80 = and:int(ldc:int(-25443), ldc:int(24930))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4776), ldc:int(-4781)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_636:int, ldc:int(1553415417))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(2193), ldc:int(2192)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(4152), ldc:int(4153)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_D8:int, ldc:int(-1066938))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(9288), ldc:int(9289)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1240382059))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-904727197))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1838280658))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1647889913))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-121558023))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-305725768))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0414:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1261691186))
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1527593592))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1174782079))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1257342811))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1820886985))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(2112339459))
                            var_11_E9 = and:int(ldc:int(1829), ldc:int(-20406))
                            goto(Label_1452)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-696961633))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1303340848))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0677:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(504971165))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1928318035))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(88090651))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(709260472))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-860409119))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1643617588))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1513273953))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(2113813944))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(417), ldc:int(12869))
                                goto(Label_1054)
                            }
                        }
                    }
                    
                    Label_0909:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(2079301364))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(98209518))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1204510200))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1324872955))
                        var_11_E9 = and:int(ldc:int(4894), ldc:int(-4927))
                    }
                    
                    Label_1054:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1607711129))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0909)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-515759331))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1710568091))
                            goto(Label_0414)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1825025049))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1308)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1054)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1579322842))
                            goto(Label_0909)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1832151951))
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(506956838))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1512227396))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1264909316))
                            goto(Label_0414)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-806932041))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1452)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1308:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-860045834))
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1363529774))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(32)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(231738063))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(474107261))
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-347875212))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-269599263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1452:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1463:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1063806307))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2136600433))
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1423453709))
                        goto(Label_0909)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(516956175))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(797751379))
                        goto(Label_0414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1592736219))
                        var_17_641 = add:int(var_16_117:int, and:int(ldc:int(28961), ldc:int(2073)))
                        looporswitchbreak()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-42876518))
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(-324125536))
                
                if (cmple:boolean(var_5_80 = var_17_641:int, sub:int(var_6_87:int, xor:int(ldc:int(17413), ldc:int(17412))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(83193617))
            goto(Label_0108)
        }
    }
}
