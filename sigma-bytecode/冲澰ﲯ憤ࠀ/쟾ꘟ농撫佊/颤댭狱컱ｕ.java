public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u98a4\ub32d\u72f1\ucef1\uff55 {
    public void \u98a4\ub32d\u72f1\ucef1\uff55(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, \u5d20\u97b7\u8753\u873d\u16f6.\ucef1\u3504\u64f2\u6cfe\u52d3[] p4) {
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
    
    private void \u93a2\u1187\u5654\u8413\u3a62\ua61f(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c p0) {
        var_4_6C : int
        var_5_7B : int
        var_6_84 : int
        var_7_88 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_6C = rem:int(getfield:int(\u98a4\ub32d\u72f1\ucef1\uff55::\ua3b4\u8aa5\ub113\ubf56\u873d, this:\u98a4\ub32d\u72f1\ucef1\uff55), and:int(ldc:int(24727), ldc:int(5987)))
            var_5_7B = d2i:int(invokestatic:double(Math::floor, f2d:double(div:float(i2f:float(getfield:int(\u98a4\ub32d\u72f1\ucef1\uff55::\ua3b4\u8aa5\ub113\ubf56\u873d, this:\u98a4\ub32d\u72f1\ucef1\uff55)), ldc:float(3.0f)))))
            var_6_84 = xor:int(ldc:int(14480), ldc:int(14394))
            var_7_88 = ldc:int(80)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u600f\u99f7\u3dd3\u5654\u4daf(\u600f\u99f7\u3dd3\u5654\u4daf::<init>, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90], invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u67d0\u98a4\uc910\u4f4a\u8c8a, p0:\ud158\u839e\u7006\uc3e3\u446c), add:int(ldc:int(40), mul:int(var_6_84:int, var_4_6C:int)), add:int(ldc:int(72), mul:int(var_7_88:int, var_5_7B:int)), var_6_84:int, var_7_88:int, p0:\ud158\u839e\u7006\uc3e3\u446c))
            putfield:int(\u98a4\ub32d\u72f1\ucef1\uff55::\ua3b4\u8aa5\ub113\ubf56\u873d, this:\u98a4\ub32d\u72f1\ucef1\uff55, add:int(getfield:int(\u98a4\ub32d\u72f1\ucef1\uff55::\ua3b4\u8aa5\ub113\ubf56\u873d, this:\u98a4\ub32d\u72f1\ucef1\uff55), xor:int(ldc:int(232), ldc:int(233))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u156b\u72f1\u3e75\u72f1\u983f(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c p0) {
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
        var_2_70 : int
        var_4_7A : Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>
        var_5_A6 : \u12cb\u93a2\ubf56\uc229\u8d90
        
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
        var_2_5F = and:int(ldc:int(-236659826), ldc:int(998232575))
        invokespecial:void(\u7af6\u3c25\u071d\u6ec6\u120d::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u7af6\u3c25\u071d\u6ec6\u120d], p0:float)
        
        if (cmpeq:boolean(getfield:\u8d98\uc4d2\u8709\u64f2\u9a18(\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55), aconstnull:\u8d98\uc4d2\u8709\u64f2\u9a18())) {
            var_2_70 = and:int(var_2_5F:int, ldc:int(-176291940))
            var_4_7A = invokeinterface:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>(List<\u12cb\u93a2\ubf56\uc229\u8d90>::iterator, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_7A:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>)) {
                var_5_A6 = checkcast:\u12cb\u93a2\ubf56\uc229\u8d90(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90.class, invokeinterface:\u12cb\u93a2\ubf56\uc229\u8d90(Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>::next, var_4_7A:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>))
                
                if (instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\u600f\u99f7\u3dd3\u5654\u4daf.class, var_5_A6:\u12cb\u93a2\ubf56\uc229\u8d90)) {
                    if (cmpeq:boolean(invokevirtual:float(\u8d98\ua068\u4492\u9af2\u5f50::\u34df\ubefe\uc2bd\u8308\u8d90\uc3e3, getfield:\u8d98\ua068\u4492\u9af2\u5f50(\u98a4\ub32d\u72f1\ucef1\uff55::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u98a4\ub32d\u72f1\ucef1\uff55)), ldc:float(1.0f))) {
                        if (invokevirtual:boolean(\u12cb\u93a2\ubf56\uc229\u8d90::\u8413\uc229\u6fb0\uc7fe\u5f50, var_5_A6:\u12cb\u93a2\ubf56\uc229\u8d90, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u4e72\u120d\u16f6\u6fb0\u4cd9, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\ub70c\ub19c\uc3e3\uae5d\u92ee, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))) {
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\u8d98\u1187\ub6ab\u156b::\u4e72\u120d\u16f6\u6fb0\u4cd9), ldc:float(20.0f), i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(26))), invokevirtual:String(\ud158\u839e\u7006\uc3e3\u446c::\u5bc4\uf9c5\u5140\u759a\u156b, getfield:\ud158\u839e\u7006\uc3e3\u446c(\u600f\u99f7\u3dd3\u5654\u4daf::\u0a06\u600f\u8bb0\u392e\ud36e, checkcast:\u600f\u99f7\u3dd3\u5654\u4daf(\u927d\u92ff\u71ae\uafe7\u6bb9.\u600f\u99f7\u3dd3\u5654\u4daf.class, var_5_A6:\u600f\u99f7\u3dd3\u5654\u4daf[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), ldc:int(-14540254))
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u36d3\u9255\u7873\u8350\uc3e3\u56bd, ldc:float(5.0f), i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(27))), ldc:float(12.0f), ldc:float(24.0f))
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, ldc:float(5.0f), i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(27))), ldc:float(24.0f), ldc:float(24.0f), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u6435\u3711\ubff1\u61a4\u647c::\u69d9\u16f6\u446c\u74b1\u76bc))
                            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\ud523\u4bc8\ub18d\u7d52\u4e72\u97b7)
                            looporswitchbreak()
                        }
                    }
                }
                
                var_2_70 = and:int(var_2_70:int, ldc:int(796163534))
            }
        }
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
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
    
    private void lambda$\ua3b4\ub1b9\uceb8\u3a62\u92ff\u59ec$2() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u8389\u494c\u7006\ub19c, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90], getfield:\u8d98\uc4d2\u8709\u64f2\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55))
            putfield:\u8d98\uc4d2\u8709\u64f2\u9a18(\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55, aconstnull:\u8d98\uc4d2\u8709\u64f2\u9a18())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u983f\u71ae\ub1b9\u8308\u6d99\u647c$1(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c p0) {
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
        
        if (cmpeq:boolean(getfield:\u8d98\uc4d2\u8709\u64f2\u9a18(\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55), aconstnull:\u8d98\uc4d2\u8709\u64f2\u9a18())) {
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90], putfield:\u8d98\uc4d2\u8709\u64f2\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55, initobject:\u8d98\uc4d2\u8709\u64f2\u9a18(\u8d98\uc4d2\u8709\u64f2\u9a18::<init>, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90], loadelement:String(getstatic:String[](\u98a4\ub32d\u72f1\ucef1\uff55::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(8449), ldc:int(7809))), xor:int(ldc:int(-15327), ldc:int(-15324)), ldc:int(70), sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(10)), sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(75)), p0:\ud158\u839e\u7006\uc3e3\u446c)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u74b1\u392e\u99f7\ud171\u4d85, getfield:\u8d98\uc4d2\u8709\u64f2\u9a18[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55), xor:int[expected:boolean](ldc:int(20738), ldc:int(20739)))
        }
    }
    
    private void lambda$\u8c8a\u946b\uc246\uf995\u392e\u8413$0(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, int p1) {
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
        
        if (cmpeq:boolean(getfield:\u8d98\uc4d2\u8709\u64f2\u9a18(\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55), aconstnull:\u8d98\uc4d2\u8709\u64f2\u9a18())) {
            invokevirtual:void(\u385b\u6ec6\uc29a\ud171\ub6ab::\u40a9\u8753\u9937\u4daf\uc2bd\ufe34, checkcast:\u385b\u6ec6\uc29a\ud171\ub6ab(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u385b\u6ec6\uc29a\ud171\ub6ab.class, invokevirtual:\u12cb\u93a2\ubf56\uc229\u8d90[expected:\u385b\u6ec6\uc29a\ud171\ub6ab](\u12cb\u93a2\ubf56\uc229\u8d90::\ubf56\ubf56\u416d\u40a9\u52d3, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:\u12cb\u93a2\ubf56\uc229\u8d90])))
            return:void()
        }
        
        invokevirtual:void(\u8d98\uc4d2\u8709\u64f2\u9a18::\u9937\ub7dc\u3c25\ub19c\u7e3f\u4cd9, getfield:\u8d98\uc4d2\u8709\u64f2\u9a18(\u98a4\ub32d\u72f1\ucef1\uff55::\ub70c\u51b2\u6b0d\ud12e\u9a18, this:\u98a4\ub32d\u72f1\ucef1\uff55))
    }
    
    static {
        var_0_21F : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_16B_0 : byte[] [generated]
        stack_1A9_0 : byte[] [generated]
        stack_243_0 : byte[] [generated]
        stack_294_0 : byte[] [generated]
        stack_303_0 : byte[] [generated]
        stack_363_0 : byte[] [generated]
        stack_3EA_0 : byte[] [generated]
        var_4_20A : int
        var_3_20F : byte[]
        var_5_210 : int
        expr_243 : byte [generated]
        var_0_37D : int
        expr_363 : byte [generated]
        stack_3B5_2 : byte [generated]
        stack_389_0 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_282 : byte[]
        var_5_283 : int
        expr_E9 : int [generated]
        expr_121 : int [generated]
        expr_16B : int [generated]
        var_3_3D8 : byte[]
        var_5_3D9 : int
        var_3_1B5 : String
        stack_203_0 : String[] [generated]
        expr_1C7 : String[] [generated]
        
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
        var_0_21F = and:int(ldc:int(221866976), ldc:int(-1919055511))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AEh5BYo5xwi4djfFyA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_20A = expr_6E:int
        var_3_20F = newarray:byte[](byte.class, expr_6E:int)
        var_5_210 = expr_6E:int
        Label_0530:
        
        while (cmpne:boolean(and:int(var_0_21F:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(1235643912))
                goto(Label_0731)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-805308109))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_243 = loadelement:byte(stack_243_0:byte[], var_5_210:int)
            storeelement:byte(var_3_20F:byte[], var_5_210:int, or:int(and:int(shl:int(expr_243:byte, and:int(ldc:int(12372), ldc:int(517))), ldc:int(-16)), and:int(shr:int(expr_243:byte[expected:int], and:int(ldc:int(18948), ldc:int(118))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = var_3_20F:byte[]
            goto(Label_0115)
        }
        
        var_0_21F = and:int(var_0_21F:int, ldc:int(-1491955730))
        goto(Label_0818)
        Label_0731:
        
        while (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0530)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(223996286))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, xor:byte(loadelement:byte(stack_303_0:byte[], var_5_210:int), ldc:byte(33)))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = var_3_20F:byte[]
            goto(Label_0238)
        }
        
        var_0_21F = and:int(var_0_21F:int, ldc:int(1949442982))
        Label_0818:
        
        while (cmpne:boolean(and:int(var_0_21F:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(32768)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(1433950141))
                goto(Label_0530)
            }
            
            var_0_37D = and:int(var_0_21F:int, ldc:int(800712992))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_363 = stack_3B5_2 = loadelement(stack_363_0, var_5_210)
            
            if (cmplt:boolean(add:int(add:int(var_5_210:int, ldc:int(5)), neg:int(var_4_20A:int)), ldc:int(0))) {
                stack_3B5_2 = stack_389_0 = add:byte(expr_363:byte, loadelement:byte(var_3_20F:byte[], add:int(var_5_210:int, ldc:int(5))))
                goto(Label_0921)
            }
            
            Label_0880:
            
            if (cmpne:boolean(and:int(var_0_37D:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_37D = and:int(var_0_37D:int, ldc:int(-2106491359))
            }
            else {
                var_0_37D = and:int(var_0_37D:int, ldc:int(-48262365))
                stack_3B5_2 = stack_389_0 = add:byte(expr_363:byte, ldc:byte(5))
            }
            
            Label_0921:
            
            if (cmpeq:boolean(and:int(var_0_37D:int, ldc:int(256)), ldc:int(0))) {
                var_0_37D = and:int(var_0_37D:int, ldc:int(-823742093))
                goto(Label_0880)
            }
            
            var_0_21F = and:int(var_0_37D:int, ldc:int(-585530457))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, stack_3B5_2:byte)
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = var_3_20F:byte[]
            goto(Label_0294)
        }
        
        var_0_21F = and:int(var_0_21F:int, ldc:int(-308218165))
        goto(Label_0731)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-2102228649))
            goto(Label_0294)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-843498663))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_282 = newarray:byte[](byte.class, expr_A8:int)
                var_5_283 = expr_A8:int
                
                loop {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-583452756))
                    var_5_283 = add:int(var_5_283:int, ldc:int(-1))
                    storeelement:byte(var_3_282:byte[], var_5_283:int, add:int(shl:int(loadelement:byte(stack_294_0:byte[], var_5_283:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_283:int, xor:int(ldc:int(-29692), ldc:int(-29691)))), ldc:int(2)), xor:int(ldc:int(5291), ldc:int(5268)))))
                    
                    if (cmpne:boolean(var_5_283:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = var_3_282:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1051040677))
            goto(Label_0368)
        }
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0294)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(1892794266))
        }
        else {
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-577116203))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_20A = expr_E9:int
                var_3_20F = newarray:byte[](byte.class, expr_E9:int)
                var_5_210 = expr_E9:int
                goto(Label_0731)
            }
        }
        
        Label_0238:
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(1234245505))
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(1574648259))
            expr_121 = arraylength:int(stack_121_0:byte[])
            
            if (cmpne:boolean(expr_121:int, ldc:int(0))) {
                var_4_20A = expr_121:int
                var_3_20F = newarray:byte[](byte.class, expr_121:int)
                var_5_210 = expr_121:int
                goto(Label_0818)
            }
        }
        
        Label_0294:
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(79641705))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(546432854))
                goto(Label_0173)
            }
            
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(-1038813994))
                goto(Label_0115)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-4464713))
            expr_16B = arraylength:int(stack_16B_0:byte[])
            
            if (cmpne:boolean(expr_16B:int, ldc:int(0))) {
                var_3_3D8 = newarray:byte[](byte.class, expr_16B:int)
                var_5_3D9 = expr_16B:int
                
                loop {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-574898255))
                    var_5_3D9 = add:int(var_5_3D9:int, ldc:int(-1))
                    storeelement:byte(var_3_3D8:byte[], var_5_3D9:int, add:byte(loadelement:byte(stack_3EA_0:byte[], var_5_3D9:int), ldc:byte(108)))
                    
                    if (cmpne:boolean(var_5_3D9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_243_0 = stack_294_0 = stack_303_0 = stack_363_0 = stack_3EA_0 = var_3_3D8:byte[]
            }
        }
        
        Label_0368:
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-932312739))
            goto(Label_0294)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(1051102740))
            goto(Label_0173)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(32768)), ldc:int(0))) {
            var_3_1B5 = initobject:String(String::<init>, stack_1A9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_203_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1283), ldc:int(1281)))
            expr_1C7 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(12609), ldc:int(12611)))
            storeelement:String(expr_1C7:String[], and:int(ldc:int(-4850), ldc:int(753)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(30862), ldc:int(-30927)), xor:int(ldc:int(17026), ldc:int(17030))))
            storeelement:String(expr_1C7:String[], xor:int(ldc:int(25152), ldc:int(25153)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(2051), ldc:int(2055)), and:int(ldc:int(17565), ldc:int(556))))
            putstatic:String[](\u98a4\ub32d\u72f1\ucef1\uff55::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_1C7:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D5 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6E0 : int
        
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
        var_3_6D5 = and:int(ldc:int(1998612148), ldc:int(-135776522))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u98a4\ub32d\u72f1\ucef1\uff55[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1494614274))
            var_5_81 = and:int(ldc:int(-7211), ldc:int(7210))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18785), ldc:int(-22882)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6D5:int, ldc:int(874639294))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(136), ldc:int(137)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(804), ldc:int(805)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6D5 = and:int(var_3_D1:int, ldc:int(901195431))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2193), ldc:int(16461)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(402321924))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1360724259))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-32062262))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1710401381))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1524632466))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(978981567))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1245970442))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-2083283242))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(459473215))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1800668676))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(875150958))
                        var_11_E2 = and:int(ldc:int(17502), ldc:int(-29823))
                        goto(Label_1625)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1565747009))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-954065999))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1951805669))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(876823760))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1886786280))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1157589483))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(896597748))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-186299217))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(769303552))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1056368408))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(158392224))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1548636412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-275637295))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-124319544))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(934115255))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1128776024))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-2018672459))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1705748265))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(749778933))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(65), ldc:int(2313))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-175374218))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-994035640))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(776170421))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1964136571))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1846323125))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1880692153))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-2066835082))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-454449561))
                        var_11_E2 = and:int(ldc:int(-5597), ldc:int(1432))
                    }
                    
                    Label_1182:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1282433065))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1912064409))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1290750432))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(148345503))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1078006516))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2147353214))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-755471511))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1259722764))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1612049606))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1011959929))
                            goto(Label_1182)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1076637880))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1912883684))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-658388509))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1352532419))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1625)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1479:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(70312824))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-349131296))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(456990427))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-417259448))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(475538054))
                        loopcontinue()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-440650002))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1625:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E0 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1636:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1598423451))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1149394046))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1750213670))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1742743165))
                        var_17_6E0 = add:int(var_16_110:int, xor:int(ldc:int(16652), ldc:int(16653)))
                        looporswitchbreak()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1599778647))
                }
                
                var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-312312028))
                
                if (cmple:boolean(var_5_81 = var_17_6E0:int, sub:int(var_6_88:int, and:int(ldc:int(1153), ldc:int(25121))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
