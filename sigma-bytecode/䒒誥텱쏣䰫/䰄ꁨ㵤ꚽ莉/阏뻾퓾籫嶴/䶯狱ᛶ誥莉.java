public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4daf\u72f1\u16f6\u8aa5\u8389 {
    public void \u4daf\u72f1\u16f6\u8aa5\u8389(java.nio.file.Path p0, java.lang.String p1) {
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
    
    public void \u67e9\u839e\u4bc8\u40a9\u8753\u416d() {
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
    
    public java.lang.String \u759a\ub171\u62da\u8308\uae87\ub32d(java.nio.file.Path p0) {
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
            return:String(checkcast:String(java.lang.String.class, invokeinterface:String(Map<Path, String>::get, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u8d98\ubcb0\u92ee\ud4fe\u12b2\u8753, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\uf94d\uae87\u56bd\uf995\u92ff(java.nio.file.Path p0, java.lang.String p1) {
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
            invokeinterface:String(Map<Path, String>::put, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u59ec\ud523\u1833\u4f4a\u67e9\u527a, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path, p1:String)
            
            if (invokestatic:boolean(Objects::equals, invokeinterface:String[expected:Object](Map<Path, String>::remove, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u8d98\ubcb0\u92ee\ud4fe\u12b2\u8753, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path[expected:Object]), p1:String[expected:Object])) {
                putfield:int(\u4daf\u72f1\u16f6\u8aa5\u8389::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, this:\u4daf\u72f1\u16f6\u8aa5\u8389, add:int(getfield:int(\u4daf\u72f1\u16f6\u8aa5\u8389::\u4975\ubded\ubff1\u7ce1\ub7dc\u5d20, this:\u4daf\u72f1\u16f6\u8aa5\u8389), and:int(ldc:int(11), ldc:int(9345))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ufcaf\u40a9\u9033\u5bc4\u76bc\uf995(java.nio.file.Path p0) {
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
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u8d98\ubcb0\u92ee\ud4fe\u12b2\u8753, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\uc87f\u71ae\u76bc\u3711\uc84e(java.nio.file.Path p0) {
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
            invokeinterface:boolean(Set<Path>::add, getfield:Set<Path>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u760c\u76bc\u8413\ud158\ucfaf\u51fa, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8640\u5db4\u5d20\u67d0\u7049\u8258() {
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
    
    private java.util.stream.Stream<java.nio.file.Path> \u416d\u93a2\u97e6\uc246\u6435\uc229() {
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
    
    private boolean lambda$\u67e9\u9af2\u647c\ud217\ub6ab\u61a4$4(java.nio.file.Path p0) {
        var_2_61 : int
        stack_A6_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-554019052), ldc:int(399636122))
            
            if (logicalnot:boolean(logicalor:boolean(invokestatic:boolean(Objects::equals, getfield:Path[expected:Object](\u4daf\u72f1\u16f6\u8aa5\u8389::\uc910\ub70c\u1187\ucfaf\u47c2\ud36e, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path[expected:Object]), invokestatic:boolean(Files::isDirectory, p0:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(27289), ldc:int(-27290))))))) {
                stack_A6_0 = and:int(ldc:int(65), ldc:int(8337))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(2092717702))
                stack_A6_0 = and:int(ldc:int(-8698), ldc:int(8657))
            }
            
            return:boolean(stack_A6_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ua562\uc246\u8640\ub7dc\u3a62\ud171$3(java.nio.file.Path p0) {
        var_2_18A : int
        var_4_183 : IOException
        
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
            var_2_18A = and:int(ldc:int(-914079904), ldc:int(-1659535375))
            
            loop {
                Label_0098:
                
                if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(813731297))
                    goto(Label_0343)
                }
                
                if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0275)
                }
                
                if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-134409052))
                    goto(Label_0220)
                }
                
                if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(2)), ldc:int(0))) {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-1082039777))
                }
                else {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-1372066170))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u4daf\u72f1\u16f6\u8aa5\u8389::\ufcaf\u40a9\u9033\u5bc4\u76bc\uf995, this:\u4daf\u72f1\u16f6\u8aa5\u8389, p0:Path))) {
                        looporswitchbreak()
                    }
                }
                
                Label_0171:
                
                if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0343)
                }
                
                if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0275)
                }
                
                if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-2012758028))
                    
                    if (invokeinterface:boolean(Set<E>::contains, getfield:Set<Path>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u760c\u76bc\u8413\ud158\ucfaf\u51fa, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path[expected:Object])) {
                        looporswitchbreak()
                    }
                }
                
                Label_0220:
                
                if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-1301071086))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_18A = and:int(var_2_18A:int, ldc:int(653480926))
                        goto(Label_0275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-87245242))
                }
                
                try {
                    Label_0343:
                    
                    do {
                        Label_0275:
                        
                        if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(1048576)), ldc:int(0))) {
                                var_2_18A = and:int(var_2_18A:int, ldc:int(-1519306732))
                                goto(Label_0220)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(2)), ldc:int(0))) {
                                var_2_18A = and:int(var_2_18A:int, ldc:int(214132938))
                                goto(Label_0171)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_18A:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_18A = and:int(var_2_18A:int, ldc:int(630663332))
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_18A = and:int(var_2_18A:int, ldc:int(-88657996))
                            invokestatic:void(Files::delete, p0:Path)
                        }
                    } while (cmpne:boolean(and:int(var_2_18A:int, ldc:int(33554432)), ldc:int(0)))
                    
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0220)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0171)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_18A:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-884601016))
                }
                catch (java.io.IOException var_4_183) {
                    var_2_18A = and:int(var_2_18A:int, ldc:int(-659267641))
                    invokeinterface:void(Logger::debug, getstatic:Logger(\u4daf\u72f1\u16f6\u8aa5\u8389::\u6d69\u9af2\u8bb0\ub83f\u600f\u8640), loadelement:String(getstatic:String[](\u4daf\u72f1\u16f6\u8aa5\u8389::\ua61f\u3a62\u6435\u8cae\u6d69\u34df), and:int(ldc:int(547), ldc:int(29707))), p0:Path[expected:Object], invokevirtual:String[expected:Object](Throwable::toString, var_4_183:IOException[expected:Throwable]))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\u1187\ucb79\u446c\uff55\u6d69\u0c95$2(java.util.Map.Entry p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), checkcast:String(java.lang.String.class, invokeinterface:String(Entry<K, String>::getValue, p0:Entry<K, String>))), ldc:char(32)), invokeinterface:Path[expected:Object](Path::relativize, getfield:Path(\u4daf\u72f1\u16f6\u8aa5\u8389::\u36d3\u67d0\ud4fe\u624e\u8389\uc2bd, this:\u4daf\u72f1\u16f6\u8aa5\u8389), checkcast:Path(java.nio.file.Path.class, invokeinterface:K[expected:Path](Entry<K, V>::getKey, p0:Entry<K, String>))))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u71ae\u759a\u759a\u6fb0\u7043\u8aa5$1(java.nio.file.Path p0, java.lang.String p1) {
        var_5_68 : int
        
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
            var_5_68 = invokevirtual:int(String::indexOf, p1:String, ldc:int(32))
            invokeinterface:String(Map<Path, String>::put, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u8d98\ubcb0\u92ee\ud4fe\u12b2\u8753, this:\u4daf\u72f1\u16f6\u8aa5\u8389), invokeinterface:Path(Path::resolve, p0:Path, invokevirtual:String(String::substring, p1:String, add:int(var_5_68:int, and:int(ldc:int(16393), ldc:int(4103))))), invokevirtual:String(String::substring, p1:String, and:int(ldc:int(-17936), ldc:int(17934)), var_5_68:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u88c5\u4c2b\ufe34\ub113\u8df4\u76bc$0(java.nio.file.Path p0) {
        var_4_7A : String
        
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
            var_4_7A = checkcast:String(java.lang.String.class, invokeinterface:String(Map<Path, String>::put, getfield:Map<Path, String>(\u4daf\u72f1\u16f6\u8aa5\u8389::\u8d98\ubcb0\u92ee\ud4fe\u12b2\u8753, this:\u4daf\u72f1\u16f6\u8aa5\u8389), p0:Path, loadelement:String(getstatic:String[](\u4daf\u72f1\u16f6\u8aa5\u8389::\ua61f\u3a62\u6435\u8cae\u6d69\u34df), xor:int(ldc:int(-24525), ldc:int(-24521)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B3 : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_224_0 : byte[] [generated]
        stack_25F_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        stack_347_0 : byte[] [generated]
        var_4_1FD : int
        var_3_202 : byte[]
        var_5_203 : int
        expr_2D7 : byte [generated]
        var_0_33D : int
        expr_347 : byte [generated]
        stack_377_2 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_24D : byte[]
        var_5_24E : int
        expr_D7 : int [generated]
        expr_110 : int [generated]
        var_3_151 : String
        stack_1F0_0 : String[] [generated]
        expr_163 : String[] [generated]
        
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
        var_0_2B3 = and:int(ldc:int(-1053808752), ldc:int(-948292844))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_145_0 = stack_224_0 = stack_25F_0 = stack_2D7_0 = stack_347_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ZYbHVuKC9lo+xzO6pqptxtP6ytIBBzOy5saO73qpicoCkusftio3RSdOkT7O8qPkdioiFTd7cjKTxgLjvcqa+c4O1yOy7jduzs7q2YK/abIyk/o2/v0Wl6aalu3G+vb+zueGCjsOzs7n/2jw4A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1FD = expr_6E:int
        var_3_202 = newarray:byte[](byte.class, expr_6E:int)
        var_5_203 = expr_6E:int
        Label_0517:
        
        while (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0678)
            }
            
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-751279245))
            var_5_203 = add:int(var_5_203:int, ldc:int(-1))
            storeelement:byte(var_3_202:byte[], var_5_203:int, xor:byte(loadelement:byte(stack_224_0:byte[], var_5_203:int), ldc:byte(96)))
            
            if (cmpne:boolean(var_5_203:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_145_0 = stack_224_0 = stack_25F_0 = stack_2D7_0 = stack_347_0 = var_3_202:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0799)
        Label_0678:
        
        while (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-427233118))
                goto(Label_0517)
            }
            
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-617335879))
            var_5_203 = add:int(var_5_203:int, ldc:int(-1))
            expr_2D7 = loadelement:byte(stack_2D7_0:byte[], var_5_203:int)
            storeelement:byte(var_3_202:byte[], var_5_203:int, add:int(or:int(and:int(shl:int(expr_2D7:byte, and:int(ldc:int(6180), ldc:int(8221))), ldc:int(-16)), and:int(shr:int(expr_2D7:byte[expected:int], xor:int(ldc:int(265), ldc:int(269))), ldc:int(15))), ldc:int(85)))
            
            if (cmpne:boolean(var_5_203:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_145_0 = stack_224_0 = stack_25F_0 = stack_2D7_0 = stack_347_0 = var_3_202:byte[]
            goto(Label_0220)
        }
        
        var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-341319554))
        Label_0799:
        
        while (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(512)), ldc:int(0))) {
                var_0_2B3 = and:int(var_0_2B3:int, ldc:int(1158871169))
                goto(Label_0517)
            }
            
            var_0_33D = and:int(var_0_2B3:int, ldc:int(1199124284))
            var_5_203 = add:int(var_5_203:int, ldc:int(-1))
            expr_347 = loadelement:byte(stack_347_0:byte[], var_5_203:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_203:int, ldc:int(4)), neg:int(var_4_1FD:int)), ldc:int(0))) {
                var_0_33D = and:int(var_0_33D:int, ldc:int(-1041137744))
                stack_377_2 = add:byte(expr_347:byte, ldc:byte(4))
            }
            else {
                stack_377_2 = add:byte(expr_347:byte, loadelement:byte(var_3_202:byte[], add:int(var_5_203:int, ldc:int(4))))
            }
            
            var_0_2B3 = and:int(var_0_33D:int, ldc:int(1731487732))
            storeelement:byte(var_3_202:byte[], var_5_203:int, stack_377_2:byte)
            
            if (cmpne:boolean(var_5_203:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_145_0 = stack_224_0 = stack_25F_0 = stack_2D7_0 = stack_347_0 = var_3_202:byte[]
            goto(Label_0277)
        }
        
        goto(Label_0678)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-1332217134))
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(16384)), ldc:int(0))) {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(1371835374))
        }
        else {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-759852))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_24D = newarray:byte[](byte.class, expr_A8:int)
                var_5_24E = expr_A8:int
                
                loop {
                    var_0_2B3 = and:int(var_0_2B3:int, ldc:int(1400338418))
                    var_5_24E = add:int(var_5_24E:int, ldc:int(-1))
                    storeelement:byte(var_3_24D:byte[], var_5_24E:int, add:int(shl:int(loadelement:byte(stack_25F_0:byte[], var_5_24E:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_24E:int, xor:int(ldc:int(4233), ldc:int(4232)))), ldc:int(6)), xor:int(ldc:int(2184), ldc:int(2187)))))
                    
                    if (cmpne:boolean(var_5_24E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_145_0 = stack_224_0 = stack_25F_0 = stack_2D7_0 = stack_347_0 = var_3_24D:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-1024902957))
                goto(Label_0115)
            }
            
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-101604485))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_1FD = expr_D7:int
                var_3_202 = newarray:byte[](byte.class, expr_D7:int)
                var_5_203 = expr_D7:int
                goto(Label_0678)
            }
        }
        
        Label_0220:
        
        if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-1540743699))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(131072)), ldc:int(0))) {
                var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-1151228833))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(-142836740))
            expr_110 = arraylength:int(stack_110_0:byte[])
            
            if (cmpne:boolean(expr_110:int, ldc:int(0))) {
                var_4_1FD = expr_110:int
                var_3_202 = newarray:byte[](byte.class, expr_110:int)
                var_5_203 = expr_110:int
                goto(Label_0799)
            }
        }
        
        Label_0277:
        
        if (cmpeq:boolean(and:int(var_0_2B3:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(724213646))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0173)
        }
        
        if (cmpne:boolean(and:int(var_0_2B3:int, ldc:int(16384)), ldc:int(0))) {
            var_0_2B3 = and:int(var_0_2B3:int, ldc:int(272668807))
            goto(Label_0115)
        }
        
        var_3_151 = initobject:String(String::<init>, stack_145_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1F0_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(199), ldc:int(194)))
        expr_163 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30650), ldc:int(-30653)))
        storeelement:String(expr_163:String[], and:int(ldc:int(4790), ldc:int(8453)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(13447), ldc:int(-31976)), and:int(ldc:int(-12504), ldc:int(12486))))
        storeelement:String(expr_163:String[], and:int(ldc:int(-15017), ldc:int(15016)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(24070), ldc:int(-24135)), xor:int(ldc:int(-31612), ldc:int(-31614))))
        storeelement:String(expr_163:String[], and:int(ldc:int(8262), ldc:int(10)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(1539), ldc:int(1541)), and:int(ldc:int(20919), ldc:int(2102))))
        storeelement:String(expr_163:String[], and:int(ldc:int(1091), ldc:int(12319)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(5686), ldc:int(310)), xor:int(ldc:int(6), ldc:int(73))))
        storeelement:String(expr_163:String[], xor:int(ldc:int(-28600), ldc:int(-28599)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(4687), ldc:int(17647)), xor:int(ldc:int(-31679), ldc:int(-31699))))
        putstatic:String[](\u4daf\u72f1\u16f6\u8aa5\u8389::\ua61f\u3a62\u6435\u8cae\u6d69\u34df, expr_163:String[])
        putstatic:Logger(\u4daf\u72f1\u16f6\u8aa5\u8389::\u6d69\u9af2\u8bb0\ub83f\u600f\u8640, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \ub83f\u1833\u8d98\uceb8\u6fb0\uc7fe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_699 = and:int(ldc:int(-647130780), ldc:int(1333375089))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4daf\u72f1\u16f6\u8aa5\u8389[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(131072)), ldc:int(0))) {
            var_3_699 = and:int(var_3_699:int, ldc:int(1086153862))
        }
        else {
            var_3_699 = and:int(var_3_699:int, ldc:int(1843368825))
            var_5_8A = and:int(ldc:int(-28637), ldc:int(20376))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-729), ldc:int(728)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_699:int, ldc:int(1836953814))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, xor:int(ldc:int(-32478), ldc:int(-32477)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(20043), ldc:int(8449)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_699 = and:int(var_3_D9:int, ldc:int(-808863108))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(9473), ldc:int(9472)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-540937743))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1529381639))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-728327936))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(948348643))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(427364065))
                    }
                    else {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1535105112))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0627)
                            }
                            
                            goto(Label_0904)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-655639956))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1452050392))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-606912100))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-17293371))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-212357510))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-658864889))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-2146391980))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-402474081))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-338564741))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1801425915))
                        var_11_EA = and:int(ldc:int(18706), ldc:int(-18707))
                        goto(Label_1577)
                    }
                    
                    Label_0627:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1994993941))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1139201573))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(64)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-131958060))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-113523166))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1748109976))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-153645553))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(2103156599))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0904)
                        }
                    }
                    
                    Label_0767:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1156221949))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1153633786))
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-738483820))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(385968875))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(2115017874))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1598791496))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0904:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-80067174))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1504658155))
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(641644994))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1431138698))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0767)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(509589150))
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1884978528))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(-76574267))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = and:int(ldc:int(18449), ldc:int(265))
                                goto(Label_1201)
                            }
                        }
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1120800043))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-1530230344))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(188711490))
                            goto(Label_0767)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(932507908))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1297846888))
                        var_11_EA = and:int(ldc:int(-23460), ldc:int(5027))
                    }
                    
                    Label_1201:
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1243197126))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0767)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(2110520431))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1449)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-335085785))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-393197010))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-2115776131))
                            goto(Label_1201)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(315084335))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0904)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0767)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(1092324351))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_699 = and:int(var_3_699:int, ldc:int(-1485147740))
                            loopcontinue()
                        }
                        
                        var_3_699 = and:int(var_3_699:int, ldc:int(1833827910))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                        goto(Label_1577)
                    }
                    
                    Label_1449:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-404520880))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-2034429781))
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(835325577))
                        loopcontinue()
                    }
                    
                    var_3_699 = and:int(var_3_699:int, ldc:int(-840060566))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1577:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A4 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1588:
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1449)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_699:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(1262712709))
                        goto(Label_0904)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(472177655))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-164491067))
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_699:int, ldc:int(8)), ldc:int(0))) {
                        var_3_699 = and:int(var_3_699:int, ldc:int(-302255381))
                        var_17_6A4 = add:int(var_16_118:int, and:int(ldc:int(16537), ldc:int(12615)))
                        looporswitchbreak()
                    }
                }
                
                var_3_699 = and:int(var_3_699:int, ldc:int(-605039798))
                
                if (cmple:boolean(var_5_8A = var_17_6A4:int, sub:int(var_6_91:int, xor:int(ldc:int(4146), ldc:int(4147))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_699:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
