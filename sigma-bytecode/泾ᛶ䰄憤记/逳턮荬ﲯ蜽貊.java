public abstract class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u9033\ud12e\u836c\ufcaf\u873d\u8c8a {
    public void \u9033\ud12e\u836c\ufcaf\u873d\u8c8a(com.mojang.datafixers.Typed<?> p0, com.mojang.datafixers.schemas.Schema p1) {
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
    
    public void \u385b\u9033\u3e2a\u34df\u516c\ufe34(com.mojang.serialization.Dynamic<?> p0) {
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
            var_2_5F = and:int(ldc:int(1323563528), ldc:int(-956564197))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u40a9\u7330\uafe7\u5654\u59ec\u8413, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2129915665))
                putfield:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u64f2\u3a62\u5245\u7c6b\ua068\ub1b9, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a, initobject:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::<init>, invokestatic:int(Math::max, xor:int(ldc:int(144), ldc:int(148)), invokestatic:int(DataFixUtils::ceillog2, invokeinterface:int(List<E>::size, getfield:List<Dynamic<?>>(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\ub7dc\u6435\u3504\u12cb\ucef1\ud158, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a)))), xor:int(ldc:int(19332), ldc:int(23428)), invokeinterface:long[](LongStream::toArray, invokevirtual:LongStream(OptionalDynamic::asLongStream, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, ldc:String("BlockStates"))))))
            }
            else {
                putfield:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u64f2\u3a62\u5245\u7c6b\ua068\ub1b9, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a, aconstnull:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8())
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \u3bd6\u3bd6\u4c04\u9033\u93a2\ua61f(com.mojang.datafixers.Typed<?> p0) {
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
    
    public boolean \u8640\u8bb0\u120d\u9033\uafe7\u59ec() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-2147229422), ldc:int(1142806817))
            
            if (cmpne:boolean(getfield:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u64f2\u3a62\u5245\u7c6b\ua068\ub1b9, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a), aconstnull:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8())) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-996429870))
                stack_8A_0 = and:int(ldc:int(-5606), ldc:int(5541))
            }
            else {
                stack_8A_0 = and:int(ldc:int(18497), ldc:int(169))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u36d3\u6d99\ud217\uc2bd\ub32d\u76bc(int p0) {
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
            return:int(invokevirtual:int(\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u5db4\u9033\ub8be\u183a\ub171\u5f50, getfield:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u64f2\u3a62\u5245\u7c6b\ua068\ub1b9, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a), p0:int))
        }
        
        goto(Label_0006)
    }
    
    public int \u759a\u12b2\u647c\ub6ab\u72f1\u494c(java.lang.String p0, boolean p1, int p2) {
        var_4_63 : int
        stack_9D_0 : int [generated]
        stack_9D_1 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-1088784308), ldc:int(-335581827))
            stack_9D_0 = shl:int(invokevirtual:int(Integer::intValue, invokeinterface:Integer(Object2IntMap::get, invokestatic:Object2IntMap(\u8258\u4f4a\u120d\u7330\u8bb0\u4c04::\u5f50\u71f1\uceb8\uc87f\u3504\u3dd3), p0:String[expected:Object])), and:int(ldc:int(8229), ldc:int(17157)))
            
            if (logicalnot:boolean(p1:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-100942897))
                stack_9D_1 = and:int(ldc:int(-6269), ldc:int(6268))
            }
            else {
                stack_9D_1 = ldc:int(16)
            }
            
            return:int(or:int(or:int(stack_9D_0:int, stack_9D_1:int), p2:int))
        }
        
        goto(Label_0006)
    }
    
    public int \u9255\ub171\u9a18\ucb79\u7330\u88c5() {
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
            return:int(getfield:int(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\ud158\u6435\u527a\u5245\u4daf\u647c, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u40a9\u7330\uafe7\u5654\u59ec\u8413();
    
    private static com.mojang.datafixers.util.Pair lambda$\u7af6\uc2bd\u965f\u3bc9\u446c\uae5d$2(com.mojang.serialization.Dynamic p0) {
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
            return:Pair(invokestatic:Pair(Pair::of, invokeinterface:String[expected:Object](DSL$TypeReference::typeName, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ub102\u120d\u7d52\u7006\uc2bd\u8d90)), p0:Dynamic[expected:Object]))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic lambda$\u8bb0\u965f\u6d69\u3e75\u7873\u7e3f$1(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, ldc:String("BlockStates"), invokevirtual:Dynamic(Dynamic::createLongList, p0:Dynamic, invokestatic:LongStream(Arrays::stream, invokevirtual:long[](\u718f\u7e3f\uc238\u5f50\u183a\uc2e8::\u97e6\u446c\ub8be\u51fa\u4daf\u12cb, getfield:\u718f\u7e3f\uc238\u5f50\u183a\uc2e8(\u9033\ud12e\u836c\ufcaf\u873d\u8c8a::\u64f2\u3a62\u5245\u7c6b\ua068\ub1b9, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u8cae\u8308\ud523\ua068\u3d64\u8c8a$0(java.util.List p0) {
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
            return:List(checkcast:List<Object>(java.util.List<java.lang.Object>.class, invokeinterface:List<Object>(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, p0:List<Object>[expected:Collection<Object>]), invokedynamic:Function<? super Object, Object>(apply:()Ljava/util/function/Function;)), invokestatic:Collector<? super Object, ?, List<? super Object>>(Collectors::toList))))
        }
        
        goto(Label_0006)
    }
    
    public void \u40a9\u4daf\u0c95\u8413\ud7e8\u760c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_672 = and:int(ldc:int(184349637), ldc:int(1156574189))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\ud12e\u836c\ufcaf\u873d\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(842975358))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1442844927))
            var_5_8A = and:int(ldc:int(8676), ldc:int(-9205))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4962), ldc:int(-7011)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(1441787879))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(4152), ldc:int(4153)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4369), ldc:int(8195)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(1191115629))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(10258), ldc:int(10259)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1938874213))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1595721430))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-181153183))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-42144773))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1472750823))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1361586204))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1515634911))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1648918601))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(825572931))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1694294973))
                            var_11_EB = and:int(ldc:int(7458), ldc:int(-7971))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1836871183))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-149495179))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(136820106))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(658383917))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1284075557))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2010164950))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-814811305))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1845191932))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1239756861))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1141906625))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(873172185))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(355134335))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1109119027))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(564207595))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1060906177))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1445823336))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1073604469))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(16409), ldc:int(9153))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1393293422))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1331241278))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2129393313))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1577200830))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(324982431))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1602426083))
                        var_11_EB = and:int(ldc:int(-8679), ldc:int(8614))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(234721014))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1111424939))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1989153811))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-978061300))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-969684213))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1273792938))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-486540335))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(860210655))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1852497253))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1176668718))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1750640468))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-2089818335))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1428093024))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-319909900))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1800869744))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1520963503))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(116257609))
                        var_17_67D = add:int(var_16_119:int, xor:int(ldc:int(260), ldc:int(261)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-715424070))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-496043245))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, and:int(ldc:int(387), ldc:int(29185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
