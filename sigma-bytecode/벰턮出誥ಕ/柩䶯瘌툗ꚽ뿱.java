public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 {
    public void \u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d p0) {
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
    
    public void \u6c52\u8753\ua61f\u8709\u385b\ub171() {
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
            invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u0c95\u74b1\u4179\u516c\u7e3f\ubcb0, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokespecial:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u3504\ud36e\u8389\ubf56\u946b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String \u71f1\u3504\ud36e\u8389\ubf56\u946b() {
        var_1_7C : StringBuilder
        var_2_9A : \u527a\u873d\u071d\u4f52\uc229\ud217
        
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
            var_1_7C = initobject:StringBuilder(StringBuilder::<init>, ternaryop:String(cmpeq:boolean(invokevirtual:\uf995\ubf56\u7af6\u6b0d\u71ae(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8df4\u3711\u7af6\u1833\ubff1, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), getstatic:\uf995\ubf56\u7af6\u6b0d\u71ae(\uf995\ubf56\u7af6\u6b0d\u71ae::\u624e\u64ab\u6c56\u74b1\u3c25)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(18)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(19))))
            invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(20)))
            invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, invokeinterface:String(GameVersion::getName, invokestatic:GameVersion(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u51b2\u5db4\u67d0\u4975\u183a\uc29a)))
            var_2_9A = invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            
            if (logicaland:boolean(cmpne:boolean(var_2_9A:\u527a\u873d\u071d\u4f52\uc229\ud217, aconstnull:\u527a\u873d\u071d\u4f52\uc229\ud217()), invokevirtual:boolean(\u527a\u494c\u88c5\u965f\u759a::\u98a4\u960f\u6198\u3d4b\ub83f\ud171, invokevirtual:\u527a\u494c\u88c5\u965f\u759a(\u527a\u873d\u071d\u4f52\uc229\ud217::\ua562\u9255\u36d3\u8389\uc246\ub113, var_2_9A:\u527a\u873d\u071d\u4f52\uc229\ud217)))) {
                invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(21)))
                
                if (logicaland:boolean(cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d()), logicalnot:boolean(invokevirtual:boolean(\uf995\u64f2\u3711\uc2e8\u927d::\u3711\u0c95\u718f\u9033\u4cd9\u8308, getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(22)), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                }
                else {
                    if (invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3711\u62da\u718f\ucef1\u6fb0\u71f1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
                        invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(23)), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                    }
                    else {
                        if (logicaland:boolean(cmpeq:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d()), logicalor:boolean(cmpeq:boolean(getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ub8be\u071d\u527a\u3711\ubff1\u759a()), logicalnot:boolean(invokevirtual:boolean(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))))) {
                            invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(24)), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                        }
                        else {
                            invokevirtual:StringBuilder(StringBuilder::append, var_1_7C:StringBuilder, invokestatic:String(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u7e3f\ua562\ubb2b\u61a4\u7330\u4c2b, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(25)), newarray:Object[](java.lang.Object.class, ldc:int(0))))
                        }
                    }
                }
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_1_7C:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.authlib.minecraft.SocialInteractionsService \u4179\uc84e\u8df4\u98a4\u392e\u6d69(com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d p1) {
        var_3_67 : AuthenticationException
        
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
                            
                            looporswitchbreak(Block_3)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Block_3:
        
        try {
            return:SocialInteractionsService(invokevirtual:YggdrasilSocialInteractionsService[expected:SocialInteractionsService](YggdrasilAuthenticationService::createSocialInteractionsService, p0:YggdrasilAuthenticationService, invokevirtual:String(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\u72f1\uc229\u759a\u600f\ua6bd\u47c2, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u5fe1\u6435\ud217\u183a\u8cae\u1833::\u392e\ud12e\u0b8e\u97b7\u156b\u759a, getfield:\u5fe1\u6435\ud217\u183a\u8cae\u1833(\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d::\u392e\ub19c\ub102\uc4d2\u56bd\uf9c5, p1:\uc29a\u6ec6\ub70c\u5bc4\u9255\u071d)))))
        }
        catch (com.mojang.authlib.exceptions.AuthenticationException var_3_67) {
            invokeinterface:void(Logger::error, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(26)), var_3_67:Throwable)
            return:SocialInteractionsService(initobject:OfflineSocialInteractions[expected:SocialInteractionsService](OfflineSocialInteractions::<init>))
        }
    }
    
    public boolean \ufe34\u8709\u2dcc\u7bad\u7049\u5245() {
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
            return:boolean(ldc:boolean(0))
        }
        
        goto(Label_0006)
    }
    
    private void \u120d\u527a\uc4d2\u5140\u71ae\u98a4(java.lang.Throwable p0) {
        var_2_82 : StringTextComponent
        
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
            
            if (cmpgt:boolean(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<String>(\u4f52\ua068\u4f52\u47c2\u4492::\u4c04\ua3b4\u4daf\uc31c\ud217\u51b2, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), ldc:int(1))) {
                if (instanceof:boolean(\u3504\ufe34\u600f\u6b0d\u69d9.\u624e\u7330\u5654\u34df\u183a.class, p0:Throwable)) {
                    var_2_82 = initobject:StringTextComponent(StringTextComponent::<init>, invokeinterface:String(\u4f52\u7ce1\uc229\ucef1\ube23::\u8cae\u7d52\u647c\u3bd6\u0c95\u965f, invokevirtual:\u4f52\u7ce1\uc229\ucef1\ube23(\u624e\u7330\u5654\u34df\u183a::\uf9c5\u51b2\u5db4\u6c52\u6c56\u62da, checkcast:\u624e\u7330\u5654\u34df\u183a(\u3504\ufe34\u600f\u6b0d\u69d9.\u624e\u7330\u5654\u34df\u183a.class, p0:Throwable[expected:\u624e\u7330\u5654\u34df\u183a]))))
                }
                else {
                    var_2_82 = aconstnull:StringTextComponent()
                }
                
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\u392e\u647c\u67e9\u72f1\u4c04, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:Throwable, var_2_82:StringTextComponent[expected:ITextComponent])
            }
            else {
                invokestatic:void(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u0c95\u3e2a\u3776\uc238\u4f4a\uc238, p0:Throwable)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u59ec\u392e\u647c\u67e9\u72f1\u4c04(java.lang.Throwable p0, net.minecraft.util.text.ITextComponent p1) {
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
    
    public void run() {
        var_1_60 : int
        var_2_81 : \u5db4\u8640\u6cfe\u9a18\ubff1
        var_3_86 : boolean
        var_2_BB : OutOfMemoryError
        var_1_EC : \uceb8\u8258\uf9c5\uc229\u7330\ucfaf
        var_2_128 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_1_114 : Throwable
        
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
            putfield:Thread(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u600f\uc9f6\u3e75\uc238\u6d69\ub8be, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokestatic:Thread(Thread::currentThread))
            
            try {
                var_1_60 = ldc:int(0)
                
                while (getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf995\uff55\uc7fe\u0a06\u6c56\u494c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
                    if (cmpne:boolean(getfield:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7873\u4179\u52d3\u516c\u4179\u3776, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e())) {
                        invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u8753\ub171\ua3b4\u8709\ucef1, getfield:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7873\u4179\u52d3\u516c\u4179\u3776, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                        return:void()
                    }
                    
                    try {
                        var_2_81 = invokestatic:\u5db4\u8640\u6cfe\u9a18\ubff1(\u5db4\u8640\u6cfe\u9a18\ubff1::\u6b5f\ud12e\u3e2a\u0800\u494c\u3a62, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(28)))
                        var_3_86 = invokespecial:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u97e6\u6c52\u927d\u6cfe\ud12e\uc910, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                        invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7006\u718f\u72f1\ub102\u8753\u7c6b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_3_86:boolean, var_2_81:\u5db4\u8640\u6cfe\u9a18\ubff1)
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ucef1\u8258\u446c\u760c\u1833\u36d3, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                        invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u8d98\ua3b4\u3e75\ud523\u960f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, cmpeq:boolean(var_1_60:int, ldc:int(0)))
                        invokevirtual:void(\u6b0d\ua068\uc4d2\u5245\u4d85::\ubded\u759a\u2dcc\u927d\u8d98, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))
                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u8aa5\ufcaf\u64f2\ua562\ubefe\u69d9, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                        invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\u74b1\u1187\u416d\u1187\ua562, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_3_86:boolean, var_2_81:\u5db4\u8640\u6cfe\u9a18\ubff1)
                    }
                    catch (java.lang.OutOfMemoryError var_2_BB) {
                        if (cmpne:boolean(var_1_60:int, ldc:int(0))) {
                            athrow(var_2_BB:OutOfMemoryError)
                        }
                        
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u4bc8\u7006\u4c2b\u5d20\u62da, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u3504\u92ff\ubf56\u0b8e\ud217\u51b2[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u3504\u92ff\ubf56\u0b8e\ud217\u51b2::<init>))
                        invokestatic:void(System::gc)
                        invokeinterface:void(Logger::fatal, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(29)), var_2_BB:OutOfMemoryError[expected:Throwable])
                        var_1_60 = ldc:int(1)
                    }
                }
            }
            catch (\u47c2\u2dcc\u12cb\ud171\u8c8a.\uceb8\u8258\uf9c5\uc229\u7330\ucfaf var_1_EC) {
                invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5db4\uc2bd\u4ab3\ud4fe\uc31c\ub18d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::\u4c04\u3711\ub113\u718f\u9af2\u4d85, var_1_EC:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u4bc8\u7006\u4c2b\u5d20\u62da, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                invokeinterface:void(Logger::fatal, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(30)), var_1_EC:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf[expected:Throwable])
                invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u8753\ub171\ua3b4\u8709\ucef1, invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::\u4c04\u3711\ub113\u718f\u9af2\u4d85, var_1_EC:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf))
            }
            catch (java.lang.Throwable var_1_114) {
                var_2_128 = invokevirtual:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5db4\uc2bd\u4ab3\ud4fe\uc31c\ub18d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(31)), var_1_114:Throwable))
                invokeinterface:void(Logger::fatal, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(32)), var_1_114:Throwable)
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u4bc8\u7006\u4c2b\u5d20\u62da, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u8753\ub171\ua3b4\u8709\ucef1, var_2_128:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u4c04\ubefe\ucef1\u647c\u8308(boolean p0) {
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
            invokevirtual:void(\u61a4\u600f\uae87\ube23\u927d\u4179::\u8709\u8258\u6ec6\u9033\uff55\u8d98, getfield:\u61a4\u600f\uae87\ube23\u927d\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ternaryop:ImmutableMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](p0:boolean, invokestatic:ImmutableMap(ImmutableMap::of, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8d98\u4daf\u3776\ua562\ubefe\ub19c), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub19c\u8308\u927d\u7e3f\u67d0\u4975)), invokestatic:ImmutableMap(ImmutableMap::of)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u56bd\u120d\u8cae\u6198\u6c52\ube23() {
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
    
    private void \u9033\u7d52\u183a\u5245\u392e\u59ec(int p0, long p1) {
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
            putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u836c\ub7dc\ud158\u6198\ub19c\u8d90, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:boolean(0))
            invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ua562\u7043\u3711\u183a\u2dcc\uc7fe, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \ud12e\u92ff\u385b\u97e6\u4ab3\u4975() {
        var_1_7C : String[]
        var_2_7F : int
        var_3_81 : int
        var_5_91 : String
        
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
            var_1_7C = initarray:String[](java.lang.String[].class, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(33)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(34)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(35)))
            var_2_7F = arraylength:int(var_1_7C:String[])
            var_3_81 = ldc:int(0)
            
            while (cmplt:boolean(var_3_81:int, var_2_7F:int)) {
                var_5_91 = invokestatic:String(System::getProperty, loadelement:String(var_1_7C:String[], var_3_81:int))
                
                if (logicaland:boolean(cmpne:boolean(var_5_91:String, aconstnull:String()), invokevirtual:boolean(String::contains, var_5_91:String, loadelement:String[expected:CharSequence](getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(36))))) {
                    return:boolean(ldc:boolean(1))
                }
                
                inc:int(var_3_81, ldc:int(1))
            }
            
            return:boolean(ldc:boolean(0))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd \u16f6\ucfaf\u3776\u9a18\u927d\uc238() {
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
            return:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(getfield:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub19c\u759a\u071d\u9937\ufe34\u7043, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u36d3\uc84e\u494c\ud36e\u446c\u6c56() {
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
            return:String(getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\u3dd3\u12b2\u88c5\ub102\ub7dc, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ub171\ufe34\u836c\u4975\u67e9\u0c95() {
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
            return:String(getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubf56\u3d4b\u8c8a\ua6bd\u5654\u59ec, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\ube23\u12cb\u839e\u3e2a\u52d3(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
            putfield:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7873\u4179\u52d3\u516c\u4179\u3776, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9937\u8753\ub171\ua3b4\u8709\ucef1(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
        var_2_AE : File
        
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
            var_2_AE = initobject:File(File::<init>, initobject:File(File::<init>, getfield:File(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u836c\u416d\ubefe\u92ff\uf94d, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(37))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(38))), invokevirtual:String(DateFormat::format, initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(39))), initobject:Date(Date::<init>))), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(40)))))
            invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u9af2\u5fe1\u836c\u56bd\u385b\uc84e, invokevirtual:String(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubded\uc238\u0b8e\u2dcc\u69d9\u4cd9, p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
            
            if (cmpne:boolean(invokevirtual:File(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u6c56\u392e\u3a62\ubcb0\u69d9\u494c, p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e), aconstnull:File())) {
                invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u9af2\u5fe1\u836c\u56bd\u385b\uc84e, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(41))), invokevirtual:File[expected:Object](\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u6c56\u392e\u3a62\ubcb0\u69d9\u494c, p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))))
                invokestatic:void(System::exit, ldc:int(-1))
            }
            else {
                if (invokevirtual:boolean(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\uc2bd\ud36e\ud171\u3776\u8308\u624e, p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, var_2_AE:File)) {
                    invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u9af2\u5fe1\u836c\u56bd\u385b\uc84e, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(41))), invokevirtual:String(File::getAbsolutePath, var_2_AE:File))))
                    invokestatic:void(System::exit, ldc:int(-1))
                }
                else {
                    invokestatic:void(\u5f50\ucb79\u3e2a\ubb2b\ub6ab\ub83f::\u9af2\u5fe1\u836c\u56bd\u385b\uc84e, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(42)))
                    invokestatic:void(System::exit, ldc:int(-2))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucfaf\u9a18\u93a2\ua562\u6d69\u56bd() {
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
            return:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4bc8\u6b5f\u0800\uc9f6\u62da\u5db4, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \uc29a\u12cb\u0b8e\uceb8\u8df4\u67e9() {
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
    
    private void \u4ab3\u97e6\u5d20\ud217\u183a\u927d() {
        var_1_59 : boolean
        var_2_61 : \uae5d\uafe7\u2dcc\u88c5\u6d69\u5140
        var_3_69 : \ua562\ud4fe\u647c\uc84e\u5245\u5f50
        var_4_70 : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_6_93 : UnmodifiableIterator
        var_7_A9 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_4_E3 : \u97b7\u8350\u99f7\ub1b9\u839e\u873d
        var_5_EB : Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        var_7_10E : UnmodifiableIterator
        var_8_124 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_9_12C : \u97b7\u8350\u99f7\ub1b9\u839e\u873d
        var_5_159 : \u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>
        var_6_161 : Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>
        var_7_177 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        var_8_18D : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_9_1A3 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_10_1AA : String
        
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
        var_1_59 = ldc:boolean(0)
        var_2_61 = invokevirtual:\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140(\u40a9\u7873\u9a18\u3a62\u8350\u9af2::\ua3b4\u3d64\u9255\u92ff\u4975\u62da, invokevirtual:\u40a9\u7873\u9a18\u3a62\u8350\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5bc4\u3bc9\u0c95\u8aa5\uc3e3\u47c2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        var_3_69 = invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\ube23\u839e\u3a62\u40a9\u3a62\u8bb0, invokevirtual:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\uf9c5\uc9f6\u7af6\u74b1\u6fb0\u8413, var_2_61:\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140))
        var_4_70 = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_4_70:Iterator)) {
            var_6_93 = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, invokevirtual:ImmutableList(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u4492\u8d98\uceb8\ubcb0\u6fb0\u183a, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_4_70:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_93:UnmodifiableIterator)) {
                var_7_A9 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::next, var_6_93:Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>))
                
                if (logicaland:boolean(cmpeq:boolean(invokevirtual:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ube23\u59ec\ucb79\ub7dc\u4ab3\u16f6, var_7_A9:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), getstatic:\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b(\u5245\ubff1\ub18d\u6b5f\u3e2a\u156b::\u183a\u9033\u4f4a\u392e\u4e72\ucef1)), cmpeq:boolean(invokevirtual:\ua562\ud4fe\u647c\uc84e\u5245\u5f50(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\uc31c\ufcaf\u5245\u718f\u3d64\ufe34, var_2_61:\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140, var_7_A9:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d), var_3_69:\ua562\ud4fe\u647c\uc84e\u5245\u5f50))) {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(43)), var_7_A9:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object])
                    var_1_59 = ldc:boolean(1)
                }
            }
        }
        
        var_4_E3 = invokeinterface:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\ua562\ud4fe\u647c\uc84e\u5245\u5f50::\u385b\u52d3\u51b2\u5654\u516c\u8350, var_3_69:\ua562\ud4fe\u647c\uc84e\u5245\u5f50)
        var_5_EB = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_5_EB:Iterator)) {
            var_7_10E = invokevirtual:UnmodifiableIterator(ImmutableList::iterator, invokevirtual:ImmutableList(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u4492\u8d98\uceb8\ubcb0\u6fb0\u183a, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokeinterface:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::next, var_5_EB:Iterator<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_7_10E:UnmodifiableIterator)) {
                var_8_124 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::next, var_7_10E:Iterator<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>))
                var_9_12C = invokevirtual:\u97b7\u8350\u99f7\ub1b9\u839e\u873d(\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140::\u2dcc\u836c\uc9f6\u6435\u4c2b\u93a2, var_2_61:\uae5d\uafe7\u2dcc\u88c5\u6d69\u5140, var_8_124:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                
                if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, var_8_124:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), cmpeq:boolean(var_9_12C:\u97b7\u8350\u99f7\ub1b9\u839e\u873d, var_4_E3:\u97b7\u8350\u99f7\ub1b9\u839e\u873d))) {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(44)), var_8_124:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:Object])
                    var_1_59 = ldc:boolean(1)
                }
            }
        }
        
        var_5_159 = invokestatic:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>(\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>::\u8413\u760c\u8308\u76bc\u8350\u3c25)
        var_6_161 = invokevirtual:Iterator<Object>(\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>::iterator, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>[expected:\u7ce1\uafe7\u51b2\u9033\u3e2a\u5245<Object>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc))
        
        while (invokeinterface:boolean(Iterator::hasNext, var_6_161:Iterator)) {
            var_7_177 = checkcast:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52.class, invokeinterface:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::next, var_6_161:Iterator<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>))
            invokevirtual:void(\u99f7\u8aa5\u8709\u52d3\u960f\u392e::clear, var_5_159:\u99f7\u8aa5\u8709\u52d3\u960f\u392e)
            invokevirtual:void(\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u6b0d\u3bd6\u4daf\u3e2a\uf9c5\ucfaf, var_7_177:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, getstatic:\u718f\u99f7\u5bc4\u62da\uff55\u4d85(\u718f\u99f7\u5bc4\u62da\uff55\u4d85::\u120d\u4c2b\ud36e\ud158\u8c8a\u9033), var_5_159:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            var_8_18D = invokevirtual:Iterator<Object>(AbstractList<Object>::iterator, var_5_159:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<Object>[expected:AbstractList<Object>])
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_18D:Iterator)) {
                var_9_1A3 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_8_18D:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                var_10_1AA = invokevirtual:String(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u5db4\ub70c\uafe7\u8cae\u8709\u36d3, var_9_1A3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                
                if (invokevirtual:boolean(String::equals, invokevirtual:String(String::toLowerCase, invokevirtual:String(ITextComponent::getString, initobject:TranslationTextComponent(TranslationTextComponent::<init>, var_10_1AA:String)), getstatic:Locale(Locale::ROOT)), invokevirtual:String[expected:Object](\u9af2\u1833\u156b\u12cb\u7d52\u6c52::\u0b8e\ubefe\u600f\ud51e\u1833\u6c56, var_7_177:\u9af2\u1833\u156b\u12cb\u7d52\u6c52))) {
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(45)), var_9_1A3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56[expected:Object], var_10_1AA:String[expected:Object], invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, var_9_1A3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                }
            }
        }
        
        if (or:boolean(var_1_59:boolean, invokestatic:boolean(\u527a\u59ec\ubded\u7bad\ub70c\u92ff::\ub1b9\u6bb9\u7043\u4179\ua068\ud523))) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(46))))
        }
    }
    
    public \u36d3\u9033\u6b0d\u983f\u8d90.\ub102\uc9f6\u8aa5\ubff1\u4179\u527a \u99f7\u760c\u8350\u4e72\u93a2\u69d9() {
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
            return:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(getfield:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub8be\u927d\u5db4\u34df\u2dcc\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    private void \u6b5f\u8258\uc910\ua6bd\u183a\u8bb0(java.lang.String p0) {
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
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u62da\ub8be\u5654\u494c\u67e9\u8640, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ufcaf\u183a\ucef1\u183a\u8d98\u3e2a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                    invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u5db4\u0c95\u960f\u3776\ud217\u647c, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(47))), getstatic:TextFormatting(TextFormatting::RED)), getstatic:UUID(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u3d4b\uc910\ua61f\u5fe1\ub7dc\u62da))
                }
            }
            else {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u36d3\u8753\u4f4a\u0a06\u72f1\uc910[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u36d3\u8753\u4f4a\u0a06\u72f1\uc910::<init>, p0:String))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u385b\u647c\u4492\u1187\u0a06\u0c95(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            
            if (cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u760c\ud51e\u3e2a\uc910\uc7fe\u71ae, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            if (logicaland:boolean(cmpeq:boolean(var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), cmpeq:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255()))) {
                var_1_78 = initobject:\u6fb0\u3711\u99f7\u16f6\u76bc\u8258[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6fb0\u3711\u99f7\u16f6\u76bc\u8258::<init>)
            }
            else {
                if (logicaland:boolean(cmpeq:boolean(var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\ubcb0\ub1b9\u9af2\u7873\uc31c\u183a, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    if (invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u5bc4\u4f4a\u4f52\u7c6b\u3bc9\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                        var_1_78 = initobject:\ub102\u8df4\u6d99\ub6ab\u960f\u6fb0[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ub102\u8df4\u6d99\ub6ab\u960f\u6fb0::<init>, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, aconstnull:ITextComponent()), invokevirtual:boolean(\uc84e\uc229\u7006\u7049\ufe34\ubb2b::\u7af6\u946b\uceb8\uc246\u5d20\u6b5f, invokevirtual:\uc84e\uc229\u7006\u7049\ufe34\ubb2b(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3d4b\ud523\uff55\u647c\u4ab3\u7af6, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
                    }
                    else {
                        invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u74b1\u56bd\u3d64\u5654\ubb2b\u759a, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                    }
                }
            }
            
            if (logicalor:boolean(instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u6fb0\u3711\u99f7\u16f6\u76bc\u8258.class, var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006), instanceof:boolean(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4c2b\u4f52\uc29a\u718f\ubcb0\u516c.class, var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006))) {
                putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8413\u3d64\u2dcc\u6b0d\u960f\u56bd, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:boolean(0))
                invokevirtual:void(\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f::\u4daf\u92ee\u6d69\u64f2\u8350\uc9f6, invokevirtual:\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f(\u120d\u446c\uff55\u3d64\u494c\u69d9::\ub8be\u6c56\u494c\ud51e\u7330\u3bc9, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:boolean(1))
            }
            
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))
            
            if (cmpne:boolean(var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                invokevirtual:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u56bd\u76bc\u7ce1\ub18d\u759a\ubb2b, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokestatic:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\ud4fe\u8df4\u16f6\u61a4\uc31c\u97b7)
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7, var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uae87\ua562\uceb8\uc9f6\u600f\u74b1, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\ud171\u3e75\u76bc\u99f7\u946b, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5db4\u36d3\u0800\ub8be\uc7fe\u4bc8, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
                invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c), invokevirtual:String(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u8df4\u960f\uc9f6\uf94d\u5fe1\u3e75, var_1_78:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006))
            }
            else {
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u67e9\u183a\u120d\u385b\uc246\ua3b4, getfield:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\ua6bd\u1187\u983f\u7e3f\u5140\u67d0, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6c52\u8753\ua61f\u8709\u385b\ub171, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u6d69\u47c2\ub18d\u3d64\ucef1(\u59ec\u8413\u97e6\uc229\u3776.\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9 p0) {
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
            putfield:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\ub83f\u3d64\u6d99\ucef1\ud217, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u7043\uc9f6\u3504\ubff1\u97e6() {
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
                                
                                looporswitchbreak(Block_3)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Block_3:
            
            try {
                invokeinterface:void(Logger::info, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(48)))
                
                try {
                    invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u5fe1\u3d64\uc87f\uae5d\u0800\u1833, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c))
                }
                catch (java.lang.Throwable stack_70_0) {
                }
                
                try {
                    if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                        invokevirtual:void(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3e2a\u9af2\ub83f\u5d20\uc2e8\u92ee, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                    }
                    
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u8350\u88c5\u7af6\u8413\ub32d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                }
                catch (java.lang.Throwable stack_86_0) {
                }
                
                if (cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                    invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u760c\ud51e\u3e2a\uc910\uc7fe\u71ae, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
                
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::close, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            }
            finally {
                putstatic:LongSupplier(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u0c95\ubcb0\u6cfe\uae5d\u8258\uc87f, invokedynamic:LongSupplier(getAsLong:()Ljava/util/function/LongSupplier;))
                
                if (cmpeq:boolean(getfield:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7873\u4179\u52d3\u516c\u4179\u3776, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e())) {
                    invokestatic:void(System::exit, ldc:int(0))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
        var_1_BB : Throwable
        
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
                                
                                looporswitchbreak(Block_3)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Block_3:
            
            try {
                invokevirtual:void(\u7af6\u67d0\u8753\u71f1\u6198\u494c::close, getfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uceb8\u8aa5\u385b\u3c25\u4c2b\uc2e8, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u61a4\u600f\uae87\ube23\u927d\u4179::close, getfield:\u61a4\u600f\uae87\ube23\u927d\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::close, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::close, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u8258\u76bc\u6b0d\u51b2\u5140\ufe34, getfield:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::close, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\u98a4\u7330\u4f4a\uc2e8\u47c2\u5654, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u965f\ub102\u36d3\u759a\uff55\uc2bd::close, getfield:\u3d64\u74b1\uafe7\u61a4\u3776\ua61f[expected:\u965f\ub102\u36d3\u759a\uff55\uc2bd](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\ub32d\u0b8e\ud158\u74b1\ud36e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u965f\ub102\u36d3\u759a\uff55\uc2bd::close, getfield:\u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9[expected:\u965f\ub102\u36d3\u759a\uff55\uc2bd](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6ec6\u392e\u7c6b\u4c2b\ud217\ud523, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::close, getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8df4\u6fb0\u1187\uf94d\u6fb0\u0b8e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokeinterface:void(\u7049\u40a9\uc87f\u2dcc\ub113::close, getfield:\u7049\u40a9\uc87f\u2dcc\ub113(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\u6c56\ubcb0\u40a9\ube23\ud523, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokestatic:void(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ud523\u8df4\u3a62\u5f50\u8640\ud171)
            }
            catch (java.lang.Throwable var_1_BB) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(49)), var_1_BB:Throwable)
                athrow(var_1_BB:Throwable)
            }
            finally {
                invokevirtual:void(\u4179\u8308\u5db4\ud4fe\ufcaf\u16f6::close, getfield:\u4179\u8308\u5db4\ud4fe\ufcaf\u16f6(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\ub8be\u67d0\u7049\uc2e8\u5654, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::close, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7bad\u8d98\ua3b4\u3e75\ud523\u960f(boolean p0) {
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
    
    private boolean \u97e6\u6c52\u927d\u6cfe\ud12e\uc910() {
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
            return:boolean(logicaland:boolean(logicaland:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8413\u3d64\u2dcc\u6b0d\u960f\u56bd, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u3d64\ud7e8\u7006\u6bb9\u6198\u983f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ud217\u8640\u760c\u92ee\ub6ab\u7006, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))))
        }
        
        goto(Label_0006)
    }
    
    private void \u7006\u718f\u72f1\ub102\u8753\u7c6b(boolean p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u5db4\u8640\u6cfe\u9a18\ubff1 p1) {
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
            
            if (p0:boolean) {
                if (logicalnot:boolean(invokevirtual:boolean(\u56bd\u6b0d\u3711\ub18d\u12b2::\ucef1\ubded\u156b\u8389\u3bd6\u97b7, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u6fb0\ud12e\u8aa5\ub171\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:int(0))
                    invokevirtual:void(\u56bd\u6b0d\u3711\ub18d\u12b2::\u494c\ub171\u7af6\u6ec6\uc29a\u36d3, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
                
                putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u6fb0\ud12e\u8aa5\ub171\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, add:int(getfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u6fb0\ud12e\u8aa5\ub171\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(1)))
            }
            else {
                invokevirtual:void(\u56bd\u6b0d\u3711\ub18d\u12b2::\u8df4\u946b\u5245\u0c95\u8cae\ubb2b, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            putfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokestatic:\ubf56\u64f2\u392e\u98a4\u120d(\u5db4\u8640\u6cfe\u9a18\ubff1::\u6d69\u5245\u88c5\u4492\ua6bd\u9937, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u56bd\u6b0d\u3711\ub18d\u12b2::\u67d0\u6198\ub83f\u0c95\u392e\u7049, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), p1:\u5db4\u8640\u6cfe\u9a18\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u416d\u74b1\u1187\u416d\u1187\ua562(boolean p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u5db4\u8640\u6cfe\u9a18\ubff1 p1) {
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
            
            if (cmpne:boolean(p1:\u5db4\u8640\u6cfe\u9a18\ubff1, aconstnull:\u5db4\u8640\u6cfe\u9a18\ubff1())) {
                invokevirtual:void(\u5db4\u8640\u6cfe\u9a18\ubff1::\u99f7\ub83f\ucef1\u8709\u0b8e\uae5d, p1:\u5db4\u8640\u6cfe\u9a18\ubff1)
            }
            
            if (p0:boolean) {
                putfield:\u4492\u4179\u416d\uc910\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uae87\u5db4\u61a4\u4f52\u8258\u7043, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:\u4492\u4179\u416d\uc910\u8d98(\u56bd\u6b0d\u3711\ub18d\u12b2::\u516c\u67d0\u98a4\uc84e\u8308\u4f52, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
            }
            else {
                putfield:\u4492\u4179\u416d\uc910\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uae87\u5db4\u61a4\u4f52\u8258\u7043, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\u4492\u4179\u416d\uc910\u8d98())
            }
            
            putfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\u56bd\u6b0d\u3711\ub18d\u12b2::\u67d0\u6198\ub83f\u0c95\u392e\u7049, getfield:\u56bd\u6b0d\u3711\ub18d\u12b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\uae5d\u839e\uf9c5\u8308\u97b7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua6bd\u9a18\u88c5\u67d0\uc238\u0a06() {
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
            invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u4e72\u6b0d\u960f\u8709\u873d\u0b8e, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uc3e3\uf995\u12b2\u760c\u6d69\uc31c, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7e3f\u8d90\u4cd9\u965f\u9af2\ub102, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ucfaf\u9a18\u93a2\ua562\u6d69\u56bd, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            
            if (cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u1187\u5245\u67e9\u839e\u494c\uc229, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uae87\ua562\uceb8\uc9f6\u600f\u74b1, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\ud171\u3e75\u76bc\u99f7\u946b, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u120d\u183a\u1187\ubff1\u9af2\u0c95, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))
            }
            
            invokevirtual:void(\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd::\u946b\u5245\u7e3f\uc87f\uc4d2\u183a, invokevirtual:\uc84e\uc2bd\u74b1\u88c5\u4cd9\u56bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u16f6\ucfaf\u3776\u9a18\u927d\uc238, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getstatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u7006\u8709\u5140\u7330\u9937))
            invokevirtual:void(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u120d\u8bb0\u4179\u4f52\u7bad\ud12e, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
            invokevirtual:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u92ff\u9937\ub102\uc87f\u600f\u5f50, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\u99f7\uc7fe\u8c8a\u446c\u5654() {
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
            invokevirtual:void(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u8753\u6c52\u8258\u7bad\u67e9\u624e, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \ubefe\u392e\u3d4b\ubcb0\uf9c5\u8aa5() {
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
            return:int(ternaryop:int(logicalor:boolean(cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255()), logicaland:boolean(cmpeq:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), cmpeq:boolean(getfield:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\ub83f\u3d64\u6d99\ucef1\ud217, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9()))), invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u64ab\u9937\uc87f\u8d98\u36d3\u16f6, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokestatic:int(Math::min, ldc:int(120), invokestatic:int(Math::max, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u64ab\u9937\uc87f\u8d98\u36d3\u16f6, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:int(60)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\u4bc8\u7006\u4c2b\u5d20\u62da() {
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
                                
                                looporswitchbreak(Block_3)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Block_3:
            
            try {
                putstatic:byte[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ee\u4daf\u759a\ubded\ud217\u36d3, newarray:byte[](byte.class, ldc:int(0)))
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\uc87f\uc229\u6bb9\u71ae\u3d64\u5245, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            catch (java.lang.Throwable stack_68_0) {
            }
            
            try {
                invokestatic:void(System::gc)
                
                if (logicaland:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d()))) {
                    invokevirtual:void(\uf995\u64f2\u3711\uc2e8\u927d::\u4f52\u5fe1\u7c6b\u92ee\u7d52\u6c56, getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:boolean(1))
                }
                
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u8350\u88c5\u7af6\u8413\ub32d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u7ce1\u0800\ud217\u647c\u74b1\uc2bd[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u7ce1\u0800\ud217\u647c\u74b1\uc2bd::<init>, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(71)))))
            }
            catch (java.lang.Throwable stack_9E_0) {
            }
            
            invokestatic:void(System::gc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\uc7fe\ud158\u74b1\u97b7\u0800(int p0) {
        var_2_6C : List<\ub19c\u56bd\uae5d\u7006\u6435>
        var_3_80 : \ub19c\u56bd\uae5d\u7006\u6435
        var_4_98 : int
        
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
            
            if (cmpne:boolean(getfield:\u4492\u4179\u416d\uc910\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uae87\u5db4\u61a4\u4f52\u8258\u7043, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u4492\u4179\u416d\uc910\u8d98())) {
                var_2_6C = invokeinterface:List<\ub19c\u56bd\uae5d\u7006\u6435>(\u4492\u4179\u416d\uc910\u8d98::\ud158\u9255\u183a\u3504\uc246\u98a4, getfield:\u4492\u4179\u416d\uc910\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uae87\u5db4\u61a4\u4f52\u8258\u7043, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                
                if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_2_6C:List<\ub19c\u56bd\uae5d\u7006\u6435>))) {
                    var_3_80 = checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(List<\ub19c\u56bd\uae5d\u7006\u6435>::remove, var_2_6C:List<\ub19c\u56bd\uae5d\u7006\u6435>, ldc:int(0)))
                    
                    if (cmpeq:boolean(p0:int, ldc:int(0))) {
                        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, var_3_80:\ub19c\u56bd\uae5d\u7006\u6435)))) {
                            var_4_98 = invokevirtual:int(String::lastIndexOf, getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(30))
                            
                            if (cmpge:boolean(var_4_98:int, ldc:int(0))) {
                                putfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:String(String::substring, getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(0), var_4_98:int))
                            }
                        }
                    }
                    else {
                        if (logicaland:boolean(cmplt:boolean(preincrement:int(-1, p0:int), invokeinterface:int(List<E>::size, var_2_6C:List<\ub19c\u56bd\uae5d\u7006\u6435>)), logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(72)), getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(List<\ub19c\u56bd\uae5d\u7006\u6435>::get, var_2_6C:List<\ub19c\u56bd\uae5d\u7006\u6435>, p0:int))))))) {
                            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                                putfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:char(30))))
                            }
                            
                            putfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(List<\ub19c\u56bd\uae5d\u7006\u6435>::get, var_2_6C:List<\ub19c\u56bd\uae5d\u7006\u6435>, p0:int))))))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub18d\u9937\uc84e\u64ab\ua61f\u12cb(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u4179\u416d\uc910\u8d98 p1) {
        var_3_62 : List<\ub19c\u56bd\uae5d\u7006\u6435>
        var_4_6D : \ub19c\u56bd\uae5d\u7006\u6435
        var_5_B7 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_6_BE : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_8_D3 : int
        var_9_E0 : int
        var_10_196 : double
        var_12_19E : Iterator<\ub19c\u56bd\uae5d\u7006\u6435>
        var_13_1B4 : \ub19c\u56bd\uae5d\u7006\u6435
        var_14_1C4 : int
        var_15_1D5 : int
        var_16_1E0 : int
        var_17_1EB : int
        var_18_1F3 : int
        var_19_216 : int
        var_20_236 : float
        var_19_28F : int
        var_20_2AF : float
        var_21_2BA : float
        var_22_2C9 : float
        var_12_356 : DecimalFormat
        var_13_36E : String
        var_14_377 : String
        var_14_3C4 : String
        var_14_428 : String
        var_16_453 : int
        var_17_46B : \ub19c\u56bd\uae5d\u7006\u6435
        var_18_474 : StringBuilder
        var_19_50C : String
        var_19_562 : String
        
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
            var_3_62 = invokeinterface:List<\ub19c\u56bd\uae5d\u7006\u6435>(\u4492\u4179\u416d\uc910\u8d98::\ud158\u9255\u183a\u3504\uc246\u98a4, p1:\u4492\u4179\u416d\uc910\u8d98, getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\ubb2b\ub113\u3504\u8308\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            var_4_6D = checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(List<\ub19c\u56bd\uae5d\u7006\u6435>::remove, var_3_62:List<\ub19c\u56bd\uae5d\u7006\u6435>, ldc:int(0)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ua61f\u40a9\u3776\u946b\u8389\u98a4, ldc:int(256), getstatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u7006\u8709\u5140\u7330\u9937))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, ldc:int(5889))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc31c\u8df4\ufe34\u4179\ua562\u3d4b, ldc:double(0.0), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), i2d:double(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), ldc:double(0.0), ldc:double(1000.0), ldc:double(3000.0))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, ldc:int(5888))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, ldc:float(0.0f), ldc:float(0.0f), ldc:float(-2000.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
            var_5_B7 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
            var_6_BE = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_5_B7:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            var_8_D3 = sub:int(sub:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:int(160)), ldc:int(10))
            var_9_E0 = sub:int(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:int(320))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\u7049\u92ee\ube23\u3c25\u6d99)
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(i2f:float(var_8_D3:int), ldc:float(176.0f))), f2d:double(sub:float(sub:float(i2f:float(var_9_E0:int), ldc:float(96.0f)), ldc:float(16.0f))), ldc:double(0.0)), ldc:int(200), ldc:int(0), ldc:int(0), ldc:int(0)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(sub:float(i2f:float(var_8_D3:int), ldc:float(176.0f))), i2d:double(add:int(var_9_E0:int, ldc:int(320))), ldc:double(0.0)), ldc:int(200), ldc:int(0), ldc:int(0), ldc:int(0)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(i2f:float(var_8_D3:int), ldc:float(176.0f))), i2d:double(add:int(var_9_E0:int, ldc:int(320))), ldc:double(0.0)), ldc:int(200), ldc:int(0), ldc:int(0), ldc:int(0)))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(i2f:float(var_8_D3:int), ldc:float(176.0f))), f2d:double(sub:float(sub:float(i2f:float(var_9_E0:int), ldc:float(96.0f)), ldc:float(16.0f))), ldc:double(0.0)), ldc:int(200), ldc:int(0), ldc:int(0), ldc:int(0)))
            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_5_B7:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9)
            var_10_196 = ldc:double(0.0)
            var_12_19E = invokeinterface:Iterator<\ub19c\u56bd\uae5d\u7006\u6435>(List<\ub19c\u56bd\uae5d\u7006\u6435>::iterator, var_3_62:List<\ub19c\u56bd\uae5d\u7006\u6435>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_12_19E:Iterator)) {
                var_13_1B4 = checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(Iterator<\ub19c\u56bd\uae5d\u7006\u6435>::next, var_12_19E:Iterator<\ub19c\u56bd\uae5d\u7006\u6435>))
                var_14_1C4 = add:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, var_13_1B4:\ub19c\u56bd\uae5d\u7006\u6435), ldc:double(4.0))), ldc:int(1))
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(6), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                var_15_1D5 = invokevirtual:int(\ub19c\u56bd\uae5d\u7006\u6435::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, var_13_1B4:\ub19c\u56bd\uae5d\u7006\u6435)
                var_16_1E0 = and:int(shr:int(var_15_1D5:int, ldc:int(16)), ldc:int(255))
                var_17_1EB = and:int(shr:int(var_15_1D5:int, ldc:int(8)), ldc:int(255))
                var_18_1F3 = and:int(var_15_1D5:int, ldc:int(255))
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(var_8_D3:int), i2d:double(var_9_E0:int), ldc:double(0.0)), var_16_1E0:int, var_17_1EB:int, var_18_1F3:int, ldc:int(255)))
                var_19_216 = var_14_1C4:int
                
                while (cmpge:boolean(var_19_216:int, ldc:int(0))) {
                    var_20_236 = d2f:float(div:double(mul:double(add:double(var_10_196:double, div:double(mul:double(getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, var_13_1B4:\ub19c\u56bd\uae5d\u7006\u6435), i2d:double(var_19_216:int)), i2d:double(var_14_1C4:int))), ldc:double(6.2831854820251465)), ldc:double(100.0)))
                    invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(i2f:float(var_8_D3:int), mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_20_236:float), ldc:float(160.0f)))), f2d:double(sub:float(i2f:float(var_9_E0:int), mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_20_236:float), ldc:float(160.0f)), ldc:float(0.5f)))), ldc:double(0.0)), var_16_1E0:int, var_17_1EB:int, var_18_1F3:int, ldc:int(255)))
                    inc:int(var_19_216, ldc:int(-1))
                }
                
                invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_5_B7:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(5), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                var_19_28F = var_14_1C4:int
                
                while (cmpge:boolean(var_19_28F:int, ldc:int(0))) {
                    var_20_2AF = d2f:float(div:double(mul:double(add:double(var_10_196:double, div:double(mul:double(getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, var_13_1B4:\ub19c\u56bd\uae5d\u7006\u6435), i2d:double(var_19_28F:int)), i2d:double(var_14_1C4:int))), ldc:double(6.2831854820251465)), ldc:double(100.0)))
                    var_21_2BA = mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_20_2AF:float), ldc:float(160.0f))
                    var_22_2C9 = mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_20_2AF:float), ldc:float(160.0f)), ldc:float(0.5f))
                    
                    if (cmple:boolean(var_22_2C9:float, ldc:float(0.0f))) {
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(i2f:float(var_8_D3:int), var_21_2BA:float)), f2d:double(sub:float(i2f:float(var_9_E0:int), var_22_2C9:float)), ldc:double(0.0)), shr:int(var_16_1E0:int, ldc:int(1)), shr:int(var_17_1EB:int, ldc:int(1)), shr:int(var_18_1F3:int, ldc:int(1)), ldc:int(255)))
                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_6_BE:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], f2d:double(add:float(i2f:float(var_8_D3:int), var_21_2BA:float)), f2d:double(add:float(sub:float(i2f:float(var_9_E0:int), var_22_2C9:float), ldc:float(10.0f))), ldc:double(0.0)), shr:int(var_16_1E0:int, ldc:int(1)), shr:int(var_17_1EB:int, ldc:int(1)), shr:int(var_18_1F3:int, ldc:int(1)), ldc:int(255)))
                    }
                    
                    inc:int(var_19_28F, ldc:int(-1))
                }
                
                invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_5_B7:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
                var_10_196 = add:double(var_10_196:double, getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, var_13_1B4:\ub19c\u56bd\uae5d\u7006\u6435))
            }
            
            var_12_356 = initobject:DecimalFormat(DecimalFormat::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(73)))
            invokevirtual:void(DecimalFormat::setDecimalFormatSymbols, var_12_356:DecimalFormat, invokestatic:DecimalFormatSymbols(DecimalFormatSymbols::getInstance, getstatic:Locale(Locale::ROOT)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            var_13_36E = invokestatic:String(\u4492\u4179\u416d\uc910\u8d98::\ub1b9\u8258\uc31c\u8d98\ub113\u7af6, getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, var_4_6D:\ub19c\u56bd\uae5d\u7006\u6435))
            var_14_377 = loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(2))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(72)), var_13_36E:String[expected:Object]))) {
                var_14_377 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_14_377:String), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(74))))
            }
            
            if (invokevirtual:boolean(String::isEmpty, var_13_36E:String)) {
                var_14_3C4 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_14_377:String), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(75))))
            }
            else {
                var_14_3C4 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_14_377:String), var_13_36E:String), ldc:char(32)))
            }
            
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_3C4:String, i2f:float(sub:int(var_8_D3:int, ldc:int(160))), i2f:float(sub:int(sub:int(var_9_E0:int, ldc:int(80)), ldc:int(16))), ldc:int(16777215))
            var_14_428 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, var_12_356:DecimalFormat[expected:NumberFormat], getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u8753\uc246\u8c8a\u2dcc\uf94d\ubf56, var_4_6D:\ub19c\u56bd\uae5d\u7006\u6435))), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(76))))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_428:String, i2f:float(sub:int(add:int(var_8_D3:int, ldc:int(160)), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_14_428:String))), i2f:float(sub:int(sub:int(var_9_E0:int, ldc:int(80)), ldc:int(16))), ldc:int(16777215))
            var_16_453 = ldc:int(0)
            
            while (cmplt:boolean(var_16_453:int, invokeinterface:int(List<E>::size, var_3_62:List<\ub19c\u56bd\uae5d\u7006\u6435>))) {
                var_17_46B = checkcast:\ub19c\u56bd\uae5d\u7006\u6435(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub19c\u56bd\uae5d\u7006\u6435.class, invokeinterface:\ub19c\u56bd\uae5d\u7006\u6435(List<\ub19c\u56bd\uae5d\u7006\u6435>::get, var_3_62:List<\ub19c\u56bd\uae5d\u7006\u6435>, var_16_453:int))
                var_18_474 = initobject:StringBuilder(StringBuilder::<init>)
                
                if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(72)), getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_18_474:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(77)))
                }
                else {
                    invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, var_18_474:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(78))), add:int(var_16_453:int, ldc:int(1))), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(79)))
                }
                
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, var_18_474:StringBuilder, getfield:String(\ub19c\u56bd\uae5d\u7006\u6435::\uae87\uc246\u97e6\u93a2\u6435\u416d, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))), i2f:float(sub:int(var_8_D3:int, ldc:int(160))), i2f:float(add:int(add:int(add:int(var_9_E0:int, ldc:int(80)), mul:int(var_16_453:int, ldc:int(8))), ldc:int(20))), invokevirtual:int(\ub19c\u56bd\uae5d\u7006\u6435::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))
                var_19_50C = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, var_12_356:DecimalFormat[expected:NumberFormat], getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(76))))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_19_50C:String, i2f:float(sub:int(sub:int(add:int(var_8_D3:int, ldc:int(160)), ldc:int(50)), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_19_50C:String))), i2f:float(add:int(add:int(add:int(var_9_E0:int, ldc:int(80)), mul:int(var_16_453:int, ldc:int(8))), ldc:int(20))), invokevirtual:int(\ub19c\u56bd\uae5d\u7006\u6435::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))
                var_19_562 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(NumberFormat::format, var_12_356:DecimalFormat[expected:NumberFormat], getfield:double(\ub19c\u56bd\uae5d\u7006\u6435::\u8753\uc246\u8c8a\u2dcc\uf94d\ubf56, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(76))))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub83f\u527a\u0c95\u1833\uf9c5\ub7dc, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_19_562:String, i2f:float(sub:int(add:int(var_8_D3:int, ldc:int(160)), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_19_562:String))), i2f:float(add:int(add:int(add:int(var_9_E0:int, ldc:int(80)), mul:int(var_16_453:int, ldc:int(8))), ldc:int(20))), invokevirtual:int(\ub19c\u56bd\uae5d\u7006\u6435::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, var_17_46B:\ub19c\u56bd\uae5d\u7006\u6435))
                inc:int(var_16_453, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u64ab\u6bb9\u52d3\u99f7\ud523() {
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
            
            if (getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf995\uff55\uc7fe\u0a06\u6c56\u494c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
                invokevirtual:void(\u6b0d\ua068\uc4d2\u5245\u4d85::\u8d90\u5bc4\ubded\u51fa\u6c52, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c))
            }
            
            putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf995\uff55\uc7fe\u0a06\u6c56\u494c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4e72\u3d4b\uc87f\u51fa\u516c\u67d0() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf995\uff55\uc7fe\u0a06\u6c56\u494c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \u4d85\ube23\uc9f6\u64f2\u9af2\ud51e(boolean p0) {
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
            
            if (cmpeq:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())) {
                if (logicaland:boolean(invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7d52\u47c2\u4179\u8350\u624e\uf94d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), logicalnot:boolean(invokevirtual:boolean(\uf995\u64f2\u3711\uc2e8\u927d::\u3711\u0c95\u718f\u9033\u4cd9\u8308, getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u120d\u839e\uc7fe\ubded\u8709\u3e75[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u120d\u839e\uc7fe\ubded\u8709\u3e75::<init>, logicalnot:boolean(p0:boolean)))
                    invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u51b2\u3e2a\u759a\u839e\u59ec\ud12e, getfield:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
                else {
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u120d\u839e\uc7fe\ubded\u8709\u3e75[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u120d\u839e\uc7fe\ubded\u8709\u3e75::<init>, ldc:boolean(1)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9937\u59ec\uceb8\u8c8a\u74b1\u71f1(boolean p0) {
        var_2_91 : \ud4fe\u120d\u9a18\u385b\u4492\u5f50
        var_3_96 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_4_A9 : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            
            if (logicalnot:boolean(p0:boolean)) {
                putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:int(0))
            }
            
            if (logicaland:boolean(cmple:boolean(getfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                if (logicaland:boolean(logicaland:boolean(p0:boolean, cmpne:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79())), cmpeq:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u5d20\u494c\ucb79\u3504\u7ce1\u983f)))) {
                    var_2_91 = checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\ud4fe\u120d\u9a18\u385b\u4492\u5f50](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                    var_3_96 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, var_2_91:\ud4fe\u120d\u9a18\u385b\u4492\u5f50)
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_3_96:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
                        var_4_A9 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u6ec6\ub19c\uc2e8\u5140\ubefe\u5f50, var_2_91:\ud4fe\u120d\u9a18\u385b\u4492\u5f50)
                        
                        if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u647c\u6fb0\u12cb\uc238\u7e3f\u7bad, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_3_96:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_4_A9:\u760c\u4975\u4179\uc246\u8640\u64f2)) {
                            invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\ub83f\uc84e\u9033\uc238\u3bd6\uc4d2, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_3_96:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_4_A9:\u760c\u4975\u4179\uc246\u8640\u64f2)
                            invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))
                        }
                    }
                }
                else {
                    invokevirtual:void(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\uafe7\ud12e\uc229\u69d9\ud171\u98a4, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\uc3e3\u8709\u1833\ud158\u965f() {
        var_1_62 : \u51b2\u9033\ubff1\uf9c5\ufe34
        var_2_B0 : \u6ec6\uc7fe\u927d\u6cfe\ub32d
        var_3_EC : boolean
        var_4_155 : \ud4fe\u120d\u9a18\u385b\u4492\u5f50
        var_5_15C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_1_62 = initobject:\u51b2\u9033\ubff1\uf9c5\ufe34(\u51b2\u9033\ubff1\uf9c5\ufe34::<init>, getstatic:\u3711\u3e75\u7ce1\uc3e3\ufe34(\u3711\u3e75\u7ce1\uc3e3\ufe34::\u5f50\u7bad\ubcb0\u600f\u4975))
        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6435\u385b\uae5d\u7049\u8bb0])
        
        if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d])) {
            return:void()
        }
        
        if (cmple:boolean(getfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(0))) {
            if (cmpeq:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79())) {
                invokeinterface:void(Logger::error, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(80)))
                
                if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ua6bd\u647c\u5d20\u36d3\u3bc9\u3d4b, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                    putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:int(10))
                }
            }
            else {
                if (logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ua3b4\u5fe1\u873d\u6b5f\u71f1\u5db4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    var_2_B0 = aconstnull:\u6d99\ubb2b\u5f50\ua6bd\ub102()
                    
                    if (cmpeq:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u56bd\u873d\uc2e8\u7ce1\u6b5f\ub113))) {
                        var_2_B0 = initobject:\u6d99\ubb2b\u5f50\ua6bd\ub102(\u6d99\ubb2b\u5f50\ua6bd\ub102::<init>, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), ldc:boolean(1))
                        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_2_B0:\u6d99\ubb2b\u5f50\ua6bd\ub102[expected:\u6435\u385b\uae5d\u7049\u8bb0])
                        
                        if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_2_B0:\u6d99\ubb2b\u5f50\ua6bd\ub102)) {
                            return:void()
                        }
                    }
                    
                    var_3_EC = invokevirtual:boolean(\uc246\ub102\u5fe1\ubf56\u183a\u836c::equals, invokestatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c(\uff55\u7006\u8cae\u51fa\u7330\u873d::\u3e2a\u6b5f\u4daf\u6d99\u873d\ub113), getstatic:\uc246\ub102\u5fe1\ubf56\u183a\u836c[expected:Object](\uc246\ub102\u5fe1\ubf56\u183a\u836c::\u516c\ua6bd\u6b5f\u51b2\ubded\u4f4a))
                    
                    if (var_3_EC:boolean) {
                        invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))
                    }
                    
                    switch (loadelement:int(getstatic:int[](\u6435\uff55\u8640\ub6ab\u527a\u4179::\u624e\u4492\ud12e\uc238\u9033\uc84e), invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6[expected:Enum<\u8753\u718f\ufe34\u3504\u3c25\uc9f6>](\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                        case 1:
                            invokevirtual:void(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ud12e\uc238\u0b8e\u92ee\ua6bd\u4daf, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
                            
                            if (cmpne:boolean(var_2_B0:\u6d99\ubb2b\u5f50\ua6bd\ub102, aconstnull:\u6d99\ubb2b\u5f50\ua6bd\ub102())) {
                                invokevirtual:void(\u6d99\ubb2b\u5f50\ua6bd\ub102::\u3bc9\u416d\u600f\ua068\u0800, var_2_B0:\u6d99\ubb2b\u5f50\ua6bd\ub102)
                                invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_2_B0:\u6d99\ubb2b\u5f50\ua6bd\ub102[expected:\u6435\u385b\uae5d\u7049\u8bb0])
                                looporswitchbreak()
                            }
                            
                            looporswitchbreak()
                        
                        case 2:
                            var_4_155 = checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\ud4fe\u120d\u9a18\u385b\u4492\u5f50](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                            var_5_15C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, var_4_155:\ud4fe\u120d\u9a18\u385b\u4492\u5f50)
                            
                            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
                                invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u6ec6\ub83f\u527a\u72f1\u156b\u97e6, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u6ec6\ub19c\uc2e8\u5140\ubefe\u5f50, var_4_155:\ud4fe\u120d\u9a18\u385b\u4492\u5f50))
                                looporswitchbreak()
                            }
                            
                            goto(Label_0383)
                        
                        case 3:
                            Label_0383:
                            
                            if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ua6bd\u647c\u5d20\u36d3\u3bc9\u3d4b, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                                putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3504\u0800\ub6ab\u4f4a\u946b\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:int(10))
                            }
                            
                            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\u8c8a\u156b\uc84e\u4d85\ucef1\ud171, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                            looporswitchbreak()
                    }
                    
                    if (logicalnot:boolean(var_3_EC:boolean)) {
                        invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))
                    }
                }
            }
        }
    }
    
    private void \ub7dc\ubefe\ub6ab\ud36e\u4f4a\u4f52() {
        var_1_62 : \u51b2\u9033\ubff1\uf9c5\ufe34
        var_2_A7 : \u34df\ub113\u6c56\u97e6\u51b2\u4c2b[]
        var_3_AA : int
        var_4_AC : int
        var_5_B8 : \u34df\ub113\u6c56\u97e6\u51b2\u4c2b
        var_6_C3 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_7_FB : \u836c\u8709\uae87\u93a2\u4d85\u5db4
        var_8_102 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_9_115 : \u9af2\ucef1\ub102\u16f6\u61a4\ud523
        var_10_151 : \ud4fe\u120d\u9a18\u385b\u4492\u5f50
        var_11_158 : int
        var_12_16D : \u9af2\ucef1\ub102\u16f6\u61a4\ud523
        var_7_1D3 : \u9af2\ucef1\ub102\u16f6\u61a4\ud523
        
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
        var_1_62 = initobject:\u51b2\u9033\ubff1\uf9c5\ufe34(\u51b2\u9033\ubff1\uf9c5\ufe34::<init>, getstatic:\u3711\u3e75\u7ce1\uc3e3\ufe34(\u3711\u3e75\u7ce1\uc3e3\ufe34::\u120d\uf995\u4c2b\u8d98\u527a))
        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6435\u385b\uae5d\u7049\u8bb0])
        
        if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d])) {
            return:void()
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u3711\u12cb\uc2e8\u5bc4\u183a\ufe34, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
            putfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubcb0\u8d98\u3bc9\u7006\u51fa\u97e6, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:int(4))
            
            if (logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ua3b4\u5fe1\u873d\u6b5f\u71f1\u5db4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (cmpeq:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79())) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(80)))
                }
                
                var_2_A7 = invokestatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b[](\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::values)
                var_3_AA = arraylength:int(var_2_A7:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b[])
                var_4_AC = ldc:int(0)
                
                while (cmplt:boolean(var_4_AC:int, var_3_AA:int)) {
                    var_5_B8 = loadelement:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(var_2_A7:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b[], var_4_AC:int)
                    var_6_C3 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                    
                    if (cmpne:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79())) {
                        switch (loadelement:int(getstatic:int[](\u6435\uff55\u8640\ub6ab\u527a\u4179::\u624e\u4492\ud12e\uc238\u9033\uc84e), invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6[expected:Enum<\u8753\u718f\ufe34\u3504\u3c25\uc9f6>](\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                            case 1:
                                var_7_FB = checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                                var_8_102 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, var_7_FB:\u836c\u8709\uae87\u93a2\u4d85\u5db4)
                                var_9_115 = invokevirtual:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u8df4\u7ce1\u4d85\u416d\u516c\ua6bd, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_8_102:\u7d52\u718f\u3776\u6fb0\ub83f, var_7_FB:\u836c\u8709\uae87\u93a2\u4d85\u5db4, var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\uf995\u7ce1\u4bc8\u4c04\u93a2\u74b1, var_9_115:\u9af2\ucef1\ub102\u16f6\u61a4\ud523))) {
                                    var_9_115 = invokevirtual:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u8df4\u7ce1\u4d85\u416d\u516c\ua6bd, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_8_102:\u7d52\u718f\u3776\u6fb0\ub83f, var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                                }
                                
                                if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\uf995\u7ce1\u4bc8\u4c04\u93a2\u74b1, var_9_115:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                                    if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\u071d\u7873\u7006\u4daf\u5140\u3bc9, var_9_115:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                                        invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                                    }
                                    
                                    return:void()
                                }
                                
                                looporswitchbreak()
                            
                            case 2:
                                var_10_151 = checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\ud4fe\u120d\u9a18\u385b\u4492\u5f50](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                                var_11_158 = invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_6_C3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                var_12_16D = invokevirtual:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\uc3e3\uc84e\u92ee\ud217\ud158\u93a2, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b, var_10_151:\ud4fe\u120d\u9a18\u385b\u4492\u5f50)
                                
                                if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\uf995\u7ce1\u4bc8\u4c04\u93a2\u74b1, var_12_16D:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                                    if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\u071d\u7873\u7006\u4daf\u5140\u3bc9, var_12_16D:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                                        invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                                        
                                        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_6_C3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), logicalor:boolean(cmpne:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_6_C3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), var_11_158:int), invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ubb2b\ub8be\uf9c5\u6435\u8bb0\u3d64, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                                            invokevirtual:void(\u3d64\u8350\u88c5\u12b2\u4c04\u8350::\u7bad\u6bb9\u071d\u7049\u6cfe\uc3e3, getfield:\u3d64\u8350\u88c5\u12b2\u4c04\u8350(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u7c6b\u88c5\u69d9\u8753\u71ae\ucfaf, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                                        }
                                    }
                                    
                                    return:void()
                                }
                                
                                if (cmpeq:boolean(var_12_16D:\u9af2\ucef1\ub102\u16f6\u61a4\ud523, getstatic:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\ub113\ub18d\u3711\u2dcc\ud7e8\ubefe))) {
                                    return:void()
                                }
                                
                                looporswitchbreak()
                        }
                    }
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_6_C3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        var_7_1D3 = invokevirtual:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u62da\ud523\u72f1\u98a4\uf9c5\u759a, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                        
                        if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\uf995\u7ce1\u4bc8\u4c04\u93a2\u74b1, var_7_1D3:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                            if (invokevirtual:boolean(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\u071d\u7873\u7006\u4daf\u5140\u3bc9, var_7_1D3:\u9af2\ucef1\ub102\u16f6\u61a4\ud523)) {
                                invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                            }
                            
                            invokevirtual:void(\u3d64\u8350\u88c5\u12b2\u4c04\u8350::\u7bad\u6bb9\u071d\u7049\u6cfe\uc3e3, getfield:\u3d64\u8350\u88c5\u12b2\u4c04\u8350(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u7c6b\u88c5\u69d9\u8753\u71ae\ucfaf, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), var_5_B8:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b)
                            return:void()
                        }
                    }
                    
                    inc:int(var_4_AC, ldc:int(1))
                }
            }
        }
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\ub70c\u600f\u93a2\uc910\u9937\u946b \u62da\uceb8\u8aa5\ud7e8\u4daf\uae5d() {
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
            return:\ub70c\u600f\u93a2\uc910\u9937\u946b(getfield:\ub70c\u600f\u93a2\uc910\u9937\u946b(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\uff55\u93a2\ubf56\u7049\ubb2b() {
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
    
    private boolean \u8d90\uc3e3\u69d9\u3d64\u8258\ubff1() {
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
            return:boolean(logicalor:boolean(logicalnot:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), logicaland:boolean(cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d()), invokevirtual:boolean(\uf995\u64f2\u3711\uc2e8\u927d::\u3711\u0c95\u718f\u9033\u4cd9\u8308, getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))))
        }
        
        goto(Label_0006)
    }
    
    private void \u4bc8\uff55\u6d69\u946b\u0b8e\u983f() {
        var_1_6C : \uc3e3\ubcb0\u946b\u8aa5\u4975\ud523
        var_1_DC : int
        var_2_ED : boolean
        var_3_F8 : boolean
        var_2_2E0 : \ubcb0\u4ab3\u4c04\uae5d\uc238
        
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
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u97e6\u8389\uf9c5\u6198\u51b2\u3711, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                var_1_6C = invokevirtual:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8cae\u5fe1\u385b\u6b0d\uc87f\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u600f\u836c\u516c\u59ec\u983f\u36d3, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523(\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523::\u4c2b\u6c52\u4f4a\u72f1\u392e\uceb8, invokevirtual:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8cae\u5fe1\u385b\u6b0d\uc87f\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
                
                if (cmpne:boolean(invokevirtual:boolean(\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523::\u8413\u59ec\u5bc4\u9937\u8c8a\ud7e8, var_1_6C:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523), invokevirtual:boolean(\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523::\u8413\u59ec\u5bc4\u9937\u8c8a\ud7e8, invokevirtual:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8cae\u5fe1\u385b\u6b0d\uc87f\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                    invokevirtual:void(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u64f2\u5654\u76bc\uc29a\ubded\uf995, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ternaryop:\u7d52\u718f\u3776\u6fb0\ub83f(invokevirtual:boolean(\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523::\u8413\u59ec\u5bc4\u9937\u8c8a\ud7e8, invokevirtual:\uc3e3\ubcb0\u946b\u8aa5\u4975\ud523(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8cae\u5fe1\u385b\u6b0d\uc87f\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\uc229\u8aa5\u873d\u0b8e\u4975, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()))
                }
                
                invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ud36e\u385b\ub8be\u718f\u6c52\ub8be, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uc2bd\u120d\u59ec\u6c56\u3d64\u7330, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                putfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4d85\ua6bd\u4cd9\u7006\u69d9\u7049, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4d85\ua6bd\u4cd9\u7006\u69d9\u7049, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            }
            
            var_1_DC = ldc:int(0)
            
            while (cmplt:boolean(var_1_DC:int, ldc:int(9))) {
                var_2_ED = invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf94d\u183a\u446c\u71f1\u5654\u9033, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                var_3_F8 = invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u8258\u1187\u600f\u8aa5\ucb79\u6435, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                
                if (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, loadelement:\u40a9\u36d3\u183a\u446c\u3504\ubf56(getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56[](\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u873d\u47c2\ube23\uc29a\u71ae\u2dcc, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), var_1_DC:int))) {
                    if (invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                        invokevirtual:void(\uff55\ucb79\u34df\u8d90\ud523\u6d99::\u0c95\u69d9\u759a\u97e6\u3a62\ud12e, invokevirtual:\uff55\ucb79\u34df\u8d90\ud523\u6d99(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u56bd\ubff1\ube23\uae87\u6ec6\u8df4, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), var_1_DC:int)
                    }
                    else {
                        if (logicalor:boolean(logicalor:boolean(logicalnot:boolean(invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u120d\u946b\uff55\u8389\u3e75\uff55, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), cmpne:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())), logicalnot:boolean(logicalor:boolean(var_3_F8:boolean, var_2_ED:boolean)))) {
                            putfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), var_1_DC:int)
                        }
                        else {
                            invokestatic:void(\u64ab\u6435\u647c\u6198\u3a62\u64f2::\u3504\u5d20\ud7e8\u72f1\u9af2\u6d69, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_1_DC:int, var_3_F8:boolean, var_2_ED:boolean)
                        }
                    }
                }
                
                inc:int(var_1_DC, ldc:int(1))
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ub102\u6198\ub83f\u4f52\u446c\u5654, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (logicalnot:boolean(invokespecial:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8d90\uc3e3\u69d9\u3d64\u8258\ubff1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                    invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u8aa5\uc910\u7e3f\u392e\u64ab\ub18d, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:ITextComponent(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2), ldc:boolean(1))
                    invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u624e\u76bc\u92ee\u5db4\u5654\u88c5, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c), invokeinterface:String(ITextComponent::getString, getstatic:ITextComponent(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2)))
                }
                else {
                    if (cmpne:boolean(getfield:\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc84e\u624e\ufcaf\uc2e8\u5db4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3())) {
                        invokevirtual:void(\ud217\ufe34\u4d85\u6b0d\u1187\u5f50::\u6c56\u946b\uc246\u64ab\uc246\u67e9, getfield:\ud217\ufe34\u4d85\u6b0d\u1187\u5f50(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubded\ud4fe\ua6bd\u71ae\u494c\u7330, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc84e\u624e\ufcaf\uc2e8\u5db4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                        putfield:\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc84e\u624e\ufcaf\uc2e8\u5db4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3())
                    }
                    
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u718f\u183a\u6d99\u3bc9\ub70c\u7af6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u718f\u183a\u6d99\u3bc9\ub70c\u7af6::<init>))
                }
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (invokevirtual:boolean(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\ufcaf\u9033\u6cfe\u7d52\u9af2\uc910, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                    invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u6bb9\u7e3f\u6bb9\u71f1\u6c52\ubefe, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
                else {
                    invokevirtual:void(\ud217\ufe34\u4d85\u6b0d\u1187\u5f50::\u64f2\u4f52\u7330\u8308\ubefe\uf9c5, getfield:\ud217\ufe34\u4d85\u6b0d\u1187\u5f50(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubded\ud4fe\ua6bd\u71ae\u494c\u7330, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\ua562\u34df\u5245\u4cd9\u3e2a\u7ce1[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\ua562\u34df\u5245\u4cd9\u3e2a\u7ce1::<init>, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                }
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u12cb\u64f2\ub18d\u8413\u5bc4\uf94d, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e::<init>, invokevirtual:\u4ab3\u76bc\ud217\u527a\uff55\ubded(\u527a\u873d\u071d\u4f52\uc229\ud217::\ub102\u759a\u97e6\u516c\u69d9\u7006, getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u99f7\u67d0\u6b5f\ub70c\u3e2a\u6d69, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))))
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u9033\u3711\u494c\u88c5\u69d9\u97b7, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (logicalnot:boolean(invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), initobject:\ubded\u9255\u92ff\u5d20\u97b7[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ubded\u9255\u92ff\u5d20\u97b7::<init>, getstatic:\ub19c\uc229\u416d\ub18d\u7873(\ub19c\uc229\u416d\ub18d\u7873::\u8389\u8bb0\u7d52\u6fb0\u6198\u6198), getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f)))
                }
            }
            
            while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u3a62\u3711\u960f\u839e\uc84e\u527a, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\uc3e3\u624e\u647c\u7bad\u88c5\u5fe1, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u3d64\u59ec\u7006\uc84e\u51fa\u7ce1)))) {
                    invokevirtual:void(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7873\uc7fe\ub83f\u0c95\ub18d\u7330, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))
                }
            }
            
            if (cmpne:boolean(getfield:\u183a\u1187\uc229\u3bc9\u7e3f(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ufe34\ua068\u3dd3\u8640\u34df\u7ce1, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getstatic:\u183a\u1187\uc229\u3bc9\u7e3f(\u183a\u1187\uc229\u3bc9\u7e3f::\u3d4b\u4cd9\u156b\ubff1\u8753\u527a))) {
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u56bd\u3e75\uc4d2\ub19c\u59ec\u7ce1, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6b5f\u8258\uc910\ua6bd\u183a\u8bb0, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(2)))
                }
                
                if (logicaland:boolean(logicaland:boolean(cmpeq:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), cmpeq:boolean(getfield:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\ub83f\u3d64\u6d99\ucef1\ud217, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9())), invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u61a4\u5d20\uc29a\u839e\u3bc9\ucfaf, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                    invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6b5f\u8258\uc910\ua6bd\u183a\u8bb0, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(99)))
                }
            }
            
            if (invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf9c5\u7ce1\u624e\u392e\u6435\u624e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                    var_2_2E0 = initobject:\ubcb0\u4ab3\u4c04\uae5d\uc238(\ubcb0\u4ab3\u4c04\uae5d\uc238::<init>)
                    invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_2_2E0:\ubcb0\u4ab3\u4c04\uae5d\uc238[expected:\u6435\u385b\uae5d\u7049\u8bb0])
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_2_2E0:\ubcb0\u4ab3\u4c04\uae5d\uc238[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d]))) {
                        invokevirtual:void(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u3711\u6b0d\u5f50\u76bc\u16f6\u9033, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                    }
                }
                
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                }
                
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf9c5\u7ce1\u624e\u392e\u6435\u624e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                }
                
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u392e\u3711\ub171\u7ce1\u7873\u7e3f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                }
            }
            else {
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc87f\uc3e3\u8709\u1833\ud158\u965f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                }
                
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf9c5\u7ce1\u624e\u392e\u6435\u624e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub7dc\ubefe\ub6ab\ud36e\u4f4a\u4f52, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                }
                
                while (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u12b2\ufe34\ubcb0\u385b\uc910\u6c52, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u392e\u3711\ub171\u7ce1\u7873\u7e3f, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))) {
                    invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u7e3f\u6198\u12b2\u446c\uc84e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
                }
            }
            
            if (logicaland:boolean(logicaland:boolean(invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf9c5\u7ce1\u624e\u392e\u6435\u624e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), cmpeq:boolean(getfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubcb0\u8d98\u3bc9\u7006\u51fa\u97e6, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), ldc:int(0))), logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))) {
                invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub7dc\ubefe\ub6ab\ud36e\u4f4a\u4f52, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            }
            
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9937\u59ec\uceb8\u8c8a\u74b1\u71f1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, logicaland:boolean(logicaland:boolean(cmpeq:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()), invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), invokevirtual:boolean(\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9::\u92ff\u7d52\ub83f\uc2e8\ud523\u69d9, getfield:\u392e\u67e9\u8cae\u4c04\ua3b4\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u6c56\uc87f\ub19c\u3d4b\u760c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf \u8aa5\uc4d2\u4daf\u4179\u8389\u5db4(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0) {
        var_1_60 : \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf
        
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
        invokestatic:void(\u88c5\ud171\ub113\u6435\ud51e::\u7049\u156b\u8258\uc4d2\uc3e3\uc84e, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)
        var_1_60 = invokevirtual:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u3dd3\ud12e\u647c\u3dd3\u1187\ua3b4, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be)
        
        if (cmpeq:boolean(var_1_60:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf, aconstnull:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf())) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(100))))
        }
        
        return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(var_1_60:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec \u4ab3\u8cae\u3a62\u0a06\u5f50\uff55(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p2, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p3) {
        var_5_69 : \u960f\u76bc\u8c8a\u5654\u4c2b\u59ec
        
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
        var_5_69 = invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\uae87\ub19c\u9937\u836c\u34df\ub8be::\ua6bd\ubcb0\u0800\u7330\ucef1\u76bc, p0:\uae87\ub19c\u9937\u836c\u34df\ub8be, invokestatic:\ud171\ub171\u4c2b\uae5d\u4c04\u494c<Object>[expected:DynamicOps<\u93a2\u97b7\u647c\ud36e\u64ab>](\ud171\ub171\u4c2b\uae5d\u4c04\u494c<T>::\u8753\u3a62\u12cb\u9a18\u67d0\u47c2, getstatic:\u760c\uf995\uae5d\u446c\uceb8[expected:DynamicOps](\u760c\uf995\uae5d\u446c\uceb8::\u6d99\u8350\u9255\u8640\uf9c5\ud36e), p2:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u7d52\u51fa\u56bd\u76bc\u4975\ub113), p3:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf)
        
        if (cmpeq:boolean(var_5_69:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec, aconstnull:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec())) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(101))))
        }
        
        return:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(var_5_69:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec)
    }
    
    public void \uae5d\u8d98\u3504\u6d99\u0800\ucfaf(java.lang.String p0) {
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
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u071d\u4492\ub32d\u4179\u647c\u0800, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:String, invokestatic:\u7d52\u51fa\u56bd\u76bc\u4975\ub113(\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\u4bc8\ub6ab\u97b7\u3e2a\uc9f6\u76bc), invokedynamic:Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>(apply:()Ljava/util/function/Function;), invokedynamic:Function4(apply:()Lcom/mojang/datafixers/util/Function4;), ldc:boolean(0), getstatic:\u946b\u760c\ubefe\ubff1\u8308\ud12e(\u946b\u760c\ubefe\ubff1\u8308\ud12e::\u3e2a\u960f\u647c\u47c2\u8cae\uc7fe))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7d52\ube23\u4ab3\u8aa5\ubb2b\u97b7(java.lang.String p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubded\u9033\u5654\u6198\uc29a\uc910 p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p3) {
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
    
    private void \u071d\u4492\ub32d\u4179\u647c\u0800(java.lang.String p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, java.util.function.Function<\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf> p2, com.mojang.datafixers.util.Function4<\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec> p3, boolean p4, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u946b\u760c\ubefe\ubff1\u8308\ud12e p5) {
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
    
    private void \u416d\u97e6\u3bc9\u99f7\u2dcc\u5245(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u946b\u760c\ubefe\ubff1\u8308\ud12e p0, java.lang.String p1, boolean p2, java.lang.Runnable p3) {
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
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b \u600f\u88c5\u9033\ub18d\uc3e3\uc238(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, java.util.function.Function<\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf> p1, com.mojang.datafixers.util.Function4<\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec> p2, boolean p3, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p4) {
        var_6_63 : \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf
        var_7_94 : \u4f52\ua068\u4f52\u47c2\u4492
        var_8_9F : \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf
        var_9_B1 : CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>
        var_10_CB : \u7bad\u76bc\uae5d\u12cb\u16f6
        var_8_F1 : Object
        stack_F1_0 : Object [generated]
        
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
        var_6_63 = checkcast:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf.class, invokeinterface:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>::apply, p1:Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>, p4:\uae87\ub19c\u9937\u836c\u34df\ub8be))
        var_7_94 = initobject:\u4f52\ua068\u4f52\u47c2\u4492(\u4f52\ua068\u4f52\u47c2\u4492::<init>, initarray:\ube23\u4daf\u3d64\u647c\u3d4b[](\u8cae\u8bb0\ucef1\u8c8a\u3a62.\ube23\u4daf\u3d64\u647c\u3d4b[].class, initobject:\u40a9\u67d0\u47c2\u3bd6\ubded[expected:\ube23\u4daf\u3d64\u647c\u3d4b](\u40a9\u67d0\u47c2\u3bd6\ubded::<init>), initobject:\uc87f\u88c5\u4975\u6bb9\u3c25[expected:\ube23\u4daf\u3d64\u647c\u3d4b](\uc87f\u88c5\u4975\u6bb9\u3c25::<init>, invokeinterface:File(Path::toFile, invokevirtual:Path(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u759a\u7bad\u59ec\u3d64\u7043\u3bc9, p4:\uae87\ub19c\u9937\u836c\u34df\ub8be, getstatic:\u51b2\ub6ab\u5654\u647c\ub102\u8d90(\u51b2\ub6ab\u5654\u647c\ub102\u8d90::\u7ce1\u0800\ua562\u5654\ub113\ua562))), getstatic:\ud51e\u7ce1\ua61f\u183a\u1187(\ud51e\u7ce1\ua61f\u183a\u1187::\u4179\ua3b4\uc238\u88c5\u120d\u36d3))))
        
        try {
            var_8_9F = invokestatic:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u88c5\ud171\ub113\u6435\ud51e::\u99f7\u9a18\u92ee\u12b2\u9255\u7330, var_7_94:\u4f52\ua068\u4f52\u47c2\u4492, var_6_63:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf, p3:boolean)
            var_9_B1 = invokestatic:CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>(\u7bad\u76bc\uae5d\u12cb\u16f6::\u836c\u62da\u4c2b\u4bc8\u156b\u8350, invokevirtual:List<\u4f52\u7ce1\uc229\ucef1\ube23>(\u4f52\ua068\u4f52\u47c2\u4492::\u8df4\u3a62\u183a\u6435\u3a62\u8258, var_7_94:\u4f52\ua068\u4f52\u47c2\u4492), getstatic:\u3c25\u40a9\ua068\u3c25\u4f52(\u3c25\u40a9\ua068\u3c25\u4f52::\u4e72\u12b2\ucfaf\ub32d\ub102\ua6bd), ldc:int(2), invokestatic:Executor(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u760c\uceb8\ub32d\ub113\u120d\u4ab3), this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1[expected:Executor])
            invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\ubcb0\u3504\u120d\u4bc8\ub1b9\u120d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1[expected:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<Runnable>], invokedynamic:BooleanSupplier(getAsBoolean:(Ljava/util/concurrent/CompletableFuture;)Ljava/util/function/BooleanSupplier;, var_9_B1:CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>))
            var_10_CB = checkcast:\u7bad\u76bc\uae5d\u12cb\u16f6(\u59ec\u8413\u97e6\uc229\u3776.\u7bad\u76bc\uae5d\u12cb\u16f6.class, invokevirtual:\u7bad\u76bc\uae5d\u12cb\u16f6(CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>::get, var_9_B1:CompletableFuture<\u7bad\u76bc\uae5d\u12cb\u16f6>))
            return:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b(initobject:\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b(\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b::<init>, var_7_94:\u4f52\ua068\u4f52\u47c2\u4492, var_10_CB:\u7bad\u76bc\uae5d\u12cb\u16f6, checkcast:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec.class, invokeinterface:Object(Function4::apply, p2:Function4<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u7d52\u51fa\u56bd\u76bc\u4975\ub113, \u6c52\u52d3\u516c\uae87\uae5d, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf, \u960f\u76bc\u8c8a\u5654\u4c2b\u59ec>, p4:\uae87\ub19c\u9937\u836c\u34df\ub8be[expected:Object], p0:\u7d52\u51fa\u56bd\u76bc\u4975\ub113[expected:Object], invokevirtual:\u6c52\u52d3\u516c\uae87\uae5d(\u7bad\u76bc\uae5d\u12cb\u16f6::\u6cfe\u92ff\uc84e\u760c\u0c95\uc238, var_10_CB:\u7bad\u76bc\uae5d\u12cb\u16f6), var_8_9F:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf[expected:Object])), aconstnull:\u6435\uff55\u8640\ub6ab\u527a\u4179()))
        }
        catch (java.util.concurrent.ExecutionException | java.lang.InterruptedException ex_F1) {
            var_8_F1 = stack_F1_0:Object
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::close, var_7_94:\u4f52\ua068\u4f52\u47c2\u4492)
            athrow(var_8_F1:Object)
        }
    }
    
    public void \ub171\u9a18\u6c56\u7c6b\u5bc4\uc87f(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0) {
        var_2_5F : \u9255\u74b1\u8413\ubf56\u120d\ud217
        var_3_A3 : YggdrasilAuthenticationService
        var_4_AA : MinecraftSessionService
        
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
            var_2_5F = initobject:\u9255\u74b1\u8413\ubf56\u120d\ud217(\u9255\u74b1\u8413\ubf56\u120d\ud217::<init>)
            invokevirtual:void(\u9255\u74b1\u8413\ubf56\u120d\ud217::\u156b\u946b\ua562\u5d20\u47c2\u7ce1, var_2_5F:\u9255\u74b1\u8413\ubf56\u120d\ud217, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(113))))
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3e2a\ufcaf\ud217\u7e3f\u4d85\u3dd3, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_2_5F:\u9255\u74b1\u8413\ubf56\u120d\ud217[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub113\u759a\uc9f6\u6ec6\u392e\u8753, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, putfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255))
            invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u9937\u416d\ub171\uae87\ub8be[expected:\u6435\u385b\uae5d\u7049\u8bb0](\u9937\u416d\ub171\uae87\ub8be::<init>))
            
            if (logicalnot:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                var_3_A3 = initobject:YggdrasilAuthenticationService(YggdrasilAuthenticationService::<init>, getfield:Proxy(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubf56\ub8be\ube23\ub6ab\u873d\u6d69, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                var_4_AA = invokeinterface:MinecraftSessionService(AuthenticationService::createMinecraftSessionService, var_3_A3:AuthenticationService)
                invokestatic:void(\uc2bd\uc2bd\ud523\u6c56\uc87f::\u7ce1\uc910\uc229\u839e\u647c\u6b0d, initobject:\ub1b9\u983f\uf9c5\u6fb0\u51fa(\ub1b9\u983f\uf9c5\u6fb0\u51fa::<init>, invokeinterface:GameProfileRepository(AuthenticationService::createProfileRepository, var_3_A3:YggdrasilAuthenticationService), initobject:File(File::<init>, getfield:File(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\u836c\u416d\ubefe\u92ff\uf94d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:String(File::getName, getstatic:File(\u88c5\ud171\ub113\u6435\ud51e::\ucef1\u7d52\u1187\u4cd9\u8640\ua61f)))))
                invokestatic:void(\uc2bd\uc2bd\ud523\u6c56\uc87f::\u64f2\u3711\u7873\u6fb0\ub70c\ud4fe, var_4_AA:MinecraftSessionService)
                invokestatic:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\ua562\u8350\u7ce1\u4c04\u36d3\ud217, ldc:boolean(0))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u8350\u88c5\u7af6\u8413\ub32d() {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4492\u8350\u88c5\u7af6\u8413\ub32d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, initobject:\u9255\u74b1\u8413\ubf56\u120d\ud217[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u9255\u74b1\u8413\ubf56\u120d\ud217::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u8350\u88c5\u7af6\u8413\ub32d(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
        var_2_5C : \u527a\u873d\u071d\u4f52\uc229\ud217
        var_3_6D : \uf995\u64f2\u3711\uc2e8\u927d
        
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
            var_2_5C = invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            
            if (cmpne:boolean(var_2_5C:\u527a\u873d\u071d\u4f52\uc229\ud217, aconstnull:\u527a\u873d\u071d\u4f52\uc229\ud217())) {
                invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u64ab\u6d69\u72f1\u2dcc\u16f6\u965f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1[expected:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<Runnable>])
                invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\ub1b9\u8bb0\ua6bd\u8413\u5bc4\ua3b4, var_2_5C:\u527a\u873d\u071d\u4f52\uc229\ud217)
            }
            
            var_3_6D = getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            putfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\uf995\u64f2\u3711\uc2e8\u927d())
            invokevirtual:void(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\ub8be\u4c2b\u92ee\uc229\u4f4a\ubff1, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            putfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179())
            invokevirtual:void(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u647c\u4c2b\ua6bd\u8d90\u6cfe\u51b2, getstatic:\u74b1\u516c\u7330\ud523\u8df4\uc87f(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u385b\uf9c5\uf94d\u718f\u5d20\u494c))
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3e2a\ufcaf\ud217\u7e3f\u4d85\u3dd3, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            
            if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                if (cmpne:boolean(var_3_6D:\uf995\u64f2\u3711\uc2e8\u927d, aconstnull:\uf995\u64f2\u3711\uc2e8\u927d())) {
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(108)))
                    
                    while (logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u6435\ud217\u7af6\ucb79\u927d\u3504, var_3_6D:\uf995\u64f2\u3711\uc2e8\u927d[expected:\u88c5\ud171\ub113\u6435\ud51e]))) {
                        invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u8d98\ua3b4\u3e75\ud523\u960f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
                    }
                    
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                }
                
                invokevirtual:void(\u927d\ud36e\uae5d\u5db4\u16f6\u97b7::\uc2bd\u156b\u6ec6\u9a18\ub7dc\ub113, getfield:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\uafe7\u7c6b\u99f7\u7af6\u1833, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                invokevirtual:void(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u4f4a\ua6bd\u3d64\uf9c5\ua068\u97e6, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\ub8be\u071d\u527a\u3711\ubff1\u759a())
                putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
                invokevirtual:void(\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b::\u9033\ub8be\u624e\u3d4b\u759a\ud171, getfield:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\u3bc9\u527a\u3d4b\uc2bd\u64f2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            }
            
            putfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub113\u759a\uc9f6\u6ec6\u392e\u8753, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, checkcast:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255()))
            putfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3e2a\ufcaf\ud217\u7e3f\u4d85\u3dd3(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(114)))
            invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7af6\u6cfe\u416d\u3e75\u9033\uc910, getfield:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7ce1\u92ee\uc31c\u8c8a\u8aa5\u156b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
            putfield:\u527a\u494c\u88c5\u965f\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9af2\u5d20\u6c56\uc229\u8350\uc84e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, aconstnull:\u527a\u494c\u88c5\u965f\u759a())
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u8d98\ua3b4\u3e75\ud523\u960f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u3dd3\ua068\ufcaf\u97b7\ud7e8(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(114)))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7bad\u8d98\ua3b4\u3e75\ud523\u960f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub113\u759a\uc9f6\u6ec6\u392e\u8753(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u64ab\u0a06\ucb79\u7049\u624e\ucb79, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            invokevirtual:void(\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2::\u4c04\u839e\uf94d\u51b2\ufe34\u74b1, getfield:\u8df4\u3e75\u52d3\uc9f6\u62da\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\uc29a\u5245\ub70c\u183a\u12b2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            invokevirtual:void(\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e::\u718f\u8cae\u64ab\u7e3f\u6fb0\u8308, getstatic:\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e(\ufcaf\u6198\u6c56\u3bd6\u67e9\u839e::\u4daf\u3c25\u8aa5\u4179\uc87f\u6d99), p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6c52\u8753\ua61f\u8709\u385b\ub171, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u88c5\u34df\u47c2\u16f6\u6198\uc9f6() {
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
            return:boolean(logicaland:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3776\u873d\u3776\u5d20\u67e9\u8640, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokeinterface:boolean(SocialInteractionsService::serversAllowed, getfield:SocialInteractionsService(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5f50\uc2e8\u4c2b\ud51e\u4daf\u760c(java.util.UUID p0) {
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
        
        if (invokevirtual:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ufcaf\u183a\ucef1\u183a\u8d98\u3e2a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)) {
            return:boolean(invokevirtual:boolean(\u59ec\u4bc8\uc910\ua562\u72f1\u839e::\u8350\uc9f6\u759a\uc910\ubcb0\ud217, getfield:\u59ec\u4bc8\uc910\ua562\u72f1\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u64f2\u647c\u7049\u99f7\ub102\uc29a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:UUID))
        }
        
        return:boolean(logicaland:boolean(logicalor:boolean(cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98()), logicalnot:boolean(invokevirtual:boolean(UUID::equals, p0:UUID, invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))), logicalnot:boolean(invokevirtual:boolean(UUID::equals, p0:UUID, getstatic:UUID[expected:Object](\ud217\u3504\u760c\uc29a\u97e6\ube23::\u3d4b\uc910\ua61f\u5fe1\ub7dc\u62da)))))
    }
    
    public boolean \ufcaf\u183a\ucef1\u183a\u8d98\u3e2a() {
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
            return:boolean(logicaland:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud523\u8753\u836c\u7330\ub70c\ub102, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokeinterface:boolean(SocialInteractionsService::chatAllowed, getfield:SocialInteractionsService(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf9c5\u8413\u760c\u8413\u624e\u4c2b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        }
        
        goto(Label_0006)
    }
    
    public final boolean \u3bc9\u8413\uf9c5\uc229\u59ec\u8709() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u527a\u9255\u7d52\u5bc4\ube23\u516c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u527a\u873d\u071d\u4f52\uc229\ud217 \u983f\u4492\u600f\u6bb9\uafe7\u183a() {
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
            return:\u527a\u873d\u071d\u4f52\uc229\ud217(ternaryop:\u527a\u873d\u071d\u4f52\uc229\ud217(cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98()), aconstnull:\u527a\u873d\u071d\u4f52\uc229\ud217(), getfield:\u527a\u873d\u071d\u4f52\uc229\ud217(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u99f7\u67d0\u6b5f\ub70c\u3e2a\u6d69, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u8df4\u4f4a\u516c\uc238\u8df4\u5f50() {
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
            return:boolean(logicalnot:boolean(getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\ud217\u8640\u760c\u92ee\ub6ab\u7006, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8aa5\uf9c5\u8753\u51b2\u7043\uafe7)))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u3776\u494c\u4975\u0c95\u4d85\u960f() {
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
            return:boolean(cmpge:boolean(invokevirtual:int(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, getfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8aa5\uf9c5\u8753\u51b2\u7043\uafe7)))), invokevirtual:int(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u4f52\u71ae\u1187\u718f\u527a\ufe34))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u92ff\u183a\u93a2\uc3e3\u873d\u67e9() {
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
            return:boolean(cmpge:boolean(invokevirtual:int(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, getfield:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u62da\u8d90\u0c95\uc2bd\u93a2\u71ae, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8aa5\uf9c5\u8753\u51b2\u7043\uafe7)))), invokevirtual:int(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\ud171\u52d3\u7043\ud51e\u71ae\u7ce1, getstatic:\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e(\ucef1\ub6ab\u3dd3\u718f\u4492\u0b8e::\u0c95\ub83f\u64ab\u8350\uc31c\u3bd6))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u6198\u0c95\ubb2b\u8cae\u5f50\u4daf() {
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
            return:boolean(cmpne:boolean(getfield:\ud171\u0c95\ub7dc\ud217\ua562\u647c(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4975\u4f4a\u4cd9\ub102\u5654\uafe7, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8aa5\uf9c5\u8753\u51b2\u7043\uafe7))), getstatic:\ud171\u0c95\ub7dc\ud217\ua562\u647c(\ud171\u0c95\ub7dc\ud217\ua562\u647c::\u4179\u4daf\u76bc\u8d98\u516c\uf94d)))
        }
        
        goto(Label_0006)
    }
    
    private void \u4492\u7e3f\u6198\u12b2\u446c\uc84e() {
        var_1_62 : \u51b2\u9033\ubff1\uf9c5\ufe34
        var_2_93 : boolean
        var_3_95 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_4_9D : \u8753\u718f\ufe34\u3504\u3c25\uc9f6
        var_6_B1 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_BC : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_8_C3 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_5_DB : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_6_11C : \u7d52\u718f\u3776\u6fb0\ub83f
        var_8_160 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_8_1C3 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        var_7_24D : \u9a18\ub83f\ub1b9\u9937\u1187\uc229
        var_6_26F : String
        var_6_2D8 : \u0b8e\ud4fe\uc229\u92ee\ud4fe
        var_7_2ED : int
        
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
        var_1_62 = initobject:\u51b2\u9033\ubff1\uf9c5\ufe34(\u51b2\u9033\ubff1\uf9c5\ufe34::<init>, getstatic:\u3711\u3e75\u7ce1\uc3e3\ufe34(\u3711\u3e75\u7ce1\uc3e3\ufe34::\u6435\uae5d\u120d\u64ab\u51b2))
        invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6435\u385b\uae5d\u7049\u8bb0])
        
        if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_1_62:\u51b2\u9033\ubff1\uf9c5\ufe34[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d])) {
            return:void()
        }
        
        if (logicaland:boolean(cmpne:boolean(getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79()), cmpne:boolean(invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u64f2\u71ae\u946b\u3776\u760c\u183a)))) {
            var_2_93 = getfield:boolean(\uc9f6\u759a\u64ab\u97e6\u9255::\u98a4\u2dcc\uc9f6\u6435\u927d\u6435, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
            var_3_95 = aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1()
            var_4_9D = invokevirtual:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79::\ud158\u7e3f\u8aa5\uc229\u7d52\u4c04, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            
            if (cmpeq:boolean(var_4_9D:\u8753\u718f\ufe34\u3504\u3c25\uc9f6, getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u5d20\u494c\ucb79\u3504\u7ce1\u983f))) {
                var_6_B1 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\ud4fe\u120d\u9a18\u385b\u4492\u5f50](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                var_7_BC = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_6_B1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                var_8_C3 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_7_BC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                
                if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, var_7_BC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                    return:void()
                }
                
                var_5_DB = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u9a18\ud158\u3d4b\uc87f\ub7dc\uf995, var_8_C3:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_6_B1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_7_BC:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                
                if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_5_DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                    return:void()
                }
                
                if (logicaland:boolean(logicaland:boolean(var_2_93:boolean, invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u3d64\u59ec\u7006\uc84e\u51fa\u7ce1)), invokevirtual:boolean(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ubff1\ub1b9\uc229\uc7fe\u983f\u3711, var_8_C3:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f]))) {
                    var_3_95 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_6_B1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                }
            }
            else {
                if (logicalor:boolean(cmpne:boolean(var_4_9D:\u8753\u718f\ufe34\u3504\u3c25\uc9f6, getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u56bd\u873d\uc2e8\u7ce1\u6b5f\ub113)), logicalnot:boolean(var_2_93:boolean))) {
                    return:void()
                }
                
                var_6_11C = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
                
                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u71f1\u34df\ubb2b\u97b7\u6198.class, var_6_11C:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ufcaf\u0800\ub171\u97e6\u74b1\u98a4))
                }
                else {
                    if (instanceof:boolean(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u6bb9\u36d3\u965f\u5f50\ub32d.class, var_6_11C:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u8389\u51fa\u4d85\ud523\u946b\ud12e))
                    }
                    else {
                        if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u836c\ub18d\u5654\u9937\u624e.class, var_6_11C:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            var_8_160 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u836c\ub18d\u5654\u9937\u624e::\u4f4a\u965f\u93a2\u56bd\u7006\uc910, checkcast:\u836c\ub18d\u5654\u9937\u624e(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u836c\ub18d\u5654\u9937\u624e.class, var_6_11C:\u836c\ub18d\u5654\u9937\u624e))
                            
                            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_8_160:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                                var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52))
                            }
                            else {
                                var_5_DB = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, var_8_160:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                            }
                        }
                        else {
                            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u6b5f\ua562\ud158\u8d98\ub7dc.class, var_6_11C:\u836c\ub18d\u5654\u9937\u624e[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                switch (loadelement:int(getstatic:int[](\u6435\uff55\u8640\ub6ab\u527a\u4179::\u4492\uc9f6\u12cb\u76bc\u0c95\u8753), invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u6c56\u3c25\u7af6\u4492\u97e6(\u6b5f\ua562\ud158\u8d98\ub7dc::\u120d\ub6ab\u8bb0\u6c52\u9033\ub32d, checkcast:\u6b5f\ua562\ud158\u8d98\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u6b5f\ua562\ud158\u8d98\ub7dc.class, var_6_11C:\u6b5f\ua562\ud158\u8d98\ub7dc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))))) {
                                    case 1:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\uae5d\u97b7\ucfaf\u61a4\u8d90\ud51e)
                                        looporswitchbreak()
                                    
                                    case 2:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u3e75\uc31c\u76bc\ub70c\u156b\u98a4)
                                        looporswitchbreak()
                                    
                                    case 3:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u1187\u4f4a\u527a\u4bc8\u156b\u4492)
                                        looporswitchbreak()
                                    
                                    case 4:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u4ab3\u8d98\u873d\u5db4\u873d\u98a4)
                                        looporswitchbreak()
                                    
                                    case 5:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u4f4a\u7bad\uc29a\u9033\u3d64\ub102)
                                        looporswitchbreak()
                                    
                                    default:
                                        var_8_1C3 = getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7330\u0b8e\u8aa5\ube23\ud51e\u1833)
                                        looporswitchbreak()
                                }
                                
                                var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, var_8_1C3:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab])
                            }
                            else {
                                if (instanceof:boolean(\u5245\u8aa5\u61a4\u7049\u4cd9.\uc910\u6bb9\uc4d2\ud36e\u0800.class, var_6_11C:\u6b5f\ua562\ud158\u8d98\ub7dc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                    var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\uc910\u6bb9\uc4d2\ud36e\u0800::\uae87\u718f\u718f\u69d9\uc246\u7e3f, checkcast:\uc910\u6bb9\uc4d2\ud36e\u0800(\u5245\u8aa5\u61a4\u7049\u4cd9.\uc910\u6bb9\uc4d2\ud36e\u0800.class, var_6_11C:\uc910\u6bb9\uc4d2\ud36e\u0800[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                                }
                                else {
                                    if (instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u59ec\ubf56\u8640\u759a\u0800.class, var_6_11C:\uc910\u6bb9\uc4d2\ud36e\u0800[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                        var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u7d52\ub18d\ufe34\u4d85\u4cd9\uc246))
                                    }
                                    else {
                                        if (instanceof:boolean(\u3504\ufe34\u600f\u6b0d\u69d9.\u6ec6\u7ce1\ua61f\u5f50\uc246.class, var_6_11C:\uc910\u6bb9\uc4d2\ud36e\u0800[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                            var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\uc238\uc246\ucb79\u7bad\ud217\u7c6b))
                                        }
                                        else {
                                            var_7_24D = invokestatic:\u9a18\ub83f\ub1b9\u9937\u1187\uc229(\u9a18\ub83f\ub1b9\u9937\u1187\uc229::\uc7fe\u071d\ufcaf\u4179\ucfaf\u72f1, invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_6_11C:\u836c\ub18d\u5654\u9937\u624e[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                            
                                            if (cmpeq:boolean(var_7_24D:\u9a18\ub83f\ub1b9\u9937\u1187\uc229, aconstnull:\u9a18\ub83f\ub1b9\u9937\u1187\uc229())) {
                                                return:void()
                                            }
                                            
                                            var_5_DB = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, var_7_24D:\u9a18\ub83f\ub1b9\u9937\u1187\uc229[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab])
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_5_DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                var_6_26F = loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(2))
                
                if (cmpeq:boolean(var_4_9D:\u8753\u718f\ufe34\u3504\u3c25\uc9f6, getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u5d20\u494c\ucb79\u3504\u7ce1\u983f))) {
                    var_6_26F = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u0800\u5d20\u946b\ubf56\u64f2\u9255), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, checkcast:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\ud4fe\u120d\u9a18\u385b\u4492\u5f50](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))))))
                }
                else {
                    if (cmpeq:boolean(var_4_9D:\u8753\u718f\ufe34\u3504\u3c25\uc9f6, getstatic:\u8753\u718f\ufe34\u3504\u3c25\uc9f6(\u8753\u718f\ufe34\u3504\u3c25\uc9f6::\u56bd\u873d\uc2e8\u7ce1\u6b5f\ub113))) {
                        var_6_26F = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u836c\u8709\uae87\u93a2\u4d85\u5db4::\uc238\uc246\ucb79\u7bad\ud217\u7c6b, checkcast:\u836c\u8709\uae87\u93a2\u4d85\u5db4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u836c\u8709\uae87\u93a2\u4d85\u5db4.class, getfield:\u3dd3\u6d99\u4e72\uc29a\u56bd\ucb79[expected:\u836c\u8709\uae87\u93a2\u4d85\u5db4](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\ube23\u5654\ub1b9\u624e\u51fa, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))))
                    }
                }
                
                invokeinterface:void(Logger::warn, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(115)), var_4_9D:\u8753\u718f\ufe34\u3504\u3c25\uc9f6[expected:Object], var_6_26F:String[expected:Object])
            }
            else {
                var_6_2D8 = getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
                
                if (cmpne:boolean(var_3_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                    invokespecial:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub6ab\ub32d\u67d0\u3dd3\u3d4b\uc246, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, var_5_DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_3_95:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                }
                
                var_7_2ED = invokevirtual:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u98a4\u3776\u97b7\ube23\u51b2\u0a06, var_6_2D8:\u0b8e\ud4fe\uc229\u92ee\ud4fe, var_5_DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                
                if (var_2_93:boolean) {
                    invokevirtual:void(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u927d\u71ae\ua562\u92ff\u3e75\u446c, var_6_2D8:\u0b8e\ud4fe\uc229\u92ee\ud4fe, var_5_DB:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    invokevirtual:void(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\uc229\u6435\ucef1\uf995\u71f1\uc31c, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u71f1\u836c\u47c2\uae5d\u6b0d\u946b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9)), add:int(ldc:int(36), getfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, var_6_2D8:\u0b8e\ud4fe\uc229\u92ee\ud4fe)))
                }
                else {
                    if (cmpne:boolean(var_7_2ED:int, ldc:int(-1))) {
                        if (invokestatic:boolean(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u8389\u760c\ud158\u5db4\u47c2\ud4fe, var_7_2ED:int)) {
                            putfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, var_6_2D8:\u0b8e\ud4fe\uc229\u92ee\ud4fe, var_7_2ED:int)
                        }
                        else {
                            invokevirtual:void(\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179::\u8640\u69d9\uc246\u8cae\u4c04\u5245, getfield:\u1833\u56bd\ucef1\u8c8a\uc2bd\u4179(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc9f6\u6b5f\u8aa5\u97b7\u6cfe\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_7_2ED:int)
                        }
                    }
                }
            }
        }
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \ub6ab\ub32d\u67d0\u3dd3\u3d4b\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p1) {
        var_3_63 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_4_AF : \uc31c\uc87f\uc246\u3776\ub7dc
        var_5_B8 : \ud158\u8308\u76bc\u0a06\ud36e
        
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
        var_3_63 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, p1:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
        
        if (logicaland:boolean(instanceof:boolean(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a.class, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, var_3_63:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(116))))) {
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u4ab3\u4c04\u88c5\u51b2\ud12e\uf94d, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(116)), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u8753\uc9f6\ud171\ub83f\u8c8a\u72f1, var_3_63:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(116))))
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
        }
        
        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(117)), var_3_63:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
        var_4_AF = initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>)
        var_5_B8 = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
        invokevirtual:boolean(AbstractList<\u9033\ucef1\u12b2\ua3b4\u6cfe>::add, var_5_B8:AbstractList<\u9033\ucef1\u12b2\ua3b4\u6cfe>, invokestatic:\u9033\ucef1\u12b2\ua3b4\u6cfe(\u9033\ucef1\u12b2\ua3b4\u6cfe::\ud171\u5f50\ud158\uc229\u6fb0\u7006, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(118))))
        invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, var_4_AF:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(119)), var_5_B8:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
        invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(57)), var_4_AF:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
        return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e \u5db4\uc2bd\u4ab3\ud4fe\uc31c\ub18d(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p0) {
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
            invokestatic:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud523\uae5d\ubb2b\u7006\u965f\u92ee, getfield:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\ubefe\ud171\uc7fe\u0a06\u6d69, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:String(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\u3dd3\u12b2\u88c5\ub102\ub7dc, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            
            if (cmpne:boolean(getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255())) {
                invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3504\u8413\u5fe1\ub8be\u0b8e\u3e2a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            }
            
            return:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(p0:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
        }
        
        goto(Label_0006)
    }
    
    public static void \ud523\uae5d\ubb2b\u7006\u965f\u92ee(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9 p0, java.lang.String p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p2, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u1833\u88c5\u0b8e\uc9f6\u960f\u839e p3) {
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
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \u6d69\u71ae\ucfaf\u516c\ube23\u8350() {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8aa5\uf9c5\u8753\u51b2\u7043\uafe7))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \ud171\u8c8a\u9af2\u1187\u56bd\u3d64() {
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
    
    public void \u98a4\u4bc8\uc238\u3bd6\ubded\u0a06(\u6435\ub8be\u718f\u6b0d\u67e9.\u9255\u7e3f\u5d20\u8389\u4daf p0) {
        var_3_16F : int
        var_4_17C : Iterator<\ua61f\uae87\u36d3\u647c\u3d64>
        var_5_192 : \ua61f\uae87\u36d3\u647c\u3d64
        
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
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(133)), invokestatic:Integer[expected:Object](Integer::valueOf, getstatic:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3776\u624e\u67d0\uae5d\ud36e\ud36e)))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(134)), invokestatic:Boolean[expected:Object](Boolean::valueOf, getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u836c\ub7dc\ud158\u6198\ub19c\u8d90, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(135)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u16f6\u97e6\u51b2\u5245\u5d20\ub32d, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(136)), ternaryop:String[expected:Object](invokevirtual:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u40a9\uc910\u4f4a\u6d99\u8258\u7006, getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(137)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(138))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(139)), invokestatic:Long[expected:Object](Long::valueOf, mul:long(div:long(sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), invokevirtual:long(\u9255\u7e3f\u5d20\u8389\u4daf::\u97b7\ufcaf\ud4fe\u3a62\ub18d\u3776, p0:\u9255\u7e3f\u5d20\u8389\u4daf)), ldc:long(60L)), ldc:long(1000L))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(140)), invokespecial:String[expected:Object](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc2bd\u7bad\u965f\u67d0\u3e2a\u392e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(141)), ternaryop:String[expected:Object](cmpeq:boolean(getfield:String(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u51fa\u4e72\u9255\u7bad\ucef1\u5fe1, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), aconstnull:String()), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(142)), getfield:String(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u51fa\u4e72\u9255\u7bad\ucef1\u5fe1, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(145)), ternaryop:String[expected:Object](cmpeq:boolean(invokestatic:ByteOrder(ByteOrder::nativeOrder), getstatic:ByteOrder(ByteOrder::LITTLE_ENDIAN)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(143)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(144))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(146)), invokestatic:Boolean[expected:Object](Boolean::valueOf, getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u7d52\u8d90\u8413\ud7e8\u9af2\u5140, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(147)), ternaryop:String[expected:Object](getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u9a18\u6c56\uafe7\u7330\u92ee\uc246, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(147)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(148))))
            var_3_16F = ldc:int(0)
            var_4_17C = invokeinterface:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>(Collection<\ua61f\uae87\u36d3\u647c\u3d64>::iterator, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u527a\u5fe1\u8c8a\u600f\ubefe\u4bc8, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_17C:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>)) {
                var_5_192 = checkcast:\ua61f\uae87\u36d3\u647c\u3d64(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64.class, invokeinterface:\ua61f\uae87\u36d3\u647c\u3d64(Iterator<\ua61f\uae87\u36d3\u647c\u3d64>::next, var_4_17C:Iterator<\ua61f\uae87\u36d3\u647c\u3d64>))
                
                if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\ud7e8\u5654\u62da\ub113\u960f\ub113, var_5_192:\ua61f\uae87\u36d3\u647c\u3d64), invokevirtual:boolean(\ua61f\uae87\u36d3\u647c\u3d64::\u071d\u647c\u9033\u3dd3\u12b2\u3504, var_5_192:\ua61f\uae87\u36d3\u647c\u3d64)))) {
                    invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(149))), postincrement:int(1, var_3_16F:int)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(150)))), invokevirtual:String(\ua61f\uae87\u36d3\u647c\u3d64::\uc2bd\u12b2\u9937\ub102\u64f2\uc238, var_5_192:\ua61f\uae87\u36d3\u647c\u3d64))
                }
            }
            
            invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(151)), invokestatic:Integer(Integer::valueOf, var_3_16F:int))
            
            if (cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d())) {
                invokevirtual:void(\u9255\u7e3f\u5d20\u8389\u4daf::\u4cd9\ubded\u6198\u8d98\u960f\u4e72, p0:\u9255\u7e3f\u5d20\u8389\u4daf, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(152)), invokevirtual:String[expected:Object](\u9255\u7e3f\u5d20\u8389\u4daf::\u8aa5\u8aa5\u34df\ud158\ubded\u839e, invokevirtual:\u9255\u7e3f\u5d20\u8389\u4daf(\u88c5\ud171\ub113\u6435\ud51e::\ubff1\ubcb0\u97e6\ua068\ua6bd\uc246, getfield:\uf995\u64f2\u3711\uc2e8\u927d[expected:\u88c5\ud171\ub113\u6435\ud51e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4d85\ua3b4\u3d4b\u4daf\u5bc4\u7043() {
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
    
    private java.lang.String \uc2bd\u7bad\u965f\u67d0\u3e2a\u392e() {
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
        
        if (cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d())) {
            return:String(ternaryop:String(invokevirtual:boolean(\uf995\u64f2\u3711\uc2e8\u927d::\u3711\u0c95\u718f\u9033\u4cd9\u8308, getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(153)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(154))))
        }
        
        if (cmpne:boolean(getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\ub8be\u071d\u527a\u3711\ubff1\u759a())) {
            return:String(ternaryop:String(invokevirtual:boolean(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u98a4\u3bc9\uc9f6\u8753\ubf56\u5fe1, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(155)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(156))))
        }
        
        return:String(loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(157)))
    }
    
    public void \u5654\ufe34\ud171\u446c\u8258\u16f6(\u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p0) {
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
            putfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\ub8be\u071d\u527a\u3711\ubff1\u759a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a \uf9c5\u4f52\u74b1\ud4fe\ubded\ucb79() {
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
            return:\ub8be\u071d\u527a\u3711\ubff1\u759a(getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u9033\u8bb0\u965f\ubcb0\u99f7\u99f7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\ub8be\u5654\u494c\u67e9\u8640() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7d52\u47c2\u4179\u8350\u624e\uf94d() {
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
            return:boolean(logicaland:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u416d\ud171\ubefe\u0b8e\ucb79\u3d4b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), cmpne:boolean(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u64f2\u3711\uc2e8\u927d())))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u7049\u8df4\uc9f6\uae87.\uf995\u64f2\u3711\uc2e8\u927d \u5bc4\uc87f\ua562\u6b5f\ud36e\u6198() {
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
            return:\uf995\u64f2\u3711\uc2e8\u927d(getfield:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc910\u59ec\u64f2\uc3e3\u3a62, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u9255\u7e3f\u5d20\u8389\u4daf \ub6ab\uf9c5\u40a9\ud4fe\ud523\ua6bd() {
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
            return:\u9255\u7e3f\u5d20\u8389\u4daf(getfield:\u9255\u7e3f\u5d20\u8389\u4daf(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud158\u8aa5\u3776\u6bb9\uc2e8\u4975, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u385b\ud7e8\u71ae\u7043\uc3e3\u3776 \u839e\u5654\u36d3\u416d\u836c\u6cfe() {
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
            return:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.properties.PropertyMap \u4c2b\ub19c\u92ee\u7bad\u836c\u88c5() {
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
            
            if (invokevirtual:boolean(PropertyMap::isEmpty, getfield:PropertyMap(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\ua068\ud36e\u56bd\u4492\u6b5f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
                invokevirtual:boolean(PropertyMap::putAll, getfield:PropertyMap(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\ua068\ud36e\u56bd\u4492\u6b5f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:PropertyMap[expected:Multimap](GameProfile::getProperties, invokeinterface:GameProfile(MinecraftSessionService::fillProfileProperties, invokevirtual:MinecraftSessionService(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u67e9\u6198\u3bd6\uf94d\uc2bd\u3504, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), invokevirtual:GameProfile(\u385b\ud7e8\u71ae\u7043\uc3e3\u3776::\uc238\u9a18\u71f1\ub83f\u527a\u9033, getfield:\u385b\ud7e8\u71ae\u7043\uc3e3\u3776(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7330\u6b5f\u3bd6\uc910\u69d9\u7ce1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), ldc:boolean(0))))
            }
            
            return:PropertyMap(getfield:PropertyMap(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\ua068\ud36e\u56bd\u4492\u6b5f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.net.Proxy \ucfaf\u8c8a\u64ab\u8640\ub83f\ub32d() {
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
            return:Proxy(getfield:Proxy(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubf56\ub8be\ube23\ub6ab\u873d\u6d69, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 \uf94d\u6d69\u4492\u6c56\u98a4\u3d64() {
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
            return:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8df4\u6fb0\u1187\uf94d\u6fb0\u0b8e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d \uc31c\u624e\u61a4\uc31c\u4d85\ub102() {
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
            return:\u6c52\u52d3\u516c\uae87\uae5d(getfield:\u7049\u40a9\uc87f\u2dcc\ub113[expected:\u6c52\u52d3\u516c\uae87\uae5d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4bc8\u6c56\ubcb0\u40a9\ube23\ud523, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 \ubded\u6c56\u5654\u3bc9\u9937\u4492() {
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
            return:\u4f52\ua068\u4f52\u47c2\u4492(getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u927d\ud36e\uae5d\u5db4\u16f6\u97b7 \ua6bd\u183a\u983f\u5bc4\ud523\u5140() {
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
            return:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7(getfield:\u927d\ud36e\uae5d\u5db4\u16f6\u97b7(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\uafe7\u7c6b\u99f7\u7af6\u1833, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.io.File \ua068\u5d20\ucef1\uc3e3\ub6ab\uf995() {
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
            return:File(getfield:File(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc31c\u6c52\u5bc4\ud523\u64f2\ub6ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9 \u6d69\u516c\ub8be\u839e\u47c2\ub171() {
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
            return:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(getfield:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\ubefe\ud171\uc7fe\u0a06\u6d69, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u97b7\u8350\u99f7\ub1b9\u839e\u873d> \u71ae\u7043\u3a62\u47c2\ua61f\u4d85(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u97b7\u8350\u99f7\ub1b9\u839e\u873d>(apply:(L\u12b2\u4e72\u8df4\u67e9\u67e9/\ud171\u156b\u0800\u36d3\ub8be\u760c;)Ljava/util/function/Function;, invokevirtual:\ud171\u156b\u0800\u36d3\ub8be\u760c(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\ub171\uf995\u3504\u3bd6\u3a62\u52d3, getfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uceb8\u8aa5\u385b\u3c25\u4c2b\uc2e8, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u52d3\u3bd6\ub7dc\u5bc4\u92ee\u7049() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ua3b4\u12cb\u6d99\u4c2b\u7c6b\u965f, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua068\ua3b4\u3776\u92ff\u7ce1\uf9c5() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc229\ub70c\ubded\ua61f\u946b\u873d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u6c56\uc238\u12cb\u873d\u67e9\ud158 \u9937\u9255\u7e3f\u69d9\u6c56\u34df() {
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
            return:\u6c56\uc238\u12cb\u873d\u67e9\ud158(getfield:\u6c56\uc238\u12cb\u873d\u67e9\ud158(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u6ec6\u56bd\u4c04\u759a\u69d9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u61a4\ud217\u4e72\u6ec6\uc238\u72f1 \uf94d\u64f2\u3bc9\u67e9\u36d3\u5d20() {
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
            return:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(getfield:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ubb2b\u64f2\u7330\u839e\ua068\uf94d \u120d\u5bc4\u88c5\uc84e\u74b1\ud4fe() {
        var_1_A8 : \uf995\u7049\u8258\u5654\u718f
        
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
        
        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u5245\u873d\u3504\u74b1\uff55\u4f4a.class, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))) {
            return:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\uc4d2\u7873\u62da\u4c2b\uc229\u3711))
        }
        
        if (cmpeq:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
            return:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u4cd9\ubff1\u6b0d\u3e75\u2dcc\uc238))
        }
        
        if (cmpeq:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u4d85\u120d\u5654\u9033\u446c\u4c2b))) {
            return:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(ternaryop:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(invokevirtual:boolean(\u446c\ud51e\u836c\u6b0d\u8413\u8c8a::\uf9c5\ua3b4\u1833\ubefe\u3a62\u67e9, invokevirtual:\u446c\ud51e\u836c\u6b0d\u8413\u8c8a(\u120d\u446c\uff55\u3d64\u494c\u69d9::\u7d52\u6435\ub7dc\u5140\u7043\ufcaf, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u93a2\ud4fe\u5d20\u8389\u8709\u5fe1), getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u98a4\ua61f\u8258\u67d0\ud523\uc229)))
        }
        
        var_1_A8 = invokevirtual:\uf995\u7049\u8258\u5654\u718f(\uc2e8\u9255\u647c\ud171\ubf56::\u7af6\u156b\ub7dc\ua3b4\u7ce1\u7049, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        
        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\ub70c\u600f\u93a2\uc910\u9937\u946b::\u8c8a\u7043\u71f1\ud12e\ufe34\u527a, getfield:\ub70c\u600f\u93a2\uc910\u9937\u946b(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\uc9f6\u9033\u5245\ubff1\u836c\u6198))), logicalor:boolean(logicalnot:boolean(invokevirtual:boolean(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u3504\u3bd6\ubf56\u92ff\ubb2b\u9255, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), logicaland:boolean(cmpne:boolean(var_1_A8:\uf995\u7049\u8258\u5654\u718f, getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u4179\u9937\u3bd6\u7e3f\ud217\uf9c5)), cmpne:boolean(var_1_A8:\uf995\u7049\u8258\u5654\u718f, getstatic:\uf995\u7049\u8258\u5654\u718f(\uf995\u7049\u8258\u5654\u718f::\u6435\u74b1\u7af6\u5245\u6b0d\uc87f)))))) {
            return:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(ternaryop:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(logicaland:boolean(logicaland:boolean(cmpne:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ubded\ub18d\u76bc\u8d98\u69d9\ucb79)), getfield:boolean(\uc9f6\u759a\u64ab\u97e6\u9255::\u98a4\u2dcc\uc9f6\u6435\u927d\u6435, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), getfield:boolean(\uc9f6\u759a\u64ab\u97e6\u9255::\u0c95\uc31c\u836c\u760c\u7ce1\u6d99, getfield:\uc9f6\u759a\u64ab\u97e6\u9255(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\ufe34\u92ee\ua61f\u3e2a\uc4d2\u7c6b, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u156b\uceb8\u16f6\u5d20\u51fa\u4492), checkcast:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ubb2b\u64f2\u7330\u839e\ua068\uf94d.class, invokevirtual:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(Optional<\ubb2b\u64f2\u7330\u839e\ua068\uf94d>::orElse, invokevirtual:Optional<\ubb2b\u64f2\u7330\u839e\ua068\uf94d>(\uc2e8\u9255\u647c\ud171\ubf56::\u4c04\u183a\ua562\u56bd\u3d64\u7049, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u8c8a\u51b2\u516c\ub70c\u624e::\u92ee\u760c\u3d64\u6c56\u8aa5\u946b, invokevirtual:\u8c8a\u51b2\u516c\ub70c\u624e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\u8350\u120d\uc7fe\u965f\u8c8a, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\u5d20\u92ff\u8350\u4179\ubcb0\u0b8e)))))
        }
        
        return:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(getstatic:\ubb2b\u64f2\u7330\u839e\ua068\uf94d(\ufe34\u99f7\u4492\u5245\ub171\u4f52::\uc9f6\u9033\u5245\ubff1\u836c\u6198))
    }
    
    public com.mojang.authlib.minecraft.MinecraftSessionService \u67e9\u6198\u3bd6\uf94d\uc2bd\u3504() {
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
            return:MinecraftSessionService(getfield:MinecraftSessionService(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uafe7\u3bd6\uc229\u36d3\u6198\u6d99, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\ub113\ubefe\ua61f\u965f\u120d\u927d \u071d\u718f\uae5d\u600f\u3e75\u40a9() {
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
            return:\ub113\ubefe\ua61f\u965f\u120d\u927d(getfield:\ub113\ubefe\ua61f\u965f\u120d\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud217\u6ec6\uc229\u7c6b\u4f52\u1187, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u983f\uc229\u8aa5\u873d\u0b8e\u4975() {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7ce1\u92ee\uc31c\u8c8a\u8aa5\u156b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \u8d90\u4c04\u4cd9\uc2e8\u3d4b\u4f52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7ce1\u92ee\uc31c\u8c8a\u8aa5\u156b, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            invokevirtual:void(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u64f2\u5654\u76bc\uc29a\ubded\uf995, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u647c\u3a62\u6c52\u67e9\ucef1\u52d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(logicalor:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\uc87f\u92ee\uc4d2\u8d90\u4e72\u16f6, p0:\u7d52\u718f\u3776\u6fb0\ub83f), logicaland:boolean(logicaland:boolean(logicaland:boolean(cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98()), invokevirtual:boolean(\uc910\ufcaf\uc229\u9255\u71f1\u0b8e::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\uc910\ufcaf\uc229\u9255\u71f1\u0b8e](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, getfield:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4e72\u8389\ubff1\uc7fe\u527a\ucfaf, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))), cmpeq:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u9255\u0c95\u4cd9\ube23\u760c::\u51b2\u6bb9\u8d90\u4c04\uc3e3\ucfaf)))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Thread \u5f50\u12b2\u92ee\uc31c\ub8be\u4ab3() {
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
            return:Thread(getfield:Thread(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u600f\uc9f6\u3e75\uc238\u6d69\ub8be, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Runnable \u4c04\ud217\u7330\u67e9\u8389\u4c2b(java.lang.Runnable p0) {
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
            return:Runnable(p0:Runnable)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5fe1\u8413\uafe7\u98a4\ud158\u67d0(java.lang.Runnable p0) {
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
            return:boolean(ldc:boolean(1))
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u40a9\u7873\u9a18\u3a62\u8350\u9af2 \u5bc4\u3bc9\u0c95\u8aa5\uc3e3\u47c2() {
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
            return:\u40a9\u7873\u9a18\u3a62\u8350\u9af2(getfield:\u40a9\u7873\u9a18\u3a62\u8350\u9af2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8709\u416d\uae5d\u2dcc\u183a\u3776, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u965f\u718f\u7c6b\u4cd9\u4daf\uc246 \ub18d\u67d0\u6d69\u6c56\u3dd3\u98a4() {
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
            return:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(getfield:\u965f\u718f\u7c6b\u4cd9\u4daf\uc246(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u69d9\u4179\u92ee\u446c\ub18d\ubefe, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a \u67e9\u8389\u3e75\u8cae\ub7dc\u12cb() {
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
            return:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a(getfield:\ubb2b\ud217\u3d4b\ubefe\u8d98\u4f4a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3e2a\u56bd\u836c\u7049\u88c5\ub171, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u927d\u92ff\u71ae\uafe7\u6bb9.\u3d64\u8350\u88c5\u12b2\u4c04\u8350 \u3bd6\u9a18\u7e3f\ua61f\u983f\u4d85() {
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
            return:\u3d64\u8350\u88c5\u12b2\u4c04\u8350(getfield:\u3d64\u8350\u88c5\u12b2\u4c04\u8350(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u494c\uc4d2\u4bc8\u1187\ua61f\u4975, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u61a4\u527a\u67e9\u99f7\u5fe1\uc7fe<T> \ud12e\ub8be\u5d20\u8258\u839e\u9a18(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\ub70c\u5245\u2dcc\uc31c\ua6bd<T> p0) {
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
            return:\u61a4\u527a\u67e9\u99f7\u5fe1\uc7fe<T>(invokevirtual:\u61a4\u527a\u67e9\u99f7\u5fe1\uc7fe<T>(\uf995\u183a\u92ff\u416d\u1833\u647c::\ub6ab\u8350\u4e72\ucef1\u8c8a\uc229, getfield:\uf995\u183a\u92ff\u416d\u1833\u647c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uff55\u9033\u98a4\u59ec\u61a4\ubcb0, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:\u7bad\ub70c\u5245\u2dcc\uc31c\ua6bd<T>))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u624e\u416d\u97b7\u1187\u8df4\u71ae \u9a18\ub32d\u718f\u6b5f\u12cb\ub70c() {
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
            return:\u624e\u416d\u97b7\u1187\u8df4\u71ae(getfield:\u624e\u416d\u97b7\u1187\u8df4\u71ae(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8389\uc7fe\ubff1\u600f\u927d\u88c5, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3711\u62da\u718f\ucef1\u6fb0\u71f1() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4c2b\u4cd9\uff55\ud4fe\u7bad\u8bb0, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \ub70c\u3e2a\u7c6b\uf9c5\u8308\u8258(boolean p0) {
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
            putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4c2b\u4cd9\uff55\ud4fe\u7bad\u8bb0, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.DataFixer \u71f1\u6c52\u97b7\u47c2\uafe7\u759a() {
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
            return:DataFixer(getfield:DataFixer(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5bc4\u8753\u8258\ud36e\u4e72\u9a18, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public float \ubcb0\uff55\u9937\u3d64\u8c8a\u8cae() {
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
            return:float(getfield:float(\u4c04\uae87\u56bd\u4c2b\u97e6\u7049::\ub18d\ua61f\u4179\uc29a\u759a\uc229, getfield:\u4c04\uae87\u56bd\u4c2b\u97e6\u7049(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u6b0d\uceb8\u8aa5\u98a4\ub32d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
        }
        
        goto(Label_0006)
    }
    
    public float \u40a9\uc9f6\u5245\u4492\uc31c\ud217() {
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
            return:float(getfield:float(\u4c04\uae87\u56bd\u4c2b\u97e6\u7049::\u3bc9\u61a4\ubded\u3711\ucef1\u8aa5, getfield:\u4c04\uae87\u56bd\u4c2b\u97e6\u7049(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u6b0d\uceb8\u8aa5\u98a4\ub32d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255 \u9033\u4975\u516c\u7af6\uff55\uc229() {
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
            return:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255(getfield:\u8389\u3bd6\u3bc9\ubefe\u5fe1\u9255(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8cae\u8258\u8d98\u3504\uc2e8\u6cfe, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0800\u4bc8\u4e72\u7049\ua3b4\uc9f6() {
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
            return:boolean(logicalor:boolean(logicaland:boolean(cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98()), invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\ub70c\u3e2a\u9255\u4e72\ub6ab\u7ce1, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ua3b4\u8aa5\ub113\ubf56\u873d](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))), getfield:boolean(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ua068\u4cd9\u9255\u56bd\u62da\u67d0 \ub1b9\u3bc9\ub83f\u6d69\u76bc\u59ec() {
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
            return:\ua068\u4cd9\u9255\u56bd\u62da\u67d0(getfield:\ua068\u4cd9\u9255\u56bd\u62da\u67d0(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc229\u4179\uc3e3\u47c2\u0b8e\u7873, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\ud217\ufe34\u4d85\u6b0d\u1187\u5f50 \u4c2b\ub19c\u3c25\u5654\u5654\u4179() {
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
            return:\ud217\ufe34\u4d85\u6b0d\u1187\u5f50(getfield:\ud217\ufe34\u4d85\u6b0d\u1187\u5f50(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubded\ud4fe\ua6bd\u71ae\u494c\u7330, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u760c\uceb8\u983f\ub19c\ubcb0\u960f() {
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
            return:boolean(getfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub18d\ub70c\u0c95\u3a62\uae87\u6bb9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc84e\u4ab3\u8c8a\uc3e3\u8aa5\uc31c \uc2bd\u446c\u69d9\u72f1\ub19c\uc3e3() {
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
            return:\uc84e\u4ab3\u8c8a\uc3e3\u8aa5\uc31c(getfield:\uc84e\u4ab3\u8c8a\uc3e3\u8aa5\uc31c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc29a\u56bd\u7c6b\u99f7\ub83f\ub1b9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u7af6\u67d0\u8753\u71f1\u6198\u494c \u6cfe\u4bc8\u51fa\u7e3f\u40a9\u52d3() {
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
            return:\u7af6\u67d0\u8753\u71f1\u6198\u494c(getfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uceb8\u8aa5\u385b\u3c25\u4c2b\uc2e8, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9 \u9a18\u5db4\u5245\u6198\u8709\u156b() {
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
            return:\u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9(getfield:\u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6ec6\u392e\u7c6b\u4c2b\ud217\ud523, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u3d64\u74b1\uafe7\u61a4\u3776\ua61f \u3776\u34df\uc2bd\u92ff\ubf56\u965f() {
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
            return:\u3d64\u74b1\uafe7\u61a4\u3776\ua61f(getfield:\u3d64\u74b1\uafe7\u61a4\u3776\ua61f(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\ub32d\u0b8e\ud158\u74b1\ud36e, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public void \u7bad\uc238\u416d\u4179\u9a18\u6198(boolean p0) {
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
            putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub18d\ub70c\u0c95\u3a62\uae87\u6bb9, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d \uc84e\u3c25\u759a\ua068\ub113\ua562() {
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
            return:\ubf56\u64f2\u392e\u98a4\u120d(getfield:\ubf56\u64f2\u392e\u98a4\u120d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u71f1\u97b7\u120d\u5654\ubcb0\u64ab, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b \u8bb0\ud7e8\u62da\u52d3\u51b2\u93a2() {
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
            return:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b(getfield:\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6198\u3bc9\u527a\u3d4b\uc2bd\u64f2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8d90\u92ff\u718f\u3bc9\u8cae\u392e \ud158\u69d9\u156b\u8cae\u9a18\u6cfe() {
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
            return:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e(getfield:\u8d90\u92ff\u718f\u3bc9\u8cae\u392e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u759a\u51fa\ud7e8\ub18d\u40a9\u4daf, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9 \ub83f\ud158\uc87f\u3dd3\uc238\u51b2() {
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
            return:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(getfield:\u67d0\ub7dc\u92ff\ua562\uff55\u6bb9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud36e\ub83f\u3d64\u6d99\ucef1\ud217, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u59ec\u4bc8\uc910\ua562\u72f1\u839e \u12cb\ud51e\u9255\u92ff\u3711\uc87f() {
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
            return:\u59ec\u4bc8\uc910\ua562\u72f1\u839e(getfield:\u59ec\u4bc8\uc910\ua562\u72f1\u839e(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u64f2\u647c\u7049\u99f7\ub102\uc29a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud158\u385b\u56bd\u98a4\uc238\u960f() {
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
            return:boolean(ldc:boolean(0))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd \u52d3\u8709\ubf56\uc238\ufcaf\ua562() {
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
            return:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(getfield:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u98a4\uc2bd\ufcaf\u8d90\u9255\u8709, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2 \uc29a\u8308\u7006\u8aa5\u760c\ud12e() {
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
            return:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(getfield:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4ab3\uf94d\u6d99\ub113\ub113\uff55, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 \u4bc8\u3bd6\u76bc\ub113\ub171\u516c(java.lang.String p0, boolean p1, java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 p3, \u12b2\u4e72\u8df4\u67e9\u67e9.\u6198\ub113\u8709\uf9c5\u0a06 p4, \u51fa\u12cb\u7330\u74b1\u6c52.\ub18d\ub171\u51fa\uafe7\u7049 p5, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p6) {
        var_7_5D : int
        var_8_79 : Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>
        
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
            var_7_5D = invokevirtual:int(\u6198\ub113\u8709\uf9c5\u0a06::\u9255\ua61f\u8258\ufe34\u718f\u7bad, p4:\u6198\ub113\u8709\uf9c5\u0a06)
            var_8_79 = p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>
            
            if (cmple:boolean(var_7_5D:int, ldc:int(3))) {
                var_8_79 = invokestatic:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8753\u4f52\u93a2\u36d3\u59ec\ud217, p2:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>)
            }
            
            if (cmple:boolean(var_7_5D:int, ldc:int(4))) {
                var_8_79 = invokestatic:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub18d\ud217\u3e75\u4bc8\u5db4\u946b, var_8_79:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>)
            }
            
            return:\ua61f\uae87\u36d3\u647c\u3d64(initobject:\ua61f\uae87\u36d3\u647c\u3d64(\ua61f\uae87\u36d3\u647c\u3d64::<init>, p0:String, p1:boolean, var_8_79:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>, p3:\u4f52\u7ce1\uc229\ucef1\ube23, p4:\u6198\ub113\u8709\uf9c5\u0a06, p5:\ub18d\ub171\u51fa\uafe7\u7049, p6:\ud51e\u7ce1\ua61f\u183a\u1187))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> \u8753\u4f52\u93a2\u36d3\u59ec\ud217(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p0) {
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
    
    private static java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> \ub18d\ud217\u3e75\u4bc8\u5db4\u946b(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> p0) {
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
    
    public void \ub32d\u385b\u93a2\u3e2a\u760c\u5f50(int p0) {
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
            invokevirtual:void(\u7af6\u67d0\u8753\u71f1\u6198\u494c::\u4179\uceb8\uc910\u6cfe\u7ce1\u74b1, getfield:\u7af6\u67d0\u8753\u71f1\u6198\u494c(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uceb8\u8aa5\u385b\u3c25\u4c2b\uc2e8, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u7006\u960f\u965f\u1187\ub113\u983f() {
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
            return:int(getstatic:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u3776\u624e\u67d0\uae5d\ud36e\ud36e))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u4ab3\u6198\u64f2\u0800\u6435\u392e$40(java.util.function.Supplier p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u3dd3\u64f2\u3a62\u4975\u7e3f\u3bd6[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u3dd3\u64f2\u3a62\u4975\u7e3f\u3bd6::<init>, checkcast:\u4f52\u7ce1\uc229\ucef1\ube23(\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23.class, invokeinterface:\u4f52\u7ce1\uc229\ucef1\ube23(Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>::get, p0:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>))))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\ub8be\ud4fe\uc2bd\u8709\u76bc\u0800$39(java.util.function.Supplier p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u51b2\u983f\u5f50\u839e\u4c04\u36d3[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u51b2\u983f\u5f50\u839e\u4c04\u36d3::<init>, checkcast:\u4f52\u7ce1\uc229\ucef1\ube23(\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23.class, invokeinterface:\u4f52\u7ce1\uc229\ucef1\ube23(Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>::get, p0:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>)), getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u51b2\u983f\u5f50\u839e\u4c04\u36d3::\u5fe1\ub6ab\u8d98\u927d\u3776\ub6ab)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7c6b\u759a\ubcb0\u34df\uc910\ud12e$38() {
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
    
    private void lambda$\u8c8a\u6b0d\u385b\u446c\u92ee\u946b$37(com.mojang.authlib.properties.Property p0) {
        var_4_7A : Matcher
        
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
            var_4_7A = invokevirtual:Matcher(Pattern::matcher, invokestatic:Pattern(Pattern::compile, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(160))), initobject:String[expected:CharSequence](String::<init>, invokevirtual:byte[](Decoder::decode, invokestatic:Decoder(Base64::getDecoder), invokevirtual:String(Property::getValue, p0:Property))))
            
            if (logicaland:boolean(invokevirtual:boolean(Matcher::find, var_4_7A:Matcher), logicalnot:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(Matcher::group, var_4_7A:Matcher, ldc:int(1)), loadelement:String[expected:Object](getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(161)))))) {
                putfield:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u647c\u4daf\u156b\u5fe1\ucfaf\ud158, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, ldc:boolean(0))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletionStage lambda$\u8308\ua3b4\u64ab\u7af6\u4975\ub19c$36(java.util.concurrent.CompletableFuture p0) {
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
            return:CompletionStage(p0:CompletableFuture[expected:CompletionStage])
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u12b2\u6b0d\u9af2\u88c5\ub7dc\u836c$35(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9 p0) {
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
            return:String(invokevirtual:String(\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e::toString, invokevirtual:\ud217\u4cd9\ub83f\u51b2\u8709\u0b8e(\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9::\u74b1\u8c8a\u62da\u4e72\uc2e8\ud12e, p0:\u7c6b\ud51e\u494c\u494c\uafe7\u3bc9)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ube23\u3a62\u4ab3\u9af2\u36d3\u98a4$34(\u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p0) {
        var_1_5F : StringBuilder
        var_2_69 : Iterator<String>
        var_3_7C : String
        
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
            var_1_5F = initobject:StringBuilder(StringBuilder::<init>)
            var_2_69 = invokeinterface:Iterator<String>(List<String>::iterator, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, p0:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_2_69:Iterator<String>)) {
                var_3_7C = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_2_69:Iterator<String>))
                
                if (cmpgt:boolean(invokevirtual:int(StringBuilder::length, var_1_5F:StringBuilder), ldc:int(0))) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_1_5F:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(162)))
                }
                
                invokevirtual:StringBuilder(StringBuilder::append, var_1_5F:StringBuilder, var_3_7C:String)
                
                if (invokeinterface:boolean(List<E>::contains, getfield:List<String>(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\u4daf\u416d\u6c56\u97b7\ufe34\u071d, p0:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3), var_3_7C:String[expected:Object])) {
                    invokevirtual:StringBuilder(StringBuilder::append, var_1_5F:StringBuilder, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(163)))
                }
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, var_1_5F:StringBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u3e2a\u69d9\ube23\u52d3\u9af2\u64ab$33() {
        var_0_5B : String
        
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
        var_0_5B = invokestatic:String(\ub171\ub1b9\u5d20\u3dd3\u4492\u97e6::\u3d64\u97b7\ubf56\u3776\u88c5\u8258)
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(164)), var_0_5B:String[expected:Object]))) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(165))), var_0_5B:String), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(166)))))
        }
        
        return:String(ternaryop:String(cmpeq:boolean(invokevirtual:Object[](Class<T>::getSigners, ldc:Class<\u67e9\u4daf\u760c\ud217\ua6bd\ubff1>(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1.class)), aconstnull:Object[]()), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(167)), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(168))))
    }
    
    private static java.lang.String lambda$\u97e6\u2dcc\u9937\u6ec6\ub32d\ucb79$32() {
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
            return:String(loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(169)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ucef1\u516c\ubf56\uf94d\u36d3\ubb2b$31(java.lang.String p0) {
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
            return:String(p0:String)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\ub7dc\u3504\u88c5\ua61f\u385b$30(java.lang.Runnable p0, java.lang.String p1, boolean p2) {
        var_4_75 : \uae87\ub19c\u9937\u836c\u34df\ub8be
        var_5_78 : Throwable
        var_6_A5 : Throwable
        var_8_C2 : Throwable
        var_4_D9 : IOException
        
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
            
            if (p2:boolean) {
                invokeinterface:void(Runnable::run, p0:Runnable)
            }
            else {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
                
                try {
                    var_4_75 = invokevirtual:\uae87\ub19c\u9937\u836c\u34df\ub8be(\ub102\uc9f6\u8aa5\ubff1\u4179\u527a::\ua6bd\uc229\u718f\u36d3\ua562\u4179, getfield:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub8be\u927d\u5db4\u34df\u2dcc\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p1:String)
                    var_5_78 = aconstnull:Throwable()
                    
                    try {
                        invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::\u4975\uf995\u960f\uc9f6\uc3e3\ua6bd, var_4_75:\uae87\ub19c\u9937\u836c\u34df\ub8be)
                    }
                    catch (java.lang.Throwable var_6_A5) {
                        var_5_78 = var_6_A5:Throwable
                        athrow(var_6_A5:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_4_75:\uae87\ub19c\u9937\u836c\u34df\ub8be, aconstnull:\uae87\ub19c\u9937\u836c\u34df\ub8be())) {
                            if (cmpne:boolean(var_5_78:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::close, var_4_75:\uae87\ub19c\u9937\u836c\u34df\ub8be)
                                }
                                catch (java.lang.Throwable var_8_C2) {
                                    invokevirtual:void(Throwable::addSuppressed, var_5_78:Throwable, var_8_C2:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(\uae87\ub19c\u9937\u836c\u34df\ub8be::close, var_4_75:\uae87\ub19c\u9937\u836c\u34df\ub8be)
                            }
                        }
                    }
                }
                catch (java.io.IOException var_4_D9) {
                    invokestatic:void(\ud158\u56bd\uafe7\u7043\u965f\u8389::\u88c5\u3bc9\u839e\uc2e8\u7043\u527a, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:String)
                    invokeinterface:void(Logger::error, getstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c), loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(170)), p1:String[expected:Object], var_4_D9:IOException[expected:Object])
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u97b7\u8aa5\u4c2b\u3776\u98a4\u6cfe$29(java.lang.String p0, java.lang.Runnable p1, boolean p2, boolean p3) {
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
            
            if (p2:boolean) {
                invokestatic:void(\u97e6\u92ee\u6fb0\u3c25\u72f1\u6cfe::\u8709\u183a\u927d\u156b\u7bad\uc4d2, getfield:\ub102\uc9f6\u8aa5\ubff1\u4179\u527a(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub8be\u927d\u5db4\u34df\u2dcc\ub70c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), p0:String)
            }
            
            invokeinterface:void(Runnable::run, p1:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ufcaf\ua3b4\u7043\u5245\u946b\uf995$28(java.lang.String p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, java.util.function.Function p2, com.mojang.datafixers.util.Function4 p3, boolean p4) {
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
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u071d\u4492\ub32d\u4179\u647c\u0800, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:String, p1:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p2:Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>, p3:Function4, p4:boolean, getstatic:\u946b\u760c\ubefe\ubff1\u8308\ud12e(\u946b\u760c\ubefe\ubff1\u8308\ud12e::\u8cae\u1187\u760c\ub8be\uf94d\u3bc9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ubf56\u6cfe\u4ab3\u4f52\u5fe1\u69d9$27(net.minecraft.util.text.ITextComponent p0) {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u7049\u8df4\uc9f6\uae87.\uf995\u64f2\u3711\uc2e8\u927d lambda$\u8bb0\u71f1\u7043\uceb8\u16f6\ud217$26(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6fb0\u6c56\ubf56\u7006\u965f\u7c6b p2, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec p3, com.mojang.authlib.minecraft.MinecraftSessionService p4, com.mojang.authlib.GameProfileRepository p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub1b9\u983f\uf9c5\u6fb0\u51fa p6, java.lang.Thread p7) {
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
    
    private \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u647c\u8308\u446c\uc3e3\u69d9 lambda$\u8d98\u97b7\u3e75\u52d3\u61a4\u67d0$25(int p0) {
        var_2_62 : \u983f\u3d4b\u92ff\u51fa\u120d
        
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
            var_2_62 = initobject:\u983f\u3d4b\u92ff\u51fa\u120d(\u983f\u3d4b\u92ff\u51fa\u120d::<init>, add:int(p0:int, ldc:int(0)))
            invokevirtual:void(\u983f\u3d4b\u92ff\u51fa\u120d::\u56bd\uf995\ub18d\u1187\u600f\u7ce1, var_2_62:\u983f\u3d4b\u92ff\u51fa\u120d)
            invokevirtual:void(AtomicReference<\u983f\u3d4b\u92ff\u51fa\u120d>::set, getfield:AtomicReference<\u983f\u3d4b\u92ff\u51fa\u120d>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6b0d\uf9c5\ub83f\uae5d\u927d\uafe7, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), var_2_62:\u983f\u3d4b\u92ff\u51fa\u120d)
            return:\u647c\u8308\u446c\uc3e3\u69d9(initobject:\u12b2\u839e\u8350\u93a2\u7af6(\u12b2\u839e\u8350\u93a2\u7af6::<init>, var_2_62:\u983f\u3d4b\u92ff\u51fa\u120d[expected:\u647c\u8308\u446c\uc3e3\u69d9], invokedynamic:Executor(execute:(Ljava/util/Queue;)Ljava/util/concurrent/Executor;, getfield:Queue<Runnable>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8d98\u74b1\u4f52\u8d90\u9a18\u71ae, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u965f\uc9f6\u5140\u5245\u7c6b\u624e$24(java.lang.String p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p1, java.util.function.Function p2, com.mojang.datafixers.util.Function4 p3, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u946b\u760c\ubefe\ubff1\u8308\ud12e p4) {
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
            invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u071d\u4492\ub32d\u4179\u647c\u0800, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p0:String, p1:\u7d52\u51fa\u56bd\u76bc\u4975\ub113, p2:Function<\uae87\ub19c\u9937\u836c\u34df\ub8be, \u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf>, p3:Function4, ldc:boolean(1), p4:\u946b\u760c\ubefe\ubff1\u8308\ud12e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec lambda$\u52d3\u4f4a\u5fe1\u5db4\u983f\u8389$23(\u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u40a9\u4975\u0800\u385b p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubded\u9033\u5654\u6198\uc29a\uc910 p2, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p3, \u5d20\u7043\u88c5\u5db4\uf94d.\u7d52\u51fa\u56bd\u76bc\u4975\ub113 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p5, \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf p6) {
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
    
    private static com.mojang.serialization.DataResult lambda$\u59ec\u8640\uc238\u516c\u16f6\ubded$22(\ub113\uc4d2\u183a\u527a\u6435.\ud171\ub171\u4c2b\uae5d\u4c04\u494c p0, com.google.gson.JsonElement p1) {
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
            return:DataResult(invokeinterface:DataResult(Codec::parse, getstatic:Codec<\u7043\u40a9\u4975\u0800\u385b>(\u7043\u40a9\u4975\u0800\u385b::\ub171\u4ab3\ubff1\u156b\u7873\ub7dc), p0:DynamicOps, p1:JsonElement[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u97b7\u8753\u873d\u16f6.\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf lambda$\u6435\u0c95\ud217\u7c6b\u8bb0\u7043$21(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\ubded\u9033\u5654\u6198\uc29a\uc910 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p1) {
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
            return:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(invokevirtual:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\ubded\u9033\u5654\u6198\uc29a\uc910::\u6435\u385b\u5245\u72f1\u965f\uc9f6, p0:\ubded\u9033\u5654\u6198\uc29a\uc910))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8aa5\u4179\u67d0\ub83f\uafe7\u6c52$20() {
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
            return:boolean(ldc:boolean(1))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3c25\u71f1\u3dd3\u62da\u74b1\u3711$19() {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7330\u7ce1\ud7e8\u6b5f\ubcb0\u5654$18(java.util.concurrent.CompletableFuture p0) {
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
            invokevirtual:boolean(CompletableFuture<Void>::complete, p0:CompletableFuture<Void>, checkcast:Void(java.lang.Void.class, aconstnull:Void()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5f50\u3776\u494c\u7043\u64ab\uf995$17(java.util.concurrent.CompletableFuture p0, java.util.Optional p1) {
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
    
    private void lambda$\u4c04\ub1b9\ufcaf\u6c52\u5d20\u6d69$16(java.util.concurrent.CompletableFuture p0) {
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
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u76bc\ub83f\u8bb0\u69d9\u7049\u97e6, getfield:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc4d2\u3d4b\u6c56\u40a9\u156b\u98a4, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
            invokevirtual:boolean(CompletableFuture<Void>::complete, p0:CompletableFuture<Void>, checkcast:Void(java.lang.Void.class, aconstnull:Void()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u4179\u8709\u98a4\u071d\u7330\uc910$15(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8 p0) {
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
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u7006\ub102\uc87f\u7873\u6fb0\uc84e$14(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7 p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u67d0\ubff1\u3dd3\uc87f\u76bc\u3bc9$13(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5f50\uc29a\u3a62\uceb8\ud171\uc2e8 p0) {
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
    
    private static boolean lambda$\u983f\u5f50\u9937\u51fa\ud51e\u4f4a$12(java.lang.String p0) {
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
            return:boolean(logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p0:String)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u527a\u7330\uc4d2\uceb8\u88c5\ud158$11(net.minecraft.util.text.ITextComponent p0) {
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
            return:String(invokevirtual:String(String::trim, invokestatic:String(TextFormatting::getTextWithoutFormattingCodes, invokeinterface:String(ITextComponent::getString, p0:ITextComponent))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u4c04\u5d20\u8df4\u4ab3\uc4d2\ub113$10(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7 p0) {
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
            return:Stream(invokeinterface:Stream<Object>(Collection<Object>::stream, invokevirtual:List<ITextComponent>[expected:Collection<Object>](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc29a\u5d20\uc29a\u4179\u34df\u3bc9, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u446c\ucef1\u1187\u8aa5\u7330\u5245, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7), checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d()), getstatic:\uceb8\u7bad\u6c56\u74b1\ud36e\u56bd[expected:\u8753\uc246\u8c8a\u2dcc\uf94d\ubf56](\uceb8\u7bad\u6c56\u74b1\ud36e\u56bd::\uc9f6\u97e6\ufcaf\u1833\u6b5f\u516c))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucb79\u6bb9\u8350\u7c6b\ubff1\u4c04$9(\u6435\ub8be\u718f\u6b0d\u67e9.\uae87\uc246\u97e6\u93a2\u6435\u416d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u3dd3\u6d99\u7c6b\u51fa\u6d69\ub32d p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p2) {
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
            invokevirtual:void(\u3dd3\u6d99\u7c6b\u51fa\u6d69\ub32d<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::\u3d64\u9255\uc246\u9033\u5db4\u392e, p0:\uae87\uc246\u97e6\u93a2\u6435\u416d<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:\u3dd3\u6d99\u7c6b\u51fa\u6d69\ub32d<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], p2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            invokevirtual:void(\u3dd3\u6d99\u7c6b\u51fa\u6d69\ub32d<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::\u3d64\u9255\uc246\u9033\u5db4\u392e, p1:\u3dd3\u6d99\u7c6b\u51fa\u6d69\ub32d<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u36d3\u3d4b\u759a\ubded\u51fa\ub18d$8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:Stream(invokeinterface:Stream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::stream, invokeinterface:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u88c5\ube23\u0b8e\ubded\u8bb0\ub171, invokestatic:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\u6198\u5db4\uc31c\u5f50\uf94d\u97e6::\uc246\u5140\ub171\u5fe1\ubf56\ub8be), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u839e\u7bad\u4975\u071d\u156b\u36d3$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:Stream(invokestatic:Stream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Stream<T>::of, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u7043\u93a2\u67d0\uae87\u6b5f\u3c25$6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
    
    private static boolean lambda$\ua3b4\u5bc4\u8bb0\u4492\u6bb9\u67e9$5(java.lang.String p0) {
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
            return:boolean(logicalnot:boolean(invokevirtual:boolean(String::isEmpty, p0:String)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u6c56\ub7dc\uc87f\u93a2\uc87f\uc4d2$4(net.minecraft.util.text.ITextComponent p0) {
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
            return:String(invokevirtual:String(String::trim, invokestatic:String(TextFormatting::getTextWithoutFormattingCodes, invokeinterface:String(ITextComponent::getString, p0:ITextComponent))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3bc9\u8413\u64f2\u8d98\u3711\u071d$3(net.minecraft.util.text.ITextComponent p0) {
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
            invokestatic:void(\ud158\u56bd\uafe7\u7043\u965f\u8389::\ub32d\u6bb9\ub113\u416d\ub18d\u76bc, invokevirtual:\ua068\u4cd9\u9255\u56bd\u62da\u67d0(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub1b9\u3bc9\ub83f\u6d69\u76bc\u59ec, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1), getstatic:\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab(\u5fe1\u6bb9\ubefe\ua6bd\u8df4\ub6ab::\uc84e\u0b8e\ucef1\ud217\u3504\u8258), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1), ldc:int(172))), p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud523\u4bc8\u5245\u8389\uae87\u71ae$2(java.util.Optional p0) {
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
    
    private void lambda$\uc29a\u6198\ua61f\ub18d\ua61f\u0800$1() {
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
            
            if (getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006)) {
                invokespecial:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u4ab3\u97e6\u5d20\ud217\u183a\u927d, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int lambda$\ua6bd\u7873\ub18d\u7049\u5db4\u3dd3$0() {
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
            return:int(getfield:int(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u6fb0\ud12e\u8aa5\ub171\u92ee, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1))
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_5E : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_12C_0 : byte[] [generated]
        expr_65 : int [generated]
        var_1_6F : byte[]
        var_2_70 : int
        expr_7A : byte [generated]
        var_4_96 : byte[]
        expr_9B : int [generated]
        var_1_A3 : byte[]
        var_2_A4 : int
        expr_CE : int [generated]
        var_3_D4 : int
        var_1_D8 : byte[]
        var_2_D9 : int
        expr_E0 : byte [generated]
        expr_109 : int [generated]
        var_1_113 : byte[]
        var_2_114 : int
        var_1_138 : String
        expr_13C : String[] [generated]
        expr_142 : String[] [generated]
        var_1_BAF : String[]
        
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
            expr_5E = stack_96_0 = stack_99_0 = stack_AB_0 = stack_CB_0 = stack_CE_0 = stack_E0_0 = stack_106_0 = stack_109_0 = stack_11B_0 = stack_12C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ABQakphtlGd5jHvv4RXvexL0CBS6C3mGfxSQnvN/b2cwGZJtbxqQnvOejpIERcfD40eqwGk1WQ+SgoiGd7p9jmEh0NQOHCeenGc4mneay/UhhOQw2se0f5wAY4DDkEmSHHfvY4Q9ZcEzX6JhIZBtoKhhIZDQDhwnnpxnOJp3msv1IYTkMNrHtH+cAGOAw3Fplg6Y/2+eimFxecU4a7Iedw/H7SW4rmFRV9RpFg6KY0EFzZamQzprYWFhYQuyx5bWTZbAlA4IuoRtyycx9wzOLSi6+YTZx+DsAP6AmhGGgm2Q7+FPlJaYbWNhb5Rp9JZlZTXKO5zGOZzIZWHYYTP+NTllMcxjbWlr9J7IMQ3GNZr4b8CSP5g9fcABwvaWbwVpa5qcmgmSnAmacWX8xIZtCQWSjmvOZcyYB5plYfJpAcSQZ5qWP55rN2eG+szy3oxlY+N3YbAcZyFHa2XSipb/J1ld1qyw2tyKlv+WY2s0fYa+A2Fxf9yKlv+WY2s0fYa+E+GCnpgAeVnEL2+yb8SCK3FxC215KajUtty2y2uEbQSCx2VtQRJpZ5LliH+CCJKKR3FlS2OQlAvrlnMcDpKYmH/BfWGUZ7BtbxBHgGNv42dlgAKSikdxZUtjkJRbjG91zJohnGN7zprxE2tDBvBzhGuehJoRhoJtYQtzkh7ab/Oc4ZjmZWFxZWUKJbycmthtns1Vc2scwm9hbwWSaZLInIhlaYQR4ztzyhTGmvFjlkkGlM2UbW0GlGmW+4yG7ZgznjocwMdlcUUSeYKe5YiUjgpJd3Ga7YhpkDR5hH9r83Nrkh62732ATRJpZ5LlaXuKFu+IQ5YMmivvJ5zGHsZrmIRtxWlh8zySlAhJ955tZwI7fZCUrpL7koDtGHlvFoZh8bhtigZJ946+XxxPRaKS+5KA7Qhpexz5eWeAEO+IQ5YMy5CMmBqUdTFha5CmkvuSgO0IaXsc+XlngBCOaUGCnAvrd0EUnLLvkgxrGnt3e+e2nIgQwY59jjx1jMd1hE0SKX2ckKCS+5KA7Qhpexz5mICEBEk3Q2OWoJL7koDtOH1/HMmUkrgcZ+GatvEYWXUSX21xhqqS+5KA7ThnbQZDZfd5bXEQtozhhmPJBnmeEmfhmrYhHE9FopL7koDtOHWeCk+wyXWAYxqQaW+Qb3VrYYCIN1v7P6bcOJpJU8eGsK4GtIx3lieUaW3Wf5Kc+5CIeR4nmOlZ0HUeuHFXlJ6S0OdrnJprQWd9Bob1AxUPwsoA+qyET5qSZ45Te4plupJDceVHZYA0uoptKW+Yc6LhOysjEMbWruE7YZgeZ5SIb6Dhe4r1CIRpDvk7kpoUmG+cjqSYd8mWmG8WZ/OejJyk7YyIugp/caSYd8mWc4o6aZ5tff+SdYIM9ZJrkKjtjIi6Cn9xpJh3yYaaaQxlY22QdZSKx2lnkKjtjIhbJJrdKpo9PndPM21nnjBngH9Pw3WK5ZiSczTIa4acrozz+fNpEO42y4hrYzhnb2nznOFp7G0IYYb3L4KQZaJxzwh3lAKStllrfX+snpb5lmUxa0GIFuoXZ2ERGlNlHueOZ5IC+X2YYQ5XY4qUA5B7bRx5ileMipQNkJhPNpyejiNlRcHQfYoeeYpXjIRNsE9htuOCmGuK9S1LFmnAnnEGRYSKlJjJaXeaEH+CnuVzYXFvkG2UFoaa8WOWSQaUzZSQ5ziWlg5jcXd5RQNbgIb6qHlrRVFLXQOUuqQcuIpXmI5/vIp3gkV3imumgHN3x3W+axKGa5iEbcWIa54IkprFU0uUBtSKR3HFK2VlBNp7nIyevoR/y4iYZzQdx7aEqh5hfbKekm3teUNtCoiyb/kndZIMiPUDFQ/y+hTiqF+YnG3eK5hladB/hnfHaWGAFmeUSYZjde1jY4A0dYxXb2Vp0J6OU29hbaB3Z3PzT2trCLyWlvmGfYYad4xbvIh7kn93tqp7Y2V5Z+N3joYEgldrmHuqmm+Ac3fHdb5rEoZrmIRtxYhrngiSmsVTZWkKts1HN1kwa9DamgWcc3McZ4AB4StV8GPAnnEGRYSKlJjJeWm4Hp5rS2WQYWlxcY51toRhE3NBaRrnnnuIEu+YYeMSlGUYbZrr55R3AmmAZUNncY6MBoKWz3VNYTiU6UNZB+oZZ4BjYZCsFRqOshKOZ2dvkGVZkkGShHVhYbCKgnFzeUOCbYCWb3lhAWtrYeyAuFt3Y0OAkGOajpphnGN7jppBmnl3gpKEHZp1a2GAhhv+eZrigmd7f2WAjJ59mOWQhnnmYWNjdYZ/ipjnmm1jHpTnun+cEG2AknuYa2WSbZ5NZ3lngIyES2F5c7qegpR7mGOYcZB1abZ9knGQRWO8T7iMc4p/nGljinGScZBFkrBxknV/R4KAdYJDc2VpgG24nHeAbUNhc1ecZZSynIJhipwrlnt3qoBNgH1JpHOWvHmQgkeUZX+Me2eYcVOEdWOgfYxvQZqYb7KKd4KUnJp5lGGEmm9zSZp7moKesJo97euayAoelo5HZ+Nvmmn6c4R/mr7viGdjkJ5lkBiWjkfn+0tvaeQ1B4h5Y2vIkBQYhg1pfWfocwUVgj2cd3Hg9u57mp6CDWl9Z+hzBRGKPWljeeD65mt1kHuQYRu4R7Ied4pteWGIfZhpaZ5tZ2GYim9hb3WSiGNhkEOyb29BR4J/sIp3gpRzgpJtYWl/nowRjnWa7muaNWWYYaSQYY6Qc2FlYY5jaWtBhnGWhGmYkm1pa0GGcZYFZ4x97ktlV5S2a85/S4JzgoRrE2eSnv5/mkOGjEuanmuOtB9tmEvgjJS6f2NxT5pxnJKEb5CGY55tfY6MZ45/b45vL5JlkNJ9mGWKjGuYe4xrnpxVlHuasmuOd3WKlpiOZZaKR3ElS2OQJYSKefR1e2OQhoaYiJyaikdxRW1lZYRJup6csJiKR3FFbWVlhJi6jpiYb5BlQ5p9aZJlc4BvYbBNlnt9vpxpYQGAaWHCYWlpc3O+vG+ec02AQ4qMc4DnQ3Fn4raKQ4RNkNp7iG3rbZyUFoR5cZR1dYJNmpJPgEOKjHOA50NxZ+K2ikOETZDae4ht622InvyCd29nYYh7mJJ3jmtPgEOKjHOA50NxZ+K2inN5ZWe0jHfnYZyCGIR5cZR1dYJNmpJPgEOKjHOA50NxZ+K2inN5ZWe0jHfnYYiM/oJ3b2dhiHuYkne+jn2M52tpkB6cikdx9WFlZeSUupyUe2lvmJx3tnmWtH2caWmQkJZvaXeSS2FhabBnlGlhkm91Q2VXlLZrzn9LgnOChGuCbZBje55pc7J9bYJBiHNlgn2ObYKO70tld+YNd22E+AuMaZr6Y5KWvpqQjkdnY3NjdWFhsJ5/H2eOnhJlaWtBhnGWBXdraRhltmt1H2eOnhJlaWtBhnGWBXeEc/SSa5COY30fZ46eEmVpa0GGcZYFZ29B4mWKtGuWY38fZ2OG7m9vmJx3tnmWtHtlmG+QuGuYT3GYZ7CeY3VJZ+eIjHXiS2VXlLZrzn9LgnOChGsTd3dj8IaUabZ/kmVlgJiWb3VJZ+eIjHXiS2VXlLZrzn9LgnOChGsTlmea7nWOaW2Wb5yYiGOSnktxd3WUmG2KkmNjZ3MnkGGC2nGQlHWGR3GEe4qWgoZHR0lpYZSac5K6d5aIAYKEL6KSmriMlneKf32AdWOAfW2QQYqwiLb3OTn5+LKyrFsJjNRXFJZFzF9ZaQ=="))
            expr_65 = arraylength:int(expr_5E:byte[])
            
            if (cmpne:boolean(expr_65:int, ldc:int(0))) {
                var_1_6F = newarray:byte[](byte.class, expr_65:int)
                var_2_70 = expr_65:int
                
                do {
                    var_2_70 = add:int(var_2_70:int, ldc:int(-1))
                    expr_7A = xor:byte(loadelement:byte(expr_5E:byte[], var_2_70:int), ldc:byte(97))
                    storeelement:byte(var_1_6F:byte[], var_2_70:int, or:int(and:int(shl:int(expr_7A:byte, ldc:int(4)), ldc:int(-16)), and:int(shr:int(expr_7A:byte[expected:int], ldc:int(4)), ldc:int(15))))
                } while (cmpne:boolean(var_2_70:int, ldc:int(0)))
                
                stack_99_0 = stack_96_0 = stack_AB_0 = stack_CB_0 = stack_CE_0 = stack_E0_0 = stack_106_0 = stack_109_0 = stack_11B_0 = stack_12C_0 = var_1_6F:byte[]
            }
            
            var_4_96 = stack_96_0:byte[]
            expr_9B = add:int(arraylength:int(stack_99_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9B:int, ldc:int(0))) {
                var_1_A3 = newarray:byte[](byte.class, expr_9B:int)
                var_2_A4 = expr_9B:int
                
                do {
                    var_2_A4 = add:int(var_2_A4:int, ldc:int(-1))
                    storeelement:byte(var_1_A3:byte[], var_2_A4:int, add:int(shl:int(loadelement:byte(stack_AB_0:byte[], var_2_A4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_4_96:byte[], add:int(var_2_A4:int, ldc:int(1))), ldc:int(5)), ldc:int(7))))
                } while (cmpne:boolean(var_2_A4:int, ldc:int(0)))
                
                stack_CE_0 = stack_CB_0 = stack_E0_0 = stack_106_0 = stack_109_0 = stack_11B_0 = stack_12C_0 = var_1_A3:byte[]
            }
            
            expr_CE = arraylength:int(stack_CE_0:byte[])
            
            if (cmpne:boolean(expr_CE:int, ldc:int(0))) {
                var_3_D4 = expr_CE:int
                var_1_D8 = newarray:byte[](byte.class, expr_CE:int)
                var_2_D9 = expr_CE:int
                
                do {
                    var_2_D9 = add:int(var_2_D9:int, ldc:int(-1))
                    expr_E0 = loadelement:byte(stack_E0_0:byte[], var_2_D9:int)
                    storeelement:byte(var_1_D8:byte[], var_2_D9:int, ternaryop:byte(cmplt:boolean(add:int(add:int(var_2_D9:int, ldc:int(4)), neg:int(var_3_D4:int)), ldc:int(0)), add:byte(expr_E0:byte, loadelement:byte(var_1_D8:byte[], add:int(var_2_D9:int, ldc:int(4)))), add:byte(expr_E0:byte, ldc:byte(4))))
                } while (cmpne:boolean(var_2_D9:int, ldc:int(0)))
                
                stack_109_0 = stack_106_0 = stack_11B_0 = stack_12C_0 = var_1_D8:byte[]
            }
            
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_1_113 = newarray:byte[](byte.class, expr_109:int)
                var_2_114 = expr_109:int
                
                do {
                    var_2_114 = add:int(var_2_114:int, ldc:int(-1))
                    storeelement:byte(var_1_113:byte[], var_2_114:int, add:byte(loadelement:byte(stack_11B_0:byte[], var_2_114:int), ldc:byte(83)))
                } while (cmpne:boolean(var_2_114:int, ldc:int(0)))
                
                stack_12C_0 = var_1_113:byte[]
            }
            
            var_1_138 = initobject:String(String::<init>, stack_12C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_13C = newarray:String[](Ljava.lang.String.class, ldc:int(177))
            expr_142 = initarray:String[](Ljava.lang.String[].class, invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(480), ldc:int(486)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(0), ldc:int(0)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1356), ldc:int(1372)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(197), ldc:int(215)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(331), ldc:int(333)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(373), ldc:int(392)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(509), ldc:int(526)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1434), ldc:int(1441)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1202), ldc:int(1214)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(927), ldc:int(946)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1389), ldc:int(1398)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(0), ldc:int(1)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(16), ldc:int(19)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(855), ldc:int(886)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(409), ldc:int(480)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1308), ldc:int(1316)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1144), ldc:int(1157)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1316), ldc:int(1342)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1468), ldc:int(1484)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1484), ldc:int(1512)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(329), ldc:int(331)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(217), ldc:int(228)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(64), ldc:int(113)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(113), ldc:int(171)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1009), ldc:int(1030)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1030), ldc:int(1059)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1059), ldc:int(1092)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1563), ldc:int(1610)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1441), ldc:int(1450)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1372), ldc:int(1389)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1214), ldc:int(1224)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1302), ldc:int(1308)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1191), ldc:int(1202)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(172), ldc:int(196)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(44), ldc:int(50)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(32), ldc:int(44)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(19), ldc:int(32)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(58), ldc:int(64)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1611), ldc:int(1615)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1297), ldc:int(1302)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(171), ldc:int(172)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1615), ldc:int(1619)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1610), ldc:int(1611)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1620), ldc:int(1622)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1092), ldc:int(1144)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1450), ldc:int(1464)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(946), ldc:int(957)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(637), ldc:int(660)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(333), ldc:int(347)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1290), ldc:int(1297)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(991), ldc:int(1005)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(228), ldc:int(229)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(685), ldc:int(716)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(772), ldc:int(792)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(792), ldc:int(820)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(716), ldc:int(772)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(820), ldc:int(855)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1408), ldc:int(1434)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(973), ldc:int(981)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(981), ldc:int(991)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1157), ldc:int(1191)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1398), ldc:int(1408)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(392), ldc:int(406)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(50), ldc:int(58)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1005), ldc:int(1009)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(957), ldc:int(973)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(358), ldc:int(373)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(347), ldc:int(358)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(886), ldc:int(893)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1512), ldc:int(1522)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(918), ldc:int(927)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1464), ldc:int(1468)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(486), ldc:int(509)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(893), ldc:int(905)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(905), ldc:int(918)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1342), ldc:int(1356)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(526), ldc:int(542)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(406), ldc:int(409)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1619), ldc:int(1620)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(293), ldc:int(329)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(229), ldc:int(293)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(215), ldc:int(217)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1), ldc:int(16)), defaultvalue:String(Ljava.lang.String.class), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(542), ldc:int(579)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(196), ldc:int(197)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1522), ldc:int(1560)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1224), ldc:int(1290)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1560), ldc:int(1563)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(660), ldc:int(685)), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(579), ldc:int(637)), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class), defaultvalue:String(Ljava.lang.String.class))
            storeelement:String(expr_13C:String[], ldc:int(175), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1622), ldc:int(1625)))
            storeelement:String(expr_142:String[], ldc:int(95), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1625), ldc:int(1636)))
            storeelement:String(expr_142:String[], ldc:int(15), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1636), ldc:int(1643)))
            storeelement:String(expr_142:String[], ldc:int(144), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1643), ldc:int(1646)))
            storeelement:String(expr_142:String[], ldc:int(61), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1646), ldc:int(1650)))
            storeelement:String(expr_142:String[], ldc:int(47), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1650), ldc:int(1665)))
            storeelement:String(expr_142:String[], ldc:int(1), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1665), ldc:int(1671)))
            storeelement:String(expr_142:String[], ldc:int(53), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1671), ldc:int(1681)))
            storeelement:String(expr_142:String[], ldc:int(34), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1681), ldc:int(1699)))
            storeelement:String(expr_142:String[], ldc:int(113), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1699), ldc:int(1714)))
            storeelement:String(expr_142:String[], ldc:int(38), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1714), ldc:int(1720)))
            storeelement:String(expr_142:String[], ldc:int(37), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1720), ldc:int(1733)))
            storeelement:String(expr_142:String[], ldc:int(140), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1733), ldc:int(1747)))
            storeelement:String(expr_13C:String[], ldc:int(173), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1747), ldc:int(1754)))
            storeelement:String(expr_142:String[], ldc:int(57), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1754), ldc:int(1761)))
            storeelement:String(expr_142:String[], ldc:int(135), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1761), ldc:int(1778)))
            storeelement:String(expr_142:String[], ldc:int(136), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1778), ldc:int(1790)))
            storeelement:String(expr_142:String[], ldc:int(142), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1790), ldc:int(1795)))
            storeelement:String(expr_142:String[], ldc:int(145), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1795), ldc:int(1805)))
            storeelement:String(expr_142:String[], ldc:int(114), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1805), ldc:int(1815)))
            storeelement:String(expr_142:String[], ldc:int(133), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1815), ldc:int(1818)))
            storeelement:String(expr_142:String[], ldc:int(60), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1818), ldc:int(1824)))
            storeelement:String(expr_142:String[], ldc:int(65), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1824), ldc:int(1833)))
            storeelement:String(expr_142:String[], ldc:int(137), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1833), ldc:int(1843)))
            storeelement:String(expr_142:String[], ldc:int(82), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1843), ldc:int(1851)))
            storeelement:String(expr_142:String[], ldc:int(58), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1851), ldc:int(1863)))
            storeelement:String(expr_142:String[], ldc:int(81), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1863), ldc:int(1866)))
            storeelement:String(expr_142:String[], ldc:int(153), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1866), ldc:int(1877)))
            storeelement:String(expr_142:String[], ldc:int(160), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1877), ldc:int(1926)))
            storeelement:String(expr_142:String[], ldc:int(10), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1926), ldc:int(1946)))
            storeelement:String(expr_142:String[], ldc:int(11), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1946), ldc:int(1966)))
            storeelement:String(expr_142:String[], ldc:int(67), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1966), ldc:int(1969)))
            storeelement:String(expr_142:String[], ldc:int(7), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1969), ldc:int(1981)))
            storeelement:String(expr_142:String[], ldc:int(98), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1981), ldc:int(1989)))
            storeelement:String(expr_142:String[], ldc:int(141), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1989), ldc:int(1997)))
            storeelement:String(expr_142:String[], ldc:int(87), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(1997), ldc:int(2002)))
            storeelement:String(expr_142:String[], ldc:int(86), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2002), ldc:int(2015)))
            storeelement:String(expr_142:String[], ldc:int(143), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2015), ldc:int(2021)))
            storeelement:String(expr_142:String[], ldc:int(71), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2021), ldc:int(2037)))
            storeelement:String(expr_142:String[], ldc:int(148), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2037), ldc:int(2042)))
            storeelement:String(expr_142:String[], ldc:int(156), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2042), ldc:int(2053)))
            storeelement:String(expr_13C:String[], ldc:int(176), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2053), ldc:int(2097)))
            storeelement:String(expr_142:String[], ldc:int(35), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2097), ldc:int(2104)))
            storeelement:String(expr_142:String[], ldc:int(157), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2104), ldc:int(2115)))
            storeelement:String(expr_142:String[], ldc:int(96), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2115), ldc:int(2124)))
            storeelement:String(expr_142:String[], ldc:int(97), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2124), ldc:int(2141)))
            storeelement:String(expr_142:String[], ldc:int(155), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2141), ldc:int(2152)))
            storeelement:String(expr_142:String[], ldc:int(56), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2152), ldc:int(2158)))
            storeelement:String(expr_142:String[], ldc:int(172), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2158), ldc:int(2180)))
            storeelement:String(expr_142:String[], ldc:int(149), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2180), ldc:int(2194)))
            storeelement:String(expr_142:String[], ldc:int(151), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2194), ldc:int(2208)))
            storeelement:String(expr_142:String[], ldc:int(3), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2208), ldc:int(2212)))
            storeelement:String(expr_142:String[], ldc:int(139), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2212), ldc:int(2220)))
            storeelement:String(expr_142:String[], ldc:int(14), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2220), ldc:int(2225)))
            storeelement:String(expr_142:String[], ldc:int(51), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2225), ldc:int(2245)))
            storeelement:String(expr_142:String[], ldc:int(109), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2245), ldc:int(2282)))
            storeelement:String(expr_142:String[], ldc:int(111), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2282), ldc:int(2321)))
            storeelement:String(expr_142:String[], ldc:int(110), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2321), ldc:int(2357)))
            storeelement:String(expr_142:String[], ldc:int(112), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2357), ldc:int(2395)))
            storeelement:String(expr_142:String[], ldc:int(4), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2395), ldc:int(2416)))
            storeelement:String(expr_142:String[], ldc:int(154), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2416), ldc:int(2428)))
            storeelement:String(expr_142:String[], ldc:int(13), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2428), ldc:int(2433)))
            storeelement:String(expr_142:String[], ldc:int(152), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2433), ldc:int(2448)))
            storeelement:String(expr_142:String[], ldc:int(90), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2448), ldc:int(2466)))
            storeelement:String(expr_142:String[], ldc:int(55), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2466), ldc:int(2471)))
            storeelement:String(expr_142:String[], ldc:int(159), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2471), ldc:int(2476)))
            storeelement:String(expr_142:String[], ldc:int(146), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2476), ldc:int(2485)))
            storeelement:String(expr_142:String[], ldc:int(33), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2485), ldc:int(2504)))
            storeelement:String(expr_142:String[], ldc:int(83), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2504), ldc:int(2512)))
            storeelement:String(expr_142:String[], ldc:int(52), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2512), ldc:int(2516)))
            storeelement:String(expr_142:String[], ldc:int(25), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2516), ldc:int(2537)))
            storeelement:String(expr_142:String[], ldc:int(24), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2537), ldc:int(2560)))
            storeelement:String(expr_142:String[], ldc:int(23), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2560), ldc:int(2584)))
            storeelement:String(expr_142:String[], ldc:int(22), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2584), ldc:int(2602)))
            storeelement:String(expr_142:String[], ldc:int(59), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2602), ldc:int(2608)))
            storeelement:String(expr_142:String[], ldc:int(147), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2608), ldc:int(2613)))
            storeelement:String(expr_142:String[], ldc:int(89), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2613), ldc:int(2652)))
            storeelement:String(expr_142:String[], ldc:int(88), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2652), ldc:int(2685)))
            storeelement:String(expr_13C:String[], ldc:int(174), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2685), ldc:int(2692)))
            storeelement:String(expr_142:String[], ldc:int(72), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2692), ldc:int(2703)))
            storeelement:String(expr_142:String[], ldc:int(62), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2703), ldc:int(2716)))
            storeelement:String(expr_142:String[], ldc:int(164), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2716), ldc:int(2723)))
            storeelement:String(expr_142:String[], ldc:int(134), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2723), ldc:int(2736)))
            storeelement:String(expr_142:String[], ldc:int(108), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2736), ldc:int(2749)))
            storeelement:String(expr_142:String[], ldc:int(138), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2749), ldc:int(2757)))
            storeelement:String(expr_142:String[], ldc:int(63), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2757), ldc:int(2762)))
            storeelement:String(expr_142:String[], ldc:int(39), invokevirtual:String[expected:String](String::substring, var_1_138:String, ldc:int(2762), ldc:int(2781)))
            putstatic:String[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u624e\ub171\ubb2b\ud51e\u4cd9\u72f1, expr_142:String[])
            var_1_BAF = expr_13C:String[]
            putstatic:Logger(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u97e6\ua6bd\u6198\u965f\u836c, invokestatic:Logger(LogManager::getLogger))
            putstatic:boolean(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u7006\u8709\u5140\u7330\u9937, cmpeq:boolean(invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), getstatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\u983f\u527a\uc31c\u76bc\u839e\u4ab3)))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u8d98\u4daf\u3776\ua562\ubefe\ub19c, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_BAF:String[], ldc:int(173))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ub19c\u8308\u927d\u7e3f\u67d0\u4975, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_BAF:String[], ldc:int(174))))
            putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u527a\ud217\ub19c\ub113\ua61f\u5bc4, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_1_BAF:String[], ldc:int(175))))
            putstatic:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud158\u873d\u4492\u97e6\ufe34\u67d0, invokestatic:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(CompletableFuture<T>::completedFuture, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1)))
            putstatic:ITextComponent(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_1_BAF:String[], ldc:int(176))))
            putstatic:byte[](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u92ee\u4daf\u759a\ubded\ud217\u36d3, newarray:byte[](byte.class, ldc:int(10485760)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u3776\u52d3\u1833\u8753\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B : int
        var_4_71 : int
        var_5_7A : double
        var_7_81 : double
        var_9_9A : int
        var_10_A3 : double
        var_12_A7 : double
        var_14_AB : int
        var_9_143 : int
        var_9_197 : int
        var_15_118 : int
        
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
            
            if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
                invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            }
            else {
                var_3_6B = ldc:int(0)
                var_4_71 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
                var_5_7A = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), ldc:int(0))
                invokestatic:int(m::a)
                
                loop {
                    var_7_81 = ldc:double(0.0)
                    
                    if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_9_9A = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_3_6B:int), ldc:int(1))
                        var_10_A3 = var_12_A7 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_3_6B)
                        
                        if (cmplt:boolean(var_14_AB = var_9_9A:int, var_4_71:int)) {
                            var_7_81 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_9_9A:int)
                            var_14_AB = var_9_9A:int
                            var_12_A7 = var_10_A3:double
                        }
                    }
                    else {
                        var_7_81 = sub:double(var_5_7A:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                        var_9_143 = var_3_6B:int
                        
                        while (logicaland:boolean(cmplt:boolean(var_9_143:int, sub:int(var_4_71:int, ldc:int(1))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_9_143:int, ldc:int(1))), var_5_7A:double))) {
                            inc:int(var_9_143, ldc:int(1))
                        }
                        
                        var_12_A7 = var_5_7A:double
                        var_14_AB = var_9_143:int
                    }
                    
                    if (cmplt:boolean(var_14_AB:int, var_4_71:int)) {
                        if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                            if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                                var_12_A7 = var_7_81:double
                            }
                            else {
                                var_12_A7 = mul:double(ldc:double(0.5), add:double(var_7_81:double, var_12_A7:double))
                            }
                        }
                        
                        if (logicaland:boolean(cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b)), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_3_6B:int), var_5_7A:double))) {
                            var_9_197 = ldc:int(1)
                        }
                        else {
                            var_9_197 = ldc:int(0)
                        }
                        
                        if (logicalor:boolean(cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a)), cmpne:boolean(var_9_197:int, ldc:int(0)))) {
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_12_A7:double, var_3_6B:int, var_14_AB:int)
                        }
                        else {
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_12_A7:double, ldc:double(0.0))
                        }
                    }
                    else {
                        var_9_197 = ldc:int(0)
                    }
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_15_118 = var_3_6B:int
                        
                        if (cmpeq:boolean(var_9_197:int, ldc:int(0))) {
                            goto(Label_0293)
                        }
                    }
                    
                    var_15_118 = add:int(var_14_AB:int, ldc:int(1))
                    Label_0293:
                    
                    if (cmpgt:boolean(var_3_6B = var_15_118:int, sub:int(var_4_71:int, ldc:int(1)))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
