public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u960f\u67d0\u62da\u6d69\u8d90\u760c {
    public void \u960f\u67d0\u62da\u6d69\u8d90\u760c(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u516c\u5bc4\u494c\ub1b9\u5245 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p2) {
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
    
    public void \u960f\u67d0\u62da\u6d69\u8d90\u760c(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u516c\u5bc4\u494c\ub1b9\u5245 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p2, java.util.function.BiPredicate<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p3) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:AbstractSpliterator(AbstractSpliterator::<init>, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, ldc:long(9223372036854775807L), xor:int(ldc:int(1076), ldc:int(308)))
            putfield:\ucfaf\u9255\u839e\u8258\uc31c\u983f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ubff1\u3e75\u74b1\u392e\u98a4\uceb8, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, ternaryop:\ucfaf\u9255\u839e\u8258\uc31c\u983f(cmpne:boolean(p1:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), invokestatic:\ucfaf\u9255\u839e\u8258\uc31c\u983f(\ucfaf\u9255\u839e\u8258\uc31c\u983f::\ua562\ua6bd\u718f\u5140\u5db4\u92ff, p1:\u7d52\u718f\u3776\u6fb0\ub83f), invokestatic:\ucfaf\u9255\u839e\u8258\uc31c\u983f(\ucfaf\u9255\u839e\u8258\uc31c\u983f::\ud4fe\uae87\u8aa5\u7873\u527a\uc238)))
            putfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>))
            putfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u59ec\u3bc9\u494c\u7330\u718f\u446c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ub8be\u7043\ud36e\ud12e\ubded\ud158, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))
            putfield:\u516c\u5bc4\u494c\ub1b9\u5245(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u1187\u74b1\u7006\u3dd3\ufcaf\u494c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p0:\u516c\u5bc4\u494c\ub1b9\u5245)
            putfield:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u8308\u7043\u51fa\u4cd9\u4e72\u624e, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, ternaryop:int[expected:boolean](cmpeq:boolean(p1:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), and:int(ldc:int(15460), ldc:int(-15461)), and:int(ldc:int(21281), ldc:int(21))))
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ud171\u3d4b\u64ab\u7ce1\uc4d2\u56bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            putfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u40a9\uc910\u92ee\u4ab3\u7006\u8640, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)
            putfield:BiPredicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u98a4\u7bad\u6198\ua61f\u67e9\u7ce1, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p3:BiPredicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)
            putfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, initobject:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::<init>, sub:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), xor:int(ldc:int(7172), ldc:int(7173))), sub:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), xor:int(ldc:int(1035), ldc:int(1034))), sub:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), xor:int(ldc:int(778), ldc:int(779))), add:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), xor:int(ldc:int(4098), ldc:int(4099))), add:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), and:int(ldc:int(12353), ldc:int(1443))), add:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p2:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), ldc:double(1.0E-7))), and:int(ldc:int(12805), ldc:int(145)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean tryAdvance(java.util.function.Consumer<? super \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52> p0) {
        var_2_5F : int
        stack_CE_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(-1661479076), ldc:int(-1583143))
            
            if (getfield:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u8308\u7043\u51fa\u4cd9\u4e72\u624e, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c)) {
                if (invokevirtual:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u9937\ubff1\ub83f\u3bd6\ub1b9\u92ff, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p0:Consumer<? super \u6c52\ubded\u4975\u71ae\u47c2\u7d52>)) {
                    return:boolean(and:int[expected:boolean](ldc:int(18113), ldc:int(4131)))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-206712919))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-554314788))
                    
                    if (invokevirtual:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u385b\ub70c\u527a\u624e\u416d\ub70c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, p0:Consumer<? super \u6c52\ubded\u4975\u71ae\u47c2\u7d52>)) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                    stack_CE_0 = and:int[expected:boolean](ldc:int(-4833), ldc:int(4832))
                    return:boolean(stack_CE_0:boolean)
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-431373067))
            }
            
            stack_CE_0 = and:int[expected:boolean](ldc:int(18113), ldc:int(4131))
            return:boolean(stack_CE_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \u385b\ub70c\u527a\u624e\u416d\ub70c(java.util.function.Consumer<? super \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52> p0) {
        var_2_148 : int
        var_4_95 : int
        var_5_9E : int
        var_6_A7 : int
        var_7_B0 : int
        var_8_CB : \u718f\u6435\uc31c\u4ab3\u98a4
        var_9_F0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_10_162 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        var_11_20E : \u34df\u71ae\ua61f\u6cfe\u7ce1
        var_11_1A4 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        
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
        var_2_148 = and:int(ldc:int(-1205023425), ldc:int(-1096618373))
        
        loop {
            Label_0096:
            
            if (cmpeq:boolean(and:int(var_2_148:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_148 = and:int(var_2_148:int, ldc:int(-22032453))
                
                if (invokevirtual:boolean(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u2dcc\uc7fe\u836c\ua61f\uae5d\ud171, getfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))) {
                    var_4_95 = invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u51b2\ufe34\uc229\u40a9\u647c\ufe34, getfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                    var_5_9E = invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\u3e75\uc31c\u76bc\ub70c\u156b\u98a4, getfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                    var_6_A7 = invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\uae5d\u97b7\ucfaf\u61a4\u8d90\ud51e, getfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                    var_7_B0 = invokevirtual:int(\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9::\ud36e\u7c6b\u67d0\u4f4a\u72f1\u8cae, getfield:\ub7dc\u8753\u3711\u4daf\u7bad\u4cd9(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u62da\u67e9\u5fe1\u71ae\u0b8e\uc2bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                    
                    if (cmpeq:boolean(var_7_B0:int, and:int(ldc:int(51), ldc:int(9219)))) {
                        loopcontinue()
                    }
                    
                    var_2_148 = and:int(var_2_148:int, ldc:int(-1104609986))
                    var_8_CB = invokespecial:\u718f\u6435\uc31c\u4ab3\u98a4(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u8640\ua068\u3bc9\u4179\ud171\u385b, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, var_4_95:int, var_6_A7:int)
                    
                    if (cmpeq:boolean(var_8_CB:\u718f\u6435\uc31c\u4ab3\u98a4, aconstnull:\u718f\u6435\uc31c\u4ab3\u98a4())) {
                        loopcontinue()
                    }
                    
                    var_2_148 = and:int(var_2_148:int, ldc:int(-1136799881))
                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), var_4_95:int, var_5_9E:int, var_6_A7:int)
                    var_9_F0 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_8_CB:\u718f\u6435\uc31c\u4ab3\u98a4, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(BiPredicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>::test, getfield:BiPredicate<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u98a4\u7bad\u6198\ua61f\u67e9\u7ce1, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), var_9_F0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c)))) {
                        loopcontinue()
                    }
                    
                    if (cmpeq:boolean(var_7_B0:int, and:int(ldc:int(5349), ldc:int(24577)))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u527a\uf9c5\u5140\ud36e\ub18d\u5db4, var_9_F0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))) {
                            loopcontinue()
                        }
                    }
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_148:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_148 = and:int(var_2_148:int, ldc:int(-1083056534))
                            
                            if (cmpeq:boolean(var_7_B0:int, and:int(ldc:int(16411), ldc:int(5350)))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_9_F0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u92ee\u3c25\u6b5f\u4492\u4daf\uc7fe)))) {
                                    loopcontinue(Label_0096)
                                }
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_148:int, ldc:int(2097152)), ldc:int(0))) {
                            var_2_148 = and:int(var_2_148:int, ldc:int(-2133888947))
                        }
                        else {
                            var_2_148 = and:int(var_2_148:int, ldc:int(-1088041302))
                            var_10_162 = invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, var_9_F0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getfield:\u516c\u5bc4\u494c\ub1b9\u5245[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u1187\u74b1\u7006\u3dd3\ufcaf\u494c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), getfield:\ucfaf\u9255\u839e\u8258\uc31c\u983f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ubff1\u3e75\u74b1\u392e\u98a4\uceb8, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
                            
                            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ud171\u3d4b\u64ab\u7ce1\uc4d2\u56bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))) {
                                var_11_20E = initobject:\u34df\u71ae\ua61f\u6cfe\u7ce1(\u34df\u71ae\ua61f\u6cfe\u7ce1::<init>, getfield:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u183a\ud523\u9a18\u92ee\u8d90\uc3e3, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), var_10_162:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
                                invokevirtual:void(\uc910\u3e75\u527a\u446c\u3c25::\u34df\u8308\u74b1\u9af2\u9937, invokevirtual:\uc910\u3e75\u527a\u446c\u3c25(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4e72\u4c2b\u5d20\u8350\u6b0d, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_11_20E:\u34df\u71ae\ua61f\u6cfe\u7ce1[expected:\u6435\u385b\uae5d\u7049\u8bb0])
                                var_10_162 = invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u34df\u71ae\ua61f\u6cfe\u7ce1::\u51b2\u8350\u4bc8\u71f1\u8350, var_11_20E:\u34df\u71ae\ua61f\u6cfe\u7ce1)
                                
                                if (invokevirtual:boolean(\u6ec6\uc7fe\u927d\u6cfe\ub32d::\u0b8e\u3d64\u7330\ucfaf\u946b, var_11_20E:\u34df\u71ae\ua61f\u6cfe\u7ce1[expected:\u6ec6\uc7fe\u927d\u6cfe\ub32d])) {
                                    return:boolean(and:int[expected:boolean](ldc:int(9370), ldc:int(-9883)))
                                }
                            }
                            
                            loop {
                                if (cmpne:boolean(and:int(var_2_148:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_148 = and:int(var_2_148:int, ldc:int(-1145253909))
                                    
                                    if (cmpeq:boolean(var_10_162:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ud171\ub6ab\u4c04\u0800\u7049\u6c52))) {
                                        if (invokevirtual:boolean(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ud171\uc7fe\u67d0\u61a4\u946b\u8640, getfield:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u40a9\uc910\u92ee\u4ab3\u7006\u8640, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), i2d:double(var_4_95:int), i2d:double(var_5_9E:int), i2d:double(var_6_A7:int), add:double(i2d:double(var_4_95:int), ldc:double(1.0)), add:double(i2d:double(var_5_9E:int), ldc:double(1.0)), add:double(i2d:double(var_6_A7:int), ldc:double(1.0)))) {
                                            invokeinterface:void(Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>::accept, p0:Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u5d20\u92ff\u965f\u9937\u47c2\u12cb, var_10_162:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, i2d:double(var_4_95:int), i2d:double(var_5_9E:int), i2d:double(var_6_A7:int)))
                                            return:boolean(and:int[expected:boolean](ldc:int(2049), ldc:int(5127)))
                                        }
                                        
                                        loopcontinue(Label_0096)
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_148:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_2_148 = and:int(var_2_148:int, ldc:int(-57153903))
                                }
                                else {
                                    var_2_148 = and:int(var_2_148:int, ldc:int(-26870558))
                                    var_11_1A4 = invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u5d20\u92ff\u965f\u9937\u47c2\u12cb, var_10_162:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, i2d:double(var_4_95:int), i2d:double(var_5_9E:int), i2d:double(var_6_A7:int))
                                    
                                    if (invokestatic:boolean(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\u8c8a\u385b\u51b2\u67d0\u62da\u99f7, var_11_1A4:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u59ec\u3bc9\u494c\u7330\u718f\u446c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), getstatic:\u8413\u839e\u839e\u8308\uc246\ubefe(\u8413\u839e\u839e\u8308\uc246\ubefe::\ud217\u718f\uc7fe\u6bb9\u8cae\uae5d))) {
                                        invokeinterface:void(Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>::accept, p0:Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>, var_11_1A4:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
                                        return:boolean(xor:int[expected:boolean](ldc:int(3075), ldc:int(3074)))
                                    }
                                    
                                    loopcontinue(Label_0096)
                                }
                            }
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_148:int, ldc:int(2048)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-15012), ldc:int(14979)))
            }
        }
    }
    
    private \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 \u8640\ua068\u3bc9\u4179\ud171\u385b(int p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u718f\u6435\uc31c\u4ab3\u98a4(invokeinterface:\u718f\u6435\uc31c\u4ab3\u98a4(\u516c\u5bc4\u494c\ub1b9\u5245::\u3e2a\u4f4a\u16f6\ub7dc\u8df4\u51fa, getfield:\u516c\u5bc4\u494c\ub1b9\u5245(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u1187\u74b1\u7006\u3dd3\ufcaf\u494c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c), shr:int(p0:int, and:int(ldc:int(1156), ldc:int(4373))), shr:int(p1:int, and:int(ldc:int(21764), ldc:int(2693)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9937\ubff1\ub83f\u3bd6\ub1b9\u92ff(java.util.function.Consumer<? super \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52> p0) {
        var_4_7E : \u34df\u4492\u71ae\uc238\u7873\uafe7
        var_5_87 : \u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7
        var_6_AA : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:\u7d52\u718f\u3776\u6fb0\ub83f(Objects::requireNonNull, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ud171\u3d4b\u64ab\u7ce1\uc4d2\u56bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
            putfield:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u8308\u7043\u51fa\u4cd9\u4e72\u624e, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c, and:int[expected:boolean](ldc:int(-32359), ldc:int(31302)))
            var_4_7E = invokeinterface:\u34df\u4492\u71ae\uc238\u7873\uafe7(\u516c\u5bc4\u494c\ub1b9\u5245::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, getfield:\u516c\u5bc4\u494c\ub1b9\u5245(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u1187\u74b1\u7006\u3dd3\ufcaf\u494c, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
            var_5_87 = invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7d52\u718f\u3776\u6fb0\ub83f::\ub113\ub1b9\u9937\u1833\u64f2\u3504, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\ud171\u3d4b\u64ab\u7ce1\uc4d2\u56bd, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c))
            
            if (logicalnot:boolean(invokestatic:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u0b8e\uc2bd\u0b8e\u3bd6\u6c52\u0c95, var_4_7E:\u34df\u4492\u71ae\uc238\u7873\uafe7, var_5_87:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))) {
                var_6_AA = invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u8cae\u8258\u8d98\u3504\uc2e8\u6cfe, var_4_7E:\u34df\u4492\u71ae\uc238\u7873\uafe7)
                
                if (logicalnot:boolean(invokestatic:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u3bd6\u6d99\u759a\u8389\u647c\uc2bd, var_6_AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_5_87:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7))) {
                    if (invokestatic:boolean(\u960f\u67d0\u62da\u6d69\u8d90\u760c::\u56bd\u72f1\ud217\u67e9\u3d4b\u759a, var_6_AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, var_5_87:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)) {
                        invokeinterface:void(Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>::accept, p0:Consumer<\u6c52\ubded\u4975\u71ae\u47c2\u7d52>, var_6_AA:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
                        return:boolean(and:int[expected:boolean](ldc:int(19729), ldc:int(4719)))
                    }
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-28748), ldc:int(28746)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u56bd\u72f1\ud217\u67e9\u3d4b\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokestatic:boolean(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\u8c8a\u385b\u51b2\u67d0\u62da\u99f7, p0:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ub8be\u7043\ud36e\ud12e\ubded\ud158, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub19c\u946b\u718f\u6cfe\u4bc8\u5654, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, ldc:double(1.0E-7))), getstatic:\u8413\u839e\u839e\u8308\uc246\ubefe(\u8413\u839e\u839e\u8308\uc246\ubefe::\ud217\u718f\uc7fe\u6bb9\u8cae\uae5d)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u3bd6\u6d99\u759a\u8389\u647c\uc2bd(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokestatic:boolean(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\u8c8a\u385b\u51b2\u67d0\u62da\u99f7, p0:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ub8be\u7043\ud36e\ud12e\ubded\ud158, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7af6\u8df4\u4cd9\u9033\u6cfe\u600f, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7, ldc:double(1.0E-7))), getstatic:\u8413\u839e\u839e\u8308\uc246\ubefe(\u8413\u839e\u839e\u8308\uc246\ubefe::\ud217\u718f\uc7fe\u6bb9\u8cae\uae5d)))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u0b8e\uc2bd\u0b8e\u3bd6\u6c52\u0c95(\ub113\ufcaf\u3c25\u071d\u97b7.\u34df\u4492\u71ae\uc238\u7873\uafe7 p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p1) {
        var_2_61 : int
        var_4_6A : double
        var_6_74 : double
        var_8_7E : double
        var_10_88 : double
        stack_12C_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(2098767374), ldc:int(1944893414))
            var_4_6A = i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub19c\u759a\u071d\u9937\ufe34\u7043, p0:\u34df\u4492\u71ae\uc238\u7873\uafe7)))
            var_6_74 = i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4daf\ud51e\u98a4\ud12e\u9255\u9a18, p0:\u34df\u4492\u71ae\uc238\u7873\uafe7)))
            var_8_7E = i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\ub7dc\u59ec\u8753\ud158\ud523\u64ab, p0:\u34df\u4492\u71ae\uc238\u7873\uafe7)))
            var_10_88 = i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u4f4a\u6435\ud12e\ub6ab\u527a\u16f6, p0:\u34df\u4492\u71ae\uc238\u7873\uafe7)))
            
            if (cmpgt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_4_6A:double)) {
                if (cmplt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_7E:double)) {
                    if (cmpgt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_6_74:double)) {
                        if (cmplt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_88:double)) {
                            if (cmpgt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_4_6A:double)) {
                                if (cmplt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_7E:double)) {
                                    if (cmpgt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_6_74:double)) {
                                        if (cmplt:boolean(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p1:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_88:double)) {
                                            stack_12C_0 = and:int[expected:boolean](ldc:int(16387), ldc:int(5961))
                                            return:boolean(stack_12C_0:boolean)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1198868991))
            stack_12C_0 = and:int[expected:boolean](ldc:int(-31234), ldc:int(31233))
            return:boolean(stack_12C_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u718f\uc229\ub1b9\u71f1\u8d98\ud51e$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(and:int[expected:boolean](ldc:int(15361), ldc:int(17153)))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
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
    
    public void \u4492\u0c95\u9033\uc229\u74b1\u946b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_706 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_711 : int
        
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
        var_3_706 = and:int(ldc:int(1370296098), ldc:int(1409211487))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\u67d0\u62da\u6d69\u8d90\u760c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
            var_3_706 = and:int(var_3_706:int, ldc:int(1376804329))
        }
        else {
            var_3_706 = and:int(var_3_706:int, ldc:int(-608363178))
            var_5_89 = and:int(ldc:int(11088), ldc:int(-31601))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11218), ldc:int(10833)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_706:int, ldc:int(1471143582))
                    var_9_C7 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_90:int, and:int(ldc:int(16965), ldc:int(4145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(1045), ldc:int(195)))), var_7_9F:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_706 = and:int(var_3_D9:int, ldc:int(-206594206))
                    var_14_114 = var_7_9F:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-32704), ldc:int(-32703)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_90:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1907942520))
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1904376590))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(197346352))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-28004713))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-733090996))
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(2076092557))
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(128)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-743473533))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0598)
                            }
                            
                            goto(Label_0895)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-614536000))
                        goto(Label_1661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1656943339))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(317147283))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-270824543))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-1762886316))
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(-101761066))
                        var_11_EA = and:int(ldc:int(-14214), ldc:int(13189))
                        goto(Label_1650)
                    }
                    
                    Label_0598:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-492891943))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(64)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1493229705))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-2051165794))
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(8)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1498979539))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(16)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1898042542))
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(-541242010))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0895)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(128)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1143934374))
                        goto(Label_1661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(8)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1515632933))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1006957523))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-138141148))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1352918859))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(16)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-694643005))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(407076386))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1625837099))
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(1912491395))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0895:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(107786592))
                        goto(Label_1661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-113925081))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-713883725))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1544735160))
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1319040536))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(1437584999))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_EA = xor:int(ldc:int(4385), ldc:int(4384))
                                goto(Label_1194)
                            }
                        }
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1650305417))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1026986463))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(64)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(238441148))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(318290969))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1976243353))
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(-642802046))
                        var_11_EA = and:int(ldc:int(-30934), ldc:int(14548))
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-250990749))
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(252079891))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(16)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(279459758))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-2045739329))
                            goto(Label_0895)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(352609356))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(235082356))
                            goto(Label_0598)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-1365904301))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(1945103666))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1498)
                            }
                        }
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-2107961026))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1194)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(128)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-1479718159))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-91001207))
                            goto(Label_0895)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(1107454696))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-1270623708))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4)), ldc:int(0))) {
                            var_3_706 = and:int(var_3_706:int, ldc:int(-984047462))
                            loopcontinue()
                        }
                        
                        var_3_706 = and:int(var_3_706:int, ldc:int(1409232294))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_89:int, var_16_118:int)
                        goto(Label_1650)
                    }
                    
                    Label_1498:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(2076748202))
                        goto(Label_1661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-877437592))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(956002308))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1441033451))
                        goto(Label_0895)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1033191456))
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(791238761))
                        loopcontinue()
                    }
                    
                    var_3_706 = and:int(var_3_706:int, ldc:int(-33567466))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1650:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_711 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1661:
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(804477078))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-492225595))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-600102302))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(314384879))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-1395599146))
                        goto(Label_0895)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(1289563281))
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_706:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_706 = and:int(var_3_706:int, ldc:int(-206647825))
                        var_17_711 = add:int(var_16_118:int, and:int(ldc:int(2057), ldc:int(12837)))
                        looporswitchbreak()
                    }
                    
                    var_3_706 = and:int(var_3_706:int, ldc:int(987353088))
                }
                
                var_3_706 = and:int(var_3_706:int, ldc:int(1409182987))
                
                if (cmple:boolean(var_5_89 = var_17_711:int, sub:int(var_6_90:int, xor:int(ldc:int(17), ldc:int(16))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_706:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
