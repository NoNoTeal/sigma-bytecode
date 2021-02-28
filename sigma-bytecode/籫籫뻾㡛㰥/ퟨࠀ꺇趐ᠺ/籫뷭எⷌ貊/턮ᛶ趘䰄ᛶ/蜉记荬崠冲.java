public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u8709\u8bb0\u836c\u5d20\u51b2 {
    public void \u8709\u8bb0\u836c\u5d20\u51b2() {
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
            invokespecial:Object(Object::<init>, this:\u8709\u8bb0\u836c\u5d20\u51b2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u647c\u72f1\u1833\u6bb9\u7049 \u7330\u7006\u92ff\u12cb\u88c5\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6c52\u9a18\u3504\u718f\u64f2\u6ec6 p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p3, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p4) {
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
    
    public static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \uc4d2\u624e\u1187\u071d\ub32d\u6b0d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p1) {
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
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\u983f\u7e3f\u4e72\u6cfe\u6435 \ua562\ub8be\u5140\u76bc\u64f2\ud12e(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_3_94 : \ucb79\u7ce1\ubded\u3d64\ub171
        
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
            
            if (cmpne:boolean(p0:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                var_3_94 = invokestatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u624e\u6cfe\u72f1\u6c52\u51fa\u9af2, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), and:int(ldc:int(1127), ldc:int(-1128)))), loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), and:int(ldc:int(8818), ldc:int(3094)))))
                
                if (cmpne:boolean(var_3_94:\ucb79\u7ce1\ubded\u3d64\ub171, aconstnull:\ucb79\u7ce1\ubded\u3d64\ub171())) {
                    return:\u983f\u7e3f\u4e72\u6cfe\u6435(invokevirtual:\u983f\u7e3f\u4e72\u6cfe\u6435(\ucb79\u7ce1\ubded\u3d64\ub171::\u839e\u927d\uc229\u34df\u93a2\u6c56, var_3_94:\ucb79\u7ce1\ubded\u3d64\ub171))
                }
            }
            
            return:\u983f\u7e3f\u4e72\u6cfe\u6435(getstatic:\u983f\u7e3f\u4e72\u6cfe\u6435(\u983f\u7e3f\u4e72\u6cfe\u6435::\u718f\u759a\ubb2b\u56bd\uae87\u3504))
        }
        
        goto(Label_0006)
    }
    
    private static void \u8cae\ucfaf\u8aa5\u8350\u98a4\ubded(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p1) {
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
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \uc3e3\ub102\u3bd6\ud7e8\ubefe\u67e9(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> p1, java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> p2) {
        var_3_61 : int
        var_5_69 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_72 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_7_7F : Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>
        var_8_E9 : Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>
        var_7_C9 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_D6 : Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>
        var_9_14E : Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>
        
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
            var_3_61 = and:int(ldc:int(-1685942568), ldc:int(-1224375307))
            var_5_69 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            var_6_72 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            var_7_7F = invokeinterface:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>(Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>::iterator, invokeinterface:Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::entrySet, p1:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>))
            
            loop {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(2077288306))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_7F:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>)) {
                        var_8_E9 = checkcast:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(java.util.Map.Entry<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>>.class, invokeinterface:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>::next, var_7_7F:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>>))
                        invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_6_72:\uc31c\uc87f\uc246\u3776\ub7dc, invokevirtual:String(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u4e72\u1833\u3a62\u5f50\u183a\u9af2, checkcast:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>.class, invokeinterface:\u5654\u9937\u72f1\ud4fe\u0c95<?>(Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::getKey, var_8_E9:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>))), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u34df\uceb8\u34df\u8640\u1187<C>::\u6c56\u7e3f\ubb2b\u385b\u92ee\ud4fe, checkcast:\u34df\uceb8\u34df\u8640\u1187<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>.class, invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::getValue, var_8_E9:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>)), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_61 = and:int(var_3_61:int, ldc:int(-824562428))
            }
            
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), and:int(ldc:int(18147), ldc:int(37))), var_6_72:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            var_7_C9 = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
            var_8_D6 = invokeinterface:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>(Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>::iterator, invokeinterface:Set<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>::entrySet, p2:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_D6:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>)) {
                var_9_14E = checkcast:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(java.util.Map.Entry<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet>.class, invokeinterface:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>(Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>::next, var_8_D6:Iterator<Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>>))
                invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_7_C9:\uc31c\uc87f\uc246\u3776\ub7dc, invokevirtual:String(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u4e72\u1833\u3a62\u5f50\u183a\u9af2, checkcast:\u5654\u9937\u72f1\ud4fe\u0c95<?>(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>.class, invokeinterface:\u5654\u9937\u72f1\ud4fe\u0c95<?>(Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>::getKey, var_9_14E:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>))), initobject:\u6c52\u8753\ud36e\ua562\ub113(\u6c52\u8753\ud36e\ua562\ub113::<init>, checkcast:LongSet(it.unimi.dsi.fastutil.longs.LongSet.class, invokeinterface:LongSet(Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>::getValue, var_9_14E:Entry<\u5654\u9937\u72f1\ud4fe\u0c95<?>, LongSet>))))
            }
            
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_69:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), xor:int(ldc:int(-30693), ldc:int(-30663))), var_7_C9:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            return:\uc31c\uc87f\uc246\u3776\ub7dc(var_5_69:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u873d\u56bd\u4492\u7049\u56bd\u97e6(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, long p2) {
        var_4_F5 : int
        var_6_68 : HashMap
        var_7_79 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_8_85 : Iterator<String>
        var_9_CF : String
        var_10_D9 : String
        var_11_E8 : \u5654\u9937\u72f1\ud4fe\u0c95
        var_12_103 : \u34df\uceb8\u34df\u8640\u1187<?>
        
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
            var_4_F5 = and:int(ldc:int(1922689684), ldc:int(598697553))
            var_6_68 = invokestatic:HashMap(Maps::newHashMap)
            var_7_79 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), xor:int(ldc:int(5662), ldc:int(5695))))
            var_8_85 = invokeinterface:Iterator<String>(Set<String>::iterator, invokevirtual:Set<String>(\uc31c\uc87f\uc246\u3776\ub7dc::\ua068\u92ff\u873d\u9033\u99f7\ubefe, var_7_79:\uc31c\uc87f\uc246\u3776\ub7dc))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_F5:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_F5 = and:int(var_4_F5:int, ldc:int(779796213))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_85:Iterator<String>)) {
                        var_9_CF = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_8_85:Iterator<String>))
                        var_10_D9 = invokevirtual:String(String::toLowerCase, var_9_CF:String, getstatic:Locale(Locale::ROOT))
                        var_11_E8 = checkcast:\u5654\u9937\u72f1\ud4fe\u0c95(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95.class, invokeinterface:Object[expected:\u5654\u9937\u72f1\ud4fe\u0c95](BiMap::get, getstatic:BiMap<String, \u5654\u9937\u72f1\ud4fe\u0c95<?>>(\u5654\u9937\u72f1\ud4fe\u0c95::\ub1b9\uc229\ub6ab\ud51e\u624e\u6bb9), var_10_D9:String[expected:Object]))
                        
                        if (cmpne:boolean(var_11_E8:\u5654\u9937\u72f1\ud4fe\u0c95, aconstnull:\u5654\u9937\u72f1\ud4fe\u0c95())) {
                            var_4_F5 = and:int(var_4_F5:int, ldc:int(-282089793))
                            var_12_103 = invokestatic:\u34df\uceb8\u34df\u8640\u1187<?>(\u5654\u9937\u72f1\ud4fe\u0c95<C>::\u59ec\ufe34\u72f1\u56bd\ub32d\u71ae, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_7_79:\uc31c\uc87f\uc246\u3776\ub7dc, var_9_CF:String), p2:long)
                            
                            if (cmpne:boolean(var_12_103:\u34df\uceb8\u34df\u8640\u1187<?>, aconstnull:\u34df\uceb8\u34df\u8640\u1187<?>())) {
                                invokeinterface:\u34df\uceb8\u34df\u8640\u1187<?>(Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>::put, var_6_68:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>[expected:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>], var_11_E8:\u5654\u9937\u72f1\ud4fe\u0c95<?>, var_12_103:\u34df\uceb8\u34df\u8640\u1187<?>)
                            }
                        }
                        else {
                            invokeinterface:void(Logger::error, getstatic:Logger(\u8709\u8bb0\u836c\u5d20\u51b2::\ua068\u6b5f\u5140\uc87f\u7ce1\u8389), loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), xor:int(ldc:int(-28618), ldc:int(-28651))), var_10_D9:String[expected:Object])
                        }
                        
                        var_4_F5 = and:int(var_4_F5:int, ldc:int(1868327574))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_F5:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_F5 = and:int(var_4_F5:int, ldc:int(-472187598))
            }
            
            return:Map<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>(var_6_68:HashMap<\u5654\u9937\u72f1\ud4fe\u0c95<?>, \u34df\uceb8\u34df\u8640\u1187<?>>)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?>, it.unimi.dsi.fastutil.longs.LongSet> \u99f7\u6fb0\u71f1\u9033\u69d9\u7043(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
    
    public static \u36d3\u9033\u6b0d\u983f\u8d90.\ud158\u8308\u76bc\u0a06\ud36e \u4f52\ucb79\u97e6\u56bd\uc910\ufe34(it.unimi.dsi.fastutil.shorts.ShortList[] p0) {
        var_1_61 : int
        var_3_69 : \ud158\u8308\u76bc\u0a06\ud36e
        var_5_70 : int
        var_6_79 : int
        var_7_99 : ShortList
        var_8_A2 : \ud158\u8308\u76bc\u0a06\ud36e
        var_9_C1 : ShortListIterator
        
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
            var_1_61 = and:int(ldc:int(-1499070315), ldc:int(-1086458122))
            var_3_69 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            var_5_70 = arraylength:int(p0:ShortList[])
            var_6_79 = and:int(ldc:int(-21297), ldc:int(21296))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1268158759))
                
                if (cmpge:boolean(var_6_79:int, var_5_70:int)) {
                    looporswitchbreak()
                }
                
                var_7_99 = loadelement:ShortList(p0:ShortList[], var_6_79:int)
                var_8_A2 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
                
                if (cmpne:boolean(var_7_99:ShortList, aconstnull:ShortList())) {
                    var_9_C1 = invokeinterface:ShortListIterator(ShortList::iterator, var_7_99:ShortList)
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_9_C1:ShortListIterator)) {
                        invokevirtual:boolean(AbstractList<\u7043\uc87f\u4f52\u64ab\u8350>::add, var_8_A2:AbstractList<\u7043\uc87f\u4f52\u64ab\u8350>, invokestatic:\u7043\uc87f\u4f52\u64ab\u8350(\u7043\uc87f\u4f52\u64ab\u8350::\u47c2\u8709\u494c\ub7dc\uc7fe\u4ab3, invokevirtual:short(Short::shortValue, checkcast:Short(java.lang.Short.class, invokeinterface:Short(Iterator<Short>::next, var_9_C1:Iterator<Short>)))))
                    }
                }
                
                invokevirtual:boolean(AbstractList<\ud158\u8308\u76bc\u0a06\ud36e>::add, var_3_69:AbstractList<\ud158\u8308\u76bc\u0a06\ud36e>, var_8_A2:\ud158\u8308\u76bc\u0a06\ud36e)
                inc:int(var_6_79, ldc:int(1))
            }
            
            return:\ud158\u8308\u76bc\u0a06\ud36e(var_3_69:\ud158\u8308\u76bc\u0a06\ud36e)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud158\u6b0d\ua068\uae5d\u3c25\u527a$5(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, java.lang.String p1, long p2) {
        var_6_6D : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        
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
        var_6_6D = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, p2:long)
        
        if (cmple:boolean(invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u98a4\ub102\u6cfe\u5bc4\u8df4\uae5d, var_6_6D:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(8))) {
            return:boolean(xor:int[expected:boolean](ldc:int(17413), ldc:int(17412)))
        }
        
        invokeinterface:void(Logger::warn, getstatic:Logger(\u8709\u8bb0\u836c\u5d20\u51b2::\ua068\u6b5f\u5140\uc87f\u7ce1\u8389), loadelement:String(getstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1), xor:int(ldc:int(1038), ldc:int(1066))), p1:String[expected:Object], var_6_6D:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
        return:boolean(and:int[expected:boolean](ldc:int(27928), ldc:int(-27929)))
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f lambda$\ube23\u8df4\u99f7\u0b8e\u72f1\u2dcc$4(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, p0:\ud523\u92ff\ubb2b\u759a\ud36e, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:\u7d52\u718f\u3776\u6fb0\ub83f(p1:\u7d52\u718f\u3776\u6fb0\ub83f)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3776\u64f2\u3711\u3e2a\u0b8e\u7873$3(int p0, \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\u6198\u6bb9\u4492\u965f p1) {
        var_2_61 : int
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
            var_2_61 = and:int(ldc:int(-869376793), ldc:int(-983155441))
            
            if (logicaland:boolean(cmpne:boolean(p1:\uc29a\u6198\u6bb9\u4492\u965f, aconstnull:\uc29a\u6198\u6bb9\u4492\u965f()), cmpeq:boolean(shr:int(invokevirtual:int(\uc29a\u6198\u6bb9\u4492\u965f::\u3e2a\u983f\u8350\u98a4\u6fb0\ub70c, p1:\uc29a\u6198\u6bb9\u4492\u965f), xor:int(ldc:int(97), ldc:int(101))), p0:int))) {
                stack_9E_0 = and:int(ldc:int(3081), ldc:int(16529))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-898900959))
                stack_9E_0 = and:int(ldc:int(717), ldc:int(-718))
            }
            
            return:boolean(stack_9E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud4fe\u3bd6\u8640\u0a06\u3c25\u983f$2(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p1) {
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
            invokestatic:void(\u8709\u8bb0\u836c\u5d20\u51b2::\u8cae\ucfaf\u8aa5\u8350\u98a4\ubded, p0:\uc31c\uc87f\uc246\u3776\ub7dc, p1:\ud523\u92ff\ubb2b\u759a\ud36e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8389\ud51e\u8640\u4179\u98a4\ucfaf$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, aconstnull:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f()), cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f))), and:int(ldc:int(-19966), ldc:int(3296)), and:int(ldc:int(323), ldc:int(4285))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u927d\u516c\uc87f\u64f2\u3e75\u600f$0(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a()), logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))), and:int(ldc:int(2454), ldc:int(-6551)), and:int(ldc:int(8843), ldc:int(337))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5D6 : int
        expr_6E : int [generated]
        stack_AD_0 : byte[] [generated]
        stack_AF_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_F0_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_128_0 : byte[] [generated]
        stack_172_0 : byte[] [generated]
        stack_174_0 : byte[] [generated]
        stack_1A9_0 : byte[] [generated]
        stack_5FA_0 : byte[] [generated]
        stack_648_0 : byte[] [generated]
        stack_6F1_0 : byte[] [generated]
        stack_742_0 : byte[] [generated]
        stack_798_0 : byte[] [generated]
        var_4_5C1 : int
        var_3_5C6 : byte[]
        var_5_5C7 : int
        var_0_662 : int
        expr_648 : byte [generated]
        stack_69A_2 : byte [generated]
        stack_66E_0 : byte [generated]
        expr_6F1 : byte [generated]
        expr_AF : int [generated]
        expr_F0 : int [generated]
        var_2_126 : byte[]
        expr_12A : int [generated]
        var_3_730 : byte[]
        var_5_731 : int
        expr_174 : int [generated]
        var_3_786 : byte[]
        var_5_787 : int
        var_3_1B5 : String
        stack_5B4_0 : String[] [generated]
        expr_1C7 : String[] [generated]
        
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
        var_0_5D6 = and:int(ldc:int(200121099), ldc:int(534703855))
        expr_6E = arraylength:int(stack_AD_0 = stack_AF_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NLmvtXV293K297OyeDTzNzix83iwdv0y9Xaxdzp0LjpztvJ4M3Q0B712+HV29TZC+GC+NahBu+qCN6TzBmgwdjSjRLp29bhm8Lb1Qn/6s3dl6DU5MbY1BMIKNS+gZKQ3OboINu/DQ+Y0+DfoL3924bW27Kq9sTbzv7MwNjJ2c/w3Nq438rPIfna386by9Yd6cfOzoTW0tfUJtXb5+OVxOLO2BXl4eO/v9bv19fX1rvU6aYE0NXRz5kO1MQP1nbR5a3b68/eyM7C1M7k5/XO2NGj1t/XrwnMz6fw0efUB7rWwuTP19Lk08zwsdLO1d/8q93p1Mvf1cXJ3/3Msd6+1rMD4u/UBK3W09fH89OxzNvUqffX5uT21djJ1LXi2NzJAs7b1tWo39TF3/rPxLnVybXcAtTY0MnZz9f0uMDn1dP0uMHb1+by19fnx7fh29XB/MrYx/Dc2Krg09azAdzZy9XQtdqzA+Lv1Aeoy9bMzfQW3tLM2IzW0tfUJtTY1OaIAQ/pvMp1nNDf8QbitOTC26Lxx7/OCNbQ1tPS2ubxsd3Z0uABxs/Tx87greLW38Lspt3K1dXus9ocGBoxDNA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_5C1 = expr_6E:int
        var_3_5C6 = newarray:byte[](byte.class, expr_6E:int)
        var_5_5C7 = expr_6E:int
        Label_1481:
        
        while (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(512)), ldc:int(0))) {
                var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1950840231))
                goto(Label_1577)
            }
            
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1879253253))
            var_5_5C7 = add:int(var_5_5C7:int, ldc:int(-1))
            storeelement:byte(var_3_5C6:byte[], var_5_5C7:int, add:byte(loadelement:byte(stack_5FA_0:byte[], var_5_5C7:int), ldc:byte(11)))
            
            if (cmpne:boolean(var_5_5C7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = var_3_5C6:byte[]
            goto(Label_0115)
        }
        
        var_0_5D6 = and:int(var_0_5D6:int, ldc:int(2136614717))
        goto(Label_1728)
        Label_1577:
        
        while (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_1481)
            }
            
            var_0_662 = and:int(var_0_5D6:int, ldc:int(-1417896073))
            var_5_5C7 = add:int(var_5_5C7:int, ldc:int(-1))
            expr_648 = stack_69A_2 = loadelement(stack_648_0, var_5_5C7)
            
            if (cmplt:boolean(add:int(add:int(var_5_5C7:int, ldc:int(5)), neg:int(var_4_5C1:int)), ldc:int(0))) {
                stack_69A_2 = stack_66E_0 = add:byte(expr_648:byte, loadelement:byte(var_3_5C6:byte[], add:int(var_5_5C7:int, ldc:int(5))))
                goto(Label_1662)
            }
            
            Label_1621:
            
            if (cmpne:boolean(and:int(var_0_662:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_662 = and:int(var_0_662:int, ldc:int(-643927798))
            }
            else {
                var_0_662 = and:int(var_0_662:int, ldc:int(-268526037))
                stack_69A_2 = stack_66E_0 = add:byte(expr_648:byte, ldc:byte(5))
            }
            
            Label_1662:
            
            if (cmpeq:boolean(and:int(var_0_662:int, ldc:int(262144)), ldc:int(0))) {
                var_0_662 = and:int(var_0_662:int, ldc:int(-636592996))
                goto(Label_1621)
            }
            
            var_0_5D6 = and:int(var_0_662:int, ldc:int(1061994391))
            storeelement:byte(var_3_5C6:byte[], var_5_5C7:int, stack_69A_2:byte)
            
            if (cmpne:boolean(var_5_5C7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = var_3_5C6:byte[]
            goto(Label_0180)
        }
        
        Label_1728:
        
        while (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(32768)), ldc:int(0))) {
                var_0_5D6 = and:int(var_0_5D6:int, ldc:int(1104119110))
                goto(Label_1481)
            }
            
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-880936167))
            var_5_5C7 = add:int(var_5_5C7:int, ldc:int(-1))
            expr_6F1 = loadelement:byte(stack_6F1_0:byte[], var_5_5C7:int)
            storeelement:byte(var_3_5C6:byte[], var_5_5C7:int, or:int(and:int(shl:int(expr_6F1:byte, and:int(ldc:int(9302), ldc:int(6828))), ldc:int(-16)), and:int(shr:int(expr_6F1:byte[expected:int], xor:int(ldc:int(16832), ldc:int(16836))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_5C7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AF_0 = stack_AD_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = var_3_5C6:byte[]
            goto(Label_0245)
        }
        
        var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1776467155))
        goto(Label_1577)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(239250784))
            goto(Label_0377)
        }
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1135811026))
            goto(Label_0245)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-76620925))
            expr_AF = arraylength:int(stack_AF_0:byte[])
            
            if (cmpne:boolean(expr_AF:int, ldc:int(0))) {
                var_4_5C1 = expr_AF:int
                var_3_5C6 = newarray:byte[](byte.class, expr_AF:int)
                var_5_5C7 = expr_AF:int
                goto(Label_1577)
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1627557256))
            goto(Label_0377)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(1835873219))
            goto(Label_0303)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(199092837))
            expr_F0 = arraylength:int(stack_F0_0:byte[])
            
            if (cmpne:boolean(expr_F0:int, ldc:int(0))) {
                var_4_5C1 = expr_F0:int
                var_3_5C6 = newarray:byte[](byte.class, expr_F0:int)
                var_5_5C7 = expr_F0:int
                goto(Label_1728)
            }
        }
        
        Label_0245:
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-2044589439))
            goto(Label_0377)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1888579729))
            var_2_126 = stack_126_0:byte[]
            expr_12A = add:int(arraylength:int(stack_128_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_12A:int, ldc:int(0))) {
                var_3_730 = newarray:byte[](byte.class, expr_12A:int)
                var_5_731 = expr_12A:int
                
                loop {
                    var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-546439297))
                    var_5_731 = add:int(var_5_731:int, ldc:int(-1))
                    storeelement:byte(var_3_730:byte[], var_5_731:int, add:int(shl:int(loadelement:byte(stack_742_0:byte[], var_5_731:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_126:byte[], add:int(var_5_731:int, and:int(ldc:int(25117), ldc:int(3201)))), ldc:int(2)), xor:int(ldc:int(793), ldc:int(806)))))
                    
                    if (cmpne:boolean(var_5_731:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = var_3_730:byte[]
            }
        }
        
        Label_0303:
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(1024)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-448706423))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0245)
            }
            
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(32768)), ldc:int(0))) {
                var_0_5D6 = and:int(var_0_5D6:int, ldc:int(886580205))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_5D6 = and:int(var_0_5D6:int, ldc:int(933825551))
                goto(Label_0115)
            }
            
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(-1352687647))
            expr_174 = arraylength:int(stack_174_0:byte[])
            
            if (cmpne:boolean(expr_174:int, ldc:int(0))) {
                var_3_786 = newarray:byte[](byte.class, expr_174:int)
                var_5_787 = expr_174:int
                
                loop {
                    var_0_5D6 = and:int(var_0_5D6:int, ldc:int(1540267709))
                    var_5_787 = add:int(var_5_787:int, ldc:int(-1))
                    storeelement:byte(var_3_786:byte[], var_5_787:int, xor:byte(loadelement:byte(stack_798_0:byte[], var_5_787:int), ldc:byte(34)))
                    
                    if (cmpne:boolean(var_5_787:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AF_0 = stack_AD_0 = stack_EE_0 = stack_F0_0 = stack_126_0 = stack_128_0 = stack_172_0 = stack_174_0 = stack_1A9_0 = stack_5FA_0 = stack_648_0 = stack_6F1_0 = stack_742_0 = stack_798_0 = var_3_786:byte[]
            }
        }
        
        Label_0377:
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0303)
        }
        
        if (cmpeq:boolean(and:int(var_0_5D6:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0245)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(16384)), ldc:int(0))) {
            var_0_5D6 = and:int(var_0_5D6:int, ldc:int(1967594118))
            goto(Label_0180)
        }
        
        if (cmpne:boolean(and:int(var_0_5D6:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_1B5 = initobject:String(String::<init>, stack_1A9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_5B4_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3373), ldc:int(4709)))
            expr_1C7 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17519), ldc:int(8229)))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(5665), ldc:int(5669)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(2126), ldc:int(-2127)), and:int(ldc:int(29215), ldc:int(1190))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(16461), ldc:int(783)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(14862), ldc:int(102)), xor:int(ldc:int(-12274), ldc:int(-12258))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(397), ldc:int(16398)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-28514), ldc:int(-28530)), xor:int(ldc:int(8460), ldc:int(8471))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(4618), ldc:int(4624)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(543), ldc:int(3131)), and:int(ldc:int(11055), ldc:int(4327))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(578), ldc:int(577)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-28395), ldc:int(-28366)), and:int(ldc:int(115), ldc:int(2939))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(21787), ldc:int(2175)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(64), ldc:int(51)), xor:int(ldc:int(201), ldc:int(183))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(1823), ldc:int(2103)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(2052), ldc:int(2170)), and:int(ldc:int(2710), ldc:int(142))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(21812), ldc:int(164)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(112), ldc:int(246)), and:int(ldc:int(16597), ldc:int(457))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(24627), ldc:int(5651)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(3281), ldc:int(1005)), and:int(ldc:int(8411), ldc:int(18891))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(314), ldc:int(309)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(8361), ldc:int(8290)), and:int(ldc:int(8440), ldc:int(5596))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(380), ldc:int(10397)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(4343), ldc:int(4143)), and:int(ldc:int(16614), ldc:int(250))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(-17584), ldc:int(17581)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(242), ldc:int(1762)), xor:int(ldc:int(353), ldc:int(390))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(24601), ldc:int(537)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(540), ldc:int(763)), xor:int(ldc:int(756), ldc:int(537))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(1), ldc:int(16)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(17126), ldc:int(16907)), and:int(ldc:int(17400), ldc:int(252))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(17679), ldc:int(519)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(1272), ldc:int(16632)), and:int(ldc:int(16713), ldc:int(777))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(16427), ldc:int(651)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8457), ldc:int(16777)), xor:int(ldc:int(17802), ldc:int(17562))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(11), ldc:int(29)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(38), ldc:int(310)), xor:int(ldc:int(18685), ldc:int(18915))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(2050), ldc:int(2080)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(286), ldc:int(1310)), xor:int(ldc:int(16701), ldc:int(16405))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(93), ldc:int(553)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-8037), ldc:int(-7757)), xor:int(ldc:int(18221), ldc:int(17949))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(19), ldc:int(29)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(304), ldc:int(21498)), and:int(ldc:int(4412), ldc:int(1339))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(2213), ldc:int(12337)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(377), ldc:int(2874)), and:int(ldc:int(9022), ldc:int(319))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(2053), ldc:int(2071)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(894), ldc:int(15806)), xor:int(ldc:int(16538), ldc:int(16862))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(1428), ldc:int(2077)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(-24390), ldc:int(-24066)), and:int(ldc:int(16718), ldc:int(366))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(8408), ldc:int(5146)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(2382), ldc:int(25438)), xor:int(ldc:int(4254), ldc:int(4548))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(4109), ldc:int(4125)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(346), ldc:int(1882)), xor:int(ldc:int(4131), ldc:int(4416))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(6), ldc:int(10838)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(604), ldc:int(831)), xor:int(ldc:int(4267), ldc:int(4550))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(2211), ldc:int(4907)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(15725), ldc:int(16767)), and:int(ldc:int(440), ldc:int(3018))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(2753), ldc:int(2756)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(2378), ldc:int(2242)), xor:int(ldc:int(2568), ldc:int(2971))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(6), ldc:int(12)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(2395), ldc:int(2248)), xor:int(ldc:int(25387), ldc:int(25279))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(17415), ldc:int(17423)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(8607), ldc:int(468)), and:int(ldc:int(4029), ldc:int(20893))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(2837), ldc:int(2824)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(43), ldc:int(438)), xor:int(ldc:int(8223), ldc:int(8632))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(8273), ldc:int(8260)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(13446), ldc:int(13601)), and:int(ldc:int(16821), ldc:int(8177))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(-28414), ldc:int(-28388)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(2836), ldc:int(2725)), xor:int(ldc:int(16544), ldc:int(16658))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(785), ldc:int(31873)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(4530), ldc:int(9722)), and:int(ldc:int(9655), ldc:int(438))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(284), ldc:int(259)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(3291), ldc:int(3437)), and:int(ldc:int(4023), ldc:int(25079))))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(32), ldc:int(555)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(21091), ldc:int(21460)), and:int(ldc:int(1464), ldc:int(506))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(-22524), ldc:int(-22522)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(306), ldc:int(138)), and:int(ldc:int(25084), ldc:int(446))))
            putstatic:String[](\u8709\u8bb0\u836c\u5d20\u51b2::\uf995\u3504\u516c\ucb79\u7049\u71f1, expr_1C7:String[])
            putstatic:Logger(\u8709\u8bb0\u836c\u5d20\u51b2::\ua068\u6b5f\u5140\uc87f\u7ce1\u8389, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \uae5d\u3bd6\ub6ab\u6c56\u6c52\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(413580428), ldc:int(-1672505265))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\u8bb0\u836c\u5d20\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-661940163))
            var_5_81 = and:int(ldc:int(26440), ldc:int(-26441))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20826), ldc:int(-23931)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67B:int, ldc:int(1051631517))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-32766), ldc:int(-32765)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(19205), ldc:int(1155)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DA:int, ldc:int(1505663629))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1), ldc:int(2821)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-865353052))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1718194630))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(104173425))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2130884748))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1212292984))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1452293260))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-831457600))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1032822366))
                            var_11_EB = and:int(ldc:int(19553), ldc:int(-27746))
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-196021058))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(556746841))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-945252961))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-638140583))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(575329305))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1188271107))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-698773469))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1587252111))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2140855791))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2120012366))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-88296195))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1011435939))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1259925087))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-102884783))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2036587005))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(97), ldc:int(8205))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-730372719))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-943472630))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1928657984))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1504689339))
                        var_11_EB = and:int(ldc:int(-32296), ldc:int(12839))
                    }
                    
                    Label_1092:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1282246446))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-770382976))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2023450726))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1911070486))
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1115466190))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2018245016))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2069040407))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(537274521))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1092)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(31566565))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1699333416))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1511701411))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1128809360))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-553402994))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1535)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2085674021))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2080073005))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-162251517))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(56780853))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(841905674))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(101954601))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-587530387))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(87234508))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1024168996))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1259980616))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1867191182))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1627677094))
                        var_17_686 = add:int(var_16_119:int, xor:int(ldc:int(39), ldc:int(38)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1139893079))
                
                if (cmple:boolean(var_5_81 = var_17_686:int, sub:int(var_6_88:int, and:int(ldc:int(4643), ldc:int(3473))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-998787077))
            goto(Label_0108)
        }
    }
}
