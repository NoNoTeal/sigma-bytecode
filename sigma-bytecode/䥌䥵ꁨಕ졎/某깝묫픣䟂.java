public class \u494c\u4975\ua068\u0c95\uc84e.\u67d0\uae5d\ubb2b\ud523\u47c2 {
    public void \u67d0\uae5d\ubb2b\ud523\u47c2(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, int p4, int p5) {
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
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_2_5F : int
        var_4_68 : int
        var_5_71 : double
        var_7_7A : int
        var_8_8B : float
        var_9_9C : float
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(-342574035), ldc:int(-359932905))
            var_4_68 = l2i:int(invokevirtual:long(\u92ee\u4492\ubded\u3c25\u59ec::\u16f6\ub7dc\u8bb0\ufcaf\u67e9, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2)))
            var_5_71 = invokevirtual:double(\u92ee\u4492\ubded\u3c25\u59ec::\ubff1\u7ce1\u6435\u3c25\u071d, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2))
            var_7_7A = invokevirtual:int(\u92ee\u4492\ubded\u3c25\u59ec::\u8308\u88c5\u64ab\u527a\u5fe1, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2))
            var_8_8B = invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, div:float(i2f:float(var_4_68:int), i2f:float(var_7_7A:int)), ldc:float(1.0f)))
            var_9_9C = invokestatic:float(Math::max, ldc:float(0.0f), invokestatic:float(Math::min, div:float(d2f:float(var_5_71:double), i2f:float(var_7_7A:int)), ldc:float(1.0f)))
            
            if (invokevirtual:boolean(\uafe7\u72f1\u7e3f\uc238\u34df::\u8aa5\u8d90\u5bc4\u3504\u16f6, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\uafe7\u72f1\u7e3f\uc238\u34df])) {
                if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\uc29a\u946b\ucef1\u4e72\u64f2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])) {
                    if (cmpne:boolean(var_5_71:double, ldc:double(0.0))) {
                        putfield:float(\u67d0\uae5d\ubb2b\ud523\u47c2::\u4492\ub8be\u67e9\u98a4\u4c2b, this:\u67d0\uae5d\ubb2b\ud523\u47c2, invokestatic:float(Math::min, invokestatic:float(Math::max, div:float(i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u4e72\u120d\u16f6\u6fb0\u4cd9, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u0a06\u600f\u8bb0\u392e\ud36e, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), ldc:float(0.0f)), var_9_9C:float))
                        var_8_8B = getfield:float(\u67d0\uae5d\ubb2b\ud523\u47c2::\u4492\ub8be\u67e9\u98a4\u4c2b, this:\u67d0\uae5d\ubb2b\ud523\u47c2)
                    }
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-9190112))
                    goto(Label_0353)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-752943749))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(730561676))
                    
                    if (cmpeq:boolean(var_4_68:int, ldc:int(0))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u92ee\u4492\ubded\u3c25\u59ec::\u62da\u47c2\ua6bd\ubf56\u836c, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2)))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(1799502093))
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.43f), p0:float)))
                            goto(Label_0353)
                        }
                    }
                }
                
                Label_0205:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1153532986))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u8413\u8df4\u3776\u8d98\ucb79)), ldc:float(0.075f)))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, add:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), var_9_9C:float)), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), sub:float(ldc:float(1.0f), var_9_9C:float)), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.43f), p0:float)))
                    invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), var_8_8B:float), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), mul:float(p0:float, p0:float)))
                    
                    if (cmpne:boolean(var_8_8B:float, ldc:float(0.0f))) {
                        invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, add:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), var_8_8B:float)), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(5.0f), ldc:float(5.0f), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u0c95\u4f4a\u7043\u8350\u3711))
                    }
                }
                
                Label_0353:
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0205)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1266720224))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6d69\u7c6b\u4c2b\u5d20\uc4d2$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\uc29a\u946b\ucef1\u4e72\u64f2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])) {
                if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\u8d90\ud36e\uc4d2\ua562\ubff1, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:\u12cb\u93a2\ubf56\uc229\u8d90])) {
                    invokevirtual:void(\u92ee\u4492\ubded\u3c25\u59ec::\ub83f\uc9f6\u47c2\u67d0\u7ce1, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2), i2d:double(d2i:int(invokestatic:double(Math::min, i2d:double(f2i:int(mul:float(getfield:float(\u67d0\uae5d\ubb2b\ud523\u47c2::\u4492\ub8be\u67e9\u98a4\u4c2b, this:\u67d0\uae5d\ubb2b\ud523\u47c2), i2f:float(invokevirtual:int(\u92ee\u4492\ubded\u3c25\u59ec::\u8308\u88c5\u64ab\u527a\u5fe1, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2)))))), invokevirtual:double(\u92ee\u4492\ubded\u3c25\u59ec::\ubff1\u7ce1\u6435\u3c25\u071d, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2))))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5f50\u1833\uc7fe\u8bb0\u62da$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:float(\u67d0\uae5d\ubb2b\ud523\u47c2::\u4492\ub8be\u67e9\u98a4\u4c2b, this:\u67d0\uae5d\ubb2b\ud523\u47c2, invokestatic:float(Math::min, div:float(i2f:float(l2i:int(invokevirtual:long(\u92ee\u4492\ubded\u3c25\u59ec::\u16f6\ub7dc\u8bb0\ufcaf\u67e9, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2)))), i2f:float(invokevirtual:int(\u92ee\u4492\ubded\u3c25\u59ec::\u8308\u88c5\u64ab\u527a\u5fe1, getfield:\u92ee\u4492\ubded\u3c25\u59ec(\u67d0\uae5d\ubb2b\ud523\u47c2::\u718f\u4f4a\ud4fe\u34df\u839e, this:\u67d0\uae5d\ubb2b\ud523\u47c2)))), ldc:float(1.0f)))
            return:void()
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
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D8 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_6E3 : int
        
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
        var_3_6D8 = and:int(ldc:int(-1353696473), ldc:int(-1370140701))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67d0\uae5d\ubb2b\ud523\u47c2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1371699273))
            var_5_7D = and:int(ldc:int(8424), ldc:int(-8427))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4368), ldc:int(-4369)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_6D8:int, ldc:int(-14796817))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, and:int(ldc:int(1787), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(8995), ldc:int(4237)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_6D8 = and:int(var_3_CD:int, ldc:int(-942504578))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(260), ldc:int(261)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(372448232))
                        goto(Label_1622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1196166046))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1371306308))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(96700766))
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1085121604))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-509641248))
                    }
                    else {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-820419794))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1360630554))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1110355375))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1097728258))
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-371268339))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1631905430))
                            var_11_DE = and:int(ldc:int(-15271), ldc:int(13062))
                            goto(Label_1611)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1270633324))
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1242549047))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(547490502))
                        goto(Label_1166)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0997)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-792227048))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1215176265))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-32714875))
                            loopcontinue()
                        }
                        
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1768747661))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1660164009))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(644714598))
                        goto(Label_0997)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-2026835615))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1215469212))
                            loopcontinue()
                        }
                        
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1075988169))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1852008508))
                        goto(Label_1622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(224467369))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(377097083))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-548071914))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1730649107))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1895163837))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-384650277))
                            loopcontinue()
                        }
                        
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1611056785))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(-32223), ldc:int(-32224))
                                goto(Label_1166)
                            }
                        }
                    }
                    
                    Label_0997:
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-277430570))
                        goto(Label_1622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1186736810))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(724171554))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1735960497))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1626575906))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-969853509))
                        var_11_DE = and:int(ldc:int(28938), ldc:int(-29996))
                    }
                    
                    Label_1166:
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1422483894))
                        goto(Label_1622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0997)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(320304184))
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-937298943))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1389294869))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1043697691))
                            loopcontinue()
                        }
                        
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-2038628886))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1449)
                            }
                        }
                    }
                    
                    Label_1299:
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1180041476))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1166)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(247717499))
                            goto(Label_0997)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-2065792299))
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1027893071))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1174733508))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(766230265))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-149316238))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                            goto(Label_1611)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1449:
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1077623137))
                        goto(Label_1622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1586157853))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-551027653))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-501966107))
                        goto(Label_0997)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1513424762))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-713638435))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(854466509))
                        loopcontinue()
                    }
                    
                    var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1353063518))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1611:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E3 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1622:
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1543650722))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(794341822))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1309079823))
                        goto(Label_1166)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(1786577922))
                        goto(Label_0997)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-129078748))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1733588061))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-1094849601))
                        var_17_6E3 = add:int(var_16_10C:int, xor:int(ldc:int(5140), ldc:int(5141)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6D8 = and:int(var_3_6D8:int, ldc:int(-21047378))
                
                if (cmple:boolean(var_5_7D = var_17_6E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8200), ldc:int(8201))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6D8:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
