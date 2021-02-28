public class \u3d64\u7af6\uae87\uc238\u7d52.\u4daf\u7043\uff55\u3d4b\u99f7 {
    public void \u4daf\u7043\uff55\u3d4b\u99f7() {
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
            invokespecial:Object(Object::<init>, this:\u4daf\u7043\uff55\u3d4b\u99f7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8389\u74b1\u759a\ua3b4\u647c\u4c2b(java.lang.String p0, \ub113\uc4d2\u183a\u527a\u6435.\u4179\uc229\u56bd\ub1b9\ubff1 p1, java.util.function.Predicate<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800> p2, net.minecraft.util.text.ITextComponent p3) {
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
            invokeinterface:\uf94d\u76bc\u416d\u3bc9\u3e75(Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::put, getstatic:Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>(\u4daf\u7043\uff55\u3d4b\u99f7::\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5), p0:String, initobject:\uf94d\u76bc\u416d\u3bc9\u3e75(\uf94d\u76bc\u416d\u3bc9\u3e75::<init>, p1:\u4179\uc229\u56bd\ub1b9\ubff1, p2:Predicate<\u8413\uc4d2\u839e\u965f\u0800>, p3:ITextComponent, aconstnull:\u527a\u51fa\ufe34\uc910\ud51e()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u4daf\ube23\u92ff\uf9c5\ud217\u960f() {
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
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\u4179\uc229\u56bd\ub1b9\ubff1 \u93a2\u4c04\ud51e\u4e72\u5d20\u7d52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0, java.lang.String p1, int p2) {
        var_5_6E : \uf94d\u76bc\u416d\u3bc9\u3e75
        
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
        var_5_6E = checkcast:\uf94d\u76bc\u416d\u3bc9\u3e75(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uf94d\u76bc\u416d\u3bc9\u3e75.class, invokeinterface:\uf94d\u76bc\u416d\u3bc9\u3e75(Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::get, getstatic:Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>(\u4daf\u7043\uff55\u3d4b\u99f7::\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5), p1:String[expected:Object]))
        
        if (cmpeq:boolean(var_5_6E:\uf94d\u76bc\u416d\u3bc9\u3e75, aconstnull:\uf94d\u76bc\u416d\u3bc9\u3e75())) {
            invokevirtual:void(StringReader::setCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), p2:int)
            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::createWithContext, getstatic:DynamicCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\u4cd9\uff55\u7ce1\u12cb\uc84e\ud523), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), p1:String[expected:Object]))
        }
        
        if (logicalnot:boolean(invokeinterface:boolean(Predicate<\u8413\uc4d2\u839e\u965f\u0800>::test, getfield:Predicate<\u8413\uc4d2\u839e\u965f\u0800>(\uf94d\u76bc\u416d\u3bc9\u3e75::\u4f4a\u6b5f\u5fe1\u9af2\ub1b9\u71f1, var_5_6E:\uf94d\u76bc\u416d\u3bc9\u3e75), p0:\u8413\uc4d2\u839e\u965f\u0800))) {
            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::createWithContext, getstatic:DynamicCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\u3e75\ub19c\uc229\u4e72\uf94d\u760c), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), p1:String[expected:Object]))
        }
        
        return:\u4179\uc229\u56bd\ub1b9\ubff1(getfield:\u4179\uc229\u56bd\ub1b9\ubff1(\uf94d\u76bc\u416d\u3bc9\u3e75::\u59ec\ube23\u99f7\u873d\u4c04\u4c04, var_5_6E:\uf94d\u76bc\u416d\u3bc9\u3e75))
    }
    
    public static void \u120d\u5245\u983f\u836c\ua068\u5bc4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        var_2_61 : int
        var_4_6C : String
        var_5_7B : Iterator<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>
        var_6_B2 : Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>
        
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
            var_2_61 = and:int(ldc:int(-1748027622), ldc:int(-857754305))
            var_4_6C = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p1:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
            var_5_7B = invokeinterface:Iterator<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>(Set<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>::iterator, invokeinterface:Set<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>(Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::entrySet, getstatic:Map<String, \uf94d\u76bc\u416d\u3bc9\u3e75>(\u4daf\u7043\uff55\u3d4b\u99f7::\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5)))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1457911595))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_7B:Iterator)) {
                        var_6_B2 = checkcast:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>(java.util.Map.Entry<java.lang.String, \u47c2\u2dcc\u12cb\ud171\u8c8a.\uf94d\u76bc\u416d\u3bc9\u3e75>.class, invokeinterface:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>(Iterator<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>::next, var_5_7B:Iterator<Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>>))
                        
                        if (invokeinterface:boolean(Predicate<\u8413\uc4d2\u839e\u965f\u0800>::test, getfield:Predicate<\u8413\uc4d2\u839e\u965f\u0800>(\uf94d\u76bc\u416d\u3bc9\u3e75::\u4f4a\u6b5f\u5fe1\u9af2\ub1b9\u71f1, checkcast:\uf94d\u76bc\u416d\u3bc9\u3e75(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uf94d\u76bc\u416d\u3bc9\u3e75.class, invokeinterface:\uf94d\u76bc\u416d\u3bc9\u3e75(Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::getValue, var_6_B2:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>))), p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                            if (invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toLowerCase, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::getKey, var_6_B2:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>)), getstatic:Locale(Locale::ROOT)), var_4_6C:String)) {
                                invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p1:SuggestionsBuilder, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::getKey, var_6_B2:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>))), ldc:char(61))), getfield:ITextComponent(\uf94d\u76bc\u416d\u3bc9\u3e75::\u4f52\uff55\u4ab3\u8308\ube23\u9255, checkcast:\uf94d\u76bc\u416d\u3bc9\u3e75(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uf94d\u76bc\u416d\u3bc9\u3e75.class, invokeinterface:\uf94d\u76bc\u416d\u3bc9\u3e75(Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>::getValue, var_6_B2:Entry<String, \uf94d\u76bc\u416d\u3bc9\u3e75>))))
                            }
                        }
                        
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1932036146))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u97e6\u3d4b\ubded\u7043\u9255\uae5d$63(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(4227), ldc:int(4226)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u8d90\u64ab\uc910\u59ec\u8d98\u3504$62(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u7330\u1833\ubb2b\u8258\uceb8\ube23$61(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_5_79 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_6_87 : \u67d0\u36d3\uae5d\u99f7\u9a18
        
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
        
        if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, p2:\u7d52\u718f\u3776\u6fb0\ub83f)))) {
            return:boolean(and:int[expected:boolean](ldc:int(-1491), ldc:int(1426)))
        }
        
        var_5_79 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\ube23\uc238\u5140\u4cd9\u8aa5](\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, p2:\u7d52\u718f\u3776\u6fb0\ub83f))
        var_6_87 = invokevirtual:\u67d0\u36d3\uae5d\u99f7\u9a18(\uae5d\u7af6\u52d3\u6c52\u839e::\u3a62\u1187\u3e75\u7330\u0a06\u156b, invokevirtual:\uae5d\u7af6\u52d3\u6c52\u839e(\u88c5\ud171\ub113\u6435\ud51e::\u3504\u624e\u0b8e\u965f\ubf56\uc4d2, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, var_5_79:\ube23\uc238\u5140\u4cd9\u8aa5)), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (cmpne:boolean(var_6_87:\u67d0\u36d3\uae5d\u99f7\u9a18, aconstnull:\u67d0\u36d3\uae5d\u99f7\u9a18())) {
            return:boolean(xor:boolean(p1:boolean, invokeinterface:boolean(Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>::test, var_6_87:\u67d0\u36d3\uae5d\u99f7\u9a18[expected:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>], invokevirtual:\uf9c5\u7043\u0c95\u76bc\u8389(\u6c52\ucfaf\uc910\u527a\uc9f6::\u2dcc\u494c\uf995\u6bb9\ud217\ub32d, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, initobject:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::<init>, var_5_79:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u7d52\u718f\u3776\u6fb0\ub83f>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8413\u64f2\u600f\u965f\u62da\ud171), p2:\u7d52\u718f\u3776\u6fb0\ub83f), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u759a\u3a62\uc229\uc84e\u61a4\u718f), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\u40a9\ua61f\u8258\u40a9\u99f7\u6d69)))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-20784), ldc:int(20527)))
    }
    
    private static boolean lambda$\u071d\u8350\uf9c5\u7330\uc229\u4c2b$60(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1129284268), ldc:int(531840253))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\ud171\u494c\u3d4b\uff55\ubcb0\u4bc8, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1589172564))
                stack_8A_0 = and:int(ldc:int(19394), ldc:int(-19395))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(144), ldc:int(145))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u9af2\u7bad\ub19c\u8c8a\u156b\ub83f$59(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\ub1b9\uc2e8\uc9f6\u8350\u3e75\u93a2$58(java.util.Map p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_2_61 : int
        var_2_6E : int
        var_4_73 : \u51fa\u6c52\u7330\u7330\u960f
        var_5_7A : \u98a4\u69d9\ub6ab\u5140\u6b5f\u392e
        var_6_84 : \u183a\u2dcc\u36d3\u8753\ua61f\ub8be
        var_7_91 : Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>
        var_8_CF : Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>
        var_9_E0 : \ucfaf\u836c\u836c\u120d\ua3b4\u92ff
        
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
        var_2_61 = and:int(ldc:int(-425834311), ldc:int(-151028289))
        
        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            var_2_6E = and:int(var_2_61:int, ldc:int(1476315319))
            var_4_73 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p1:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u51fa\u6c52\u7330\u7330\u960f])
            var_5_7A = invokevirtual:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e(\u51fa\u6c52\u7330\u7330\u960f::\u8640\u7c6b\ubefe\ua61f\u71ae\ub32d, var_4_73:\u51fa\u6c52\u7330\u7330\u960f)
            var_6_84 = invokevirtual:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be(\u88c5\ud171\ub113\u6435\ud51e::\uae87\ubff1\uc238\ud12e\u6d69\u67e9, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u7d52\u718f\u3776\u6fb0\ub83f::\ucb79\u7e3f\u0a06\uae5d\u760c\u3e2a, var_4_73:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            var_7_91 = invokeinterface:Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>(Set<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>::iterator, invokeinterface:Set<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>::entrySet, p0:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_7_91:Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>)) {
                var_8_CF = checkcast:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>(java.util.Map.Entry<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>.class, invokeinterface:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>(Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>::next, var_7_91:Iterator<Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>>))
                var_9_E0 = invokevirtual:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff(\u183a\u2dcc\u36d3\u8753\ua61f\ub8be::\u8308\uc4d2\u6fb0\ud36e\ua562\ub83f, var_6_84:\u183a\u2dcc\u36d3\u8753\ua61f\ub8be, checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>::getKey, var_8_CF:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>)))
                
                if (logicalor:boolean(cmpeq:boolean(var_9_E0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff, aconstnull:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff()), logicalnot:boolean(invokeinterface:boolean(Predicate<\u6435\u0800\uae87\uc2e8\uc31c\u4e72>::test, checkcast:Predicate(java.util.function.Predicate.class, invokeinterface:V[expected:Predicate<\u6435\u0800\uae87\uc2e8\uc31c\u4e72>](Entry<K, V>::getValue, var_8_CF:Entry<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, V>)), invokevirtual:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e::\uc4d2\u8413\uc2e8\u74b1\u9033\u36d3, var_5_7A:\u98a4\u69d9\ub6ab\u5140\u6b5f\u392e, var_9_E0:\ucfaf\u836c\u836c\u120d\ua3b4\u92ff))))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-5539), ldc:int(5536)))
                }
                
                var_2_6E = and:int(var_2_6E:int, ldc:int(-21001165))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(26753), ldc:int(1033)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-20360), ldc:int(2439)))
    }
    
    private static boolean lambda$\u16f6\u9af2\u3d4b\u69d9\u51fa\u7af6$57(boolean p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 p1) {
        var_2_61 : int
        stack_8B_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-436359182), ldc:int(-1766396430))
            
            if (cmpne:boolean(invokevirtual:boolean(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\uc84e\u3bc9\u760c\u5245\ua068\ud7e8, p1:\u6435\u0800\uae87\uc2e8\uc31c\u4e72), p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1243087373))
                stack_8B_0 = and:int(ldc:int(-24945), ldc:int(24928))
            }
            else {
                stack_8B_0 = and:int(ldc:int(17443), ldc:int(17))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u1833\u4e72\u4492\ubb2b\u3504\u9af2$56(java.util.Map p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 p1) {
        var_2_61 : int
        var_4_6D : Iterator<Entry<String, V>>
        var_2_7C : int
        var_5_BD : Entry<String, V>
        var_6_CD : \u6c56\u4179\u760c\u71ae\ua6bd\u2dcc
        
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
        var_2_61 = and:int(ldc:int(-1559837530), ldc:int(-1776294162))
        var_4_6D = invokeinterface:Iterator<Entry<String, V>>(Set<Entry<String, V>>::iterator, invokeinterface:Set<Entry<String, V>>(Map<String, V>::entrySet, p0:Map<String, V>))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                var_2_7C = and:int(var_2_61:int, ldc:int(-906885711))
            }
            else {
                var_2_7C = and:int(var_2_61:int, ldc:int(1178561674))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6D:Iterator<Entry<String, V>>)) {
                    var_5_BD = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_4_6D:Iterator<Entry<String, V>>))
                    var_6_CD = invokevirtual:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\u36d3\u12cb\u2dcc\u7ce1\u6c52\u8c8a, p1:\u6435\u0800\uae87\uc2e8\uc31c\u4e72, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_5_BD:Entry<String, V>)))
                    
                    if (logicaland:boolean(cmpne:boolean(var_6_CD:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc, aconstnull:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc()), invokeinterface:boolean(Predicate<\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc>::test, checkcast:Predicate(java.util.function.Predicate.class, invokeinterface:V[expected:Predicate<\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc>](Entry<K, V>::getValue, var_5_BD:Entry<String, V>)), var_6_CD:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc))) {
                        var_2_61 = and:int(var_2_7C:int, ldc:int(-1307320281))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(1013), ldc:int(-5110)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_7C:int, ldc:int(268435456)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(3089), ldc:int(3088)))
            }
            
            var_2_61 = and:int(var_2_7C:int, ldc:int(-2010302951))
        }
    }
    
    private static boolean lambda$\u760c\uff55\ud158\ub8be\uc9f6\uff55$55(boolean p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc p1) {
        var_2_61 : int
        stack_8B_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1387627870), ldc:int(-1074826609))
            
            if (cmpne:boolean(invokevirtual:boolean(\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc::\u5140\u965f\u5d20\ub32d\ud523\u7006, p1:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc), p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-47188762))
                stack_8B_0 = and:int(ldc:int(-22475), ldc:int(22472))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(8466), ldc:int(8467))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7006\u527a\u3e2a\u3e2a\u97b7\u16f6$54(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1807356755), ldc:int(-959108929))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u3776\ua61f\ub70c\u47c2\uceb8\ubcb0, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1828169981))
                stack_8A_0 = and:int(ldc:int(7184), ldc:int(-7185))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(2104), ldc:int(2105))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud36e\u8709\u6cfe\u3e2a\ua3b4\u4179$53(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u5d20\u3504\uc229\uc87f\u7330\u64f2$52(java.util.Map p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_2_E8 : int
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_5_6F : String
        var_6_7C : Iterator<Entry<String, V>>
        var_7_C3 : Entry<String, V>
        var_8_D4 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_2_10B : int
        
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
        var_2_E8 = and:int(ldc:int(-860252871), ldc:int(1862260575))
        var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u7d52\u718f\u3776\u6fb0\ub83f::\ucb79\u7e3f\u0a06\uae5d\u760c\u3e2a, p1:\u7d52\u718f\u3776\u6fb0\ub83f))
        var_5_6F = invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
        var_6_7C = invokeinterface:Iterator<Entry<String, V>>(Set<Entry<String, V>>::iterator, invokeinterface:Set<Entry<String, V>>(Map<String, V>::entrySet, p0:Map<String, V>))
        
        loop {
            if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_E8 = and:int(var_2_E8:int, ldc:int(1740437401))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_7C:Iterator<Entry<String, V>>)) {
                    var_7_C3 = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_6_7C:Iterator<Entry<String, V>>))
                    var_8_D4 = invokevirtual:\u4c04\u34df\ua3b4\uc29a\ub70c(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6cfe\ubefe\u6d69\uc4d2\uae5d\u7d52, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_7_C3:Entry<String, V>)))
                    
                    if (cmpeq:boolean(var_8_D4:\u4c04\u34df\ua3b4\uc29a\ub70c, aconstnull:\u4c04\u34df\ua3b4\uc29a\ub70c())) {
                        return:boolean(and:int[expected:boolean](ldc:int(20130), ldc:int(-20216)))
                    }
                    
                    do {
                        if (cmpeq:boolean(and:int(var_2_E8:int, ldc:int(256)), ldc:int(0))) {
                            var_2_E8 = and:int(var_2_E8:int, ldc:int(1433022))
                        }
                        else {
                            var_2_E8 = and:int(var_2_E8:int, ldc:int(-554158605))
                            
                            if (invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_5_6F:String, var_8_D4:\u4c04\u34df\ua3b4\uc29a\ub70c)) {
                                loopcontinue()
                            }
                            
                            return:boolean(and:int[expected:boolean](ldc:int(25172), ldc:int(-25429)))
                        }
                    } while (cmpne:boolean(and:int(var_2_E8:int, ldc:int(268435456)), ldc:int(0)))
                    
                    var_2_10B = and:int(var_2_E8:int, ldc:int(2109593043))
                    
                    if (invokevirtual:boolean(\ub83f\u0800\u183a\u3dd3\u647c\uc4d2::\uc3e3\u6ec6\u4bc8\ube23\u64f2\uc84e, checkcast:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub83f\u0800\u183a\u3dd3\u647c\uc4d2.class, invokeinterface:V[expected:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2](Entry<K, V>::getValue, var_7_C3:Entry<String, V>)), invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_5_6F:String, var_8_D4:\u4c04\u34df\ua3b4\uc29a\ub70c)))) {
                        var_2_E8 = and:int(var_2_10B:int, ldc:int(1840903121))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-573), ldc:int(572)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(1073741824)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(5281), ldc:int(8205)))
            }
            
            var_2_E8 = and:int(var_2_E8:int, ldc:int(1690765883))
        }
    }
    
    private static boolean lambda$\u8c8a\ud217\u76bc\u93a2\u527a\uae5d$51(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(-24056), ldc:int(-24055)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u4c04\u0a06\u6c56\u72f1\ub19c\uc7fe$50(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u8df4\uc910\u4179\ubcb0\ud7e8\u600f$49(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_AB : int
        var_5_6D : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_C4 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_106_0 : int [generated]
        
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
            var_3_AB = and:int(ldc:int(1562710516), ldc:int(-168840708))
            var_5_6D = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u7d52\u718f\u3776\u6fb0\ub83f::\u0b8e\u98a4\u7873\ub6ab\u2dcc\uc31c, p2:\u7d52\u718f\u3776\u6fb0\ub83f, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p2:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_6_C4 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u59ec\u93a2\u9255\u5245\ud158\u3e2a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\u51fa\u6c52\u7330\u7330\u960f::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p2:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u51fa\u6c52\u7330\u7330\u960f])))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_6_C4:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                    invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_5_6D:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(9274), ldc:int(4267))), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ua61f\u7ce1\u16f6\u927d\u5f50\u156b, var_6_C4:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)))
                }
            }
            
            do {
                if (cmpne:boolean(and:int(var_3_AB:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_AB = and:int(var_3_AB:int, ldc:int(1264670622))
                }
                else {
                    var_3_AB = and:int(var_3_AB:int, ldc:int(-975323535))
                    
                    if (cmpeq:boolean(invokestatic:boolean(\u946b\u92ee\u6fb0\ua6bd\ubefe::\u3a62\u8413\u4f4a\ub83f\uc910\u3d64, p0:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], var_5_6D:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], and:int[expected:boolean](ldc:int(4625), ldc:int(1155))), p1:boolean)) {
                        loopcontinue()
                    }
                    
                    stack_106_0 = and:int[expected:boolean](ldc:int(2337), ldc:int(1681))
                    return:boolean(stack_106_0:boolean)
                }
            } while (cmpeq:boolean(and:int(var_3_AB:int, ldc:int(2147483647)), ldc:int(0)))
            
            var_3_AB = and:int(var_3_AB:int, ldc:int(1839054199))
            stack_106_0 = and:int[expected:boolean](ldc:int(-27898), ldc:int(27673))
            return:boolean(stack_106_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud12e\ud12e\u3c25\u718f\u3711\u873d$48(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(1), ldc:int(24593)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u446c\uc31c\u760c\u873d\u1187\u120d$47(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u3d64\ud4fe\u7049\u0800\u156b\ubff1$46(java.lang.String p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_BF : int
        stack_115_0 : int [generated]
        stack_127_0 : int [generated]
        
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
            var_3_BF = and:int(ldc:int(-66027728), ldc:int(-315149523))
            
            if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), xor:int(ldc:int(4097), ldc:int(4138))), p0:String[expected:Object])) {
                if (cmpeq:boolean(invokeinterface:boolean(Set<E>::isEmpty, invokevirtual:Set<String>(\u7d52\u718f\u3776\u6fb0\ub83f::\u0a06\uc4d2\uff55\ua068\u6435\ucef1, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), p1:boolean)) {
                    goto(Label_0219)
                }
                
                stack_115_0 = xor:int[expected:boolean](ldc:int(1217), ldc:int(1216))
                return:boolean(stack_115_0:boolean)
            }
            
            Label_0116:
            
            if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0219)
            }
            
            if (cmpeq:boolean(and:int(var_3_BF:int, ldc:int(131072)), ldc:int(0))) {
                var_3_BF = and:int(var_3_BF:int, ldc:int(-337053702))
                
                if (cmpne:boolean(invokeinterface:boolean(Set<E>::contains, invokevirtual:Set<String>(\u7d52\u718f\u3776\u6fb0\ub83f::\u0a06\uc4d2\uff55\ua068\u6435\ucef1, p2:\u7d52\u718f\u3776\u6fb0\ub83f), p0:String[expected:Object]), p1:boolean)) {
                    stack_127_0 = and:int[expected:boolean](ldc:int(3329), ldc:int(24653))
                    return:boolean(stack_127_0:boolean)
                }
            }
            
            Label_0152:
            
            if (cmpeq:boolean(and:int(var_3_BF:int, ldc:int(8192)), ldc:int(0))) {
                var_3_BF = and:int(var_3_BF:int, ldc:int(708015665))
            }
            else {
                if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_BF = and:int(var_3_BF:int, ldc:int(-519614964))
                    goto(Label_0116)
                }
                
                var_3_BF = and:int(var_3_BF:int, ldc:int(-279071881))
                stack_127_0 = and:int[expected:boolean](ldc:int(5518), ldc:int(-5583))
                return:boolean(stack_127_0:boolean[expected:int])
            }
            
            Label_0219:
            
            if (cmpeq:boolean(and:int(var_3_BF:int, ldc:int(134217728)), ldc:int(0))) {
                var_3_BF = and:int(var_3_BF:int, ldc:int(-1749233710))
                goto(Label_0152)
            }
            
            if (cmpne:boolean(and:int(var_3_BF:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0116)
            }
            
            var_3_BF = and:int(var_3_BF:int, ldc:int(-395608715))
            stack_115_0 = and:int[expected:boolean](ldc:int(-24140), ldc:int(22026))
            return:boolean(stack_115_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ucef1\u839e\uc87f\u69d9\u98a4\u3d4b$45(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-897526375), ldc:int(-1442029573))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u9af2\u3e75\u71f1\ub32d\u0800, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1042517951))
                stack_8A_0 = and:int(ldc:int(6220), ldc:int(-22767))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(16458), ldc:int(16459))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u4492\u6bb9\u76bc\u12b2\ua6bd\u8bb0$44(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\ud523\u8709\u47c2\u3bc9\u3a62\uc3e3$43(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_61 : int
        stack_8F_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-287151726), ldc:int(-324536964))
            
            if (cmpeq:boolean(invokestatic:boolean(Objects::equals, p0:\u9255\u0c95\u4cd9\ube23\u760c[expected:Object], invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1554183522))
                stack_8F_0 = and:int(ldc:int(11274), ldc:int(-11275))
            }
            else {
                stack_8F_0 = and:int(ldc:int(12565), ldc:int(1131))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.exceptions.CommandSyntaxException lambda$\u3a62\u56bd\u71ae\ucfaf\u624e\ud12e$42(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0, int p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2) {
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
            invokevirtual:void(StringReader::setCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), p1:int)
            return:CommandSyntaxException(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::createWithContext, getstatic:DynamicCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\u51b2\u97e6\u9255\ub102\u946b\u97e6), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8aa5\u4c2b\ub8be\uc246\ub6ab\u5f50$41(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_61 : int
        stack_A2_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(1904202792), ldc:int(-243275738))
            
            if (cmpeq:boolean(invokeinterface:boolean(\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u3e2a\ub7dc\u1833\u6d69\u5fe1\u5245, invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u67d0\u7af6\ub1b9\u4daf\uc2e8\u8709, invokeinterface:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u88c5\uc2bd\u1833\u960f\u5db4\u4d85::\uf94d\u4492\u5140\uc29a\u6198\u88c5, invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u7d52\u718f\u3776\u6fb0\ub83f::\ucb79\u7e3f\u0a06\uae5d\u760c\u3e2a, p2:\u7d52\u718f\u3776\u6fb0\ub83f))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1129345051))
                stack_A2_0 = and:int(ldc:int(-496), ldc:int(455))
            }
            else {
                stack_A2_0 = xor:int(ldc:int(320), ldc:int(321))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u6d69\ud4fe\u8413\u6c52\ucef1\ubb2b$40(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, java.util.function.Consumer p2) {
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
            invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u9255\u0c95\u4cd9\ube23\u760c<?>>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873)), p1:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(33)))
            invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokeinterface:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u8d90\u183a\ub171\u59ec\u836c\u8413<T>::\u2dcc\u0b8e\u1833\u36d3\uc31c\uc7fe, invokestatic:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u624e\u6c56\uc84e\u5fe1\u47c2\u0800::\u4179\u392e\ufcaf\u6d99\u7873\u72f1)), p1:SuggestionsBuilder, loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(8749), ldc:int(7548))))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\uc3e3\u6b0d\u5245\ub171\u8389\u76bc, p0:\u8413\uc4d2\u839e\u965f\u0800))) {
                invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u9255\u0c95\u4cd9\ube23\u760c<?>>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873)), p1:SuggestionsBuilder)
                invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokeinterface:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u8d90\u183a\ub171\u59ec\u836c\u8413<T>::\u2dcc\u0b8e\u1833\u36d3\uc31c\uc7fe, invokestatic:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\u624e\u6c56\uc84e\u5fe1\u47c2\u0800::\u4179\u392e\ufcaf\u6d99\u7873\u72f1)), p1:SuggestionsBuilder, invokestatic:String(String::valueOf, ldc:char(35)))
            }
            
            return:CompletableFuture(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u72f1\u6b5f\u9af2\ua562\u6d69\u718f$39(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(2067516202), ldc:int(-1084501859))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u12cb\u12cb\ub70c\ucef1\u392e\u8d98, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2099243083))
                stack_8A_0 = and:int(ldc:int(-24684), ldc:int(24682))
            }
            else {
                stack_8A_0 = and:int(ldc:int(17697), ldc:int(8711))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u718f\u4daf\u5245\u88c5\u6b0d\u3dd3$38(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u120d\ua3b4\u836c\ua6bd\u8753\ubefe$37(java.lang.String p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_5_73 : \ub6ab\u4d85\u97e6\ud51e\u983f
        
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
        
        if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, p2:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            var_5_73 = invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, p2:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:boolean(ternaryop:int(cmpeq:boolean(invokevirtual:boolean(String::equals, ternaryop:String(cmpne:boolean(var_5_73:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f()), invokevirtual:String(\ub6ab\u4d85\u97e6\ud51e\u983f::\u8308\ua562\u4f52\u93a2\ubb2b\u4e72, var_5_73:\ub6ab\u4d85\u97e6\ud51e\u983f), loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(43), ldc:int(24955)))), p0:String[expected:Object]), p1:boolean), and:int(ldc:int(-24846), ldc:int(24845)), xor:int(ldc:int(-32687), ldc:int(-32688))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(2896), ldc:int(-2897)))
    }
    
    private static boolean lambda$\u3bd6\u4f52\u1833\u8c8a\u88c5\u97b7$36(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1524809976), ldc:int(-177733889))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u7873\ufe34\u7043\u8350\u4c04\u4ab3, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1617784097))
                stack_8A_0 = and:int(ldc:int(-28693), ldc:int(28692))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(1548), ldc:int(1549))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub19c\u12cb\ub6ab\u946b\uae87\u7c6b$35(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
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
    
    private static boolean lambda$\u8aa5\u960f\uc3e3\ud217\u4d85\u40a9$34(boolean p0, \u3504\ufe34\u600f\u6b0d\u69d9.\uf94d\u51b2\u1833\u34df\u1187 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_61 : int
        var_3_C2 : int
        var_5_79 : \uf94d\u51b2\u1833\u34df\u1187
        stack_12E_0 : int [generated]
        
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
        var_3_61 = and:int(ldc:int(-303642707), ldc:int(-1409613850))
        
        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p2:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            var_3_C2 = and:int(var_3_61:int, ldc:int(-453257740))
            var_5_79 = invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u8bb0\u36d3\u40a9\u836c\u7ce1::\u12b2\ud523\u4ab3\u97e6\ub18d\u9255, getfield:\u8bb0\u36d3\u40a9\u836c\u7ce1(\u51fa\u6c52\u7330\u7330\u960f::\ub8be\u3a62\u718f\u7330\u3711\ud36e, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p2:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u51fa\u6c52\u7330\u7330\u960f])))
            
            if (p0:boolean) {
                if (cmpeq:boolean(var_5_79:\uf94d\u51b2\u1833\u34df\u1187, p1:\uf94d\u51b2\u1833\u34df\u1187)) {
                    goto(Label_0230)
                }
                
                stack_12E_0 = and:int[expected:boolean](ldc:int(433), ldc:int(14917))
                return:boolean(stack_12E_0:boolean)
            }
            
            Label_0127:
            
            if (cmpeq:boolean(and:int(var_3_C2:int, ldc:int(2097152)), ldc:int(0))) {
                var_3_C2 = and:int(var_3_C2:int, ldc:int(1267544202))
                goto(Label_0230)
            }
            
            if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(64)), ldc:int(0))) {
                var_3_C2 = and:int(var_3_C2:int, ldc:int(-2068929418))
            }
            else {
                var_3_C2 = and:int(var_3_C2:int, ldc:int(-1528412196))
                
                if (cmpeq:boolean(var_5_79:\uf94d\u51b2\u1833\u34df\u1187, p1:\uf94d\u51b2\u1833\u34df\u1187)) {
                    stack_12E_0 = xor:int[expected:boolean](ldc:int(16673), ldc:int(16672))
                    return:boolean(stack_12E_0:boolean[expected:int])
                }
            }
            
            Label_0173:
            
            if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_C2 = and:int(var_3_C2:int, ldc:int(-538812506))
                    stack_12E_0 = and:int[expected:boolean](ldc:int(-5740), ldc:int(1579))
                    return:boolean(stack_12E_0:boolean[expected:int])
                }
                
                goto(Label_0127)
            }
            
            Label_0230:
            
            if (cmpne:boolean(and:int(var_3_C2:int, ldc:int(64)), ldc:int(0))) {
                var_3_C2 = and:int(var_3_C2:int, ldc:int(-2008571388))
                goto(Label_0173)
            }
            
            if (cmpeq:boolean(and:int(var_3_C2:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0127)
            }
            
            var_3_C2 = and:int(var_3_C2:int, ldc:int(-1088027))
            stack_12E_0 = and:int[expected:boolean](ldc:int(-26889), ldc:int(26888))
            return:boolean(stack_12E_0:boolean[expected:int])
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(18489), ldc:int(-19518)))
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ub113\u4492\u69d9\u97b7\u6bb9\u9937$33(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1, java.util.function.Consumer p2) {
        var_3_61 : int
        var_5_6C : String
        stack_96_0 : int [generated]
        var_3_95 : int
        var_6_96 : int
        var_7_9F : int
        var_8_C3 : \uf94d\u51b2\u1833\u34df\u1187[]
        var_9_C8 : int
        var_10_D1 : int
        var_11_142 : \uf94d\u51b2\u1833\u34df\u1187
        
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
        var_3_61 = and:int(ldc:int(-1924246706), ldc:int(-1765159089))
        var_5_6C = invokevirtual:String(String::toLowerCase, invokevirtual:String(SuggestionsBuilder::getRemaining, p1:SuggestionsBuilder), getstatic:Locale(Locale::ROOT))
        
        if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u9033\uc3e3\uf9c5\u8cae\u8df4\u927d, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
            var_3_61 = and:int(var_3_61:int, ldc:int(-544631113))
            stack_96_0 = and:int(ldc:int(-5015), ldc:int(5014))
        }
        else {
            stack_96_0 = and:int(ldc:int(129), ldc:int(7721))
        }
        
        var_3_95 = and:int(var_3_61:int, ldc:int(-958725353))
        var_6_96 = stack_96_0:int
        var_7_9F = xor:int(ldc:int(5696), ldc:int(5697))
        
        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_5_6C:String))) {
            if (cmpne:boolean(invokevirtual:char(String::charAt, var_5_6C:String, and:int(ldc:int(-1987), ldc:int(1922))), ldc:char(33))) {
                goto(Label_0235)
            }
            
            var_6_96 = and:int(ldc:int(-30030), ldc:int(29964))
            var_5_6C = invokevirtual:String(String::substring, var_5_6C:String, and:int(ldc:int(2199), ldc:int(8225)))
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_95:int, ldc:int(512)), ldc:int(0))) {
            var_8_C3 = invokestatic:\uf94d\u51b2\u1833\u34df\u1187[](\uf94d\u51b2\u1833\u34df\u1187::values)
            var_9_C8 = arraylength:int(var_8_C3:\uf94d\u51b2\u1833\u34df\u1187[])
            var_10_D1 = and:int(ldc:int(-23025), ldc:int(18928))
            
            while (cmplt:boolean(var_10_D1:int, var_9_C8:int)) {
                var_11_142 = loadelement:\uf94d\u51b2\u1833\u34df\u1187(var_8_C3:\uf94d\u51b2\u1833\u34df\u1187[], var_10_D1:int)
                
                if (cmpne:boolean(var_11_142:\uf94d\u51b2\u1833\u34df\u1187, getstatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\ubff1\u6ec6\u6b5f\u88c5\u3a62\ufcaf))) {
                    if (invokevirtual:boolean(String::startsWith, invokevirtual:String(String::toLowerCase, invokevirtual:String(\uf94d\u51b2\u1833\u34df\u1187::\uf94d\u183a\u446c\u71f1\u5654\u9033, var_11_142:\uf94d\u51b2\u1833\u34df\u1187), getstatic:Locale(Locale::ROOT)), var_5_6C:String)) {
                        if (cmpne:boolean(var_7_9F:int, ldc:int(0))) {
                            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p1:SuggestionsBuilder, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:char(33)), invokevirtual:String(\uf94d\u51b2\u1833\u34df\u1187::\uf94d\u183a\u446c\u71f1\u5654\u9033, var_11_142:\uf94d\u51b2\u1833\u34df\u1187))))
                        }
                        
                        if (cmpne:boolean(var_6_96:int, ldc:int(0))) {
                            invokevirtual:SuggestionsBuilder(SuggestionsBuilder::suggest, p1:SuggestionsBuilder, invokevirtual:String(\uf94d\u51b2\u1833\u34df\u1187::\uf94d\u183a\u446c\u71f1\u5654\u9033, var_11_142:\uf94d\u51b2\u1833\u34df\u1187))
                        }
                    }
                }
                
                inc:int(var_10_D1, ldc:int(1))
            }
            
            return:CompletableFuture(invokevirtual:CompletableFuture(SuggestionsBuilder::buildFuture, p1:SuggestionsBuilder))
        }
        
        var_3_95 = and:int(var_3_95:int, ldc:int(-102784640))
        Label_0235:
        
        if (cmpne:boolean(and:int(var_3_95:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_95 = and:int(var_3_95:int, ldc:int(-1386698833))
            var_7_9F = and:int(ldc:int(-23305), ldc:int(23304))
        }
        
        goto(Label_0169)
    }
    
    private static boolean lambda$\u183a\uc84e\u8258\u7e3f\ud523\u2dcc$32(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1760247979), ldc:int(1577910263))
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u34df\u5245\u6cfe\u983f\uc3e3\ube23, p0:\u8413\uc4d2\u839e\u965f\u0800), invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u873d\uff55\u7c6b\uff55\u8aa5\u600f, p0:\u8413\uc4d2\u839e\u965f\u0800)))) {
                stack_98_0 = and:int(ldc:int(1), ldc:int(28931))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-339478931))
                stack_98_0 = and:int(ldc:int(20024), ldc:int(-20025))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uf94d\u5d20\uc238\uc7fe\u97b7\u4daf$31(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static java.util.concurrent.CompletableFuture lambda$\ud217\u446c\ubcb0\u52d3\u8308\u7af6$30(com.mojang.brigadier.suggestion.SuggestionsBuilder p0, java.util.function.Consumer p1) {
        expr_69 : String[] [generated]
        
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
            expr_69 = newarray:String[](java.lang.String.class, xor:int(ldc:int(1027), ldc:int(1031)))
            storeelement:String(expr_69:String[], and:int(ldc:int(-25033), ldc:int(24968)), loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(16943), ldc:int(301))))
            storeelement:String(expr_69:String[], and:int(ldc:int(1107), ldc:int(16517)), loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(6335), ldc:int(8750))))
            storeelement:String(expr_69:String[], xor:int(ldc:int(55), ldc:int(53)), loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), xor:int(ldc:int(-30441), ldc:int(-30408))))
            storeelement:String(expr_69:String[], and:int(ldc:int(17411), ldc:int(6195)), loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(176), ldc:int(2165))))
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokestatic:List<String>(Arrays::asList, expr_69:String[]), p0:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8258\ua562\u927d\u3504\u5d20\ubded$29(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1306509445), ldc:int(-1100186769))
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u34df\u5245\u6cfe\u983f\uc3e3\ube23, p0:\u8413\uc4d2\u839e\u965f\u0800), invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\u59ec\u71ae\u4d85\ubefe\u76bc\ucb79, p0:\u8413\uc4d2\u839e\u965f\u0800)))) {
                stack_98_0 = xor:int(ldc:int(4928), ldc:int(4929))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(-470426757))
                stack_98_0 = and:int(ldc:int(1352), ldc:int(-1353))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ube23\ub18d\u5f50\u47c2\u071d\u9937$28(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_3_69 : int
        var_4_71 : int
        
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
        var_3_69 = invokevirtual:int(StringReader::getCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
        var_4_71 = invokevirtual:int(StringReader::readInt, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
        
        if (cmpge:boolean(var_4_71:int, xor:int(ldc:int(8704), ldc:int(8705)))) {
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\uc238\u6cfe\u47c2\u2dcc\u5245\uc2e8, p0:\u8413\uc4d2\u839e\u965f\u0800, var_4_71:int)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u64ab\u64ab\uc31c\ud171\u0800\uc246, p0:\u8413\uc4d2\u839e\u965f\u0800, xor:int[expected:boolean](ldc:int(1136), ldc:int(1137)))
            return:void()
        }
        
        invokevirtual:void(StringReader::setCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), var_3_69:int)
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\ub102\u8c8a\ud523\u5f50\u6cfe\u67d0), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
    }
    
    private static boolean lambda$\u7d52\u3e2a\u97e6\ua61f\u5d20\u3d64$27(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(980020271), ldc:int(-1141100883))
            
            if (cmpne:boolean(invokevirtual:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8413\uc4d2\u839e\u965f\u0800::\u8d90\ube23\u6fb0\uc29a\uafe7\u3dd3, p0:\u8413\uc4d2\u839e\u965f\u0800), getstatic:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8d90\u99f7\u8308\u6c52\ubf56\uf995::\ubcb0\u624e\u946b\u6c52\u9255\u120d))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1418118055))
                stack_8D_0 = and:int(ldc:int(16816), ldc:int(-16817))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(142), ldc:int(143))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u1833\ub83f\ub18d\u88c5\ub7dc\u071d$26(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u40a9\u946b\u36d3\uc229\u416d\uc238, p0:\u8413\uc4d2\u839e\u965f\u0800, invokestatic:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8d90\u99f7\u8308\u6c52\ubf56\uf995::\u836c\u8308\u34df\u183a\u120d\u5140, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), and:int[expected:boolean](ldc:int(1059), ldc:int(27269)), invokedynamic:Function<Float, Float>(apply:()Ljava/util/function/Function;)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc238\ud7e8\ucfaf\u7006\u8cae\u40a9$25(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-17239261), ldc:int(-608483389))
            
            if (cmpne:boolean(invokevirtual:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8413\uc4d2\u839e\u965f\u0800::\u97b7\u8389\u836c\u8c8a\u8cae\ud36e, p0:\u8413\uc4d2\u839e\u965f\u0800), getstatic:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8d90\u99f7\u8308\u6c52\ubf56\uf995::\ubcb0\u624e\u946b\u6c52\u9255\u120d))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2146105243))
                stack_8D_0 = and:int(ldc:int(-15483), ldc:int(7290))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(2080), ldc:int(2081))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucef1\u3c25\u873d\u6bb9\ua562\u718f$24(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub83f\u0c95\u8bb0\u92ee\u647c\u5f50, p0:\u8413\uc4d2\u839e\u965f\u0800, invokestatic:\u8d90\u99f7\u8308\u6c52\ubf56\uf995(\u8d90\u99f7\u8308\u6c52\ubf56\uf995::\u836c\u8308\u34df\u183a\u120d\u5140, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), and:int[expected:boolean](ldc:int(18457), ldc:int(9639)), invokedynamic:Function<Float, Float>(apply:()Ljava/util/function/Function;)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u836c\u3e75\u760c\u960f\ucef1\u9937$23(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(874598321), ldc:int(-160958890))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\u4e72\u88c5\uf995\u4cd9\u156b\u1833, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2125283226))
                stack_8A_0 = and:int(ldc:int(30086), ldc:int(-30087))
            }
            else {
                stack_8A_0 = and:int(ldc:int(8321), ldc:int(16913))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u92ee\uceb8\u5654\u34df\ua068\ube23$22(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\uf94d\u7af6\ufe34\u9af2\ucb79\u759a, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8308\uc4d2\uceb8\u527a\uf995\uc2bd$21(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(586342073), ldc:int(32694193))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\u51b2\u3bc9\ubcb0\ud158\ua61f\u873d, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1194098883))
                stack_8A_0 = and:int(ldc:int(19037), ldc:int(-19166))
            }
            else {
                stack_8A_0 = and:int(ldc:int(1), ldc:int(27199))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7ce1\ubefe\ud4fe\ud12e\u6d99\u47c2$20(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ubb2b\u8258\u1187\ubefe\u5d20\ubf56, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u385b\ub102\u385b\u36d3\u983f\u7d52$19(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1844510712), ldc:int(-1979924776))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\uafe7\u8aa5\u960f\u0a06\uc238\u516c, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1609170427))
                stack_8A_0 = and:int(ldc:int(-25694), ldc:int(17500))
            }
            else {
                stack_8A_0 = and:int(ldc:int(539), ldc:int(18689))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7af6\u8709\u6c52\u16f6\uf995\ub19c$18(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ubf56\u88c5\u759a\ub7dc\ucb79\u36d3, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u156b\u67d0\u7049\u873d\uc229\uc910$17(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1940349449), ldc:int(1408138221))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\u8413\u6435\ufcaf\u7006\u8308\u8350, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-551554243))
                stack_8A_0 = and:int(ldc:int(-23771), ldc:int(23624))
            }
            else {
                stack_8A_0 = and:int(ldc:int(16609), ldc:int(8223))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u36d3\u8df4\u8640\u34df\u3e75\u8308$16(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u6b5f\u56bd\u59ec\ubb2b\u59ec\uc31c, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc3e3\ud158\u67e9\u69d9\u6435\u36d3$15(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1717006584), ldc:int(-434145602))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\u6b5f\u3bc9\u92ee\u34df\u6d69\u67e9, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1889043464))
                stack_8A_0 = and:int(ldc:int(4166), ldc:int(-4167))
            }
            else {
                stack_8A_0 = and:int(ldc:int(10471), ldc:int(4625))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub102\u927d\u3776\u3d64\u67d0\u7d52$14(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ud171\u7ce1\u5db4\u67d0\ub7dc\uf995, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ubb2b\u64f2\uc3e3\uceb8\ucfaf\u6bb9$13(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(2096841144), ldc:int(-1130376278))
            
            if (cmpne:boolean(invokevirtual:Double(\u8413\uc4d2\u839e\u965f\u0800::\u3e75\u527a\u4492\uc7fe\u6b0d\u40a9, p0:\u8413\uc4d2\u839e\u965f\u0800), aconstnull:Double())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-755245106))
                stack_8A_0 = and:int(ldc:int(-2950), ldc:int(2949))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(6144), ldc:int(6145))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u1833\ube23\ua068\uc4d2\ub18d\u839e$12(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
            invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u4daf\u1187\u62da\u071d\uae87\u6198, p0:\u8413\uc4d2\u839e\u965f\u0800, invokevirtual:double(StringReader::readDouble, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub7dc\u3a62\u0800\u5654\u9255\ud523$11(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            return:boolean(invokevirtual:boolean(\uc2e8\ub113\u3776\u4975\u40a9\u9255<T>::\u92ee\u97e6\u56bd\ubcb0\u3bc9\u40a9, invokevirtual:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>](\u8413\uc4d2\u839e\u965f\u0800::\u873d\uf995\u1833\u3d64\u8709\uc3e3, p0:\u8413\uc4d2\u839e\u965f\u0800)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u62da\ub70c\ubf56\u88c5\u156b\u3d4b$10(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        var_3_69 : int
        var_4_71 : \ub83f\u0800\u183a\u3dd3\u647c\uc4d2
        
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
            var_1_61 = and:int(ldc:int(521851790), ldc:int(-1141976092))
            var_3_69 = invokevirtual:int(StringReader::getCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
            var_4_71 = invokestatic:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2(\ub83f\u0800\u183a\u3dd3\u647c\uc4d2::\uc2e8\u3e2a\u8d98\u36d3\u1833\uc246, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
            
            if (cmpne:boolean(invokevirtual:Integer(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>::\u12cb\uae87\u4c2b\ubb2b\ucef1\u392e, var_4_71:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>]), aconstnull:Integer())) {
                if (cmplt:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>::\u12cb\uae87\u4c2b\ubb2b\ucef1\u392e, var_4_71:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>]))), ldc:int(0))) {
                    goto(Label_0197)
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1068159948))
                    
                    if (cmpne:boolean(invokevirtual:Integer(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>::\u5140\uc2bd\u3bd6\ucfaf\u4ab3\u4c04, var_4_71:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>]), aconstnull:Integer())) {
                        if (cmplt:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>::\u5140\uc2bd\u3bd6\ucfaf\u4ab3\u4c04, var_4_71:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Integer>]))), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(268435456)), ldc:int(0))) {
                    invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ud171\u7ce1\ud36e\u647c\u759a\u527a, p0:\u8413\uc4d2\u839e\u965f\u0800, var_4_71:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2)
                    invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u74b1\ubefe\u3711\u16f6\u3a62\ucef1, p0:\u8413\uc4d2\u839e\u965f\u0800, and:int[expected:boolean](ldc:int(-26669), ldc:int(26668)))
                    return:void()
                }
            }
            
            Label_0197:
            invokevirtual:void(StringReader::setCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), var_3_69:int)
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\u965f\u600f\u3bc9\ub113\u9937\u8308), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7330\u0c95\ubf56\u8bb0\u4ab3\ub7dc$9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
            return:boolean(invokevirtual:boolean(\uc2e8\ub113\u3776\u4975\u40a9\u9255<T>::\u92ee\u97e6\u56bd\ubcb0\u3bc9\u40a9, invokevirtual:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>](\u8413\uc4d2\u839e\u965f\u0800::\u97e6\u927d\ufe34\u7873\u93a2\u99f7, p0:\u8413\uc4d2\u839e\u965f\u0800)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u760c\uc229\ud51e\u7bad\u4f4a\ud36e$8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        var_3_69 : int
        var_4_71 : \u8258\u7873\ubb2b\u6d99\u927d\u64ab
        
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
            var_1_61 = and:int(ldc:int(-671111317), ldc:int(-1167221017))
            var_3_69 = invokevirtual:int(StringReader::getCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
            var_4_71 = invokestatic:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\uc2e8\u3e2a\u8d98\u36d3\u1833\uc246, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800))
            
            if (cmpne:boolean(invokevirtual:Float(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>::\u12cb\uae87\u4c2b\ubb2b\ucef1\u392e, var_4_71:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>]), aconstnull:Float())) {
                if (cmplt:boolean(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>::\u12cb\uae87\u4c2b\ubb2b\ucef1\u392e, var_4_71:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>]))), ldc:float(0.0f))) {
                    goto(Label_0210)
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(605059258))
                }
                else {
                    var_1_61 = and:int(var_1_61:int, ldc:int(-1216624033))
                    
                    if (cmpne:boolean(invokevirtual:Float(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>::\u5140\uc2bd\u3bd6\ucfaf\u4ab3\u4c04, var_4_71:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>]), aconstnull:Float())) {
                        if (cmplt:boolean(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Float(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>::\u5140\uc2bd\u3bd6\ucfaf\u4ab3\u4c04, var_4_71:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>]))), ldc:float(0.0f))) {
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(524288)), ldc:int(0))) {
                    invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\u8709\ubefe\u0800\ub8be\u873d\u1187, p0:\u8413\uc4d2\u839e\u965f\u0800, var_4_71:\u8258\u7873\ubb2b\u6d99\u927d\u64ab)
                    invokevirtual:void(\u8413\uc4d2\u839e\u965f\u0800::\ub7dc\u56bd\uc3e3\u8308\ud171\u0c95, p0:\u8413\uc4d2\u839e\u965f\u0800)
                    return:void()
                }
                
                var_1_61 = and:int(var_1_61:int, ldc:int(1229371530))
            }
            
            Label_0210:
            invokevirtual:void(StringReader::setCursor, invokevirtual:StringReader(\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800), var_3_69:int)
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u4daf\u7043\uff55\u3d4b\u99f7::\u52d3\u51b2\u3a62\u4cd9\u47c2\u6ec6), invokevirtual:StringReader[expected:ImmutableStringReader](\u8413\uc4d2\u839e\u965f\u0800::\u6b0d\u6bb9\u759a\ud51e\u6b5f\u6b5f, p0:\u8413\uc4d2\u839e\u965f\u0800)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uf9c5\ud7e8\u59ec\u071d\uafe7\u839e$7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(2015419408), ldc:int(-1171849506))
            
            if (invokevirtual:boolean(\u8413\uc4d2\u839e\u965f\u0800::\ud12e\u4179\uc3e3\u8bb0\u527a\u8d98, p0:\u8413\uc4d2\u839e\u965f\u0800)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1121264487))
                stack_8A_0 = and:int(ldc:int(12933), ldc:int(-12934))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(12420), ldc:int(12421))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc910\u8389\uc238\u6c52\u7330\u839e$6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8413\uc4d2\u839e\u965f\u0800 p0) {
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
    
    private static boolean lambda$\u0b8e\u34df\ufcaf\u647c\u72f1\u4ab3$5(java.lang.String p0, boolean p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
        var_3_61 : int
        stack_94_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-364703564), ldc:int(-1828791730))
            
            if (cmpeq:boolean(invokevirtual:boolean(String::equals, invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), p0:String[expected:Object]), p1:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1765614965))
                stack_94_0 = and:int(ldc:int(5268), ldc:int(-5333))
            }
            else {
                stack_94_0 = and:int(ldc:int(4097), ldc:int(26891))
            }
            
            return:boolean(stack_94_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u4c04\ub6ab\u4f4a\u6bb9\u51fa\u6c52$4(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), xor:int(ldc:int(2177), ldc:int(2224)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2323), ldc:int(13473)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-24953), ldc:int(24872)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u4492\u93a2\u71f1\ua3b4\uff55\u873d$3(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(4274), ldc:int(8243)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(344), ldc:int(345)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(24789), ldc:int(-24790)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u92ff\u4e72\uc2e8\u8cae\u836c\u12b2$2(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), xor:int(ldc:int(6805), ldc:int(6822)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8448), ldc:int(8449)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-17245), ldc:int(17244)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u8c8a\u3c25\u12b2\uf9c5\u0a06\u7330$1(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(30069), ldc:int(182)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(313), ldc:int(27777)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(7392), ldc:int(-7393)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u3504\u3d4b\ubff1\u16f6\u385b\u385b$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u4daf\u7043\uff55\u3d4b\u99f7::\uc246\u52d3\u965f\u7049\u40a9\ud7e8), and:int(ldc:int(189), ldc:int(2101)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(33), ldc:int(32)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-11844), ldc:int(10819)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
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
    
    public void \u6cfe\u3d4b\u3dd3\u8d98\u5db4\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(-839825621), ldc:int(-409215113))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4daf\u7043\uff55\u3d4b\u99f7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(400146211))
            var_5_81 = and:int(ldc:int(-10434), ldc:int(10433))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3560), ldc:int(3495)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(901459819))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(1536), ldc:int(1537)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16920), ldc:int(16921)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(-436234391))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(4485), ldc:int(17409)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1343206316))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(500874812))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(237054250))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-984160935))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2136663598))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1823054876))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2008624957))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(699785774))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1284003182))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-59770265))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1611138939))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1141976121))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-676001793))
                            var_11_EB = and:int(ldc:int(4723), ldc:int(-4980))
                            goto(Label_1598)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1028109095))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-274145573))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1907086408))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1134026009))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-100128279))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(228159469))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1553668792))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(959376232))
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-482367500))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1088533874))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-376801186))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(266659845))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1032484627))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(397873145))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2075350916))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1683718600))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-468682455))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2039591325))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2133462410))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-573196373))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(3144), ldc:int(3145))
                                goto(Label_1200)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1873321212))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-142051569))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(474770687))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1822929997))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1546009523))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-36055041))
                        var_11_EB = and:int(ldc:int(-4792), ldc:int(4791))
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(643409201))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1844037613))
                        goto(Label_1461)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(723945541))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-977318191))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2141042665))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1461)
                            }
                        }
                    }
                    
                    Label_1325:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1719197256))
                            goto(Label_1200)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2061436547))
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-29693801))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1997369344))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-402812993))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1598)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1461:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(140737711))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1727980516))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1324370087))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1452777097))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1514854593))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1598:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1609:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1461)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2102234860))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1780672167))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-159352566))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-322415483))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(185441031))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-543326213))
                        var_17_6CE = add:int(var_16_119:int, and:int(ldc:int(17177), ldc:int(2177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(228396919))
                
                if (cmple:boolean(var_5_81 = var_17_6CE:int, sub:int(var_6_88:int, and:int(ldc:int(12465), ldc:int(11))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1258394635))
            goto(Label_0108)
        }
    }
}
