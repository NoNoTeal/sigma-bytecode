public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5140\u6bb9\ua3b4\ubf56\u6b5f {
    public void \u5140\u6bb9\ua3b4\ubf56\u6b5f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f)
            putfield:\ube23\uc238\u5140\u4cd9\u8aa5(\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u56bd\u8413\u647c\u5bc4\ud158.\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72> \u5245\u9033\uff55\u3d4b\u3776\u9255(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, boolean p1) {
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
    
    public java.util.Optional<\u56bd\u8413\u647c\u5bc4\ud158.\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72> \u8cae\u4c2b\u7e3f\u34df\u59ec\ub171(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p1) {
        var_5_67 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_6_2B2 : double
        var_8_6F : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_9_74 : double
        var_11_77 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_12_80 : \u34df\u4492\u71ae\uc238\u7873\uafe7
        var_13_91 : int
        var_14_97 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_15_AA : Iterator<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>
        var_16_DC : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_17_F7 : int
        var_19_144 : int
        var_20_171 : int
        var_21_1B6 : int
        var_22_1FF : double
        var_15_2E7 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_16_2F4 : int
        var_17_322 : int
        var_18_33B : int
        var_19_36B : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_15_C9 : int
        var_16_3DE : int
        var_15_3CB : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_16_3D4 : int
        var_17_4A6 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_67 = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u8413\u600f\u183a\u416d\ucef1\u4492, getstatic:\u4f52\u92ee\u6ec6\u927d\uc246\u59ec(\u4f52\u92ee\u6ec6\u927d\uc246\u59ec::\u8709\u71ae\u718f\u965f\u183a\u4f52), p1:\u6c52\u156b\u4179\u5654\uceb8\u9af2)
            var_6_2B2 = ldc:double(-1.0)
            var_8_6F = aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()
            var_9_74 = ldc:double(-1.0)
            var_11_77 = aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()
            var_12_80 = invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f))
            var_13_91 = sub:int(invokevirtual:int(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u16f6\u7d52\u7af6\u4ab3\u56bd\u3dd3, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f)), and:int(ldc:int(341), ldc:int(21633)))
            var_14_97 = invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u839e\uc7fe\u392e\u7330\ud523\u3d4b, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_15_AA = invokeinterface:Iterator<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>(Iterable<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>::iterator, invokestatic:Iterable<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uf94d\u9033\u3776\ud523\u34df\u0c95, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:int(16), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u12cb\ucb79\u6d99\ub7dc\u4f4a\u76bc), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u5140\u5245\u92ee\ub6ab\u6d69\ud217)))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_15_AA:Iterator)) {
                var_16_DC = checkcast:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a.class, invokeinterface:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(Iterator<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>::next, var_15_AA:Iterator<\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a>))
                var_17_F7 = invokestatic:int(Math::min, var_13_91:int, invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, var_12_80:\u34df\u4492\u71ae\uc238\u7873\uafe7, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                    loopcontinue()
                }
                
                if (logicalnot:boolean(invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, var_12_80:\u34df\u4492\u71ae\uc238\u7873\uafe7, invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2, xor:int(ldc:int(4361), ldc:int(4360)))))) {
                    loopcontinue()
                }
                
                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2), and:int(ldc:int(24359), ldc:int(25)))
                var_19_144 = var_17_F7:int
                
                while (cmpge:boolean(var_19_144:int, ldc:int(0))) {
                    invokevirtual:void(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u385b\uc238\u4bc8\uc910\u4bc8\uafe7, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_19_144:int)
                    
                    if (invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u416d\ub113\u8bb0\u416d\u946b\u3504, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                        var_20_171 = var_19_144:int
                        
                        while (logicaland:boolean(cmpgt:boolean(var_19_144:int, ldc:int(0)), invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u416d\ub113\u8bb0\u416d\u946b\u3504, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56](\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u4daf\ubf56\ud217\u839e\u12cb\u51fa, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))))) {
                            inc:int(var_19_144, ldc:int(-1))
                        }
                        
                        if (cmple:boolean(add:int(var_19_144:int, xor:int(ldc:int(16388), ldc:int(16384))), var_13_91:int)) {
                            var_21_1B6 = sub:int(var_20_171:int, var_19_144:int)
                            
                            if (logicalor:boolean(cmple:boolean(var_21_1B6:int, ldc:int(0)), cmpge:boolean(var_21_1B6:int, and:int(ldc:int(2339), ldc:int(17987))))) {
                                invokevirtual:void(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u385b\uc238\u4bc8\uc910\u4bc8\uafe7, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_19_144:int)
                                
                                if (invokespecial:boolean(\u5140\u6bb9\ua3b4\ubf56\u6b5f::\ub171\u718f\u12b2\ua6bd\u8df4\u47c2, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2, and:int(ldc:int(-6500), ldc:int(6498)))) {
                                    var_22_1FF = invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                                    
                                    if (invokespecial:boolean(\u5140\u6bb9\ua3b4\ubf56\u6b5f::\ub171\u718f\u12b2\ua6bd\u8df4\u47c2, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2, ldc:int(-1))) {
                                        if (invokespecial:boolean(\u5140\u6bb9\ua3b4\ubf56\u6b5f::\ub171\u718f\u12b2\ua6bd\u8df4\u47c2, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2, xor:int(ldc:int(20480), ldc:int(20481)))) {
                                            if (logicalor:boolean(cmpeq:boolean(var_6_2B2:double, ldc:double(-1.0)), cmpgt:boolean(var_6_2B2:double, var_22_1FF:double))) {
                                                var_6_2B2 = var_22_1FF:double
                                                var_8_6F = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
                                            }
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(var_6_2B2:double, ldc:double(-1.0))) {
                                        if (logicalor:boolean(cmpeq:boolean(var_9_74:double, ldc:double(-1.0)), cmpgt:boolean(var_9_74:double, var_22_1FF:double))) {
                                            var_9_74 = var_22_1FF:double
                                            var_11_77 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_16_DC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    inc:int(var_19_144, ldc:int(-1))
                }
            }
            
            if (cmpeq:boolean(var_6_2B2:double, ldc:double(-1.0))) {
                if (cmpne:boolean(var_9_74:double, ldc:double(-1.0))) {
                    var_8_6F = var_11_77:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
                    var_6_2B2 = var_9_74:double
                }
            }
            
            if (cmpeq:boolean(var_6_2B2:double, ldc:double(-1.0))) {
                var_8_6F = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(70), sub:int(invokevirtual:int(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u16f6\u7d52\u7af6\u4ab3\u56bd\u3dd3, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f)), ldc:int(10))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                var_15_2E7 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ub7dc\u7e3f\u7d52\ub8be\u385b\ub7dc, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)
                
                if (logicalnot:boolean(invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, var_12_80:\u34df\u4492\u71ae\uc238\u7873\uafe7, var_8_6F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                    return:Optional<\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72>(invokestatic:Optional<\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72>(Optional<T>::empty))
                }
                
                var_16_2F4 = ldc:int(-1)
                
                while (cmplt:boolean(var_16_2F4:int, xor:int(ldc:int(-27392), ldc:int(-27390)))) {
                    var_17_322 = and:int(ldc:int(-5987), ldc:int(5986))
                    
                    while (cmplt:boolean(var_17_322:int, xor:int(ldc:int(2113), ldc:int(2115)))) {
                        var_18_33B = ldc:int(-1)
                        
                        while (cmplt:boolean(var_18_33B:int, and:int(ldc:int(3611), ldc:int(16387)))) {
                            var_19_36B = ternaryop:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(cmpge:boolean(var_18_33B:int, ldc:int(0)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\ubb2b\ubefe\u9033\uc246\u5db4)))
                            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_8_6F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], add:int(mul:int(var_17_322:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)), mul:int(var_16_2F4:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_15_2E7:\u760c\u4975\u4179\uc246\u8640\u64f2))), var_18_33B:int, add:int(mul:int(var_17_322:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)), mul:int(var_16_2F4:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_15_2E7:\u760c\u4975\u4179\uc246\u8640\u64f2))))
                            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], var_19_36B:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                            inc:int(var_18_33B, ldc:int(1))
                        }
                        
                        inc:int(var_17_322, ldc:int(1))
                    }
                    
                    inc:int(var_16_2F4, ldc:int(1))
                }
            }
            
            var_15_C9 = ldc:int(-1)
            
            while (cmplt:boolean(var_15_C9:int, and:int(ldc:int(16515), ldc:int(55)))) {
                var_16_3DE = ldc:int(-1)
                
                while (cmplt:boolean(var_16_3DE:int, xor:int(ldc:int(8211), ldc:int(8215)))) {
                    if (cmpne:boolean(var_15_C9:int, ldc:int(-1))) {
                        if (cmpne:boolean(var_15_C9:int, xor:int(ldc:int(4097), ldc:int(4099)))) {
                            if (cmpne:boolean(var_16_3DE:int, ldc:int(-1))) {
                                if (cmpne:boolean(var_16_3DE:int, xor:int(ldc:int(283), ldc:int(280)))) {
                                    goto(Label_1120)
                                }
                            }
                        }
                    }
                    
                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_8_6F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], mul:int(var_15_C9:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_16_3DE:int, mul:int(var_15_C9:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)))
                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\ubb2b\ubefe\u9033\uc246\u5db4)), and:int(ldc:int(4163), ldc:int(8327)))
                    Label_1120:
                    inc:int(var_16_3DE, ldc:int(1))
                }
                
                inc:int(var_15_C9, ldc:int(1))
            }
            
            var_15_3CB = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u6c56\u9033\ube23\ub7dc\uc31c\u97e6)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u6c52\u156b\u4179\u5654\uceb8\u9af2>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u6c52\u156b\u4179\u5654\uceb8\u9af2>](\u98a4\uc87f\u12cb\u3bc9\u6d99\u8413::\ud51e\u8640\ubf56\u4c2b\u67e9\u527a), p1:\u6c52\u156b\u4179\u5654\uceb8\u9af2))
            var_16_3D4 = and:int(ldc:int(-14928), ldc:int(6727))
            
            while (cmplt:boolean(var_16_3D4:int, xor:int(ldc:int(2099), ldc:int(2097)))) {
                var_17_4A6 = and:int(ldc:int(-22594), ldc:int(22593))
                
                while (cmplt:boolean(var_17_4A6:int, and:int(ldc:int(515), ldc:int(17591)))) {
                    invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_8_6F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], mul:int(var_16_3D4:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)), var_17_4A6:int, mul:int(var_16_3D4:int, invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_5_67:\u760c\u4975\u4179\uc246\u8640\u64f2)))
                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), var_14_97:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], var_15_3CB:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, ldc:int(18))
                    inc:int(var_17_4A6, ldc:int(1))
                }
                
                inc:int(var_16_3D4, ldc:int(1))
            }
            
            return:Optional<\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72>(invokestatic:Optional<\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72>(Optional<T>::of, initobject:\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72(\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_8_6F:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), xor:int(ldc:int(-15839), ldc:int(-15837)), and:int(ldc:int(24875), ldc:int(2695)))))
        }
        
        goto(Label_0006)
    }
    
    private boolean \ub171\u718f\u12b2\ua6bd\u8df4\u47c2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p2, int p3) {
        var_5_BA : int
        var_7_69 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_8_6C : int
        var_9_A9 : int
        var_5_171 : int
        
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
        var_5_BA = and:int(ldc:int(-531073247), ldc:int(-318884894))
        var_7_69 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ub7dc\u7e3f\u7d52\ub8be\u385b\ub7dc, p2:\u760c\u4975\u4179\uc246\u8640\u64f2)
        var_8_6C = ldc:int(-1)
        
        loop {
            Label_0110:
            
            if (cmpeq:boolean(and:int(var_5_BA:int, ldc:int(134217728)), ldc:int(0))) {
                var_5_BA = and:int(var_5_BA:int, ldc:int(-119966989))
                
                if (cmplt:boolean(var_8_6C:int, and:int(ldc:int(8775), ldc:int(16395)))) {
                    var_9_A9 = ldc:int(-1)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_5_BA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_5_BA = and:int(var_5_BA:int, ldc:int(1719980353))
                            goto(Label_0323)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_5_BA = and:int(var_5_BA:int, ldc:int(-640008337))
                            
                            if (cmplt:boolean(var_9_A9:int, xor:int(ldc:int(8499), ldc:int(8503)))) {
                                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, p1:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], add:int(mul:int(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, p2:\u760c\u4975\u4179\uc246\u8640\u64f2), var_8_6C:int), mul:int(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u4bc8\u9255\ub19c\u5f50\u12cb\u392e, var_7_69:\u760c\u4975\u4179\uc246\u8640\u64f2), p3:int)), var_9_A9:int, add:int(mul:int(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, p2:\u760c\u4975\u4179\uc246\u8640\u64f2), var_8_6C:int), mul:int(invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u88c5\u3e2a\u600f\u99f7\u8308\ufe34, var_7_69:\u760c\u4975\u4179\uc246\u8640\u64f2), p3:int)))
                                
                                if (cmpge:boolean(var_9_A9:int, ldc:int(0))) {
                                    goto(Label_0323)
                                }
                                
                                if (invokevirtual:boolean(\u4daf\u4f52\u8d98\u6435\u7bad\u9af2::\u3e75\u92ff\uc87f\u16f6\u7c6b\u92ff, invokevirtual:\u4daf\u4f52\u8d98\u6435\u7bad\u9af2(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u6b5f\u4bc8\uae5d\u385b\u6d99\u6198, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), p1:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])))) {
                                    goto(Label_0323)
                                }
                                
                                return:boolean(and:int[expected:boolean](ldc:int(-5860), ldc:int(5731)))
                            }
                        }
                        
                        Label_0220:
                        
                        if (cmpne:boolean(and:int(var_5_BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_5_BA = and:int(var_5_BA:int, ldc:int(-1221914113))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_5_BA:int, ldc:int(4194304)), ldc:int(0))) {
                                var_5_BA = and:int(var_5_BA:int, ldc:int(-486695973))
                                loopcontinue()
                            }
                            
                            var_5_BA = and:int(var_5_BA:int, ldc:int(-1451689818))
                            inc:int(var_8_6C, ldc:int(1))
                            loopcontinue(Label_0110)
                        }
                        
                        Label_0323:
                        
                        if (cmpeq:boolean(and:int(var_5_BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_5_BA = and:int(var_5_BA:int, ldc:int(1527936496))
                            goto(Label_0220)
                        }
                        
                        if (cmpne:boolean(and:int(var_5_BA:int, ldc:int(16777216)), ldc:int(0))) {
                            var_5_BA = and:int(var_5_BA:int, ldc:int(-762569363))
                        }
                        else {
                            var_5_171 = and:int(var_5_BA:int, ldc:int(-1174407641))
                            
                            if (logicaland:boolean(cmpge:boolean(var_9_A9:int, ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u416d\ub113\u8bb0\u416d\u946b\u3504, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), p1:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])))) {
                                return:boolean(and:int[expected:boolean](ldc:int(-2362), ldc:int(2105)))
                            }
                            
                            var_5_BA = and:int(var_5_171:int, ldc:int(-839173444))
                            inc:int(var_9_A9, ldc:int(1))
                        }
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_5_BA:int, ldc:int(134217728)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(12308), ldc:int(12309)))
            }
        }
    }
    
    private \u56bd\u8413\u647c\u5bc4\ud158.\u1187\u4cd9\u3dd3\u98a4\ubcb0\u4e72 lambda$\u6435\u59ec\u9937\u392e\u8389\ub83f$5(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
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
    
    private boolean lambda$\u6c52\u98a4\ube23\u7330\u92ee\u8c8a$4(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            var_3_61 = and:int(ldc:int(1526031672), ldc:int(48830782))
            
            if (cmpne:boolean(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-688523407))
                stack_8F_0 = and:int(ldc:int(-9891), ldc:int(8866))
            }
            else {
                stack_8F_0 = and:int(ldc:int(9345), ldc:int(16995))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u9255\u9255\u6d69\u6d99\ufe34\u624e$3(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\ud158\u4179\u4492\u0800\u416d\u927d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u5140\u6bb9\ua3b4\ubf56\u6b5f::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, p0:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u6c52\u156b\u4179\u5654\uceb8\u9af2>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u6c52\u156b\u4179\u5654\uceb8\u9af2>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\uc229\u8753\u392e\u40a9\u4daf\u74b1)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5f50\ud158\u8753\u5140\u6bb9\u9a18$2(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, p0:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)))
        }
        
        goto(Label_0006)
    }
    
    private static double lambda$\u4c04\u1187\ufe34\u6cfe\ub32d\u99f7$1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:double(invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c, p1:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ucef1\u5f50\u6198\ubefe\u718f\ud158$0(\ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p0) {
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
            var_1_61 = and:int(ldc:int(-584223943), ldc:int(926669373))
            
            if (cmpne:boolean(p0:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, getstatic:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u40a9\u4cd9\uc3e3\uc229\u624e\u88c5))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2043521755))
                stack_8A_0 = and:int(ldc:int(-9859), ldc:int(9858))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(836), ldc:int(837))
            }
            
            return:boolean(stack_8A_0:int)
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
    
    public void \uc87f\u7006\u9033\ua562\u51b2\ud217(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_6C3 = and:int(ldc:int(176603428), ldc:int(-487172713))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u6bb9\ua3b4\ubf56\u6b5f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(988083837))
            var_5_81 = and:int(ldc:int(-319), ldc:int(314))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17066), ldc:int(17065)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(315389821))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-20479), ldc:int(-20480)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1), ldc:int(21537)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(-33268387))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(12865), ldc:int(1437)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1385393759))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1488937591))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1459309343))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1696950135))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(207065326))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(427043638))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1568529818))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(764414095))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-277873124))
                        var_11_EB = and:int(ldc:int(-23053), ldc:int(23052))
                        goto(Label_1607)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(17553830))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1588407941))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-734885693))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1609658024))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1357583963))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1066568248))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2142872921))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1724043940))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1801638865))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1606847063))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1965018097))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1411550378))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1052311848))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(629904815))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1859303294))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(123931838))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1691804561))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(617642875))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1867478492))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(17477), ldc:int(17))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1931926015))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-849958908))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1662557807))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(878260979))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1571565487))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(930697175))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1345598754))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(60618174))
                        var_11_EB = and:int(ldc:int(2291), ldc:int(-2292))
                    }
                    
                    Label_1173:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(73375387))
                        goto(Label_1618)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(55368954))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(750871321))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1863216884))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1515624720))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1137924704))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(993686967))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(381436421))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1470)
                            }
                        }
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(829491846))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1599985757))
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-553342090))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(9959967))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(435765353))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1772134307))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1607)
                    }
                    
                    Label_1470:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1209210066))
                        goto(Label_1618)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(712405328))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1261865290))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1437533264))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(734852559))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1607:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1618:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1320717807))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(521152489))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(639601347))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1943339680))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-166763450))
                        var_17_6CE = add:int(var_16_119:int, xor:int(ldc:int(28676), ldc:int(28677)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(698217077))
                
                if (cmple:boolean(var_5_81 = var_17_6CE:int, sub:int(var_6_88:int, and:int(ldc:int(2563), ldc:int(29721))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1197932581))
            goto(Label_0108)
        }
    }
}
