public abstract class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6198\u760c\u960f\u494c\u8709 {
    private void \ub18d\u6198\u760c\u960f\u494c\u8709(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\ub18d\u6198\u760c\u960f\u494c\u8709)
            putfield:ITextComponent(\ub18d\u6198\u760c\u960f\u494c\u8709::\u7bad\ufe34\ubefe\u6c56\u5db4\u416d, this:\ub18d\u6198\u760c\u960f\u494c\u8709, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("generator.")), p0:String))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u3d64\u839e\u9af2\u8258\ubf56\u8d98(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6198\u760c\u960f\u494c\u8709 p2, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p3) {
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
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc7fe\u8350\ua6bd\u47c2\u7ce1\u494c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(checkcast:\uc2e8\u9255\u647c\ud171\ubf56(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56.class, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(Optional<\uc2e8\u9255\u647c\ud171\ubf56>::orElse, invokeinterface:Optional<\uc2e8\u9255\u647c\ud171\ubf56>(Stream<\uc2e8\u9255\u647c\ud171\ubf56>::findFirst, invokeinterface:Stream<\uc2e8\u9255\u647c\ud171\ubf56>(Collection<\uc2e8\u9255\u647c\ud171\ubf56>::stream, invokevirtual:List<\uc2e8\u9255\u647c\ud171\ubf56>[expected:Collection<\uc2e8\u9255\u647c\ud171\ubf56>](\u56bd\uc4d2\u61a4\u4ab3\u1187::\u8bb0\u4c04\uc29a\u7006\uae87\ud4fe, invokevirtual:\u56bd\uc4d2\u61a4\u4ab3\u1187(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\ucef1\u8bb0\u34df\u97e6\u36d3\u1833, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u7043\u40a9\u4975\u0800\u385b::\u7330\ub171\u6bb9\u527a\u6bb9\u71ae, p1:\u7043\u40a9\u4975\u0800\u385b))))), invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>::\u624e\u62da\u9937\uafe7\u8389\u98a4, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f)), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uc2e8\u9255\u647c\ud171\ubf56>(\ud523\u7330\u7049\u9033\ub32d::\u3d4b\u7d52\u6bb9\uf995\u416d\u5140)))))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ub18d\u6198\u760c\u960f\u494c\u8709> \u6b5f\u7e3f\ub171\u12b2\u965f\uc29a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p0) {
        var_1_92 : int
        var_3_64 : \ufcaf\u97e6\u34df\u5245\u927d\ubcb0
        stack_B6_0 : Optional<\ub18d\u6198\u760c\u960f\u494c\u8709> [generated]
        
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
        var_1_92 = and:int(ldc:int(-681727558), ldc:int(-1210861094))
        var_3_64 = invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u7043\u40a9\u4975\u0800\u385b::\u7330\ub171\u6bb9\u527a\u6bb9\u71ae, p0:\u7043\u40a9\u4975\u0800\u385b)
        
        if (logicalnot:boolean(instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u40a9\uf995\u7d52\u8d90\u76bc.class, var_3_64:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0))) {
            loop {
                if (cmpne:boolean(and:int(var_1_92:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_92 = and:int(var_1_92:int, ldc:int(1064779071))
                    
                    if (instanceof:boolean(\u59ec\u8413\u97e6\uc229\u3776.\ub18d\u156b\u92ff\u4bc8\u6b5f.class, var_3_64:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0)) {
                        stack_B6_0 = invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(Optional<T>::of, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u8308\u64ab\u62da\uff55\u4d85\u64f2))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_92:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_92 = and:int(var_1_92:int, ldc:int(-134617762))
                    stack_B6_0 = invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(Optional<T>::empty)
                    looporswitchbreak()
                }
                
                var_1_92 = and:int(var_1_92:int, ldc:int(-369817621))
            }
            
            return:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(stack_B6_0:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>)
        }
        
        return:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(invokestatic:Optional<\ub18d\u6198\u760c\u960f\u494c\u8709>(Optional<T>::of, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u8709\u071d\u74b1\u0800\u51b2\u3711)))
    }
    
    public net.minecraft.util.text.ITextComponent \u9937\u8bb0\u6fb0\u52d3\ud12e\u3d64() {
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
            return:ITextComponent(getfield:ITextComponent(\ub18d\u6198\u760c\u960f\u494c\u8709::\u7bad\ufe34\ubefe\u6c56\u5db4\u416d, this:\ub18d\u6198\u760c\u960f\u494c\u8709))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b \u52d3\u5654\ub32d\u7e3f\ub32d\u7c6b(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, long p1, boolean p2, boolean p3) {
        var_8_6C : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>
        var_9_75 : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>
        var_10_7E : \u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>
        
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
            var_8_6C = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f))
            var_9_75 = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3c25\u7ce1\u0c95\ubff1\u64f2\u718f))
            var_10_7E = invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f], getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u8350\u760c\u4d85\u071d\u93a2\ud51e))
            return:\u7043\u40a9\u4975\u0800\u385b(initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, p1:long, p2:boolean, p3:boolean, invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u56bd\u47c2\u9af2\ubf56\u0b8e\u6d69, var_9_75:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>], invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u3d4b\u9937\u7af6\u7af6\u6198\uae87::\u6cfe\u4d85\u120d\u5fe1\u071d\ub1b9, var_9_75:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>], var_8_6C:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>], var_10_7E:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>], p1:long), invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\ub18d\u6198\u760c\u960f\u494c\u8709::\u99f7\u4492\u93a2\ua562\u6c56\ud12e, this:\ub18d\u6198\u760c\u960f\u494c\u8709, var_8_6C:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\uc2e8\u9255\u647c\ud171\ubf56>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>], var_10_7E:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<\u4179\uc9f6\u0c95\uceb8\uc87f>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>], p1:long))))
        }
        
        goto(Label_0006)
    }
    
    public abstract \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 \u99f7\u4492\u93a2\ua562\u6c56\ud12e(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f> p1, long p2);
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\uc7fe\ud158\u6bb9\ub32d\u392e\u3711$10(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\u6b5f\ufcaf\u385b\u69d9\ua61f\u3504))))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\uf94d\uc2bd\ub7dc\u62da\u156b\u7d52$9(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\u8350\ub113\uae5d\u8cae\ub83f\u7ce1))))
        }
        
        goto(Label_0006)
    }
    
    private static \u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f lambda$\u494c\u36d3\ub171\u51fa\u6d99\u4cd9$8(\u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255 p0) {
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
            return:\u4179\uc9f6\u0c95\uceb8\uc87f(checkcast:\u4179\uc9f6\u0c95\uceb8\uc87f(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4179\uc9f6\u0c95\uceb8\uc87f.class, invokevirtual:\u4179\uc9f6\u0c95\uceb8\uc87f(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>::\u624e\u62da\u9937\uafe7\u8389\u98a4, p0:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u4179\uc9f6\u0c95\uceb8\uc87f>, getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u4179\uc9f6\u0c95\uceb8\uc87f>(\u4179\uc9f6\u0c95\uceb8\uc87f::\uc229\u8aa5\ud158\uc2e8\u416d\ud36e))))
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 lambda$\u6ec6\u67d0\ub8be\u4f4a\u7c6b\u62da$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
    
    private static void lambda$\u9033\u61a4\u8df4\u0a06\u9033\u392e$6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2) {
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
            invokevirtual:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ub83f\u760c\u4d85\uc3e3\ua3b4\uc29a, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50), invokestatic:\u7043\u40a9\u4975\u0800\u385b(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3d64\u839e\u9af2\u8258\ubf56\u8d98, invokevirtual:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5db4\u67d0\u8258\ub113\uc246\u5fe1, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50)), p1:\u7043\u40a9\u4975\u0800\u385b, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u6c52\u8df4\u156b\u6198\u624e\u760c), p2:\uc2e8\u9255\u647c\ud171\ubf56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 lambda$\ud36e\u9a18\ub1b9\u67e9\ucfaf\ud217$5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
    
    private static void lambda$\u92ee\u3c25\u8350\ub32d\u7ce1\uc9f6$4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2) {
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
            invokevirtual:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ub83f\u760c\u4d85\uc3e3\ua3b4\uc29a, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50), invokestatic:\u7043\u40a9\u4975\u0800\u385b(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3d64\u839e\u9af2\u8258\ubf56\u8d98, invokevirtual:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5db4\u67d0\u8258\ub113\uc246\u5fe1, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50)), p1:\u7043\u40a9\u4975\u0800\u385b, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u7ce1\u6435\u4c04\u52d3\u97b7\u6bb9), p2:\uc2e8\u9255\u647c\ud171\ubf56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 lambda$\u8308\u8640\u3bc9\u16f6\u7ce1\u6c56$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
    
    private static void lambda$\u4daf\u6d69\u3bd6\u4179\u8350\uc7fe$2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p2) {
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
            invokevirtual:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ub83f\u760c\u4d85\uc3e3\ua3b4\uc29a, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50), invokestatic:\u7043\u40a9\u4975\u0800\u385b(\ub18d\u6198\u760c\u960f\u494c\u8709::\u3d64\u839e\u9af2\u8258\ubf56\u8d98, invokevirtual:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5db4\u67d0\u8258\ub113\uc246\u5fe1, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50)), p1:\u7043\u40a9\u4975\u0800\u385b, getstatic:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::\u983f\ubded\u69d9\u3bd6\u67d0\u760c), p2:\uc2e8\u9255\u647c\ud171\ubf56))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 lambda$\u9033\ufe34\u8413\u34df\u5fe1\u6cfe$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1) {
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
    
    private static void lambda$\u3d64\u67e9\ub6ab\uceb8\u6d99\u3a62$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u12b2\u1187\ub171\u56bd\u5f50 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u56bd\u8413\u647c\u5bc4\ud158.\u6b0d\uc3e3\u12cb\u5bc4\u0b8e p2) {
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
            invokevirtual:void(\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\ub83f\u760c\u4d85\uc3e3\ua3b4\uc29a, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50), initobject:\u7043\u40a9\u4975\u0800\u385b(\u7043\u40a9\u4975\u0800\u385b::<init>, invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, p1:\u7043\u40a9\u4975\u0800\u385b), invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e, p1:\u7043\u40a9\u4975\u0800\u385b), invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ub18d\uc9f6\u7043\u7c6b\ucfaf\u3e2a, p1:\u7043\u40a9\u4975\u0800\u385b), invokestatic:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u56bd\u47c2\u9af2\ubf56\u0b8e\u6d69, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, invokevirtual:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f](\ub8be\u8413\u92ff\u7049\ub70c\u6b0d::\u5db4\u67d0\u8258\ub113\uc246\u5fe1, getfield:\ub8be\u8413\u92ff\u7049\ub70c\u6b0d(\u4daf\u12b2\u1187\ub171\u56bd\u5f50::\u12b2\u965f\uc4d2\u7c6b\u1833\ua6bd, p0:\u4daf\u12b2\u1187\ub171\u56bd\u5f50)), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u3d4b\u9937\u7af6\u7af6\u6198\uae87>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u3c25\u7ce1\u0c95\ubff1\u64f2\u718f)), invokevirtual:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<\u6ec6\ub19c\u392e\uc238\u51fa\u92ee>(\u7043\u40a9\u4975\u0800\u385b::\u9937\u74b1\u7c6b\ub7dc\u3bc9\u1833, p1:\u7043\u40a9\u4975\u0800\u385b), initobject:\u40a9\uf995\u7d52\u8d90\u76bc[expected:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0](\u40a9\uf995\u7d52\u8d90\u76bc::<init>, p2:\u6b0d\uc3e3\u12cb\u5bc4\u0b8e))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u6198\u760c\u960f\u494c\u8709(java.lang.String p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u3776\u647c\u5f50\u51fa\uceb8\u6bb9 p1) {
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
            invokespecial:\ub18d\u6198\u760c\u960f\u494c\u8709(\ub18d\u6198\u760c\u960f\u494c\u8709::<init>, this:\ub18d\u6198\u760c\u960f\u494c\u8709, p0:String)
            return:void()
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
    
    public void \ub32d\u4179\uceb8\u5f50\u2dcc\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(-1565074348), ldc:int(-1296122532))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub18d\u6198\u760c\u960f\u494c\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1362950804))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-17840004))
            var_5_8A = and:int(ldc:int(22904), ldc:int(-24057))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9214), ldc:int(8632)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-1322858019))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(12611), ldc:int(16517)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(24960), ldc:int(24961)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(-1535655953))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(145), ldc:int(31809)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1166367702))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1610675312))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(921279878))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-714119240))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-139028457))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1605833766))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-857835853))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1968524752))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-914680126))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1850295029))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-365962644))
                        var_11_EB = and:int(ldc:int(-27562), ldc:int(27305))
                        goto(Label_1544)
                    }
                    
                    Label_0584:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2078245141))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-555179870))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0974)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1830575838))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(498248741))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-483481579))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1381768388))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1822852678))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-103096282))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1793714333))
                        goto(Label_0974)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1911996077))
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-2021200437))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-77137426))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1837887250))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-325229212))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1921807847))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1262579970))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(513), ldc:int(16449))
                                goto(Label_1125)
                            }
                        }
                    }
                    
                    Label_0974:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-362302984))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1609828521))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(636390099))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1149780274))
                        var_11_EB = and:int(ldc:int(1761), ldc:int(-18402))
                    }
                    
                    Label_1125:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(762335086))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(475204800))
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0974)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-328250855))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(74877218))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(822991673))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1217471969))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1390)
                            }
                        }
                    }
                    
                    Label_1256:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(422195002))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1189435148))
                            goto(Label_0974)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(867947164))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(664913816))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-102244473))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1544)
                    }
                    
                    Label_1390:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-923078847))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(843692207))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1542193962))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(282814208))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1637926016))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-385874335))
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1484871562))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2038456548))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1336337447))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(58217472))
                        goto(Label_0974)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1763191105))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-90788476))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(328261466))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-298411260))
                        var_17_6A1 = add:int(var_16_119:int, and:int(ldc:int(3), ldc:int(17553)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-1484878580))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, xor:int(ldc:int(1248), ldc:int(1249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
