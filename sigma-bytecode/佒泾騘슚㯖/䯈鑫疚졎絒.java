public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u4bc8\u946b\u759a\uc84e\u7d52 {
    public void \u4bc8\u946b\u759a\uc84e\u7d52() {
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
    
    private void \ubf56\ud523\u4f52\u7043\uae87(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc9f6\u3bd6\uc246\u071d\u759a p0) {
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
    
    private void \ud158\u4c2b\ub102\ubded\ub19c() {
        var_1_5F : int
        var_4_6B : Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>
        var_1_78 : int
        var_5_AE : \u12cb\u93a2\ubf56\uc229\u8d90
        var_6_C9 : \uc9f6\u3bd6\uc246\u071d\u759a
        
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
            var_1_5F = and:int(ldc:int(989625344), ldc:int(-539657245))
            var_4_6B = invokeinterface:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>(List<\u12cb\u93a2\ubf56\uc229\u8d90>::iterator, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_1_78 = and:int(var_1_5F:int, ldc:int(-1147409208))
                }
                else {
                    var_1_78 = and:int(var_1_5F:int, ldc:int(1593802670))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6B:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>)) {
                        var_5_AE = checkcast:\u12cb\u93a2\ubf56\uc229\u8d90(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90.class, invokeinterface:\u12cb\u93a2\ubf56\uc229\u8d90(Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>::next, var_4_6B:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>))
                        
                        if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc9f6\u3bd6\uc246\u071d\u759a.class, var_5_AE:\u12cb\u93a2\ubf56\uc229\u8d90)) {
                            var_6_C9 = checkcast:\uc9f6\u3bd6\uc246\u071d\u759a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc9f6\u3bd6\uc246\u071d\u759a.class, var_5_AE:\uc9f6\u3bd6\uc246\u071d\u759a)
                            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\ud523\u760c\ub113\u7c6b\u67e9(\ud523\u760c\ub113\u7c6b\u67e9::<init>, this:\u4bc8\u946b\u759a\uc84e\u7d52, this:\u4bc8\u946b\u759a\uc84e\u7d52, var_5_AE:\uc9f6\u3bd6\uc246\u071d\u759a[expected:\u12cb\u93a2\ubf56\uc229\u8d90]))
                        }
                        
                        var_1_5F = and:int(var_1_78:int, ldc:int(2144762227))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_78:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_78:int, ldc:int(-1687061694))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uafe7\u47c2\ufcaf\u9255\u960f(int p0, int p1) {
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
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uafe7\u47c2\ufcaf\u9255\u960f, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:int, p1:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u93a2\u93a2\u3504\uc84e\ud158, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], and:int[expected:boolean](ldc:int(1101), ldc:int(-1102)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8389\u5245\ucfaf\u61a4\ub6ab() {
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
            return:int(ldc:int(60))
        }
        
        goto(Label_0006)
    }
    
    public void \ua068\u5140\u9a18\u8d98\ufe34\uc2e8(int p0) {
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
            invokespecial:void(\ua068\u7af6\u3e75\u3bc9\ua562::\ua068\u5140\u9a18\u8d98\ufe34\uc2e8, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\ua068\u7af6\u3e75\u3bc9\ua562], p0:int)
            
            if (cmpeq:boolean(p0:int, and:int(ldc:int(31536), ldc:int(323)))) {
                invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\u3711\ubb2b\ua3b4\ud171\u3bc9)
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4bc8\u946b\u759a\uc84e\u7d52::\u59ec\u0c95\u64ab\ufe34\u873d), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ucfaf\u7e3f\ube23\u4f52\u071d(float p0) {
        var_4_86 : float
        
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
            p0 = div:float(l2f:float(invokestatic:long(Math::min, ldc:long(200L), sub:long(invokevirtual:long(Date::getTime, initobject:Date(Date::<init>)), invokevirtual:long(Date::getTime, getfield:Date(\u4bc8\u946b\u759a\uc84e\u7d52::\ud158\u8308\u76bc\u0a06\ud36e, this:\u4bc8\u946b\u759a\uc84e\u7d52))))), ldc:float(200.0f))
            var_4_86 = invokestatic:float(\u183a\ud7e8\u156b\u62da\ub7dc::\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e, p0:float, ldc:float(0.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u97b7\u62da\u527a\ubefe\u98a4, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], add:float(ldc:float(0.8f), mul:float(var_4_86:float, ldc:float(0.2f))), add:float(ldc:float(0.8f), mul:float(var_4_86:float, ldc:float(0.2f))))
            invokestatic:void(\u51fa\u494c\u71f1\u7330\u12cb::\u8cae\u7d52\u51fa\u0a06\uc910\u93a2, i2f:float(getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u4bc8\u946b\u759a\uc84e\u7d52)), i2f:float(getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u4bc8\u946b\u759a\uc84e\u7d52)), i2f:float(add:int(getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\u67d0\uf9c5\u4d85\u4179\u74b1, this:\u4bc8\u946b\u759a\uc84e\u7d52), getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\u8350\u1187\u6c56\ub32d\u927d, this:\u4bc8\u946b\u759a\uc84e\u7d52))), i2f:float(add:int(getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\u6c56\u4f52\ubb2b\u8308\u9937, this:\u4bc8\u946b\u759a\uc84e\u7d52), getfield:int(\u4bc8\u946b\u759a\uc84e\u7d52::\ub8be\u7873\u36d3\ub102\u8258, this:\u4bc8\u946b\u759a\uc84e\u7d52))), invokestatic:int(\u3bd6\u6d99\ub113\u4d85\u71f1::\ub18d\u4975\u5140\u3711\uf995, getfield:int(\u8aa5\u3dd3\ub19c\u600f\u6198::\u59ec\ubf56\u8640\u759a\u0800, getstatic:\u8aa5\u3dd3\ub19c\u600f\u6198(\u8aa5\u3dd3\ub19c\u600f\u6198::\u6c56\u3c25\u7af6\u4492\u97e6)), mul:float(ldc:float(0.25f), p0:float)))
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u516c\ubefe\u7d52\u960f\u71ae, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90])
            invokespecial:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ucfaf\u7e3f\ube23\u4f52\u071d, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u67e9\u9937\ua6bd\u647c\u36d3$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc9f6\u3bd6\uc246\u071d\u759a p0, java.lang.String p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3a62\uc9f6\u3776\u4f52\ua068\u34df p2, int p3) {
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
            invokevirtual:void(\uc29a\u965f\ubb2b\u56bd\u4f52::\u5140\u5bc4\u4e72\ud523\u7bad, getfield:\uc29a\u965f\ubb2b\u56bd\u4f52(\u7c6b\u392e\ub113\uae87\u6b0d::\u3711\u6b0d\u99f7\u071d\uc2bd, getfield:\u7c6b\u392e\ub113\uae87\u6b0d(\u4bc8\u946b\u759a\uc84e\u7d52::\ubded\uc9f6\u071d\u8258\u0c95, this:\u4bc8\u946b\u759a\uc84e\u7d52)), p1:String, p2:\u3a62\uc9f6\u3776\u4f52\ua068\u34df, p3:int)
            invokevirtual:void(\u9033\u0c95\u4975\uafe7\ub7dc::\u5f50\u3711\u0c95\ubb2b\u8308, invokevirtual:\u9033\u0c95\u4975\uafe7\ub7dc(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4f52\u6ec6\u6b0d\u7e3f\u8640, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), initobject:\u9af2\u72f1\ubf56\u40a9\u3bc9(\u9af2\u72f1\ubf56\u40a9\u3bc9::<init>, p1:String, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u3a62\uc9f6\u3776\u4f52\ua068\u34df), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u3a62\uc9f6\u3776\u4f52\ua068\u34df), p3:int))
            invokespecial:void(\u4bc8\u946b\u759a\uc84e\u7d52::\ud158\u4c2b\ub102\ubded\ub19c, this:\u4bc8\u946b\u759a\uc84e\u7d52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c04\u5bc4\ub171\u839e\u385b$1(\u6435\ub8be\u718f\u6b0d\u67e9.\u61a4\u8413\u960f\uf9c5\ubcb0 p0) {
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
            invokespecial:void(\u4bc8\u946b\u759a\uc84e\u7d52::\ud158\u4c2b\ub102\ubded\ub19c, this:\u4bc8\u946b\u759a\uc84e\u7d52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud171\u3e2a\u12cb\u6bb9\uae5d$0(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u4bc8\u946b\u759a\uc84e\u7d52 p0, \u6435\ub8be\u718f\u6b0d\u67e9.\u61a4\u8413\u960f\uf9c5\ubcb0 p1, int p2, int p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3a62\uc9f6\u3776\u4f52\ua068\u34df p4) {
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
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u8350\u8bb0\ucef1\u3bd6\u47c2, p0:\u4bc8\u946b\u759a\uc84e\u7d52[expected:\u12cb\u93a2\ubf56\uc229\u8d90], initobject:\u416d\u61a4\ua61f\ube23\u8709[expected:Runnable](\u416d\u61a4\ua61f\ube23\u8709::<init>, this:\u4bc8\u946b\u759a\uc84e\u7d52, p0:\u4bc8\u946b\u759a\uc84e\u7d52, p2:int, p3:int, p4:\u3a62\uc9f6\u3776\u4f52\ua068\u34df))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5654\u873d\u4bc8\uc910\u3a62(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u4bc8\u946b\u759a\uc84e\u7d52 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc9f6\u3bd6\uc246\u071d\u759a p1) {
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
            invokespecial:void(\u4bc8\u946b\u759a\uc84e\u7d52::\ubf56\ud523\u4f52\u7043\uae87, p0:\u4bc8\u946b\u759a\uc84e\u7d52, p1:\uc9f6\u3bd6\uc246\u071d\u759a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CC : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_150_0 : byte[] [generated]
        stack_1DF_0 : byte[] [generated]
        stack_25C_0 : byte[] [generated]
        stack_2B0_0 : byte[] [generated]
        stack_306_0 : byte[] [generated]
        var_4_1B7 : int
        var_3_1BC : byte[]
        var_5_1BD : int
        var_0_1D5 : int
        expr_1DF : byte [generated]
        stack_21F_2 : byte [generated]
        stack_1FC_0 : byte [generated]
        expr_25F : byte [generated]
        expr_A7 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_29E : byte[]
        var_5_29F : int
        expr_11B : int [generated]
        var_3_2F4 : byte[]
        var_5_2F5 : int
        var_3_15C : String
        stack_1AA_0 : String[] [generated]
        expr_16E : String[] [generated]
        
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
        var_0_1CC = and:int(ldc:int(-233917650), ldc:int(-634413195))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_150_0 = stack_1DF_0 = stack_25C_0 = stack_2B0_0 = stack_306_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("59CYiUgAIFfg4KAQoNkg4PCqBd1Nqg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1B7 = expr_6E:int
        var_3_1BC = newarray:byte[](byte.class, expr_6E:int)
        var_5_1BD = expr_6E:int
        Label_0447:
        
        while (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1CC:int, ldc:int(-230975564))
            var_5_1BD = add:int(var_5_1BD:int, ldc:int(-1))
            expr_1DF = stack_21F_2 = loadelement(stack_1DF_0, var_5_1BD)
            
            if (cmplt:boolean(add:int(add:int(var_5_1BD:int, ldc:int(4)), neg:int(var_4_1B7:int)), ldc:int(0))) {
                stack_21F_2 = stack_1FC_0 = add:byte(expr_1DF:byte, loadelement:byte(var_3_1BC:byte[], add:int(var_5_1BD:int, ldc:int(4))))
                goto(Label_0524)
            }
            
            Label_0492:
            
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(64)), ldc:int(0))) {
                var_0_1D5 = and:int(var_0_1D5:int, ldc:int(-1752302681))
                stack_21F_2 = stack_1FC_0 = add:byte(expr_1DF:byte, ldc:byte(4))
            }
            
            Label_0524:
            
            if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0492)
            }
            
            var_0_1CC = and:int(var_0_1D5:int, ldc:int(-1150353434))
            storeelement:byte(var_3_1BC:byte[], var_5_1BD:int, stack_21F_2:byte)
            
            if (cmpne:boolean(var_5_1BD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_150_0 = stack_1DF_0 = stack_25C_0 = stack_2B0_0 = stack_306_0 = var_3_1BC:byte[]
            goto(Label_0115)
        }
        
        var_0_1CC = and:int(var_0_1CC:int, ldc:int(338414291))
        Label_0581:
        
        while (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-12658834))
            var_5_1BD = add:int(var_5_1BD:int, ldc:int(-1))
            expr_25F = add:byte(loadelement:byte(stack_25C_0:byte[], var_5_1BD:int), ldc:byte(82))
            storeelement:byte(var_3_1BC:byte[], var_5_1BD:int, or:int(and:int(shl:int(expr_25F:byte, and:int(ldc:int(7301), ldc:int(534))), ldc:int(-16)), and:int(shr:int(expr_25F:byte[expected:int], xor:int(ldc:int(259), ldc:int(263))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1BD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_150_0 = stack_1DF_0 = stack_25C_0 = stack_2B0_0 = stack_306_0 = var_3_1BC:byte[]
            goto(Label_0172)
        }
        
        goto(Label_0447)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-128505631))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1596851801))
        }
        else {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1698890945))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1B7 = expr_A7:int
                var_3_1BC = newarray:byte[](byte.class, expr_A7:int)
                var_5_1BD = expr_A7:int
                goto(Label_0581)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(256)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1556503731))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1302472794))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_29E = newarray:byte[](byte.class, expr_D9:int)
                var_5_29F = expr_D9:int
                
                loop {
                    var_0_1CC = and:int(var_0_1CC:int, ldc:int(-1298154562))
                    var_5_29F = add:int(var_5_29F:int, ldc:int(-1))
                    storeelement:byte(var_3_29E:byte[], var_5_29F:int, add:int(shl:int(loadelement:byte(stack_2B0_0:byte[], var_5_29F:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_29F:int, and:int(ldc:int(9541), ldc:int(145)))), ldc:int(7)), and:int(ldc:int(5401), ldc:int(1)))))
                    
                    if (cmpne:boolean(var_5_29F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_150_0 = stack_1DF_0 = stack_25C_0 = stack_2B0_0 = stack_306_0 = var_3_29E:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-2005877268))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(128)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(418128464))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_1CC:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1CC = and:int(var_0_1CC:int, ldc:int(-242912128))
                goto(Label_0115)
            }
            
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-142682257))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_2F4 = newarray:byte[](byte.class, expr_11B:int)
                var_5_2F5 = expr_11B:int
                
                loop {
                    var_0_1CC = and:int(var_0_1CC:int, ldc:int(-94448857))
                    var_5_2F5 = add:int(var_5_2F5:int, ldc:int(-1))
                    storeelement:byte(var_3_2F4:byte[], var_5_2F5:int, xor:byte(loadelement:byte(stack_306_0:byte[], var_5_2F5:int), ldc:byte(3)))
                    
                    if (cmpne:boolean(var_5_2F5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_150_0 = stack_1DF_0 = stack_25C_0 = stack_2B0_0 = stack_306_0 = var_3_2F4:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(-220591503))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CC:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1CC = and:int(var_0_1CC:int, ldc:int(1337559379))
            goto(Label_0115)
        }
        
        var_3_15C = initobject:String(String::<init>, stack_150_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1AA_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(28706), ldc:int(1562)))
        expr_16E = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2304), ldc:int(2306)))
        storeelement:String(expr_16E:String[], and:int(ldc:int(12427), ldc:int(-13004)), invokevirtual:String[expected:String](String::substring, var_3_15C:String, and:int(ldc:int(-24781), ldc:int(24652)), and:int(ldc:int(8478), ldc:int(78))))
        storeelement:String(expr_16E:String[], and:int(ldc:int(13189), ldc:int(2051)), invokevirtual:String[expected:String](String::substring, var_3_15C:String, xor:int(ldc:int(259), ldc:int(269)), xor:int(ldc:int(16450), ldc:int(16471))))
        putstatic:String[](\u4bc8\u946b\u759a\uc84e\u7d52::\u600f\uc31c\u34df\uc2bd\u9a18, expr_16E:String[])
        putstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4bc8\u946b\u759a\uc84e\u7d52::\u59ec\u0c95\u64ab\ufe34\u873d, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350))
    }
    
    public void \ucb79\u5bc4\u760c\u8413\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(-6315700), ldc:int(-166780818))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4bc8\u946b\u759a\uc84e\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1703105832))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-562040346))
            var_5_8A = and:int(ldc:int(17798), ldc:int(-17800))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17585), ldc:int(-21682)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_696:int, ldc:int(-546315316))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(9474), ldc:int(9475)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-15344), ldc:int(-15343)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_E3:int, ldc:int(-678452266))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(4107), ldc:int(18497)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2044579468))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(886105239))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-509872655))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(961673163))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-541086483))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-532877926))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1287832241))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(637741677))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2127710327))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-890573291))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-690229779))
                        var_11_F4 = and:int(ldc:int(-28389), ldc:int(19684))
                        goto(Label_1553)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1397759911))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1689287871))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-142952723))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1216854891))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1358484307))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-404842373))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2139203990))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2183699))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1561251996))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-117985210))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-586018678))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(684977268))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1431068))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-16312), ldc:int(-16311))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(33592073))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1776709217))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1638674374))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1086002896))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(988968378))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1599803399))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2446610))
                        var_11_F4 = and:int(ldc:int(24664), ldc:int(-24926))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(277086161))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1533720560))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1500892963))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-677445809))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-222542698))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1990108369))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-95746755))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(333214434))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1525839732))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(615754968))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-541414668))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1553)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-688852892))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(245526955))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1619133178))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1415564983))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-13883779))
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-32871059))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-122681441))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1817793643))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2087795961))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-854142241))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-160777906))
                        var_17_6A1 = add:int(var_16_122:int, and:int(ldc:int(17233), ldc:int(11405)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-407386814))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-550820481))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, and:int(ldc:int(5641), ldc:int(5))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1206580548))
            goto(Label_0108)
        }
    }
}
