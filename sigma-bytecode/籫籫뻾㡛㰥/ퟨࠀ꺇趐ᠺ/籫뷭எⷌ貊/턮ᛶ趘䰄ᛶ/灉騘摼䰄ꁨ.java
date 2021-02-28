public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7049\u9a18\u647c\u4c04\ua068<T> {
    private void \u7049\u9a18\u647c\u4c04\ua068() {
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
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7049\u9a18\u647c\u4c04\ua068<T> \u8258\uc84e\u8350\u6b5f\u647c\u93a2(java.lang.Class<P> p0, java.util.function.Supplier<P> p1) {
        var_6_77 : int
        var_7_C4 : String
        
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
        var_6_77 = invokeinterface:int(Object2IntMap::put, getfield:Object2IntMap<Class<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u1833\u12cb\u4bc8\u9a18\u3bc9\u74b1, this:\u7049\u9a18\u647c\u4c04\ua068<T>), p0:Class<P>[expected:Object], invokeinterface:int(List<E>::size, getfield:List<Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u7e3f\u446c\u8640\u392e\ube23\ub70c, this:\u7049\u9a18\u647c\u4c04\ua068<T>)))
        
        if (cmpeq:boolean(var_6_77:int, ldc:int(-1))) {
            invokeinterface:boolean(List<Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>::add, getfield:List<Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u7e3f\u446c\u8640\u392e\ube23\ub70c, this:\u7049\u9a18\u647c\u4c04\ua068<T>), p1:Supplier<P>)
            return:\u7049\u9a18\u647c\u4c04\ua068<T>(this:\u7049\u9a18\u647c\u4c04\ua068<T>)
        }
        
        var_7_C4 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7049\u9a18\u647c\u4c04\ua068::\u516c\u6d99\u8c8a\u3bc9\u4f4a\u183a), and:int(ldc:int(-19074), ldc:int(19073)))), p0:Class<P>[expected:Object]), loadelement:String(getstatic:String[](\u7049\u9a18\u647c\u4c04\ua068::\u516c\u6d99\u8c8a\u3bc9\u4f4a\u183a), xor:int(ldc:int(-16384), ldc:int(-16383)))), var_6_77:int))
        invokeinterface:void(Logger::fatal, invokestatic:Logger(LogManager::getLogger), var_7_C4:String)
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, var_7_C4:String))
    }
    
    public java.lang.Integer \uff55\uc238\u6c52\u3d4b\u51b2\u9255(java.lang.Class<?> p0) {
        var_4_6A : int
        
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
            var_4_6A = invokeinterface:int(Object2IntMap::getInt, getfield:Object2IntMap<Class<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u1833\u12cb\u4bc8\u9a18\u3bc9\u74b1, this:\u7049\u9a18\u647c\u4c04\ua068<T>), p0:Class<?>[expected:Object])
            return:Integer(ternaryop:Integer(cmpne:boolean(var_4_6A:int, ldc:int(-1)), invokestatic:Integer(Integer::valueOf, var_4_6A:int), aconstnull:Integer()))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> \u5654\u0c95\u760c\u8bb0\u7d52\u759a(int p0) {
        var_4_6D : Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>
        
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
            var_4_6D = checkcast:Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>(java.util.function.Supplier<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<T>>.class, invokeinterface:Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>(List<Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>::get, getfield:List<Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u7e3f\u446c\u8640\u392e\ube23\ub70c, this:\u7049\u9a18\u647c\u4c04\ua068<T>), p0:int))
            return:\u946b\u6d99\u8df4\u12cb\u5d20<?>(ternaryop:\u946b\u6d99\u8df4\u12cb\u5d20<?>(cmpeq:boolean(var_4_6D:Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>, aconstnull:Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>()), aconstnull:\u946b\u6d99\u8df4\u12cb\u5d20<?>(), checkcast:\u946b\u6d99\u8df4\u12cb\u5d20<?>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?>.class, invokeinterface:? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>(Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>::get, var_4_6D:Supplier<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<java.lang.Class<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?>>> \uf995\u0a06\ucb79\u7330\u983f\u61a4() {
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
            return:Iterable<Class<? extends \u946b\u6d99\u8df4\u12cb\u5d20<?>>>(invokestatic:Iterable(Iterables::unmodifiableIterable, invokeinterface:ObjectSet[expected:Iterable](Object2IntMap::keySet, getfield:Object2IntMap<Class<? extends \u946b\u6d99\u8df4\u12cb\u5d20<T>>>(\u7049\u9a18\u647c\u4c04\ua068::\u1833\u12cb\u4bc8\u9a18\u3bc9\u74b1, this:\u7049\u9a18\u647c\u4c04\ua068<T>))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3504\u8d90\u69d9\u59ec\u965f\u7bad$0(it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap p0) {
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
            invokevirtual:void(Object2IntOpenHashMap::defaultReturnValue, p0:Object2IntOpenHashMap, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\u9a18\u647c\u4c04\ua068(\u56bd\u8413\u647c\u5bc4\ud158.\u873d\u0800\u7873\u59ec\ubb2b p0) {
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
            invokespecial:\u7049\u9a18\u647c\u4c04\ua068(\u7049\u9a18\u647c\u4c04\ua068::<init>, this:\u7049\u9a18\u647c\u4c04\ua068<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_184 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_E2_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_19E_0 : byte[] [generated]
        stack_203_0 : byte[] [generated]
        stack_2A2_0 : byte[] [generated]
        stack_2DD_0 : byte[] [generated]
        var_4_16F : int
        var_3_174 : byte[]
        var_5_175 : int
        expr_1A1 : byte [generated]
        var_0_1F9 : int
        expr_203 : byte [generated]
        stack_24B_2 : byte [generated]
        stack_228_0 : byte [generated]
        expr_8E : int [generated]
        expr_C1 : int [generated]
        var_2_E2 : byte[]
        expr_E6 : int [generated]
        var_3_2CB : byte[]
        var_5_2CC : int
        var_3_11A : String
        stack_168_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_184 = and:int(ldc:int(279619782), ldc:int(-727211594))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_10E_0 = stack_19E_0 = stack_203_0 = stack_2A2_0 = stack_2DD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("rC0poiUz3KHKLR1QLc4h0A0PoynYr5RNs4787FLKxqn1A2eCSg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16F = expr_6B:int
        var_3_174 = newarray:byte[](byte.class, expr_6B:int)
        var_5_175 = expr_6B:int
        Label_0375:
        
        while (cmpne:boolean(and:int(var_0_184:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0486)
            }
            
            var_0_184 = and:int(var_0_184:int, ldc:int(-207082838))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            expr_1A1 = xor:byte(loadelement:byte(stack_19E_0:byte[], var_5_175:int), ldc:byte(35))
            storeelement:byte(var_3_174:byte[], var_5_175:int, or:int(and:int(shl:int(expr_1A1:byte, xor:int(ldc:int(24578), ldc:int(24582))), ldc:int(-16)), and:int(shr:int(expr_1A1:byte[expected:int], and:int(ldc:int(29733), ldc:int(924))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_10E_0 = stack_19E_0 = stack_203_0 = stack_2A2_0 = stack_2DD_0 = var_3_174:byte[]
            goto(Label_0112)
        }
        
        var_0_184 = and:int(var_0_184:int, ldc:int(2020401625))
        goto(Label_0625)
        Label_0486:
        
        while (cmpeq:boolean(and:int(var_0_184:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_184:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0375)
            }
            
            var_0_1F9 = and:int(var_0_184:int, ldc:int(2125306862))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            expr_203 = stack_24B_2 = loadelement(stack_203_0, var_5_175)
            
            if (cmplt:boolean(add:int(add:int(var_5_175:int, ldc:int(4)), neg:int(var_4_16F:int)), ldc:int(0))) {
                stack_24B_2 = stack_228_0 = add:byte(expr_203:byte, loadelement:byte(var_3_174:byte[], add:int(var_5_175:int, ldc:int(4))))
                goto(Label_0568)
            }
            
            Label_0528:
            
            if (cmpne:boolean(and:int(var_0_1F9:int, ldc:int(32)), ldc:int(0))) {
                var_0_1F9 = and:int(var_0_1F9:int, ldc:int(449843179))
            }
            else {
                var_0_1F9 = and:int(var_0_1F9:int, ldc:int(-169270361))
                stack_24B_2 = stack_228_0 = add:byte(expr_203:byte, ldc:byte(4))
            }
            
            Label_0568:
            
            if (cmpne:boolean(and:int(var_0_1F9:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0528)
            }
            
            var_0_184 = and:int(var_0_1F9:int, ldc:int(-1634752626))
            storeelement:byte(var_3_174:byte[], var_5_175:int, stack_24B_2:byte)
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_10E_0 = stack_19E_0 = stack_203_0 = stack_2A2_0 = stack_2DD_0 = var_3_174:byte[]
            goto(Label_0147)
        }
        
        Label_0625:
        
        while (cmpeq:boolean(and:int(var_0_184:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_184:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_184 = and:int(var_0_184:int, ldc:int(18743912))
                goto(Label_0375)
            }
            
            var_0_184 = and:int(var_0_184:int, ldc:int(-1328763937))
            var_5_175 = add:int(var_5_175:int, ldc:int(-1))
            storeelement:byte(var_3_174:byte[], var_5_175:int, add:byte(loadelement:byte(stack_2A2_0:byte[], var_5_175:int), ldc:byte(102)))
            
            if (cmpne:boolean(var_5_175:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_10E_0 = stack_19E_0 = stack_203_0 = stack_2A2_0 = stack_2DD_0 = var_3_174:byte[]
            goto(Label_0198)
        }
        
        var_0_184 = and:int(var_0_184:int, ldc:int(1021653742))
        goto(Label_0486)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_184 = and:int(var_0_184:int, ldc:int(-1796407310))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_16F = expr_8E:int
                var_3_174 = newarray:byte[](byte.class, expr_8E:int)
                var_5_175 = expr_8E:int
                goto(Label_0486)
            }
        }
        
        Label_0147:
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1024)), ldc:int(0))) {
            var_0_184 = and:int(var_0_184:int, ldc:int(-1333122865))
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_184:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_184:int, ldc:int(4096)), ldc:int(0))) {
                var_0_184 = and:int(var_0_184:int, ldc:int(-1041326948))
                goto(Label_0112)
            }
            
            var_0_184 = and:int(var_0_184:int, ldc:int(1519997330))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_16F = expr_C1:int
                var_3_174 = newarray:byte[](byte.class, expr_C1:int)
                var_5_175 = expr_C1:int
                goto(Label_0625)
            }
        }
        
        Label_0198:
        
        if (cmpeq:boolean(and:int(var_0_184:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_184:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_184:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_184 = and:int(var_0_184:int, ldc:int(-746402165))
            var_2_E2 = stack_E2_0:byte[]
            expr_E6 = add:int(arraylength:int(stack_E4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_2CB = newarray:byte[](byte.class, expr_E6:int)
                var_5_2CC = expr_E6:int
                
                loop {
                    var_0_184 = and:int(var_0_184:int, ldc:int(-691462230))
                    var_5_2CC = add:int(var_5_2CC:int, ldc:int(-1))
                    storeelement:byte(var_3_2CB:byte[], var_5_2CC:int, add:int(shl:int(loadelement:byte(stack_2DD_0:byte[], var_5_2CC:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_E2:byte[], add:int(var_5_2CC:int, xor:int(ldc:int(8256), ldc:int(8257)))), ldc:int(5)), and:int(ldc:int(24847), ldc:int(39)))))
                    
                    if (cmpne:boolean(var_5_2CC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_BF_0 = stack_C1_0 = stack_E2_0 = stack_E4_0 = stack_10E_0 = stack_19E_0 = stack_203_0 = stack_2A2_0 = stack_2DD_0 = var_3_2CB:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(1)), ldc:int(0))) {
            var_0_184 = and:int(var_0_184:int, ldc:int(1348050422))
            goto(Label_0147)
        }
        
        if (cmpne:boolean(and:int(var_0_184:int, ldc:int(128)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_168_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16530), ldc:int(1290)))
            expr_12C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9231), ldc:int(2194)))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(18945), ldc:int(18944)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(5509), ldc:int(-15750)), xor:int(ldc:int(1184), ldc:int(1213))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(-19981), ldc:int(19980)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(17434), ldc:int(17415)), xor:int(ldc:int(-24567), ldc:int(-24531))))
            putstatic:String[](\u7049\u9a18\u647c\u4c04\ua068::\u516c\u6d99\u8c8a\u3bc9\u4f4a\u183a, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u8c8a\u8bb0\ua61f\uf9c5\ucb79\u965f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-1182878226), ldc:int(467609327))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\u9a18\u647c\u4c04\ua068<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-36736913))
            var_5_81 = and:int(ldc:int(-6759), ldc:int(2630))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16989), ldc:int(-17118)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_684:int, ldc:int(971924350))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(5), ldc:int(16657)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(520), ldc:int(521)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_DA:int, ldc:int(-1647585553))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(5132), ldc:int(5133)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1866206126))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1751955055))
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1174731266))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0889)
                        }
                    }
                    
                    Label_0392:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(821685435))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-165644669))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1808335111))
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(862713391))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1496847969))
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1879384421))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1010751028))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-76660994))
                        var_11_EB = and:int(ldc:int(11648), ldc:int(-28545))
                        goto(Label_1547)
                    }
                    
                    Label_0583:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1783360174))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1581005878))
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1138551122))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1065403366))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1581380343))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-176374139))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1109736081))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0889)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(19799847))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1528457061))
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1111698405))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(113957355))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2081554072))
                        goto(Label_1014)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(967727761))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1457082986))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-389180984))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1143234562))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(369585800))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-498991226))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1571557292))
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-395555538))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-639910161))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-31724), ldc:int(-31723))
                                goto(Label_1165)
                            }
                        }
                    }
                    
                    Label_1014:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1040256109))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(884492397))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-319801042))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1182867729))
                        var_11_EB = and:int(ldc:int(5472), ldc:int(-5474))
                    }
                    
                    Label_1165:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2100621596))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-50576918))
                        goto(Label_1421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1856207685))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1014)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1806824360))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1602420903))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1174669570))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1421)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-677305705))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-614948402))
                            goto(Label_1165)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1014)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1155805473))
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0392)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-579131137))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1547)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1421:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1225545529))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-452852249))
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(210200347))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-614595458))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-21314602))
                        goto(Label_1014)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(180817409))
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1290626875))
                        goto(Label_0392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1621378945))
                        var_17_68F = add:int(var_16_119:int, xor:int(ldc:int(40), ldc:int(41)))
                        looporswitchbreak()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(2012205464))
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(2136971631))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, and:int(ldc:int(2181), ldc:int(16715))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(490716061))
            goto(Label_0108)
        }
    }
}
