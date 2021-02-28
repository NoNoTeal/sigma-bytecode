public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d {
    public void \u836c\u93a2\u97e6\u56bd\u5f50\u6b0d(java.util.function.ToIntFunction p0, java.util.function.IntFunction p1, java.util.function.Function p2) {
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
            putfield:ToIntFunction(\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\u1833\u156b\u7ce1\u8709\u6d69\u8709, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d, p0:ToIntFunction)
            putfield:IntFunction(\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d, p1:IntFunction)
            putfield:Function(\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\u7873\u51b2\u12b2\u7ce1\u600f\ub8be, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d, p2:Function)
            invokespecial:Object(Object::<init>, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.DataResult encode(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006 p0, com.mojang.serialization.DynamicOps p1, java.lang.Object p2) {
        var_4_61 : int
        stack_AB_0 : DataResult [generated]
        
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
            var_4_61 = and:int(ldc:int(-1070286496), ldc:int(-323035793))
            
            if (logicalnot:boolean(invokeinterface:boolean(DynamicOps::compressMaps, p1:DynamicOps))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-42500119))
                stack_AB_0 = invokeinterface:DataResult(DynamicOps::mergeToPrimitive, p1:DynamicOps, p2:Object, invokeinterface:Object(DynamicOps::createString, p1:DynamicOps, invokeinterface:String(\u8cae\u392e\u5fe1\u5140\u3dd3\u7006::\u99f7\u4e72\u624e\u527a\u624e\ubefe, p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006)))
            }
            else {
                stack_AB_0 = invokeinterface:DataResult(DynamicOps::mergeToPrimitive, p1:DynamicOps, p2:Object, invokeinterface:Object(DynamicOps::createInt, p1:DynamicOps, invokeinterface:int(ToIntFunction<\u8cae\u392e\u5fe1\u5140\u3dd3\u7006>::applyAsInt, getfield:ToIntFunction(\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\u1833\u156b\u7ce1\u8709\u6d69\u8709, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d), p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006)))
            }
            
            return:DataResult(stack_AB_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.DataResult<com.mojang.datafixers.util.Pair<java.lang.Object, T>> decode(com.mojang.serialization.DynamicOps<T> p0, T p1) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\ucef1\u8bb0\ud158\u64ab\u61a4\ud171), and:int(ldc:int(25238), ldc:int(-27287)))), getfield:ToIntFunction[expected:Object](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\u1833\u156b\u7ce1\u8709\u6d69\u8709, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d)), loadelement:String(getstatic:String[](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\ucef1\u8bb0\ud158\u64ab\u61a4\ud171), and:int(ldc:int(625), ldc:int(14607))))))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.DataResult encode(java.lang.Object p0, com.mojang.serialization.DynamicOps p1, java.lang.Object p2) {
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
            return:DataResult(invokevirtual:DataResult(\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::encode, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d, checkcast:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006.class, p0:Object[expected:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006]), p1:DynamicOps, p2:Object))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\u61a4\u7bad\u3d64\u3c25\uf995\u4d85$5(com.mojang.serialization.DynamicOps p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006 p1) {
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
            return:Pair(invokestatic:Pair(Pair::of, p1:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[expected:Object], invokeinterface:Object(DynamicOps::empty, p0:DynamicOps)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\u156b\ud12e\ub113\u9255\u5d20\u392e$4(java.util.function.Function p0, java.lang.String p1) {
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
    
    private static com.mojang.serialization.DataResult lambda$\u4179\u97e6\u3711\u960f\u392e\ufcaf$3(java.lang.String p0) {
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
            return:DataResult(invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\ucef1\u8bb0\ud158\u64ab\u61a4\ud171), xor:int(ldc:int(-32495), ldc:int(-32493)))), p0:String))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\u6b5f\u8413\uafe7\u3504\ud51e\u3d4b$2(com.mojang.serialization.DynamicOps p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006 p1) {
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
            return:Pair(invokestatic:Pair(Pair::of, p1:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[expected:Object], invokeinterface:Object(DynamicOps::empty, p0:DynamicOps)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\u9033\ube23\ucb79\u74b1\u647c\u8c8a$1(java.util.function.IntFunction p0, java.lang.Number p1) {
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
    
    private static com.mojang.serialization.DataResult lambda$\u47c2\uff55\u8aa5\u6b0d\u99f7\ud12e$0(java.lang.Number p0) {
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
            return:DataResult(invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\ucef1\u8bb0\ud158\u64ab\u61a4\ud171), xor:int(ldc:int(16394), ldc:int(16393)))), p0:Number[expected:Object]))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_330 : int
        expr_6E : int [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_14C_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_196_0 : byte[] [generated]
        stack_198_0 : byte[] [generated]
        stack_1CD_0 : byte[] [generated]
        stack_28B_0 : byte[] [generated]
        stack_2DC_0 : byte[] [generated]
        stack_34B_0 : byte[] [generated]
        stack_3AB_0 : byte[] [generated]
        stack_420_0 : byte[] [generated]
        var_4_264 : int
        var_3_269 : byte[]
        var_5_26A : int
        expr_28B : byte [generated]
        var_0_3A1 : int
        expr_3AB : byte [generated]
        stack_3EB_2 : byte [generated]
        stack_3C8_0 : byte [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_2CA : byte[]
        var_5_2CB : int
        expr_FB : int [generated]
        expr_14E : int [generated]
        expr_198 : int [generated]
        var_3_40E : byte[]
        var_5_40F : int
        var_3_1D9 : String
        stack_25D_0 : String[] [generated]
        expr_1EB : String[] [generated]
        
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
        var_0_330 = and:int(ldc:int(-49755416), ldc:int(-1358118447))
        expr_6E = arraylength:int(stack_BF_0 = stack_C1_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8NfjoNS27M3N6sLUxNnR1ZGkxPT9xMzJHdTPn8DVxMQGytq9E5asgfLEzMkd1M+fwNXExAbK3YjY9hSS5chOAw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_264 = expr_6E:int
        var_3_269 = newarray:byte[](byte.class, expr_6E:int)
        var_5_26A = expr_6E:int
        Label_0620:
        
        while (cmpeq:boolean(and:int(var_0_330:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0803)
            }
            
            var_0_330 = and:int(var_0_330:int, ldc:int(-1983984672))
            var_5_26A = add:int(var_5_26A:int, ldc:int(-1))
            expr_28B = loadelement:byte(stack_28B_0:byte[], var_5_26A:int)
            storeelement:byte(var_3_269:byte[], var_5_26A:int, or:int(and:int(shl:int(expr_28B:byte, xor:int(ldc:int(-23296), ldc:int(-23292))), ldc:int(-16)), and:int(shr:int(expr_28B:byte[expected:int], xor:int(ldc:int(28678), ldc:int(28674))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_26A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = var_3_269:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0890)
        Label_0803:
        
        while (cmpeq:boolean(and:int(var_0_330:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_330:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0620)
            }
            
            var_0_330 = and:int(var_0_330:int, ldc:int(-1987474475))
            var_5_26A = add:int(var_5_26A:int, ldc:int(-1))
            storeelement:byte(var_3_269:byte[], var_5_26A:int, add:byte(loadelement:byte(stack_34B_0:byte[], var_5_26A:int), ldc:byte(51)))
            
            if (cmpne:boolean(var_5_26A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = var_3_269:byte[]
            goto(Label_0256)
        }
        
        var_0_330 = and:int(var_0_330:int, ldc:int(-1047591022))
        Label_0890:
        
        while (cmpne:boolean(and:int(var_0_330:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(32768)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(-1168377143))
                goto(Label_0620)
            }
            
            var_0_3A1 = and:int(var_0_330:int, ldc:int(-1952534571))
            var_5_26A = add:int(var_5_26A:int, ldc:int(-1))
            expr_3AB = stack_3EB_2 = loadelement(stack_3AB_0, var_5_26A)
            
            if (cmplt:boolean(add:int(add:int(var_5_26A:int, ldc:int(3)), neg:int(var_4_264:int)), ldc:int(0))) {
                stack_3EB_2 = stack_3C8_0 = add:byte(expr_3AB:byte, loadelement:byte(var_3_269:byte[], add:int(var_5_26A:int, ldc:int(3))))
                goto(Label_0984)
            }
            
            Label_0952:
            
            if (cmpne:boolean(and:int(var_0_3A1:int, ldc:int(32768)), ldc:int(0))) {
                var_0_3A1 = and:int(var_0_3A1:int, ldc:int(-373642048))
                stack_3EB_2 = stack_3C8_0 = add:byte(expr_3AB:byte, ldc:byte(3))
            }
            
            Label_0984:
            
            if (cmpeq:boolean(and:int(var_0_3A1:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0952)
            }
            
            var_0_330 = and:int(var_0_3A1:int, ldc:int(-1990335520))
            storeelement:byte(var_3_269:byte[], var_5_26A:int, stack_3EB_2:byte)
            
            if (cmpne:boolean(var_5_26A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = var_3_269:byte[]
            goto(Label_0339)
        }
        
        var_0_330 = and:int(var_0_330:int, ldc:int(-489465920))
        goto(Label_0803)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(128)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(950008705))
            goto(Label_0413)
        }
        
        if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(-618002248))
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(2)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(-51198650))
            goto(Label_0256)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(131072)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(-50305026))
        }
        else {
            var_0_330 = and:int(var_0_330:int, ldc:int(-671230015))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_2CA = newarray:byte[](byte.class, expr_C3:int)
                var_5_2CB = expr_C3:int
                
                loop {
                    var_0_330 = and:int(var_0_330:int, ldc:int(-2059891504))
                    var_5_2CB = add:int(var_5_2CB:int, ldc:int(-1))
                    storeelement:byte(var_3_2CA:byte[], var_5_2CB:int, add:int(shl:int(loadelement:byte(stack_2DC_0:byte[], var_5_2CB:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_2CB:int, and:int(ldc:int(3849), ldc:int(16513)))), ldc:int(4)), xor:int(ldc:int(2643), ldc:int(2652)))))
                    
                    if (cmpne:boolean(var_5_2CB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = var_3_2CA:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0413)
        }
        
        if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(32768)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(2137315170))
                goto(Label_0115)
            }
            
            var_0_330 = and:int(var_0_330:int, ldc:int(-1255163656))
            expr_FB = arraylength:int(stack_FB_0:byte[])
            
            if (cmpne:boolean(expr_FB:int, ldc:int(0))) {
                var_4_264 = expr_FB:int
                var_3_269 = newarray:byte[](byte.class, expr_FB:int)
                var_5_26A = expr_FB:int
                goto(Label_0803)
            }
        }
        
        Label_0256:
        
        if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(-1326251800))
            goto(Label_0413)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(1448696262))
        }
        else {
            if (cmpne:boolean(and:int(var_0_330:int, ldc:int(256)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(451410979))
                goto(Label_0200)
            }
            
            if (cmpne:boolean(and:int(var_0_330:int, ldc:int(8192)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(-916977559))
                goto(Label_0115)
            }
            
            var_0_330 = and:int(var_0_330:int, ldc:int(-1894913581))
            expr_14E = arraylength:int(stack_14E_0:byte[])
            
            if (cmpne:boolean(expr_14E:int, ldc:int(0))) {
                var_4_264 = expr_14E:int
                var_3_269 = newarray:byte[](byte.class, expr_14E:int)
                var_5_26A = expr_14E:int
                goto(Label_0890)
            }
        }
        
        Label_0339:
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(743226330))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_330:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0256)
            }
            
            if (cmpne:boolean(and:int(var_0_330:int, ldc:int(131072)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(-1513590984))
                goto(Label_0200)
            }
            
            if (cmpne:boolean(and:int(var_0_330:int, ldc:int(1024)), ldc:int(0))) {
                var_0_330 = and:int(var_0_330:int, ldc:int(1767506152))
                goto(Label_0115)
            }
            
            var_0_330 = and:int(var_0_330:int, ldc:int(-282490680))
            expr_198 = arraylength:int(stack_198_0:byte[])
            
            if (cmpne:boolean(expr_198:int, ldc:int(0))) {
                var_3_40E = newarray:byte[](byte.class, expr_198:int)
                var_5_40F = expr_198:int
                
                loop {
                    var_0_330 = and:int(var_0_330:int, ldc:int(-512059922))
                    var_5_40F = add:int(var_5_40F:int, ldc:int(-1))
                    storeelement:byte(var_3_40E:byte[], var_5_40F:int, xor:byte(loadelement:byte(stack_420_0:byte[], var_5_40F:int), ldc:byte(36)))
                    
                    if (cmpne:boolean(var_5_40F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_F9_0 = stack_FB_0 = stack_14C_0 = stack_14E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_28B_0 = stack_2DC_0 = stack_34B_0 = stack_3AB_0 = stack_420_0 = var_3_40E:byte[]
            }
        }
        
        Label_0413:
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0256)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_330:int, ldc:int(2)), ldc:int(0))) {
            var_0_330 = and:int(var_0_330:int, ldc:int(410403812))
            goto(Label_0115)
        }
        
        var_3_1D9 = initobject:String(String::<init>, stack_1CD_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_25D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(660), ldc:int(108)))
        expr_1EB = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(68), ldc:int(28807)))
        storeelement:String(expr_1EB:String[], and:int(ldc:int(-13102), ldc:int(301)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(-17713), ldc:int(17712)), xor:int(ldc:int(114), ldc:int(102))))
        storeelement:String(expr_1EB:String[], and:int(ldc:int(16899), ldc:int(13379)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(20500), ldc:int(1302)), and:int(ldc:int(6574), ldc:int(8744))))
        storeelement:String(expr_1EB:String[], and:int(ldc:int(2), ldc:int(1318)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-31683), ldc:int(-31723)), and:int(ldc:int(126), ldc:int(6846))))
        storeelement:String(expr_1EB:String[], xor:int(ldc:int(1061), ldc:int(1060)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-24569), ldc:int(-24519)), xor:int(ldc:int(24704), ldc:int(24767))))
        putstatic:String[](\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d::\ucef1\u8bb0\ud158\u64ab\u61a4\ud171, expr_1EB:String[])
    }
    
    public void \u4bc8\uc910\u2dcc\u624e\ub6ab\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
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
        var_3_6B1 = and:int(ldc:int(1409188331), ldc:int(1417652193))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u836c\u93a2\u97e6\u56bd\u5f50\u6b0d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-411470639))
        }
        else {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-562067495))
            var_5_8A = and:int(ldc:int(-4876), ldc:int(779))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20629), ldc:int(-20704)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6B1:int, ldc:int(-797970457))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(1321), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(275), ldc:int(1)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_E3:int, ldc:int(1450101759))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(17411), ldc:int(17410)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1763680820))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-871304122))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2065961444))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2071974359))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-617245959))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(102084481))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1094147566))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(367337224))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(451241233))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(51129149))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-679507003))
                        var_11_F4 = and:int(ldc:int(3401), ldc:int(-19786))
                        goto(Label_1580)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1192967457))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1839058685))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1496305353))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-868267554))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(374807834))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2112236829))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1466872289))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(224037335))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1828400257))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-728213886))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-599872335))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1820237670))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1663156911))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2020578799))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-966804668))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-16203189))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-143660035))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(3592), ldc:int(3593))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1665213695))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-259009892))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(609277316))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-474007356))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1585435639))
                        var_11_F4 = and:int(ldc:int(19587), ldc:int(-19588))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-78266725))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2071929229))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(198427412))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1593654204))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(998738617))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1441717237))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2136109936))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1671998301))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1260316645))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1500443345))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2147461591))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1580)
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(775946219))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-883842208))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1544988809))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1545410318))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2061972877))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2056962931))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-118518301))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(50526309))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-940081827))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(726880821))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1394886033))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-507992830))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1929373157))
                        var_17_6BC = add:int(var_16_122:int, and:int(ldc:int(20803), ldc:int(10249)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-781197333))
                
                if (cmple:boolean(var_5_8A = var_17_6BC:int, sub:int(var_6_91:int, and:int(ldc:int(17489), ldc:int(3))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1755991476))
            goto(Label_0108)
        }
    }
}
