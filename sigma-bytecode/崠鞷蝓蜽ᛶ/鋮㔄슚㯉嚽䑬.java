public final class \u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c {
    public void \u92ee\u3504\uc29a\u3bc9\u56bd\u446c(int p0, int p1, int p2) {
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
            invokespecial:Object(Object::<init>, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c)
            putfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\u9033\uc229\u156b\u99f7\u93a2\u7e3f, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c, p0:int)
            putfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ua562\uc229\u4492\ubff1\u718f\u6c56, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c, p1:int)
            putfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ubff1\ubcb0\u69d9\u6b0d\ub83f\u873d, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<T> \u76bc\u494c\u12b2\u71f1\u5fe1\u4f52(com.mojang.serialization.DynamicOps<T> p0) {
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
            return:Dynamic<T>(initobject:Dynamic(Dynamic::<init>, p0:DynamicOps<T>, invokevirtual:Object(Optional<Object>::orElse, invokevirtual:Optional(DataResult::result, invokeinterface:DataResult(Codec::encodeStart, getstatic:Codec<\u92ee\u3504\uc29a\u3bc9\u56bd\u446c>(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\u67d0\uafe7\u071d\u4f4a\u8753\uc2e8), p0:DynamicOps<T>, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c[expected:Object])), invokeinterface:Object(DynamicOps::emptyMap, p0:DynamicOps<T>))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u760c\u4d85\u8753\u7d52\uf9c5\uc29a$3(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Integer lambda$\u3776\u3bd6\u4bc8\u0800\ub102\u4daf$2(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ubff1\ubcb0\u69d9\u6b0d\ub83f\u873d, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u8df4\u64f2\ub19c\u3e75\u8aa5\u624e$1(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ua562\uc229\u4492\ubff1\u718f\u6c56, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u52d3\u8413\u494c\ub8be\ub83f\u6b0d$0(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\u9033\uc229\u156b\u99f7\u93a2\u7e3f, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c)))
        }
        
        goto(Label_0006)
    }
    
    public static int \ua562\ub102\ube23\u8308\u4cd9\u34df(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:int(getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\u9033\uc229\u156b\u99f7\u93a2\u7e3f, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c))
        }
        
        goto(Label_0006)
    }
    
    public static int \u8753\ubcb0\u647c\u7c6b\ub113\u34df(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:int(getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ua562\uc229\u4492\ubff1\u718f\u6c56, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c))
        }
        
        goto(Label_0006)
    }
    
    public static int \u7af6\uc3e3\u36d3\ube23\ufcaf\u7e3f(\u5d20\u97b7\u8753\u873d\u16f6.\u92ee\u3504\uc29a\u3bc9\u56bd\u446c p0) {
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
            return:int(getfield:int(\u92ee\u3504\uc29a\u3bc9\u56bd\u446c::\ubff1\ubcb0\u69d9\u6b0d\ub83f\u873d, p0:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c))
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
    
    public void \u9a18\u8d98\u983f\u6c52\ub18d\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66F : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_67A : int
        
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
        var_3_66F = and:int(ldc:int(443262895), ldc:int(-1731213591))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ee\u3504\uc29a\u3bc9\u56bd\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-2008459658))
        }
        else {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-1159753735))
            var_5_88 = and:int(ldc:int(27715), ldc:int(-27732))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(239), ldc:int(-240)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_66F:int, ldc:int(1021808217))
                    var_9_CF = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_8F:int, and:int(ldc:int(20489), ldc:int(323)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, and:int(ldc:int(22161), ldc:int(8225)))), var_7_9E:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_66F = and:int(var_3_E1:int, ldc:int(-102770945))
                    var_14_11C = var_7_9E:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(137), ldc:int(2369)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_8F:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1058085729))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1273)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1033121716))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-578164255))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1233262357))
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1375567831))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-580942721))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0425:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-973001753))
                        goto(Label_1273)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1166217339))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1140535060))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-703381813))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(2051530191))
                            var_11_F2 = and:int(ldc:int(-29045), ldc:int(29044))
                            goto(Label_1541)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(623603813))
                        goto(Label_1273)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2073052801))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(522329272))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(443010123))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1273)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1770703219))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-491952068))
                        goto(Label_0947)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-664029463))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-546125666))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-2025785816))
                        goto(Label_1273)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-911699039))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1865843308))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-600522163))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1091848291))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_F2 = xor:int(ldc:int(18624), ldc:int(18625))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0947:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(199268800))
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(54843052))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1845075015))
                        goto(Label_1273)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1107316659))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-910042690))
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-113926497))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-297370277))
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1468299714))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1566815261))
                        var_11_F2 = and:int(ldc:int(6298), ldc:int(-14523))
                    }
                    
                    Label_1140:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(634417249))
                        goto(Label_1552)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1555272197))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0947)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1676019914))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1514145217))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-551440506))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2080372025))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1397)
                            }
                        }
                    }
                    
                    Label_1273:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1140)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0947)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-515207500))
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-314910336))
                            goto(Label_0425)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1527888463))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1575213035))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_88:int, var_16_120:int)
                        goto(Label_1541)
                    }
                    
                    Label_1397:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1552)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1240178458))
                        goto(Label_1273)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-268809421))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(961198224))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1125575129))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(969037173))
                        goto(Label_0425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-1661229621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1541:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67A = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1552:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1273)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-197224009))
                        goto(Label_0947)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1595198398))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-33835201))
                        var_17_67A = add:int(var_16_120:int, and:int(ldc:int(1285), ldc:int(2057)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66F = and:int(var_3_66F:int, ldc:int(-629156277))
                
                if (cmple:boolean(var_5_88 = var_17_67A:int, sub:int(var_6_8F:int, and:int(ldc:int(17617), ldc:int(15))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-92911533))
            goto(Label_0106)
        }
    }
}
