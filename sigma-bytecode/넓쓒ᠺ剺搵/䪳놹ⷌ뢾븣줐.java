public class \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 {
    public void \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u56bd\u392e\u7873\u7043\ud158\u9255 p0) {
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
    
    private boolean \ubff1\u9255\ubcb0\u8d98\u5d20\u0800(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_5F : int
        stack_B0_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(-1612633862), ldc:int(-1388675471))
            
            if (cmpeq:boolean(invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, invokestatic:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u392e\u7873\u7043\ud158\u9255::\u4ab3\ua068\u6b0d\u7af6\u71ae\ua6bd, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(10881), ldc:int(10885))), shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), xor:int(ldc:int(2083), ldc:int(2087))), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), and:int[expected:boolean](ldc:int(-5827), ldc:int(5826))), aconstnull:\u8aa5\ubded\ub18d\u4f4a\u4f52())) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1251967152))
                stack_B0_0 = and:int(ldc:int(-17777), ldc:int(17744))
            }
            else {
                stack_B0_0 = xor:int(ldc:int(20744), ldc:int(20745))
            }
            
            return:boolean(stack_B0_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3bd6\u4ab3\u3d4b\u4d85\u8753\ud36e() {
        var_1_ED : int
        stack_185_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_ED = and:int(ldc:int(-1192378277), ldc:int(-1132470867))
            
            if (cmple:boolean(invokestatic:double(Math::sqrt, invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), i2d:double(mul:int(getfield:int(\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3::\uf995\u59ec\ucef1\u5bc4\ub19c\ud36e, getfield:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc84e\u4c04\ubcb0\u0c95\ub8be\u5fe1, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))), ldc:int(16))))) {
                if (invokevirtual:boolean(\uc229\u760c\u873d\ub6ab\u7043::\u1187\u7049\u120d\u836c\u3a62, invokevirtual:\uc229\u760c\u873d\ub6ab\u7043(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4f52\ub1b9\u69d9\uc229\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(17408), ldc:int(17409)))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_ED:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0216)
                }
                
                if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_ED = and:int(var_1_ED:int, ldc:int(532539611))
                    
                    if (cmple:boolean(invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), ldc:double(576.0))) {
                        return:boolean(and:int[expected:boolean](ldc:int(17459), ldc:int(6985)))
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_ED = and:int(var_1_ED:int, ldc:int(1142059785))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_ED = and:int(var_1_ED:int, ldc:int(699734782))
                        loopcontinue()
                    }
                    
                    var_1_ED = and:int(var_1_ED:int, ldc:int(520086955))
                    
                    if (invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubff1\u9255\ubcb0\u8d98\u5d20\u0800, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))))) {
                        if (invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubff1\u9255\ubcb0\u8d98\u5d20\u0800, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))))) {
                            if (invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubff1\u9255\ubcb0\u8d98\u5d20\u0800, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))))) {
                                if (invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubff1\u9255\ubcb0\u8d98\u5d20\u0800, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))))) {
                                    stack_185_0 = and:int(ldc:int(8199), ldc:int(409))
                                    looporswitchbreak()
                                }
                            }
                        }
                    }
                }
                
                Label_0216:
                
                if (cmpeq:boolean(and:int(var_1_ED:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_1_ED:int, ldc:int(8)), ldc:int(0))) {
                    var_1_ED = and:int(var_1_ED:int, ldc:int(971829673))
                    stack_185_0 = and:int(ldc:int(5713), ldc:int(-5718))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_185_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucb79\uc2bd\u64f2\u8c8a\u8c8a\ufcaf(int p0) {
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
        
        if (cmpne:boolean(getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ub70c\uc84e\u9937\u759a\u385b\u0a06, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), p0:int)) {
            putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ub70c\uc84e\u9937\u759a\u385b\u0a06, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p0:int)
            return:boolean(xor:int[expected:boolean](ldc:int(5640), ldc:int(5641)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-31658), ldc:int(29353)))
    }
    
    public \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5654\u0800\ub1b9\ua562\u3e75\u8cae \u51b2\u34df\u6bb9\u7873\u8258\u97e6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(checkcast:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5654\u0800\ub1b9\ua562\u3e75\u8cae.class, invokeinterface:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u5654\u0800\ub1b9\ua562\u3e75\u8cae>::get, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u5654\u0800\ub1b9\ua562\u3e75\u8cae>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc7fe\u1187\u7c6b\u759a\uc9f6\u3d64, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), p0:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \uc229\uc910\ud4fe\u6bb9\u71ae\u8389(int p0, int p1, int p2) {
        var_4_63 : int
        var_6_139 : int
        var_4_B8 : int
        var_6_DD : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_7_E2 : int
        var_8_EB : int
        var_9_1AB : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_4_17E : int
        var_6_19D : int
        var_7_1FA : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910
        
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
        var_4_63 = and:int(ldc:int(-942585772), ldc:int(-1076991618))
        
        if (cmpeq:boolean(p0:int, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))) {
            if (cmpeq:boolean(p1:int, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))) {
                if (cmpeq:boolean(p2:int, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))) {
                    goto(Label_0273)
                }
            }
        }
        
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0273)
        }
        
        if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
            var_4_63 = and:int(var_4_63:int, ldc:int(-2017043497))
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud217\ua61f\ub32d\uc7fe\u3a62\u385b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), p0:int, p1:int, p2:int)
            
            if (getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3711\u839e\u3a62\ubff1\ub102\u7e3f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)) {
                var_6_139 = ldc:int(8)
                putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u446c\uc7fe\u5d20\ube23\u4bc8\ud51e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, shl:int(shr:int(p0:int, var_6_139:int), var_6_139:int))
                putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8753\ud523\u6cfe\u0c95\u946b\u385b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, shl:int(shr:int(p2:int, var_6_139:int), var_6_139:int))
                putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, sub:int(p0:int, getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u446c\uc7fe\u5d20\ube23\u4bc8\ud51e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
                putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8350\u071d\ua61f\u5140\u2dcc\u3e2a, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:int)
                putfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u12b2\u8df4\u156b\uc9f6\u51fa\u97e6, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, sub:int(p2:int, getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8753\ud523\u6cfe\u0c95\u946b\u385b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
            }
        }
        
        Label_0160:
        
        if (cmpne:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_4_B8 = and:int(var_4_63:int, ldc:int(-1912780044))
            putfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f4a\u8d90\u8753\u59ec\u56bd\uc238, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, i2d:double(p0:int), i2d:double(p1:int), i2d:double(p2:int), i2d:double(add:int(p0:int, ldc:int(16))), i2d:double(add:int(p1:int, ldc:int(16))), i2d:double(add:int(p2:int, ldc:int(16)))))
            var_6_DD = getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)
            var_7_E2 = arraylength:int(var_6_DD:\u760c\u4975\u4179\uc246\u8640\u64f2[])
            var_8_EB = and:int(ldc:int(-6855), ldc:int(6722))
            
            while (cmplt:boolean(var_8_EB:int, var_7_E2:int)) {
                var_9_1AB = loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_6_DD:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_8_EB:int)
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, var_9_1AB:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>])), getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), var_9_1AB:\u760c\u4975\u4179\uc246\u8640\u64f2, ldc:int(16))
                inc:int(var_8_EB, ldc:int(1))
            }
            
            var_4_17E = and:int(var_4_B8:int, ldc:int(-445677708))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(4490), ldc:int(-4523)))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(15213), ldc:int(-15214)))
            var_6_19D = and:int(ldc:int(-19570), ldc:int(19505))
            
            while (cmplt:boolean(var_6_19D:int, arraylength:int(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))) {
                var_7_1FA = loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_6_19D:int)
                
                if (cmpne:boolean(var_7_1FA:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910())) {
                    putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, var_7_1FA:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(-23417), ldc:int(23400)))
                }
                
                inc:int(var_6_19D, ldc:int(1))
            }
            
            var_4_63 = and:int(var_4_17E:int, ldc:int(-1915716268))
            putfield:\ud523\u92ff\ubb2b\u759a\ud36e(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubefe\u4e72\u6d99\uf995\u759a\uc84e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e())
            putfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435())
        }
        
        Label_0273:
        
        if (cmpne:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0160)
        }
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public double \ud523\u92ff\u7bad\u7330\u16f6\u760c() {
        var_3_6B : \u836c\u8cae\ub18d\u836c\u8753\u59ec
        var_4_7F : double
        var_6_94 : double
        var_8_A9 : double
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_6B = invokevirtual:\u836c\u8cae\ub18d\u836c\u8753\u59ec(\u67e9\u8413\ub113\u4bc8\u6c52\uceb8::\u6fb0\ud217\u34df\u6b5f\uc31c\ubf56, getfield:\u67e9\u8413\ub113\u4bc8\u6c52\uceb8(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u7af6\u6b0d\ub70c\u76bc\ucfaf\u4cd9, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))
            var_4_7F = sub:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f4a\u8d90\u8753\u59ec\u56bd\uc238, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), ldc:double(8.0)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_3_6B:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
            var_6_94 = sub:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f4a\u8d90\u8753\u59ec\u56bd\uc238, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), ldc:double(8.0)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_3_6B:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
            var_8_A9 = sub:double(add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f4a\u8d90\u8753\u59ec\u56bd\uc238, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), ldc:double(8.0)), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u836c\u8cae\ub18d\u836c\u8753\u59ec::\u8308\ub171\u6b5f\u16f6\u4cd9\ua562, var_3_6B:\u836c\u8cae\ub18d\u836c\u8753\u59ec)))
            return:double(add:double(add:double(mul:double(var_4_7F:double, var_4_7F:double), mul:double(var_6_94:double, var_6_94:double)), mul:double(var_8_A9:double, var_8_A9:double)))
        }
        
        goto(Label_0006)
    }
    
    private void \u3776\u946b\u64f2\uae5d\u718f\u67d0(\u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, p0:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u5654\u6d69\u7006\u92ee\u5bc4\u071d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf \u4d85\u8c8a\uc2e8\u34df\u62da\u6ec6() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(checkcast:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf.class, invokevirtual:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(AtomicReference<\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf>::get, getfield:AtomicReference<\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u16f6\u3c25\ud171\ub32d\ub6ab\ub171, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))))
        }
        
        goto(Label_0006)
    }
    
    private void \ud217\ua61f\ub32d\uc7fe\u3a62\u385b() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3d4b\u6198\u960f\u7049\ud51e\uf94d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            invokevirtual:void(AtomicReference<\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf>::set, getfield:AtomicReference<\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u16f6\u3c25\ud171\ub32d\ub6ab\ub171, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), getstatic:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u5245\u527a\uc2bd\ubff1\u6435\ubcb0))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(10033), ldc:int(4109)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc910\u760c\uc229\u6bb9\u98a4\u4ab3() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud217\ua61f\ub32d\uc7fe\u3a62\u385b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\u5654\u0800\ub1b9\ua562\u3e75\u8cae>[expected:Iterable<Object>](Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u5654\u0800\ub1b9\ua562\u3e75\u8cae>::values, getfield:Map<\uf995\u4975\u1187\ubff1\u839e\u8389, \u5654\u0800\ub1b9\ua562\u3e75\u8cae>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc7fe\u1187\u7c6b\u759a\uc9f6\u3d64, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public void \ud12e\uc229\u4179\ud36e\u7049\u4ab3(boolean p0) {
        var_2_61 : int
        var_4_66 : boolean
        stack_A9_1 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(524444188), ldc:int(1607984989))
            var_4_66 = getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(16445), ldc:int(5825)))
            
            if (logicaland:boolean(var_4_66:boolean, getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                stack_A9_1 = and:int(ldc:int(9), ldc:int(24657))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(486489082))
                stack_A9_1 = and:int(ldc:int(-3733), ldc:int(3732))
            }
            
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, or:boolean(p0:boolean, stack_A9_1:boolean))
            
            if (invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8bb0\ubf56\ub7dc\ubefe\u6cfe\u4ab3, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)) {
                putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8c8a\u4179\u416d\u64f2\u2dcc\u3776, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, xor:int[expected:boolean](ldc:int(519), ldc:int(518)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\u3bd6\u51b2\u9a18\u4f4a\u392e() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(-21727), ldc:int(21706)))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(17041), ldc:int(-17046)))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8c8a\u4179\u416d\u64f2\u2dcc\u3776, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(25174), ldc:int(-29399)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u12b2\u873d\u527a\u5d20\u61a4\u4bc8() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7049\u8df4\u40a9\u6c52\uc910\uc84e() {
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
            var_1_61 = and:int(ldc:int(-2109249825), ldc:int(-498372918))
            
            if (logicaland:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8258\u7af6\ubb2b\u6198\u6fb0\u9a18, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u5245\u12cb\u7c6b\u72f1\uc4d2\u71f1, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                stack_98_0 = and:int(ldc:int(65), ldc:int(5673))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(668956648))
                stack_98_0 = and:int(ldc:int(7465), ldc:int(-15662))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u3776\u3c25\u647c\u946b\u16f6\u6ec6(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(loadelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3e75\ud171\u7bad\u3776\u36d3\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>])))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7d52\u446c\u3c25\uc2e8\u4daf\uae87(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u56bd\u392e\u7873\u7043\ud158\u9255 p1) {
        var_3_DF : int
        var_5_66 : \u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_DF = and:int(ldc:int(-799268718), ldc:int(-600879329))
            var_5_66 = invokevirtual:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4d85\u8c8a\uc2e8\u34df\u62da\u6ec6, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            
            if (cmpne:boolean(getfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), aconstnull:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa())) {
                invokevirtual:void(\ubefe\ud523\u927d\ud7e8\uc87f\u51fa::\u416d\u97e6\u8bb0\u47c2\u8bb0\u4bc8, getfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_DF:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0184)
                }
                
                if (cmpne:boolean(and:int(var_3_DF:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_DF = and:int(var_3_DF:int, ldc:int(-481894221))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Set::contains, invokestatic:Set(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u62da\u88c5\u494c\u16f6\ucb79\u7bad, var_5_66:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf), p0:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:Object]))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-32363), ldc:int(15946)))
                    }
                }
                
                Label_0147:
                
                if (cmpne:boolean(and:int(var_3_DF:int, ldc:int(536870912)), ldc:int(0))) {
                    var_3_DF = and:int(var_3_DF:int, ldc:int(1267432488))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_DF:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_DF = and:int(var_3_DF:int, ldc:int(-156998214))
                    
                    if (invokestatic:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u8350\u4e72\u3d4b\uc246\u839e\u92ff)) {
                        putfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\ubefe\ud523\u927d\ud7e8\uc87f\u51fa::<init>, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_66:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf))
                        looporswitchbreak()
                    }
                }
                
                Label_0184:
                
                if (cmpne:boolean(and:int(var_3_DF:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_DF = and:int(var_3_DF:int, ldc:int(1498154101))
                    goto(Label_0147)
                }
                
                if (cmpeq:boolean(and:int(var_3_DF:int, ldc:int(65536)), ldc:int(0))) {
                    var_3_DF = and:int(var_3_DF:int, ldc:int(-862184778))
                    putfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\ubefe\ud523\u927d\ud7e8\uc87f\u51fa::<init>, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_66:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf))
                    looporswitchbreak()
                }
                
                var_3_DF = and:int(var_3_DF:int, ldc:int(-2120633160))
            }
            
            invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u3dd3\u7330\u3e75\u836c\ufcaf\u9255, p1:\u56bd\u392e\u7873\u7043\ud158\u9255, getfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa[expected:\u88c5\u4179\u56bd\ua61f\u4975\u6ec6](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            return:boolean(and:int[expected:boolean](ldc:int(9), ldc:int(1765)))
        }
        
        goto(Label_0006)
    }
    
    public void \u3d4b\u6198\u960f\u7049\ud51e\uf94d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (cmpne:boolean(getfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), aconstnull:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9())) {
                invokevirtual:void(\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9::\u416d\u97e6\u8bb0\u47c2\u8bb0\u4bc8, getfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
                putfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9())
            }
            
            if (cmpne:boolean(getfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), aconstnull:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa())) {
                invokevirtual:void(\ubefe\ud523\u927d\ud7e8\uc87f\u51fa::\u416d\u97e6\u8bb0\u47c2\u8bb0\u4bc8, getfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
                putfield:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u839e\u67d0\u71f1\u4c2b\u3dd3\u156b, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, aconstnull:\ubefe\ud523\u927d\ud7e8\uc87f\u51fa())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u88c5\u4179\u56bd\ua61f\u4975\u6ec6 \u8389\u64f2\u3a62\u3e2a\uc4d2\u4bc8() {
        var_5_78 : \u4492\ua6bd\u071d\uc238\u52d3\u69d9
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3d4b\u6198\u960f\u7049\ud51e\uf94d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            var_5_78 = aconstnull:\u4492\ua6bd\u071d\uc238\u52d3\u69d9()
            
            if (logicalnot:boolean(invokestatic:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u8350\u4e72\u3d4b\uc246\u839e\u92ff))) {
                putfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9::<init>, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_78:\u4492\ua6bd\u071d\uc238\u52d3\u69d9))
            }
            else {
                putfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9(\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9::<init>, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), invokevirtual:double(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud523\u92ff\u7bad\u7330\u16f6\u760c, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_78:\u4492\ua6bd\u071d\uc238\u52d3\u69d9))
            }
            
            return:\u88c5\u4179\u56bd\ua61f\u4975\u6ec6(getfield:\u3e75\u9033\u67d0\ua068\u4c2b\u3bc9[expected:\u88c5\u4179\u56bd\ua61f\u4975\u6ec6](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8df4\ubff1\u8df4\u12cb\u6c52\u5bc4, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public void \u5db4\ub8be\ud158\uf9c5\ud217\u983f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u56bd\u392e\u7873\u7043\ud158\u9255 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u56bd\u392e\u7873\u7043\ud158\u9255::\u3dd3\u7330\u3e75\u836c\ufcaf\u9255, p0:\u56bd\u392e\u7873\u7043\ud158\u9255, invokevirtual:\u88c5\u4179\u56bd\ua61f\u4975\u6ec6(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8389\u64f2\u3a62\u3e2a\uc4d2\u4bc8, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3711\u6cfe\u9a18\u34df\ub83f\u8df4(java.util.Set<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1> p0) {
        var_4_66 : HashSet
        var_5_6F : HashSet
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_66 = invokestatic:HashSet(Sets::newHashSet, p0:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Iterable])
            var_5_6F = invokestatic:HashSet(Sets::newHashSet, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Iterable](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            invokeinterface:boolean(Set::removeAll, var_4_66:HashSet[expected:Set<E>], getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<?>](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            invokeinterface:boolean(Set::removeAll, var_5_6F:HashSet[expected:Set<E>], p0:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<?>])
            invokeinterface:void(Set<E>::clear, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            invokeinterface:boolean(Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::addAll, getfield:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), p0:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<? extends \ub83f\uc9f6\u47c2\u67d0\u7ce1>])
            invokevirtual:void(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\u839e\u71ae\u5bc4\uae5d\u0b8e\u7043, invokestatic:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u56bd\u392e\u7873\u7043\ud158\u9255::\ub32d\uae87\u7006\ua3b4\u8389\u92ee, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), var_5_6F:HashSet<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>], var_4_66:HashSet<\ub83f\uc9f6\u47c2\u67d0\u7ce1>[expected:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucb79\u56bd\u759a\u8350\u3dd3\uc910() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:CompletableFuture<\ua068\u36d3\uc4d2\u3776\uceb8\u8d98>(\u88c5\u4179\u56bd\ua61f\u4975\u6ec6::\ub171\ufe34\u69d9\u4cd9\uf9c5\u5d20, invokevirtual:\u88c5\u4179\u56bd\ua61f\u4975\u6ec6(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8389\u64f2\u3a62\u3e2a\uc4d2\u4bc8, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokestatic:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d(\u56bd\u392e\u7873\u7043\ud158\u9255::\uc246\u3dd3\u760c\u8d98\u3a62\u600f, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8bb0\ubf56\ub7dc\ubefe\u6cfe\u4ab3() {
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
        
        if (logicalnot:boolean(instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, invokestatic:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u392e\u7873\u7043\ud158\u9255::\u4ab3\ua068\u6b0d\u7af6\u71ae\ua6bd, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))))) {
            return:boolean(and:int[expected:boolean](ldc:int(-26698), ldc:int(26633)))
        }
        
        return:boolean(invokevirtual:boolean(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\ubb2b\u927d\u51b2\u7330\u76bc\u3504, checkcast:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255.class, invokestatic:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255](\u56bd\u392e\u7873\u7043\ud158\u9255::\u4ab3\ua068\u6b0d\u7af6\u71ae\ua6bd, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))))
    }
    
    public boolean \uff55\ud171\u8d90\u9033\ub32d\ucef1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8c8a\u4179\u416d\u64f2\u2dcc\u3776, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] \u759a\ucef1\ubcb0\ubcb0\u7e3f\u3bc9(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] p1) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\ubded\u183a\ua61f\u4cd9\ub102\u98a4))) {
            storeelement:\uf995\u4975\u1187\ubff1\u839e\u8389(p1:\uf995\u4975\u1187\ubff1\u839e\u8389[], and:int(ldc:int(-69), ldc:int(68)), invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u3bc9\ucfaf\u718f\u0800\u960f\u3a62::\u6fb0\ub8be\u3711\uc3e3\ucb79\u7ce1, p0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7))
            return:\uf995\u4975\u1187\ubff1\u839e\u8389[](p1:\uf995\u4975\u1187\ubff1\u839e\u8389[])
        }
        
        return:\uf995\u4975\u1187\ubff1\u839e\u8389[](getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389[](\u56bd\u392e\u7873\u7043\ud158\u9255::\u385b\u3a62\ube23\u8350\u6435\u4daf))
    }
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] \u69d9\u7e3f\u6b0d\ud523\u6198\u0800(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] p1) {
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u56bd\u392e\u7873\u7043\ud158\u9255::\u516c\u56bd\u6bb9\u59ec\u759a\u4c04))) {
            storeelement:\uf995\u4975\u1187\ubff1\u839e\u8389(p1:\uf995\u4975\u1187\ubff1\u839e\u8389[], and:int(ldc:int(-32718), ldc:int(20161)), invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u3bc9\ucfaf\u718f\u0800\u960f\u3a62::\u16f6\u3a62\u9033\u7c6b\u3a62\u8350, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
            return:\uf995\u4975\u1187\ubff1\u839e\u8389[](p1:\uf995\u4975\u1187\ubff1\u839e\u8389[])
        }
        
        return:\uf995\u4975\u1187\ubff1\u839e\u8389[](getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389[](\u56bd\u392e\u7873\u7043\ud158\u9255::\u385b\u3a62\ube23\u8350\u6435\u4daf))
    }
    
    private \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 \u983f\ucb79\u5d20\u4c2b\uafe7\u3c25(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p3) {
        var_5_7A : int
        var_7_15C : \uf995\u4975\u1187\ubff1\u839e\u8389
        var_7_191 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        
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
        var_5_7A = and:int(ldc:int(-1940907413), ldc:int(-1396371717))
        
        if (invokestatic:boolean(\u516c\uc3e3\u3c25\uc2e8\uff55\u64ab::\u7ce1\uc3e3\u5654\uff55\u74b1\u6d69)) {
            var_7_15C = invokestatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u516c\uc3e3\u3c25\uc2e8\uff55\u64ab::\u385b\uae5d\ube23\u8640\u67d0\u98a4, p0:\u718f\u6435\uc31c\u4ab3\u98a4, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (cmpne:boolean(var_7_15C:\uf995\u4975\u1187\ubff1\u839e\u8389, aconstnull:\uf995\u4975\u1187\ubff1\u839e\u8389())) {
                return:\uf995\u4975\u1187\ubff1\u839e\u8389(var_7_15C:\uf995\u4975\u1187\ubff1\u839e\u8389)
            }
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(2147483647)), ldc:int(0))) {
                var_5_7A = and:int(var_5_7A:int, ldc:int(-1538226742))
                goto(Label_0267)
            }
            
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0202)
            }
            
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                var_5_7A = and:int(var_5_7A:int, ldc:int(-1133060133))
                
                if (logicalnot:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8d90\u647c\u47c2\ud523\ub18d\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                    return:\uf995\u4975\u1187\ubff1\u839e\u8389(p3:\uf995\u4975\u1187\ubff1\u839e\u8389)
                }
            }
            
            Label_0160:
            
            if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0267)
            }
            
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_5_7A = and:int(var_5_7A:int, ldc:int(-327164193))
                
                if (getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8c8a\u69d9\u600f\uc87f\u40a9\ub6ab, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)) {
                    if (cmpne:boolean(p3:\uf995\u4975\u1187\ubff1\u839e\u8389, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uae87\ube23\u71f1\u6198\u156b\ud51e))) {
                        goto(Label_0267)
                    }
                    
                    var_7_191 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                    
                    if (instanceof:boolean(\u3504\ufe34\u600f\u6b0d\u69d9.\u8308\ube23\u4cd9\ucef1\uceb8\u98a4.class, var_7_191:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)) {
                        return:\uf995\u4975\u1187\ubff1\u839e\u8389(p3:\uf995\u4975\u1187\ubff1\u839e\u8389)
                    }
                    
                    if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u3d64\uc84e\u3a62\u5bc4\u3dd3\u92ff.class, var_7_191:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a))) {
                        return:\uf995\u4975\u1187\ubff1\u839e\u8389(getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uc238\ub113\u4f4a\u97b7\u7049\u98a4))
                    }
                    
                    return:\uf995\u4975\u1187\ubff1\u839e\u8389(p3:\uf995\u4975\u1187\ubff1\u839e\u8389)
                }
            }
            
            Label_0202:
            
            if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_7A = and:int(var_5_7A:int, ldc:int(-1717233643))
                    goto(Label_0160)
                }
                
                if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                    var_5_7A = and:int(var_5_7A:int, ldc:int(-1382196990))
                    loopcontinue()
                }
                
                var_5_7A = and:int(var_5_7A:int, ldc:int(-9352241))
                
                if (cmpeq:boolean(p3:\uf995\u4975\u1187\ubff1\u839e\u8389, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uc238\ub113\u4f4a\u97b7\u7049\u98a4))) {
                    return:\uf995\u4975\u1187\ubff1\u839e\u8389(getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uae87\ube23\u71f1\u6198\u156b\ud51e))
                }
            }
            
            Label_0267:
            
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(134217728)), ldc:int(0))) {
                var_5_7A = and:int(var_5_7A:int, ldc:int(658779529))
                goto(Label_0202)
            }
            
            if (cmpne:boolean(and:int(var_5_7A:int, ldc:int(65536)), ldc:int(0))) {
                var_5_7A = and:int(var_5_7A:int, ldc:int(1374009781))
                goto(Label_0160)
            }
            
            if (cmpeq:boolean(and:int(var_5_7A:int, ldc:int(536870912)), ldc:int(0))) {
                return:\uf995\u4975\u1187\ubff1\u839e\u8389(p3:\uf995\u4975\u1187\ubff1\u839e\u8389)
            }
            
            var_5_7A = and:int(var_5_7A:int, ldc:int(1996191539))
        }
    }
    
    private void \u4bc8\ud217\u8258\u8df4\u4179\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4bc8\u6198\uc9f6\u5245\u6435\ub32d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6cfe\u8aa5\u6d99\u4f52\ubff1\u8350, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uae87\ube23\u71f1\u6198\u156b\ud51e), p0:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d, p1:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf)
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6cfe\u8aa5\u6d99\u4f52\ubff1\u8350, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\uc238\ub113\u4f4a\u97b7\u7049\u98a4), p0:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d, p1:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf)
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6cfe\u8aa5\u6d99\u4f52\ubff1\u8350, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, getstatic:\uf995\u4975\u1187\ubff1\u839e\u8389(\u51fa\u7873\u9255\ua61f\u2dcc\u4bc8::\ud171\ubcb0\uae87\u62da\u9255\uc3e3), p0:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d, p1:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6cfe\u8aa5\u6d99\u4f52\ubff1\u8350(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4bc8\u6198\uc9f6\u5245\u6435\ub32d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf p2) {
        var_6_6A : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_6_6A = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\u4bc8\u6198\uc9f6\u5245\u6435\ub32d::\uc31c\u7330\u97b7\u6cfe\u3711\u52d3, p1:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d, p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
            
            if (invokevirtual:boolean(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua562\ud51e\u6ec6\u3504\u3e2a\ua6bd, var_6_6A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)) {
                invokevirtual:void(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\u4ab3\ub19c\u76bc\u97b7\u4c2b\u97b7, p2:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf, p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
                
                if (cmpgt:boolean(invokevirtual:int(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u1187\u8709\u6fb0\u97e6\u6fb0\u99f7, var_6_6A:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab), ldc:int(0))) {
                    invokevirtual:void(\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf::\ub32d\u4d85\u9af2\u9033\u0a06\ubefe, p2:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf, p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6 \u7af6\ud51e\ufcaf\ufcaf\u61a4\ud36e(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_69 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_75 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_69 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(-1), ldc:int(-1), ldc:int(-1))
            var_5_75 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(16), ldc:int(16), ldc:int(16))
            return:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6(initobject:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6(\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6::<init>, invokevirtual:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u0800\u8413\u4c2b\u7006\u3bc9\ud12e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, invokestatic:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u392e\u7873\u7043\ud158\u9255::\u4ab3\ua068\u6b0d\u7af6\u71ae\ua6bd, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), var_4_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_75:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int(ldc:int(1153), ldc:int(21299))), var_4_69:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_75:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int(ldc:int(40), ldc:int(41))))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4492\ua6bd\u071d\uc238\u52d3\u69d9 \u0800\u8413\u4c2b\u7006\u3bc9\ud12e(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(invokestatic:\u4492\ua6bd\u071d\uc238\u52d3\u69d9(\u4492\ua6bd\u071d\uc238\u52d3\u69d9::\u6b5f\uc4d2\u183a\u4e72\u392e\uc2bd, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:int, and:int[expected:boolean](ldc:int(-5058), ldc:int(5057))))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 \u93a2\u836c\ubded\ub32d\ud51e\u40a9(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1) {
        var_3_8B : int
        var_5_84 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_8B = and:int(ldc:int(751199487), ldc:int(-1135872261))
            
            if (logicalnot:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                var_5_84 = and:int(ldc:int(-20843), ldc:int(4458))
                
                loop {
                    var_3_8B = and:int(var_3_8B:int, ldc:int(1021732601))
                    
                    if (cmpge:boolean(var_5_84:int, arraylength:int(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7)))) {
                        looporswitchbreak()
                    }
                    
                    storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6435\uc87f\u6d69\u12cb\u7ce1\u3d64, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_84:int, invokevirtual:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\ucb79\u99f7\u4975\ud7e8\u64ab\u12b2, p0:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3776\u3c25\u647c\u946b\u16f6\u6ec6, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::\u3711\u0800\u59ec\ucfaf\uc31c\u97b7), var_5_84:int))))
                    inc:int(var_5_84, ldc:int(1))
                }
                
                var_3_8B = and:int(var_3_8B:int, ldc:int(-1446084867))
                putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ua6bd\u6ec6\ub1b9\u7873\u7873\ub83f, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(81), ldc:int(8873)))
            }
            
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6435\uc87f\u6d69\u12cb\u7ce1\u3d64, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, p1:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>])))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e \u960f\uf9c5\u3a62\u3e2a\u494c\u4cd9() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\ud523\u92ff\ubb2b\u759a\ud36e(invokespecial:\ud523\u92ff\ubb2b\u759a\ud36e(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u960f\uf9c5\u3a62\u3e2a\u494c\u4cd9, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
        }
        
        goto(Label_0006)
    }
    
    private \u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e \u960f\uf9c5\u3a62\u3e2a\u494c\u4cd9(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_66 : \ud523\u92ff\ubb2b\u759a\ud36e
        
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
        var_4_66 = getfield:\ud523\u92ff\ubb2b\u759a\ud36e(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubefe\u4e72\u6d99\uf995\u759a\uc84e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
        
        if (logicaland:boolean(cmpne:boolean(var_4_66:\ud523\u92ff\ubb2b\u759a\ud36e, aconstnull:\ud523\u92ff\ubb2b\u759a\ud36e()), invokestatic:boolean(\ubded\u56bd\u718f\u8bb0\u416d\ud523::\u7873\u516c\u7af6\uff55\u8308\u51fa, var_4_66:\ud523\u92ff\ubb2b\u759a\ud36e))) {
            return:\ud523\u92ff\ubb2b\u759a\ud36e(var_4_66:\ud523\u92ff\ubb2b\u759a\ud36e)
        }
        
        return:\ud523\u92ff\ubb2b\u759a\ud36e(putfield:\ud523\u92ff\ubb2b\u759a\ud36e(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ubefe\u4e72\u6d99\uf995\u759a\uc84e, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u67d0\u983f\u69d9\u6ec6\uc9f6, invokestatic:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u56bd\u392e\u7873\u7043\ud158\u9255::\u4ab3\ua068\u6b0d\u7af6\u71ae\ua6bd, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
    }
    
    public boolean \u61a4\u760c\uc238\uae87\ubff1\uae87() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u61a4\u760c\uc238\uae87\ubff1\uae87, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u61a4\u760c\uc238\uae87\ubff1\uae87(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_4_66 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_66 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
            return:boolean(invokevirtual:boolean(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u8d90\u647c\u47c2\ud523\ub18d\ufcaf, invokespecial:\ud523\u92ff\ubb2b\u759a\ud36e[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u960f\uf9c5\u3a62\u3e2a\u494c\u4cd9, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), var_4_66:int, add:int(var_4_66:int, ldc:int(15))))
        }
        
        goto(Label_0006)
    }
    
    public void \u7ce1\u120d\uff55\u9255\u6cfe\u4daf(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]), p1:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]), p1:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 \u62da\ucef1\u3a62\u071d\u9937\u7af6(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (logicalnot:boolean(getfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))) {
                invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ub8be\uc3e3\uc87f\ubf56\u5fe1\u0800, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            }
            
            return:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>])))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u61a4\u7873\u12b2\u760c\u67e9\u4492 \u8389\u6cfe\u69d9\u6b5f\u527a\ua61f() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u61a4\u7873\u12b2\u760c\u67e9\u4492(getfield:\u61a4\u7873\u12b2\u760c\u67e9\u4492(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u183a\u7af6\u36d3\uc9f6\u6bb9\u5245, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    private void \ub8be\uc3e3\uc87f\ubf56\u5fe1\u0800() {
        var_1_15F : int
        var_3_69 : int
        var_4_71 : int
        var_5_79 : int
        var_6_81 : int
        var_7_89 : int
        var_8_91 : int
        stack_126_0 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[] [generated]
        stack_D3_0 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[] [generated]
        stack_16F_0 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[] [generated]
        stack_126_1 : int [generated]
        stack_D3_1 : int [generated]
        stack_16F_1 : int [generated]
        stack_D3_2 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 [generated]
        stack_126_2 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 [generated]
        stack_16F_2 : \u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_15F = and:int(ldc:int(-1881541949), ldc:int(-807836941))
            var_3_69 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            var_4_71 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            var_5_79 = invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))
            var_6_81 = invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217))
            var_7_89 = invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u16f6\u8bb0\u59ec\ua61f\u62da\u7e3f))
            var_8_91 = invokevirtual:int(Enum<E>::ordinal, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc))
            stack_126_0 = stack_D3_0 = stack_16F_0 = getfield(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this)
            stack_126_1 = stack_D3_1 = stack_16F_1 = var_5_79
            
            if (cmpeq:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_79:int))), sub:int(var_4_71:int, ldc:int(16)))) {
                stack_D3_2 = loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_5_79:int)
                goto(Label_0211)
            }
            
            Label_0174:
            
            if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0321)
            }
            
            if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0239)
            }
            
            var_1_15F = and:int(var_1_15F:int, ldc:int(-642005287))
            stack_D3_2 = aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910()
            Label_0211:
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(stack_D3_0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[], stack_D3_1:int, stack_D3_2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            stack_126_0 = stack_D3_0 = stack_16F_0 = getfield(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this)
            stack_126_1 = stack_D3_1 = stack_16F_1 = var_6_81
            
            if (cmpeq:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_6_81:int))), add:int(var_4_71:int, ldc:int(16)))) {
                stack_126_2 = loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_6_81:int)
                goto(Label_0294)
            }
            
            Label_0239:
            
            if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_15F = and:int(var_1_15F:int, ldc:int(870364094))
                goto(Label_0321)
            }
            
            if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(8388608)), ldc:int(0))) {
                var_1_15F = and:int(var_1_15F:int, ldc:int(-2022223684))
                goto(Label_0174)
            }
            
            var_1_15F = and:int(var_1_15F:int, ldc:int(-339769643))
            stack_126_2 = aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910()
            Label_0294:
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(stack_126_0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[], stack_126_1:int, stack_126_2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            stack_126_0 = stack_D3_0 = stack_16F_0 = getfield(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this)
            stack_126_1 = stack_D3_1 = stack_16F_1 = var_7_89
            
            if (cmpeq:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_7_89:int))), sub:int(var_3_69:int, ldc:int(16)))) {
                stack_16F_2 = loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_7_89:int)
                goto(Label_0367)
            }
            
            Label_0321:
            
            if (cmpeq:boolean(and:int(var_1_15F:int, ldc:int(65536)), ldc:int(0))) {
                var_1_15F = and:int(var_1_15F:int, ldc:int(1410106903))
                goto(Label_0239)
            }
            
            if (cmpne:boolean(and:int(var_1_15F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            var_1_15F = and:int(var_1_15F:int, ldc:int(-6463529))
            stack_16F_2 = aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910()
            Label_0367:
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(stack_16F_0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[], stack_16F_1:int, stack_16F_2:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
            storeelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u34df\u983f\u647c\ufcaf\ub102\u3e2a, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_8_91:int, ternaryop:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(cmpne:boolean(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_8_91:int))), add:int(var_3_69:int, ldc:int(16))), aconstnull:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(), loadelement:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u6c56\u5db4\u9937\u3bc9\u647c\ufcaf, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), var_8_91:int)))
            putfield:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc84e\u2dcc\u92ff\ubb2b\u4492\ubf56, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, and:int[expected:boolean](ldc:int(10423), ldc:int(513)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub19c\ua6bd\u516c\u71ae\ud36e\u9255(\u5d20\u97b7\u8753\u873d\u16f6.\ub70c\u8df4\ud523\u927d\u6fb0\u4c04 p0, int p1) {
        var_3_61 : int
        stack_92_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(-1891335151), ldc:int(-537407183))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435::\u93a2\ua068\u93a2\u3bd6\u600f\u93a2, invokevirtual:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u494c\u40a9\u624e\u385b\u7d52\u5654, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), p0:\ub70c\u8df4\ud523\u927d\u6fb0\u4c04, p1:int))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1090137538))
                stack_92_0 = invokeinterface:boolean[expected:int](\ub70c\u8df4\ud523\u927d\u6fb0\u4c04::\ua3b4\u927d\u71f1\u839e\u51b2\u4f4a, p0:\ub70c\u8df4\ud523\u927d\u6fb0\u4c04, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f4a\u8d90\u8753\u59ec\u56bd\uc238, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
            }
            else {
                stack_92_0 = and:int(ldc:int(14593), ldc:int(537))
            }
            
            return:boolean(stack_92_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435 \u494c\u40a9\u624e\u385b\u7d52\u5654() {
        var_1_C2 : int
        var_3_7C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_4_81 : int
        var_5_87 : int
        var_6_8D : int
        var_7_96 : int
        var_8_A0 : int
        var_9_AA : int
        var_10_B4 : int
        var_11_DD : \u51b2\u93a2\u88c5\u67d0\u5bc4\u6435
        var_11_16B : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_C2 = and:int(ldc:int(-2137562855), ldc:int(350217895))
            
            if (cmpeq:boolean(getfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), aconstnull:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435())) {
                var_3_7C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)
                var_4_81 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_3_7C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                var_5_87 = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_3_7C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                var_6_8D = invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_3_7C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                var_7_96 = xor:int(ldc:int(5254), ldc:int(5251))
                var_8_A0 = shl:int(shr:int(var_4_81:int, var_7_96:int), var_7_96:int)
                var_9_AA = shl:int(shr:int(var_5_87:int, var_7_96:int), var_7_96:int)
                var_10_B4 = shl:int(shr:int(var_6_8D:int, var_7_96:int), var_7_96:int)
                
                if (cmpeq:boolean(var_8_A0:int, var_4_81:int)) {
                    if (cmpeq:boolean(var_9_AA:int, var_5_87:int)) {
                        if (cmpeq:boolean(var_10_B4:int, var_6_8D:int)) {
                            goto(Label_0228)
                        }
                    }
                }
                
                var_1_C2 = and:int(var_1_C2:int, ldc:int(1536679701))
                var_11_DD = invokevirtual:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u494c\u40a9\u624e\u385b\u7d52\u5654, invokevirtual:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910(\u9937\u7d52\u3e75\u98a4\u8aa5\u7006::\ua6bd\uc229\u52d3\ub1b9\uc87f\u8aa5, invokestatic:\u9937\u7d52\u3e75\u98a4\u8aa5\u7006(\u56bd\u392e\u7873\u7043\ud158\u9255::\ub32d\uae87\u7006\ua3b4\u8389\u92ee, getfield:\u56bd\u392e\u7873\u7043\ud158\u9255(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc229\ubb2b\u62da\uc29a\u8753\u9255, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_8_A0:int, var_9_AA:int, var_10_B4:int)))
                
                if (cmpne:boolean(var_11_DD:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435, aconstnull:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435())) {
                    if (cmpeq:boolean(getfield:double(\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, var_11_DD:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435), i2d:double(var_8_A0:int))) {
                        if (cmpeq:boolean(getfield:double(\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, var_11_DD:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435), i2d:double(var_9_AA:int))) {
                            if (cmpeq:boolean(getfield:double(\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, var_11_DD:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435), i2d:double(var_10_B4:int))) {
                                putfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, var_11_DD:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435)
                            }
                        }
                    }
                }
                
                Label_0228:
                var_1_C2 = and:int(var_1_C2:int, ldc:int(-555788853))
                
                if (cmpeq:boolean(getfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910), aconstnull:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435())) {
                    var_11_16B = shl:int(xor:int(ldc:int(2628), ldc:int(2629)), var_7_96:int)
                    putfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, initobject:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435::<init>, i2d:double(var_8_A0:int), i2d:double(var_9_AA:int), i2d:double(var_10_B4:int), i2d:double(add:int(var_8_A0:int, var_11_16B:int)), i2d:double(add:int(var_9_AA:int, var_11_16B:int)), i2d:double(add:int(var_10_B4:int, var_11_16B:int))))
                }
            }
            
            return:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(getfield:\u51b2\u93a2\u88c5\u67d0\u5bc4\u6435(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\uc2e8\uc2e8\u8d90\ub8be\u3d4b\u4975, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20), and:int(ldc:int(-26632), ldc:int(26631)))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), loadelement:String(getstatic:String[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20), xor:int(ldc:int(18444), ldc:int(18445)))), getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ub70c\uc84e\u9937\u759a\u385b\u0a06, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub113\u946b\u3a62\u74b1\u8aa5\u120d$2(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[] p0) {
        var_1_61 : int
        var_3_69 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-959364084), ldc:int(-875514642))
            var_3_69 = and:int(ldc:int(-10923), ldc:int(10410))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-713698817))
                
                if (cmpge:boolean(var_3_69:int, arraylength:int(p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[]))) {
                    looporswitchbreak()
                }
                
                storeelement:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(p0:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[], var_3_69:int, initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>))
                inc:int(var_3_69, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5654\u0800\ub1b9\ua562\u3e75\u8cae lambda$\u64ab\u51b2\u3bd6\ub1b9\ub1b9\u51fa$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(initobject:\u5654\u0800\ub1b9\ua562\u3e75\u8cae(\u5654\u0800\ub1b9\ua562\u3e75\u8cae::<init>, getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u5654\u6d69\u7006\u92ee\u5bc4\u071d)))
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 lambda$\ubded\u3dd3\u9af2\u1187\ub171\ub171$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uf995\u4975\u1187\ubff1\u839e\u8389(p0:\uf995\u4975\u1187\ubff1\u839e\u8389)
        }
        
        goto(Label_0006)
    }
    
    public static void \u4c2b\u494c\u3e75\u34df\u8389\u74b1(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, java.util.Set p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3711\u6cfe\u9a18\u34df\ub83f\u8df4, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:Set<\ub83f\uc9f6\u47c2\u67d0\u7ce1>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a \u4f52\ucfaf\u97b7\u7c6b\u7043\u3dd3(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u5140\u3711\ucef1\ufcaf\u446c\u3504(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokespecial:boolean(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u61a4\u760c\uc238\uae87\ubff1\uae87, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6 \uff55\u8d98\ua562\ud171\ua562\u51fa(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6(invokespecial:\uc87f\u5db4\u718f\ubefe\u6bb9\u3bd6(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7af6\ud51e\ufcaf\ufcaf\u61a4\ud36e, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] \u0800\u5f50\u97e6\u3e75\u7d52\u6435(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uf995\u4975\u1187\ubff1\u839e\u8389[](invokespecial:\uf995\u4975\u1187\ubff1\u839e\u8389[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u759a\ucef1\ubcb0\ubcb0\u7e3f\u3bc9, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, p2:\uf995\u4975\u1187\ubff1\u839e\u8389[]))
        }
        
        goto(Label_0006)
    }
    
    public static void \uae5d\u6cfe\u6b0d\u8389\u5bc4\u385b(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u3776\u946b\u64f2\uae5d\u718f\u67d0, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] \u516c\ub19c\u4daf\u3504\u446c\u965f(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389[] p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uf995\u4975\u1187\ubff1\u839e\u8389[](invokespecial:\uf995\u4975\u1187\ubff1\u839e\u8389[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u69d9\u7e3f\u6b0d\ud523\u6198\u0800, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p2:\uf995\u4975\u1187\ubff1\u839e\u8389[]))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 \u6b5f\u7873\u873d\u946b\u51b2\u61a4(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p4) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uf995\u4975\u1187\ubff1\u839e\u8389(invokespecial:\uf995\u4975\u1187\ubff1\u839e\u8389(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u983f\ucb79\u5d20\u4c2b\uafe7\u3c25, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p4:\uf995\u4975\u1187\ubff1\u839e\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static int \u12cb\u8cae\u64ab\u0c95\u56bd\u071d(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\ud4fe\u6c56\ud217\uc4d2\u6b0d\u3776, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public static int \u4ab3\u960f\u760c\u5140\uae87\u4492(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u8350\u071d\ua61f\u5140\u2dcc\u3e2a, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public static int \u3a62\uc9f6\ub8be\ud523\u98a4\u74b1(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u12b2\u8df4\u156b\uc9f6\u51fa\u97e6, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        }
        
        goto(Label_0006)
    }
    
    public static void \u9a18\ub6ab\u8753\ub19c\u527a\u8389(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4bc8\u6198\uc9f6\u5245\u6435\ub32d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u4bc8\ud217\u8258\u8df4\u4179\u4ab3, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910, p1:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d, p2:\u6fb0\u494c\u3bd6\u0c95\u4cd9\ufcaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_220 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_117_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_1D9_0 : byte[] [generated]
        stack_233_0 : byte[] [generated]
        stack_2C1_0 : byte[] [generated]
        stack_312_0 : byte[] [generated]
        var_4_1B2 : int
        var_3_1B7 : byte[]
        var_5_1B8 : int
        var_0_24D : int
        expr_233 : byte [generated]
        stack_27C_2 : byte [generated]
        stack_250_0 : byte [generated]
        expr_2C1 : byte [generated]
        expr_A7 : int [generated]
        expr_E0 : int [generated]
        var_2_117 : byte[]
        expr_11B : int [generated]
        var_3_300 : byte[]
        var_5_301 : int
        var_3_15D : String
        stack_1AB_0 : String[] [generated]
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
        var_0_220 = and:int(ldc:int(1140062813), ldc:int(1336933247))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_117_0 = stack_119_0 = stack_151_0 = stack_1D9_0 = stack_233_0 = stack_2C1_0 = stack_312_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("W3u2vKiNtpSBz8uwbVrIzzbF3og=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B2 = expr_6E:int
        var_3_1B7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1B8 = expr_6E:int
        Label_0442:
        
        while (cmpne:boolean(and:int(var_0_220:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_220:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0523)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-335839337))
            var_5_1B8 = add:int(var_5_1B8:int, ldc:int(-1))
            storeelement:byte(var_3_1B7:byte[], var_5_1B8:int, add:byte(xor:byte(loadelement:byte(stack_1D9_0:byte[], var_5_1B8:int), ldc:byte(23)), ldc:byte(94)))
            
            if (cmpne:boolean(var_5_1B8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_117_0 = stack_119_0 = stack_151_0 = stack_1D9_0 = stack_233_0 = stack_2C1_0 = stack_312_0 = var_3_1B7:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0674)
        Label_0523:
        
        while (cmpeq:boolean(and:int(var_0_220:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_220:int, ldc:int(1024)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(-2138341275))
                goto(Label_0442)
            }
            
            var_0_24D = and:int(var_0_220:int, ldc:int(1876982655))
            var_5_1B8 = add:int(var_5_1B8:int, ldc:int(-1))
            expr_233 = stack_27C_2 = loadelement(stack_233_0, var_5_1B8)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B8:int, ldc:int(3)), neg:int(var_4_1B2:int)), ldc:int(0))) {
                stack_27C_2 = stack_250_0 = add:byte(expr_233:byte, loadelement:byte(var_3_1B7:byte[], add:int(var_5_1B8:int, ldc:int(3))))
                goto(Label_0608)
            }
            
            Label_0576:
            
            if (cmpne:boolean(and:int(var_0_24D:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(1151922751))
                stack_27C_2 = stack_250_0 = add:byte(expr_233:byte, ldc:byte(3))
            }
            
            Label_0608:
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(8192)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(-1657516420))
                goto(Label_0576)
            }
            
            var_0_220 = and:int(var_0_24D:int, ldc:int(2007104301))
            storeelement:byte(var_3_1B7:byte[], var_5_1B8:int, stack_27C_2:byte)
            
            if (cmpne:boolean(var_5_1B8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_117_0 = stack_119_0 = stack_151_0 = stack_1D9_0 = stack_233_0 = stack_2C1_0 = stack_312_0 = var_3_1B7:byte[]
            goto(Label_0172)
        }
        
        Label_0674:
        
        while (cmpeq:boolean(and:int(var_0_220:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0442)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-844660967))
            var_5_1B8 = add:int(var_5_1B8:int, ldc:int(-1))
            expr_2C1 = loadelement:byte(stack_2C1_0:byte[], var_5_1B8:int)
            storeelement:byte(var_3_1B7:byte[], var_5_1B8:int, or:int(and:int(shl:int(expr_2C1:byte, xor:int(ldc:int(8), ldc:int(12))), ldc:int(-16)), and:int(shr:int(expr_2C1:byte[expected:int], xor:int(ldc:int(338), ldc:int(342))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1B8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_117_0 = stack_119_0 = stack_151_0 = stack_1D9_0 = stack_233_0 = stack_2C1_0 = stack_312_0 = var_3_1B7:byte[]
            goto(Label_0229)
        }
        
        goto(Label_0523)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(2)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-53778821))
            goto(Label_0229)
        }
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-1391842362))
        }
        else {
            var_0_220 = and:int(var_0_220:int, ldc:int(-525501861))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1B2 = expr_A7:int
                var_3_1B7 = newarray:byte[](byte.class, expr_A7:int)
                var_5_1B8 = expr_A7:int
                goto(Label_0523)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(287956964))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(-883073725))
                goto(Label_0115)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(-743604627))
            expr_E0 = arraylength:int(stack_E0_0:byte[])
            
            if (cmpne:boolean(expr_E0:int, ldc:int(0))) {
                var_4_1B2 = expr_E0:int
                var_3_1B7 = newarray:byte[](byte.class, expr_E0:int)
                var_5_1B8 = expr_E0:int
                goto(Label_0674)
            }
        }
        
        Label_0229:
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(512)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-1795285782))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_220:int, ldc:int(32)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(2087497711))
                goto(Label_0115)
            }
            
            var_0_220 = and:int(var_0_220:int, ldc:int(1978662887))
            var_2_117 = stack_117_0:byte[]
            expr_11B = add:int(arraylength:int(stack_119_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_300 = newarray:byte[](byte.class, expr_11B:int)
                var_5_301 = expr_11B:int
                
                loop {
                    var_0_220 = and:int(var_0_220:int, ldc:int(1353022153))
                    var_5_301 = add:int(var_5_301:int, ldc:int(-1))
                    storeelement:byte(var_3_300:byte[], var_5_301:int, add:int(shl:int(loadelement:byte(stack_312_0:byte[], var_5_301:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_117:byte[], add:int(var_5_301:int, xor:int(ldc:int(-8191), ldc:int(-8192)))), ldc:int(4)), and:int(ldc:int(1807), ldc:int(8303)))))
                    
                    if (cmpne:boolean(var_5_301:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_117_0 = stack_119_0 = stack_151_0 = stack_1D9_0 = stack_233_0 = stack_2C1_0 = stack_312_0 = var_3_300:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_220:int, ldc:int(32)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-1784640330))
            goto(Label_0229)
        }
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(4096)), ldc:int(0))) {
            var_0_220 = and:int(var_0_220:int, ldc:int(-756585681))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1AB_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4290), ldc:int(4288)))
            expr_16F = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(38), ldc:int(4619)))
            storeelement:String(expr_16F:String[], and:int(ldc:int(20911), ldc:int(577)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(19730), ldc:int(-19739)), xor:int(ldc:int(-20454), ldc:int(-20460))))
            storeelement:String(expr_16F:String[], and:int(ldc:int(9062), ldc:int(-13304)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(129), ldc:int(143)), xor:int(ldc:int(8212), ldc:int(8199))))
            putstatic:String[](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, expr_16F:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u0b8e\u3504\u3bd6\u6fb0\u3bd6\uf94d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6E7 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6F2 : int
        
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
        var_3_6E7 = and:int(ldc:int(1533553634), ldc:int(1563288553))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-68753539))
            var_5_81 = and:int(ldc:int(22827), ldc:int(-22828))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24877), ldc:int(-25070)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6E7:int, ldc:int(-538267791))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(16491), ldc:int(8577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(9313), ldc:int(649)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6E7 = and:int(var_3_D1:int, ldc:int(2146920435))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(544), ldc:int(545)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-633637243))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1481726884))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2057221238))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1711056383))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1804621343))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2126810711))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1872874700))
                    }
                    else {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-72206396))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(625278921))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(39121193))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1698413374))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1986956202))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2041300506))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-450512995))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1566959476))
                        var_11_E2 = and:int(ldc:int(-26402), ldc:int(26401))
                        goto(Label_1616)
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1354517689))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2070135505))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-964756058))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1752565045))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1036779542))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-609912859))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1843936797))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1497875701))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1601481595))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-185370209))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1556211603))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1180848936))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1331052685))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(66717917))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1564177397))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(8737), ldc:int(2053))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1941213876))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1204790818))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(625410328))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1212680804))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1994126237))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1609180591))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-575331471))
                        var_11_E2 = and:int(ldc:int(21926), ldc:int(-22503))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1489210648))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(860110898))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1271707009))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1824451512))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1668670793))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-105857198))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1470)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-142741212))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(72230868))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-384680129))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1703500799))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1014029635))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1328240934))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1759006356))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-613206205))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1616)
                    }
                    
                    Label_1470:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2044698222))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-148618757))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-655163958))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1413175871))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(6612025))
                        loopcontinue()
                    }
                    
                    var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1576465363))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F2 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1831447598))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-56677515))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1256552719))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1801707854))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-250257894))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-860829013))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-612670655))
                        var_17_6F2 = add:int(var_16_110:int, and:int(ldc:int(1155), ldc:int(18945)))
                        looporswitchbreak()
                    }
                    
                    var_3_6E7 = and:int(var_3_6E7:int, ldc:int(617273909))
                }
                
                var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-114611250))
                
                if (cmple:boolean(var_5_81 = var_17_6F2:int, sub:int(var_6_88:int, and:int(ldc:int(577), ldc:int(22537))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
