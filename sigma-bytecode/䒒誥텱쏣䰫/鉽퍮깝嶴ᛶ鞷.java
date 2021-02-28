public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u927d\ud36e\uae5d\u5db4\u16f6\u97b7 {
    public void \u927d\ud36e\uae5d\u5db4\u16f6\u97b7(java.io.File p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u88c5\ua562\u7c6b\ud36e\u74b1\u965f p1) {
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
            invokespecial:Object(Object::<init>, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7)
            putfield:ReentrantLock(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u8aa5\u7043\u494c\u98a4\u7e3f\ub83f, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, initobject:ReentrantLock(ReentrantLock::<init>))
            putfield:File(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u40a9\u760c\uf9c5\u97b7\ud51e\ubcb0, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, p0:File)
            putfield:\u88c5\ua562\u7c6b\ud36e\u74b1\u965f(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u62da\u3a62\u7043\u4c2b\ubcb0\u983f, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, p1:\u88c5\ua562\u7c6b\ud36e\u74b1\u965f)
            putfield:\u74b1\u59ec\u2dcc\u8413\u8c8a(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\ub113\u7e3f\ud12e\u40a9\uc3e3\u3776, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, initobject:\u120d\u7330\u51b2\u8d98\u47c2\u7d52[expected:\u74b1\u59ec\u2dcc\u8413\u8c8a](\u120d\u7330\u51b2\u8d98\u47c2\u7d52::<init>, p1:\u88c5\ua562\u7c6b\ud36e\u74b1\u965f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\ubded\u6ec6\ub32d\u5db4\u64f2(java.util.function.Consumer<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64> p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7ce1\ubb2b\uc31c\u6d69\u5654 p1) {
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
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u74b1\u59ec\u2dcc\u8413\u8c8a \u759a\u97b7\u4c04\u5140\ub6ab\u8cae() {
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
            return:\u74b1\u59ec\u2dcc\u8413\u8c8a(getfield:\u74b1\u59ec\u2dcc\u8413\u8c8a(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\ub113\u7e3f\ud12e\u40a9\uc3e3\u3776, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map<java.lang.String, java.lang.String> \u4c04\uc9f6\u8df4\u34df\ud7e8\u3e75() {
        var_2_63 : HashMap
        
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
            var_2_63 = invokestatic:HashMap(Maps::newHashMap)
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(19472), ldc:int(19473))), invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\ub7dc\u6d99\u516c\ub32d\ub113\u7ce1, invokevirtual:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u5654\u36d3\u416d\u836c\u6cfe, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(4177), ldc:int(4179))), invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\u3a62\u0a06\u600f\u8640\ubff1\u92ff, invokevirtual:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u5654\u36d3\u416d\u836c\u6cfe, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))))
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(1431), ldc:int(21059))), invokeinterface:String(GameVersion::getName, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(292), ldc:int(15365))), invokeinterface:String(GameVersion::getId, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(18626), ldc:int(18631))), invokestatic:String(String::valueOf, invokeinterface:int(GameVersion::getPackVersion, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a))))
            invokeinterface:String(Map<String, String>::put, var_2_63:HashMap<String, String>[expected:Map<String, String>], loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(262), ldc:int(16407))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(12320), ldc:int(12327)))), invokeinterface:String(GameVersion::getName, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))))
            return:Map<String, String>(var_2_63:HashMap<String, String>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<?> \u8308\ud51e\ud4fe\u2dcc\u6d99\uf9c5(java.lang.String p0, java.lang.String p1) {
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
    
    private static void \u61a4\u8d98\u97b7\u0c95\uc2e8\u6cfe(java.io.File p0) {
        var_1_A4 : int
        var_3_9E : IOException
        
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
            var_1_A4 = and:int(ldc:int(249179229), ldc:int(919579773))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_A4:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_A4 = and:int(var_1_A4:int, ldc:int(892819056))
                    }
                    else {
                        var_1_A4 = and:int(var_1_A4:int, ldc:int(-1343329155))
                        invokestatic:void(Files::delete, invokevirtual:Path(File::toPath, p0:File))
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A4:int, ldc:int(65536)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_A4 = and:int(var_1_A4:int, ldc:int(2123086618))
                }
                
                var_1_A4 = and:int(var_1_A4:int, ldc:int(2013161165))
            }
            catch (java.io.IOException var_3_9E) {
                var_1_A4 = and:int(var_1_A4:int, ldc:int(-943018401))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(128), ldc:int(137))), p0:File[expected:Object], invokevirtual:String[expected:Object](Throwable::getMessage, var_3_9E:IOException[expected:Throwable]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc2bd\u156b\u6ec6\u9a18\ub7dc\ub113() {
        var_1_1E6 : int
        
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
            var_1_1E6 = and:int(ldc:int(1609751596), ldc:int(-679416788))
            
            loop {
                Label_0098:
                
                if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1456)
                }
                
                if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(669154152))
                    goto(Label_1346)
                }
                
                if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_1208)
                }
                
                if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1072)
                }
                
                if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1448940644))
                    goto(Label_0914)
                }
                
                if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(705883067))
                    goto(Label_0776)
                }
                
                if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-428180566))
                    goto(Label_0642)
                }
                
                if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0496)
                }
                
                if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(590879590))
                    goto(Label_0374)
                }
                
                if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0236)
                }
                
                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(2006568879))
                invokevirtual:void(ReentrantLock::lock, getfield:ReentrantLock(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u8aa5\u7043\u494c\u98a4\u7e3f\ub83f, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7))
                
                try {
                    loop {
                        Label_0236:
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(32768)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-889892697))
                            goto(Label_1456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1346)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-666880358))
                            goto(Label_1208)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(367178894))
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(334285698))
                            goto(Label_0642)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-658564037))
                            goto(Label_0496)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8388608)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1872747428))
                            
                            if (cmpeq:boolean(getfield:CompletableFuture<?>(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u12b2\u516c\ub1b9\u946b\u64ab\u3504, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7), aconstnull:CompletableFuture<?>())) {
                                goto(Label_0642)
                            }
                        }
                        
                        Label_0374:
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1456)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1346)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1449838730))
                            goto(Label_1208)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(176277047))
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(136009876))
                            goto(Label_0642)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-204058717))
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-812262275))
                        }
                        
                        Label_0496:
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1346)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1208)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(2131261157))
                            goto(Label_1072)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1191223239))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(992940309))
                            goto(Label_0776)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(924463560))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0374)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1078371457))
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-944579468))
                            invokevirtual:boolean(CompletableFuture<T>::cancel, getfield:CompletableFuture<?>(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u12b2\u516c\ub1b9\u946b\u64ab\u3504, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7), and:int[expected:boolean](ldc:int(3), ldc:int(3617)))
                        }
                        
                        Label_0642:
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(32)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1300851638))
                            goto(Label_1346)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1208)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1983609070))
                            goto(Label_1072)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1327864975))
                                goto(Label_0374)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(533305161))
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(293928830))
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1604569773))
                            putfield:CompletableFuture<?>(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u12b2\u516c\ub1b9\u946b\u64ab\u3504, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, aconstnull:CompletableFuture<?>())
                        }
                        
                        Label_0776:
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1346)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1442180944))
                            goto(Label_1208)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1072)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1633040536))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1493791242))
                                goto(Label_0642)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(313485242))
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_0374)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-447929867))
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-677250130))
                            
                            if (cmpeq:boolean(getfield:\ua61f\uae87\u36d3\u647c\u3d64(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u36d3\uff55\u6fb0\u69d9\uc7fe\ud523, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7), aconstnull:\ua61f\uae87\u36d3\u647c\u3d64())) {
                                goto(Label_1346)
                            }
                        }
                        
                        Label_0914:
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1371137678))
                            goto(Label_1456)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1131823101))
                            goto(Label_1346)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1036660394))
                            goto(Label_1208)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(64713860))
                                goto(Label_0776)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0642)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1115473764))
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(676909998))
                                goto(Label_0374)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(23349129))
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1683931083))
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1606609021))
                        }
                        
                        Label_1072:
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1456)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(667432021))
                            goto(Label_1346)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(666981189))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-417068077))
                                goto(Label_0914)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(2095980976))
                                goto(Label_0776)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0642)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(524288)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-390510976))
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0374)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-274347146))
                            putfield:\ua61f\uae87\u36d3\u647c\u3d64(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u36d3\uff55\u6fb0\u69d9\uc7fe\ud523, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, aconstnull:\ua61f\uae87\u36d3\u647c\u3d64())
                        }
                        
                        Label_1208:
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(595742260))
                            goto(Label_1456)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-227160780))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1092772840))
                                goto(Label_1072)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_0914)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0776)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-665806746))
                                goto(Label_0642)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-77360153))
                                goto(Label_0374)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1737354685))
                            invokevirtual:CompletableFuture<Void>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud171\u8c8a\u9af2\u1187\u56bd\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
                        }
                        
                        Label_1346:
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(32)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                                goto(Label_1208)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1072)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0914)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(65536)), ldc:int(0))) {
                                goto(Label_0776)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                                goto(Label_0642)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(2)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1897237131))
                                goto(Label_0496)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(32768)), ldc:int(0))) {
                                goto(Label_0374)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(128)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1427910159))
                                loopcontinue(Label_0098)
                            }
                            
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-945230979))
                            invokevirtual:void(ReentrantLock::unlock, getfield:ReentrantLock(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u8aa5\u7043\u494c\u98a4\u7e3f\ub83f, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7))
                        }
                        
                        Label_1456:
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1346)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1208)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1E6:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1090584697))
                            goto(Label_1072)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-813493380))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(4)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(1014622418))
                            goto(Label_0776)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1608024746))
                            goto(Label_0642)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0496)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-1411470104))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(2048)), ldc:int(0))) {
                            var_1_1E6 = and:int(var_1_1E6:int, ldc:int(273120781))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_1E6:int, ldc:int(262144)), ldc:int(0))) {
                                var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-812257283))
                                looporswitchbreak()
                            }
                            
                            loopcontinue(Label_0098)
                        }
                    }
                }
                finally {
                    invokevirtual:void(ReentrantLock::unlock, getfield:ReentrantLock(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u8aa5\u7043\u494c\u98a4\u7e3f\ub83f, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7))
                    var_1_1E6 = and:int(var_1_1E6:int, ldc:int(-2435019))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u4daf\ubf56\u40a9\u8c8a\ud171\u759a(java.lang.String p0, java.io.File p1) {
        var_3_61 : int
        var_5_70 : FileInputStream
        var_6_73 : Throwable
        var_7_7A : String
        var_7_180 : Throwable
        var_11_1A5 : Throwable
        var_5_1C8 : IOException
        
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
            var_3_61 = and:int(ldc:int(285137262), ldc:int(-160126472))
            
            try {
                var_3_61 = and:int(var_3_61:int, ldc:int(-151676565))
                var_5_70 = initobject:FileInputStream(FileInputStream::<init>, p1:File)
                var_6_73 = aconstnull:Throwable()
                
                try {
                    var_7_7A = invokestatic:String(DigestUtils::sha1Hex, var_5_70:FileInputStream[expected:InputStream])
                    
                    if (invokevirtual:boolean(String::isEmpty, p0:String)) {
                        invokeinterface:void(Logger::info, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(16974), ldc:int(4106))), p1:File[expected:Object])
                        return:boolean(and:int[expected:boolean](ldc:int(30469), ldc:int(233)))
                    }
                    
                    if (invokevirtual:boolean(String::equals, invokevirtual:String(String::toLowerCase, var_7_7A:String, getstatic:Locale(Locale::ROOT)), invokevirtual:String[expected:Object](String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT)))) {
                        invokeinterface:void(Logger::info, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(571), ldc:int(16459))), p1:File[expected:Object], p0:String[expected:Object])
                        return:boolean(xor:int[expected:boolean](ldc:int(-32190), ldc:int(-32189)))
                    }
                    
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(-32742), ldc:int(-32746))), p1:File[expected:Object], p0:String[expected:Object], var_7_7A:String[expected:Object])
                    return:boolean(and:int[expected:boolean](ldc:int(-9613), ldc:int(8588)))
                }
                catch (java.lang.Throwable var_7_180) {
                    var_6_73 = var_7_180:Throwable
                    athrow(var_7_180:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_5_70:FileInputStream, aconstnull:FileInputStream())) {
                        if (cmpne:boolean(var_6_73:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(FileInputStream::close, var_5_70:FileInputStream)
                            }
                            catch (java.lang.Throwable var_11_1A5) {
                                invokevirtual:void(Throwable::addSuppressed, var_6_73:Throwable, var_11_1A5:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(FileInputStream::close, var_5_70:FileInputStream)
                        }
                    }
                }
            }
            catch (java.io.IOException var_5_1C8) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(16391), ldc:int(16394))), p1:File[expected:Object], var_5_1C8:IOException[expected:Object])
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-9613), ldc:int(8588)))
        }
        
        goto(Label_0006)
    }
    
    private void \u718f\u5f50\uff55\u3bd6\ucb79\ud51e() {
        var_1_61 : int
        var_3_79 : ArrayList
        var_4_A6 : int
        var_5_B4 : Iterator<File>
        var_6_EF : File
        var_3_222 : IllegalArgumentException
        
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
            var_1_61 = and:int(ldc:int(-1126779972), ldc:int(-35130377))
            
            try {
                var_1_61 = and:int(var_1_61:int, ldc:int(1558437775))
                var_3_79 = invokestatic:ArrayList(Lists::newArrayList, invokestatic:Collection[expected:Iterable](FileUtils::listFiles, getfield:File(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u40a9\u760c\uf9c5\u97b7\ud51e\ubcb0, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7), getstatic:IOFileFilter(TrueFileFilter::TRUE), checkcast:IOFileFilter(org.apache.commons.io.filefilter.IOFileFilter.class, aconstnull:IOFileFilter())))
                
                do {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(2110070749))
                        invokeinterface:void(List<Object>::sort, var_3_79:ArrayList<Object>[expected:List<Object>], getstatic:Comparator(LastModifiedFileComparator::LASTMODIFIED_REVERSE))
                    }
                } while (cmpne:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0)))
                
                var_1_61 = and:int(var_1_61:int, ldc:int(-573489164))
                var_4_A6 = and:int(ldc:int(515), ldc:int(-516))
                var_1_61 = and:int(var_1_61:int, ldc:int(-1664665660))
                var_5_B4 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_3_79:ArrayList<Object>[expected:List<Object>])
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(268435456)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1479080366))
                    }
                    else {
                        var_1_61 = and:int(var_1_61:int, ldc:int(1036842911))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_B4:Iterator<File>))) {
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_61:int, ldc:int(2110160837))
                        var_6_EF = checkcast:File(java.io.File.class, invokeinterface:File(Iterator<File>::next, var_5_B4:Iterator<File>))
                        
                        loop {
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                                var_1_61 = and:int(var_1_61:int, ldc:int(-1506606092))
                                goto(Label_0495)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_0424)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                                var_1_61 = and:int(var_1_61:int, ldc:int(1411742262))
                                goto(Label_0354)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                                var_1_61 = and:int(var_1_61:int, ldc:int(-1077120084))
                                
                                if (cmplt:boolean(postincrement:int(1, var_4_A6:int), ldc:int(10))) {
                                    goto(Label_0495)
                                }
                            }
                            
                            Label_0307:
                            
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0495)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                                var_1_61 = and:int(var_1_61:int, ldc:int(2057131991))
                                goto(Label_0424)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(4)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_61 = and:int(var_1_61:int, ldc:int(1055202262))
                            }
                            
                            Label_0354:
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(134217728)), ldc:int(0))) {
                                goto(Label_0495)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(512)), ldc:int(0))) {
                                var_1_61 = and:int(var_1_61:int, ldc:int(-1711244444))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1024)), ldc:int(0))) {
                                    goto(Label_0307)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_1_61 = and:int(var_1_61:int, ldc:int(1055724470))
                                invokeinterface:void(Logger::info, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(8327), ldc:int(8329))), invokevirtual:String(File::getName, var_6_EF:File))
                            }
                            
                            Label_0424:
                            
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(256)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(128)), ldc:int(0))) {
                                    var_1_61 = and:int(var_1_61:int, ldc:int(387642249))
                                    goto(Label_0354)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_1_61 = and:int(var_1_61:int, ldc:int(1293634052))
                                    goto(Label_0307)
                                }
                                
                                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(4096)), ldc:int(0))) {
                                    var_1_61 = and:int(var_1_61:int, ldc:int(-121386111))
                                    loopcontinue()
                                }
                                
                                var_1_61 = and:int(var_1_61:int, ldc:int(2128428981))
                                invokestatic:boolean(FileUtils::deleteQuietly, var_6_EF:File)
                            }
                            
                            Label_0495:
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(67108864)), ldc:int(0))) {
                                goto(Label_0424)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0354)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_0307)
                            }
                            
                            if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16384)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_61 = and:int(var_1_61:int, ldc:int(-588958756))
                    }
                }
            }
            catch (java.lang.IllegalArgumentException var_3_222) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(17024), ldc:int(17039))), invokevirtual:String[expected:Object](Throwable::getMessage, var_3_222:IllegalArgumentException[expected:Throwable]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u0800\u8258\u3d64\u71f1\u6ec6\u6bb9(java.io.File p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p1) {
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
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 \u3d64\u97b7\u4d85\ub19c\uc9f6\u61a4(\u5d20\u7043\u88c5\u5db4\uf94d.\u7ce1\ubb2b\uc31c\u6d69\u5654 p0) {
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
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 \ucfaf\u9a18\u92ee\u97e6\ud36e\u8cae(\u5d20\u7043\u88c5\u5db4\uf94d.\u7ce1\ubb2b\uc31c\u6d69\u5654 p0, java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p1) {
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
            return:\ua61f\uae87\u36d3\u647c\u3d64(invokestatic:\ua61f\uae87\u36d3\u647c\u3d64(\ua61f\uae87\u36d3\u647c\u3d64::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(5128), ldc:int(5150))), and:int[expected:boolean](ldc:int(29809), ldc:int(-29814)), p1:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>, p0:\u7ce1\ubb2b\uc31c\u6d69\u5654, getstatic:\ub18d\ub171\u51fa\uafe7\u7049(\ub18d\ub171\u51fa\uafe7\u7049::\u99f7\u4cd9\u4d85\u3504\u34df\uae5d), getstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u6d99\ucb79\u624e\u8c8a\u960f\u3e2a)))
        }
        
        goto(Label_0006)
    }
    
    private static \u36d3\u9033\u6b0d\u983f\u8d90.\u69d9\u9255\u6d99\ubff1\u0c95 \u69d9\u3776\u927d\u4179\u3dd3\ud51e(java.io.File p0) {
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
            return:\u69d9\u9255\u6d99\ubff1\u0c95(initobject:\u4975\u7d52\u7af6\u385b\ubded\ua3b4[expected:\u69d9\u9255\u6d99\ubff1\u0c95](\u4975\u7d52\u7af6\u385b\ubded\ua3b4::<init>, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 \u5f50\u3d64\u8308\ub19c\u7d52\u5140(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u4ab3\u5140\u4daf\u983f\u416d\u9255[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u4ab3\u5140\u4daf\u983f\u416d\u9255::<init>, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u839e\u4cd9\uae87\ubb2b\u7873\u5bc4$6(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(invokestatic:\u69d9\u9255\u6d99\ubff1\u0c95[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u69d9\u3776\u927d\u4179\u3dd3\ud51e, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u600f\u965f\u3c25\uf995\uc2bd\u6bb9$5(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(invokestatic:\u4f52\u7ce1\uc229\ucef1\ube23(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u5f50\u3d64\u8308\ub19c\u7d52\u5140, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\ubff1\u1833\u47c2\u3711\u759a\uc9f6$4(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u983f\ucef1\ua3b4\ubf56\u4975[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u983f\ucef1\ua3b4\ubf56\u4975::<init>, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u446c\uceb8\u16f6\u6198\u3504\ud36e$3(java.io.File p0, java.lang.Void p1, java.lang.Throwable p2) {
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
            
            if (cmpne:boolean(p2:Throwable, aconstnull:Throwable())) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), and:int(ldc:int(25399), ldc:int(159))), invokevirtual:String[expected:Object](Throwable::getMessage, p2:Throwable), p0:File[expected:Object])
                invokestatic:void(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u61a4\u8d98\u97b7\u0c95\uc2e8\u6cfe, p0:File)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletionStage lambda$\u71ae\u59ec\u527a\u9af2\u946b\u5245$2(java.lang.String p0, java.io.File p1, java.lang.Object p2) {
        var_4_63 : int
        stack_C1_0 : Future<T> [generated]
        
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
            var_4_63 = and:int(ldc:int(-846670990), ldc:int(-1884366349))
            
            if (invokespecial:boolean(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u4daf\ubf56\u40a9\u8c8a\ud171\u759a, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, p0:String, p1:File)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(803566974))
                stack_C1_0 = invokevirtual:CompletableFuture<Void>[expected:Future<T>](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u0800\u8258\u3d64\u71f1\u6ec6\u6bb9, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7, p1:File, getstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u6c56\u4f4a\u4f52\ua61f\u8413\u3a62))
            }
            else {
                stack_C1_0 = invokestatic:CompletableFuture<Object>[expected:Future<T>](\ud217\u3504\u760c\uc29a\u97e6\ube23::\ud4fe\u1187\u6b5f\u6c52\u8413\uc87f, initobject:RuntimeException[expected:Throwable](RuntimeException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(105), ldc:int(113)))), p1:File[expected:Object]), loadelement:String(getstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043), xor:int(ldc:int(20768), ldc:int(20793)))))))
            }
            
            return:CompletionStage(stack_C1_0:Future<T>)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7e3f\u67d0\ud7e8\u4cd9\ud217\u6435$1(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\u9255\u74b1\u8413\ubf56\u120d\ud217 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\u9255\u74b1\u8413\ubf56\u120d\ud217[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u6b5f\u5f50\u0c95\u9937\u3d4b\ubb2b$0() {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(getfield:\u74b1\u59ec\u2dcc\u8413\u8c8a[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\ub113\u7e3f\ud12e\u40a9\uc3e3\u3776, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A1 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_C0_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_472_0 : byte[] [generated]
        stack_4E6_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_40A : byte[]
        var_4_40B : int
        expr_8F : int [generated]
        var_5_45B : int
        var_3_460 : byte[]
        var_4_461 : int
        var_0_468 : int
        expr_472 : byte [generated]
        stack_4B1_2 : byte [generated]
        stack_48E_0 : byte [generated]
        expr_C0 : int [generated]
        var_3_4D4 : byte[]
        var_4_4D5 : int
        expr_4E9 : byte [generated]
        var_3_F9 : String
        expr_101 : String[] [generated]
        expr_10B : String[] [generated]
        var_3_3EC : String[]
        
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
            var_0_A1 = and:int(ldc:int(2079756960), ldc:int(-1141448992))
            expr_68 = var_2_6C = stack_8D_0 = stack_8F_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_472_0 = stack_4E6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AlbTfTJAUUAyM8MWk8GDg0R/PMUDPYAG8MNUPr9FgT0CAsWMPztERQA8/cDCvINxBtBDxz0BMIPTPYCwBNXF/fgCBwF8g3IBEsLwRtBDxz0BMALTwYODRH88sUfTPYCwBNWGwLy8A7LCE38BAvBC0gACBwF8g3IBEsLwRtBDxz0BMALTwYODRH88sUfTPYCwNAPQ1Ub/OUECATAEUO7C0gACBADvwdKBAvKE1DMv0NVE/nkC8oTWrnxThMA/gzKFwH7Qc0PRRkN9AbOJUnkC8oTWrT/RADNHlfz+A3PD0UZAr/LQFUS/PEeD/TJE168tkFBEQD9yRNRvrNvQPEA/c4HSgQLyhNav/9JHgv6CgINxRtBABvyAR3/9MwPRRkCvRNVHfDxAP3OB0oEC8oTWrYHQwEE8xsUvgtEDAvwAwgPGAT7DsYPRRkLFwT5ArUITgUKAsUPTQUEGh/xvwFEHsv3SgQLzCJC/Qn4CAjCG08GDg0R/PMUDPYCygxQzr1Yaf7kCwMSC/0Vyh9D8AaxPkzWAsoAURP2+QgPGAT7DsgPTQUECArTz0NevLhLSAAIHAXyDcEHSgQLyhNWKg/RB8EWS+kBFja69E7kCwMSC/0YxCxM1gXFLkPyAPkZNrr0TuQLAxIL/RjPKHvw8Raq9E7kCwMSC/0Yzypf0QcA8QwFN8r0TuQLAxIL/RjOKEPiGPP7BzDK9E7kCwMSC/0YzihD4hjz+wHFKWsZHN2bDGjLDRinAH5IqsdL/QJQ+v0WBPwLFjD87RAO/wYODRH88zQM1gTIGUEPHPQGw/1BDAsQDwYODRH88xQM9gAbww1Q+v0WBPQICxYw/O0TugVKBhrxDxz0DxD3+AINCw8UE"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_40A = newarray:byte[](byte.class, expr_70:int)
                var_4_40B = expr_70:int
                
                loop {
                    var_0_A1 = and:int(var_0_A1:int, ldc:int(-67243293))
                    var_4_40B = add:int(var_4_40B:int, ldc:int(-1))
                    storeelement:byte(var_3_40A:byte[], var_4_40B:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_40B:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_40B:int, and:int(ldc:int(16513), ldc:int(1)))), ldc:int(2)), and:int(ldc:int(5247), ldc:int(2111)))))
                    
                    if (cmpne:boolean(var_4_40B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_472_0 = stack_4E6_0 = var_3_40A:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_A1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0197)
                }
                
                if (cmpeq:boolean(and:int(var_0_A1:int, ldc:int(8)), ldc:int(0))) {
                    var_0_A1 = and:int(var_0_A1:int, ldc:int(2144770733))
                    expr_8F = arraylength:int(stack_8F_0:byte[])
                    
                    if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                        var_5_45B = expr_8F:int
                        var_3_460 = newarray:byte[](byte.class, expr_8F:int)
                        var_4_461 = expr_8F:int
                        
                        loop {
                            var_0_468 = and:int(var_0_A1:int, ldc:int(1071379130))
                            var_4_461 = add:int(var_4_461:int, ldc:int(-1))
                            expr_472 = stack_4B1_2 = loadelement(stack_472_0, var_4_461)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_461:int, ldc:int(2)), neg:int(var_5_45B:int)), ldc:int(0))) {
                                stack_4B1_2 = stack_48E_0 = add:byte(expr_472:byte, loadelement:byte(var_3_460:byte[], add:int(var_4_461:int, ldc:int(2))))
                                goto(Label_1182)
                            }
                            
                            Label_1151:
                            
                            if (cmpne:boolean(and:int(var_0_468:int, ldc:int(512)), ldc:int(0))) {
                                var_0_468 = and:int(var_0_468:int, ldc:int(-6815752))
                                stack_4B1_2 = stack_48E_0 = add:byte(expr_472:byte, ldc:byte(2))
                            }
                            
                            Label_1182:
                            
                            if (cmpne:boolean(and:int(var_0_468:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_1151)
                            }
                            
                            var_0_A1 = and:int(var_0_468:int, ldc:int(2131792883))
                            storeelement:byte(var_3_460:byte[], var_4_461:int, stack_4B1_2:byte)
                            
                            if (cmpne:boolean(var_4_461:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_472_0 = stack_4E6_0 = var_3_460:byte[]
                    }
                }
                
                Label_0148:
                
                if (cmpne:boolean(and:int(var_0_A1:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_A1 = and:int(var_0_A1:int, ldc:int(-958911723))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_A1:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_A1 = and:int(var_0_A1:int, ldc:int(-1771076765))
                        loopcontinue()
                    }
                    
                    var_0_A1 = and:int(var_0_A1:int, ldc:int(1066973156))
                    expr_C0 = arraylength:int(stack_C0_0:byte[])
                    
                    if (cmpne:boolean(expr_C0:int, ldc:int(0))) {
                        var_3_4D4 = newarray:byte[](byte.class, expr_C0:int)
                        var_4_4D5 = expr_C0:int
                        
                        loop {
                            var_0_A1 = and:int(var_0_A1:int, ldc:int(-13568089))
                            var_4_4D5 = add:int(var_4_4D5:int, ldc:int(-1))
                            expr_4E9 = add:byte(loadelement:byte(stack_4E6_0:byte[], var_4_4D5:int), ldc:byte(80))
                            storeelement:byte(var_3_4D4:byte[], var_4_4D5:int, xor:int(or:int(and:int(shl:int(expr_4E9:byte, xor:int(ldc:int(2053), ldc:int(2049))), ldc:int(-16)), and:int(shr:int(expr_4E9:byte[expected:int], xor:int(ldc:int(38), ldc:int(34))), ldc:int(15))), ldc:int(88)))
                            
                            if (cmpne:boolean(var_4_4D5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BE_0 = stack_C0_0 = stack_ED_0 = stack_472_0 = stack_4E6_0 = var_3_4D4:byte[]
                    }
                }
                
                Label_0197:
                
                if (cmpne:boolean(and:int(var_0_A1:int, ldc:int(1)), ldc:int(0))) {
                    var_0_A1 = and:int(var_0_A1:int, ldc:int(-1561093610))
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_0_A1:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_A1 = and:int(var_0_A1:int, ldc:int(-1742681334))
            }
            
            var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_101 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12127), ldc:int(4251)))
            expr_10B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17691), ldc:int(123)))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(198), ldc:int(206)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(-15508), ldc:int(5267)), and:int(ldc:int(8564), ldc:int(-8565))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-32745), ldc:int(-32754)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(-26618), ldc:int(18393)), and:int(ldc:int(73), ldc:int(8461))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(799), ldc:int(778)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(1033), ldc:int(8985)), xor:int(ldc:int(20513), ldc:int(20489))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(22801), ldc:int(1651)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-32461), ldc:int(-32485)), xor:int(ldc:int(109), ldc:int(82))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(10269), ldc:int(10259)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(8244), ldc:int(8203)), xor:int(ldc:int(17480), ldc:int(17451))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(17119), ldc:int(2319)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8423), ldc:int(8051)), and:int(ldc:int(20629), ldc:int(10973))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(10329), ldc:int(11)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(181), ldc:int(6295)), xor:int(ldc:int(1243), ldc:int(1130))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(384), ldc:int(397)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(8371), ldc:int(4529)), xor:int(ldc:int(4632), ldc:int(4820))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(13325), ldc:int(332)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(2045), ldc:int(16588)), and:int(ldc:int(20735), ldc:int(763))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(12747), ldc:int(17935)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(17659), ldc:int(767)), xor:int(ldc:int(6895), ldc:int(7116))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-24184), ldc:int(-24190)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16997), ldc:int(17222)), xor:int(ldc:int(4386), ldc:int(4200))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(1112), ldc:int(10267)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(24906), ldc:int(5066)), xor:int(ldc:int(27285), ldc:int(27635))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(20618), ldc:int(20634)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(870), ldc:int(4463)), xor:int(ldc:int(5368), ldc:int(5496))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(263), ldc:int(256)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(1888), ldc:int(1760)), and:int(ldc:int(2959), ldc:int(17823))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(24607), ldc:int(1207)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16595), ldc:int(16732)), xor:int(ldc:int(-24464), ldc:int(-24116))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(2321), ldc:int(2327)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(667), ldc:int(807)), xor:int(ldc:int(1466), ldc:int(1148))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(6575), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(8513), ldc:int(8327)), and:int(ldc:int(2557), ldc:int(17887))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(15975), ldc:int(386)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(3193), ldc:int(3492)), and:int(ldc:int(2541), ldc:int(495))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(4752), ldc:int(4753)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(495), ldc:int(25581)), xor:int(ldc:int(9275), ldc:int(9786))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-32760), ldc:int(-32757)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(284), ldc:int(797)), xor:int(ldc:int(2139), ldc:int(2639))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(36), ldc:int(14668)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(26911), ldc:int(27403)), xor:int(ldc:int(4310), ldc:int(4860))))
            storeelement:String(expr_101:String[], and:int(ldc:int(27), ldc:int(1050)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(388), ldc:int(942)), xor:int(ldc:int(4476), ldc:int(4935))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(8215), ldc:int(18590)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(18171), ldc:int(8767)), xor:int(ldc:int(4160), ldc:int(4616))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-22263), ldc:int(-22246)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(20170), ldc:int(9084)), xor:int(ldc:int(10520), ldc:int(11128))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(16407), ldc:int(16387)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(872), ldc:int(9840)), xor:int(ldc:int(5629), ldc:int(6013))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-23935), ldc:int(-23917)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(2218), ldc:int(2602)), xor:int(ldc:int(1754), ldc:int(1116))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(-15635), ldc:int(15618)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(18658), ldc:int(19044)), xor:int(ldc:int(919), ldc:int(282))))
            putstatic:String[](\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u52d3\u8308\uceb8\ubded\u6198\u7043, expr_10B:String[])
            var_3_3EC = expr_101:String[]
            putstatic:Logger(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u9af2\uae5d\u36d3\u527a\uc87f\u7ce1, invokestatic:Logger(LogManager::getLogger))
            putstatic:Pattern(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\u385b\u4492\u8aa5\uc9f6\ub32d\u5d20, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_3EC:String[], xor:int(ldc:int(150), ldc:int(140)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u97e6\u62da\u416d\u1833\u839e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
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
        var_3_66D = and:int(ldc:int(744117098), ldc:int(-1414171676))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(-374611983))
            var_5_81 = and:int(ldc:int(25354), ldc:int(-25387))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(32308), ldc:int(-32567)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_66D:int, ldc:int(-1352420702))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(6210), ldc:int(6211)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_66D = and:int(var_3_D1:int, ldc:int(-1087930508))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(14883), ldc:int(17481)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1890593777))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1856344271))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-665608796))
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1202188909))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1112845635))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1489899137))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1915016834))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1963082215))
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-708070952))
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1439886558))
                            var_11_E2 = and:int(ldc:int(19745), ldc:int(-19810))
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0567:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-574875685))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1540218273))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1436516203))
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(173078191))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-60722243))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0840)
                        }
                    }
                    
                    Label_0691:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1307861224))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1260311586))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1916865832))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-327442322))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1760844059))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(677063260))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-405554581))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0840:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(981420049))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(697275434))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1030867784))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-985658847))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1339326851))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(25665), ldc:int(773))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-336012698))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-383731430))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1299390624))
                        var_11_E2 = and:int(ldc:int(20033), ldc:int(-20034))
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-32286449))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(276270483))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-499583328))
                            goto(Label_0840)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(650976522))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1740417696))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1648883568))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1238:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1469714796))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(578929704))
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0840)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-212591077))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(2112036999))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1564248430))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(564846456))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1487)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0840)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1218101769))
                        loopcontinue()
                    }
                    
                    var_3_66D = and:int(var_3_66D:int, ldc:int(-186171420))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_678 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-704128132))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-765762039))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-132404762))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1853536624))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1319031353))
                        goto(Label_0840)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1820608395))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1284735716))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-437053902))
                        var_17_678 = add:int(var_16_110:int, xor:int(ldc:int(2944), ldc:int(2945)))
                        looporswitchbreak()
                    }
                    
                    var_3_66D = and:int(var_3_66D:int, ldc:int(-2039107980))
                }
                
                var_3_66D = and:int(var_3_66D:int, ldc:int(-7908426))
                
                if (cmple:boolean(var_5_81 = var_17_678:int, sub:int(var_6_88:int, xor:int(ldc:int(4224), ldc:int(4225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
