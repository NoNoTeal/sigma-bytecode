public class \u51fa\u12cb\u7330\u74b1\u6c52.\u6c56\ub102\ua068\u92ee\u47c2\uae5d {
    public void \u6c56\ub102\ua068\u92ee\u47c2\uae5d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p1, \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p2, java.util.function.Consumer<net.minecraft.util.text.ITextComponent> p3) {
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
            invokespecial:Object(Object::<init>, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)
            putfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p0:\u527a\u494c\u88c5\u965f\u759a)
            putfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p1:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p2:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:Consumer<ITextComponent>(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u7873\u8350\uc87f\u4f4a\ubcb0\u6198, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p3:Consumer<ITextComponent>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\uc4d2\u8c8a\u64f2\ud171\ua61f(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u718f\u51b2\u59ec\uff55\u7bad p0) {
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
    
    private net.minecraft.util.text.ITextComponent \ua562\u6b0d\ucfaf\uae5d\u72f1\u4cd9(java.lang.String p0) {
        var_2_9D : int
        stack_DF_1 : String [generated]
        expr_C1 : Object[] [generated]
        stack_122_1 : String [generated]
        expr_104 : Object[] [generated]
        stack_165_1 : String [generated]
        expr_147 : Object[] [generated]
        stack_19B_1 : String [generated]
        expr_18A : Object[] [generated]
        var_4_16D : AuthenticationException
        
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
        var_2_9D = and:int(ldc:int(-1069118956), ldc:int(-76062955))
        
        try {
            loop {
                if (cmpne:boolean(and:int(var_2_9D:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_9D = and:int(var_2_9D:int, ldc:int(-347168808))
                    invokeinterface:void(MinecraftSessionService::joinServer, invokespecial:MinecraftSessionService(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u4cd9\u9033\uc229\ub70c\u8413\ub8be, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), invokevirtual:GameProfile(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\uc238\u9a18\u71f1\ub83f\u527a\u9033, invokevirtual:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u5654\u36d3\u416d\u836c\u6cfe, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d))), invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\u72f1\uc229\u759a\u600f\ua6bd\u47c2, invokevirtual:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u5654\u36d3\u416d\u836c\u6cfe, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d))), p0:String)
                }
                
                if (cmpne:boolean(and:int(var_2_9D:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_9D = and:int(var_2_9D:int, ldc:int(-1223226053))
            }
            
            var_2_9D = and:int(var_2_9D:int, ldc:int(-327169063))
            return:ITextComponent(aconstnull:ITextComponent())
        }
        catch (com.mojang.authlib.exceptions.AuthenticationUnavailableException var_4_A4) {
            stack_DF_1 = loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(16525), ldc:int(16527)))
            expr_C1 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(75), ldc:int(74)))
            storeelement:Object(expr_C1:Object[], and:int(ldc:int(27929), ldc:int(-28030)), initobject:TranslationTextComponent[expected:Object](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), and:int(ldc:int(21059), ldc:int(1027)))))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_DF_1:String, expr_C1:Object[]))
        }
        catch (com.mojang.authlib.exceptions.InvalidCredentialsException var_4_E7) {
            stack_122_1 = loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(26752), ldc:int(26754)))
            expr_104 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6673), ldc:int(8357)))
            storeelement:Object(expr_104:Object[], and:int(ldc:int(-25758), ldc:int(25749)), initobject:TranslationTextComponent[expected:Object](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(278), ldc:int(274)))))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_122_1:String, expr_104:Object[]))
        }
        catch (com.mojang.authlib.exceptions.InsufficientPrivilegesException var_4_12A) {
            stack_165_1 = loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), and:int(ldc:int(4226), ldc:int(24682)))
            expr_147 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-31615), ldc:int(-31616)))
            storeelement:Object(expr_147:Object[], and:int(ldc:int(-12713), ldc:int(12704)), initobject:TranslationTextComponent[expected:Object](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(7176), ldc:int(7181)))))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_165_1:String, expr_147:Object[]))
        }
        catch (com.mojang.authlib.exceptions.AuthenticationException var_4_16D) {
            stack_19B_1 = loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(617), ldc:int(619)))
            expr_18A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(29299), ldc:int(1033)))
            storeelement:Object(expr_18A:Object[], and:int(ldc:int(-18982), ldc:int(18981)), invokevirtual:String[expected:Object](AuthenticationException::getMessage, var_4_16D:AuthenticationException))
            return:ITextComponent(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_19B_1:String, expr_18A:Object[]))
        }
    }
    
    private com.mojang.authlib.minecraft.MinecraftSessionService \u4cd9\u9033\uc229\ub70c\u8413\ub8be() {
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
            return:MinecraftSessionService(invokevirtual:MinecraftSessionService(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u67e9\u6198\u3bd6\uf94d\uc2bd\u3504, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)))
        }
        
        goto(Label_0006)
    }
    
    public void \uc84e\u071d\u61a4\ucfaf\u6bb9\uc87f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u647c\ucb79\ud4fe\u98a4\u3bd6 p0) {
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
            invokeinterface:void(Consumer<TranslationTextComponent>::accept, getfield:Consumer<ITextComponent>(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u7873\u8350\uc87f\u4f4a\ubcb0\u6198, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(-32762), ldc:int(-32768)))))
            putfield:GameProfile(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u93a2\ucfaf\u51fa\u9a18\u965f\u4e72, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, invokevirtual:GameProfile(\u647c\ucb79\ud4fe\u98a4\u3bd6::\uc31c\u8d90\ub6ab\u34df\ub32d\u6c52, p0:\u647c\ucb79\ud4fe\u98a4\u3bd6))
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u40a9\u718f\u99f7\u4e72\u93a2\u6d69, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getstatic:\u392e\uc31c\u3504\u3dd3\u93a2(\u392e\uc31c\u3504\u3dd3\u93a2::\u5140\u3711\uae87\ubb2b\ucb79\u600f))
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u946b\u3e75\u59ec\ua562\u516c\ubb2b, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:\u527a\u873d\u071d\u4f52\uc229\ud217[expected:\u446c\u7c6b\u8bb0\u4975\u76bc](\u527a\u873d\u071d\u4f52\uc229\ud217::<init>, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getfield:GameProfile(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u93a2\ucfaf\u51fa\u9a18\u965f\u4e72, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9033\uc4d2\u3bc9\u7043\u392e\ua61f(net.minecraft.util.text.ITextComponent p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(1854365929), ldc:int(1268217469))
            
            if (logicaland:boolean(cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u99f7\u7006\u6198\u47c2\ub1b9\u12cb.class, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)))) {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:\u385b\u7049\uae87\ub7dc\u6fb0\u8d98[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u385b\u7049\uae87\ub7dc\u6fb0\u8d98::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u527a\uceb8\u6fb0\u71f1\ud36e\u3dd3), p0:ITextComponent))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(1855975289))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:\u120d\u72f1\uc229\ub70c\ud12e\u7bad[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u120d\u72f1\uc229\ub70c\ud12e\u7bad::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u3e75\u64f2\u9033\u72f1\u7c6b\u7c6b, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u527a\uceb8\u6fb0\u71f1\ud36e\u3dd3), p0:ITextComponent))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u494c\u88c5\u965f\u759a \ua562\u9255\u36d3\u8389\uc246\ub113() {
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
            return:\u527a\u494c\u88c5\u965f\u759a(getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d))
        }
        
        goto(Label_0006)
    }
    
    public void \u3e2a\u4ab3\ube23\u16f6\u6d69\u836c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7049\u5fe1\u760c\u1187\ubff1 p0) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), invokevirtual:ITextComponent(\u7049\u5fe1\u760c\u1187\ubff1::\u3711\u4f52\u40a9\u416d\ua3b4\u5bc4, p0:\u7049\u5fe1\u760c\u1187\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\ud36e\u6fb0\u7330\u8640\u3711(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud217\u8aa5\ucfaf\ud158\ub7dc p0) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u59ec\ua61f\u36d3\u4e72\u7006\u927d, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)))) {
                invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\uc7fe\u69d9\ub70c\u8d90\u6d69\uc2e8, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), invokevirtual:int(\ud217\u8aa5\ucfaf\ud158\ub7dc::\uceb8\u6435\u99f7\u3e75\ud217\uc910, p0:\ud217\u8aa5\ucfaf\ud158\ub7dc))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u1187\uf995\uc246\u51b2\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4d85\u5db4\u56bd\u71ae\ua6bd p0) {
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
            invokeinterface:void(Consumer<TranslationTextComponent>::accept, getfield:Consumer<ITextComponent>(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u7873\u8350\uc87f\u4f4a\ubcb0\u6198, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), and:int(ldc:int(1175), ldc:int(327)))))
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:\u8389\u67e9\ud158\u5f50\ub7dc[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u8389\u67e9\ud158\u5f50\ub7dc::<init>, invokevirtual:int(\u4d85\u5db4\u56bd\u71ae\ua6bd::\u4cd9\u5f50\u8640\ua068\u9af2\u8c8a, p0:\u4d85\u5db4\u56bd\u71ae\ua6bd), checkcast:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640.class, aconstnull:\u98a4\uafe7\uc3e3\ua6bd\u8640())))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u600f\u647c\u183a\u4c2b\u5654\ua562$1(java.lang.String p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4bc8\u12b2\u0c95\u8350\u64ab p1, javax.crypto.Cipher p2, javax.crypto.Cipher p3) {
        var_5_63 : int
        var_7_6A : ITextComponent
        
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
        var_5_63 = and:int(ldc:int(1873282419), ldc:int(1956929326))
        var_7_6A = invokespecial:ITextComponent(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\ua562\u6b0d\ucfaf\uae5d\u72f1\u4cd9, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p0:String)
        
        if (cmpne:boolean(var_7_6A:ITextComponent, aconstnull:ITextComponent())) {
            if (cmpeq:boolean(invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf9c5\u4f52\u74b1\ud4fe\ubded\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d)), aconstnull:\ub8be\u071d\u527a\u3711\ubff1\u759a())) {
                goto(Label_0200)
            }
            
            if (logicalnot:boolean(invokevirtual:boolean(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, invokevirtual:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf9c5\u4f52\u74b1\ud4fe\ubded\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u9a18\u6c52\u97b7\u12cb\uc29a\u0a06, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d))))) {
                goto(Label_0200)
            }
            
            var_5_63 = and:int(var_5_63:int, ldc:int(-1023588954))
            invokeinterface:void(Logger::warn, getstatic:Logger(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\ub19c\u0c95\u965f\u6c52\ub102\uae5d), invokeinterface:String(ITextComponent::getString, var_7_6A:ITextComponent))
        }
        
        Label_0113:
        
        if (cmpne:boolean(and:int(var_5_63:int, ldc:int(256)), ldc:int(0))) {
            invokeinterface:void(Consumer<TranslationTextComponent>::accept, getfield:Consumer<ITextComponent>(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u7873\u8350\uc87f\u4f4a\ubcb0\u6198, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140), xor:int(ldc:int(21), ldc:int(29)))))
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u6fb0\u5d20\u93a2\u92ff\ud158\uc4d2, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), p1:\u4bc8\u12b2\u0c95\u8350\u64ab[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>], invokedynamic:GenericFutureListener(operationComplete:(L\u51fa\u12cb\u7330\u74b1\u6c52/\u6c56\ub102\ua068\u92ee\u47c2\uae5d;Ljavax/crypto/Cipher;Ljavax/crypto/Cipher;)Lio/netty/util/concurrent/GenericFutureListener;, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d, p2:Cipher, p3:Cipher))
            return:void()
        }
        
        var_5_63 = and:int(var_5_63:int, ldc:int(1568361987))
        Label_0200:
        
        if (cmpne:boolean(and:int(var_5_63:int, ldc:int(1024)), ldc:int(0))) {
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\u98a4\uc31c\u6c52\uf995\u62da\u64f2, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), var_7_6A:ITextComponent)
            return:void()
        }
        
        goto(Label_0113)
    }
    
    private void lambda$\ubefe\u8389\u3e75\u64f2\u3776\uc238$0(javax.crypto.Cipher p0, javax.crypto.Cipher p1, io.netty.util.concurrent.Future p2) {
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
            invokevirtual:void(\u527a\u494c\u88c5\u965f\u759a::\ub70c\ud158\uc238\ud158\u4975\ub171, getfield:\u527a\u494c\u88c5\u965f\u759a(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u5bc4\ucef1\u62da\u99f7\u71f1\u8709, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d), p0:Cipher, p1:Cipher)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C5 : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_F5_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_270_0 : byte[] [generated]
        stack_2D8_0 : byte[] [generated]
        stack_34A_0 : byte[] [generated]
        stack_3A0_0 : byte[] [generated]
        var_4_251 : int
        var_3_256 : byte[]
        var_5_257 : int
        expr_273 : byte [generated]
        var_0_2CE : int
        expr_2D8 : byte [generated]
        stack_318_2 : byte [generated]
        stack_2F5_0 : byte [generated]
        expr_95 : int [generated]
        var_2_C3 : byte[]
        expr_C7 : int [generated]
        var_3_338 : byte[]
        var_5_339 : int
        expr_F7 : int [generated]
        var_3_38E : byte[]
        var_5_38F : int
        var_3_139 : String
        stack_244_0 : String[] [generated]
        expr_14B : String[] [generated]
        
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
        var_0_2C5 = and:int(ldc:int(39347201), ldc:int(1133379517))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_C3_0 = stack_C5_0 = stack_F5_0 = stack_F7_0 = stack_12D_0 = stack_270_0 = stack_2D8_0 = stack_34A_0 = stack_3A0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("oTMwqdU2ti+PKzQwMimztrfMqauumKqsLDayqrO0LLipLba3zKmpKxOvt64uMzAvM7ipLba3zKkwqxapNym0NripLba3zKkuthE4rK+qLDY4uLGpLqstODO2t8ypLasRKbo1qqmnN0epqiodMykyty04M7a3zKktqxEpujWqqac3R6mqKj04Ka2OKzS1tLQtNzg+LTQpmTSyszCzLymutLEtODO2t8ypLasRKbo1qqmnN0epqio9OCmtDTU3KcCyNK4jtK4zLqmvNi04M7a3zKktqxEpujWqqac3R6mqKj04LjcPra40SDcuLyezKSsxKjdkJqSj+A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_251 = expr_6E:int
        var_3_256 = newarray:byte[](byte.class, expr_6E:int)
        var_5_257 = expr_6E:int
        Label_0601:
        
        while (cmpeq:boolean(and:int(var_0_2C5:int, ldc:int(4)), ldc:int(0))) {
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(35644715))
            var_5_257 = add:int(var_5_257:int, ldc:int(-1))
            expr_273 = add:byte(loadelement:byte(stack_270_0:byte[], var_5_257:int), ldc:byte(87))
            storeelement:byte(var_3_256:byte[], var_5_257:int, or:int(and:int(shl:int(expr_273:byte, xor:int(ldc:int(16397), ldc:int(16393))), ldc:int(-16)), and:int(shr:int(expr_273:byte[expected:int], and:int(ldc:int(14100), ldc:int(135))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_257:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_F5_0 = stack_F7_0 = stack_12D_0 = stack_270_0 = stack_2D8_0 = stack_34A_0 = stack_3A0_0 = var_3_256:byte[]
            goto(Label_0115)
        }
        
        Label_0696:
        
        while (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2CE = and:int(var_0_2C5:int, ldc:int(457700403))
            var_5_257 = add:int(var_5_257:int, ldc:int(-1))
            expr_2D8 = stack_318_2 = loadelement(stack_2D8_0, var_5_257)
            
            if (cmplt:boolean(add:int(add:int(var_5_257:int, ldc:int(4)), neg:int(var_4_251:int)), ldc:int(0))) {
                stack_318_2 = stack_2F5_0 = add:byte(expr_2D8:byte, loadelement:byte(var_3_256:byte[], add:int(var_5_257:int, ldc:int(4))))
                goto(Label_0773)
            }
            
            Label_0741:
            
            if (cmpeq:boolean(and:int(var_0_2CE:int, ldc:int(512)), ldc:int(0))) {
                var_0_2CE = and:int(var_0_2CE:int, ldc:int(852358589))
                stack_318_2 = stack_2F5_0 = add:byte(expr_2D8:byte, ldc:byte(4))
            }
            
            Label_0773:
            
            if (cmpeq:boolean(and:int(var_0_2CE:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0741)
            }
            
            var_0_2C5 = and:int(var_0_2CE:int, ldc:int(-149094919))
            storeelement:byte(var_3_256:byte[], var_5_257:int, stack_318_2:byte)
            
            if (cmpne:boolean(var_5_257:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_F5_0 = stack_F7_0 = stack_12D_0 = stack_270_0 = stack_2D8_0 = stack_34A_0 = stack_3A0_0 = var_3_256:byte[]
            goto(Label_0154)
        }
        
        var_0_2C5 = and:int(var_0_2C5:int, ldc:int(327553350))
        goto(Label_0601)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0252)
        }
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C5:int, ldc:int(4)), ldc:int(0))) {
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(1937895047))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_251 = expr_95:int
                var_3_256 = newarray:byte[](byte.class, expr_95:int)
                var_5_257 = expr_95:int
                goto(Label_0696)
            }
        }
        
        Label_0154:
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(1630140522))
            goto(Label_0252)
        }
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(-1611599973))
            var_2_C3 = stack_C3_0:byte[]
            expr_C7 = add:int(arraylength:int(stack_C5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_3_338 = newarray:byte[](byte.class, expr_C7:int)
                var_5_339 = expr_C7:int
                
                loop {
                    var_0_2C5 = and:int(var_0_2C5:int, ldc:int(-755206159))
                    var_5_339 = add:int(var_5_339:int, ldc:int(-1))
                    storeelement:byte(var_3_338:byte[], var_5_339:int, add:int(shl:int(loadelement:byte(stack_34A_0:byte[], var_5_339:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_C3:byte[], add:int(var_5_339:int, and:int(ldc:int(20551), ldc:int(2193)))), ldc:int(3)), xor:int(ldc:int(12293), ldc:int(12314)))))
                    
                    if (cmpne:boolean(var_5_339:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_F5_0 = stack_F7_0 = stack_12D_0 = stack_270_0 = stack_2D8_0 = stack_34A_0 = stack_3A0_0 = var_3_338:byte[]
            }
        }
        
        Label_0204:
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2C5:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0154)
            }
            
            if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(4096)), ldc:int(0))) {
                var_0_2C5 = and:int(var_0_2C5:int, ldc:int(498950815))
                goto(Label_0115)
            }
            
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(-1276808049))
            expr_F7 = arraylength:int(stack_F7_0:byte[])
            
            if (cmpne:boolean(expr_F7:int, ldc:int(0))) {
                var_3_38E = newarray:byte[](byte.class, expr_F7:int)
                var_5_38F = expr_F7:int
                
                loop {
                    var_0_2C5 = and:int(var_0_2C5:int, ldc:int(-946639669))
                    var_5_38F = add:int(var_5_38F:int, ldc:int(-1))
                    storeelement:byte(var_3_38E:byte[], var_5_38F:int, xor:byte(loadelement:byte(stack_3A0_0:byte[], var_5_38F:int), ldc:byte(26)))
                    
                    if (cmpne:boolean(var_5_38F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_F5_0 = stack_F7_0 = stack_12D_0 = stack_270_0 = stack_2D8_0 = stack_34A_0 = stack_3A0_0 = var_3_38E:byte[]
            }
        }
        
        Label_0252:
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_2C5:int, ldc:int(4096)), ldc:int(0))) {
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(-1080035034))
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C5:int, ldc:int(1)), ldc:int(0))) {
            var_0_2C5 = and:int(var_0_2C5:int, ldc:int(1822198589))
            goto(Label_0115)
        }
        
        var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_244_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32224), ldc:int(-32215)))
        expr_14B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(538), ldc:int(531)))
        storeelement:String(expr_14B:String[], and:int(ldc:int(3606), ldc:int(-3743)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(-15236), ldc:int(15233)), and:int(ldc:int(10638), ldc:int(5647))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(21506), ldc:int(21507)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(17934), ldc:int(2366)), xor:int(ldc:int(-31474), ldc:int(-31441))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(1674), ldc:int(361)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(27169), ldc:int(97)), and:int(ldc:int(23611), ldc:int(563))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(1287), ldc:int(24590)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(20485), ldc:int(20534)), xor:int(ldc:int(-32742), ldc:int(-32680))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(86), ldc:int(81)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(22536), ldc:int(22602)), xor:int(ldc:int(539), ldc:int(590))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(20526), ldc:int(8835)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4437), ldc:int(95)), xor:int(ldc:int(20999), ldc:int(21096))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(14372), ldc:int(14369)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8304), ldc:int(8223)), xor:int(ldc:int(4895), ldc:int(5055))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(3956), ldc:int(20614)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-12234), ldc:int(-12138)), and:int(ldc:int(4299), ldc:int(9965))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(8387), ldc:int(4099)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2815), ldc:int(2614)), and:int(ldc:int(10750), ldc:int(20727))))
        putstatic:String[](\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\u97e6\u7bad\ud217\uc31c\u67d0\u5140, expr_14B:String[])
        putstatic:Logger(\u6c56\ub102\ua068\u92ee\u47c2\uae5d::\ub19c\u0c95\u965f\u6c52\ub102\uae5d, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \ufe34\ub8be\uc2e8\u8640\u3d64\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CF : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6DA : int
        
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
        var_3_6CF = and:int(ldc:int(-214341876), ldc:int(-1141854577))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c56\ub102\ua068\u92ee\u47c2\uae5d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1459343274))
            var_5_81 = and:int(ldc:int(-552), ldc:int(551))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(6548), ldc:int(-6549)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6CF:int, ldc:int(-160030872))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(1025), ldc:int(28761)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-28384), ldc:int(-28383)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6CF = and:int(var_3_DA:int, ldc:int(586917469))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(17933), ldc:int(2131)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1610427886))
                        goto(Label_1614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1453363855))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1816015663))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-838856020))
                        goto(Label_0902)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(2011506292))
                    }
                    else {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1568883080))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0902)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-431079237))
                        goto(Label_1614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1797811496))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-473189325))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-904129663))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1861101385))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(2103233591))
                        goto(Label_0902)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1591646518))
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(441116142))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1153976629))
                            var_11_EB = and:int(ldc:int(-22206), ldc:int(5657))
                            goto(Label_1603)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0622:
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-912976171))
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(654647754))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1235695805))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(38207033))
                        goto(Label_0902)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1606020793))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1084407185))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1812763559))
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-751454309))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0902)
                        }
                    }
                    
                    Label_0771:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(287903132))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-706688365))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1901461367))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1691800794))
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(318238461))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0902:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(318247166))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-375193863))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-732096814))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1269117546))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1745088865))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(1171), ldc:int(25133))
                                goto(Label_1193)
                            }
                        }
                    }
                    
                    Label_1025:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1614)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(111957147))
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1825561543))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1780344037))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1737073595))
                            goto(Label_0902)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-491336529))
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(108678907))
                        var_11_EB = and:int(ldc:int(8783), ldc:int(-12880))
                    }
                    
                    Label_1193:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1468)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-315084462))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1025)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-585904788))
                            goto(Label_0902)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(522048499))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(189005784))
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(792282766))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1468)
                            }
                        }
                    }
                    
                    Label_1315:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(36806419))
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1292878597))
                            goto(Label_1193)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1517871768))
                            goto(Label_1025)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0902)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-997716509))
                            goto(Label_0622)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(1838218998))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-721922634))
                            loopcontinue()
                        }
                        
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1580209832))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1603)
                    }
                    
                    Label_1468:
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1614)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-932009300))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-450376500))
                        goto(Label_1025)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0902)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1173063049))
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(2131850771))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1619148853))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1603:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6DA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1614:
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1202128689))
                        goto(Label_1468)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(181484945))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1478797421))
                        goto(Label_1025)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0902)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1128809028))
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(-317679866))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6CF = and:int(var_3_6CF:int, ldc:int(1996085098))
                        var_17_6DA = add:int(var_16_119:int, and:int(ldc:int(19745), ldc:int(5)))
                        looporswitchbreak()
                    }
                    
                    var_3_6CF = and:int(var_3_6CF:int, ldc:int(-476480244))
                }
                
                var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1430897073))
                
                if (cmple:boolean(var_5_81 = var_17_6DA:int, sub:int(var_6_88:int, xor:int(ldc:int(24576), ldc:int(24577))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6CF:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_6CF = and:int(var_3_6CF:int, ldc:int(-1334668555))
            goto(Label_0108)
        }
    }
}
