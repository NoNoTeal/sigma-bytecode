public class \u494c\u4975\ua068\u0c95\uc84e.\u7049\u8709\ua6bd\u3e2a\uf94d {
    public void \u7049\u8709\ua6bd\u3e2a\uf94d() {
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
            invokespecial:Object(Object::<init>, this:\u7049\u8709\ua6bd\u3e2a\uf94d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ud523\u52d3\u9255\u946b\u67d0\u8c8a(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u494c\u759a\uc3e3\u1833\u5245\u7af6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1) {
        var_2_F2 : int
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_5_71 : Iterator<String>
        stack_17C_1 : String [generated]
        expr_165 : Object[] [generated]
        stack_11F_1 : String [generated]
        expr_10A : Object[] [generated]
        
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
            var_2_F2 = and:int(ldc:int(-1112976482), ldc:int(-1382941700))
            var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_5_71 = invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0203)
                }
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-680054098))
                }
                else {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(2142622655))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_71:Iterator)) {
                        invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u960f\u92ff\ucfaf\u0800\u7c6b\u071d, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_5_71:Iterator<String>)))
                        loopcontinue()
                    }
                }
                
                Label_0156:
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_F2 = and:int(var_2_F2:int, ldc:int(2121373254))
                        loopcontinue()
                    }
                    
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-1381513249))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(16451), ldc:int(2581)))) {
                        stack_17C_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(9310), ldc:int(4890)))
                        expr_165 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(3648), ldc:int(3649)))
                        storeelement:Object(expr_165:Object[], and:int(ldc:int(-21181), ldc:int(17084)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p1:Collection<String>)))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_17C_1:String, expr_165:Object[]), xor:int[expected:boolean](ldc:int(802), ldc:int(803)))
                        looporswitchbreak()
                    }
                }
                
                Label_0203:
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(32)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(1967115642))
                    goto(Label_0156)
                }
                
                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(16)), ldc:int(0))) {
                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-270180356))
                    stack_11F_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(20635), ldc:int(2427)))
                    expr_10A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(9537), ldc:int(4131)))
                    storeelement:Object(expr_10A:Object[], and:int(ldc:int(16504), ldc:int(-16505)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<String>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_11F_1:String, expr_10A:Object[]), and:int[expected:boolean](ldc:int(18465), ldc:int(329)))
                    looporswitchbreak()
                }
                
                var_2_F2 = and:int(var_2_F2:int, ldc:int(267330520))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p1:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \ua3b4\u8413\uc2e8\u3d64\u56bd\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, java.util.Collection<java.lang.String> p2) {
        var_3_F2 : int
        var_5_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_6_71 : Iterator<String>
        stack_197_1 : String [generated]
        expr_173 : Object[] [generated]
        stack_12C_1 : String [generated]
        expr_10A : Object[] [generated]
        
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
            var_3_F2 = and:int(ldc:int(-1656678356), ldc:int(-704980960))
            var_5_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            var_6_71 = invokeinterface:Iterator<String>(Collection<String>::iterator, p2:Collection<String>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_F2:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-1583067675))
                    goto(Label_0212)
                }
                
                if (cmpne:boolean(and:int(var_3_F2:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-547955359))
                }
                else {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-1273219667))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_6_71:Iterator)) {
                        invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6c52\u4c04\ucfaf\u8258\uf995\u759a, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_71:Iterator<String>)), p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8)
                        loopcontinue()
                    }
                }
                
                Label_0165:
                
                if (cmpeq:boolean(and:int(var_3_F2:int, ldc:int(32)), ldc:int(0))) {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(522162391))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_F2:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-174050689))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p2:Collection), xor:int(ldc:int(142), ldc:int(143)))) {
                        stack_197_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(4480), ldc:int(4508)))
                        expr_173 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8334), ldc:int(3586)))
                        storeelement:Object(expr_173:Object[], and:int(ldc:int(1256), ldc:int(-1259)), invokeinterface:String[expected:Object](Iterator<String>::next, invokeinterface:Iterator<String>(Collection<String>::iterator, p2:Collection<String>)))
                        storeelement:Object(expr_173:Object[], and:int(ldc:int(12321), ldc:int(2179)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_197_1:String, expr_173:Object[]), and:int[expected:boolean](ldc:int(3), ldc:int(8205)))
                        looporswitchbreak()
                    }
                }
                
                Label_0212:
                
                if (cmpeq:boolean(and:int(var_3_F2:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_3_F2:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_F2 = and:int(var_3_F2:int, ldc:int(-1254950278))
                    stack_12C_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(637), ldc:int(608)))
                    expr_10A = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-24565), ldc:int(-24567)))
                    storeelement:Object(expr_10A:Object[], and:int(ldc:int(-25162), ldc:int(25161)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p2:Collection<String>)))
                    storeelement:Object(expr_10A:Object[], xor:int(ldc:int(2632), ldc:int(2633)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_12C_1:String, expr_10A:Object[]), and:int[expected:boolean](ldc:int(4229), ldc:int(2115)))
                    looporswitchbreak()
                }
                
                var_3_F2 = and:int(var_3_F2:int, ldc:int(392136371))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p2:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \uff55\uc910\u7049\u8d98\u7af6\u3dd3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5140\u4c2b\u183a\u7330\u6435 p2) {
        stack_A9_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:\u5140\u4c2b\u183a\u7330\u6435(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u385b\u183a\u97e6\u8389\u0c95\u3504, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:\u5140\u4c2b\u183a\u7330\u6435)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u4daf\uc910\u9255\u52d3\uc9f6\ub1b9, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:\u5140\u4c2b\u183a\u7330\u6435)
            stack_A9_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(8234), ldc:int(8244)))
            expr_8C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(9297), ldc:int(9299)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(21333), ldc:int(-21334)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(19), ldc:int(25837)), invokevirtual:ITextComponent[expected:Object](\u5140\u4c2b\u183a\u7330\u6435::\u5245\ud158\ud158\ub32d\u600f\u4ab3, p2:\u5140\u4c2b\u183a\u7330\u6435))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A9_1:String, expr_8C:Object[]), xor:int[expected:boolean](ldc:int(6276), ldc:int(6277)))
            return:int(and:int(ldc:int(30240), ldc:int(-32371)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\uff55\u965f\u873d\u6ec6\uafe7\u7043)))
    }
    
    private static int \u385b\u3e2a\u8c8a\ua562\u7049\u97e6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5140\u4c2b\u183a\u7330\u6435 p2) {
        stack_A9_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:\u5140\u4c2b\u183a\u7330\u6435(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\ua61f\ua3b4\u4ab3\u7bad\u9033\u6ec6, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:\u5140\u4c2b\u183a\u7330\u6435)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u8d90\u97e6\u983f\uc246\u3d64\u836c, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:\u5140\u4c2b\u183a\u7330\u6435)
            stack_A9_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(703), ldc:int(25631)))
            expr_8C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(102), ldc:int(6402)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(10783), ldc:int(-10912)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(26017), ldc:int(523)), invokevirtual:ITextComponent[expected:Object](\u5140\u4c2b\u183a\u7330\u6435::\u5245\ud158\ud158\ub32d\u600f\u4ab3, p2:\u5140\u4c2b\u183a\u7330\u6435))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A9_1:String, expr_8C:Object[]), and:int[expected:boolean](ldc:int(19201), ldc:int(1031)))
            return:int(and:int(ldc:int(-29390), ldc:int(21197)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\ucef1\u6d99\u67d0\ub70c\ucb79\u3bd6)))
    }
    
    private static int \ub1b9\u600f\uc229\u6cfe\u0a06\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u2dcc\uceb8\u6bb9\uc9f6\u5140 p2) {
        stack_A9_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u4975\u98a4\u1833\ub70c\ubff1\u7006, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:\u2dcc\uceb8\u6bb9\uc9f6\u5140)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\uc3e3\u516c\u5db4\u5bc4\uf94d\u3e2a, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:\u2dcc\uceb8\u6bb9\uc9f6\u5140)
            stack_A9_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(461), ldc:int(493)))
            expr_8C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2561), ldc:int(2563)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(20230), ldc:int(-28487)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(9249), ldc:int(4627)), invokevirtual:ITextComponent[expected:Object](\u2dcc\uceb8\u6bb9\uc9f6\u5140::\ud12e\uc910\u6bb9\ub18d\uc246\u7049, p2:\u2dcc\uceb8\u6bb9\uc9f6\u5140))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A9_1:String, expr_8C:Object[]), xor:int[expected:boolean](ldc:int(329), ldc:int(328)))
            return:int(and:int(ldc:int(-12139), ldc:int(12138)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u7ce1\u759a\ud523\u0a06\u8389\u1187)))
    }
    
    private static int \u3504\u071d\uceb8\u7ce1\ufcaf\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, boolean p2) {
        stack_F9_1 : String [generated]
        expr_E9 : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:boolean(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u8389\uf995\u7043\ubcb0\u9937\u7d52, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:boolean)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u4bc8\uc7fe\u8258\u836c\uf94d\u5654, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:boolean)
            stack_F9_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(24737), ldc:int(2175)))), ternaryop:String(p2:boolean, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(12394), ldc:int(18722))), loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(2059), ldc:int(2088))))))
            expr_E9 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16913), ldc:int(16912)))
            storeelement:Object(expr_E9:Object[], and:int(ldc:int(-27270), ldc:int(27137)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_F9_1:String, expr_E9:Object[]), xor:int[expected:boolean](ldc:int(33), ldc:int(32)))
            return:int(and:int(ldc:int(21195), ldc:int(-21228)))
        }
        
        if (logicalnot:boolean(p2:boolean)) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\ubb2b\u97b7\u624e\u760c\u8c8a\u839e)))
    }
    
    private static int \ubb2b\u4c2b\ud523\u759a\ud523\u6ec6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, boolean p2) {
        stack_F9_1 : String [generated]
        expr_E9 : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:boolean(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\ubf56\uc238\ud7e8\uc84e\ubb2b\u5fe1, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:boolean)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\ud36e\u516c\u624e\u72f1\u7ce1\u99f7, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:boolean)
            stack_F9_1 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(9278), ldc:int(2276)))), ternaryop:String(p2:boolean, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(1443), ldc:int(610))), loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(-32768), ldc:int(-32733))))))
            expr_E9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17171), ldc:int(5)))
            storeelement:Object(expr_E9:Object[], and:int(ldc:int(730), ldc:int(-731)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_F9_1:String, expr_E9:Object[]), xor:int[expected:boolean](ldc:int(4224), ldc:int(4225)))
            return:int(and:int(ldc:int(-12851), ldc:int(4658)))
        }
        
        if (logicalnot:boolean(p2:boolean)) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u8413\u3776\u51fa\u59ec\u5245\u4c2b)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u4179\u5245\u34df\u67d0\u8df4\ub7dc)))
    }
    
    private static int \u1833\ubded\uc229\u946b\u8bb0\uc4d2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, net.minecraft.util.text.ITextComponent p2) {
        stack_9F_1 : String [generated]
        expr_8F : Object[] [generated]
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(Object::equals, invokevirtual:ITextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u8c8a\u4f52\uc229\ud7e8\u385b\u8bb0, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:ITextComponent[expected:Object]))) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u965f\u983f\u946b\ucfaf\ub8be\ud158, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:ITextComponent)
            stack_9F_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(-30671), ldc:int(-30700)))
            expr_8F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4160), ldc:int(4161)))
            storeelement:Object(expr_8F:Object[], and:int(ldc:int(12428), ldc:int(-12429)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_9F_1:String, expr_8F:Object[]), xor:int[expected:boolean](ldc:int(-16255), ldc:int(-16256)))
            return:int(and:int(ldc:int(4748), ldc:int(-4749)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u9af2\uc2bd\u12cb\u8753\u98a4\ua6bd)))
    }
    
    private static int \u4bc8\ud36e\uc9f6\u1187\u4cd9\u62da(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, net.minecraft.util.text.TextFormatting p2) {
        stack_A9_1 : String [generated]
        expr_8C : Object[] [generated]
        
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
        
        if (cmpne:boolean(invokevirtual:TextFormatting(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u97b7\u9033\uc2e8\u836c\u8640\u156b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8), p2:TextFormatting)) {
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u760c\u4179\u3504\ub6ab\uc84e\u120d, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:TextFormatting)
            stack_A9_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(24721), ldc:int(24759)))
            expr_8C = newarray:Object[](java.lang.Object.class, and:int(ldc:int(19074), ldc:int(5450)))
            storeelement:Object(expr_8C:Object[], and:int(ldc:int(-13439), ldc:int(5230)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            storeelement:Object(expr_8C:Object[], xor:int(ldc:int(3096), ldc:int(3097)), invokevirtual:String[expected:Object](TextFormatting::getFriendlyName, p2:TextFormatting))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A9_1:String, expr_8C:Object[]), and:int[expected:boolean](ldc:int(1031), ldc:int(16481)))
            return:int(and:int(ldc:int(3529), ldc:int(-8154)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u071d\uc2bd\u6b5f\ua61f\u946b\u97e6)))
    }
    
    private static int \u8bb0\u516c\u62da\u3d4b\uc84e\ufe34(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1) {
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_5_72 : ArrayList
        var_6_8B : Iterator<String>
        stack_EC_1 : String [generated]
        expr_C9 : Object[] [generated]
        
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
        var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        var_5_72 = invokestatic:ArrayList(Lists::newArrayList, invokevirtual:Collection<String>[expected:Iterable](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u839e\uc229\u6bb9\uc229\u16f6\u6ec6, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
        
        if (logicalnot:boolean(invokeinterface:boolean(Collection<E>::isEmpty, var_5_72:ArrayList<Object>[expected:Collection<Object>]))) {
            var_6_8B = invokeinterface:Iterator<Object>(Collection<Object>::iterator, var_5_72:ArrayList<Object>[expected:Collection<Object>])
            
            while (invokeinterface:boolean(Iterator::hasNext, var_6_8B:Iterator)) {
                invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6b0d\u5d20\ud36e\u6435\ud217\u8c8a, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_8B:Iterator<String>)), p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8)
            }
            
            stack_EC_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(-22484), ldc:int(-22517)))
            expr_C9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(25867), ldc:int(6246)))
            storeelement:Object(expr_C9:Object[], and:int(ldc:int(4320), ldc:int(-4321)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, var_5_72:ArrayList<Object>[expected:Collection<Object>])))
            storeelement:Object(expr_C9:Object[], xor:int(ldc:int(6657), ldc:int(6656)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_EC_1:String, expr_C9:Object[]), and:int[expected:boolean](ldc:int(5161), ldc:int(2051)))
            return:int(invokeinterface:int(Collection<E>::size, var_5_72:ArrayList<Object>[expected:Collection<Object>]))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u67e9\uae5d\u6c52\u4492\ucfaf\u6c56)))
    }
    
    private static int \ua3b4\u527a\uc29a\u3776\ud36e\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1) {
        var_4_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        stack_98_1 : String [generated]
        expr_88 : Object[] [generated]
        
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
            var_4_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
            invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u0a06\u4c2b\u92ee\u4daf\u6fb0\ud36e, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8)
            stack_98_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(420), ldc:int(396)))
            expr_88 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(2112), ldc:int(2113)))
            storeelement:Object(expr_88:Object[], and:int(ldc:int(19612), ldc:int(-19677)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_98_1:String, expr_88:Object[]), and:int[expected:boolean](ldc:int(7463), ldc:int(16401)))
            return:int(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u5f50\ua068\ub83f\u4cd9\u8d98\u67d0, var_4_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd])))
        }
        
        goto(Label_0006)
    }
    
    private static int \u88c5\ubb2b\u5654\uc3e3\ub19c\u4daf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u88c5\ubb2b\u5654\uc3e3\ub19c\u4daf, p0:\u8413\u5140\u64f2\uc9f6\u9937, p1:String, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p1:String)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u88c5\ubb2b\u5654\uc3e3\ub19c\u4daf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, net.minecraft.util.text.ITextComponent p2) {
        var_5_69 : \u9033\uc2e8\u72f1\u8d98\u6d69
        var_6_8F : \u3e2a\u8413\ud12e\u4f4a\ud7e8
        stack_BF_1 : String [generated]
        expr_AE : Object[] [generated]
        
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
        var_5_69 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        
        if (cmpne:boolean(invokevirtual:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u7c6b\ud36e\u8d90\u0800\ua6bd::\ucfaf\u6cfe\uc910\u392e\uc910\ubf56, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String), aconstnull:\u3e2a\u8413\ud12e\u4f4a\ud7e8())) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\u6bb9\u183a\u93a2\uc3e3\u4f52\u5bc4)))
        }
        
        if (cmple:boolean(invokevirtual:int(String::length, p1:String), ldc:int(16))) {
            var_6_8F = invokevirtual:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u6435\u74b1\u7af6\u5245\u6b0d\uc87f, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], p1:String)
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u965f\u983f\u946b\ucfaf\ub8be\ud158, var_6_8F:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:ITextComponent)
            stack_BF_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(17081), ldc:int(11309)))
            expr_AE = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(5137), ldc:int(5136)))
            storeelement:Object(expr_AE:Object[], and:int(ldc:int(-18603), ldc:int(18600)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, var_6_8F:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_BF_1:String, expr_AE:Object[]), and:int[expected:boolean](ldc:int(9991), ldc:int(2073)))
            return:int(invokeinterface:int(Collection<E>::size, invokevirtual:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u5f50\ua068\ub83f\u4cd9\u8d98\u67d0, var_5_69:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd])))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u7049\u8709\ua6bd\u3e2a\uf94d::\ubded\u93a2\u6cfe\u416d\u99f7\u16f6), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(16))))
    }
    
    private static int \u516c\uc910\u0800\u718f\ub83f\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1) {
        var_2_61 : int
        var_4_66 : Collection<String>
        stack_C0_1 : String [generated]
        expr_8F : Object[] [generated]
        stack_FB_1 : String [generated]
        expr_EB : Object[] [generated]
        
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
            var_2_61 = and:int(ldc:int(1809400858), ldc:int(1239146136))
            var_4_66 = invokevirtual:Collection<String>(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u839e\uc229\u6bb9\uc229\u16f6\u6ec6, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8)
            
            if (logicalnot:boolean(invokeinterface:boolean(Collection::isEmpty, var_4_66:Collection))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-607156360))
                stack_C0_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(16725), ldc:int(16766)))
                expr_8F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(14400), ldc:int(14403)))
                storeelement:Object(expr_8F:Object[], and:int(ldc:int(-28705), ldc:int(28704)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
                storeelement:Object(expr_8F:Object[], and:int(ldc:int(16385), ldc:int(4101)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, var_4_66:Collection<String>)))
                storeelement:Object(expr_8F:Object[], and:int(ldc:int(16398), ldc:int(12930)), invokestatic:ITextComponent[expected:Object](TextComponentUtils::makeGreenSortedList, var_4_66:Collection<String>))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_C0_1:String, expr_8F:Object[]), and:int[expected:boolean](ldc:int(18001), ldc:int(-18130)))
            }
            else {
                stack_FB_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(18859), ldc:int(9322)))
                expr_EB = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(22544), ldc:int(22545)))
                storeelement:Object(expr_EB:Object[], and:int(ldc:int(8553), ldc:int(-24940)), invokevirtual:IFormattableTextComponent[expected:Object](\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u40a9\ubded\ud36e\ub102\u4bc8\u946b, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_FB_1:String, expr_EB:Object[]), and:int[expected:boolean](ldc:int(-1315), ldc:int(1314)))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, var_4_66:Collection<String>))
        }
        
        goto(Label_0006)
    }
    
    private static int \u8413\ub8be\u8413\u4daf\uc4d2\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
        var_1_61 : int
        var_3_6C : Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>
        stack_BA_1 : String [generated]
        expr_93 : Object[] [generated]
        
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
            var_1_61 = and:int(ldc:int(855798000), ldc:int(298580913))
            var_3_6C = invokevirtual:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u5f50\ua068\ub83f\u4cd9\u8d98\u67d0, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
            
            if (logicalnot:boolean(invokeinterface:boolean(Collection::isEmpty, var_3_6C:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(167682677))
                stack_BA_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(8493), ldc:int(18477)))
                expr_93 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(3097), ldc:int(3099)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(18476), ldc:int(-30893)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection::size, var_3_6C:Collection)))
                storeelement:Object(expr_93:Object[], and:int(ldc:int(24881), ldc:int(2691)), invokestatic:IFormattableTextComponent[expected:Object](TextComponentUtils::func_240649_b_, var_3_6C:Collection<Object>, invokedynamic:Function<Object, IFormattableTextComponent>(apply:()Ljava/util/function/Function;)))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_BA_1:String, expr_93:Object[]), and:int[expected:boolean](ldc:int(2904), ldc:int(-2905)))
            }
            else {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(46), ldc:int(16876)))), and:int[expected:boolean](ldc:int(11928), ldc:int(-12249)))
            }
            
            return:int(invokeinterface:int(Collection<E>::size, var_3_6C:Collection<\u3e2a\u8413\ud12e\u4f4a\ud7e8>))
        }
        
        goto(Label_0006)
    }
    
    private static int \u836c\uf995\u960f\ud4fe\u8389\uff55(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, net.minecraft.util.text.ITextComponent p2) {
        stack_8B_1 : String [generated]
        expr_7E : Object[] [generated]
        
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
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u8aa5\u071d\ub1b9\uc2e8\ub1b9\u6bb9, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:ITextComponent)
            stack_8B_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(3367), ldc:int(3337)))
            expr_7E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(129), ldc:int(27689)))
            storeelement:Object(expr_7E:Object[], and:int(ldc:int(8661), ldc:int(-9720)), p2:ITextComponent[expected:Object])
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8B_1:String, expr_7E:Object[]), and:int[expected:boolean](ldc:int(28241), ldc:int(-28542)))
            return:int(xor:int(ldc:int(8962), ldc:int(8963)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u6d99\ub18d\u52d3\u0a06\ubcb0\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u3e2a\u8413\ud12e\u4f4a\ud7e8 p1, net.minecraft.util.text.ITextComponent p2) {
        stack_8B_1 : String [generated]
        expr_7E : Object[] [generated]
        
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
            invokevirtual:void(\u3e2a\u8413\ud12e\u4f4a\ud7e8::\u6d69\u88c5\u6435\u4c2b\u8709\uc31c, p1:\u3e2a\u8413\ud12e\u4f4a\ud7e8, p2:ITextComponent)
            stack_8B_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(29247), ldc:int(2351)))
            expr_7E = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(9216), ldc:int(9217)))
            storeelement:Object(expr_7E:Object[], and:int(ldc:int(342), ldc:int(-471)), p2:ITextComponent[expected:Object])
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8B_1:String, expr_7E:Object[]), and:int[expected:boolean](ldc:int(13057), ldc:int(-13186)))
            return:int(xor:int(ldc:int(18562), ldc:int(18563)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5db4\u92ff\uc87f\u0800\u7043\u64f2$28(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u6d99\ub18d\u52d3\u0a06\ubcb0\u873d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-13137), ldc:int(12624)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(25), ldc:int(8571))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uf94d\u12cb\u7bad\u4e72\ubf56\ub83f$27(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u836c\uf995\u960f\ud4fe\u8389\uff55, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(2403), ldc:int(-27120)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(3097), ldc:int(4632))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u9255\u7d52\u392e\u6bb9\uc910\u4c2b$26(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ub1b9\u600f\uc229\u6cfe\u0a06\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-29989), ldc:int(13604)))), getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\uc4d2\uc9f6\uc246\u1833\ucfaf\ufcaf)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u97e6\u6fb0\u5654\ucb79\u647c\u72f1$25(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ub1b9\u600f\uc229\u6cfe\u0a06\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-29177), ldc:int(12664)))), getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u8bb0\ub8be\u718f\u99f7\u4daf\uc2bd)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8709\u392e\ua068\u93a2\uc9f6\ub7dc$24(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ub1b9\u600f\uc229\u6cfe\u0a06\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(1901), ldc:int(-1902)))), getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u965f\uc87f\u97b7\u071d\u64f2\ub113)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u516c\ucb79\u839e\u759a\u4f4a\ua61f$23(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ub1b9\u600f\uc229\u6cfe\u0a06\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(3035), ldc:int(-15324)))), getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u624e\uceb8\u760c\u5654\u4f4a\u3e75)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5140\u8cae\u3776\ua562\u69d9\u6c52$22(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u385b\u3e2a\u8c8a\ua562\u7049\u97e6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(1397), ldc:int(-10102)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\u3c25\u3711\u156b\u3e2a\ub83f\u69d9)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uf94d\u4daf\u64ab\u1833\u98a4\u0b8e$21(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u385b\u3e2a\u8c8a\ua562\u7049\u97e6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(6700), ldc:int(-6701)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\uc4d2\ud171\u120d\u62da\u4c2b\uf94d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u47c2\u8aa5\u4492\u965f\ubcb0\ub70c$20(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u385b\u3e2a\u8c8a\ua562\u7049\u97e6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(22810), ldc:int(-22811)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\ud523\u51fa\u1187\ucb79\u9033\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3a62\u624e\u983f\ud171\u3c25\u74b1$19(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u385b\u3e2a\u8c8a\ua562\u7049\u97e6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(11801), ldc:int(-28476)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\ua068\u6cfe\u74b1\u62da\ub19c\uff55)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub6ab\uff55\uff55\u9a18\u9255\ud217$18(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\uff55\uc910\u7049\u8d98\u7af6\u3dd3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(2182), ldc:int(-2183)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\u3c25\u3711\u156b\u3e2a\ub83f\u69d9)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3d64\u1187\ud217\u8c8a\u446c\ubff1$17(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\uff55\uc910\u7049\u8d98\u7af6\u3dd3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(26824), ldc:int(-27385)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\uc4d2\ud171\u120d\u62da\u4c2b\uf94d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u12cb\u93a2\u6b0d\u0c95\u99f7\ud51e$16(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\uff55\uc910\u7049\u8d98\u7af6\u3dd3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(10310), ldc:int(-11591)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\ud523\u51fa\u1187\ucb79\u9033\u6b0d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8258\u6435\u960f\u59ec\u6b0d\uc3e3$15(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\uff55\uc910\u7049\u8d98\u7af6\u3dd3, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(24709), ldc:int(-24726)))), getstatic:\u5140\u4c2b\u183a\u7330\u6435(\u5140\u4c2b\u183a\u7330\u6435::\ua068\u6cfe\u74b1\u62da\ub19c\uff55)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4d85\u71ae\u4c2b\u12cb\u836c\u6fb0$14(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u3504\u071d\uceb8\u7ce1\ufcaf\u72f1, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-12642), ldc:int(12640)))), invokestatic:boolean(BoolArgumentType::getBool, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(541), ldc:int(303))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub113\u8c8a\u5f50\ubff1\u7bad\uf995$13(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ubb2b\u4c2b\ud523\u759a\ud523\u6ec6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-11752), ldc:int(9509)))), invokestatic:boolean(BoolArgumentType::getBool, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(11277), ldc:int(16941))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5d20\u1187\ud36e\u6c56\uc2e8\u8413$12(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u4bc8\ud36e\uc9f6\u1187\u4cd9\u62da, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-22217), ldc:int(22088)))), invokestatic:TextFormatting(\u8d98\u3bd6\u3d4b\u3bc9\ub102::\u72f1\uc2bd\u0b8e\u156b\u59ec\u4f52, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(16651), ldc:int(10251))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ucef1\uc84e\u3711\ud51e\u8c8a\ub70c$11(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u1833\ubded\uc229\u946b\u8bb0\uc4d2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(25350), ldc:int(-26391)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(1039), ldc:int(1036))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubb2b\u88c5\ubb2b\u51fa\u0800\u69d9$10(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u494c\u759a\uc3e3\u1833\u5245\u7af6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(3079), ldc:int(103))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u71f1\u8413\u67e9\ub32d\u494c\u839e$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ua3b4\u8413\uc2e8\u3d64\u56bd\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-4683), ldc:int(4682)))), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(1026), ldc:int(1029))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8aa5\u3c25\u59ec\uc229\u61a4\u071d$8(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ua3b4\u8413\uc2e8\u3d64\u56bd\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(455), ldc:int(-1512)))), invokestatic:Set<String>[expected:Collection<String>](Collections::singleton, invokevirtual:String(\u7d52\u718f\u3776\u6fb0\ub83f::\u34df\u4f52\u1187\u6c52\ub1b9\uae87, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\u97e6\u4d85\ud36e\u8350\u92ee\u6b5f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u64ab\ubded\uf94d\u1187\ub7dc\u6bb9$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u8bb0\u516c\u62da\u3d4b\uc84e\ufe34, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(9570), ldc:int(-9572))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud12e\u4daf\uc2bd\ud523\ubf56\u8413$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\ua3b4\u527a\uc29a\u3776\ud36e\u965f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(15280), ldc:int(-15283))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6bb9\ua6bd\u47c2\u836c\u7c6b\u6b0d$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u88c5\ubb2b\u5654\uc3e3\ub19c\u4daf, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(10620), ldc:int(-27517)))), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(26887), ldc:int(659))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6c52\u3bc9\u3c25\u647c\ubff1\u527a$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u88c5\ubb2b\u5654\uc3e3\ub19c\u4daf, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-20382), ldc:int(19348))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u12cb\ubcb0\u64f2\u873d\u4492\ub113$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u516c\uc910\u0800\u718f\ub83f\u7049, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3e2a\u8413\ud12e\u4f4a\ud7e8(\u67d0\u416d\u7bad\uc3e3\u7d52::\ud158\u516c\uc7fe\u5bc4\u946b\u071d, p0:CommandContext, loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), and:int(ldc:int(-26661), ldc:int(26660))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u983f\u1187\u7af6\u9a18\u7d52\u64ab$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u7049\u8709\ua6bd\u3e2a\uf94d::\u8413\ub8be\u8413\u4daf\uc4d2\u64ab, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u9033\u183a\u5d20\u4975\u7e3f\u4daf$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(20498), ldc:int(10795))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u8c8a\u7873\ud171\u59ec\u6c56\u5bc4$0(java.lang.Object p0) {
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
            stack_85_1 = loadelement:String(getstatic:String[](\u7049\u8709\ua6bd\u3e2a\uf94d::\u1187\u4c04\u5db4\u1187\u0a06\u97b7), xor:int(ldc:int(287), ldc:int(303)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8193), ldc:int(8192)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(18526), ldc:int(-18911)), p0:Object)
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
    
    public void \u52d3\u0b8e\u1833\u62da\u8d98\u8308(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
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
        var_3_672 = and:int(ldc:int(256420888), ldc:int(1207688660))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\u8709\ua6bd\u3e2a\uf94d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1216479238))
            var_5_81 = and:int(ldc:int(5437), ldc:int(-13630))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3672), ldc:int(-20089)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(-436539528))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(4145), ldc:int(4144)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(16451), ldc:int(17)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(-1386431334))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(10561), ldc:int(17937)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(721057853))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1609620167))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(979246188))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1250955819))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1838487866))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1533449704))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-15071348))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1554831627))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2139880490))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(233623219))
                        var_11_EB = and:int(ldc:int(-14440), ldc:int(14407))
                        goto(Label_1499)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(492021811))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1995175651))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2041569498))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(904895707))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(514306695))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-517717497))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(142026514))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1364717301))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1398993682))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1513554089))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1705037115))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1895383624))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(355945670))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(499311373))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1071615997))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(18472), ldc:int(18473))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1582765344))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1505003138))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-997172913))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1384129456))
                        var_11_EB = and:int(ldc:int(11970), ldc:int(-11979))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1804394706))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-340550588))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(663326812))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1674296990))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-537293478))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-568705464))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-695084793))
                            goto(Label_1110)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1050140080))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(376939585))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1149277735))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-302264842))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1903164716))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-181419381))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1344614992))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1324898166))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-642371262))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-623154803))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1830293739))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(696788624))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-9200480))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(628740024))
                        var_17_67D = add:int(var_16_119:int, and:int(ldc:int(3341), ldc:int(4113)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(704832595))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-312496842))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, xor:int(ldc:int(12300), ldc:int(12301))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1320135762))
            goto(Label_0108)
        }
    }
}
