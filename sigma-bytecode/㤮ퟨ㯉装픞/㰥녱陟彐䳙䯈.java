public final class \u392e\ud7e8\u3bc9\u88c5\ud51e.\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8 {
    public void \u3c25\ub171\u965f\u5f50\u4cd9\u4bc8(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private com.mojang.serialization.Dynamic<?> \uc910\ubefe\u965f\u47c2\u759a\ub70c(int p0) {
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
            return:Dynamic<?>(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokeinterface:Object[expected:Dynamic](Int2ObjectMap::get, getfield:Int2ObjectMap<Dynamic<?>>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\ucb79\ub171\u8753\u6b5f\u47c2\u7049, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<?> \u156b\u494c\u52d3\uf94d\u4975\u1187(int p0) {
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
            return:Dynamic<?>(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokeinterface:Object[expected:Dynamic](Int2ObjectMap::remove, getfield:Int2ObjectMap<Dynamic<?>>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\ucb79\ub171\u8753\u6b5f\u47c2\u7049, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    public static int \ub32d\u67d0\ub113\u7873\u527a\u946b(int p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975 p1) {
        var_2_24F : int
        var_4_9C : int
        stack_11C_0 : int [generated]
        var_5_12D : int
        stack_1CC_0 : int [generated]
        var_6_1E5 : int
        stack_272_0 : int [generated]
        
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
        var_2_24F = and:int(and:int(ldc:int(-251616413), ldc:int(2037235771)), ldc:int(1026990123))
        
        switch (loadelement:int(getstatic:int[](\u624e\ua3b4\u97b7\u3a62\u4bc8\uc87f::\uff55\u9a18\ub6ab\u6198\uc87f\ubff1), invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u0b8e\u983f\u51b2\u93a2\u40a9\u9af2[expected:Enum<\u0b8e\u983f\u51b2\u93a2\u40a9\u9af2>](\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975::\u12b2\u4c04\u59ec\u67e9\ub102\u7873, p1:\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975)))) {
            case 1:
                var_4_9C = add:int(and:int(p0:int, ldc:int(15)), invokevirtual:int(\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7::\u8753\u16f6\uff55\u59ec\u6d99\u3776, invokevirtual:\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7(\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975::\u5d20\u3bc9\u624e\u1187\u7873\ubded, p1:\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0232)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1269316681))
                        
                        if (cmplt:boolean(var_4_9C:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0185:
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(4)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-542644743))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_2_24F = and:int(var_2_24F:int, ldc:int(481962920))
                            loopcontinue()
                        }
                        
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1213414745))
                        
                        if (cmpgt:boolean(var_4_9C:int, ldc:int(15))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0232:
                    
                    if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0185)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(1)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(2016711207))
                        stack_11C_0 = or:int(and:int(p0:int, ldc:int(-16)), var_4_9C:int)
                        return:int(stack_11C_0:int)
                    }
                    
                    var_2_24F = and:int(var_2_24F:int, ldc:int(-117529219))
                }
                
                stack_11C_0 = ldc:int(-1)
                return:int(stack_11C_0:int)
            
            case 2:
                var_5_12D = add:int(shr:int(p0:int, ldc:int(8)), invokevirtual:int(\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7::\u8753\u16f6\uff55\u59ec\u6d99\u3776, invokevirtual:\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7(\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975::\u5d20\u3bc9\u624e\u1187\u7873\ubded, p1:\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(696251335))
                    }
                    else {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(935051899))
                        
                        if (cmplt:boolean(var_5_12D:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0339:
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(1107895295))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(16384)), ldc:int(0))) {
                            var_2_24F = and:int(var_2_24F:int, ldc:int(979080547))
                            loopcontinue()
                        }
                        
                        var_2_24F = and:int(var_2_24F:int, ldc:int(1003746339))
                        
                        if (cmpgt:boolean(var_5_12D:int, and:int(ldc:int(22783), ldc:int(9983)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1434203446))
                        goto(Label_0339)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1166826625))
                        stack_1CC_0 = or:int(and:int(p0:int, and:int(ldc:int(255), ldc:int(30719))), shl:int(var_5_12D:int, ldc:int(8)))
                        return:int(stack_1CC_0:int)
                    }
                    
                    var_2_24F = and:int(var_2_24F:int, ldc:int(76356214))
                }
                
                stack_1CC_0 = ldc:int(-1)
                return:int(stack_1CC_0:int)
            
            case 3:
                var_6_1E5 = add:int(and:int(shr:int(p0:int, xor:int(ldc:int(1665), ldc:int(1669))), ldc:int(15)), invokevirtual:int(\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7::\u8753\u16f6\uff55\u59ec\u6d99\u3776, invokevirtual:\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7(\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975::\u5d20\u3bc9\u624e\u1187\u7873\ubded, p1:\u71ae\ub83f\u61a4\u4f4a\uae5d\u4975)))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(969913230))
                        goto(Label_0570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1944823330))
                    }
                    else {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1302345501))
                        
                        if (cmplt:boolean(var_6_1E5:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0532:
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(32)), ldc:int(0))) {
                            var_2_24F = and:int(var_2_24F:int, ldc:int(1027225731))
                            loopcontinue()
                        }
                        
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1230773529))
                        
                        if (cmpgt:boolean(var_6_1E5:int, ldc:int(15))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0570:
                    
                    if (cmpeq:boolean(and:int(var_2_24F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0532)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_24F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_24F = and:int(var_2_24F:int, ldc:int(-1255887053))
                        stack_272_0 = or:int(and:int(p0:int, xor:int(ldc:int(2901), ldc:int(-2982))), shl:int(var_6_1E5:int, and:int(ldc:int(4), ldc:int(17412))))
                        return:int(stack_272_0:int)
                    }
                }
                
                stack_272_0 = ldc:int(-1)
                return:int(stack_272_0:int)
            
            default:
                return:int(ldc:int(-1))
        }
    }
    
    private void \u392e\uc229\uc84e\u8753\u7006\uc31c(int p0, com.mojang.serialization.Dynamic<?> p1) {
        var_5_84 : \uafe7\u3711\u4ab3\u8df4\u120d\u7d52
        
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
            
            if (cmpge:boolean(p0:int, ldc:int(0))) {
                if (cmple:boolean(p0:int, ldc:int(65535))) {
                    var_5_84 = invokespecial:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u12cb\u6bb9\ub8be\u8d98\u3e2a\uc7fe, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8, p0:int)
                    
                    if (cmpne:boolean(var_5_84:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, aconstnull:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52())) {
                        invokevirtual:void(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u8df4\ud171\u51fa\u3776\u647c\ub83f, var_5_84:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, and:int(p0:int, xor:int(ldc:int(8727), ldc:int(11752))), p1:Dynamic<?>)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\uafe7\u3711\u4ab3\u8df4\u120d\u7d52 \u12cb\u6bb9\ub8be\u8d98\u3e2a\uc7fe(int p0) {
        var_4_66 : int
        
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
            var_4_66 = shr:int(p0:int, ldc:int(12))
            return:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(ternaryop:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(cmpge:boolean(var_4_66:int, arraylength:int(getfield:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u6cfe\u7006\uf94d\u8cae\u6c56\uc238, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8))), aconstnull:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(), loadelement:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(getfield:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u6cfe\u7006\uf94d\u8cae\u6c56\uc238, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8), var_4_66:int)))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Dynamic<?> \u9af2\ub1b9\u4c2b\u385b\u8bb0\u7d52(int p0) {
        var_2_61 : int
        var_4_87 : \uafe7\u3711\u4ab3\u8df4\u120d\u7d52
        stack_B2_0 : Dynamic [generated]
        
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
        var_2_61 = and:int(ldc:int(1871412093), ldc:int(1054768959))
        
        if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmple:boolean(p0:int, ldc:int(65535)))) {
            var_4_87 = invokespecial:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u12cb\u6bb9\ub8be\u8d98\u3e2a\uc7fe, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8, p0:int)
            
            if (cmpne:boolean(var_4_87:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, aconstnull:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1096487236))
                stack_B2_0 = invokevirtual:Dynamic<?>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u59ec\u8258\u8413\u8cae\uc4d2\u6bb9, var_4_87:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, and:int(p0:int, xor:int(ldc:int(1620), ldc:int(2475))))
            }
            else {
                stack_B2_0 = invokestatic:Dynamic(\u960f\u7049\u5654\u8308\u494c\u4cd9::\u3a62\ud36e\u6b5f\u8350\ubff1\u67d0)
            }
            
            return:Dynamic<?>(stack_B2_0:Dynamic)
        }
        
        return:Dynamic<?>(invokestatic:Dynamic(\u960f\u7049\u5654\u8308\u494c\u4cd9::\u3a62\ud36e\u6b5f\u8350\ubff1\u67d0))
    }
    
    public com.mojang.serialization.Dynamic<?> \ud171\u74b1\u64f2\u51b2\uc246\ua6bd() {
        var_1_80 : int
        var_3_66 : Dynamic
        var_1_D0 : int
        var_4_D5 : Dynamic
        var_5_DA : ArrayList
        var_6_E0 : \uafe7\u3711\u4ab3\u8df4\u120d\u7d52[]
        var_7_E5 : int
        var_8_EE : int
        var_9_16E : \uafe7\u3711\u4ab3\u8df4\u120d\u7d52
        var_6_107 : Dynamic
        var_6_137 : Dynamic
        
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
        var_1_80 = and:int(ldc:int(-656047058), ldc:int(1584293986))
        var_3_66 = getfield:Dynamic<?>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u5654\u5db4\u6b0d\uc7fe\u6b0d\uf995, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)
        
        if (invokeinterface:boolean(Int2ObjectMap::isEmpty, getfield:Int2ObjectMap<Dynamic<?>>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\ucb79\ub171\u8753\u6b5f\u47c2\u7049, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8))) {
            var_3_66 = invokevirtual:Dynamic(Dynamic::remove, var_3_66:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(-32670), ldc:int(-32672))))
            goto(Label_0186)
        }
        
        Label_0115:
        
        if (cmpne:boolean(and:int(var_1_80:int, ldc:int(4194304)), ldc:int(0))) {
            var_1_80 = and:int(var_1_80:int, ldc:int(1568499369))
            var_3_66 = invokevirtual:Dynamic(Dynamic::set, var_3_66:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(137), ldc:int(139))), invokevirtual:Dynamic(Dynamic::createList, var_3_66:Dynamic, invokeinterface:Stream(ObjectCollection::stream, invokeinterface:ObjectCollection(Int2ObjectMap::values, getfield:Int2ObjectMap<Dynamic<?>>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\ucb79\ub171\u8753\u6b5f\u47c2\u7049, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)))))
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_1_80:int, ldc:int(16384)), ldc:int(0))) {
            var_1_80 = and:int(var_1_80:int, ldc:int(-1749521003))
            goto(Label_0115)
        }
        
        var_1_D0 = and:int(var_1_80:int, ldc:int(2079665013))
        var_4_D5 = invokevirtual:Dynamic(Dynamic::emptyMap, var_3_66:Dynamic)
        var_5_DA = invokestatic:ArrayList(Lists::newArrayList)
        var_6_E0 = getfield:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u6cfe\u7006\uf94d\u8cae\u6c56\uc238, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)
        var_7_E5 = arraylength:int(var_6_E0:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[])
        var_8_EE = and:int(ldc:int(-32311), ldc:int(20022))
        
        loop {
            var_1_D0 = and:int(var_1_D0:int, ldc:int(-109669313))
            
            if (cmpge:boolean(var_8_EE:int, var_7_E5:int)) {
                looporswitchbreak()
            }
            
            var_9_16E = loadelement:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(var_6_E0:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[], var_8_EE:int)
            
            if (cmpne:boolean(var_9_16E:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, aconstnull:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52())) {
                invokeinterface:boolean(List<Dynamic<?>>::add, var_5_DA:ArrayList<Dynamic<?>>[expected:List<Dynamic<?>>], invokevirtual:Dynamic<?>(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\ub18d\u416d\u6c52\u5654\u9033\u6fb0, var_9_16E:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52))
                var_4_D5 = invokevirtual:Dynamic(Dynamic::set, var_4_D5:Dynamic, invokestatic:String(String::valueOf, getfield:int(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u624e\u36d3\uceb8\uc910\ud51e\u516c, var_9_16E:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)), invokevirtual:Dynamic(Dynamic::createIntList, var_4_D5:Dynamic, invokestatic:IntStream(Arrays::stream, invokeinterface:int[](IntList::toIntArray, invokestatic:IntList(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u8413\u7bad\u960f\u8709\u3e75\u8df4, var_9_16E:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)))))
            }
            
            inc:int(var_8_EE, ldc:int(1))
        }
        
        var_6_107 = invokevirtual:Dynamic(Dynamic::emptyMap, var_3_66:Dynamic)
        var_6_137 = invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::set, var_6_107:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), and:int(ldc:int(16429), ldc:int(125))), invokevirtual:Dynamic(Dynamic::createByte, var_6_107:Dynamic, i2b:byte(getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u600f\u6198\u7ce1\u52d3\u9255\u16f6, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)))), loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(4258), ldc:int(4236))), var_4_D5:Dynamic)
        return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::set, var_3_66:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(1579), ldc:int(1540))), var_6_137:Dynamic), loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(2342), ldc:int(2338))), invokevirtual:Dynamic(Dynamic::createList, var_6_137:Dynamic, invokeinterface:Stream<Object>(Collection<Object>::stream, var_5_DA:ArrayList<Object>[expected:Collection<Object>]))))
    }
    
    private void lambda$\u5654\u71f1\uc29a\u3d4b\ub19c\u6b5f$3(java.util.stream.Stream p0) {
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
    
    private void lambda$\u416d\u527a\u4492\u56bd\u8cae\u51fa$2(com.mojang.serialization.Dynamic p0) {
        var_4_6A : \uafe7\u3711\u4ab3\u8df4\u120d\u7d52
        
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
            var_4_6A = initobject:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::<init>, p0:Dynamic)
            putfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u600f\u6198\u7ce1\u52d3\u9255\u16f6, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8, invokevirtual:int(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u5d20\u760c\ua3b4\uae87\uc2bd\u7af6, var_4_6A:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52, getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u600f\u6198\u7ce1\u52d3\u9255\u16f6, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)))
            storeelement:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52(getfield:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u6cfe\u7006\uf94d\u8cae\u6c56\uc238, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8), getfield:int(\uafe7\u3711\u4ab3\u8df4\u120d\u7d52::\u624e\u36d3\uceb8\uc910\ud51e\u516c, var_4_6A:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52), var_4_6A:\uafe7\u3711\u4ab3\u8df4\u120d\u7d52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4bc8\u494c\u0c95\u97b7\ub6ab\u3711$1(java.util.stream.Stream p0) {
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
    
    private void lambda$\u6cfe\u1187\u9033\u97b7\u93a2\u6c52$0(com.mojang.serialization.Dynamic p0) {
        var_4_83 : int
        var_5_9E : int
        var_6_C1 : int
        
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
            var_4_83 = and:int(sub:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), and:int(ldc:int(8946), ldc:int(4144)))), and:int(ldc:int(-8804), ldc:int(8803))), getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u64ab\u8640\ub70c\u8258\u3504\u8709, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)), ldc:int(15))
            var_5_9E = invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(10257), ldc:int(10272)))), and:int(ldc:int(-17217), ldc:int(17216)))
            var_6_C1 = and:int(sub:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), and:int(ldc:int(12403), ldc:int(17598)))), and:int(ldc:int(9041), ldc:int(-27474))), getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u3a62\ubded\u8d98\ufe34\u92ee\u62da, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)), ldc:int(15))
            
            if (cmpne:boolean(invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<Dynamic<?>>(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\ucb79\ub171\u8753\u6b5f\u47c2\u7049, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8), or:int(or:int(shl:int(var_5_9E:int, ldc:int(8)), shl:int(var_6_C1:int, xor:int(ldc:int(16470), ldc:int(16466)))), var_4_83:int), p0:Dynamic[expected:Object]), aconstnull:Object())) {
                invokeinterface:void(Logger::warn, invokestatic:Logger(\u960f\u7049\u5654\u8308\u494c\u4cd9::\uc3e3\u8aa5\u5fe1\u6c56\ud4fe\u4c2b), loadelement:String(getstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330), xor:int(ldc:int(-24404), ldc:int(-24417))), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u64ab\u8640\ub70c\u8258\u3504\u8709, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u3a62\ubded\u8d98\ufe34\u92ee\u62da, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8)), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_83:int), invokestatic:Integer[expected:Object](Integer::valueOf, var_5_9E:int), invokestatic:Integer(Integer::valueOf, var_6_C1:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_6E9 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_70D_0 : byte[] [generated]
        stack_761_0 : byte[] [generated]
        stack_7D0_0 : byte[] [generated]
        stack_827_0 : byte[] [generated]
        var_4_6D4 : int
        var_3_6D9 : byte[]
        var_5_6DA : int
        expr_70D : byte [generated]
        var_0_81D : int
        expr_827 : byte [generated]
        stack_857_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_74F : byte[]
        var_5_750 : int
        expr_D9 : int [generated]
        expr_109 : int [generated]
        var_3_139 : String
        stack_6CD_0 : String[] [generated]
        expr_14B : String[] [generated]
        
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
        var_0_6E9 = and:int(ldc:int(596401328), ldc:int(1064664944))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_70D_0 = stack_761_0 = stack_7D0_0 = stack_827_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("EsmISDwKX024RZ6NuUR6x1yLBQg8ulxZRk4OaHBTxcXJ/Q1OidhEis9Pz49FqIJeikrPvk4fCsXOiaWyk7TJnsXID0mJznj6DVHGMW3Q1XZt0NV2MYpFxs7JjrWASYZ/QgkxgE2FxQjOSLhADEWO9QKPAUn/g0q2soCIh75HW83OiYlNC41OBQkPDbiBno25wg5IhcrIjE5LiQiMTsrLz47FzL1BCkP+BdnNjn0GCoIOzcvIzsTJzcxOi8oOjw8IBU/MjggFf07YTYhIjsgIDs9IiQ/FCM7KDM6Lz0mOTEoOjPS0Us11y95PSY5MSg6M9ITNw8VE/AIPigROzg5PyIjOSY5MSg6M9ISdzQrKzkxJjkxKDoz0hNyPD0k1gs1KSs+OCw5JjkxKDoz0hI/DCAjMj0kIikvOzkmOTEoOjPSEn82Jj8+KCEmOTEoOjPSEX8k8gkuIS4iPjkmOTEoOjPSEjsLJSwvJjUmOTEoOjPSEnkyMysoNDk5JjkxKDoz0hB5MSTyCTgRFzA9JSY5MSg6M9ITZjI5LDg1JjkxKDoz0hNmMjkuNTAlKiE+Lz0mOTEoOjPSE2c7OTQ5LygzOi89JjkxKDoz0hInDj8rMzsQPSQXOjggMzg6MBUqMTM4LigwOyswJxA7OywzOiQ1KygkNiYvOSAgJiYnOTAnEOIfPwAvLeQRM4OT1")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_6D4 = expr_6E:int
        var_3_6D9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_6DA = expr_6E:int
        Label_1756:
        
        while (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(2048)), ldc:int(0))) {
                var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1369558821))
                goto(Label_1960)
            }
            
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-8397762))
            var_5_6DA = add:int(var_5_6DA:int, ldc:int(-1))
            expr_70D = loadelement:byte(stack_70D_0:byte[], var_5_6DA:int)
            storeelement:byte(var_3_6D9:byte[], var_5_6DA:int, xor:int(or:int(and:int(shl:int(expr_70D:byte, xor:int(ldc:int(-16256), ldc:int(-16252))), ldc:int(-16)), and:int(shr:int(expr_70D:byte[expected:int], and:int(ldc:int(276), ldc:int(4172))), ldc:int(15))), ldc:int(35)))
            
            if (cmpne:boolean(var_5_6DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_70D_0 = stack_761_0 = stack_7D0_0 = stack_827_0 = var_3_6D9:byte[]
            goto(Label_0115)
        }
        
        var_0_6E9 = and:int(var_0_6E9:int, ldc:int(123384200))
        goto(Label_2047)
        Label_1960:
        
        while (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(4096)), ldc:int(0))) {
                var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1119778755))
                goto(Label_1756)
            }
            
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-142681796))
            var_5_6DA = add:int(var_5_6DA:int, ldc:int(-1))
            storeelement:byte(var_3_6D9:byte[], var_5_6DA:int, add:byte(loadelement:byte(stack_7D0_0:byte[], var_5_6DA:int), ldc:byte(18)))
            
            if (cmpne:boolean(var_5_6DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_70D_0 = stack_761_0 = stack_7D0_0 = stack_827_0 = var_3_6D9:byte[]
            goto(Label_0222)
        }
        
        Label_2047:
        
        while (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_1756)
            }
            
            var_0_81D = and:int(var_0_6E9:int, ldc:int(-1151894534))
            var_5_6DA = add:int(var_5_6DA:int, ldc:int(-1))
            expr_827 = loadelement:byte(stack_827_0:byte[], var_5_6DA:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_6DA:int, ldc:int(2)), neg:int(var_4_6D4:int)), ldc:int(0))) {
                var_0_81D = and:int(var_0_81D:int, ldc:int(1931312945))
                stack_857_2 = add:byte(expr_827:byte, ldc:byte(2))
            }
            else {
                stack_857_2 = add:byte(expr_827:byte, loadelement:byte(var_3_6D9:byte[], add:int(var_5_6DA:int, ldc:int(2))))
            }
            
            var_0_6E9 = and:int(var_0_81D:int, ldc:int(-409175242))
            storeelement:byte(var_3_6D9:byte[], var_5_6DA:int, stack_857_2:byte)
            
            if (cmpne:boolean(var_5_6DA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_70D_0 = stack_761_0 = stack_7D0_0 = stack_827_0 = var_3_6D9:byte[]
            goto(Label_0270)
        }
        
        var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1503283269))
        goto(Label_1960)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(8192)), ldc:int(0))) {
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-735693632))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-767340541))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(661028536))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_74F = newarray:byte[](byte.class, expr_A9:int)
                var_5_750 = expr_A9:int
                
                loop {
                    var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1665531130))
                    var_5_750 = add:int(var_5_750:int, ldc:int(-1))
                    storeelement:byte(var_3_74F:byte[], var_5_750:int, add:int(shl:int(loadelement:byte(stack_761_0:byte[], var_5_750:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_750:int, and:int(ldc:int(16897), ldc:int(8473)))), ldc:int(2)), xor:int(ldc:int(24623), ldc:int(24592)))))
                    
                    if (cmpne:boolean(var_5_750:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_12D_0 = stack_70D_0 = stack_761_0 = stack_7D0_0 = stack_827_0 = var_3_74F:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(65536)), ldc:int(0))) {
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1135629588))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-1489609601))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_6D4 = expr_D9:int
                var_3_6D9 = newarray:byte[](byte.class, expr_D9:int)
                var_5_6DA = expr_D9:int
                goto(Label_1960)
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_6E9:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_6E9 = and:int(var_0_6E9:int, ldc:int(1786474681))
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_6E9 = and:int(var_0_6E9:int, ldc:int(-284722312))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_4_6D4 = expr_109:int
                var_3_6D9 = newarray:byte[](byte.class, expr_109:int)
                var_5_6DA = expr_109:int
                goto(Label_2047)
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_6E9:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_6CD_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3), ldc:int(55)))
            expr_14B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(96), ldc:int(84)))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-16378), ldc:int(-16358)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(-24320), ldc:int(24206)), and:int(ldc:int(-17421), ldc:int(17420))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(4387), ldc:int(747)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(-3801), ldc:int(3784)), and:int(ldc:int(8302), ldc:int(902))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5995), ldc:int(16426)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16006), ldc:int(270)), and:int(ldc:int(9086), ldc:int(4107))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1298), ldc:int(1295)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(17679), ldc:int(58)), and:int(ldc:int(4254), ldc:int(527))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(8499), ldc:int(1211)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(815), ldc:int(24606)), xor:int(ldc:int(1077), ldc:int(1123))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(10798), ldc:int(4590)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-28637), ldc:int(-28555)), and:int(ldc:int(13661), ldc:int(16479))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(5656), ldc:int(5635)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1105), ldc:int(1036)), xor:int(ldc:int(8796), ldc:int(8765))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-24292), ldc:int(-24258)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(10057), ldc:int(10024)), xor:int(ldc:int(26704), ldc:int(26676))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(9218), ldc:int(9222)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2222), ldc:int(2250)), xor:int(ldc:int(24671), ldc:int(24627))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(16429), ldc:int(381)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16621), ldc:int(4204)), xor:int(ldc:int(-28589), ldc:int(-28638))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(3103), ldc:int(671)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(18933), ldc:int(1649)), xor:int(ldc:int(4302), ldc:int(4276))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-28669), ldc:int(-28671)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(22617), ldc:int(22563)), and:int(ldc:int(1158), ldc:int(14486))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(16575), ldc:int(559)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(399), ldc:int(3286)), xor:int(ldc:int(635), ldc:int(746))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(13317), ldc:int(13353)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8737), ldc:int(8880)), xor:int(ldc:int(313), ldc:int(427))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(17), ldc:int(16464)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16638), ldc:int(3219)), and:int(ldc:int(151), ldc:int(9367))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(13390), ldc:int(12)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-24274), ldc:int(-24135)), and:int(ldc:int(12509), ldc:int(16574))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(259), ldc:int(19591)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(94), ldc:int(194)), and:int(ldc:int(19645), ldc:int(8950))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(177), ldc:int(12641)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16572), ldc:int(4279)), xor:int(ldc:int(4354), ldc:int(4538))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(16910), ldc:int(16899)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(382), ldc:int(454)), xor:int(ldc:int(24594), ldc:int(24748))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-32630), ldc:int(-32612)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(16575), ldc:int(958)), xor:int(ldc:int(13508), ldc:int(13319))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(139), ldc:int(128)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8265), ldc:int(8330)), xor:int(ldc:int(8438), ldc:int(8255))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(19602), ldc:int(4982)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4707), ldc:int(4778)), xor:int(ldc:int(3085), ldc:int(3264))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(4610), ldc:int(4631)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(2269), ldc:int(9165)), xor:int(ldc:int(6395), ldc:int(6185))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(555), ldc:int(575)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(12499), ldc:int(3282)), xor:int(ldc:int(20519), ldc:int(20721))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(285), ldc:int(145)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(8694), ldc:int(4830)), xor:int(ldc:int(24650), ldc:int(24721))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-32664), ldc:int(-32650)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1180), ldc:int(1095)), and:int(ldc:int(18683), ldc:int(4841))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(8217), ldc:int(16666)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(233), ldc:int(19449)), xor:int(ldc:int(559), ldc:int(814))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(16697), ldc:int(8221)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2123), ldc:int(2378)), xor:int(ldc:int(2237), ldc:int(2482))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-32677), ldc:int(-32674)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(431), ldc:int(1807)), and:int(ldc:int(22820), ldc:int(9709))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(191), ldc:int(152)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(6630), ldc:int(17196)), and:int(ldc:int(316), ldc:int(2490))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(8229), ldc:int(167)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(315), ldc:int(6456)), xor:int(ldc:int(-32652), ldc:int(-32461))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(8218), ldc:int(1082)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(343), ldc:int(879)), xor:int(ldc:int(1576), ldc:int(1905))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(7231), ldc:int(25001)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-15194), ldc:int(-14849)), and:int(ldc:int(360), ldc:int(3054))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-24489), ldc:int(-24481)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(1384), ldc:int(6510)), xor:int(ldc:int(1120), ldc:int(1304))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5224), ldc:int(18474)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(215), ldc:int(431)), and:int(ldc:int(22923), ldc:int(1439))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(25639), ldc:int(4694)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(871), ldc:int(748)), xor:int(ldc:int(324), ldc:int(221))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(29697), ldc:int(29702)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(3481), ldc:int(12767)), and:int(ldc:int(5053), ldc:int(18861))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(16436), ldc:int(676)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(1517), ldc:int(8623)), xor:int(ldc:int(16949), ldc:int(17397))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(2178), ldc:int(2212)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(16898), ldc:int(17346)), xor:int(ldc:int(20521), ldc:int(20989))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(-28029), ldc:int(-28023)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(10716), ldc:int(16885)), xor:int(ldc:int(829), ldc:int(741))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(2060), ldc:int(2050)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(1176), ldc:int(1344)), xor:int(ldc:int(8207), ldc:int(8687))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(283), ldc:int(4627)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(18935), ldc:int(12768)), xor:int(ldc:int(-32537), ldc:int(-32509))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(3375), ldc:int(12943)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(428), ldc:int(72)), xor:int(ldc:int(5595), ldc:int(5171))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(5165), ldc:int(8217)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-16343), ldc:int(-15935)), xor:int(ldc:int(-16144), ldc:int(-16097))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(5795), ldc:int(5768)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(7151), ldc:int(1519)), and:int(ldc:int(1023), ldc:int(2551))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1076), ldc:int(1044)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(292), ldc:int(211)), and:int(ldc:int(3067), ldc:int(505))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(69), ldc:int(82)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(20675), ldc:int(20794)), xor:int(ldc:int(1481), ldc:int(1079))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(32185), ldc:int(566)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(1534), ldc:int(16895)), and:int(ldc:int(4607), ldc:int(18943))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(17249), ldc:int(-17250)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-31533), ldc:int(-31444)), and:int(ldc:int(643), ldc:int(515))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(4721), ldc:int(8497)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4429), ldc:int(4942)), and:int(ldc:int(14853), ldc:int(1668))))
            storeelement:String(expr_14B:String[], xor:int(ldc:int(1177), ldc:int(1195)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-31346), ldc:int(-30838)), xor:int(ldc:int(4107), ldc:int(4622))))
            storeelement:String(expr_14B:String[], and:int(ldc:int(305), ldc:int(75)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(8448), ldc:int(8965)), xor:int(ldc:int(-32547), ldc:int(-32044))))
            putstatic:String[](\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8::\u2dcc\u34df\u4f4a\u3bd6\u71ae\u7330, expr_14B:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3e75\uc4d2\u47c2\ua61f\u6198\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_6B1 = and:int(ldc:int(-1485966541), ldc:int(1870658431))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\ub171\u965f\u5f50\u4cd9\u4bc8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1861128025))
        }
        else {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1368523833))
            var_5_8A = and:int(ldc:int(-2115), ldc:int(2114))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6621), ldc:int(2396)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-1241713730))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(21120), ldc:int(21121)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(1028649747))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16423), ldc:int(1793)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1202822813))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2000804402))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(124370015))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1235358881))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1725836453))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(319113507))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1289543252))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1116933230))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-788428491))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-664744499))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1845917119))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(685802522))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1478848343))
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1210254374))
                            var_11_EB = and:int(ldc:int(30820), ldc:int(-31350))
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1299556240))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1166462835))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2116695385))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(102303333))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-667927708))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1960100489))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-269618197))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0756:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1883232688))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1325175307))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(152721378))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1448019436))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1225856311))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-497664564))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-334508190))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1384122466))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0915:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-847272550))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-793747225))
                            goto(Label_0756)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-43059269))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(9), ldc:int(6451))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1710428418))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1937052040))
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1303206046))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(731940902))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-319882457))
                        var_11_EB = and:int(ldc:int(-3701), ldc:int(3684))
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-332468511))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1102271863))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1659683084))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2077388542))
                            goto(Label_1022)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1402014909))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1182)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(871842728))
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0915)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0756)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-90132823))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-509842112))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-226804723))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(902758358))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1580)
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1060092162))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(16558634))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2069323782))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-60451151))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1402080422))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1800238684))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(111917586))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-101525157))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0756)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1166812008))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1342309469))
                        var_17_6BC = add:int(var_16_119:int, xor:int(ldc:int(10432), ldc:int(10433)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(999630644))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-456198214))
                
                if (cmple:boolean(var_5_8A = var_17_6BC:int, sub:int(var_6_91:int, xor:int(ldc:int(19200), ldc:int(19201))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
