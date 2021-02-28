public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u839e\u5245\ud7e8\u99f7\u516c {
    public void \u839e\u5245\ud7e8\u99f7\u516c(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25 p0) {
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
    
    public void \ud171\u8640\ubcb0\ube23\u4daf\u5bc4() {
        var_1_5F : int
        var_3_97 : \ua3b4\u8aa5\ub113\ubf56\u873d
        var_1_103 : int
        var_7_16B : float
        var_1_178 : int
        var_8_188 : double
        var_10_199 : double
        var_12_1BF : double
        expr_1C2 : \ua3b4\u9a18\ufcaf\ubff1\u3c25 [generated]
        var_14_1DF : float
        var_15_1E3 : float
        expr_210 : \ua3b4\u9a18\ufcaf\ubff1\u3c25 [generated]
        
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
        var_1_5F = and:int(ldc:int(-916174246), ldc:int(-379492340))
        putfield:int(\u839e\u5245\ud7e8\u99f7\u516c::\u6b5f\uc9f6\u0800\u59ec\u4daf\u61a4, this:\u839e\u5245\ud7e8\u99f7\u516c, add:int(getfield:int(\u839e\u5245\ud7e8\u99f7\u516c::\u6b5f\uc9f6\u0800\u59ec\u4daf\u61a4, this:\u839e\u5245\ud7e8\u99f7\u516c), and:int(ldc:int(4737), ldc:int(8229))))
        var_3_97 = invokevirtual:\ua3b4\u8aa5\ub113\ubf56\u873d(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\uf94d\ubefe\u8350\u416d\u3a62\u4e72, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getfield:\uc246\u1187\u2dcc\u3a62\u392e(\u839e\u5245\ud7e8\u99f7\u516c::\u62da\u7006\u8cae\uc7fe\u0800\u8258, this:\u839e\u5245\ud7e8\u99f7\u516c), getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)))
        
        if (cmpne:boolean(var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
            if (cmple:boolean(getfield:int(\u839e\u5245\ud7e8\u99f7\u516c::\u6b5f\uc9f6\u0800\u59ec\u4daf\u61a4, this:\u839e\u5245\ud7e8\u99f7\u516c), ldc:int(25))) {
                goto(Label_0233)
            }
            
            invokevirtual:void(\u0b8e\u6198\u40a9\uafe7\u6b5f::\u4d85\u8bb0\u8389\u3d4b\ub32d\u3e75, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u5140\u8413\u760c\uf995\u67e9>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u7c6b\u1833\u8258\u67e9\uc246\u8bb0))
            goto(Label_0192)
        }
        
        Label_0156:
        
        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-248332374))
            goto(Label_0233)
        }
        
        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-764733270))
            
            if (cmpge:boolean(getfield:int(\u839e\u5245\ud7e8\u99f7\u516c::\u6b5f\uc9f6\u0800\u59ec\u4daf\u61a4, this:\u839e\u5245\ud7e8\u99f7\u516c), ldc:int(100))) {
                var_3_97 = invokevirtual:\ua3b4\u8aa5\ub113\ubf56\u873d(\u6cfe\u8bb0\uc3e3\u8aa5\u624e::\uf94d\ubefe\u8350\u416d\u3a62\u4e72, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u6cfe\u8bb0\uc3e3\u8aa5\u624e](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getstatic:\uc246\u1187\u2dcc\u3a62\u392e(\u839e\u5245\ud7e8\u99f7\u516c::\u8cae\u3dd3\u8350\uc2bd\u4179\u6435), getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)))
                invokevirtual:void(\u0b8e\u6198\u40a9\uafe7\u6b5f::\u4d85\u8bb0\u8389\u3d4b\ub32d\u3e75, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\uc84e\u16f6\ufe34\u5140\uf9c5>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u8cae\ub83f\ub171\u647c\u6198\u69d9))
                
                if (cmpne:boolean(var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d())) {
                    invokevirtual:void(\u0b8e\u6198\u40a9\uafe7\u6b5f::\u4d85\u8bb0\u8389\u3d4b\ub32d\u3e75, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u0b8e\u40a9\ud4fe\ud158\u4c2b>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u74b1\u52d3\uc246\uc31c\ud523\uafe7))
                    invokevirtual:void(\u0b8e\u40a9\ud4fe\ud158\u4c2b::\uc31c\uc4d2\u4f4a\u74b1\u3d4b\u3dd3, checkcast:\u0b8e\u40a9\ud4fe\ud158\u4c2b(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u0b8e\u40a9\ud4fe\ud158\u4c2b.class, invokevirtual:\u0b8e\u40a9\ud4fe\ud158\u4c2b(\u0b8e\u6198\u40a9\uafe7\u6b5f::\uc238\u7330\uc2bd\u0c95\u92ff\u4bc8, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u0b8e\u40a9\ud4fe\ud158\u4c2b>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u74b1\u52d3\uc246\uc31c\ud523\uafe7))), initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                }
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-177595322))
        }
        else {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                return:void()
            }
            
            goto(Label_0156)
        }
        
        Label_0233:
        
        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
            var_1_5F = and:int(var_1_5F:int, ldc:int(1294481621))
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(1048576)), ldc:int(0))) {
            var_1_103 = and:int(var_1_5F:int, ldc:int(-1972500181))
            var_7_16B = add:float(d2f:float(mul:double(invokestatic:double(Math::acos, f2d:double(d2f:float(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u59ec\uae87\u97e6\ua3b4\u156b\ufcaf, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), ldc:float(0.017453292f)))), ldc:double(0.0), f2d:double(neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)), ldc:float(0.017453292f))))))), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))), ldc:double(0.0), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))))))))), ldc:double(57.2957763671875))), ldc:float(0.5f))
            
            if (logicalor:boolean(cmplt:boolean(var_7_16B:float, ldc:float(0.0f)), cmpgt:boolean(var_7_16B:float, ldc:float(10.0f)))) {
                var_1_178 = and:int(var_1_103:int, ldc:int(1735592620))
                var_8_188 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u8640\u6d99\u7330\ua61f\u7e3f\u4d85, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))))
                var_10_199 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_3_97:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u8640\u6d99\u7330\ua61f\u7e3f\u4d85, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))))
                var_12_1BF = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, sub:double(sub:double(ldc:double(180.0), mul:double(invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u16f6\u9255\ud36e\u718f\u7330\u836c, var_8_188:double, var_10_199:double), ldc:double(57.2957763671875))), f2d:double(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))))), ldc:double(-100.0), ldc:double(100.0))
                expr_1C2 = getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)
                putfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u3d64\u7e3f\u12b2\u12cb\u97b7\u8c8a, expr_1C2:\ua3b4\u9a18\ufcaf\ubff1\u3c25, mul:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u3d64\u7e3f\u12b2\u12cb\u97b7\u8c8a, expr_1C2:\ua3b4\u9a18\ufcaf\ubff1\u3c25), ldc:float(0.8f)))
                var_14_1DF = var_15_1E3 = add(invokestatic(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add(mul(var_8_188, var_8_188), mul(var_10_199, var_10_199))), ldc(1.0f))
                
                if (cmpgt:boolean(var_14_1DF:float, ldc:float(40.0f))) {
                    var_14_1DF = ldc:float(40.0f)
                }
                
                var_1_103 = and:int(var_1_178:int, ldc:int(-1494794690))
                putfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u3d64\u7e3f\u12b2\u12cb\u97b7\u8c8a, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c), d2f:float(add:double(f2d:double(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u3d64\u7e3f\u12b2\u12cb\u97b7\u8c8a, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))), mul:double(var_12_1BF:double, f2d:double(div:float(div:float(ldc:float(0.7f), var_14_1DF:float), var_15_1E3:float))))))
                expr_210 = getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c)
                putfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, expr_210:\ua3b4\u9a18\ufcaf\ubff1\u3c25, add:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, expr_210:\ua3b4\u9a18\ufcaf\ubff1\u3c25), getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u3d64\u7e3f\u12b2\u12cb\u97b7\u8c8a, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u839e\u5245\ud7e8\u99f7\u516c::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\u839e\u5245\ud7e8\u99f7\u516c))))
            }
            
            var_1_5F = and:int(var_1_103:int, ldc:int(-362025539))
            goto(Label_0192)
        }
        
        goto(Label_0156)
    }
    
    public void \u8258\u64f2\u52d3\ud523\u1187\u8bb0() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:int(\u839e\u5245\ud7e8\u99f7\u516c::\u6b5f\uc9f6\u0800\u59ec\u4daf\u61a4, this:\u839e\u5245\ud7e8\u99f7\u516c, and:int(ldc:int(-19187), ldc:int(19186)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\uc9f6\ud523\u0b8e\u74b1\ubff1<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u839e\u5245\ud7e8\u99f7\u516c> \u873d\u624e\ud171\ub83f\ub83f\u3bc9() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u839e\u5245\ud7e8\u99f7\u516c>(getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u839e\u5245\ud7e8\u99f7\u516c>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u52d3\ub102\uc7fe\uf9c5\u3504\ub19c))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6d99\u8df4\u4975\u527a\u4daf\u8d98$0(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_5F : int
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
            var_2_5F = and:int(ldc:int(331369593), ldc:int(-1253391269))
            
            if (cmpgt:boolean(invokestatic:double(Math::abs, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))), ldc:double(10.0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1696938369))
                stack_94_0 = and:int(ldc:int(-21107), ldc:int(20594))
            }
            else {
                stack_94_0 = and:int(ldc:int(1549), ldc:int(30865))
            }
            
            return:boolean(stack_94_0:int)
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
            putstatic:\uc246\u1187\u2dcc\u3a62\u392e(\u839e\u5245\ud7e8\u99f7\u516c::\u8cae\u3dd3\u8350\uc2bd\u4179\u6435, invokevirtual:\uc246\u1187\u2dcc\u3a62\u392e(\uc246\u1187\u2dcc\u3a62\u392e::\u51fa\u836c\u156b\ud7e8\u183a\uc910, initobject:\uc246\u1187\u2dcc\u3a62\u392e(\uc246\u1187\u2dcc\u3a62\u392e::<init>), ldc:double(150.0)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc246\ucfaf\u416d\u3504\u4d85\u7330(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67F : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_68A : int
        
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
        var_3_67F = and:int(ldc:int(216644968), ldc:int(750828814))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\u5245\ud7e8\u99f7\u516c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(522160174))
        }
        else {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-151716424))
            var_5_89 = and:int(ldc:int(-14014), ldc:int(5689))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21201), ldc:int(-23286)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_67F:int, ldc:int(-1782186007))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(261), ldc:int(1153)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(-27584), ldc:int(-27583)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_67F = and:int(var_3_E2:int, ldc:int(1694039981))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(5760), ldc:int(5761)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1669863089))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1266008864))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(39608345))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1940316652))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0869)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1410795191))
                    }
                    else {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1376995940))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0869)
                        }
                    }
                    
                    Label_0426:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1553864832))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1622348407))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(6388787))
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1381256080))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(352255417))
                            var_11_F3 = and:int(ldc:int(-3863), ldc:int(3844))
                            goto(Label_1542)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(178388280))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1699052791))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(107983391))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-197032282))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1761466554))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0869)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(805024653))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(786170853))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-285409490))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0869)
                        }
                    }
                    
                    Label_0740:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1501094012))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1064748497))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1066117963))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1733345307))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-540281539))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0869:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(20463648))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1490968242))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(434282672))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(117372332))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(225), ldc:int(8707))
                                goto(Label_1160)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1938916679))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1302425539))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1223670583))
                            goto(Label_0869)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1897750273))
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1301898842))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1172800621))
                            goto(Label_0426)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-842877668))
                        var_11_F3 = and:int(ldc:int(6322), ldc:int(-7671))
                    }
                    
                    Label_1160:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(735108724))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1715652992))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(730014630))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0869)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1575406446))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1724626430))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1160)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0869)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-515870585))
                            goto(Label_0426)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(250541516))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1542)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1391:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1997237731))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1221288994))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1356442820))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2061746358))
                        goto(Label_0869)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(139482892))
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2038575925))
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(2095707464))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1542:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68A = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1553:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-335275770))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-26277394))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1634494856))
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1021546518))
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-723058738))
                        var_17_68A = add:int(var_16_121:int, xor:int(ldc:int(-16350), ldc:int(-16349)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67F = and:int(var_3_67F:int, ldc:int(1691992010))
                
                if (cmple:boolean(var_5_89 = var_17_68A:int, sub:int(var_6_90:int, and:int(ldc:int(14081), ldc:int(139))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-288694410))
            goto(Label_0108)
        }
    }
}
