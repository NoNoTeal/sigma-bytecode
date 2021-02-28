public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u5fe1\uceb8\u4ab3\u6c56\u64f2 {
    public static com.mojang.datafixers.Products$P3<com.mojang.serialization.codecs.RecordCodecBuilder$Mu<P>, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, java.lang.Integer> \u6d69\u6bb9\uc3e3\u8413\u64ab\uc29a(com.mojang.serialization.codecs.RecordCodecBuilder$Instance<P> p0) {
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
    
    public void \u5fe1\uceb8\u4ab3\u6c56\u64f2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p1, int p2) {
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
            invokespecial:\u4179\u4daf\u3d64\u56bd\u4975(\u4179\u4daf\u3d64\u56bd\u4975::<init>, this:\u5fe1\uceb8\u4ab3\u6c56\u64f2, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, p1:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            putfield:int(\u5fe1\uceb8\u4ab3\u6c56\u64f2::\u4179\uae87\u88c5\u7006\u3d64\u64ab, this:\u5fe1\uceb8\u4ab3\u6c56\u64f2, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ubefe\uc3e3\ua61f\u3bc9\ubded<?> \u7af6\u71f1\ucfaf\u8bb0\uc87f\u59ec() {
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
            return:\ubefe\uc3e3\ua61f\u3bc9\ubded<?>(getstatic:\ubefe\uc3e3\ua61f\u3bc9\ubded<\u5fe1\uceb8\u4ab3\u6c56\u64f2>(\ubefe\uc3e3\ua61f\u3bc9\ubded::\u4c04\u836c\u8389\u59ec\u3d4b\u8cae))
        }
        
        goto(Label_0006)
    }
    
    public void \u8d90\u5bc4\uafe7\u3a62\u99f7\uf995(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2, int p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u516c\u5fe1\u8c8a\u9255\ubb2b p4, int p5, int p6, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p7, int p8, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p9) {
        var_11_61 : int
        var_13_65 : int
        
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
            var_11_61 = and:int(ldc:int(-1882941270), ldc:int(-817111493))
            var_13_65 = p8:int
            
            loop {
                var_11_61 = and:int(var_11_61:int, ldc:int(1601486378))
                
                if (cmplt:boolean(var_13_65:int, sub:int(p8:int, p5:int))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u4179\u4daf\u3d64\u56bd\u4975::\ucfaf\ud7e8\u5140\ub8be\u6198\uc910, this:\u5fe1\uceb8\u4ab3\u6c56\u64f2[expected:\u4179\u4daf\u3d64\u56bd\u4975], p0:\ucef1\u6d69\u946b\u97e6\u6b5f, p1:Random, p2:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u516c\u5fe1\u8c8a\u9255\ubb2b::\u5140\u8350\u4975\u8d98\u1833\u97e6, p4:\u516c\u5fe1\u8c8a\u9255\ubb2b), invokestatic:int(Math::max, sub:int(sub:int(add:int(p6:int, invokevirtual:int(\u516c\u5fe1\u8c8a\u9255\ubb2b::\u8cae\u3776\u3711\u836c\u0b8e\ucb79, p4:\u516c\u5fe1\u8c8a\u9255\ubb2b)), and:int(ldc:int(5085), ldc:int(24579))), div:int(var_13_65:int, and:int(ldc:int(1571), ldc:int(4098)))), and:int(ldc:int(23574), ldc:int(-23575))), p7:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, var_13_65:int, invokevirtual:boolean(\u516c\u5fe1\u8c8a\u9255\ubb2b::\u8bb0\ubf56\ubded\ubded\u8c8a\u527a, p4:\u516c\u5fe1\u8c8a\u9255\ubb2b), p9:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                inc:int(var_13_65, ldc:int(-1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u5db4\u9937\u97e6\ucb79\u8308\u64ab(java.util.Random p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p2) {
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
            return:int(getfield:int(\u5fe1\uceb8\u4ab3\u6c56\u64f2::\u4179\uae87\u88c5\u7006\u3d64\u64ab, this:\u5fe1\uceb8\u4ab3\u6c56\u64f2))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u93a2\u965f\u6cfe\u59ec\u98a4\u718f(java.util.Random p0, int p1, int p2, int p3, int p4, boolean p5) {
        stack_C1_0 : int [generated]
        
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
            
            if (cmpeq:boolean(p1:int, p4:int)) {
                if (cmpeq:boolean(p3:int, p4:int)) {
                    if (logicalor:boolean(cmpeq:boolean(invokevirtual:int(Random::nextInt, p0:Random, and:int(ldc:int(16774), ldc:int(6226))), ldc:int(0)), cmpeq:boolean(p2:int, ldc:int(0)))) {
                        stack_C1_0 = xor:int[expected:boolean](ldc:int(-32701), ldc:int(-32702))
                        return:boolean(stack_C1_0:boolean)
                    }
                }
            }
            
            stack_C1_0 = and:int[expected:boolean](ldc:int(4660), ldc:int(-4661))
            return:boolean(stack_C1_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u4e72\u5245\u67d0\u51fa\u88c5\ubff1$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u5fe1\uceb8\u4ab3\u6c56\u64f2 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u5fe1\uceb8\u4ab3\u6c56\u64f2::\u4179\uae87\u88c5\u7006\u3d64\u64ab, p0:\u5fe1\uceb8\u4ab3\u6c56\u64f2)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\ub171\u12cb\u7e3f\ubefe\u965f\u52d3$0(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
            return:App(invokevirtual:App(Products$P3::apply, invokestatic:Products$P3(\u5fe1\uceb8\u4ab3\u6c56\u64f2::\u6d69\u6bb9\uc3e3\u8413\u64ab\uc29a, p0:RecordCodecBuilder$Instance), p0:RecordCodecBuilder$Instance[expected:Applicative], invokedynamic:Function3(apply:()Lcom/mojang/datafixers/util/Function3;)))
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
    
    public void \ua6bd\u4daf\ub19c\u8df4\u76bc\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(-634754448), ldc:int(2098884601))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5fe1\uceb8\u4ab3\u6c56\u64f2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-540062989))
            var_5_81 = and:int(ldc:int(4318), ldc:int(-21728))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11860), ldc:int(11283)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_692:int, ldc:int(1581506162))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(1026), ldc:int(1027)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(66), ldc:int(67)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_DA:int, ldc:int(2057296883))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(20520), ldc:int(20521)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1768168597))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-172009926))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1185847161))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1850072760))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1901028939))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1081159908))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1660205311))
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(721419797))
                    }
                    else {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1556762485))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0446:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1464495864))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(923038581))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1300850188))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(2134002551))
                            var_11_EB = and:int(ldc:int(-3040), ldc:int(2071))
                            goto(Label_1564)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0602:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1058920176))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-772475553))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1445688837))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-626566274))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(437133180))
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(231289291))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-442261455))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(65552556))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(1494740604))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2103108234))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-674568280))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(50157233))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-239209936))
                            goto(Label_0446)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(2028464889))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(10768), ldc:int(10769))
                                goto(Label_1122)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1215941498))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-789929616))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1988113452))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-237836461))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(2129357558))
                        var_11_EB = and:int(ldc:int(-2482), ldc:int(2481))
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-51550087))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1447419203))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-884070774))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(994835014))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(983120385))
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(699765895))
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1065955460))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-665945484))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1420)
                            }
                        }
                    }
                    
                    Label_1269:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1904056101))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(16)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2138765890))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(994317194))
                            goto(Label_1122)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(381518760))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-2044607688))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0446)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(191169841))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-4764803))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1564)
                    }
                    
                    Label_1420:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(383858285))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(621710332))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1706479514))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(141215730))
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0446)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1437732113))
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(-133498117))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-779130173))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1292347627))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1289391703))
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1510741979))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0446)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-556040582))
                        var_17_69D = add:int(var_16_119:int, and:int(ldc:int(9555), ldc:int(2049)))
                        looporswitchbreak()
                    }
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(2051231474))
                
                if (cmple:boolean(var_5_81 = var_17_69D:int, sub:int(var_6_88:int, xor:int(ldc:int(16896), ldc:int(16897))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-1484052144))
            goto(Label_0108)
        }
    }
}
