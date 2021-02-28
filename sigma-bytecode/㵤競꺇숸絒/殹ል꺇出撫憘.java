public class \u3d64\u7af6\uae87\uc238\u7d52.\u6bb9\u120d\uae87\u51fa\u64ab\u6198 {
    public void \u6bb9\u120d\uae87\u51fa\u64ab\u6198(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 \ufe34\u0c95\u67d0\uc31c\u6bb9\u3d64(\u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p0) {
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
            return:\ub83f\uc9f6\u47c2\u67d0\u7ce1(initobject:\u494c\u51b2\u516c\u3bc9\u0a06[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u494c\u51b2\u516c\u3bc9\u0a06::<init>))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u72f1\u6b0d\u527a\u69d9\ub32d\u183a() {
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
            return:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokevirtual:\u6435\u5d20\u071d\u5fe1\ubded\ud171<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::\u0800\ufcaf\ucfaf\ub1b9\u8709\u446c, getstatic:\u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u516c\u6d99\u8709\u6c52\uc3e3\u9af2), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\uceb8\u4179\u88c5\u6ec6\ufe34\u5db4)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uf995\ub32d\u8aa5\u6bb9\u72f1\u1833(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(264), ldc:int(265)))
        }
        
        goto(Label_0006)
    }
    
    public int \u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3) {
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
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokestatic:int(\ub113\u983f\u7e3f\ud36e\uc7fe::\u965f\ub1b9\u5bc4\u0b8e\ucef1\ub19c, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), and:int(ldc:int(19754), ldc:int(-19755)), ldc:int(15)))
        }
        
        goto(Label_0006)
    }
    
    public int \ua3b4\u494c\u62da\u647c\ub1b9\ud51e(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3) {
        var_5_61 : int
        stack_8F_0 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(-2109206511), ldc:int(1935275735))
            
            if (cmpne:boolean(p3:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-262515279))
                stack_8F_0 = and:int(ldc:int(3264), ldc:int(-3265))
            }
            else {
                stack_8F_0 = invokevirtual:int(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u385b\u946b\u61a4\u6ec6\ud7e8\u7e3f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u760c\u4975\u4179\uc246\u8640\u64f2)
            }
            
            return:int(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u59ec\u8413\u97e6\uc229\u3776.\uc229\u8413\ufcaf\u99f7\u494c lambda$\uc87f\ubff1\u5d20\u3c25\uae5d\u1833$0() {
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
            return:\uc229\u8413\ufcaf\u99f7\u494c(getstatic:\uc229\u8413\ufcaf\u99f7\u494c<\u494c\u51b2\u516c\u3bc9\u0a06>(\uc229\u8413\ufcaf\u99f7\u494c::\u5f50\ub18d\u3c25\u9255\ua068\ua6bd))
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
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(-1134206730), ldc:int(-1731367193))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6bb9\u120d\uae87\u51fa\u64ab\u6198[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(993525199))
            var_5_7D = and:int(ldc:int(7456), ldc:int(-7457))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10884), ldc:int(-27269)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63F:int, ldc:int(2042583022))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(2641), ldc:int(12551)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1824), ldc:int(1825)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_D2:int, ldc:int(1604283982))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21547), ldc:int(2389)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-863792692))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(535286166))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(955073230))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1938449135))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1350371743))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2046860691))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1785510175))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1014493894))
                            var_11_E3 = and:int(ldc:int(29125), ldc:int(-29670))
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(140151610))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-721672272))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(935627108))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-12972939))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-492752786))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-791969292))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1145227934))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2119554247))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1665029357))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(94701831))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(360325304))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-351571290))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(153730419))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1535353389))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1732715292))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-373300067))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1017472087))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1366071162))
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1500602988))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1778009363))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1656917393))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(1037), ldc:int(1036))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-310438337))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1473723782))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1158332496))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(802630600))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(2036771163))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-364574581))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1668007025))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1535991647))
                        var_11_E3 = and:int(ldc:int(19090), ldc:int(-19091))
                    }
                    
                    Label_1090:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1397053008))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-965761817))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-484160282))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-106987937))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1197:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-640500817))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(235079739))
                            goto(Label_1090)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-849122586))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-675203437))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1140360601))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1326:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1197)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1246381904))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1715960964))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-990351443))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(677117544))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-269074019))
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(-613951545))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1465:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1476:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(591800240))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-522623034))
                        goto(Label_1197)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1576298101))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1582436358))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1295804857))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(506953591))
                        var_17_64A = add:int(var_16_111:int, and:int(ldc:int(385), ldc:int(16411)))
                        looporswitchbreak()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(1767771058))
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(2130559694))
                
                if (cmple:boolean(var_5_7D = var_17_64A:int, sub:int(var_6_84:int, and:int(ldc:int(2193), ldc:int(8235))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(512)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(-2056502132))
            goto(Label_0106)
        }
    }
}
