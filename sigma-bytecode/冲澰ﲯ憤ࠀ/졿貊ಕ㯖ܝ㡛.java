public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b {
    public void \uc87f\u8c8a\u0c95\u3bd6\u071d\u385b(\u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p0, com.mojang.datafixers.DataFixer p1, com.google.common.collect.ImmutableSet<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> p2, boolean p3) {
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
    
    public void \uc2bd\ub1b9\ubff1\uc238\u8350\u5db4() {
        var_1_C2 : int
        
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
            var_1_C2 = and:int(ldc:int(86881701), ldc:int(1039107461))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_1_C2:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0168)
                }
                
                if (cmpeq:boolean(and:int(var_1_C2:int, ldc:int(256)), ldc:int(0))) {
                    var_1_C2 = and:int(var_1_C2:int, ldc:int(-82549905))
                    goto(Label_0134)
                }
                
                var_1_C2 = and:int(var_1_C2:int, ldc:int(-328095833))
                putfield:boolean(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u8c8a\u392e\u9255\ubb2b\u120d\u446c, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b, and:int[expected:boolean](ldc:int(-11882), ldc:int(11881)))
                
                try {
                    loop {
                        Label_0134:
                        
                        if (cmpne:boolean(and:int(var_1_C2:int, ldc:int(2)), ldc:int(0))) {
                            var_1_C2 = and:int(var_1_C2:int, ldc:int(1376558012))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_1_C2:int, ldc:int(536870912)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_1_C2 = and:int(var_1_C2:int, ldc:int(355378613))
                            invokevirtual:void(Thread::join, getfield:Thread(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u446c\u99f7\ub70c\ub1b9\u67d0\u516c, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
                        }
                        
                        Label_0168:
                        
                        if (cmpeq:boolean(and:int(var_1_C2:int, ldc:int(512)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_C2 = and:int(var_1_C2:int, ldc:int(-1234560249))
                    }
                    
                    if (cmpne:boolean(and:int(var_1_C2:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_C2 = and:int(var_1_C2:int, ldc:int(-562978377))
                }
                catch (java.lang.InterruptedException stack_CA_0) {
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u120d\ua61f\u8d98\ua562\u8350\u8640() {
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
    
    private java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c> \u446c\u36d3\u69d9\u3e75\u3d4b\u3d4b(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p0) {
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
    
    public boolean \ub7dc\u34df\u40a9\u494c\u67d0\ua6bd() {
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
            return:boolean(getfield:boolean(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u3e75\ud36e\uceb8\u7ce1\u2dcc\u56bd, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.ImmutableSet<\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c>> \u839e\u647c\u6198\ub7dc\u8d90\uc31c() {
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
            return:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(getfield:ImmutableSet<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u47c2\u6bb9\uf995\u873d\u36d3\ubefe, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public float \ube23\ud217\u8350\uc3e3\u0a06\u6ec6(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p0) {
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
            return:float(invokeinterface:float(Object2FloatMap::getFloat, getfield:Object2FloatMap<\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>>(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u8640\u7c6b\ubefe\ua61f\u71ae\ub32d, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b), p0:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public float \u759a\ub102\uae87\u4d85\uc29a\u416d() {
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
            return:float(getfield:float(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u7330\uf9c5\u61a4\u3d64\ud51e\u88c5, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public int \u7330\uf995\u8753\u5140\uf995\ud36e() {
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
            return:int(getfield:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ubded\u76bc\ud51e\ub18d\u92ee\u7af6, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public int \ufe34\u72f1\u416d\ud171\u99f7\u5db4() {
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
            return:int(getfield:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc7fe\ub6ab\ub70c\u1833\u7330\u3bd6, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public int \uc246\u88c5\u600f\uc246\u3e2a\u647c() {
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
            return:int(getfield:int(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u836c\u8709\ufe34\ud51e\u624e\u0a06, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextComponent \u92ee\u624e\uafe7\u6d69\ub7dc\u4f4a() {
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
            return:ITextComponent(getfield:ITextComponent(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u88c5\ua3b4\u4cd9\u71f1\u6435\u5bc4, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5245\u7c6b\u4c04\ud217\u56bd\ud7e8$2(java.io.File p0, java.lang.String p1) {
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
            return:boolean(invokevirtual:boolean(String::endsWith, p1:String, loadelement:String(getstatic:String[](\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ud7e8\u92ff\u927d\ud158\ud158\ubefe), xor:int(ldc:int(1124), ldc:int(1130)))))
        }
        
        goto(Label_0006)
    }
    
    private \u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 lambda$\u965f\u7ce1\u3e2a\u12b2\u51b2\u61a4$1() {
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
            return:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(getfield:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u9255\uae87\u6cfe\u5140\u8308\u5d20, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u12b2\ucef1\u6c56\u6c52\u5140\u62da$0(java.lang.Thread p0, java.lang.Throwable p1) {
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
            invokeinterface:void(Logger::error, getstatic:Logger(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc2bd\u4ab3\u93a2\ucb79\u7049\u647c), loadelement:String(getstatic:String[](\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ud7e8\u92ff\u927d\ud158\ud158\ubefe), xor:int(ldc:int(2), ldc:int(13))), p1:Throwable)
            putfield:ITextComponent(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u88c5\ua3b4\u4cd9\u71f1\u6435\u5bc4, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ud7e8\u92ff\u927d\ud158\ud158\ubefe), xor:int(ldc:int(258), ldc:int(274)))))
            putfield:boolean(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u3e75\ud36e\uceb8\u7ce1\u2dcc\u56bd, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b, and:int[expected:boolean](ldc:int(59), ldc:int(1093)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_378 : int
        expr_6E : int [generated]
        stack_99_0 : byte[] [generated]
        stack_9B_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_F0_0 : byte[] [generated]
        stack_124_0 : byte[] [generated]
        stack_38B_0 : byte[] [generated]
        stack_3DF_0 : byte[] [generated]
        stack_445_0 : byte[] [generated]
        stack_4CB_0 : byte[] [generated]
        var_4_363 : int
        var_3_368 : byte[]
        var_5_369 : int
        expr_38E : byte [generated]
        var_0_45E : int
        expr_445 : byte [generated]
        stack_496_2 : byte [generated]
        stack_46A_0 : byte [generated]
        var_2_99 : byte[]
        expr_9D : int [generated]
        var_3_3CD : byte[]
        var_5_3CE : int
        expr_CB : int [generated]
        expr_F0 : int [generated]
        var_3_4B9 : byte[]
        var_5_4BA : int
        var_3_130 : String
        expr_138 : String[] [generated]
        expr_142 : String[] [generated]
        var_3_330 : String[]
        
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
        var_0_378 = and:int(ldc:int(-380018189), ldc:int(-217395726))
        expr_6E = arraylength:int(stack_99_0 = stack_9B_0 = stack_C9_0 = stack_CB_0 = stack_EE_0 = stack_F0_0 = stack_124_0 = stack_38B_0 = stack_3DF_0 = stack_445_0 = stack_4CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("0dur05wT44ybqWrs6XrbOsGbckwLmtP7CWKjMlTzA2v7EQJitJqzYpuhGmrTCpSzmvPT2ZPLm6PTtJqzYpuhGmrTCpSzmvPT2aUT42vTGQJitJqzYpuhGmrTCpQTevvbiHt6cloDwttiO9NjYtsKStPTu8tqO6Or2/vJ08tCs5pi9GKKmtMZE0JyTDoyC6MZjIPjtVoZc2pKfGQzxbMTgkOyG2Ia6jOa66sTgkOyG2Ia6ilgYNtwgvujATO0inqSippq49ub0qvTyyK0krsaklMDkoKaeDQ6syu7+euSGpvDq9Pzy8sitJK7GpJTA5KCmng0GpsLy3izq8vj+9vTyyK0krsaklMDkoKaeDQa28sDARNCcnKbw/vb08sitJK7GpJTA5KCmng0oxOjG5gaatMKA6M6y+NCa0R6+ztbMQO+lb0exqM=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_363 = expr_6E:int
        var_3_368 = newarray:byte[](byte.class, expr_6E:int)
        var_5_369 = expr_6E:int
        Label_0875:
        
        while (cmpne:boolean(and:int(var_0_378:int, ldc:int(32)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(-325413000))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_38E = add:byte(loadelement:byte(stack_38B_0:byte[], var_5_369:int), ldc:byte(101))
            storeelement:byte(var_3_368:byte[], var_5_369:int, or:int(and:int(shl:int(expr_38E:byte, and:int(ldc:int(676), ldc:int(260))), ldc:int(-16)), and:int(shr:int(expr_38E:byte[expected:int], xor:int(ldc:int(-32720), ldc:int(-32716))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_EE_0 = stack_F0_0 = stack_124_0 = stack_38B_0 = stack_3DF_0 = stack_445_0 = stack_4CB_0 = var_3_368:byte[]
            goto(Label_0115)
        }
        
        var_0_378 = and:int(var_0_378:int, ldc:int(512706279))
        Label_1062:
        
        while (cmpeq:boolean(and:int(var_0_378:int, ldc:int(2048)), ldc:int(0))) {
            var_0_45E = and:int(var_0_378:int, ldc:int(-232994957))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_445 = stack_496_2 = loadelement(stack_445_0, var_5_369)
            
            if (cmplt:boolean(add:int(add:int(var_5_369:int, ldc:int(5)), neg:int(var_4_363:int)), ldc:int(0))) {
                stack_496_2 = stack_46A_0 = add:byte(expr_445:byte, loadelement:byte(var_3_368:byte[], add:int(var_5_369:int, ldc:int(5))))
                goto(Label_1146)
            }
            
            Label_1106:
            
            if (cmpeq:boolean(and:int(var_0_45E:int, ldc:int(256)), ldc:int(0))) {
                var_0_45E = and:int(var_0_45E:int, ldc:int(1316542190))
            }
            else {
                var_0_45E = and:int(var_0_45E:int, ldc:int(-370328580))
                stack_496_2 = stack_46A_0 = add:byte(expr_445:byte, ldc:byte(5))
            }
            
            Label_1146:
            
            if (cmpne:boolean(and:int(var_0_45E:int, ldc:int(131072)), ldc:int(0))) {
                var_0_45E = and:int(var_0_45E:int, ldc:int(1363955738))
                goto(Label_1106)
            }
            
            var_0_378 = and:int(var_0_45E:int, ldc:int(-345320065))
            storeelement:byte(var_3_368:byte[], var_5_369:int, stack_496_2:byte)
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_EE_0 = stack_F0_0 = stack_124_0 = stack_38B_0 = stack_3DF_0 = stack_445_0 = stack_4CB_0 = var_3_368:byte[]
            goto(Label_0208)
        }
        
        var_0_378 = and:int(var_0_378:int, ldc:int(-492735749))
        goto(Label_0875)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_378:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(586966150))
            goto(Label_0245)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(-535091854))
            var_2_99 = stack_99_0:byte[]
            expr_9D = add:int(arraylength:int(stack_9B_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_3_3CD = newarray:byte[](byte.class, expr_9D:int)
                var_5_3CE = expr_9D:int
                
                loop {
                    var_0_378 = and:int(var_0_378:int, ldc:int(-469236740))
                    var_5_3CE = add:int(var_5_3CE:int, ldc:int(-1))
                    storeelement:byte(var_3_3CD:byte[], var_5_3CE:int, add:int(shl:int(loadelement:byte(stack_3DF_0:byte[], var_5_3CE:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_99:byte[], add:int(var_5_3CE:int, xor:int(ldc:int(-32752), ldc:int(-32751)))), ldc:int(7)), xor:int(ldc:int(-24508), ldc:int(-24507)))))
                    
                    if (cmpne:boolean(var_5_3CE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_EE_0 = stack_F0_0 = stack_124_0 = stack_38B_0 = stack_3DF_0 = stack_445_0 = stack_4CB_0 = var_3_3CD:byte[]
            }
        }
        
        Label_0162:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0245)
        }
        
        if (cmpne:boolean(and:int(var_0_378:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1260245543))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_378 = and:int(var_0_378:int, ldc:int(-37894286))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_363 = expr_CB:int
                var_3_368 = newarray:byte[](byte.class, expr_CB:int)
                var_5_369 = expr_CB:int
                goto(Label_1062)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_378:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpne:boolean(and:int(var_0_378:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_378 = and:int(var_0_378:int, ldc:int(-248868874))
            expr_F0 = arraylength:int(stack_F0_0:byte[])
            
            if (cmpne:boolean(expr_F0:int, ldc:int(0))) {
                var_3_4B9 = newarray:byte[](byte.class, expr_F0:int)
                var_5_4BA = expr_F0:int
                
                loop {
                    var_0_378 = and:int(var_0_378:int, ldc:int(-131157508))
                    var_5_4BA = add:int(var_5_4BA:int, ldc:int(-1))
                    storeelement:byte(var_3_4B9:byte[], var_5_4BA:int, xor:byte(loadelement:byte(stack_4CB_0:byte[], var_5_4BA:int), ldc:byte(25)))
                    
                    if (cmpne:boolean(var_5_4BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_EE_0 = stack_F0_0 = stack_124_0 = stack_38B_0 = stack_3DF_0 = stack_445_0 = stack_4CB_0 = var_3_4B9:byte[]
            }
        }
        
        Label_0245:
        
        if (cmpeq:boolean(and:int(var_0_378:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_378:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(493408753))
            goto(Label_0162)
        }
        
        if (cmpne:boolean(and:int(var_0_378:int, ldc:int(4)), ldc:int(0))) {
            var_0_378 = and:int(var_0_378:int, ldc:int(1139032665))
            goto(Label_0115)
        }
        
        var_3_130 = initobject:String(String::<init>, stack_124_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_138 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32758), ldc:int(-32744)))
        expr_142 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1554), ldc:int(30)))
        storeelement:String(expr_142:String[], xor:int(ldc:int(-15862), ldc:int(-15868)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(-13812), ldc:int(5523)), xor:int(ldc:int(-15294), ldc:int(-15290))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(-16383), ldc:int(-16378)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(8965), ldc:int(8961)), xor:int(ldc:int(16399), ldc:int(16427))))
        storeelement:String(expr_142:String[], and:int(ldc:int(4300), ldc:int(12044)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(4115), ldc:int(4151)), and:int(ldc:int(4665), ldc:int(249))))
        storeelement:String(expr_142:String[], and:int(ldc:int(14), ldc:int(1866)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(569), ldc:int(1087)), and:int(ldc:int(18513), ldc:int(4339))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(136), ldc:int(135)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(4209), ldc:int(8273)), and:int(ldc:int(25190), ldc:int(4583))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(4263), ldc:int(4271)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(8294), ldc:int(20966)), xor:int(ldc:int(2908), ldc:int(2860))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(3), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(995), ldc:int(915)), xor:int(ldc:int(-31931), ldc:int(-31952))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(-6144), ldc:int(-6131)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(5247), ldc:int(5130)), xor:int(ldc:int(-8043), ldc:int(-8178))))
        storeelement:String(expr_138:String[], xor:int(ldc:int(4110), ldc:int(4127)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(5205), ldc:int(5326)), and:int(ldc:int(8443), ldc:int(187))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(96), ldc:int(97)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(-30505), ldc:int(-30612)), xor:int(ldc:int(9699), ldc:int(9564))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(2076), ldc:int(2069)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(12543), ldc:int(703)), and:int(ldc:int(2552), ldc:int(200))))
        storeelement:String(expr_142:String[], and:int(ldc:int(25114), ldc:int(-25116)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(11500), ldc:int(16585)), xor:int(ldc:int(8643), ldc:int(8487))))
        storeelement:String(expr_142:String[], and:int(ldc:int(16726), ldc:int(4144)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(99), ldc:int(135)), and:int(ldc:int(254), ldc:int(22783))))
        storeelement:String(expr_142:String[], and:int(ldc:int(2763), ldc:int(9247)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(18608), ldc:int(18510)), xor:int(ldc:int(59), ldc:int(289))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(16392), ldc:int(16395)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(12606), ldc:int(282)), and:int(ldc:int(1343), ldc:int(25527))))
        storeelement:String(expr_142:String[], and:int(ldc:int(5415), ldc:int(602)), invokevirtual:String[expected:String](String::substring, var_3_130:String, and:int(ldc:int(503), ldc:int(7479)), xor:int(ldc:int(2304), ldc:int(2109))))
        storeelement:String(expr_142:String[], and:int(ldc:int(25637), ldc:int(2847)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(8740), ldc:int(8985)), and:int(ldc:int(20289), ldc:int(4417))))
        storeelement:String(expr_142:String[], xor:int(ldc:int(1067), ldc:int(1069)), invokevirtual:String[expected:String](String::substring, var_3_130:String, xor:int(ldc:int(8239), ldc:int(8558)), and:int(ldc:int(19285), ldc:int(1357))))
        putstatic:String[](\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\ud7e8\u92ff\u927d\ud158\ud158\ubefe, expr_142:String[])
        var_3_330 = expr_138:String[]
        putstatic:Logger(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\uc2bd\u4ab3\u93a2\ucb79\u7049\u647c, invokestatic:Logger(LogManager::getLogger))
        putstatic:ThreadFactory(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u92ee\ub1b9\u8753\u3d64\u3d64\u7049, invokevirtual:ThreadFactory(ThreadFactoryBuilder::build, invokevirtual:ThreadFactoryBuilder(ThreadFactoryBuilder::setDaemon, initobject:ThreadFactoryBuilder(ThreadFactoryBuilder::<init>), xor:int[expected:boolean](ldc:int(18592), ldc:int(18593)))))
        putstatic:Pattern(\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b::\u4e72\u156b\ua3b4\u8d98\u2dcc\u120d, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_330:String[], xor:int(ldc:int(12290), ldc:int(12307)))))
    }
    
    public void \u4bc8\u600f\ua61f\uc4d2\u51b2\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67D : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_688 : int
        
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
        var_3_67D = and:int(ldc:int(1725434936), ldc:int(2147308217))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u8c8a\u0c95\u3bd6\u071d\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-1838717246))
        }
        else {
            var_3_67D = and:int(var_3_67D:int, ldc:int(1994250623))
            var_5_8A = and:int(ldc:int(-25945), ldc:int(25688))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29032), ldc:int(20806)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67D:int, ldc:int(1734353404))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(24697), ldc:int(7297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(2349), ldc:int(1041)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67D = and:int(var_3_E3:int, ldc:int(-279510742))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8592), ldc:int(8593)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2009764793))
                        goto(Label_1551)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1263416669))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1569325344))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-411031397))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(985791479))
                        goto(Label_0609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1204904425))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0609)
                            }
                            
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1551)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(352882485))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1558844910))
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2005446545))
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(857903702))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-622331861))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2045275619))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1608216811))
                            var_11_F4 = and:int(ldc:int(4282), ldc:int(-20667))
                            goto(Label_1540)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0609:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-693719731))
                        goto(Label_1551)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-461760003))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1385773451))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1993707369))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-73309984))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1875973758))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0740:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1651120000))
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-884890996))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1967544308))
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(864533267))
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-2082966164))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1858509481))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0878:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-539250703))
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-75505704))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1134)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1834728105))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-17653825))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(25219), ldc:int(325))
                                goto(Label_1134)
                            }
                        }
                    }
                    
                    Label_0988:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1888021150))
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-251173005))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1068469311))
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1342056888))
                        var_11_F4 = and:int(ldc:int(6252), ldc:int(-6270))
                    }
                    
                    Label_1134:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-815908727))
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-649375012))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0988)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1765210814))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-440276913))
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-405217814))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1255:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(919039083))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1666404762))
                            goto(Label_1134)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1763355231))
                            goto(Label_0988)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(658513068))
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(652862664))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-832312840))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1540)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1850052425))
                        goto(Label_1551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1622739707))
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(424640983))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(675287465))
                        goto(Label_0609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-686152911))
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(2010404799))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1540:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_688 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1551:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1255)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-948489991))
                        goto(Label_1134)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0988)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1814434778))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-321407182))
                        goto(Label_0609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1082740615))
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-833113223))
                        var_17_688 = add:int(var_16_122:int, and:int(ldc:int(4185), ldc:int(805)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67D = and:int(var_3_67D:int, ldc:int(-943654084))
                
                if (cmple:boolean(var_5_8A = var_17_688:int, sub:int(var_6_91:int, and:int(ldc:int(4097), ldc:int(17639))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-1491637328))
            goto(Label_0108)
        }
    }
}
