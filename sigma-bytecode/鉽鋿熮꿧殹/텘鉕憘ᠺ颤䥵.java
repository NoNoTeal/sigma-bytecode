public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ud158\u9255\u6198\u183a\u98a4\u4975 {
    public void \ud158\u9255\u6198\u183a\u98a4\u4975(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, float p1) {
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
            invokespecial:\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad(\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad::<init>, this:\ud158\u9255\u6198\u183a\u98a4\u4975)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud158\u9255\u6198\u183a\u98a4\u4975::\uc84e\u93a2\u4d85\ufcaf\u4d85\u8350, this:\ud158\u9255\u6198\u183a\u98a4\u4975, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:float(\ud158\u9255\u6198\u183a\u98a4\u4975::\u12b2\u3bd6\ud7e8\u6d99\u99f7\u76bc, this:\ud158\u9255\u6198\u183a\u98a4\u4975, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u7043\u446c\u0a06\u6bb9\u759a(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, java.util.Random p1) {
        var_3_5F : int
        stack_9A_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(1556079940), ldc:int(2037883656))
            
            if (logicaland:boolean(cmpeq:boolean(p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud158\u9255\u6198\u183a\u98a4\u4975::\uc84e\u93a2\u4d85\ufcaf\u4d85\u8350, this:\ud158\u9255\u6198\u183a\u98a4\u4975)), cmplt:boolean(invokevirtual:float(Random::nextFloat, p1:Random), getfield:float(\ud158\u9255\u6198\u183a\u98a4\u4975::\u12b2\u3bd6\ud7e8\u6d99\u99f7\u76bc, this:\ud158\u9255\u6198\u183a\u98a4\u4975)))) {
                stack_9A_0 = xor:int(ldc:int(-24556), ldc:int(-24555))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-554621458))
                stack_9A_0 = and:int(ldc:int(12592), ldc:int(-14641))
            }
            
            return:boolean(stack_9A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<?> \u51b2\u5654\u67e9\u960f\u8389\ud171() {
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
            return:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<?>(getstatic:\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6<\ud158\u9255\u6198\u183a\u98a4\u4975>(\u92ff\u4bc8\u64ab\ua562\u92ff\u16f6::\u64ab\u6d99\uc229\ucb79\u51fa\u600f))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u156b\u6cfe\u8413\uc229\u6fb0\u385b$2(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Float lambda$\u99f7\ucfaf\u760c\u0b8e\u12cb\u416d$1(\u927d\u92ff\u71ae\uafe7\u6bb9.\ud158\u9255\u6198\u183a\u98a4\u4975 p0) {
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
            return:Float(invokestatic:Float(Float::valueOf, getfield:float(\ud158\u9255\u6198\u183a\u98a4\u4975::\u12b2\u3bd6\ud7e8\u6d99\u99f7\u76bc, p0:\ud158\u9255\u6198\u183a\u98a4\u4975)))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u4f52\u7043\ud36e\u4cd9\uc7fe\u4ab3$0(\u927d\u92ff\u71ae\uafe7\u6bb9.\ud158\u9255\u6198\u183a\u98a4\u4975 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud158\u9255\u6198\u183a\u98a4\u4975::\uc84e\u93a2\u4d85\ufcaf\u4d85\u8350, p0:\ud158\u9255\u6198\u183a\u98a4\u4975))
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
    
    public void \u960f\u8709\u3bd6\u64ab\uceb8\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(682490078), ldc:int(868038875))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\u9255\u6198\u183a\u98a4\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(647362809))
            var_5_7D = and:int(ldc:int(29986), ldc:int(-32547))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21856), ldc:int(20819)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_672:int, ldc:int(-1115095335))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, and:int(ldc:int(14337), ldc:int(9)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(20552), ldc:int(20553)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D6:int, ldc:int(-1461847376))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4295), ldc:int(16409)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1469020539))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(49772548))
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1962558413))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1413988676))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(469857685))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(54691120))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(78398808))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-149323006))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1958063450))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1054424249))
                        var_11_E7 = and:int(ldc:int(-811), ldc:int(810))
                        goto(Label_1546)
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1849305311))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(425052733))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1873955318))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(655924874))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-84502492))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-422363659))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1463493853))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-151428469))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1149493593))
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1908063927))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0817:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(301649106))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2060586543))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1593980990))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1411810370))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(16393), ldc:int(7683))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0931:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1623620770))
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(922777704))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1229049125))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1262336884))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-447075731))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1412261043))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1376208387))
                        var_11_E7 = and:int(ldc:int(4465), ldc:int(-6140))
                    }
                    
                    Label_1108:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1564316375))
                        goto(Label_1402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1409462277))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(891174011))
                            goto(Label_0931)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-108531934))
                            goto(Label_0817)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(796216262))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1300249568))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1052490164))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1402)
                            }
                        }
                    }
                    
                    Label_1248:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(253256257))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2073691048))
                            goto(Label_1108)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1188930121))
                            goto(Label_0931)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-20730786))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1418724430))
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-622645658))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-101238113))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1546)
                    }
                    
                    Label_1402:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1777937170))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-922419301))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(95443654))
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1088306849))
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-843508710))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1232930564))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1546:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1557:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(623098553))
                        goto(Label_1402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1248)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0931)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(48423589))
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2128313746))
                        var_17_67D = add:int(var_16_115:int, and:int(ldc:int(1091), ldc:int(4665)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1845198327))
                
                if (cmple:boolean(var_5_7D = var_17_67D:int, sub:int(var_6_84:int, xor:int(ldc:int(4146), ldc:int(4147))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1511798889))
            goto(Label_0106)
        }
    }
}
