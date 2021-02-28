public class \u12b2\u7049\u8df4\uc9f6\uae87.\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f {
    public void \u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f() {
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
            invokespecial:Object(Object::<init>, this:\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3a62\u3e2a\ucb79\u67e9\u4e72\u88c5() {
        var_0_71 : int
        var_0_AA : int
        
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
        var_0_71 = and:int(ldc:int(-2040975499), ldc:int(-2015683730))
        
        if (logicalnot:boolean(getstatic:boolean(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\ud158\u97b7\u51fa\u7ce1\u8709\u67d0))) {
            putstatic:boolean(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\ud158\u97b7\u51fa\u7ce1\u8709\u67d0, xor:int[expected:boolean](ldc:int(19458), ldc:int(19459)))
            
            if (logicalnot:boolean(invokeinterface:boolean(Set<E>::isEmpty, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<? extends \ud12e\ub8be\u69d9\uc246\uc84e\u9255<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc87f\u56bd\u40a9\ud7e8\u93a2\u7049))))) {
                goto(Label_0151)
            }
            
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(5433), ldc:int(-7674)))))
        }
        
        Label_0102:
        
        if (cmpeq:boolean(and:int(var_0_71:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        var_0_71 = and:int(var_0_71:int, ldc:int(-2115908291))
        Label_0151:
        
        if (cmpne:boolean(and:int(var_0_71:int, ldc:int(131072)), ldc:int(0))) {
            var_0_71 = and:int(var_0_71:int, ldc:int(-122289622))
            goto(Label_0102)
        }
        
        var_0_AA = and:int(var_0_71:int, ldc:int(-677806213))
        invokestatic:void(\ub171\ub19c\u624e\u494c\u3e2a\u7006::\u8640\u7bad\u7af6\u7d52\uceb8\ub113)
        invokestatic:void(\u5fe1\u64f2\u5654\u6b0d\u3dd3\u6b5f::\u759a\u7049\u8cae\u718f\uceb8\u4e72)
        
        if (cmpne:boolean(invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9255\u0c95\u4cd9\ube23\u760c<T>::\u8d90\u56bd\u5db4\uf94d\u9af2\uc31c, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6bb9\u8d90\u4c04\uc3e3\ucfaf)), aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
            var_0_71 = and:int(var_0_AA:int, ldc:int(-1367884828))
            invokestatic:void(\uc3e3\ucef1\u873d\u718f\u9937::\u5140\u718f\ud12e\u1187\ub171\u3a62)
            invokestatic:void(\u4daf\u7043\uff55\u3d4b\u99f7::\u4daf\ube23\u92ff\uf9c5\ud217\u960f)
            invokestatic:void(\u99f7\u6d69\uc84e\uf995\ua6bd\ub113::\u8640\uc2bd\u8413\ub19c\u5fe1\u92ee)
            invokestatic:void(\u6c52\ube23\ucb79\u494c\u8d98::\u494c\uc9f6\u4c2b\uc238\uff55\u8bb0)
            invokestatic:void(\u8350\u760c\u4e72\u8cae\ua068\u93a2::\u71ae\u7af6\u647c\ua6bd\u9a18\uc2e8)
            invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\ub113\u5bc4\u8bb0\u446c\u0800\uc229)
            goto(Label_0102)
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), xor:int(ldc:int(2052), ldc:int(2053)))))
    }
    
    private static void \u7bad\ua562\u8258\u8709\u92ff\u4e72(java.lang.Iterable<T> p0, java.util.function.Function<T, java.lang.String> p1, java.util.Set<java.lang.String> p2) {
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
    
    private static void \u3bc9\u4ab3\u4179\u3bd6\uafe7\u7330(java.util.Set<java.lang.String> p0) {
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
            invokestatic:void(\u7e3f\ubff1\u718f\ub171\u72f1::\u99f7\u0800\ud217\uc4d2\u9a18\ub19c, initobject:\u718f\u3504\u7ce1\u927d\ubded\u4179[expected:\u72f1\u92ff\u8413\u59ec\u4daf\u9255](\u718f\u3504\u7ce1\u927d\ubded\u4179::<init>, invokestatic:LanguageMap(LanguageMap::getInstance), p0:Set<String>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Set<java.lang.String> \ube23\u6198\uae87\u8753\u71ae\u3776() {
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
    
    public static void \ub8be\u5140\u5bc4\ufcaf\ud4fe\ub18d() {
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
    
    private static void \ub113\u5bc4\u8bb0\u446c\u0800\uc229() {
        var_0_61 : int
        
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
            var_0_61 = and:int(ldc:int(-202000365), ldc:int(-406849357))
            
            if (logicalnot:boolean(invokeinterface:boolean(Logger::isDebugEnabled, getstatic:Logger(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\uceb8\u67e9\ua562\u6b5f\ua068\ub1b9)))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1348279211))
                invokestatic:void(System::setErr, initobject:\u93a2\u92ee\u9255\uc2e8\u9937\uc87f[expected:PrintStream](\u93a2\u92ee\u9255\uc2e8\u9937\uc87f::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), xor:int(ldc:int(8194), ldc:int(8193))), getstatic:PrintStream[expected:OutputStream](System::err)))
                invokestatic:void(System::setOut, initobject:\u93a2\u92ee\u9255\uc2e8\u9937\uc87f[expected:PrintStream](\u93a2\u92ee\u9255\uc2e8\u9937\uc87f::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(356), ldc:int(27157))), getstatic:PrintStream[expected:OutputStream](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u5140\u74b1\ubefe\u97e6\u76bc\ub1b9)))
            }
            else {
                invokestatic:void(System::setErr, initobject:\u8389\u2dcc\u6bb9\u927d\ubf56[expected:PrintStream](\u8389\u2dcc\u6bb9\u927d\ubf56::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(819), ldc:int(8195))), getstatic:PrintStream[expected:OutputStream](System::err)))
                invokestatic:void(System::setOut, initobject:\u8389\u2dcc\u6bb9\u927d\ubf56[expected:PrintStream](\u8389\u2dcc\u6bb9\u927d\ubf56::<init>, loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(8206), ldc:int(3621))), getstatic:PrintStream[expected:OutputStream](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u5140\u74b1\ubefe\u97e6\u76bc\ub1b9)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9af2\u5fe1\u836c\u56bd\u385b\uc84e(java.lang.String p0) {
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
            invokevirtual:void(PrintStream::println, getstatic:PrintStream(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u5140\u74b1\ubefe\u97e6\u76bc\ub1b9), p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub18d\ub8be\u12cb\ub70c\ufe34\u61a4$2(java.lang.String p0) {
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
            invokeinterface:void(Logger::error, getstatic:Logger(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\uceb8\u67e9\ua562\u6b5f\ua068\ub1b9), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(8343), ldc:int(17157)))), p0:String)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u51b2\u7ce1\u8cae\u156b\u12b2\ucfaf$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389), and:int(ldc:int(70), ldc:int(15382)))), invokevirtual:String(String::replace, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), ldc:char(58), ldc:char(46)))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7d52\u416d\u4c2b\u9af2\ub32d\u76bc$0(java.util.function.Function p0, net.minecraft.util.text.LanguageMap p1, java.util.Set p2, java.lang.Object p3) {
        var_6_6F : String
        
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
            var_6_6F = checkcast:String(java.lang.String.class, invokeinterface:String(Function<Object, String>::apply, p0:Function<Object, String>, p3:Object))
            
            if (logicalnot:boolean(invokevirtual:boolean(LanguageMap::func_230506_b_, p1:LanguageMap, var_6_6F:String))) {
                invokeinterface:boolean(Set<String>::add, p2:Set<String>, var_6_6F:String)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2E0 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_122_0 : byte[] [generated]
        stack_124_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_264_0 : byte[] [generated]
        stack_2F3_0 : byte[] [generated]
        stack_347_0 : byte[] [generated]
        stack_39D_0 : byte[] [generated]
        var_4_245 : int
        var_3_24A : byte[]
        var_5_24B : int
        var_0_25A : int
        expr_264 : byte [generated]
        stack_2AD_2 : byte [generated]
        stack_28A_0 : byte [generated]
        expr_2F6 : byte [generated]
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_335 : byte[]
        var_5_336 : int
        expr_124 : int [generated]
        var_3_38B : byte[]
        var_5_38C : int
        var_3_15D : String
        stack_232_0 : String[] [generated]
        expr_16F : String[] [generated]
        
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
        var_0_2E0 = and:int(ldc:int(-37603692), ldc:int(2046800639))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_122_0 = stack_124_0 = stack_151_0 = stack_264_0 = stack_2F3_0 = stack_347_0 = stack_39D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("gBQlBODoC/D8FOmwAMDrPLSEwPBwcMQgrPhwEExB/NTw9+gkCOAoCOTstQ2MMC8IkAAgw8Dc3DT8/FAUhISAhPz0qLRUOAwIwHy0sJgkBdQI5fMgBBcR0BQA0/y8tARQ+PTs9BA9xXKmgek=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_245 = expr_6E:int
        var_3_24A = newarray:byte[](byte.class, expr_6E:int)
        var_5_24B = expr_6E:int
        Label_0589:
        
        while (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(16)), ldc:int(0))) {
            var_0_25A = and:int(var_0_2E0:int, ldc:int(-78170153))
            var_5_24B = add:int(var_5_24B:int, ldc:int(-1))
            expr_264 = stack_2AD_2 = loadelement(stack_264_0, var_5_24B)
            
            if (cmplt:boolean(add:int(add:int(var_5_24B:int, ldc:int(4)), neg:int(var_4_245:int)), ldc:int(0))) {
                stack_2AD_2 = stack_28A_0 = add:byte(expr_264:byte, loadelement:byte(var_3_24A:byte[], add:int(var_5_24B:int, ldc:int(4))))
                goto(Label_0666)
            }
            
            Label_0625:
            
            if (cmpne:boolean(and:int(var_0_25A:int, ldc:int(64)), ldc:int(0))) {
                var_0_25A = and:int(var_0_25A:int, ldc:int(-27619778))
            }
            else {
                var_0_25A = and:int(var_0_25A:int, ldc:int(2113287068))
                stack_2AD_2 = stack_28A_0 = add:byte(expr_264:byte, ldc:byte(4))
            }
            
            Label_0666:
            
            if (cmpne:boolean(and:int(var_0_25A:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0625)
            }
            
            var_0_2E0 = and:int(var_0_25A:int, ldc:int(2043150068))
            storeelement:byte(var_3_24A:byte[], var_5_24B:int, stack_2AD_2:byte)
            
            if (cmpne:boolean(var_5_24B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_122_0 = stack_124_0 = stack_151_0 = stack_264_0 = stack_2F3_0 = stack_347_0 = stack_39D_0 = var_3_24A:byte[]
            goto(Label_0115)
        }
        
        Label_0723:
        
        while (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(2046538709))
            var_5_24B = add:int(var_5_24B:int, ldc:int(-1))
            expr_2F6 = add:byte(loadelement:byte(stack_2F3_0:byte[], var_5_24B:int), ldc:byte(27))
            storeelement:byte(var_3_24A:byte[], var_5_24B:int, or:int(and:int(shl:int(expr_2F6:byte, and:int(ldc:int(452), ldc:int(9220))), ldc:int(-16)), and:int(shr:int(expr_2F6:byte[expected:int], and:int(ldc:int(5284), ldc:int(8268))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_24B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_122_0 = stack_124_0 = stack_151_0 = stack_264_0 = stack_2F3_0 = stack_347_0 = stack_39D_0 = var_3_24A:byte[]
            goto(Label_0172)
        }
        
        var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-1849858118))
        goto(Label_0589)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(4)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(836818513))
            goto(Label_0297)
        }
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(64)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-1982231112))
        }
        else {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-36751401))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_245 = expr_A7:int
                var_3_24A = newarray:byte[](byte.class, expr_A7:int)
                var_5_24B = expr_A7:int
                goto(Label_0723)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(1)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(485393949))
            goto(Label_0297)
        }
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(512)), ldc:int(0))) {
                var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-1396309126))
                goto(Label_0115)
            }
            
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-68209995))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_335 = newarray:byte[](byte.class, expr_E2:int)
                var_5_336 = expr_E2:int
                
                loop {
                    var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-36785417))
                    var_5_336 = add:int(var_5_336:int, ldc:int(-1))
                    storeelement:byte(var_3_335:byte[], var_5_336:int, add:int(shl:int(loadelement:byte(stack_347_0:byte[], var_5_336:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_336:int, and:int(ldc:int(21513), ldc:int(8227)))), ldc:int(6)), and:int(ldc:int(26787), ldc:int(5399)))))
                    
                    if (cmpne:boolean(var_5_336:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_122_0 = stack_124_0 = stack_151_0 = stack_264_0 = stack_2F3_0 = stack_347_0 = stack_39D_0 = var_3_335:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(128)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-827558639))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(1)), ldc:int(0))) {
                var_0_2E0 = and:int(var_0_2E0:int, ldc:int(1285922703))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(4)), ldc:int(0))) {
                var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-203410428))
                goto(Label_0115)
            }
            
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(2069772022))
            expr_124 = arraylength:int(stack_124_0:byte[])
            
            if (cmpne:boolean(expr_124:int, ldc:int(0))) {
                var_3_38B = newarray:byte[](byte.class, expr_124:int)
                var_5_38C = expr_124:int
                
                loop {
                    var_0_2E0 = and:int(var_0_2E0:int, ldc:int(2080290519))
                    var_5_38C = add:int(var_5_38C:int, ldc:int(-1))
                    storeelement:byte(var_3_38B:byte[], var_5_38C:int, xor:byte(loadelement:byte(stack_39D_0:byte[], var_5_38C:int), ldc:byte(4)))
                    
                    if (cmpne:boolean(var_5_38C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_122_0 = stack_124_0 = stack_151_0 = stack_264_0 = stack_2F3_0 = stack_347_0 = stack_39D_0 = var_3_38B:byte[]
            }
        }
        
        Label_0297:
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_2E0:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-1287753978))
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_2E0:int, ldc:int(16)), ldc:int(0))) {
            var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_232_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(87), ldc:int(15)))
            expr_16F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10308), ldc:int(10307)))
            storeelement:String(expr_16F:String[], xor:int(ldc:int(354), ldc:int(355)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(-2415), ldc:int(2406)), and:int(ldc:int(12954), ldc:int(1050))))
            storeelement:String(expr_16F:String[], xor:int(ldc:int(17171), ldc:int(17174)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(-32719), ldc:int(-32725)), xor:int(ldc:int(4449), ldc:int(4433))))
            storeelement:String(expr_16F:String[], xor:int(ldc:int(257), ldc:int(259)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(26674), ldc:int(1212)), and:int(ldc:int(4161), ldc:int(10068))))
            storeelement:String(expr_16F:String[], xor:int(ldc:int(266), ldc:int(265)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(2756), ldc:int(12368)), xor:int(ldc:int(2100), ldc:int(2162))))
            storeelement:String(expr_16F:String[], xor:int(ldc:int(199), ldc:int(195)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(326), ldc:int(26718)), and:int(ldc:int(4556), ldc:int(8302))))
            storeelement:String(expr_16F:String[], and:int(ldc:int(17125), ldc:int(-19446)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(17455), ldc:int(17507)), and:int(ldc:int(1509), ldc:int(24677))))
            storeelement:String(expr_16F:String[], and:int(ldc:int(1623), ldc:int(8334)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(13037), ldc:int(17509)), and:int(ldc:int(2410), ldc:int(4347))))
            putstatic:String[](\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u071d\u965f\ub7dc\u416d\u4c2b\u8389, expr_16F:String[])
            putstatic:PrintStream(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u5140\u74b1\ubefe\u97e6\u76bc\ub1b9, getstatic:PrintStream(System::out))
            putstatic:Logger(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\uceb8\u67e9\ua562\u6b5f\ua068\ub1b9, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u927d\ubcb0\u92ee\u8bb0\u8df4\u52d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6DE : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6E9 : int
        
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
        var_3_6DE = and:int(ldc:int(-396190347), ldc:int(1231052469))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1668722045))
            var_5_81 = and:int(ldc:int(22749), ldc:int(-23550))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1156), ldc:int(1155)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6DE:int, ldc:int(1122270967))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(2659), ldc:int(1421)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(3137), ldc:int(3136)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6DE = and:int(var_3_D1:int, ldc:int(-705962449))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-22496), ldc:int(-22495)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2009147578))
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-658211504))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-228511920))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1957151250))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(259401218))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1983949334))
                    }
                    else {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-277410043))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(33395374))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1461868738))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1344892198))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(269587512))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(261511079))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(740984801))
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1719968099))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(680663115))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1190866087))
                        var_11_E2 = and:int(ldc:int(-24835), ldc:int(24834))
                        goto(Label_1643)
                    }
                    
                    Label_0622:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1388897065))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1617606832))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-294147613))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1428858464))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(588361034))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1529250407))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-379425017))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0765:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(764114302))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(934618163))
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1350367404))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-932848005))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1485909375))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1285696595))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1885900695))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0915:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1933720881))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1776336138))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1702998045))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1772543410))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(1659562035))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1995865101))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4104), ldc:int(4105))
                                goto(Label_1218)
                            }
                        }
                    }
                    
                    Label_1049:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1725172169))
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-359055161))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(2055351522))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1127639056))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-758107283))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1138805999))
                        var_11_E2 = and:int(ldc:int(-28879), ldc:int(20686))
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-927816482))
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1049)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(94101017))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0765)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-490620115))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1735597679))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1488)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1631101068))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-390887619))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1218)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(-106875904))
                            goto(Label_1049)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(868613369))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(720419627))
                            goto(Label_0765)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6DE = and:int(var_3_6DE:int, ldc:int(561552993))
                            loopcontinue()
                        }
                        
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1601166573))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1643)
                    }
                    
                    Label_1488:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-2084512693))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(1255162077))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1019480273))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(788087953))
                        goto(Label_1049)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(843396382))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1801445991))
                        loopcontinue()
                    }
                    
                    var_3_6DE = and:int(var_3_6DE:int, ldc:int(1425096517))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1643:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E9 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1654:
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1488)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-326740139))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-1538254738))
                        goto(Label_1049)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-845204689))
                        goto(Label_0765)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6DE = and:int(var_3_6DE:int, ldc:int(-402882681))
                        var_17_6E9 = add:int(var_16_110:int, xor:int(ldc:int(16468), ldc:int(16469)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6DE = and:int(var_3_6DE:int, ldc:int(1383005669))
                
                if (cmple:boolean(var_5_81 = var_17_6E9:int, sub:int(var_6_88:int, and:int(ldc:int(1167), ldc:int(16961))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6DE:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
