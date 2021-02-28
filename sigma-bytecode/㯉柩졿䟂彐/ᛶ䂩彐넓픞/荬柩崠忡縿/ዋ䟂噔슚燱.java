public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u12cb\u47c2\u5654\uc29a\u71f1 {
    public void \u12cb\u47c2\u5654\uc29a\u71f1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, java.lang.String p1, int p2, int p3, \u5d20\u97b7\u8753\u873d\u16f6.\ucef1\u3504\u64f2\u6cfe\u52d3 p4) {
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
            invokespecial:\uafe7\u72f1\u7e3f\uc238\u34df(\uafe7\u72f1\u7e3f\uc238\u34df::<init>, this:\u12cb\u47c2\u5654\uc29a\u71f1, p0:\u12cb\u93a2\ubf56\uc229\u8d90, p1:String, p2:int, p3:int, and:int(ldc:int(6600), ldc:int(1752)), and:int(ldc:int(862), ldc:int(10622)), xor:boolean(ldc:boolean(0), ldc:boolean(1)))
            putfield:List<\u385b\u8753\u446c\u5245\u5245>(\u12cb\u47c2\u5654\uc29a\u71f1::\u12cb\ua61f\u12b2\u6bb9\u6fb0, this:\u12cb\u47c2\u5654\uc29a\u71f1, initobject:ArrayList<\u385b\u8753\u446c\u5245\u5245>[expected:List<\u385b\u8753\u446c\u5245\u5245>](ArrayList<E>::<init>))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u0b8e\ud4fe\uc229\u92ee\ud4fe, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], and:int(ldc:int(734), ldc:int(1225)))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], xor:int(ldc:int(2520), ldc:int(2182)))
            putfield:boolean(\u12cb\u47c2\u5654\uc29a\u71f1::\ucef1\u51b2\u7330\uafe7\u3dd3, this:\u12cb\u47c2\u5654\uc29a\u71f1, xor:int[expected:boolean](ldc:int(9216), ldc:int(9217)))
            putfield:\ucef1\u3504\u64f2\u6cfe\u52d3(\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\ub70c\uc87f\ubb2b\u0c95, this:\u12cb\u47c2\u5654\uc29a\u71f1, p4:\ucef1\u3504\u64f2\u6cfe\u52d3)
            invokespecial:void(\u12cb\u47c2\u5654\uc29a\u71f1::\u392e\u8709\u385b\uf94d\u8640, this:\u12cb\u47c2\u5654\uc29a\u71f1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5db4\ud171\u6198\u4179\u6d99() {
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
    
    private void \u392e\u8709\u385b\uf94d\u8640() {
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
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
        var_3_74 : int
        var_3_C8 : int
        var_9_E6 : int
        var_10_F8 : int
        var_11_FE : int
        var_12_112 : int
        var_3_164 : int
        
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
        var_3_74 = and:int(ldc:int(-1630433520), ldc:int(-1780023778))
        
        if (cmpge:boolean(getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1), ldc:float(1.0f))) {
            putfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\u4daf\u839e\u4d85\u3d4b\uc31c, this:\u12cb\u47c2\u5654\uc29a\u71f1, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            putfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\ua6bd\u6d99\u8640\u5d20\u71ae, this:\u12cb\u47c2\u5654\uc29a\u71f1, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            invokevirtual:void(\uafe7\u72f1\u7e3f\uc238\u34df::\ua3b4\u3776\u4daf\u8640\u7006, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\uafe7\u72f1\u7e3f\uc238\u34df], xor:int[expected:boolean](ldc:int(3201), ldc:int(3200)))
            goto(Label_0181)
        }
        
        Label_0105:
        
        if (cmpne:boolean(and:int(var_3_74:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_74 = and:int(var_3_74:int, ldc:int(2083115814))
        }
        else {
            var_3_74 = and:int(var_3_74:int, ldc:int(390201025))
            invokevirtual:void(\uafe7\u72f1\u7e3f\uc238\u34df::\ua3b4\u3776\u4daf\u8640\u7006, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\uafe7\u72f1\u7e3f\uc238\u34df], and:int[expected:boolean](ldc:int(-5684), ldc:int(5171)))
            putfield:boolean(\u12cb\u47c2\u5654\uc29a\u71f1::\u1833\u7330\ua068\u0c95\u527a, this:\u12cb\u47c2\u5654\uc29a\u71f1, and:int[expected:boolean](ldc:int(-20477), ldc:int(17772)))
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_3_74:int, ldc:int(32768)), ldc:int(0))) {
            var_3_74 = and:int(var_3_74:int, ldc:int(1368953564))
            goto(Label_0105)
        }
        
        var_3_C8 = and:int(var_3_74:int, ldc:int(876791735))
        var_9_E6 = f2i:int(add:float(ldc:float(200.0f), mul:float(ldc:float(140.0f), sub:float(ldc:float(1.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1)))))
        var_10_F8 = f2i:int(add:float(ldc:float(320.0f), mul:float(ldc:float(320.0f), mul:float(ldc:float(0.1f), sub:float(ldc:float(1.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1))))))
        var_11_FE = getfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\ua6bd\u6d99\u8640\u5d20\u71ae, this:\u12cb\u47c2\u5654\uc29a\u71f1)
        var_12_112 = f2i:int(add:float(sub:float(i2f:float(getfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\u4daf\u839e\u4d85\u3d4b\uc31c, this:\u12cb\u47c2\u5654\uc29a\u71f1)), div:float(sub:float(i2f:float(var_9_E6:int), ldc:float(200.0f)), ldc:float(2.0f))), ldc:float(0.5f)))
        
        if (cmplt:boolean(getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1), ldc:float(1.0f))) {
            if (cmpge:boolean(var_12_112:int, ldc:int(0))) {
                goto(Label_0337)
            }
            
            var_12_112 = and:int(ldc:int(-16800), ldc:int(16795))
            goto(Label_0337)
        }
        
        Label_0285:
        
        if (cmpeq:boolean(and:int(var_3_C8:int, ldc:int(1)), ldc:int(0))) {
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u0b8e\ud4fe\uc229\u92ee\ud4fe, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], var_9_E6:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], var_10_F8:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ube23\u4daf\ub171\u6198\u51b2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], var_12_112:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u960f\u64ab\u8cae\ub8be, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], var_11_FE:int)
            invokespecial:void(\uafe7\u72f1\u7e3f\uc238\u34df::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\uafe7\u72f1\u7e3f\uc238\u34df], p0:int, p1:int)
            return:void()
        }
        
        Label_0337:
        
        if (cmpeq:boolean(and:int(var_3_C8:int, ldc:int(1024)), ldc:int(0))) {
            var_3_C8 = and:int(var_3_C8:int, ldc:int(191518554))
            goto(Label_0285)
        }
        
        var_3_164 = and:int(var_3_C8:int, ldc:int(911711805))
        
        if (cmpgt:boolean(add:int(var_12_112:int, var_9_E6:int), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u47c2\u5654\uc29a\u71f1::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u12cb\u47c2\u5654\uc29a\u71f1)))) {
            var_12_112 = sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u47c2\u5654\uc29a\u71f1::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u12cb\u47c2\u5654\uc29a\u71f1)), var_9_E6:int)
        }
        
        var_3_C8 = and:int(var_3_164:int, ldc:int(401583990))
        
        if (cmple:boolean(add:int(var_11_FE:int, var_10_F8:int), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u47c2\u5654\uc29a\u71f1::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u12cb\u47c2\u5654\uc29a\u71f1)))) {
            goto(Label_0285)
        }
        
        var_11_FE = sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, getfield:\u12cb\u93a2\ubf56\uc229\u8d90(\u12cb\u47c2\u5654\uc29a\u71f1::\u8df4\u6198\u5fe1\ubefe\u5fe1, this:\u12cb\u47c2\u5654\uc29a\u71f1)), var_10_F8:int)
        goto(Label_0285)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_2_5F : int
        var_4_74 : int
        
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
        var_2_5F = and:int(ldc:int(-788165084), ldc:int(-102246473))
        invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u516c\ubefe\u7d52\u960f\u71ae, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
        invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u3e75\u88c5\u9033\u4bc8\ub113, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
        var_4_74 = f2i:int(add:float(ldc:float(1.0f), mul:float(ldc:float(10.0f), sub:float(ldc:float(1.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1)))))
        invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u7330\uf995\u7af6\uc29a\u960f\u3bc9, i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), sub:int(var_4_74:int, and:int(ldc:int(24593), ldc:int(1))))), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), sub:int(var_4_74:int, and:int(ldc:int(157), ldc:int(11041))))), i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), mul:int(sub:int(var_4_74:int, xor:int(ldc:int(-32704), ldc:int(-32703))), and:int(ldc:int(550), ldc:int(13315))))), i2f:float(sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), mul:int(sub:int(var_4_74:int, xor:int(ldc:int(12297), ldc:int(12296))), xor:int(ldc:int(-16335), ldc:int(-16333))))), add:float(i2f:float(getfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\ub70c\u8753\u71ae\uc246\u3d64, this:\u12cb\u47c2\u5654\uc29a\u71f1)), mul:float(sub:float(ldc:float(1.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1)), i2f:float(var_4_74:int))), p0:float)
        invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(60))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), invokestatic:float(Math::min, ldc:float(1.0f), mul:float(mul:float(p0:float, ldc:float(0.9f)), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1)))))
        invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u446c\u8d90\u1187\uff55\ua3b4\u98a4, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), add:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(ldc:float(60.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1))), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), sub:float(i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), mul:float(ldc:float(60.0f), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), p0:float))
        
        if (cmpgt:boolean(getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1), ldc:float(0.8f))) {
            putfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\ub70c\u8753\u71ae\uc246\u3d64, this:\u12cb\u47c2\u5654\uc29a\u71f1, ldc:int(20))
            goto(Label_0352)
        }
        
        Label_0330:
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-46296193))
            
            if (cmplt:boolean(getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1), ldc:float(0.2f))) {
                putfield:int(\u12cb\u47c2\u5654\uc29a\u71f1::\ub70c\u8753\u71ae\uc246\u3d64, this:\u12cb\u47c2\u5654\uc29a\u71f1, ldc:int(30))
            }
        }
        
        Label_0352:
        
        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8350\u52d3\ub8be\u9033\ub7dc\ub18d, getstatic:\u6fb0\u1187\u12b2\ua068\u5245\u67e9(\u3a62\uc910\u1187\u718f\u9255::\ubded\u5654\u120d\u7330\u516c), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(20))), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(30))), invokevirtual:String(\ucef1\u3504\u64f2\u6cfe\u52d3::\ud4fe\ub8be\u8aa5\u99f7\u4ab3, invokevirtual:\ucef1\u3504\u64f2\u6cfe\u52d3(\u12cb\u47c2\u5654\uc29a\u71f1::\u8d90\u4e72\u7873\u8258\u3d4b, this:\u12cb\u47c2\u5654\uc29a\u71f1)), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(mul:float(p0:float, ldc:float(0.5f)), getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1))), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u760c\ucfaf\u7006\u7bad\ud158), getstatic:\u4f52\u983f\u3c25\u7ce1\ua3b4(\u4f52\u983f\u3c25\u7ce1\ua3b4::\u62da\u385b\u36d3\uf995\u7873))
            invokestatic:void(GL11::glPushMatrix)
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], mul:float(p0:float, p0:float))
            invokestatic:void(GL11::glPopMatrix)
            
            if (cmpgt:boolean(invokevirtual:int(\ua3b4\u72f1\u93a2\u3e2a\ua6bd::\ub83f\u62da\uf995\ua6bd\u92ee, getfield:\u5d20\uc84e\u59ec\u8753\u4d85[expected:\ua3b4\u72f1\u93a2\u3e2a\ua6bd](\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\u416d\u4ab3\u1833\u9a18, this:\u12cb\u47c2\u5654\uc29a\u71f1)), ldc:int(0))) {
                invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u40a9\u12cb\u62da\u836c\u92ee\u51fa, i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), i2f:float(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(60))), i2f:float(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90])), ldc:float(18.0f), getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u1187\u647c\u9255\u8258::\u4c04\u34df\ua3b4\uc29a\ub70c), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6d99\u6fb0\ub102\u8413\u8350)), mul:float(mul:float(p0:float, getfield:float(\u12cb\u47c2\u5654\uc29a\u71f1::\u59ec\u76bc\uf9c5\uc910\ua3b4, this:\u12cb\u47c2\u5654\uc29a\u71f1)), ldc:float(0.5f))))
            }
            
            return:void()
        }
        
        goto(Label_0330)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\ucef1\u3504\u64f2\u6cfe\u52d3 \u8d90\u4e72\u7873\u8258\u3d4b() {
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
            return:\ucef1\u3504\u64f2\u6cfe\u52d3(getfield:\ucef1\u3504\u64f2\u6cfe\u52d3(\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\ub70c\uc87f\ubb2b\u0c95, this:\u12cb\u47c2\u5654\uc29a\u71f1))
        }
        
        goto(Label_0006)
    }
    
    public final void \u8350\uc2e8\ud7e8\u3bd6\uc229(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u385b\u8753\u446c\u5245\u5245 p0) {
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
            invokeinterface:boolean(List<\u385b\u8753\u446c\u5245\u5245>::add, getfield:List<\u385b\u8753\u446c\u5245\u5245>(\u12cb\u47c2\u5654\uc29a\u71f1::\u12cb\ua61f\u12b2\u6bb9\u6fb0, this:\u12cb\u47c2\u5654\uc29a\u71f1), p0:\u385b\u8753\u446c\u5245\u5245)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final void \u7006\ub7dc\u7043\ud36e\u12cb(\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c p0) {
        var_2_61 : int
        var_4_6B : Iterator<\u385b\u8753\u446c\u5245\u5245>
        
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
            var_2_61 = and:int(ldc:int(1462451575), ldc:int(-270693509))
            var_4_6B = invokeinterface:Iterator<\u385b\u8753\u446c\u5245\u5245>(List<\u385b\u8753\u446c\u5245\u5245>::iterator, getfield:List<\u385b\u8753\u446c\u5245\u5245>(\u12cb\u47c2\u5654\uc29a\u71f1::\u12cb\ua61f\u12b2\u6bb9\u6fb0, this:\u12cb\u47c2\u5654\uc29a\u71f1))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-848744461))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_6B:Iterator<\u385b\u8753\u446c\u5245\u5245>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(\u385b\u8753\u446c\u5245\u5245::\ub113\uc229\u7330\u12b2\u8bb0, checkcast:\u385b\u8753\u446c\u5245\u5245(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u385b\u8753\u446c\u5245\u5245.class, invokeinterface:\u385b\u8753\u446c\u5245\u5245(Iterator<\u385b\u8753\u446c\u5245\u5245>::next, var_4_6B:Iterator<\u385b\u8753\u446c\u5245\u5245>)), p0:\ud158\u839e\u7006\uc3e3\u446c)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u8753\u4975\ubf56\u6b0d\u7e3f$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p1) {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u960f\u64ab\u8cae\ub8be, p0:\u12cb\u93a2\ubf56\uc229\u8d90, ldc:int(60))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, p0:\u12cb\u93a2\ubf56\uc229\u8d90, sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, p1:\u12cb\u93a2\ubf56\uc229\u8d90), ldc:int(60)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u183a\u4f52\ufe34\u6b0d\uc246$0() {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u8389\u494c\u7006\ub19c, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], getfield:\u5d20\uc84e\u59ec\u8753\u4d85[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\u416d\u4ab3\u1833\u9a18, this:\u12cb\u47c2\u5654\uc29a\u71f1))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u494c\u494c\ub32d\u36d3\u8753, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], putfield:\u5d20\uc84e\u59ec\u8753\u4d85[expected:\u12cb\u93a2\ubf56\uc229\u8d90](\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\u416d\u4ab3\u1833\u9a18, this:\u12cb\u47c2\u5654\uc29a\u71f1, initobject:\u5d20\uc84e\u59ec\u8753\u4d85(\u5d20\uc84e\u59ec\u8753\u4d85::<init>, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90], loadelement:String(getstatic:String[](\u12cb\u47c2\u5654\uc29a\u71f1::\u4ab3\u99f7\u3a62\u3711\ub6ab), and:int(ldc:int(-27414), ldc:int(25364))), and:int(ldc:int(5600), ldc:int(-13793)), ldc:int(60), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), sub:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:\u12cb\u93a2\ubf56\uc229\u8d90]), ldc:int(60)), getfield:\ucef1\u3504\u64f2\u6cfe\u52d3(\u12cb\u47c2\u5654\uc29a\u71f1::\uc87f\ub70c\uc87f\ubb2b\u0c95, this:\u12cb\u47c2\u5654\uc29a\u71f1))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_225 : int
        expr_6E : int [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_102_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_138_0 : byte[] [generated]
        stack_179_0 : byte[] [generated]
        stack_17B_0 : byte[] [generated]
        stack_1C2_0 : byte[] [generated]
        stack_238_0 : byte[] [generated]
        stack_28F_0 : byte[] [generated]
        stack_324_0 : byte[] [generated]
        stack_375_0 : byte[] [generated]
        stack_3CB_0 : byte[] [generated]
        var_4_208 : int
        var_3_20D : byte[]
        var_5_20E : int
        var_0_2A8 : int
        expr_28F : byte [generated]
        stack_2E0_2 : byte [generated]
        stack_2B4_0 : byte [generated]
        expr_324 : byte [generated]
        expr_C1 : int [generated]
        expr_102 : int [generated]
        var_2_136 : byte[]
        expr_13A : int [generated]
        var_3_363 : byte[]
        var_5_364 : int
        expr_17B : int [generated]
        var_3_3B9 : byte[]
        var_5_3BA : int
        var_3_1CE : String
        stack_201_0 : String[] [generated]
        expr_1E0 : String[] [generated]
        
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
        var_0_225 = and:int(ldc:int(258630722), ldc:int(941063428))
        expr_6E = arraylength:int(stack_BF_0 = stack_C1_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("wevW+7T5Ag0tL0Px")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_208 = expr_6E:int
        var_3_20D = newarray:byte[](byte.class, expr_6E:int)
        var_5_20E = expr_6E:int
        Label_0528:
        
        while (cmpeq:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(-1716193976))
                goto(Label_0615)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(35385017))
            var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
            storeelement:byte(var_3_20D:byte[], var_5_20E:int, add:byte(loadelement:byte(stack_238_0:byte[], var_5_20E:int), ldc:byte(20)))
            
            if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = var_3_20D:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0774)
        Label_0615:
        
        while (cmpeq:boolean(and:int(var_0_225:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(16)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(-2136171990))
                goto(Label_0528)
            }
            
            var_0_2A8 = and:int(var_0_225:int, ldc:int(-2010126974))
            var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
            expr_28F = stack_2E0_2 = loadelement(stack_28F_0, var_5_20E)
            
            if (cmplt:boolean(add:int(add:int(var_5_20E:int, ldc:int(3)), neg:int(var_4_208:int)), ldc:int(0))) {
                stack_2E0_2 = stack_2B4_0 = add:byte(expr_28F:byte, loadelement:byte(var_3_20D:byte[], add:int(var_5_20E:int, ldc:int(3))))
                goto(Label_0708)
            }
            
            Label_0668:
            
            if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-447188040))
            }
            else {
                var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-347413064))
                stack_2E0_2 = stack_2B4_0 = add:byte(expr_28F:byte, ldc:byte(3))
            }
            
            Label_0708:
            
            if (cmpne:boolean(and:int(var_0_2A8:int, ldc:int(256)), ldc:int(0))) {
                var_0_2A8 = and:int(var_0_2A8:int, ldc:int(-730213592))
                goto(Label_0668)
            }
            
            var_0_225 = and:int(var_0_2A8:int, ldc:int(427456226))
            storeelement:byte(var_3_20D:byte[], var_5_20E:int, stack_2E0_2:byte)
            
            if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = var_3_20D:byte[]
            goto(Label_0198)
        }
        
        Label_0774:
        
        while (cmpne:boolean(and:int(var_0_225:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0528)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(1827894536))
            var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
            expr_324 = loadelement:byte(stack_324_0:byte[], var_5_20E:int)
            storeelement:byte(var_3_20D:byte[], var_5_20E:int, or:int(and:int(shl:int(expr_324:byte, and:int(ldc:int(884), ldc:int(17414))), ldc:int(-16)), and:int(shr:int(expr_324:byte[expected:int], xor:int(ldc:int(1043), ldc:int(1047))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = var_3_20D:byte[]
            goto(Label_0263)
        }
        
        goto(Label_0615)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(8)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-1683025648))
            goto(Label_0384)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(273034943))
            goto(Label_0319)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(354273712))
            goto(Label_0263)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(128)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-666938124))
        }
        else {
            var_0_225 = and:int(var_0_225:int, ldc:int(275971423))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_208 = expr_C1:int
                var_3_20D = newarray:byte[](byte.class, expr_C1:int)
                var_5_20E = expr_C1:int
                goto(Label_0615)
            }
        }
        
        Label_0198:
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0384)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0319)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(262144)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-208079925))
        }
        else {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(-2023989661))
                goto(Label_0115)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(-1966414276))
            expr_102 = arraylength:int(stack_102_0:byte[])
            
            if (cmpne:boolean(expr_102:int, ldc:int(0))) {
                var_4_208 = expr_102:int
                var_3_20D = newarray:byte[](byte.class, expr_102:int)
                var_5_20E = expr_102:int
                goto(Label_0774)
            }
        }
        
        Label_0263:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0384)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(262144)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(-207368517))
                goto(Label_0198)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(-2130706787))
            var_2_136 = stack_136_0:byte[]
            expr_13A = add:int(arraylength:int(stack_138_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_13A:int, ldc:int(0))) {
                var_3_363 = newarray:byte[](byte.class, expr_13A:int)
                var_5_364 = expr_13A:int
                
                loop {
                    var_0_225 = and:int(var_0_225:int, ldc:int(-327225836))
                    var_5_364 = add:int(var_5_364:int, ldc:int(-1))
                    storeelement:byte(var_3_363:byte[], var_5_364:int, add:int(shl:int(loadelement:byte(stack_375_0:byte[], var_5_364:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_136:byte[], add:int(var_5_364:int, xor:int(ldc:int(2083), ldc:int(2082)))), ldc:int(4)), xor:int(ldc:int(8211), ldc:int(8220)))))
                    
                    if (cmpne:boolean(var_5_364:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = var_3_363:byte[]
            }
        }
        
        Label_0319:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-855179178))
        }
        else {
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0263)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0198)
            }
            
            if (cmpne:boolean(and:int(var_0_225:int, ldc:int(16)), ldc:int(0))) {
                var_0_225 = and:int(var_0_225:int, ldc:int(-2086081904))
                goto(Label_0115)
            }
            
            var_0_225 = and:int(var_0_225:int, ldc:int(184483451))
            expr_17B = arraylength:int(stack_17B_0:byte[])
            
            if (cmpne:boolean(expr_17B:int, ldc:int(0))) {
                var_3_3B9 = newarray:byte[](byte.class, expr_17B:int)
                var_5_3BA = expr_17B:int
                
                loop {
                    var_0_225 = and:int(var_0_225:int, ldc:int(-366581851))
                    var_5_3BA = add:int(var_5_3BA:int, ldc:int(-1))
                    storeelement:byte(var_3_3B9:byte[], var_5_3BA:int, xor:byte(loadelement:byte(stack_3CB_0:byte[], var_5_3BA:int), ldc:byte(47)))
                    
                    if (cmpne:boolean(var_5_3BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_100_0 = stack_102_0 = stack_136_0 = stack_138_0 = stack_179_0 = stack_17B_0 = stack_1C2_0 = stack_238_0 = stack_28F_0 = stack_324_0 = stack_375_0 = stack_3CB_0 = var_3_3B9:byte[]
            }
        }
        
        Label_0384:
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(8)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-1357996471))
            goto(Label_0319)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(2048)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-1430908769))
            goto(Label_0263)
        }
        
        if (cmpne:boolean(and:int(var_0_225:int, ldc:int(2048)), ldc:int(0))) {
            var_0_225 = and:int(var_0_225:int, ldc:int(-48356111))
            goto(Label_0198)
        }
        
        if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(256)), ldc:int(0))) {
            var_3_1CE = initobject:String(String::<init>, stack_1C2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_201_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(14513), ldc:int(18177)))
            expr_1E0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30080), ldc:int(-30079)))
            storeelement:String(expr_1E0:String[], and:int(ldc:int(-8296), ldc:int(8295)), invokevirtual:String[expected:String](String::substring, var_3_1CE:String, and:int(ldc:int(-24727), ldc:int(24722)), and:int(ldc:int(8971), ldc:int(4287))))
            putstatic:String[](\u12cb\u47c2\u5654\uc29a\u71f1::\u4ab3\u99f7\u3a62\u3711\ub6ab, expr_1E0:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AC : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6B7 : int
        
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
        var_3_6AC = and:int(ldc:int(-1916708755), ldc:int(-1078488991))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\u47c2\u5654\uc29a\u71f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-273941511))
            var_5_81 = and:int(ldc:int(-24529), ldc:int(7744))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14091), ldc:int(-32524)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6AC:int, ldc:int(-840180497))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(17425), ldc:int(17424)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-30720), ldc:int(-30719)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6AC = and:int(var_3_DA:int, ldc:int(-806513051))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2081), ldc:int(9733)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-907930854))
                        goto(Label_1444)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(820883839))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1444074647))
                    }
                    else {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1916325593))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-612073080))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-4374689))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(725352233))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-545000921))
                            var_11_EB = and:int(ldc:int(-16758), ldc:int(16724))
                            goto(Label_1578)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0556:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-455897961))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-209916984))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1121501432))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1426937382))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1344202327))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0821)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1718407464))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1462395413))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(776326514))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-879517412))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(459173589))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-303350039))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0821:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1246011875))
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2087579998))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-631542391))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1116317572))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1551629043))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-861017388))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-274344781))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(8513), ldc:int(35))
                                goto(Label_1150)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-798719664))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1001533442))
                        goto(Label_1444)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1122200681))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1573230226))
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(30732866))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1907783327))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-823238050))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1376790165))
                        var_11_EB = and:int(ldc:int(-17330), ldc:int(929))
                    }
                    
                    Label_1150:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1638468570))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2035619651))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-293199177))
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(589348900))
                            goto(Label_0821)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1033383774))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1375751619))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1444)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1866895100))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1150)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1385264211))
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1422104758))
                            goto(Label_0821)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(22856195))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1234172147))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1472201963))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1101371464))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1615727889))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1578)
                    }
                    
                    Label_1444:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1384957851))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(883935572))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(106989194))
                        goto(Label_0821)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1579022089))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(-7251087))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1578:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B7 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1589:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2061306925))
                        goto(Label_1444)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-22576775))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(36029893))
                        goto(Label_0821)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(243462523))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-841353929))
                        var_17_6B7 = add:int(var_16_119:int, and:int(ldc:int(261), ldc:int(137)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1451170540))
                }
                
                var_3_6AC = and:int(var_3_6AC:int, ldc:int(-810477773))
                
                if (cmple:boolean(var_5_81 = var_17_6B7:int, sub:int(var_6_88:int, xor:int(ldc:int(1280), ldc:int(1281))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1445073270))
            goto(Label_0108)
        }
    }
}
