public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u5d20\u7006\u6ec6\ub113\uc910 {
    public void \u5d20\u7006\u6ec6\ub113\uc910() {
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
            invokespecial:Object(Object::<init>, this:\u5d20\u7006\u6ec6\ub113\uc910)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u34df\uc29a\u4d85\u2dcc\u99f7\u4ab3(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u4ab3\u0c95\u4d85\u983f\u7c6b\u3bd6(int p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p3) {
        var_4_68 : int
        var_6_74 : List<\u93a2\u97b7\u647c\ud36e\u64ab>
        var_4_7B : int
        var_7_84 : int
        var_4_8B : int
        var_8_94 : Iterator<Object>
        var_4_E9 : int
        var_9_C8 : \u93a2\u97b7\u647c\ud36e\u64ab
        var_4_D7 : int
        var_10_15D : int
        var_4_164 : int
        var_11_16B : \u8753\u92ee\ub70c\ua562\ud523
        var_4_1A1 : int
        stack_1C1_0 : int [generated]
        var_4_1BF : int
        var_12_1C1 : int
        var_4_385 : int
        var_13_1D0 : Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>
        var_14_20E : \u93a2\u97b7\u647c\ud36e\u64ab
        stack_3A4_0 : int [generated]
        stack_3A4_1 : int [generated]
        var_4_3A2 : int
        
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
        var_4_68 = and:int(and:int(ldc:int(639310692), ldc:int(-346059830)), ldc:int(1916784586))
        var_6_74 = invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>(\ub171\u47c2\u3bd6\u3776\u59ec::\u156b\u4f4a\u0c95\u8d98\u64f2\uc9f6, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p1:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], invokedynamic:Supplier<\ud158\u8308\u76bc\u0a06\ud36e>(get:()Ljava/util/function/Supplier;))
        var_4_7B = and:int(var_4_68:int, ldc:int(2132782559))
        var_7_84 = and:int(ldc:int(-31697), ldc:int(27088))
        var_4_8B = and:int(var_4_7B:int, ldc:int(-275031738))
        var_8_94 = invokeinterface:Iterator<Object>(Collection<Object>::iterator, var_6_74:Collection<Object>)
        
        loop {
            if (cmpne:boolean(and:int(var_4_8B:int, ldc:int(524288)), ldc:int(0))) {
                var_4_8B = and:int(var_4_8B:int, ldc:int(-1279305657))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_94:Iterator))) {
                    return:int(var_7_84:int)
                }
            }
            
            if (cmpne:boolean(and:int(var_4_8B:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_E9 = and:int(var_4_8B:int, ldc:int(1667230064))
                var_9_C8 = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>::next, var_8_94:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>))
                
                loop {
                    if (cmpeq:boolean(and:int(var_4_E9:int, ldc:int(65536)), ldc:int(0))) {
                        var_4_D7 = and:int(var_4_E9:int, ldc:int(846466368))
                        goto(Label_0286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_E9:int, ldc:int(16777216)), ldc:int(0))) {
                        var_4_E9 = and:int(var_4_E9:int, ldc:int(1713093097))
                        
                        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, var_9_C8:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                            var_10_15D = and:int(ldc:int(-6429), ldc:int(6428))
                            var_4_164 = and:int(var_4_E9:int, ldc:int(2147180003))
                            var_11_16B = checkcast:\u8753\u92ee\ub70c\ua562\ud523(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, var_9_C8:\u8753\u92ee\ub70c\ua562\ud523)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_4_164:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_4_1A1 = and:int(var_4_164:int, ldc:int(1913633812))
                                }
                                else {
                                    var_4_1A1 = and:int(var_4_164:int, ldc:int(-417658519))
                                    
                                    if (cmpge:boolean(p0:int, ldc:int(0))) {
                                        stack_1C1_0 = p0:int
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_4_1A1:int, ldc:int(64)), ldc:int(0))) {
                                    var_4_1A1 = and:int(var_4_1A1:int, ldc:int(-360976681))
                                    stack_1C1_0 = add:int(add:int(invokevirtual:int(AbstractCollection::size, var_11_16B:\u8753\u92ee\ub70c\ua562\ud523[expected:AbstractCollection]), p0:int), xor:int(ldc:int(2696), ldc:int(2697)))
                                    looporswitchbreak()
                                }
                                
                                var_4_164 = and:int(var_4_1A1:int, ldc:int(677585178))
                            }
                            
                            var_4_1BF = and:int(var_4_1A1:int, ldc:int(1041967810))
                            var_12_1C1 = stack_1C1_0:int
                            var_4_385 = and:int(var_4_1BF:int, ldc:int(-67126167))
                            var_13_1D0 = invokeinterface:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>(List<\u93a2\u97b7\u647c\ud36e\u64ab>::iterator, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>)
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_4_385 = and:int(var_4_385:int, ldc:int(782216679))
                                    
                                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_13_1D0:Iterator))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_4_385:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_4_385 = and:int(var_4_385:int, ldc:int(1079158970))
                                }
                                else {
                                    var_4_385 = and:int(var_4_385:int, ldc:int(-77600568))
                                    var_14_20E = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>::next, var_13_1D0:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>))
                                    
                                    try {
                                        loop {
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(1048576)), ldc:int(0))) {
                                                goto(Label_0805)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(134217728)), ldc:int(0))) {
                                                goto(Label_0733)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(1073741824)), ldc:int(0))) {
                                                goto(Label_0646)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(268435456)), ldc:int(0))) {
                                                var_4_385 = and:int(var_4_385:int, ldc:int(-356787593))
                                                
                                                if (logicalnot:boolean(invokevirtual:boolean(\u8753\u92ee\ub70c\ua562\ud523::\ub6ab\u156b\u62da\u7873\u960f\uc3e3, var_11_16B:\u8753\u92ee\ub70c\ua562\ud523, var_12_1C1:int, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(\u93a2\u97b7\u647c\ud36e\u64ab::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, var_14_20E:\u93a2\u97b7\u647c\ud36e\u64ab)))) {
                                                    goto(Label_0805)
                                                }
                                            }
                                            
                                            Label_0584:
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(134217728)), ldc:int(0))) {
                                                goto(Label_0805)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(134217728)), ldc:int(0))) {
                                                var_4_385 = and:int(var_4_385:int, ldc:int(1564606691))
                                                goto(Label_0733)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(2147483647)), ldc:int(0))) {
                                                var_4_385 = and:int(var_4_385:int, ldc:int(-1733323567))
                                            }
                                            else {
                                                if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(1048576)), ldc:int(0))) {
                                                    loopcontinue()
                                                }
                                                
                                                var_4_385 = and:int(var_4_385:int, ldc:int(-203441325))
                                            }
                                            
                                            Label_0646:
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(131072)), ldc:int(0))) {
                                                var_4_385 = and:int(var_4_385:int, ldc:int(535962370))
                                                goto(Label_0805)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(64)), ldc:int(0))) {
                                                var_4_385 = and:int(var_4_385:int, ldc:int(1865091844))
                                            }
                                            else {
                                                if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(64)), ldc:int(0))) {
                                                    var_4_385 = and:int(var_4_385:int, ldc:int(1724146660))
                                                    goto(Label_0584)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_4_385:int, ldc:int(16777216)), ldc:int(0))) {
                                                    var_4_385 = and:int(var_4_385:int, ldc:int(-319916709))
                                                    loopcontinue()
                                                }
                                                
                                                var_4_385 = and:int(var_4_385:int, ldc:int(721098872))
                                                inc:int(var_12_1C1, ldc:int(1))
                                            }
                                            
                                            Label_0733:
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(2147483647)), ldc:int(0))) {
                                                if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(65536)), ldc:int(0))) {
                                                    var_4_385 = and:int(var_4_385:int, ldc:int(-427523758))
                                                    goto(Label_0646)
                                                }
                                                
                                                if (cmpne:boolean(and:int(var_4_385:int, ldc:int(16777216)), ldc:int(0))) {
                                                    goto(Label_0584)
                                                }
                                                
                                                if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(536870912)), ldc:int(0))) {
                                                    var_4_385 = and:int(var_4_385:int, ldc:int(-1463560624))
                                                    loopcontinue()
                                                }
                                                
                                                var_4_385 = and:int(var_4_385:int, ldc:int(1073679728))
                                                var_10_15D = and:int(ldc:int(9829), ldc:int(16393))
                                            }
                                            
                                            Label_0805:
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(524288)), ldc:int(0))) {
                                                goto(Label_0733)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(16)), ldc:int(0))) {
                                                goto(Label_0646)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_4_385:int, ldc:int(4194304)), ldc:int(0))) {
                                                goto(Label_0584)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_4_385:int, ldc:int(4194304)), ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                        }
                                        
                                        var_4_385 = and:int(var_4_385:int, ldc:int(1677442545))
                                    }
                                    catch (java.lang.IndexOutOfBoundsException var_15_357) {
                                        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u965f\u8df4\u67e9\ubded\u3bd6\ud36e), invokestatic:Integer(Integer::valueOf, var_12_1C1:int)))
                                    }
                                }
                            }
                            
                            stack_3A4_0 = var_7_84:int
                            
                            if (cmpne:boolean(var_10_15D:int, ldc:int(0))) {
                                var_4_385 = and:int(var_4_385:int, ldc:int(586890474))
                                stack_3A4_1 = and:int(ldc:int(1089), ldc:int(20783))
                            }
                            else {
                                stack_3A4_1 = and:int(ldc:int(-28434), ldc:int(18193))
                            }
                            
                            var_4_3A2 = and:int(var_4_385:int, ldc:int(2126511819))
                            var_7_84 = add:int(stack_3A4_0:int, stack_3A4_1:int)
                            var_4_8B = and:int(var_4_3A2:int, ldc:int(-488945298))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0243:
                    
                    if (cmpne:boolean(and:int(var_4_E9:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_4_D7 = and:int(var_4_E9:int, ldc:int(-9220106))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_4_E9:int, ldc:int(131072)), ldc:int(0))) {
                            var_4_E9 = and:int(var_4_E9:int, ldc:int(-2052962028))
                            loopcontinue()
                        }
                        
                        var_4_D7 = and:int(var_4_E9:int, ldc:int(-1212195587))
                    }
                    
                    Label_0286:
                    
                    if (cmpne:boolean(and:int(var_4_D7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_4_E9 = and:int(var_4_D7:int, ldc:int(1682529626))
                        goto(Label_0243)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_D7:int, ldc:int(2147483647)), ldc:int(0))) {
                        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u0c95\u8bb0\u76bc\ua562\u9af2\u4f52), var_9_C8:\u8753\u92ee\ub70c\ua562\ud523[expected:Object]))
                    }
                    
                    var_4_E9 = and:int(var_4_D7:int, ldc:int(-1306713567))
                }
            }
        }
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> \u59ec\uc910\uc4d2\ub102\u93a2\u3504(java.util.function.BiConsumer<com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?>, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4c04\u67e9\u8d90\uc238\u2dcc> p0) {
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
    
    private static int \uf9c5\ub70c\u52d3\ud523\u6198\u67d0(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p2, java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p3) {
        var_6_6C : \u3e2a\u76bc\u16f6\uc229\ua6bd
        var_7_7D : \ub171\u47c2\u3bd6\u3776\u59ec
        var_8_86 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_9_94 : int
        
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
        var_6_6C = invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p1:\u0a06\u1833\u64f2\ud217\u183a, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>)
        var_7_7D = invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(10349), ldc:int(4613))))
        var_8_86 = invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, var_6_6C:\u3e2a\u76bc\u16f6\uc229\ua6bd)
        var_9_94 = invokeinterface:int(\u3dd3\u4f4a\u12b2\u5654\u927d::\uc7fe\u51fa\u8c8a\u5245\u983f\uc910, p2:\u3dd3\u4f4a\u12b2\u5654\u927d, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, var_8_86:\uc31c\uc87f\uc246\u3776\ub7dc, var_7_7D:\ub171\u47c2\u3bd6\u3776\u59ec, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>)
        
        if (cmpne:boolean(var_9_94:int, ldc:int(0))) {
            invokeinterface:void(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u9af2\u7006\u1833\ube23\u3711\ubb2b, var_6_6C:\u3e2a\u76bc\u16f6\uc229\ua6bd, var_8_86:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>)), invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u2dcc\u6fb0\u416d\u8350\u16f6\u67e9, var_6_6C:\u3e2a\u76bc\u16f6\uc229\ua6bd), and:int[expected:boolean](ldc:int(17), ldc:int(1837)))
            return:int(var_9_94:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u4cd9\u494c\uff55\u64f2\ub19c\ud158)))
    }
    
    private static int \u8753\u0b8e\u494c\u446c\u3d64\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2) {
        var_5_68 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_70 : int
        
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
        var_5_68 = invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)
        var_6_70 = invokevirtual:int(\ub171\u47c2\u3bd6\u3776\u59ec::\ua61f\ua3b4\u71f1\ud7e8\ud12e\u93a2, p2:\ub171\u47c2\u3bd6\u3776\u59ec, var_5_68:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
        
        if (cmpne:boolean(var_6_70:int, ldc:int(0))) {
            invokeinterface:void(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u9af2\u7006\u1833\ube23\u3711\ubb2b, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, var_5_68:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u2dcc\u6fb0\u416d\u8350\u16f6\u67e9, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd), xor:int[expected:boolean](ldc:int(2052), ldc:int(2053)))
            return:int(var_6_70:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u4cd9\u494c\uff55\u64f2\ub19c\ud158)))
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \u47c2\u8413\u9af2\ubff1\u4f4a\u72f1(\u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1) {
        var_5_75 : Iterator<Object>
        var_6_81 : \u93a2\u97b7\u647c\ud36e\u64ab
        
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
        var_5_75 = invokeinterface:Iterator<Object>(Collection<Object>::iterator, invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>[expected:Collection<Object>](\ub171\u47c2\u3bd6\u3776\u59ec::\uf94d\ua068\u7ce1\u8c8a\u4ab3\ud158, p0:\ub171\u47c2\u3bd6\u3776\u59ec, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)))
        var_6_81 = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>::next, var_5_75:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>))
        
        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_75:Iterator))) {
            return:\u93a2\u97b7\u647c\ud36e\u64ab(var_6_81:\u93a2\u97b7\u647c\ud36e\u64ab)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\uc87f\u8389\u71f1\u47c2\u3776\u6d99)))
    }
    
    private static int \u4cd9\u446c\ub102\uc4d2\ubefe\u516c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2) {
        var_3_61 : int
        var_5_67 : \u93a2\u97b7\u647c\ud36e\u64ab
        var_6_EB : int
        
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
            var_3_61 = and:int(ldc:int(-490385836), ldc:int(1928194934))
            var_5_67 = invokestatic:\u93a2\u97b7\u647c\ud36e\u64ab(\u5d20\u7006\u6ec6\ub113\uc910::\u47c2\u8413\u9af2\ubff1\u4f4a\u72f1, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)
            
            if (logicalnot:boolean(instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua068\uae87\uc7fe\uc246\u0800.class, var_5_67:\u93a2\u97b7\u647c\ud36e\u64ab))) {
                loop {
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0181)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(166559517))
                        
                        if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, var_5_67:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                            var_6_EB = invokevirtual:int(AbstractCollection::size, checkcast:\u8753\u92ee\ub70c\ua562\ud523[expected:AbstractCollection](\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u8753\u92ee\ub70c\ua562\ud523.class, var_5_67:\u8753\u92ee\ub70c\ua562\ud523))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0142:
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(315154994))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61 = and:int(var_3_61:int, ldc:int(535292892))
                        
                        if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_5_67:\u8753\u92ee\ub70c\ua562\ud523[expected:\u93a2\u97b7\u647c\ud36e\u64ab])) {
                            var_6_EB = invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u6b0d\u8df4\u8bb0\u3504\uceb8\u6198, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_5_67:\uc31c\uc87f\uc246\u3776\ub7dc))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0181:
                    
                    if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0142)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61 = and:int(var_3_61:int, ldc:int(-1869881849))
                    }
                    else {
                        if (instanceof:boolean(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u9033\ucef1\u12b2\ua3b4\u6cfe.class, var_5_67:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab])) {
                            var_6_EB = invokevirtual:int(String::length, invokeinterface:String(\u93a2\u97b7\u647c\ud36e\u64ab::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, var_5_67:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab]))
                            looporswitchbreak()
                        }
                        
                        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u7330\u4ab3\u7049\ud171\uc910\uc84e), invokevirtual:String[expected:Object](\ub171\u47c2\u3bd6\u3776\u59ec::toString, p2:\ub171\u47c2\u3bd6\u3776\u59ec)))
                    }
                }
            }
            else {
                var_6_EB = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\ua068\uae87\uc7fe\uc246\u0800::\u946b\u3776\u7d52\u3504\uae87\u3776, checkcast:\ua068\uae87\uc7fe\uc246\u0800(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua068\uae87\uc7fe\uc246\u0800.class, var_5_67:\ua068\uae87\uc7fe\uc246\u0800)))
            }
            
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u51b2\u5bc4\ubcb0\u2dcc\u1833\u4c2b, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, var_5_67:\ua068\uae87\uc7fe\uc246\u0800[expected:\u93a2\u97b7\u647c\ud36e\u64ab]), and:int[expected:boolean](ldc:int(26806), ldc:int(-26816)))
            return:int(var_6_EB:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \ub32d\ud4fe\u7d52\u67e9\u62da\u8413(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, double p3) {
        var_7_6A : \u93a2\u97b7\u647c\ud36e\u64ab
        var_8_89 : int
        
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
        var_7_6A = invokestatic:\u93a2\u97b7\u647c\ud36e\u64ab(\u5d20\u7006\u6ec6\ub113\uc910::\u47c2\u8413\u9af2\ubff1\u4f4a\u72f1, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)
        
        if (instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua068\uae87\uc7fe\uc246\u0800.class, var_7_6A:\u93a2\u97b7\u647c\ud36e\u64ab)) {
            var_8_89 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:double(invokevirtual:double(\ua068\uae87\uc7fe\uc246\u0800::\u946b\u3776\u7d52\u3504\uae87\u3776, checkcast:\ua068\uae87\uc7fe\uc246\u0800(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua068\uae87\uc7fe\uc246\u0800.class, var_7_6A:\ua068\uae87\uc7fe\uc246\u0800)), p3:double))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\ubded\u92ff\u59ec\u392e\u6d99\ube23, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p3:double, var_8_89:int), and:int[expected:boolean](ldc:int(-21789), ldc:int(21528)))
            return:int(var_8_89:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u4492\ua562\ud158\u4492\u6bb9\ub70c), invokevirtual:String[expected:Object](\ub171\u47c2\u3bd6\u3776\u59ec::toString, p2:\ub171\u47c2\u3bd6\u3776\u59ec)))
    }
    
    private static int \u4cd9\u446c\ub102\uc4d2\ubefe\u516c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1) {
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
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u51b2\u5bc4\ubcb0\u2dcc\u1833\u4c2b, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)), and:int[expected:boolean](ldc:int(18454), ldc:int(-18455)))
            return:int(xor:int(ldc:int(-32208), ldc:int(-32207)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u8aa5\u0c95\u88c5\u8d90\ua068\u5f50(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p2) {
        var_5_68 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_6_73 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
        var_5_68 = invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd)
        var_6_73 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u983f\ud158\u93a2\u74b1\u67d0, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, var_5_68:\uc31c\uc87f\uc246\u3776\ub7dc), p2:\uc31c\uc87f\uc246\u3776\ub7dc)
        
        if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::equals, var_5_68:\uc31c\uc87f\uc246\u3776\ub7dc, var_6_73:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]))) {
            invokeinterface:void(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u9af2\u7006\u1833\ube23\u3711\ubb2b, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, var_6_73:\uc31c\uc87f\uc246\u3776\ub7dc)
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokeinterface:ITextComponent(\u3e2a\u76bc\u16f6\uc229\ua6bd::\u2dcc\u6fb0\u416d\u8350\u16f6\u67e9, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd), xor:int[expected:boolean](ldc:int(16400), ldc:int(16401)))
            return:int(xor:int(ldc:int(18497), ldc:int(18496)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\u4cd9\u494c\uff55\u64f2\ub19c\ud158)))
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u3bc9\u47c2\uc31c\u4c04\u4d85\ud7e8$28(java.util.function.BiConsumer p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, com.mojang.brigadier.builder.ArgumentBuilder p2) {
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
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\ud523\u4492\uae87\u6c56\u7330\ub70c$27(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p1) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(4128), ldc:int(4134)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(143), ldc:int(10854))), invokestatic:\u12b2\u873d\u56bd\ua3b4\u4f4a[expected:ArgumentType](\u12b2\u873d\u56bd\ua3b4\u4f4a::\u0b8e\u34df\u2dcc\ub83f\ua3b4\ud4fe)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;L\u36d3\u9033\u6b0d\u983f\u8d90/\u3dd3\u4f4a\u12b2\u5654\u927d;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:\u3dd3\u4f4a\u12b2\u5654\u927d))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc238\u8d98\u6bb9\ub19c\u9af2\uc9f6$26(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p1, com.mojang.brigadier.context.CommandContext p2) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\uf9c5\ub70c\u52d3\ud523\u6198\u67d0, p2:CommandContext, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:\u3dd3\u4f4a\u12b2\u5654\u927d, invokestatic:List<\u93a2\u97b7\u647c\ud36e\u64ab>(Collections::singletonList, invokestatic:\u93a2\u97b7\u647c\ud36e\u64ab(\u12b2\u873d\u56bd\ua3b4\u4f4a::\u36d3\u416d\uc9f6\u6c52\u0c95\u416d, p2:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(16502), ldc:int(8454)))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u16f6\u4492\ub70c\u8df4\ub7dc\u5fe1$25(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p2) {
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
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\uc910\u99f7\ud4fe\u6bb9\u6b5f\uc7fe$24(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p2, com.mojang.brigadier.builder.ArgumentBuilder p3) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, invokevirtual:ArgumentBuilder(ArgumentBuilder::executes, p3:ArgumentBuilder, invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;L\u36d3\u9033\u6b0d\u983f\u8d90/\u3dd3\u4f4a\u12b2\u5654\u927d;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:\u3dd3\u4f4a\u12b2\u5654\u927d)), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(8456), ldc:int(16970))), invokestatic:\u64ab\u7d52\u5f50\uc3e3\ubb2b[expected:ArgumentType](\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u7006\u6b0d\u4d85\ud523\u071d\u5db4)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;L\u36d3\u9033\u6b0d\u983f\u8d90/\u3dd3\u4f4a\u12b2\u5654\u927d;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:\u3dd3\u4f4a\u12b2\u5654\u927d))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u97e6\u88c5\u40a9\u61a4\u9937\u6435$23(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p2, com.mojang.brigadier.context.CommandContext p3) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\uf9c5\ub70c\u52d3\ud523\u6198\u67d0, p3:CommandContext, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:\u3dd3\u4f4a\u12b2\u5654\u927d, invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>(\ub171\u47c2\u3bd6\u3776\u59ec::\uf94d\ua068\u7ce1\u8c8a\u4ab3\ud158, invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p3:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(4132), ldc:int(4140)))), invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p3:CommandContext)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud7e8\ufe34\ud217\u9a18\u5db4\uf9c5$22(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, \u36d3\u9033\u6b0d\u983f\u8d90.\u3dd3\u4f4a\u12b2\u5654\u927d p2, com.mojang.brigadier.context.CommandContext p3) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\uf9c5\ub70c\u52d3\ud523\u6198\u67d0, p3:CommandContext, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:\u3dd3\u4f4a\u12b2\u5654\u927d, invokestatic:List<\uc31c\uc87f\uc246\u3776\ub7dc>(Collections::singletonList, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p3:CommandContext)))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u8bb0\uc910\ub70c\ub70c\u3776\ubefe$21(com.mojang.brigadier.builder.ArgumentBuilder p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4c04\u67e9\u8d90\uc238\u2dcc p1) {
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
    
    private static int lambda$\ub6ab\u61a4\ua61f\u5140\ua6bd\u9af2$20(com.mojang.brigadier.context.CommandContext p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List p3) {
        var_4_63 : int
        var_6_6F : List<\u93a2\u97b7\u647c\ud36e\u64ab>
        var_7_78 : int
        var_8_81 : Iterator<Object>
        var_9_CA : \u93a2\u97b7\u647c\ud36e\u64ab
        var_4_DA : int
        var_10_E1 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_11_E8 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_12_F0 : Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>
        var_13_147 : \u93a2\u97b7\u647c\ud36e\u64ab
        var_4_119 : int
        stack_18A_0 : int [generated]
        stack_18A_1 : int [generated]
        
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
        var_4_63 = and:int(ldc:int(-1308818487), ldc:int(1719649143))
        var_6_6F = invokevirtual:List<\u93a2\u97b7\u647c\ud36e\u64ab>(\ub171\u47c2\u3bd6\u3776\u59ec::\u156b\u4f4a\u0c95\u8d98\u64f2\uc9f6, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p1:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], invokedynamic:Supplier<\uc31c\uc87f\uc246\u3776\ub7dc>(get:()Ljava/util/function/Supplier;))
        var_7_78 = and:int(ldc:int(13367), ldc:int(-29760))
        var_8_81 = invokeinterface:Iterator<Object>(Collection<Object>::iterator, var_6_6F:Collection<Object>)
        
        loop {
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1245158494))
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(905432057))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_8_81:Iterator)) {
                    var_9_CA = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>::next, var_8_81:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>))
                    
                    if (instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_9_CA:\u93a2\u97b7\u647c\ud36e\u64ab)) {
                        var_4_DA = and:int(var_4_63:int, ldc:int(-1258309295))
                        var_10_E1 = checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_9_CA:\uc31c\uc87f\uc246\u3776\ub7dc)
                        var_11_E8 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, var_10_E1:\uc31c\uc87f\uc246\u3776\ub7dc)
                        var_12_F0 = invokeinterface:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>(List<\u93a2\u97b7\u647c\ud36e\u64ab>::iterator, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>)
                        
                        while (invokeinterface:boolean(Iterator::hasNext, var_12_F0:Iterator)) {
                            var_13_147 = checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>::next, var_12_F0:Iterator<\u93a2\u97b7\u647c\ud36e\u64ab>))
                            
                            if (logicalnot:boolean(instanceof:boolean(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_13_147:\u93a2\u97b7\u647c\ud36e\u64ab))) {
                                athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\uf995\u8d98\u9af2\uc238\u5654\ud217), var_13_147:\u93a2\u97b7\u647c\ud36e\u64ab[expected:Object]))
                            }
                            
                            var_4_DA = and:int(var_4_DA:int, ldc:int(888639307))
                            invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u983f\ud158\u93a2\u74b1\u67d0, var_10_E1:\uc31c\uc87f\uc246\u3776\ub7dc, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, var_13_147:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab]))
                        }
                        
                        var_4_119 = and:int(var_4_DA:int, ldc:int(-1082825231))
                        stack_18A_0 = var_7_78:int
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::equals, var_11_E8:\uc31c\uc87f\uc246\u3776\ub7dc, var_10_E1:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]))) {
                            var_4_119 = and:int(var_4_119:int, ldc:int(939375447))
                            stack_18A_1 = xor:int(ldc:int(2434), ldc:int(2435))
                        }
                        else {
                            stack_18A_1 = and:int(ldc:int(-28778), ldc:int(20585))
                        }
                        
                        var_4_63 = and:int(var_4_119:int, ldc:int(998212945))
                        var_7_78 = add:int(stack_18A_0:int, stack_18A_1:int)
                        loopcontinue()
                    }
                    
                    athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u5d20\u7006\u6ec6\ub113\uc910::\uf995\u8d98\u9af2\uc238\u5654\ud217), var_9_CA:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]))
                }
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                return:int(var_7_78:int)
            }
        }
    }
    
    private static int lambda$\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4$19(com.mojang.brigadier.context.CommandContext p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List p3) {
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
            return:int(invokevirtual:int(\ub171\u47c2\u3bd6\u3776\u59ec::\u6198\ube23\u6d99\u7bad\u7006\u92ee, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p1:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab], invokedynamic:Supplier<\u93a2\u97b7\u647c\ud36e\u64ab>(get:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\ud7e8\u0800\uae87\u8d90\u183a/\u7c6b\ubded\u0b8e\u2dcc\u8c8a/\u93a2\u97b7\u647c\ud36e\u64ab;)Ljava/util/function/Supplier;, checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokestatic:Object[expected:\u93a2\u97b7\u647c\ud36e\u64ab](Iterables::getLast, p3:List[expected:Iterable])))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u718f\u7873\ub6ab\uc4d2\ud36e\uc229$18(com.mojang.brigadier.context.CommandContext p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List p3) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u4ab3\u0c95\u4d85\u983f\u7c6b\u3bd6, ldc:int(-1), p1:\uc31c\uc87f\uc246\u3776\ub7dc, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u624e\uc246\u4e72\u6198\u98a4\u0a06$17(com.mojang.brigadier.context.CommandContext p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List p3) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u4ab3\u0c95\u4d85\u983f\u7c6b\u3bd6, and:int(ldc:int(9354), ldc:int(-9355)), p1:\uc31c\uc87f\uc246\u3776\ub7dc, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u516c\uff55\u8aa5\u1187\u34df\u12cb$16(com.mojang.brigadier.context.CommandContext p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.List p3) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u4ab3\u0c95\u4d85\u983f\u7c6b\u3bd6, invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(6794), ldc:int(8238)))), p1:\uc31c\uc87f\uc246\u3776\ub7dc, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p3:List<\u93a2\u97b7\u647c\ud36e\u64ab>))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u836c\ub8be\u600f\u97e6\u16f6\uae5d$15(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.builder.ArgumentBuilder p1) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, p1:ArgumentBuilder, invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(-28534), ldc:int(-28540))), invokestatic:\u64ab\u7d52\u5f50\uc3e3\ubb2b[expected:ArgumentType](\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u7006\u6b0d\u4d85\ud523\u071d\u5db4)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6ec6\u8753\u5d20\u4179\u3bd6\u69d9$14(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u8753\u0b8e\u494c\u446c\u3d64\uc229, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext), invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p1:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(17678), ldc:int(2094))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u3d64\u16f6\u1833\uc7fe\uf995\u92ee$13(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.builder.ArgumentBuilder p1) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, invokevirtual:ArgumentBuilder(ArgumentBuilder::executes, p1:ArgumentBuilder, invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a)), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(7006), ldc:int(16430))), invokestatic:\u64ab\u7d52\u5f50\uc3e3\ubb2b[expected:ArgumentType](\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u7006\u6b0d\u4d85\ud523\u071d\u5db4)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(2572), ldc:int(2563))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a)))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u72f1\u624e\u3bd6\u40a9\uae5d\uc238$12(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\ub32d\ud4fe\u7d52\u67e9\u62da\u8413, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext), invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p1:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(13342), ldc:int(15)))), invokestatic:double(DoubleArgumentType::getDouble, p1:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(1551), ldc:int(2399))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ube23\u8cae\uc229\ub1b9\u64f2\ubefe$11(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u4cd9\u446c\ub102\uc4d2\ubefe\u516c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext), invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p1:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(783), ldc:int(769))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubf56\u8cae\u5fe1\ub6ab\u3bc9\u8753$10(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u4cd9\u446c\ub102\uc4d2\ubefe\u516c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\ub70c\u92ee\u3e2a\ub70c\ud4fe\u0c95$9(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.builder.ArgumentBuilder p1) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, p1:ArgumentBuilder, invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(1067), ldc:int(1083))), invokestatic:\u61a4\u6c52\u4ab3\u4ab3\u4c04[expected:ArgumentType](\u61a4\u6c52\u4ab3\u4ab3\u4c04::\ub7dc\ub1b9\uc31c\ua61f\u156b\u4f52)), invokedynamic:Command(run:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;)Lcom/mojang/brigadier/Command;, p0:\u0a06\u1833\u64f2\ud217\u183a))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4daf\u88c5\uae5d\u960f\uceb8\u6b5f$8(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u5d20\u7006\u6ec6\ub113\uc910::\u8aa5\u0c95\u88c5\u8d90\ua068\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext), invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u61a4\u6c52\u4ab3\u4ab3\u4c04::\u7af6\uc31c\ud523\ufcaf\u4f4a\u3d64, p1:CommandContext, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(128), ldc:int(144))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc9f6\ubf56\uc910\u93a2\u7bad\u8308$7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(2050), ldc:int(2048))))
        }
        
        goto(Label_0006)
    }
    
    private static \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a lambda$\u74b1\u8753\u6c56\uae5d\u5f50\ub8be$6(java.util.function.Function p0) {
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
            return:\u0a06\u1833\u64f2\ud217\u183a(checkcast:\u0a06\u1833\u64f2\ud217\u183a(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a.class, invokeinterface:\u0a06\u1833\u64f2\ud217\u183a(Function<String, \u0a06\u1833\u64f2\ud217\u183a>::apply, p0:Function<String, \u0a06\u1833\u64f2\ud217\u183a>, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(146), ldc:int(131))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a lambda$\uc2bd\u9033\uafe7\ua562\u16f6\ua068$5(java.util.function.Function p0) {
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
            return:\u0a06\u1833\u64f2\ud217\u183a(checkcast:\u0a06\u1833\u64f2\ud217\u183a(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a.class, invokeinterface:\u0a06\u1833\u64f2\ud217\u183a(Function<String, \u0a06\u1833\u64f2\ud217\u183a>::apply, p0:Function<String, \u0a06\u1833\u64f2\ud217\u183a>, loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(2167), ldc:int(8338))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u12b2\u7ce1\u7043\u36d3\u7af6\u4daf$4(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(12), ldc:int(31)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(10240), ldc:int(10241)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(4889), ldc:int(-4922)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\uafe7\uff55\uafe7\u4daf\uae5d\u62da$3(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(8274), ldc:int(8262)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(137), ldc:int(6663)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-11091), ldc:int(11090)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u946b\u3dd3\u6198\ud217\ub8be\ucfaf$2(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), and:int(ldc:int(16405), ldc:int(989)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(25861), ldc:int(6219)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-13222), ldc:int(5029)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u8709\u6b5f\uf94d\u98a4\u6c56\u647c$1(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(21004), ldc:int(21018)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6277), ldc:int(1601)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(-1663), ldc:int(1650)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u5db4\uc910\u759a\u3776\uc9f6\ube23$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u5d20\u7006\u6ec6\ub113\uc910::\ud36e\ubff1\uc4d2\ud51e\ufcaf\u3e2a), xor:int(ldc:int(146), ldc:int(133)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(20483), ldc:int(2521)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(20900), ldc:int(-20901)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
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
    
    public void \ua3b4\u47c2\u64ab\ua562\u12b2\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_689 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_694 : int
        
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
        var_3_689 = and:int(ldc:int(1176884691), ldc:int(1183088079))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\u7006\u6ec6\ub113\uc910[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
            var_3_689 = and:int(var_3_689:int, ldc:int(-411215929))
            var_5_81 = and:int(ldc:int(4581), ldc:int(-6646))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16656), ldc:int(-16657)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_689:int, ldc:int(-60524053))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2448), ldc:int(2449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(5), ldc:int(4105)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_689 = and:int(var_3_DA:int, ldc:int(1196685295))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(1289), ldc:int(1288)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-487581359))
                        goto(Label_1561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1213465212))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-307442147))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(673176465))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-242172463))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0732)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-317524541))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0416:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1478274793))
                        goto(Label_1561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-814857172))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1875600097))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(64)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-88692145))
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0732)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(611673622))
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(-29426201))
                        var_11_EB = and:int(ldc:int(-28337), ldc:int(19632))
                        goto(Label_1550)
                    }
                    
                    Label_0590:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-541866568))
                        goto(Label_1561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-2093956652))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-838908651))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1578213974))
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-782195727))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(125133876))
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(1861777347))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0732:
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1539516685))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1242247874))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1123938469))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(2019514067))
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(1475337207))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0864:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1900435408))
                        goto(Label_1561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(2055600102))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1788584715))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(893162761))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1489493755))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(1167591805))
                            goto(Label_0732)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(1444084203))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(4370), ldc:int(4371))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-24789123))
                        goto(Label_1561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(1842432363))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0732)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-242856377))
                            goto(Label_0416)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-1365088529))
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(-319031825))
                        var_11_EB = and:int(ldc:int(2573), ldc:int(-2574))
                    }
                    
                    Label_1163:
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(2101929543))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(368740315))
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0732)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(487743405))
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-1496946234))
                            loopcontinue()
                        }
                        
                        var_3_689 = and:int(var_3_689:int, ldc:int(1183117819))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-141484065))
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(-457589799))
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(884053094))
                            goto(Label_0732)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0416)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_689 = and:int(var_3_689:int, ldc:int(1949096935))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1550)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-2020729602))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(689822732))
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(824990723))
                        goto(Label_0732)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(439318030))
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(4)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1341514581))
                        loopcontinue()
                    }
                    
                    var_3_689 = and:int(var_3_689:int, ldc:int(-963094057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1550:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_694 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1561:
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-1653132711))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-782595625))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(256)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-150176980))
                        goto(Label_0732)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_689:int, ldc:int(2)), ldc:int(0))) {
                        var_3_689 = and:int(var_3_689:int, ldc:int(-436043797))
                        var_17_694 = add:int(var_16_119:int, xor:int(ldc:int(-32664), ldc:int(-32663)))
                        looporswitchbreak()
                    }
                    
                    var_3_689 = and:int(var_3_689:int, ldc:int(-1867658387))
                }
                
                var_3_689 = and:int(var_3_689:int, ldc:int(-59252769))
                
                if (cmple:boolean(var_5_81 = var_17_694:int, sub:int(var_6_88:int, and:int(ldc:int(8193), ldc:int(2705))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_689:int, ldc:int(4096)), ldc:int(0))) {
            var_3_689 = and:int(var_3_689:int, ldc:int(-2000944571))
            goto(Label_0108)
        }
    }
}
