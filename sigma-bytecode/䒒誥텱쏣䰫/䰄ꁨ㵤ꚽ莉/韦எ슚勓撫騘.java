public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18 {
    public void \u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18(int p0, int p1, int p2) {
        var_6_87 : int
        
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
        invokespecial:Object(Object::<init>, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18)
        
        if (cmplt:boolean(p0:int, xor:int(ldc:int(10609), ldc:int(10639)))) {
            putfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:int)
            putfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, newarray:LongLinkedOpenHashSet[](it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet.class, p0:int))
            var_6_87 = and:int(ldc:int(20556), ldc:int(-21726))
            
            while (cmplt:boolean(var_6_87:int, p0:int)) {
                storeelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), var_6_87:int, initobject:\u3dd3\u8c8a\u2dcc\u647c\u16f6\u7330[expected:LongLinkedOpenHashSet](\u3dd3\u8c8a\u2dcc\u647c\u16f6\u7330::<init>, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:int, ldc:float(0.5f), p1:int))
                inc:int(var_6_87, ldc:int(1))
            }
            
            invokeinterface:void(Long2ByteMap::defaultReturnValue, putfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, initobject:\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e[expected:Long2ByteMap](\uc238\u6cfe\u97e6\ucb79\ub7dc\uc84e::<init>, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p2:int, ldc:float(0.5f), p2:int)), ldc:byte(-1))
            putfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:int)
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Level count must be < 254.")))
    }
    
    private int \u34df\u62da\ub8be\u3c25\ube23\u47c2(int p0, int p1) {
        var_5_A0 : int
        
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
            
            if (cmpgt:boolean(var_5_A0 = p0:int, p1:int)) {
                var_5_A0 = p1:int
            }
            
            if (cmpgt:boolean(var_5_A0:int, sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), xor:int(ldc:int(3072), ldc:int(3073))))) {
                var_5_A0 = sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), xor:int(ldc:int(596), ldc:int(597)))
            }
            
            return:int(var_5_A0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u7d52\u5f50\u4c04\uc229\uf9c5\u59ec(int p0) {
        var_2_5F : int
        var_4_64 : int
        var_5_75 : int
        var_2_82 : int
        
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
            var_2_5F = and:int(ldc:int(1482565579), ldc:int(1275063259))
            var_4_64 = getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18)
            putfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:int)
            var_5_75 = add:int(var_4_64:int, xor:int(ldc:int(1576), ldc:int(1577)))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_2_82 = and:int(var_2_5F:int, ldc:int(-1616425116))
                }
                else {
                    var_2_82 = and:int(var_2_5F:int, ldc:int(2063463260))
                    
                    if (cmplt:boolean(var_5_75:int, p0:int)) {
                        if (invokevirtual:boolean(LongLinkedOpenHashSet::isEmpty, loadelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), var_5_75:int))) {
                            var_2_5F = and:int(var_2_82:int, ldc:int(-874601560))
                            inc:int(var_5_75, ldc:int(1))
                            loopcontinue()
                        }
                        
                        putfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_75:int)
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_82:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_82:int, ldc:int(1783480933))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\u5fe1\u56bd\u6bb9\ud12e\u3d4b(long p0) {
        var_3_BD : int
        var_5_72 : int
        stack_D8_1 : int [generated]
        
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
            var_3_BD = and:int(ldc:int(467410479), ldc:int(1979219702))
            var_5_72 = and:int(invokeinterface:byte[expected:int](Long2ByteMap::get, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p0:long), and:int(ldc:int(255), ldc:int(31999)))
            
            if (cmpne:boolean(var_5_72:int, xor:int(ldc:int(2051), ldc:int(2300)))) {
                invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u4c2b\ub8be\u0c95\u3bd6\uc229\u494c, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, invokespecial:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u34df\u62da\ub8be\u3c25\ube23\u47c2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long), var_5_72:int), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int[expected:boolean](ldc:int(12419), ldc:int(1)))
                
                if (cmpge:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))) {
                    var_3_BD = and:int(var_3_BD:int, ldc:int(1494758135))
                    stack_D8_1 = and:int[expected:boolean](ldc:int(-11753), ldc:int(11752))
                }
                else {
                    stack_D8_1 = xor:int[expected:boolean](ldc:int(547), ldc:int(546))
                }
                
                var_3_BD = and:int(var_3_BD:int, ldc:int(1843280679))
                putfield:boolean(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u983f\uc9f6\u4daf\uc29a\uc87f\u385b, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, stack_D8_1:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u97e6\u4ab3\u3a62\ud51e\u3e2a\u4c04(java.util.function.LongPredicate p0) {
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
    
    private void \u4c2b\ub8be\u0c95\u3bd6\uc229\u494c(long p0, int p1, int p2, boolean p3) {
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
            
            if (p3:boolean) {
                invokeinterface:byte(Long2ByteMap::remove, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p0:long)
            }
            
            invokevirtual:boolean(LongLinkedOpenHashSet::remove, loadelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p1:int), p0:long)
            
            if (invokevirtual:boolean(LongLinkedOpenHashSet::isEmpty, loadelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p1:int))) {
                if (cmpeq:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p1:int)) {
                    invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7d52\u5f50\u4c04\uc229\uf9c5\u59ec, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p2:int)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5654\uc31c\ub83f\ubff1\u624e\u8cae(long p0, int p1, int p2) {
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
            invokeinterface:byte(Long2ByteMap::put, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p0:long, i2b:byte(p1:int))
            invokevirtual:boolean(LongLinkedOpenHashSet::add, loadelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p2:int), p0:long)
            
            if (cmpgt:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p2:int)) {
                putfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p2:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4(long p0) {
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
            invokevirtual:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, p0:long, sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), xor:int(ldc:int(1056), ldc:int(1057))), and:int[expected:boolean](ldc:int(-11315), ldc:int(9266)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4(long p0, long p1, int p2, boolean p3) {
        var_7_61 : int
        stack_B3_1 : int [generated]
        
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
            var_7_61 = and:int(ldc:int(742046748), ldc:int(401570839))
            invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7043\u88c5\u6cfe\u8753\u8640\ubcb0, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, p1:long, p2:int, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long), and:int(invokeinterface:byte[expected:int](Long2ByteMap::get, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p1:long), xor:int(ldc:int(-32533), ldc:int(-32748))), p3:boolean)
            
            if (cmpge:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))) {
                var_7_61 = and:int(var_7_61:int, ldc:int(348094199))
                stack_B3_1 = and:int[expected:boolean](ldc:int(-23893), ldc:int(23892))
            }
            else {
                stack_B3_1 = xor:int[expected:boolean](ldc:int(72), ldc:int(73))
            }
            
            putfield:boolean(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u983f\uc9f6\u4daf\uc29a\uc87f\u385b, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, stack_B3_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7043\u88c5\u6cfe\u8753\u8640\ubcb0(long p0, long p1, int p2, int p3, int p4, boolean p5) {
        var_9_CC : int
        var_11_D5 : int
        var_9_120 : int
        var_12_140 : int
        var_9_157 : int
        var_13_161 : int
        var_14_185 : int
        
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
        var_9_CC = and:int(ldc:int(531088361), ldc:int(-1633597809))
        
        if (invokevirtual:boolean(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long)) {
            goto(Label_0107)
        }
        
        p2 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, p2:int, and:int(ldc:int(25873), ldc:int(-25874)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(12417), ldc:int(16463))))
        p3 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, p3:int, and:int(ldc:int(16563), ldc:int(-20916)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(513), ldc:int(2389))))
        
        if (cmpne:boolean(p4:int, and:int(ldc:int(20735), ldc:int(9983)))) {
            goto(Label_0191)
        }
        
        var_11_D5 = and:int(ldc:int(43), ldc:int(8321))
        p4 = p3:int
        
        loop {
            Label_0235:
            
            if (cmpeq:boolean(and:int(var_9_CC:int, ldc:int(2147483647)), ldc:int(0))) {
                var_9_120 = and:int(var_9_CC:int, ldc:int(1968401564))
            }
            else {
                var_9_120 = and:int(var_9_CC:int, ldc:int(-1666456889))
                
                if (p5:boolean) {
                    var_12_140 = invokestatic:int(Math::min, p4:int, p2:int)
                    looporswitchbreak()
                }
            }
            
            if (cmpeq:boolean(and:int(var_9_120:int, ldc:int(2048)), ldc:int(0))) {
                var_9_120 = and:int(var_9_120:int, ldc:int(-1829025395))
                var_12_140 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long, p0:long, p2:int), and:int(ldc:int(-20322), ldc:int(1889)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), xor:int(ldc:int(8208), ldc:int(8209))))
                looporswitchbreak()
            }
            
            var_9_CC = and:int(var_9_120:int, ldc:int(472573791))
        }
        
        var_9_157 = and:int(var_9_120:int, ldc:int(464745403))
        var_13_161 = invokespecial:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u34df\u62da\ub8be\u3c25\ube23\u47c2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p3:int, p4:int)
        
        if (cmpeq:boolean(p3:int, var_12_140:int)) {
            var_9_CC = and:int(var_9_157:int, ldc:int(887345287))
            
            if (cmpeq:boolean(var_11_D5:int, ldc:int(0))) {
                invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u4c2b\ub8be\u0c95\u3bd6\uc229\u494c, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long, var_13_161:int, getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int[expected:boolean](ldc:int(13329), ldc:int(3013)))
            }
        }
        else {
            var_14_185 = invokespecial:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u34df\u62da\ub8be\u3c25\ube23\u47c2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p3:int, var_12_140:int)
            
            if (cmpne:boolean(var_13_161:int, var_14_185:int)) {
                if (cmpeq:boolean(var_11_D5:int, ldc:int(0))) {
                    invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u4c2b\ub8be\u0c95\u3bd6\uc229\u494c, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long, var_13_161:int, var_14_185:int, and:int[expected:boolean](ldc:int(-32180), ldc:int(15760)))
                }
            }
            
            var_9_CC = and:int(var_9_157:int, ldc:int(2130532519))
            invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u5654\uc31c\ub83f\ubff1\u624e\u8cae, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long, var_12_140:int, var_14_185:int)
        }
        
        Label_0107:
        
        if (cmpne:boolean(and:int(var_9_CC:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        Label_0191:
        
        if (cmpne:boolean(and:int(var_9_CC:int, ldc:int(16384)), ldc:int(0))) {
            var_9_CC = and:int(var_9_CC:int, ldc:int(951412099))
            var_11_D5 = and:int(ldc:int(7729), ldc:int(-7990))
            goto(Label_0235)
        }
        
        goto(Label_0107)
    }
    
    public final void \u7043\u88c5\u6cfe\u8753\u8640\ubcb0(long p0, long p1, int p2, boolean p3) {
        var_7_19B : int
        var_9_75 : int
        var_10_95 : int
        var_12_FF : int
        var_11_F6 : int
        stack_1BC_5 : int [generated]
        stack_1BC_6 : int [generated]
        
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
        var_7_19B = and:int(ldc:int(-568115221), ldc:int(-1167675671))
        var_9_75 = and:int(invokeinterface:byte[expected:int](Long2ByteMap::get, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), p1:long), xor:int(ldc:int(5257), ldc:int(5238)))
        var_10_95 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u873d\u760c\u156b\ub8be\u3e75\u93a2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, p1:long, p2:int), and:int(ldc:int(-15541), ldc:int(14484)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(21015), ldc:int(2209))))
        
        if (p3:boolean) {
            invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7043\u88c5\u6cfe\u8753\u8640\ubcb0, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, p1:long, var_10_95:int, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long), var_9_75:int, and:int[expected:boolean](ldc:int(13351), ldc:int(65)))
            goto(Label_0345)
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_7_19B:int, ldc:int(1024)), ldc:int(0))) {
            var_7_19B = and:int(var_7_19B:int, ldc:int(673683251))
            goto(Label_0345)
        }
        
        if (cmpeq:boolean(and:int(var_7_19B:int, ldc:int(512)), ldc:int(0))) {
            var_7_19B = and:int(var_7_19B:int, ldc:int(39886661))
        }
        else {
            var_7_19B = and:int(var_7_19B:int, ldc:int(-1158959117))
            
            if (cmpeq:boolean(var_9_75:int, xor:int(ldc:int(4196), ldc:int(4251)))) {
                var_12_FF = and:int(ldc:int(457), ldc:int(22019))
                var_11_F6 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long), and:int(ldc:int(-2609), ldc:int(2608)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(16385), ldc:int(14377))))
                goto(Label_0331)
            }
        }
        
        Label_0211:
        
        if (cmpeq:boolean(and:int(var_7_19B:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0345)
        }
        
        if (cmpeq:boolean(and:int(var_7_19B:int, ldc:int(512)), ldc:int(0))) {
            var_7_19B = and:int(var_7_19B:int, ldc:int(-1859790216))
            goto(Label_0156)
        }
        
        var_7_19B = and:int(var_7_19B:int, ldc:int(-817992007))
        var_11_F6 = var_9_75:int
        var_12_FF = and:int(ldc:int(16910), ldc:int(-16911))
        Label_0331:
        var_7_19B = and:int(var_7_19B:int, ldc:int(-10322279))
        
        if (cmpeq:boolean(var_10_95:int, var_11_F6:int)) {
            stack_1BC_5 = sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(319), ldc:int(5633)))
            
            if (cmpeq:boolean(var_12_FF:int, ldc:int(0))) {
                var_7_19B = and:int(var_7_19B:int, ldc:int(-360742947))
                stack_1BC_6 = invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p1:long)
            }
            else {
                stack_1BC_6 = var_11_F6:int
            }
            
            var_7_19B = and:int(var_7_19B:int, ldc:int(-340607035))
            invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7043\u88c5\u6cfe\u8753\u8640\ubcb0, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, p0:long, p1:long, stack_1BC_5:int, stack_1BC_6:int, var_9_75:int, and:int[expected:boolean](ldc:int(-10983), ldc:int(10976)))
        }
        
        Label_0345:
        
        if (cmpeq:boolean(and:int(var_7_19B:int, ldc:int(134217728)), ldc:int(0))) {
            var_7_19B = and:int(var_7_19B:int, ldc:int(2008209070))
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_7_19B:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0156)
    }
    
    public final boolean \ub8be\u5fe1\ubff1\uc238\u183a\u8d98() {
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
            return:boolean(getfield:boolean(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u983f\uc9f6\u4daf\uc29a\uc87f\u385b, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))
        }
        
        goto(Label_0006)
    }
    
    public final int \u74b1\u6b0d\u927d\u9033\u92ff\u4179(int p0) {
        var_2_7A : int
        var_4_E6 : LongLinkedOpenHashSet
        var_5_ED : long
        var_7_10B : int
        var_8_136 : int
        var_2_A5 : int
        stack_1D0_1 : int [generated]
        
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
        var_2_7A = and:int(ldc:int(1310193658), ldc:int(-1640997))
        
        if (cmplt:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))) {
            loop {
                if (cmpeq:boolean(and:int(var_2_7A:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_7A = and:int(var_2_7A:int, ldc:int(1666316952))
                }
                else {
                    var_2_7A = and:int(var_2_7A:int, ldc:int(1307826174))
                    
                    if (cmplt:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))) {
                        if (cmpgt:boolean(p0:int, ldc:int(0))) {
                            inc:int(p0, ldc:int(-1))
                            var_4_E6 = loadelement:LongLinkedOpenHashSet(getfield:LongLinkedOpenHashSet[](\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7049\ubff1\u965f\u983f\ud4fe\uc229, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))
                            var_5_ED = invokevirtual:long(LongLinkedOpenHashSet::removeFirstLong, var_4_E6:LongLinkedOpenHashSet)
                            var_7_10B = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, invokevirtual:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long), and:int(ldc:int(-2651), ldc:int(2586)), sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(2177), ldc:int(20593))))
                            
                            if (invokevirtual:boolean(LongLinkedOpenHashSet::isEmpty, var_4_E6:LongLinkedOpenHashSet)) {
                                invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u7d52\u5f50\u4c04\uc229\uf9c5\u59ec, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))
                            }
                            
                            if (invokeinterface:boolean(Long2ByteMap::containsKey, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), var_5_ED:long)) {
                                var_8_136 = and:int(invokeinterface:byte[expected:int](Long2ByteMap::remove, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), var_5_ED:long), and:int(ldc:int(767), ldc:int(5375)))
                                
                                if (cmpge:boolean(var_8_136:int, var_7_10B:int)) {
                                    if (cmple:boolean(var_8_136:int, var_7_10B:int)) {
                                        loopcontinue()
                                    }
                                    
                                    invokespecial:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u5654\uc31c\ub83f\ubff1\u624e\u8cae, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long, var_8_136:int, invokespecial:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u34df\u62da\ub8be\u3c25\ube23\u47c2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), xor:int(ldc:int(-30720), ldc:int(-30719))), var_8_136:int))
                                    invokevirtual:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\uae5d\uc9f6\u4c04\u98a4\uc87f\ub70c, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long, sub:int(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), and:int(ldc:int(17), ldc:int(31497))))
                                    invokevirtual:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long, var_7_10B:int, and:int[expected:boolean](ldc:int(-29053), ldc:int(20860)))
                                }
                                else {
                                    invokevirtual:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\uae5d\uc9f6\u4c04\u98a4\uc87f\ub70c, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long, var_8_136:int)
                                    invokevirtual:void(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, var_5_ED:long, var_8_136:int, and:int[expected:boolean](ldc:int(289), ldc:int(1547)))
                                }
                                
                                loopcontinue()
                            }
                            
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7A:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_7A = and:int(var_2_7A:int, ldc:int(823094718))
            }
            
            var_2_A5 = and:int(var_2_7A:int, ldc:int(-325585569))
            
            if (cmpge:boolean(getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u8bb0\u927d\u8cae\u6198\u516c\u839e, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18), getfield:int(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\ub19c\u7006\uc87f\ud217\u9255\u6ec6, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18))) {
                var_2_A5 = and:int(var_2_A5:int, ldc:int(-572530726))
                stack_1D0_1 = and:int[expected:boolean](ldc:int(-10012), ldc:int(9498))
            }
            else {
                stack_1D0_1 = and:int[expected:boolean](ldc:int(7781), ldc:int(8195))
            }
            
            putfield:boolean(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u983f\uc9f6\u4daf\uc29a\uc87f\u385b, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18, stack_1D0_1:boolean)
            return:int(p0:int)
        }
        
        return:int(p0:int)
    }
    
    public int \uf9c5\u1187\u0a06\u34df\u3504\u3bc9() {
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
            return:int(invokeinterface:int(Long2ByteMap::size, getfield:Long2ByteMap(\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18::\u56bd\ubded\ubff1\u392e\u965f\u3d64, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18)))
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u8cae\u4975\ucfaf\ufe34\ud12e\u4d85(long p0);
    
    public abstract int \u927d\u4e72\ua068\u946b\u99f7\u8413(long p0, long p1, int p2);
    
    public abstract void \u071d\u47c2\u624e\u97e6\ufe34\u7d52(long p0, int p1, boolean p2);
    
    public abstract int \u1833\u6d99\ua068\u7006\u8d98\uc4d2(long p0);
    
    public abstract void \uae5d\uc9f6\u4c04\u98a4\uc87f\ub70c(long p0, int p1);
    
    public abstract int \u873d\u760c\u156b\ub8be\u3e75\u93a2(long p0, long p1, int p2);
    
    private static void lambda$\u527a\u9a18\u960f\u8bb0\ube23\u4ab3$0(java.util.function.LongPredicate p0, it.unimi.dsi.fastutil.longs.LongList p1, long p2) {
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
            
            if (invokeinterface:boolean(LongPredicate::test, p0:LongPredicate, p2:long)) {
                invokeinterface:boolean(LongList::add, p1:LongList, p2:long)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\ub171\u527a\u4f52\ubefe\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61F : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_62A : int
        
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
        var_3_61F = and:int(ldc:int(-1631102882), ldc:int(-807412905))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u97e6\u0b8e\uc29a\u52d3\u64ab\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(1873740846))
        }
        else {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-1343275787))
            var_5_89 = and:int(ldc:int(-6036), ldc:int(5523))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3178), ldc:int(3177)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_61F:int, ldc:int(-1225884532))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(6273), ldc:int(9251)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(2080), ldc:int(2081)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_61F = and:int(var_3_E2:int, ldc:int(-18294282))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1321)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-878096079))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-6592105))
                        goto(Label_0554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1613342553))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0554)
                            }
                            
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1321)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-938326051))
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1024655776))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1074388337))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1208787875))
                        var_11_F3 = and:int(ldc:int(23297), ldc:int(-23298))
                        goto(Label_1446)
                    }
                    
                    Label_0554:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1532422039))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-178952851))
                        goto(Label_1321)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(304437439))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(1411420374))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(612469301))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1228269242))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1321)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(344492960))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(894182430))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-822370473))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0793:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(427354063))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1321)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1379832701))
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-689692771))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = and:int(ldc:int(16513), ldc:int(2091))
                                goto(Label_1046)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2103539749))
                        goto(Label_1321)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-780545492))
                        goto(Label_1169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(583456637))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-943480882))
                        var_11_F3 = and:int(ldc:int(-10414), ldc:int(10285))
                    }
                    
                    Label_1046:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-900852782))
                        goto(Label_1321)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-282321165))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1148567008))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-728425110))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1209402529))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1321)
                            }
                        }
                    }
                    
                    Label_1169:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(11691861))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(1940239690))
                            goto(Label_1046)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1325488034))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(745602126))
                            goto(Label_0554)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(-1142466472))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61F = and:int(var_3_61F:int, ldc:int(751384765))
                            loopcontinue()
                        }
                        
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-136447729))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1446)
                    }
                    
                    Label_1321:
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(44040945))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1046)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1308343822))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(291232171))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61F = and:int(var_3_61F:int, ldc:int(-1343906490))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1446:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62A = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1457:
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(2055752506))
                        goto(Label_1321)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-2106344269))
                        goto(Label_1169)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-281582745))
                        goto(Label_1046)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-515919079))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61F = and:int(var_3_61F:int, ldc:int(-1748828724))
                        var_17_62A = add:int(var_16_121:int, and:int(ldc:int(4977), ldc:int(10253)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61F = and:int(var_3_61F:int, ldc:int(-808337746))
                
                if (cmple:boolean(var_5_89 = var_17_62A:int, sub:int(var_6_90:int, and:int(ldc:int(147), ldc:int(769))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_61F:int, ldc:int(32)), ldc:int(0))) {
            var_3_61F = and:int(var_3_61F:int, ldc:int(-1668149893))
            goto(Label_0108)
        }
    }
}
