public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 {
    public void \ua6bd\u4975\uc7fe\u3711\u8350() {
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
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u718f\uae5d\u3bd6\u3bd6\ub19c\ub32d(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u51b2\u8640\u446c\ufcaf\u2dcc p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u624e\u0b8e\ud158\ud158\ubf56 p1) {
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
            invokeinterface:boolean(List<\u624e\u0b8e\ud158\ud158\ubf56>::add, checkcast:List<\u624e\u0b8e\ud158\ud158\ubf56>(java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u624e\u0b8e\ud158\ud158\ubf56>.class, invokeinterface:List<\u624e\u0b8e\ud158\ud158\ubf56>(Map<\u51b2\u8640\u446c\ufcaf\u2dcc, List<\u624e\u0b8e\ud158\ud158\ubf56>>::get, getfield:Map<\u51b2\u8640\u446c\ufcaf\u2dcc, List<\u624e\u0b8e\ud158\ud158\ubf56>>(\ua6bd\u4975\uc7fe\u3711\u8350::\u8709\u3d64\u4bc8\ubb2b\uf94d\u7c6b, this:\ua6bd\u4975\uc7fe\u3711\u8350), p0:\u51b2\u8640\u446c\ufcaf\u2dcc[expected:Object])), p1:\u624e\u0b8e\ud158\ud158\ubf56)
            return:\ua6bd\u4975\uc7fe\u3711\u8350(this:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u40a9\u98a4\u8d90\ud36e\u8413\u0800(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0, double p1, double p2) {
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
            invokeinterface:\uff55\uf94d\ub6ab\u516c\u12cb(Map<\u9255\u0c95\u4cd9\ube23\u760c<?>, \uff55\uf94d\ub6ab\u516c\u12cb>::put, getfield:Map<\u9255\u0c95\u4cd9\ube23\u760c<?>, \uff55\uf94d\ub6ab\u516c\u12cb>(\ua6bd\u4975\uc7fe\u3711\u8350::\ub83f\u3e75\u4c04\u5245\uc4d2\uc2e8, this:\ua6bd\u4975\uc7fe\u3711\u8350), p0:\u9255\u0c95\u4cd9\ube23\u760c<?>, initobject:\uff55\uf94d\ub6ab\u516c\u12cb(\uff55\uf94d\ub6ab\u516c\u12cb::<init>, p2:double, p1:double, aconstnull:\ub83f\u7bad\u6c56\u6435\u88c5()))
            return:\ua6bd\u4975\uc7fe\u3711\u8350(this:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u7873\ud158\ua6bd\ub32d\u8d90\u7c6b(float p0) {
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
            putfield:float(\ua6bd\u4975\uc7fe\u3711\u8350::\u0800\u873d\ub83f\u8d90\uc229\u4cd9, this:\ua6bd\u4975\uc7fe\u3711\u8350, p0:float)
            return:\ua6bd\u4975\uc7fe\u3711\u8350(this:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ua6bd\u4975\uc7fe\u3711\u8350 \u8308\u3d64\u59ec\ub171\ud217\u760c() {
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
            putfield:boolean(\ua6bd\u4975\uc7fe\u3711\u8350::\u8640\ub83f\uae5d\uf94d\u40a9\u6ec6, this:\ua6bd\u4975\uc7fe\u3711\u8350, and:int[expected:boolean](ldc:int(4741), ldc:int(17473)))
            return:\ua6bd\u4975\uc7fe\u3711\u8350(this:\ua6bd\u4975\uc7fe\u3711\u8350)
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u6198\uff55\u56bd\u8308\u4cd9 \u12cb\ud523\u873d\u92ee\ubff1\u4c2b() {
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
    
    private static java.util.List lambda$\u51fa\uc910\u7c6b\u4e72\u8709\u3c25$2(java.util.Map.Entry p0) {
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
            return:List(invokestatic:ImmutableList[expected:List](ImmutableList::copyOf, checkcast:Collection(java.util.Collection.class, invokeinterface:Collection(Entry<K, Collection>::getValue, p0:Entry<K, Collection>))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u8640\uc87f\u4e72\u71f1\uae5d\ub83f$1(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u51b2\u8640\u446c\ufcaf\u2dcc p0) {
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
            return:List(invokestatic:ArrayList[expected:List](Lists::newArrayList))
        }
        
        goto(Label_0006)
    }
    
    private static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u51b2\u8640\u446c\ufcaf\u2dcc lambda$\u8d90\u8389\u3e75\u4492\u927d\u7049$0(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u51b2\u8640\u446c\ufcaf\u2dcc p0) {
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
            return:\u51b2\u8640\u446c\ufcaf\u2dcc(p0:\u51b2\u8640\u446c\ufcaf\u2dcc)
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
    
    public void \u3e2a\u718f\ubff1\u4ab3\u7e3f\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CB : int
        var_11_DC : int
        var_14_106 : double
        var_16_10A : int
        var_12_102 : double
        var_17_678 : int
        
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
        var_3_66D = and:int(ldc:int(554736402), ldc:int(1098225548))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua6bd\u4975\uc7fe\u3711\u8350[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_66D = and:int(var_3_66D:int, ldc:int(1775623010))
            var_5_7D = and:int(ldc:int(2530), ldc:int(-2531))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15001), ldc:int(-15002)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CB = and:int(var_3_66D:int, ldc:int(-1556431296))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DC = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DC:int, sub:int(var_6_84:int, and:int(ldc:int(4161), ldc:int(8453)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DC:int, xor:int(ldc:int(17408), ldc:int(17409)))), var_7_93:double))) {
                        inc:int(var_11_DC, ldc:int(1))
                    }
                    
                    var_3_66D = and:int(var_3_CB:int, ldc:int(2140598963))
                    var_14_106 = var_7_93:double
                    var_16_10A = var_11_DC:int
                }
                else {
                    var_11_DC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2115), ldc:int(29953)))
                    var_12_102 = var_14_106 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10A = var_11_DC:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DC:int)
                        var_16_10A = var_11_DC:int
                        var_14_106 = var_12_102:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(2032977239))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(60304646))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-612819033))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1320030270))
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-652435605))
                        
                        if (cmplt:boolean(var_16_10A:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(817321030))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2053634469))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-659415642))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-910483352))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-216164648))
                        var_11_DC = and:int(ldc:int(21740), ldc:int(-30189))
                        goto(Label_1533)
                    }
                    
                    Label_0561:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1835091125))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-2106197408))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1745362717))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-496697040))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1890190469))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_106 = var_9_B9:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(172156976))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1994924366))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1456221850))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1476250963))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1004643204))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(569758286))
                        var_14_106 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_106:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(2091956613))
                        goto(Label_1387)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-251631117))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(623370789))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1299811819))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(762666525))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1901932641))
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(829684654))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DC = and:int(ldc:int(129), ldc:int(1793))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1750149344))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1796458316))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(964099585))
                        var_11_DC = and:int(ldc:int(-12804), ldc:int(12803))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(309062687))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-712437252))
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-2060357832))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1234856932))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1994671442))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                                goto(Label_1387)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1928880911))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-494509766))
                            goto(Label_1110)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-821819130))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1999598729))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(51635868))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(1413935707))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66D = and:int(var_3_66D:int, ldc:int(-1349266893))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_106:double, var_5_7D:int, var_16_10A:int)
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1387:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(647907244))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(320361689))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1286529117))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(117884720))
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(1343206525))
                        goto(Label_0395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66D = and:int(var_3_66D:int, ldc:int(-2026064123))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_106:double, ldc:double(0.0))
                    Label_1533:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_678 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1544:
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1848055687))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(285009433))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(-1416726953))
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66D = and:int(var_3_66D:int, ldc:int(2132655082))
                        var_17_678 = add:int(var_16_10A:int, and:int(ldc:int(129), ldc:int(8209)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66D = and:int(var_3_66D:int, ldc:int(119076460))
                
                if (cmple:boolean(var_5_7D = var_17_678:int, sub:int(var_6_84:int, and:int(ldc:int(8737), ldc:int(3211))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_66D:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
