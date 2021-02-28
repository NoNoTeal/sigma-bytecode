public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U> {
    public void \u4bc8\u718f\u5db4\u72f1\u8709\uafe7() {
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
            invokespecial:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::<init>, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>, invokestatic:ArrayList[expected:List](Lists::newArrayList))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4bc8\u718f\u5db4\u72f1\u8709\uafe7(java.util.List<\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>> p0) {
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
            invokespecial:Object(Object::<init>, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)
            putfield:Random(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\u7049\u97b7\u1187\uf9c5\u7043\u7ce1, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>, initobject:Random(Random::<init>))
            putfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>, invokestatic:ArrayList[expected:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>](Lists::newArrayList, p0:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>[expected:Iterable]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.serialization.Codec<\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>> \u67d0\uff55\ubded\uc29a\ub171\u385b(com.mojang.serialization.Codec<U> p0) {
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
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U> \u3dd3\u7330\u6b5f\u6b5f\u34df\u9033(U p0, int p1) {
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
            invokeinterface:boolean(List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>::add, getfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>), initobject:\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>(\ubf56\u392e\uae87\u5d20\ubb2b\u156b<T>::<init>, p0:U[expected:Object], p1:int, aconstnull:\u64ab\u12b2\ufcaf\ubf56\u156b\ud171()))
            return:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>(this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U> \u69d9\u8640\u5245\u4975\u3d64\u64ab() {
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
            return:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>(invokevirtual:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>::\u156b\ufe34\u7c6b\uc910\u392e\ud12e, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>, getfield:Random(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\u7049\u97b7\u1187\uf9c5\u7043\u7ce1, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)))
        }
        
        goto(Label_0006)
    }
    
    public \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U> \u156b\ufe34\u7c6b\uc910\u392e\ud12e(java.util.Random p0) {
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
    
    public boolean \u7d52\u9033\uc9f6\u1187\u6435\ua068() {
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
            return:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<U> \u7049\u97e6\u61a4\u12b2\u4c04\u6c56() {
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
            return:Stream<U>(invokeinterface:Stream<U>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>[expected:Collection<Object>](\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)), invokedynamic:Function<? super Object, Object>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    public U \u64f2\ube23\u98a4\ud217\u4975\u4e72(java.util.Random p0) {
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
            return:U(invokevirtual:U(Optional<U>::orElseThrow, invokeinterface:Optional<U>(Stream<U>::findFirst, invokevirtual:Stream<U>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>::\u7049\u97e6\u61a4\u12b2\u4c04\u6c56, invokevirtual:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>::\u156b\ufe34\u7c6b\uc910\u392e\ud12e, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>, p0:Random))), invokedynamic:Supplier<RuntimeException>(get:()Ljava/util/function/Supplier;)))
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\u5654\u4492\u8709\ud217\u76bc\u4ab3), and:int(ldc:int(1720), ldc:int(-1721)))), getfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>[expected:Object](\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>)), loadelement:String(getstatic:String[](\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\u5654\u4492\u8709\ud217\u76bc\u4ab3), and:int(ldc:int(577), ldc:int(16395))))))
        }
        
        goto(Label_0006)
    }
    
    private static double lambda$\u8350\u7af6\uae87\u4cd9\u3d4b\u8308$2(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubf56\u392e\uae87\u5d20\ubb2b\u156b p0) {
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
            return:double(invokestatic:double(\ubf56\u392e\uae87\u5d20\ubb2b\u156b<Object>::\ud36e\u5d20\uc229\u836c\u4179\ub19c, p0:\ubf56\u392e\uae87\u5d20\ubb2b\u156b<Object>))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7873\u7006\u9033\u7873\u7330\u3d4b$1(java.util.Random p0, \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubf56\u392e\uae87\u5d20\ubb2b\u156b p1) {
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
            invokestatic:void(\ubf56\u392e\uae87\u5d20\ubb2b\u156b<Object>::\uc29a\u647c\u7d52\u6bb9\u12cb\u6b0d, p1:\ubf56\u392e\uae87\u5d20\ubb2b\u156b<Object>, invokevirtual:float(Random::nextFloat, p0:Random))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u0a06\u6cfe\u88c5\u7873\u51b2\u64f2$0(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4bc8\u718f\u5db4\u72f1\u8709\uafe7 p0) {
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
            return:List(getfield:List<\ubf56\u392e\uae87\u5d20\ubb2b\u156b<U>>(\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\uff55\ub83f\u2dcc\u5245\u56bd\ubb2b, p0:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B5 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_1C8_0 : byte[] [generated]
        stack_206_0 : byte[] [generated]
        stack_264_0 : byte[] [generated]
        stack_2E2_0 : byte[] [generated]
        var_4_1A0 : int
        var_3_1A5 : byte[]
        var_5_1A6 : int
        var_0_25A : int
        expr_264 : byte [generated]
        stack_2AD_2 : byte [generated]
        stack_28A_0 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_1F4 : byte[]
        var_5_1F5 : int
        expr_D9 : int [generated]
        expr_11B : int [generated]
        var_3_2D0 : byte[]
        var_5_2D1 : int
        expr_2E2 : byte [generated]
        var_3_14B : String
        stack_199_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_1B5 = and:int(ldc:int(-207698620), ldc:int(-623229314))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_119_0 = stack_11B_0 = stack_13F_0 = stack_1C8_0 = stack_206_0 = stack_264_0 = stack_2E2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("L9jb1MXaIw3S5sIxDR8K")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A0 = expr_6E:int
        var_3_1A5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A6 = expr_6E:int
        Label_0424:
        
        while (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-625326346))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, add:byte(xor:byte(loadelement:byte(stack_1C8_0:byte[], var_5_1A6:int), ldc:byte(44)), ldc:byte(10)))
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_119_0 = stack_11B_0 = stack_13F_0 = stack_1C8_0 = stack_206_0 = stack_264_0 = stack_2E2_0 = var_3_1A5:byte[]
            goto(Label_0115)
        }
        
        var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-501336464))
        Label_0589:
        
        while (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(64)), ldc:int(0))) {
            var_0_25A = and:int(var_0_1B5:int, ldc:int(-138674698))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_264 = stack_2AD_2 = loadelement(stack_264_0, var_5_1A6)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A6:int, ldc:int(2)), neg:int(var_4_1A0:int)), ldc:int(0))) {
                stack_2AD_2 = stack_28A_0 = add:byte(expr_264:byte, loadelement:byte(var_3_1A5:byte[], add:int(var_5_1A6:int, ldc:int(2))))
                goto(Label_0666)
            }
            
            Label_0625:
            
            if (cmpne:boolean(and:int(var_0_25A:int, ldc:int(8192)), ldc:int(0))) {
                var_0_25A = and:int(var_0_25A:int, ldc:int(-1717238695))
            }
            else {
                var_0_25A = and:int(var_0_25A:int, ldc:int(-610603436))
                stack_2AD_2 = stack_28A_0 = add:byte(expr_264:byte, ldc:byte(2))
            }
            
            Label_0666:
            
            if (cmpeq:boolean(and:int(var_0_25A:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0625)
            }
            
            var_0_1B5 = and:int(var_0_25A:int, ldc:int(-107405))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, stack_2AD_2:byte)
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_119_0 = stack_11B_0 = stack_13F_0 = stack_1C8_0 = stack_206_0 = stack_264_0 = stack_2E2_0 = var_3_1A5:byte[]
            goto(Label_0222)
        }
        
        goto(Label_0424)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(8)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(669358526))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-1554532737))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-739064578))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_1F4 = newarray:byte[](byte.class, expr_A9:int)
                var_5_1F5 = expr_A9:int
                
                loop {
                    var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-742590489))
                    var_5_1F5 = add:int(var_5_1F5:int, ldc:int(-1))
                    storeelement:byte(var_3_1F4:byte[], var_5_1F5:int, add:int(shl:int(loadelement:byte(stack_206_0:byte[], var_5_1F5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_1F5:int, and:int(ldc:int(12297), ldc:int(2597)))), ldc:int(4)), and:int(ldc:int(1039), ldc:int(543)))))
                    
                    if (cmpne:boolean(var_5_1F5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_119_0 = stack_11B_0 = stack_13F_0 = stack_1C8_0 = stack_206_0 = stack_264_0 = stack_2E2_0 = var_3_1F4:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-2110920921))
                goto(Label_0115)
            }
            
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-761991982))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1A0 = expr_D9:int
                var_3_1A5 = newarray:byte[](byte.class, expr_D9:int)
                var_5_1A6 = expr_D9:int
                goto(Label_0589)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(45413762))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(2048)), ldc:int(0))) {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-817154622))
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(8)), ldc:int(0))) {
                var_0_1B5 = and:int(var_0_1B5:int, ldc:int(1932993469))
                goto(Label_0115)
            }
            
            var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-745345674))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_2D0 = newarray:byte[](byte.class, expr_11B:int)
                var_5_2D1 = expr_11B:int
                
                loop {
                    var_0_1B5 = and:int(var_0_1B5:int, ldc:int(-555852709))
                    var_5_2D1 = add:int(var_5_2D1:int, ldc:int(-1))
                    expr_2E2 = loadelement:byte(stack_2E2_0:byte[], var_5_2D1:int)
                    storeelement:byte(var_3_2D0:byte[], var_5_2D1:int, or:int(and:int(shl:int(expr_2E2:byte, and:int(ldc:int(13708), ldc:int(2086))), ldc:int(-16)), and:int(shr:int(expr_2E2:byte[expected:int], xor:int(ldc:int(641), ldc:int(645))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2D1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_119_0 = stack_11B_0 = stack_13F_0 = stack_1C8_0 = stack_206_0 = stack_264_0 = stack_2E2_0 = var_3_2D0:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpeq:boolean(and:int(var_0_1B5:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_1B5:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_199_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(29290), ldc:int(18)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(66), ldc:int(9350)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-31627), ldc:int(14986)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-20539), ldc:int(20538)), and:int(ldc:int(45), ldc:int(2333))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(8331), ldc:int(101)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(16783), ldc:int(11277)), xor:int(ldc:int(1064), ldc:int(1062))))
            putstatic:String[](\u4bc8\u718f\u5db4\u72f1\u8709\uafe7::\u5654\u4492\u8709\ud217\u76bc\u4ab3, expr_15D:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u9a18\u0c95\u36d3\ub83f\u8258\u97e6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_69F = and:int(ldc:int(1364166902), ldc:int(-1066754603))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4bc8\u718f\u5db4\u72f1\u8709\uafe7<U>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-1626494483))
        }
        else {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-645333506))
            var_5_8A = and:int(ldc:int(-9413), ldc:int(9412))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16824), ldc:int(-16889)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(-228987980))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(8277), ldc:int(769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(37), ldc:int(19715)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(-760309154))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(9216), ldc:int(9217)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(903173029))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(716422854))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(264004684))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1585356072))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(131087186))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-448934859))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(533142937))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1327835822))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1751208034))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1362945688))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1237677715))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1571539096))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-74837991))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1994316420))
                        var_11_EB = and:int(ldc:int(-23660), ldc:int(19555))
                        goto(Label_1553)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1542725730))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-189054229))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1608543766))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1773062989))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1926284724))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(638474742))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1108836846))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1146770231))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1588368611))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(584294332))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-71727057))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(817307578))
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1405737345))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1494972867))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1631771952))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(867517431))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1068388753))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-607339393))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(8723), ldc:int(4397))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1337827425))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(168782426))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-651241076))
                        var_11_EB = and:int(ldc:int(9004), ldc:int(-14335))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1242730206))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(110602449))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1150143806))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1205850225))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(339918170))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-453470661))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(970610171))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(60045096))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1356492197))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-220227291))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1553)
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-785676335))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1700580654))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1548961304))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-14972873))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1522485532))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2000489236))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1723900772))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1850253581))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1794653664))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-149955739))
                        var_17_6AA = add:int(var_16_119:int, xor:int(ldc:int(1088), ldc:int(1089)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-1637002935))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(1834850572))
                
                if (cmple:boolean(var_5_8A = var_17_6AA:int, sub:int(var_6_91:int, xor:int(ldc:int(-13824), ldc:int(-13823))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
