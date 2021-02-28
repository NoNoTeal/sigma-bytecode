public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 {
    public void \u67d0\u9a18\u6ec6\u8aa5\u1187() {
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
            invokespecial:Object(Object::<init>, this:\u67d0\u9a18\u6ec6\u8aa5\u1187)
            putfield:Optional<Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub70c\u446c\ub102\u156b\u3504\u7873, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokestatic:Optional<Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>>(Optional<T>::empty))
            putfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub8be\u56bd\u6d69\u6ec6\u71ae\ub83f, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokestatic:LinkedHashMap[expected:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>](Maps::newLinkedHashMap))
            putfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u93a2\ud171\u4daf\u183a\u56bd\u5d20, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokestatic:ArrayList[expected:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>](Lists::newArrayList))
            putfield:List<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u836c\u7049\ube23\u5d20\uafe7\uc2e8, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokestatic:ArrayList[expected:List<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \u6c56\u92ff\u72f1\u760c\uceb8\u960f(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?> p0) {
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
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \ub113\u16f6\ub70c\u8413\u0c95\u3d4b(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?>> p0) {
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
            putfield:Optional<Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\ub70c\u446c\ub102\u156b\u3504\u7873, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, invokestatic:Optional<Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>>(Optional<T>::of, p0:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>))
            return:\u67d0\u9a18\u6ec6\u8aa5\u1187(this:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \uc3e3\u7330\u3776\u97b7\u3e75\u3e2a(\ud36e\u6bb9\u960f\u4c04\u64ab.\u527a\u5f50\u92ff\ud36e\u3e75\u51fa p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> p1) {
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
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \u946b\u6b5f\u5f50\u3c25\u3dd3\u5db4(int p0, java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> p1) {
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
            invokespecial:void(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u99f7\u99f7\uc238\ub102\u59ec\u4179, this:\u67d0\u9a18\u6ec6\u8aa5\u1187, p0:int)
            invokeinterface:boolean(List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>::add, checkcast:List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>(java.util.List<java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>.class, invokeinterface:List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>(List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>::get, getfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u93a2\ud171\u4daf\u183a\u56bd\u5d20, this:\u67d0\u9a18\u6ec6\u8aa5\u1187), p0:int)), p1:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>)
            return:\u67d0\u9a18\u6ec6\u8aa5\u1187(this:\u67d0\u9a18\u6ec6\u8aa5\u1187)
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \u6d99\ubff1\u72f1\u9255\ubded\ub32d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0, \u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179<C> p1) {
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
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u67d0\u9a18\u6ec6\u8aa5\u1187 \ub102\u120d\u93a2\u3d4b\u6d99\uc9f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?> p0) {
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
    
    private void \u99f7\u99f7\uc238\ub102\u59ec\u4179(int p0) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(-60438293), ldc:int(-836370717))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-60556813))
                
                if (cmpgt:boolean(invokeinterface:int(List<E>::size, getfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u93a2\ud171\u4daf\u183a\u56bd\u5d20, this:\u67d0\u9a18\u6ec6\u8aa5\u1187)), p0:int)) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>::add, getfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\u67d0\u9a18\u6ec6\u8aa5\u1187::\u93a2\ud171\u4daf\u183a\u56bd\u5d20, this:\u67d0\u9a18\u6ec6\u8aa5\u1187), invokestatic:ArrayList[expected:List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>](Lists::newArrayList))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 \ub8be\ud36e\ub18d\ub171\u6198\ub171() {
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
    
    private static java.util.List lambda$\u69d9\ub32d\u8d98\u97e6\u3e2a\u4e72$6(java.util.Map.Entry p0) {
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
    
    private static java.lang.IllegalStateException lambda$\u9255\u74b1\u7bad\ua3b4\u2dcc\u92ee$5() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u67d0\u9a18\u6ec6\u8aa5\u1187::\u7d52\ufe34\uc29a\u965f\ufe34\ud4fe), and:int(ldc:int(-11421), ldc:int(10396)))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d lambda$\u8258\ud523\ucef1\u071d\u7ce1\ucfaf$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d p0) {
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
            return:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d(p0:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d)
        }
        
        goto(Label_0006)
    }
    
    private static \u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179 lambda$\uc238\u72f1\ub32d\u5d20\u62da\u718f$3(\u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179 p0) {
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
            return:\u760c\ubded\uff55\u6d69\u4179(p0:\u760c\ubded\uff55\u6d69\u4179)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u392e\u9a18\ub83f\uf995\u8413\u527a$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0) {
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
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a lambda$\u92ee\u88c5\u5245\uae87\u3776\ubefe$1(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a p0) {
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
            return:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a(p0:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5 lambda$\uc87f\u120d\u8258\ub19c\ua3b4\uf94d$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5 p0) {
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
            return:\u64ab\ua6bd\u8413\u93a2\u88c5(p0:\u64ab\ua6bd\u8413\u93a2\u88c5)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23B : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_E0_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_1BF_0 : byte[] [generated]
        stack_24E_0 : byte[] [generated]
        stack_28C_0 : byte[] [generated]
        stack_2E2_0 : byte[] [generated]
        var_4_1A0 : int
        var_3_1A5 : byte[]
        var_5_1A6 : int
        var_0_1B5 : int
        expr_1BF : byte [generated]
        stack_208_2 : byte [generated]
        stack_1E5_0 : byte [generated]
        var_0_80 : int
        expr_A7 : int [generated]
        var_2_DE : byte[]
        expr_E2 : int [generated]
        var_3_27A : byte[]
        var_5_27B : int
        expr_11B : int [generated]
        var_3_2D0 : byte[]
        var_5_2D1 : int
        expr_2E2 : byte [generated]
        var_3_166 : String
        stack_199_0 : String[] [generated]
        expr_178 : String[] [generated]
        
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
        var_0_23B = and:int(ldc:int(148034597), ldc:int(-556600595))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_15A_0 = stack_1BF_0 = stack_24E_0 = stack_28C_0 = stack_2E2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("mMAs0J3UOEdMsMS8/fwAYyj8sNgxUFwj")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A0 = expr_6E:int
        var_3_1A5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A6 = expr_6E:int
        Label_0424:
        
        while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_23B:int, ldc:int(1492812790))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_1BF = stack_208_2 = loadelement(stack_1BF_0, var_5_1A6)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A6:int, ldc:int(3)), neg:int(var_4_1A0:int)), ldc:int(0))) {
                stack_208_2 = stack_1E5_0 = add:byte(expr_1BF:byte, loadelement:byte(var_3_1A5:byte[], add:int(var_5_1A6:int, ldc:int(3))))
                goto(Label_0501)
            }
            
            Label_0460:
            
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(4)), ldc:int(0))) {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-1662172260))
            }
            else {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-1879840401))
                stack_208_2 = stack_1E5_0 = add:byte(expr_1BF:byte, ldc:byte(3))
            }
            
            Label_0501:
            
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0460)
            }
            
            var_0_23B = and:int(var_0_1B5:int, ldc:int(-67670977))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, stack_208_2:byte)
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_15A_0 = stack_1BF_0 = stack_24E_0 = stack_28C_0 = stack_2E2_0 = var_3_1A5:byte[]
            goto(Label_0115)
        }
        
        Label_0558:
        
        while (cmpne:boolean(and:int(var_0_23B:int, ldc:int(32)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(1039800118))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, add:byte(xor:byte(loadelement:byte(stack_24E_0:byte[], var_5_1A6:int), ldc:byte(124)), ldc:byte(102)))
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_15A_0 = stack_1BF_0 = stack_24E_0 = stack_28C_0 = stack_2E2_0 = var_3_1A5:byte[]
            goto(Label_0172)
        }
        
        var_0_23B = and:int(var_0_23B:int, ldc:int(-1579888210))
        goto(Label_0424)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_80 = and:int(var_0_23B:int, ldc:int(271234456))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(8)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(-1816060730))
            goto(Label_0231)
        }
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(8)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(719258815))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1A0 = expr_A7:int
                var_3_1A5 = newarray:byte[](byte.class, expr_A7:int)
                var_5_1A6 = expr_A7:int
                goto(Label_0558)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_80 = and:int(var_0_23B:int, ldc:int(146220901))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(128)), ldc:int(0))) {
            var_0_23B = and:int(var_0_23B:int, ldc:int(43395557))
        }
        else {
            if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_23B = and:int(var_0_23B:int, ldc:int(1576984246))
            var_2_DE = stack_DE_0:byte[]
            expr_E2 = add:int(arraylength:int(stack_E0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E2:int, ldc:int(0))) {
                var_3_27A = newarray:byte[](byte.class, expr_E2:int)
                var_5_27B = expr_E2:int
                
                loop {
                    var_0_23B = and:int(var_0_23B:int, ldc:int(198611245))
                    var_5_27B = add:int(var_5_27B:int, ldc:int(-1))
                    storeelement:byte(var_3_27A:byte[], var_5_27B:int, add:int(shl:int(loadelement:byte(stack_28C_0:byte[], var_5_27B:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_DE:byte[], add:int(var_5_27B:int, xor:int(ldc:int(2352), ldc:int(2353)))), ldc:int(6)), xor:int(ldc:int(4196), ldc:int(4199)))))
                    
                    if (cmpne:boolean(var_5_27B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_15A_0 = stack_1BF_0 = stack_24E_0 = stack_28C_0 = stack_2E2_0 = var_3_27A:byte[]
            }
        }
        
        Label_0231:
        
        if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(131072)), ldc:int(0))) {
            var_0_80 = and:int(var_0_23B:int, ldc:int(-1683649814))
        }
        else {
            if (cmpne:boolean(and:int(var_0_23B:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_23B:int, ldc:int(4)), ldc:int(0))) {
                var_0_23B = and:int(var_0_23B:int, ldc:int(2139573114))
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_23B:int, ldc:int(2079725884))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_2D0 = newarray:byte[](byte.class, expr_11B:int)
                var_5_2D1 = expr_11B:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(955741247))
                    var_5_2D1 = add:int(var_5_2D1:int, ldc:int(-1))
                    expr_2E2 = loadelement:byte(stack_2E2_0:byte[], var_5_2D1:int)
                    storeelement:byte(var_3_2D0:byte[], var_5_2D1:int, or:int(and:int(shl:int(expr_2E2:byte, xor:int(ldc:int(-30622), ldc:int(-30618))), ldc:int(-16)), and:int(shr:int(expr_2E2:byte[expected:int], and:int(ldc:int(29324), ldc:int(3111))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2D1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_DE_0 = stack_E0_0 = stack_119_0 = stack_11B_0 = stack_15A_0 = stack_1BF_0 = stack_24E_0 = stack_28C_0 = stack_2E2_0 = var_3_2D0:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_23B = and:int(var_0_80:int, ldc:int(-530328782))
            goto(Label_0231)
        }
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_23B = and:int(var_0_80:int, ldc:int(-1070203960))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_23B = and:int(var_0_80:int, ldc:int(1815830174))
            goto(Label_0115)
        }
        
        var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_199_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1), ldc:int(25217)))
        expr_178 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9227), ldc:int(16737)))
        storeelement:String(expr_178:String[], and:int(ldc:int(25131), ldc:int(-27308)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1230), ldc:int(-9424)), xor:int(ldc:int(68), ldc:int(83))))
        putstatic:String[](\u67d0\u9a18\u6ec6\u8aa5\u1187::\u7d52\ufe34\uc29a\u965f\ufe34\ud4fe, expr_178:String[])
    }
    
    public void \ua6bd\ud51e\ubefe\u8709\u76bc\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(-770274815), ldc:int(1940187705))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67d0\u9a18\u6ec6\u8aa5\u1187[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(1575090993))
            var_5_81 = and:int(ldc:int(2099), ldc:int(-11320))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(23840), ldc:int(-23841)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_69F:int, ldc:int(1240107743))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(3329), ldc:int(8323)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(2080), ldc:int(2081)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_D1:int, ldc:int(-532042929))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1091), ldc:int(305)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1065910887))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(730342104))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1321933416))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-833550166))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1659624169))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1601004374))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1464597362))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-814842921))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(833575337))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-794093585))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1375643353))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-719832523))
                            var_11_E2 = and:int(ldc:int(5298), ldc:int(-5299))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1355371570))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(598309943))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2037227745))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1540420957))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1597040436))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1396585700))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-627772182))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-739262711))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1752894961))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1986962458))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-241509766))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-316440769))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-126939457))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(288813107))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1139944121))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-10397325))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1474871281))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(6280), ldc:int(6281))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1140689374))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(473687940))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-959136295))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2002544217))
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1957152593))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(892212750))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-2126406443))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-926626175))
                        var_11_E2 = and:int(ldc:int(4400), ldc:int(-4401))
                    }
                    
                    Label_1173:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(788822672))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1526857788))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1461349646))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1590312647))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1183335542))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1173)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(452019217))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-729605688))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2048184215))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-71860257))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(488108011))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(383997168))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-54414206))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1523188116))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(1727519331))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1613353417))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(494655576))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1052764785))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1927085064))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-713161107))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1959283677))
                        var_17_6AA = add:int(var_16_110:int, xor:int(ldc:int(4352), ldc:int(4353)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-225101051))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, xor:int(ldc:int(-31168), ldc:int(-31167))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
