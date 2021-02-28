public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u98a4\u8d98\u3c25\u446c\u12b2\u93a2 {
    private static com.mojang.serialization.DataResult<T> \ud523\ucb79\u8640\uceb8\u7ce1\u8cae(com.mojang.datafixers.util.Either<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34> p0, com.mojang.serialization.DynamicOps<T> p1, T p2) {
        var_3_5F : int
        var_5_64 : Optional
        stack_9C_0 : DataResult [generated]
        
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
            var_3_5F = and:int(ldc:int(-138511342), ldc:int(-537985693))
            var_5_64 = invokevirtual:Optional(Either::left, p0:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>)
            
            if (invokevirtual:boolean(Optional::isPresent, var_5_64:Optional)) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-138510509))
                stack_9C_0 = invokeinterface:DataResult(Codec::encode, getstatic:Codec<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::\uafe7\u527a\u6d69\u4e72\u5db4\ub70c), invokevirtual:Object(Optional<Object>::get, var_5_64:Optional<Object>), p1:DynamicOps<T>, p2:T[expected:Object])
            }
            else {
                stack_9C_0 = invokestatic:DataResult(DataResult::error, loadelement:String(getstatic:String[](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\uafe7\u98a4\u67e9\u4f4a\u7c6b\u6b5f), and:int(ldc:int(12736), ldc:int(-12737))))
            }
            
            return:DataResult<T>(stack_9C_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.codecs.RecordCodecBuilder<E, java.util.function.Supplier<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>> \u5d20\u61a4\u760c\uc2e8\ub102\u1187() {
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
    
    public static com.mojang.serialization.codecs.RecordCodecBuilder<E, com.mojang.datafixers.util.Either<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34>> \u5245\u4c2b\ub18d\u7bad\u9937\u4cd9() {
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
    
    public void \u98a4\u8d98\u3c25\u446c\u12b2\u93a2(com.mojang.datafixers.util.Either<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34> p0, java.util.function.Supplier<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u8aa5\uc229\u873d\u88c5\u97e6\u3e75> p1, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u6435\u7006\uc3e3\u4c04\u7873\u64ab p2) {
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
            invokespecial:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3(\u624e\u6b5f\u3bd6\u9255\u183a\u52d3::<init>, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p2:\u6435\u7006\uc3e3\u4c04\u7873\u64ab)
            putfield:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u7af6\u7330\uc7fe\uc229\u6b0d\uae5d, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>)
            putfield:Supplier<\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u3a62\u97e6\u12b2\u392e\ub19c\ub7dc, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p1:Supplier<\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u98a4\u8d98\u3c25\u446c\u12b2\u93a2(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34 p0) {
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
    
    private \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34 \u5db4\u5140\u64f2\u9033\u836c\u93a2(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0) {
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
            return:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(checkcast:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u40a9\u8753\u9937\u4daf\uc2bd\ufe34.class, invokevirtual:Object[expected:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34](Either::map, getfield:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u7af6\u7330\uc7fe\uc229\u6b0d\uae5d, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2), invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>(apply:(L\u8cae\u8bb0\ucef1\u8c8a\u3a62/\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1;)Ljava/util/function/Function;, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1), invokestatic:Function<Object, Object>(Function<Object, Object>::identity))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u36d3\u9033\u6b0d\u983f\u8d90.\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae> \ud51e\ub83f\ub113\u4daf\u7c6b\u760c(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, boolean p3) {
        var_5_9F : int
        var_8_80 : List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>
        var_9_85 : ArrayList
        var_10_8E : Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>
        var_11_D8 : \u6d99\ua61f\ua3b4\u51fa\u0800\u8cae
        
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
            var_5_9F = and:int(ldc:int(-1000479460), ldc:int(-973352004))
            var_8_80 = invokevirtual:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\ubcb0\ub8be\u67e9\u839e\u446c\ud51e, invokespecial:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5db4\u5140\u64f2\u9033\u836c\u93a2, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u8709\u494c\u4e72\u3d64\ubefe\u624e, initobject:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::<init>), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u59ec\u6cfe\ubded\uc3e3\u0a06\uc9f6), p3:boolean)
            var_9_85 = invokestatic:ArrayList(Lists::newArrayList)
            var_10_8E = invokeinterface:Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>::iterator, var_8_80:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>)
            
            loop {
                if (cmpne:boolean(and:int(var_5_9F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_5_9F = and:int(var_5_9F:int, ldc:int(-436347969))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_10_8E:Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>)) {
                        var_11_D8 = checkcast:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae(\u36d3\u9033\u6b0d\u983f\u8d90.\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae.class, invokeinterface:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae(Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>::next, var_10_8E:Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>))
                        
                        if (cmpne:boolean(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae::\u8d90\uf94d\u8640\u7ce1\ud7e8\u1187, var_11_D8:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                            if (cmpeq:boolean(invokestatic:\u36d3\u9255\u7873\u8350\uc3e3\u56bd(\u36d3\u9255\u7873\u8350\uc3e3\u56bd::valueOf, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae::\u8d90\uf94d\u8640\u7ce1\ud7e8\u1187, var_11_D8:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae), loadelement:String(getstatic:String[](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\uafe7\u98a4\u67e9\u4f4a\u7c6b\u6b5f), xor:int(ldc:int(4864), ldc:int(4867))))), getstatic:\u36d3\u9255\u7873\u8350\uc3e3\u56bd(\u36d3\u9255\u7873\u8350\uc3e3\u56bd::\u3dd3\u6d99\u5bc4\ud523\u8413\u92ff))) {
                                invokeinterface:boolean(List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>::add, var_9_85:ArrayList<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>[expected:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>], var_11_D8:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae)
                            }
                        }
                        
                        var_5_9F = and:int(var_5_9F:int, ldc:int(-52953219))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_5_9F:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_9F = and:int(var_5_9F:int, ldc:int(859085212))
            }
            
            return:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(var_9_85:ArrayList<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u36d3\u9033\u6b0d\u983f\u8d90.\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae> \u76bc\u946b\u416d\u760c\ubcb0\u5bc4(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2, java.util.Random p3) {
        var_8_87 : List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>
        
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
            var_8_87 = invokevirtual:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\ubcb0\ub8be\u67e9\u839e\u446c\ud51e, invokespecial:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5db4\u5140\u64f2\u9033\u836c\u93a2, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u8709\u494c\u4e72\u3d64\ubefe\u624e, initobject:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::<init>), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u4d85\uc3e3\ubded\u7043\u3bc9\u62da), and:int[expected:boolean](ldc:int(321), ldc:int(18449)))
            invokestatic:void(Collections::shuffle, var_8_87:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>, p3:Random)
            return:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(var_8_87:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>)
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 \u0800\uf995\u836c\u99f7\u12b2\u5fe1(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p2) {
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
            return:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(invokevirtual:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u9937\uc4d2\u927d\u446c\u759a\u74b1, invokespecial:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5db4\u5140\u64f2\u9033\u836c\u93a2, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1), invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u8709\u494c\u4e72\u3d64\ubefe\u624e, initobject:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::<init>), p2:\u7049\u52d3\u8640\u5654\u1833\ub18d), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5140\ud36e\u8640\u516c\u4179\ucef1(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p3, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p6, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p7, java.util.Random p8, boolean p9) {
        var_13_6A : \u40a9\u8753\u9937\u4daf\uc2bd\ufe34
        var_14_76 : \u51fa\u3e2a\u760c\u9937\u12b2\u0a06
        var_15_B2 : Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>
        
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
        var_13_6A = invokespecial:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5db4\u5140\u64f2\u9033\u836c\u93a2, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1)
        var_14_76 = invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\ud7e8\u12cb\ub8be\u4cd9\uf94d\u8753, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p6:\u7049\u52d3\u8640\u5654\u1833\ub18d, p7:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, p9:boolean)
        
        if (invokevirtual:boolean(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\u839e\u8258\u836c\u760c\uc7fe\u36d3, var_13_6A:\u40a9\u8753\u9937\u4daf\uc2bd\ufe34, p1:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_14_76:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, p8:Random, ldc:int(18))) {
            var_15_B2 = invokeinterface:Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>::iterator, invokestatic:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(\u40a9\u8753\u9937\u4daf\uc2bd\ufe34::\ubff1\u965f\u7043\u4f4a\u6c52\uf995, p1:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_14_76:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, invokevirtual:List<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\ud51e\ub83f\ub113\u4daf\u7c6b\u760c, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2, p0:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1, p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p6:\u7049\u52d3\u8640\u5654\u1833\ub18d, and:int[expected:boolean](ldc:int(-29822), ldc:int(29793)))))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_15_B2:Iterator)) {
                invokevirtual:void(\u624e\u6b5f\u3bd6\u9255\u183a\u52d3::\u3d64\ubefe\u9033\u527a\u3c25\u760c, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2[expected:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3], p1:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], checkcast:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae(\u36d3\u9033\u6b0d\u983f\u8d90.\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae.class, invokeinterface:\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae(Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>::next, var_15_B2:Iterator<\u6d99\ua61f\ua3b4\u51fa\u0800\u8cae>)), p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p6:\u7049\u52d3\u8640\u5654\u1833\ub18d, p8:Random, p7:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(16906), ldc:int(16907)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-8650), ldc:int(8649)))
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u51fa\u3e2a\u760c\u9937\u12b2\u0a06 \ud7e8\u12cb\ub8be\u4cd9\uf94d\u8753(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p1, boolean p2) {
        var_6_6C : \u51fa\u3e2a\u760c\u9937\u12b2\u0a06
        
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
            var_6_6C = initobject:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::<init>)
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\uc2e8\u3bd6\uf94d\uc31c\u7873\u34df, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u8709\u494c\u4e72\u3d64\ubefe\u624e, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, p0:\u7049\u52d3\u8640\u5654\u1833\ub18d)
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u9a18\u4c04\u8389\u62da\u88c5\u156b, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, xor:int[expected:boolean](ldc:int(20497), ldc:int(20496)))
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u4492\u3504\ub1b9\u8413\u8389\u56bd, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, and:int[expected:boolean](ldc:int(2848), ldc:int(-2849)))
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u4f4a\u72f1\uc238\ubcb0\ubded\u8d90, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, getstatic:\uff55\u516c\u9033\ubcb0\ucef1\u9937[expected:\u0c95\u99f7\u516c\u5245\ucef1\u3504](\uff55\u516c\u9033\ubcb0\ucef1\u9937::\u836c\u4179\u52d3\ubb2b\ud523\u7c6b))
            invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u5fe1\u965f\u6cfe\uc3e3\u0800\u52d3, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, xor:int[expected:boolean](ldc:int(354), ldc:int(355)))
            
            if (logicalnot:boolean(p2:boolean)) {
                invokevirtual:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(\u51fa\u3e2a\u760c\u9937\u12b2\u0a06::\u4f4a\u72f1\uc238\ubcb0\ubded\u8d90, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06, getstatic:\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b[expected:\u0c95\u99f7\u516c\u5245\ucef1\u3504](\ub102\u6cfe\uc3e3\u718f\ubf56\u3d4b::\u9033\uc9f6\ud51e\ub1b9\u416d\u40a9))
            }
            
            invokeinterface:void(Iterable<Object>::forEach, invokevirtual:List<\u0c95\u99f7\u516c\u5245\ucef1\u3504>[expected:Iterable<Object>](\u8aa5\uc229\u873d\u88c5\u97e6\u3e75::\uc238\u927d\u5f50\u5bc4\ucef1\u647c, checkcast:\u8aa5\uc229\u873d\u88c5\u97e6\u3e75(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u8aa5\uc229\u873d\u88c5\u97e6\u3e75.class, invokeinterface:\u8aa5\uc229\u873d\u88c5\u97e6\u3e75(Supplier<\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>::get, getfield:Supplier<\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u3a62\u97e6\u12b2\u392e\ub19c\ub7dc, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2)))), invokedynamic:Consumer<\u0c95\u99f7\u516c\u5245\ucef1\u3504>(accept:(L\u5d20\u97b7\u8753\u873d\u16f6/\u51fa\u3e2a\u760c\u9937\u12b2\u0a06;)Ljava/util/function/Consumer;, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06))
            invokevirtual:void(ImmutableList::forEach, invokevirtual:ImmutableList<\u0c95\u99f7\u516c\u5245\ucef1\u3504>(\u6435\u7006\uc3e3\u4c04\u7873\u64ab::\u1187\ub7dc\u7006\u92ee\u3e75\u8413, invokevirtual:\u6435\u7006\uc3e3\u4c04\u7873\u64ab(\u624e\u6b5f\u3bd6\u9255\u183a\u52d3::\u446c\u3bd6\u6c52\u3711\u6c56\u4c04, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2[expected:\u624e\u6b5f\u3bd6\u9255\u183a\u52d3])), invokedynamic:Consumer<\u0c95\u99f7\u516c\u5245\ucef1\u3504>(accept:(L\u5d20\u97b7\u8753\u873d\u16f6/\u51fa\u3e2a\u760c\u9937\u12b2\u0a06;)Ljava/util/function/Consumer;, var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06))
            return:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06(var_6_6C:\u51fa\u3e2a\u760c\u9937\u12b2\u0a06)
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<?> \u67d0\u516c\uc2e8\u6fb0\u8350\uc3e3() {
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
            return:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<?>(getstatic:\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab<\u98a4\u8d98\u3c25\u446c\u12b2\u93a2>(\u8350\u6fb0\u0b8e\ua068\u3dd3\ub6ab::\u67e9\u40a9\ud12e\u446c\u93a2\u9a18))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\uafe7\u98a4\u67e9\u4f4a\u7c6b\u6b5f), xor:int(ldc:int(-32236), ldc:int(-32240)))), getfield:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>[expected:Object](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u7af6\u7330\uc7fe\uc229\u6b0d\uae5d, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2)), loadelement:String(getstatic:String[](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\uafe7\u98a4\u67e9\u4f4a\u7c6b\u6b5f), and:int(ldc:int(12805), ldc:int(2053))))))
        }
        
        goto(Label_0006)
    }
    
    private static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u8aa5\uc229\u873d\u88c5\u97e6\u3e75 lambda$\u0800\u6b5f\ua068\u4975\ud36e\u97b7$3() {
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
            return:\u8aa5\uc229\u873d\u88c5\u97e6\u3e75(getstatic:\u8aa5\uc229\u873d\u88c5\u97e6\u3e75(\u97e6\u3504\u6b5f\uc229\u7330\u62da::\uafe7\u7ce1\u4c04\ua61f\u9937\u3bc9))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Either lambda$\u4179\u5654\u71ae\u4e72\u7c6b\u0a06$2(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u98a4\u8d98\u3c25\u446c\u12b2\u93a2 p0) {
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
            return:Either(getfield:Either<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u40a9\u8753\u9937\u4daf\uc2bd\ufe34>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u7af6\u7330\uc7fe\uc229\u6b0d\uae5d, p0:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier lambda$\u5f50\u2dcc\u1833\ub19c\u3d4b\ud158$1(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u98a4\u8d98\u3c25\u446c\u12b2\u93a2 p0) {
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
            return:Supplier(getfield:Supplier<\u8aa5\uc229\u873d\u88c5\u97e6\u3e75>(\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u3a62\u97e6\u12b2\u392e\ub19c\ub7dc, p0:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u56bd\u7ce1\ubcb0\ud158\ub102\ua6bd$0(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
            return:App(invokevirtual:App(Products$P3::apply, invokevirtual:Products$P3(RecordCodecBuilder$Instance::group, p0:RecordCodecBuilder$Instance, invokestatic:RecordCodecBuilder[expected:App](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5245\u4c2b\ub18d\u7bad\u9937\u4cd9), invokestatic:RecordCodecBuilder[expected:App](\u98a4\u8d98\u3c25\u446c\u12b2\u93a2::\u5d20\u61a4\u760c\uc2e8\ub102\u1187), invokestatic:RecordCodecBuilder[expected:App](\u624e\u6b5f\u3bd6\u9255\u183a\u52d3::\u624e\u839e\uf94d\u9255\u67d0\uc2e8)), p0:RecordCodecBuilder$Instance[expected:Applicative], invokedynamic:Function3(apply:()Lcom/mojang/datafixers/util/Function3;)))
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
    
    public void \u3bd6\u7873\ub83f\u7330\ub1b9\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(378306019), ldc:int(-1883910878))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u98a4\u8d98\u3c25\u446c\u12b2\u93a2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1922876970))
        }
        else {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-20861969))
            var_5_8A = and:int(ldc:int(-24737), ldc:int(24736))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5130), ldc:int(5129)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-1303868486))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(529), ldc:int(24965)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(789), ldc:int(1153)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(-371503178))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-32754), ldc:int(-32753)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1710459811))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1240818631))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2068654742))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-207508618))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1712833923))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(149206483))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1847621006))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1296502745))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(21424423))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1118811257))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(443799308))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1051072838))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(302029159))
                        var_11_EB = and:int(ldc:int(28876), ldc:int(-30925))
                        goto(Label_1571)
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1729348063))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1004676984))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1333843143))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1993161655))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-916713605))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(363435523))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-368773489))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-51229016))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1440571466))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1783444613))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1371804840))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-53459738))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1232674238))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1016937143))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2128717385))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(6212), ldc:int(6213))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(758253223))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1762385393))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-123960644))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1091674652))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1661128786))
                        var_11_EB = and:int(ldc:int(9880), ldc:int(-9881))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1693412000))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1049455300))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-212237386))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1411743665))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(164950702))
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1203014135))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(576779679))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(753411439))
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(499125973))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-473277458))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1072744178))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1573469206))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-388816977))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-578563342))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1294037936))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1558045895))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-329410501))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-845283406))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1285192044))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-39579109))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1366789481))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1895848544))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2030572923))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(437653817))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1656053118))
                        var_17_6BC = add:int(var_16_119:int, xor:int(ldc:int(12928), ldc:int(12929)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(561633727))
                
                if (cmple:boolean(var_5_8A = var_17_6BC:int, sub:int(var_6_91:int, and:int(ldc:int(3), ldc:int(489))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
