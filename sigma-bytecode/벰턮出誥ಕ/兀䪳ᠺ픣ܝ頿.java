public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u5140\u4ab3\u183a\ud523\u071d\u983f {
    public void \u5140\u4ab3\u183a\ud523\u071d\u983f(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p0) {
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
    
    public void \u5140\u4ab3\u183a\ud523\u071d\u983f(int p0, int p1, boolean p2) {
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
            invokespecial:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::<init>, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f, initobject:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::<init>, p0:int, p1:int, p2:boolean))
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a]), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)))
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ucfaf\u4f4a\u71f1\u69d9\uafe7\u647c, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u34df\ud7e8\u51fa\ubcb0\u74b1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
    
    public void \u76bc\ua3b4\ua3b4\uc9f6\u92ff\ud158() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-333233001), ldc:int(-1397241409))
            
            if (cmpeq:boolean(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f), aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-290728233))
                invokeinterface:void(Logger::warn, getstatic:Logger(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u9a18\ud51e\u6ec6\u3d4b\u6ec6\uae87), loadelement:String(getstatic:String[](\u5140\u4ab3\u183a\ud523\u071d\u983f::\u16f6\u3e75\uf9c5\u960f\u7ce1\u7873), and:int(ldc:int(14627), ldc:int(-14644))), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])))
            }
            else {
                invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u5f50\u0800\u6b5f\u4cd9\u0c95\u6cfe, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
                invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u7e3f\u4cd9\u071d\u8640\u4179\u0800, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f), and:int(ldc:int(-22155), ldc:int(22154)), and:int(ldc:int(25384), ldc:int(-25389)), and:int(ldc:int(-13863), ldc:int(13860)), and:int[expected:boolean](ldc:int(17698), ldc:int(-17699)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 \uc31c\u97b7\u7049\ub19c\u56bd\u3e2a() {
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
            return:\u5db4\ud523\u7043\u6c52\u8308\u8350(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f))
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\ua562\u99f7\u6c56\u7c6b\u34df(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5db4\ud523\u7043\u6c52\u8308\u8350 p0) {
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
            
            if (cmpne:boolean(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f), aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f))
            }
            
            putfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f, p0:\u5db4\ud523\u7043\u6c52\u8308\u8350)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
            
            if (cmpne:boolean(getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f), aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f))
                invokevirtual:void(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\uc31c\u8c8a\u0800\u3d64\ua3b4\u0800, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
                putfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4d85\uc3e3\u4975\u47c2\u6bb9\u6c56$0() {
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
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, invokevirtual:int(\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a::\u3dd3\u071d\u6fb0\u8413\u64f2\u3bc9, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a]), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\ubb2b\u3a62\u71ae\ub171\u92ff\u8389, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)), invokevirtual:int(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u392e\u839e\u183a\u72f1\ucb79\u5245, getfield:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u3c25\uc84e\uc229\u52d3\u51b2\u7ce1, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)))
            invokevirtual:void(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u76bc\ua3b4\ua3b4\uc9f6\u92ff\ud158, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            
            if (invokestatic:boolean(\u8308\u51fa\u6c56\u5db4\ub18d\u34df::\u61a4\u3e75\u8aa5\ub102\ub7dc\u647c)) {
                invokestatic:void(\u9255\u64ab\ub6ab\ubf56\u88c5\u647c::\ucfaf\u4f4a\u71f1\u69d9\uafe7\u647c, this:\u5140\u4ab3\u183a\ud523\u071d\u983f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1DF : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_137_0 : byte[] [generated]
        stack_18D_0 : byte[] [generated]
        stack_1F1_0 : byte[] [generated]
        var_4_11A : int
        var_3_11F : byte[]
        var_5_120 : int
        expr_13D : byte [generated]
        var_0_1E7 : int
        expr_1F1 : byte [generated]
        stack_21F_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_17C : byte[]
        var_5_17D : int
        expr_B5 : int [generated]
        var_3_DA : String
        stack_10D_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_1DF = and:int(ldc:int(-1072133512), ldc:int(112755453))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_137_0 = stack_18D_0 = stack_1F1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7TNmxMB6kjYxnjwxeTnGxZzdwDM7eco67ZnJyj5+wcdQPElCNA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_11A = expr_6B:int
        var_3_11F = newarray:byte[](byte.class, expr_6B:int)
        var_5_120 = expr_6B:int
        Label_0290:
        
        while (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(1335027534))
            var_5_120 = add:int(var_5_120:int, ldc:int(-1))
            expr_13D = add:byte(xor:byte(loadelement:byte(stack_137_0:byte[], var_5_120:int), ldc:byte(49)), ldc:byte(4))
            storeelement:byte(var_3_11F:byte[], var_5_120:int, or:int(and:int(shl:int(expr_13D:byte, and:int(ldc:int(19269), ldc:int(4142))), ldc:int(-16)), and:int(shr:int(expr_13D:byte[expected:int], xor:int(ldc:int(1032), ldc:int(1036))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_120:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_137_0 = stack_18D_0 = stack_1F1_0 = var_3_11F:byte[]
            goto(Label_0112)
        }
        
        Label_0468:
        
        while (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1E7 = and:int(var_0_1DF:int, ldc:int(536403930))
            var_5_120 = add:int(var_5_120:int, ldc:int(-1))
            expr_1F1 = loadelement:byte(stack_1F1_0:byte[], var_5_120:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_120:int, ldc:int(4)), neg:int(var_4_11A:int)), ldc:int(0))) {
                var_0_1E7 = and:int(var_0_1E7:int, ldc:int(2088104670))
                stack_21F_2 = add:byte(expr_1F1:byte, ldc:byte(4))
            }
            else {
                stack_21F_2 = add:byte(expr_1F1:byte, loadelement:byte(var_3_11F:byte[], add:int(var_5_120:int, ldc:int(4))))
            }
            
            var_0_1DF = and:int(var_0_1E7:int, ldc:int(-1011710004))
            storeelement:byte(var_3_11F:byte[], var_5_120:int, stack_21F_2:byte)
            
            if (cmpne:boolean(var_5_120:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_137_0 = stack_18D_0 = stack_1F1_0 = var_3_11F:byte[]
            goto(Label_0186)
        }
        
        var_0_1DF = and:int(var_0_1DF:int, ldc:int(980318127))
        goto(Label_0290)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(512)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(2100195252))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(256)), ldc:int(0))) {
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(-476074168))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_17C = newarray:byte[](byte.class, expr_91:int)
                var_5_17D = expr_91:int
                
                loop {
                    var_0_1DF = and:int(var_0_1DF:int, ldc:int(-1539710114))
                    var_5_17D = add:int(var_5_17D:int, ldc:int(-1))
                    storeelement:byte(var_3_17C:byte[], var_5_17D:int, add:int(shl:int(loadelement:byte(stack_18D_0:byte[], var_5_17D:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_17D:int, and:int(ldc:int(481), ldc:int(16397)))), ldc:int(4)), and:int(ldc:int(2383), ldc:int(8223)))))
                    
                    if (cmpne:boolean(var_5_17D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_137_0 = stack_18D_0 = stack_1F1_0 = var_3_17C:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1DF:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1DF = and:int(var_0_1DF:int, ldc:int(938390886))
                goto(Label_0112)
            }
            
            var_0_1DF = and:int(var_0_1DF:int, ldc:int(142262219))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_11A = expr_B5:int
                var_3_11F = newarray:byte[](byte.class, expr_B5:int)
                var_5_120 = expr_B5:int
                goto(Label_0468)
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0150)
        }
        
        if (cmpeq:boolean(and:int(var_0_1DF:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_10D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30200), ldc:int(-30199)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4129), ldc:int(26635)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(-28344), ldc:int(11956)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(18979), ldc:int(-18980)), and:int(ldc:int(111), ldc:int(10292))))
            putstatic:String[](\u5140\u4ab3\u183a\ud523\u071d\u983f::\u16f6\u3e75\uf9c5\u960f\u7ce1\u7873, expr_EC:String[])
            putstatic:Logger(\u5140\u4ab3\u183a\ud523\u071d\u983f::\u9a18\ud51e\u6ec6\u3d4b\u6ec6\uae87, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6d99\u7043\u93a2\u416d\u9af2\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AE : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_6B9 : int
        
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
        var_3_6AE = and:int(ldc:int(-1366234654), ldc:int(-288140614))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u4ab3\u183a\ud523\u071d\u983f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1342877918))
            var_5_7D = and:int(ldc:int(-23612), ldc:int(19507))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2876), ldc:int(-2877)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_6AE:int, ldc:int(-403868359))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, xor:int(ldc:int(516), ldc:int(517)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(6660), ldc:int(6661)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_6AE = and:int(var_3_D6:int, ldc:int(-270373575))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1033), ldc:int(8641)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(874429764))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-166194674))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1039177221))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1950206303))
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-687215342))
                        goto(Label_0606)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1607956539))
                    }
                    else {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-151159749))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0606)
                            }
                            
                            goto(Label_0875)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(479775735))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1698722187))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-249782215))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-416391361))
                        goto(Label_0875)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1318571720))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(470576130))
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-156022607))
                        var_11_E7 = and:int(ldc:int(-21414), ldc:int(21409))
                        goto(Label_1577)
                    }
                    
                    Label_0606:
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(280492865))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1107135703))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1004516035))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1981962483))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0875)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-35077508))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1535437427))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1344810524))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0875)
                        }
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-827661954))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1580412658))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-711028127))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1394528284))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1209045906))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0875:
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(411095561))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-574050684))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1231017751))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1306611575))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(1033098784))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(1709418091))
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1232667078))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = xor:int(ldc:int(1536), ldc:int(1537))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1017:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1036153765))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1073161197))
                            goto(Label_0875)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-40157915))
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-153202760))
                        var_11_E7 = and:int(ldc:int(15377), ldc:int(-31766))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1154667962))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(243253192))
                            goto(Label_1017)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-616342366))
                            goto(Label_0875)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(1881358995))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(2044299141))
                            goto(Label_0606)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(2079317720))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-427462227))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1445)
                            }
                        }
                    }
                    
                    Label_1304:
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1187574925))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-134290698))
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1017)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(741600111))
                            goto(Label_0875)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0606)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(183358710))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AE = and:int(var_3_6AE:int, ldc:int(1358696520))
                            loopcontinue()
                        }
                        
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-151530514))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1577)
                    }
                    
                    Label_1445:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(90323587))
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1952046372))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-234609930))
                        goto(Label_0606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-153437960))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AE = and:int(var_3_6AE:int, ldc:int(-4365975))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1577:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B9 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1588:
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-492970829))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1899021024))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(207217953))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(1909664079))
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0606)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AE = and:int(var_3_6AE:int, ldc:int(-427101205))
                        var_17_6B9 = add:int(var_16_115:int, and:int(ldc:int(16921), ldc:int(1025)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AE = and:int(var_3_6AE:int, ldc:int(1565519836))
                }
                
                var_3_6AE = and:int(var_3_6AE:int, ldc:int(-1477191874))
                
                if (cmple:boolean(var_5_7D = var_17_6B9:int, sub:int(var_6_84:int, and:int(ldc:int(3), ldc:int(19605))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6AE:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6AE = and:int(var_3_6AE:int, ldc:int(-967737959))
            goto(Label_0106)
        }
    }
}
