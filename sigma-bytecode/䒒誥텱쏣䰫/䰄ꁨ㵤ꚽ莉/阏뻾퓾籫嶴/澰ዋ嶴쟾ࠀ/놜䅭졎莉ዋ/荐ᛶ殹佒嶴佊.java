public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a {
    public void \u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.List<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p1, java.util.List<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p2, java.util.List<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p3) {
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
            invokespecial:Object(Object::<init>, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u62da\ud4fe\u16f6\u4492\uc29a\ud36e, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\ub102\u8350\u156b\uc238\u8d98\u4975, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a, p1:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
            putfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u93a2\u4ab3\ub19c\uf94d\u183a\u6d69, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a, p2:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
            putfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u647c\u647c\ucb79\ub171\u8bb0\u760c, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a, p3:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u64f2\u5245\u6d99\u16f6\uc31c\ub8be$4(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.List lambda$\u760c\uc246\u8258\u40a9\ud217\ud7e8$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a p0) {
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
            return:List(getfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u647c\u647c\ucb79\ub171\u8bb0\u760c, p0:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u34df\u6b5f\u88c5\u93a2\u516c\u8df4$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a p0) {
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
            return:List(getfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u93a2\u4ab3\ub19c\uf94d\u183a\u6d69, p0:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\ubefe\u965f\u3504\u4d85\u8413\u494c$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a p0) {
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
            return:List(getfield:List<\u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\ub102\u8350\u156b\uc238\u8d98\u4975, p0:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u6fb0\ua562\uc910\u8413\u3bd6\u3bd6$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a::\u62da\ud4fe\u16f6\u4492\uc29a\ud36e, p0:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \uceb8\uc229\u62da\u3e2a\u965f\u8709(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1160489129), ldc:int(-1075451297))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u16f6\u6bb9\u4f52\u5db4\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1135859507))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-180099745))
            var_5_85 = and:int(ldc:int(-27617), ldc:int(27616))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4048), ldc:int(-4053)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_67B:int, ldc:int(-1754702465))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, and:int(ldc:int(16401), ldc:int(4167)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, xor:int(ldc:int(8704), ldc:int(8705)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DE:int, ldc:int(-145500033))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1041), ldc:int(4741)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1824367410))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-267541074))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(584200269))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-597630721))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0578)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2067205650))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-601742870))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(252723652))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(938951015))
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-584736768))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1126899369))
                            var_11_EF = and:int(ldc:int(-8942), ldc:int(8941))
                            goto(Label_1528)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0578:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-474367826))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1637500663))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(81922539))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-984785433))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-32395111))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-8699297))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1745934427))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1146255974))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-357426997))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1766035060))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-133179891))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-220662537))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1806942377))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1618485506))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1551121568))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1232016155))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(869808299))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(641635364))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-755600001))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = xor:int(ldc:int(25152), ldc:int(25153))
                                goto(Label_1153)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-302863427))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1840551052))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-725851209))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(131735315))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2063679632))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-213322121))
                        var_11_EF = and:int(ldc:int(-262), ldc:int(261))
                    }
                    
                    Label_1153:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(966736138))
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2064173068))
                            goto(Label_0846)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1512420845))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1614819957))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-111647529))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1277:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1153)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(272707389))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1671237350))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1203133873))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-129144481))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1528)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1401:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1912464780))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1439522784))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-150825445))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-27731457))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1528:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1539:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-632053774))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-440221058))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(792691188))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1437232092))
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1935472869))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-699013545))
                        var_17_686 = add:int(var_16_11D:int, and:int(ldc:int(1537), ldc:int(16459)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-111257737))
                
                if (cmple:boolean(var_5_85 = var_17_686:int, sub:int(var_6_8C:int, and:int(ldc:int(4113), ldc:int(17549))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1243894870))
            goto(Label_0106)
        }
    }
}
