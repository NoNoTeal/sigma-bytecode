public class \u6435\ub8be\u718f\u6b0d\u67e9.\u0c95\ubded\ucfaf\u946b\ubb2b\ube23 {
    public void \u0c95\ubded\ucfaf\u946b\ubb2b\ube23(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u61a4\u600f\uae87\ube23\u927d\u4179 p0) {
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
            putfield:\u61a4\u600f\uae87\ube23\u927d\u4179(\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u3d64\ud158\u5140\u385b\u0a06\u51b2, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23, p0:\u61a4\u600f\uae87\ube23\u927d\u4179)
            invokespecial:\ub18d\uae87\u92ee\u624e\u7873\uc31c(\ub18d\uae87\u92ee\u624e\u7873\uc31c::<init>, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, java.util.List<\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad>> \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, java.util.List<\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad>> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
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
    
    public java.lang.String \u8bb0\u7043\u6b5f\uc229\u5140\u5d20() {
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
            return:String(loadelement:String(getstatic:String[](\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u8d90\u12cb\ud36e\u8389\u494c\ub6ab), and:int(ldc:int(1551), ldc:int(27007))))
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(java.lang.Object p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
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
            invokevirtual:void(\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23, checkcast:Map(java.util.Map.class, p0:Object[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>>]), p1:\u6c52\u52d3\u516c\uae87\uae5d, p2:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
            return:Object(invokevirtual:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, List<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>>[expected:Object](\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u88c5\u1833\uc87f\u6d69\u69d9\u3e75, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\ubf56\u64f2\u392e\u98a4\u120d))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4c2b\u0800\uae87\u8753\uf94d\u12b2$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.util.List p1) {
        var_5_71 : \ufcaf\ud7e8\ud158\u6435\u759a\u6435
        
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
            var_5_71 = initobject:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::<init>, invokestatic:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u61a4\u600f\uae87\ube23\u927d\u4179::\u4e72\uae87\u3711\u4179\ud158\u5245, getfield:\u61a4\u600f\uae87\ube23\u927d\u4179(\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u3d64\ud158\u5140\u385b\u0a06\u51b2, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23)), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            invokevirtual:void(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubff1\u62da\u67e9\u120d\u8308\u6bb9, var_5_71:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokestatic:List(Lists::reverse, p1:List))
            invokeinterface:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>::put, invokestatic:Map(\u61a4\u600f\uae87\ube23\u927d\u4179::\u9033\u98a4\u6198\u9255\ubff1\u385b, getfield:\u61a4\u600f\uae87\ube23\u927d\u4179(\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u3d64\ud158\u5140\u385b\u0a06\u51b2, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23)), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_5_71:\ufcaf\ud7e8\ud158\u6435\u759a\u6435)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud171\u34df\u3d64\u3d4b\u64f2\ua068$2(java.util.List p0, int p1) {
        var_2_B1 : int
        var_4_7C : Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>
        
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
            var_2_B1 = and:int(ldc:int(1636016329), ldc:int(-1936260126))
            
            if (cmpne:boolean(p1:int, ldc:int(32))) {
                var_4_7C = invokeinterface:Iterator(List::iterator, invokestatic:List(Lists::reverse, p0:List))
                
                loop {
                    var_2_B1 = and:int(var_2_B1:int, ldc:int(-760235319))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7C:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>))) {
                        looporswitchbreak()
                    }
                    
                    if (cmpne:boolean(invokeinterface:\u8258\u8389\ub18d\u718f\u61a4\ubf56(\ub113\u9af2\u64f2\u5f50\u4179\u7bad::\u5245\uae87\u3d64\u3e75\u6bb9\u4f52, checkcast:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad.class, invokeinterface:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>::next, var_4_7C:Iterator<\ub113\u9af2\u64f2\u5f50\u4179\u7bad>)), p1:int), aconstnull:\u8258\u8389\ub18d\u718f\u61a4\ubf56())) {
                        looporswitchbreak()
                    }
                    
                    var_2_B1 = and:int(var_2_B1:int, ldc:int(1875096811))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\uf94d\u3dd3\ud523\ucef1\u385b\u8bb0$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        expr_69 : \ub113\u9af2\u64f2\u5f50\u4179\u7bad[] [generated]
        
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
            expr_69 = newarray:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[](\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad.class, and:int(ldc:int(6405), ldc:int(169)))
            storeelement:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(expr_69:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[], and:int(ldc:int(22658), ldc:int(-31875)), initobject:\uc4d2\u1833\u9255\u92ff\uc246\u4cd9[expected:\ub113\u9af2\u64f2\u5f50\u4179\u7bad](\uc4d2\u1833\u9255\u92ff\uc246\u4cd9::<init>))
            return:List(invokestatic:ArrayList(Lists::newArrayList, expr_69:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[][expected:Object[]]))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u760c\ua068\ud158\uc31c\ubcb0\u946b$0(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(String::endsWith, p0:String, loadelement:String(getstatic:String[](\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u8d90\u12cb\ud36e\u8389\u494c\ub6ab), and:int(ldc:int(12347), ldc:int(838)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_348 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_2F0_0 : byte[] [generated]
        stack_35B_0 : byte[] [generated]
        stack_3D6_0 : byte[] [generated]
        var_4_2C8 : int
        var_3_2CD : byte[]
        var_5_2CE : int
        expr_2F6 : byte [generated]
        var_0_2DD : int
        var_0_375 : int
        expr_35B : byte [generated]
        stack_3A4_2 : byte [generated]
        stack_378_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C5 : byte[]
        expr_C9 : int [generated]
        var_3_3C4 : byte[]
        var_5_3C5 : int
        var_3_F9 : String
        stack_2C1_0 : String[] [generated]
        expr_10B : String[] [generated]
        
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
        var_0_348 = and:int(ldc:int(-388500450), ldc:int(-170663265))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_C5_0 = stack_C7_0 = stack_ED_0 = stack_2F0_0 = stack_35B_0 = stack_3D6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4I2ninfyu6Nb6pxPgre5p5g9mIonhAJTp7e9uYyWjQ2elNO7DFnLOgKzhhALjYqnq6u5oyuONIa5HreNUYhfVY591w3gnEnmub+N3NA0T1OSPZiKJ4QCU6e3vbmMlo0NnpTTuwxZyzoCs4YQC42Kp6uaJYCcQdI0T1OSPZiKJ5Q2V6e3rbmNhgaAloK7sT3TmpghvwxZyzoCs4YQC42Kp6uruaMrjjSGuR63jVGIX1WOfdcN4JxJ5rm/jSzAPk+tmoS7sY21gIaIq6ujtYaxgr+CIZqpiLUyqbGxsbOAjFlViruGkoC5pVFVirtXmLGtU56htZi/v7u/WYi1qZzqhqPzL9UjHco=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2C8 = expr_6E:int
        var_3_2CD = newarray:byte[](byte.class, expr_6E:int)
        var_5_2CE = expr_6E:int
        Label_0720:
        
        while (cmpeq:boolean(and:int(var_0_348:int, ldc:int(2048)), ldc:int(0))) {
            var_0_348 = and:int(var_0_348:int, ldc:int(-471344993))
            var_5_2CE = add:int(var_5_2CE:int, ldc:int(-1))
            expr_2F6 = add:byte(xor:byte(loadelement:byte(stack_2F0_0:byte[], var_5_2CE:int), ldc:byte(82)), ldc:byte(33))
            storeelement:byte(var_3_2CD:byte[], var_5_2CE:int, or:int(and:int(shl:int(expr_2F6:byte, and:int(ldc:int(14), ldc:int(10852))), ldc:int(-16)), and:int(shr:int(expr_2F6:byte[expected:int], xor:int(ldc:int(-20475), ldc:int(-20479))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2CE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_ED_0 = stack_2F0_0 = stack_35B_0 = stack_3D6_0 = var_3_2CD:byte[]
            goto(Label_0115)
        }
        
        var_0_2DD = and:int(var_0_348:int, ldc:int(-992404294))
        Label_0827:
        
        while (cmpne:boolean(and:int(var_0_2DD:int, ldc:int(4)), ldc:int(0))) {
            var_0_375 = and:int(var_0_2DD:int, ldc:int(-154408033))
            var_5_2CE = add:int(var_5_2CE:int, ldc:int(-1))
            expr_35B = stack_3A4_2 = loadelement(stack_35B_0, var_5_2CE)
            
            if (cmplt:boolean(add:int(add:int(var_5_2CE:int, ldc:int(5)), neg:int(var_4_2C8:int)), ldc:int(0))) {
                stack_3A4_2 = stack_378_0 = add:byte(expr_35B:byte, loadelement:byte(var_3_2CD:byte[], add:int(var_5_2CE:int, ldc:int(5))))
                goto(Label_0904)
            }
            
            Label_0872:
            
            if (cmpeq:boolean(and:int(var_0_375:int, ldc:int(2048)), ldc:int(0))) {
                var_0_375 = and:int(var_0_375:int, ldc:int(-422576769))
                stack_3A4_2 = stack_378_0 = add:byte(expr_35B:byte, ldc:byte(5))
            }
            
            Label_0904:
            
            if (cmpne:boolean(and:int(var_0_375:int, ldc:int(1)), ldc:int(0))) {
                var_0_375 = and:int(var_0_375:int, ldc:int(1623439129))
                goto(Label_0872)
            }
            
            var_0_2DD = and:int(var_0_375:int, ldc:int(-151000673))
            storeelement:byte(var_3_2CD:byte[], var_5_2CE:int, stack_3A4_2:byte)
            
            if (cmpne:boolean(var_5_2CE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_ED_0 = stack_2F0_0 = stack_35B_0 = stack_3D6_0 = var_3_2CD:byte[]
            goto(Label_0155)
        }
        
        var_0_348 = and:int(var_0_2DD:int, ldc:int(198911268))
        goto(Label_0720)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_2DD = and:int(var_0_348:int, ldc:int(-972414187))
        }
        else {
            var_0_2DD = and:int(var_0_348:int, ldc:int(-505947105))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_2C8 = expr_96:int
                var_3_2CD = newarray:byte[](byte.class, expr_96:int)
                var_5_2CE = expr_96:int
                goto(Label_0827)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_2DD:int, ldc:int(1)), ldc:int(0))) {
            var_0_348 = and:int(var_0_2DD:int, ldc:int(-1041680610))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2DD:int, ldc:int(32768)), ldc:int(0))) {
                var_0_348 = and:int(var_0_2DD:int, ldc:int(-1430167821))
                goto(Label_0115)
            }
            
            var_0_348 = and:int(var_0_2DD:int, ldc:int(-456393346))
            var_2_C5 = stack_C5_0:byte[]
            expr_C9 = add:int(arraylength:int(stack_C7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_3_3C4 = newarray:byte[](byte.class, expr_C9:int)
                var_5_3C5 = expr_C9:int
                
                loop {
                    var_0_348 = and:int(var_0_348:int, ldc:int(-203687362))
                    var_5_3C5 = add:int(var_5_3C5:int, ldc:int(-1))
                    storeelement:byte(var_3_3C4:byte[], var_5_3C5:int, add:int(shl:int(loadelement:byte(stack_3D6_0:byte[], var_5_3C5:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C5:byte[], add:int(var_5_3C5:int, and:int(ldc:int(2083), ldc:int(1497)))), ldc:int(5)), and:int(ldc:int(823), ldc:int(8327)))))
                    
                    if (cmpne:boolean(var_5_3C5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_ED_0 = stack_2F0_0 = stack_35B_0 = stack_3D6_0 = var_3_3C4:byte[]
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2DD = and:int(var_0_348:int, ldc:int(-642879063))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_348:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_F9 = initobject:String(String::<init>, stack_ED_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2C1_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20), ldc:int(4)))
            expr_10B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(275), ldc:int(3220)))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(8218), ldc:int(8216)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(-15536), ldc:int(3247)), and:int(ldc:int(141), ldc:int(4421))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(18959), ldc:int(12495)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(16935), ldc:int(16930)), and:int(ldc:int(49), ldc:int(656))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(14352), ldc:int(14362)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(26657), ldc:int(26673)), xor:int(ldc:int(32), ldc:int(112))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-30431), ldc:int(-30422)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(85), ldc:int(8400)), and:int(ldc:int(378), ldc:int(19070))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(79), ldc:int(70)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(18810), ldc:int(5371)), and:int(ldc:int(6352), ldc:int(193))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(9063), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(662), ldc:int(598)), xor:int(ldc:int(331), ldc:int(394))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(1548), ldc:int(14398)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(4223), ldc:int(4286)), and:int(ldc:int(23752), ldc:int(1016))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(13325), ldc:int(13312)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(2664), ldc:int(2720)), xor:int(ldc:int(8317), ldc:int(8370))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(12688), ldc:int(-15251)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(18671), ldc:int(207)), xor:int(ldc:int(8211), ldc:int(8384))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(-32767), ldc:int(-32768)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(3799), ldc:int(467)), xor:int(ldc:int(680), ldc:int(624))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(6277), ldc:int(6272)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-12243), ldc:int(-12043)), and:int(ldc:int(19967), ldc:int(4319))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(519), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(578), ldc:int(669)), and:int(ldc:int(234), ldc:int(28921))))
            storeelement:String(expr_10B:String[], xor:int(ldc:int(140), ldc:int(138)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(20712), ldc:int(20480)), and:int(ldc:int(502), ldc:int(762))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(4107), ldc:int(16771)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(22), ldc:int(228)), and:int(ldc:int(249), ldc:int(1273))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(95), ldc:int(3086)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, xor:int(ldc:int(-16363), ldc:int(-16148)), and:int(ldc:int(8454), ldc:int(7602))))
            storeelement:String(expr_10B:String[], and:int(ldc:int(584), ldc:int(24604)), invokevirtual:String[expected:String](String::substring, var_3_F9:String, and:int(ldc:int(263), ldc:int(898)), and:int(ldc:int(4518), ldc:int(8518))))
            putstatic:String[](\u0c95\ubded\ucfaf\u946b\ubb2b\ube23::\u8d90\u12cb\ud36e\u8389\u494c\ub6ab, expr_10B:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u9a18\ua3b4\ud171\u4cd9\u3bd6\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_699 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_6A4 : int
        
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
        var_3_699 = and:int(ldc:int(1606828129), ldc:int(2077943779))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\ubded\ucfaf\u946b\ubb2b\ube23[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
            var_3_699 = and:int(var_3_699:int, ldc:int(-1552385947))
        }
        else {
            var_3_699 = and:int(var_3_699:int, ldc:int(-71061459))
            var_5_8A = and:int(ldc:int(-20845), ldc:int(20844))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9489), ldc:int(9488)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_699:int, ldc:int(1608122035))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(2061), ldc:int(29091)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(8199), ldc:int(9)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_699 = and:int(var_3_D9:int, ldc:int(-4073111))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-31735), ldc:int(-31736)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(955947238))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-945548494))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1328296480))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1205772657))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0570)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1241651637))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-68367087))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-445347512))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1050949194))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1634238732))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1935398845))
                            var_11_EA = and:int(ldc:int(9229), ldc:int(-9230))
                            goto(Label_1548)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0570:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1058673803))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1919995662))
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1586537551))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1791525899))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1733625701))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-2136777703))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1120)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-214842854))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(51500646))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-940479571))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1166376057))
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1207507406))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(714679922))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1162265714))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1480193708))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(58602890))
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(314476827))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-134877019))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(1856), ldc:int(1857))
                                goto(Label_1120)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1113393986))
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1222242057))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1342529366))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(2050834673))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-337503889))
                        var_11_EA = and:int(ldc:int(-20527), ldc:int(20526))
                    }
                    
                    Label_1120:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-386998544))
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(135281804))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1187374254))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-905488480))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-478792987))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1387)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(441206092))
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-2056342369))
                            goto(Label_1120)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1565823326))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0812)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0570)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1424659815))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1334094009))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1942197503))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1548)
                    }
                    
                    Label_1387:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1341069625))
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1097690037))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1530415059))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-64626669))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1468309873))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1435621001))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-757928906))
                        loopcontinue()
                    }
                    
                    var_3_699 = and:int(var_3_699:int, ldc:int(-211625737))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1548:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A4 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1559:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(336918590))
                        goto(Label_1120)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-918994833))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1330319870))
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-288579424))
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(2003199518))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(256)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1867800033))
                        var_17_6A4 = add:int(var_16_118:int, and:int(ldc:int(289), ldc:int(2049)))
                        looporswitchbreak()
                    }
                    
                    var_3_699 = and:int(var_3_699:int, ldc:int(-230222405))
                }
                
                var_3_699 = and:int(var_3_699:int, ldc:int(2001953637))
                
                if (cmple:boolean(var_5_8A = var_17_6A4:int, sub:int(var_6_91:int, and:int(ldc:int(5481), ldc:int(2561))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
