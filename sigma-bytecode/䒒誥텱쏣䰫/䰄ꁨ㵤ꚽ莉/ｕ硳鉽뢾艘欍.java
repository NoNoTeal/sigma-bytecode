public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d {
    public void \uff55\u7873\u927d\ub8be\u8258\u6b0d(float p0, float p1, int p2, int p3, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p4) {
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
        invokespecial:\ua61f\u16f6\u8258\u494c\u52d3\u760c(\ua61f\u16f6\u8258\u494c\u52d3\u760c::<init>, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d)
        
        if (cmplt:boolean(p2:int, p3:int)) {
            putfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\uc7fe\u7c6b\u4daf\u4ab3\u4bc8\u527a, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d, p0:float)
            putfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u3dd3\u88c5\ube23\u416d\ub8be\ub1b9, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d, p1:float)
            putfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u718f\ua068\u516c\ub102\u839e\u62da, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d, p2:int)
            putfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u156b\uf94d\u873d\ucb79\ud171\u4d85, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d, p3:int)
            putfield:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\ubded\ud171\u5140\u93a2\u9255\u4f52, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d, p4:\u6c52\u156b\u4179\u5654\uceb8\u9af2)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u6c52\u8753\uafe7\u5654\ub171\u5654), and:int(ldc:int(-122), ldc:int(121)))), p2:int), loadelement:String(getstatic:String[](\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u6c52\u8753\uafe7\u5654\ub171\u5654), and:int(ldc:int(2049), ldc:int(25859)))), p3:int), loadelement:String(getstatic:String[](\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u6c52\u8753\uafe7\u5654\ub171\u5654), and:int(ldc:int(16922), ldc:int(6466)))))))
    }
    
    public boolean \ua562\u59ec\uc84e\u7e3f\u071d\u7043(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
        var_5_61 : int
        var_7_6D : \u760c\u4975\u4179\uc246\u8640\u64f2
        stack_107_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_61 = and:int(ldc:int(538474217), ldc:int(1052079595))
            var_7_6D = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u8413\u600f\u183a\u416d\ucef1\u4492, getstatic:\u4f52\u92ee\u6ec6\u927d\uc246\u59ec(\u4f52\u92ee\u6ec6\u927d\uc246\u59ec::\u8709\u71ae\u718f\u965f\u183a\u4f52), getfield:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\ubded\ud171\u5140\u93a2\u9255\u4f52, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d))
            
            if (cmpgt:boolean(f2d:double(invokevirtual:float(Random::nextFloat, p3:Random)), invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u93a2\u7049\u183a\u6cfe\u4e72\u5fe1, f2d:double(getfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\uc7fe\u7c6b\u4daf\u4ab3\u4bc8\u527a, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d)), f2d:double(getfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u3dd3\u88c5\ube23\u416d\ub8be\ub1b9, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d)), invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub6ab\u3711\u92ee\u52d3\uff55\ub70c, i2d:double(f2i:int(add:float(add:float(i2f:float(invokestatic:int(Math::abs, mul:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2)))), i2f:float(invokestatic:int(Math::abs, mul:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u64f2\u0c95\u3d64\u2dcc\uc84e\uc4d2, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2))))), i2f:float(invokestatic:int(Math::abs, mul:int(sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_7_6D:\u760c\u4975\u4179\uc246\u8640\u64f2))))))), i2d:double(getfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u718f\ua068\u516c\ub102\u839e\u62da, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d)), i2d:double(getfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u156b\uf94d\u873d\ucb79\ud171\u4d85, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d)))))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-189640740))
                stack_107_0 = and:int(ldc:int(11504), ldc:int(-11513))
            }
            else {
                stack_107_0 = xor:int(ldc:int(1124), ldc:int(1125))
            }
            
            return:boolean(stack_107_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<?> \u8308\u5654\u0b8e\u7873\uc31c\uc9f6() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<?>(getstatic:\uc910\uc84e\ubff1\u759a\u59ec\ua3b4<\uff55\u7873\u927d\ub8be\u8258\u6b0d>(\uc910\uc84e\ubff1\u759a\u59ec\ua3b4::\uc229\u4e72\ud217\u385b\u4d85\u8640))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\uc238\ud158\u647c\uc29a\u0c95\ufcaf$5(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 lambda$\u8640\u3a62\u3504\u385b\u4c2b\u8bb0$4(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u6c52\u156b\u4179\u5654\uceb8\u9af2(getfield:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\ubded\ud171\u5140\u93a2\u9255\u4f52, p0:\uff55\u7873\u927d\ub8be\u8258\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\ub6ab\ub7dc\u600f\u5245\uf995\u36d3$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u156b\uf94d\u873d\ucb79\ud171\u4d85, p0:\uff55\u7873\u927d\ub8be\u8258\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u071d\u67e9\u9af2\u7873\u3776\ub32d$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u718f\ua068\u516c\ub102\u839e\u62da, p0:\uff55\u7873\u927d\ub8be\u8258\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u4492\u40a9\uc246\u4d85\u4975\u6d69$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\u3dd3\u88c5\ube23\u416d\ub8be\ub1b9, p0:\uff55\u7873\u927d\ub8be\u8258\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u40a9\uc9f6\u5245\ucb79\u6435\ube23$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uff55\u7873\u927d\ub8be\u8258\u6b0d p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\uff55\u7873\u927d\ub8be\u8258\u6b0d::\uc7fe\u7c6b\u4daf\u4ab3\u4bc8\u527a, p0:\uff55\u7873\u927d\ub8be\u8258\u6b0d)))
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
    
    public void \u6d99\u8aa5\u4f52\u6c52\ua3b4\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(1287511430), ldc:int(-1344413973))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uff55\u7873\u927d\ub8be\u8258\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(-1740764979))
        }
        else {
            var_3_669 = and:int(var_3_669:int, ldc:int(1335876473))
            var_5_8A = and:int(ldc:int(-20171), ldc:int(20170))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16341), ldc:int(11348)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_669:int, ldc:int(517471939))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(2050), ldc:int(2051)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(8193), ldc:int(4757)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_E3:int, ldc:int(-1619927956))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(4248), ldc:int(4249)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-970641350))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(899198708))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-395270941))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(621386979))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1139672131))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(742274471))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2036346760))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1489433900))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1094990686))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1938039051))
                        var_11_F4 = and:int(ldc:int(21718), ldc:int(-30167))
                        goto(Label_1517)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2665755))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(662446593))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1722214228))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1639261274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1981750278))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1462391702))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(500292964))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-384583779))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1861669079))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1230381262))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-804553840))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(388964454))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1078207477))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(889356321))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(676608586))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-584878933))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1584195270))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-52823140))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(2369), ldc:int(5641))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(485745572))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(818470942))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(638068901))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1441477178))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1393427836))
                        var_11_F4 = and:int(ldc:int(-644), ldc:int(643))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1554886137))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1473746167))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1859246158))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1716654783))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(556359367))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1063045688))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1582120901))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-269353137))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1006580986))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-357024183))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-1935933676))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-223836304))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-551448739))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1000447371))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1883374600))
                        var_17_674 = add:int(var_16_122:int, xor:int(ldc:int(4163), ldc:int(4162)))
                        looporswitchbreak()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(977177537))
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(-1610620988))
                
                if (cmple:boolean(var_5_8A = var_17_674:int, sub:int(var_6_91:int, xor:int(ldc:int(-24576), ldc:int(-24575))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(2001996804))
            goto(Label_0108)
        }
    }
}
