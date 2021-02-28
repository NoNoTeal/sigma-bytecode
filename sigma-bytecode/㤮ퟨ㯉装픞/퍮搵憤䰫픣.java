public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\ud36e\u6435\u61a4\u4c2b\ud523 {
    public void \ud36e\u6435\u61a4\u4c2b\ud523() {
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
            invokespecial:Object(Object::<init>, this:\ud36e\u6435\u61a4\u4c2b\ud523)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7af6\u3bd6\ub1b9\u62da\u6ec6\u5d20(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u416d\uf995\uae87\uf995\u3776\u600f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23> p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u4ab3\uc31c\u494c\u34df\ube23 p5) {
        var_6_61 : int
        var_8_6C : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_9_77 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_10_83 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_6_92 : int
        var_11_A5 : int
        var_6_2F6 : int
        var_12_B9 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_13_123 : ArrayList
        var_14_128 : ArrayList
        var_15_12D : ArrayList
        var_16_132 : LinkedList
        var_17_15C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_18_163 : int
        var_19_1E0 : int
        var_20_228 : int
        var_21_278 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_22_281 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_23_295 : \u839e\u8389\ua562\uc7fe\u76bc\ube23
        var_24_29C : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_25_2C3 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_6_3AF : int
        var_18_39E : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_19_3F1 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_18_3DE : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_6_19F : int
        var_18_1A4 : ArrayList
        var_19_1C9 : List
        var_20_1D2 : Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>
        var_21_48B : \u3d4b\u59ec\u6fb0\uc87f\ud158
        var_6_4EA : int
        var_20_46F : int
        var_21_478 : Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>
        var_22_506 : \u3d4b\u59ec\u6fb0\uc87f\ud158
        var_21_4F3 : Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>
        var_22_58E : \u3d4b\u59ec\u6fb0\uc87f\ud158
        var_23_59A : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_21_57B : Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>
        var_22_6D3 : \u3d4b\u59ec\u6fb0\uc87f\ud158
        stack_6B2_1 : String [generated]
        expr_6A1 : Object[] [generated]
        
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
        var_6_61 = and:int(ldc:int(-1017285189), ldc:int(1434449329))
        var_8_6C = initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        var_9_77 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uf9c5\u6b0d\u4bc8\u3e2a\ud36e\u40a9, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))
        var_10_83 = initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_9_77:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        
        if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u4ab3\uc31c\u494c\u34df\ube23::\ubcb0\uc910\u7e3f\uc4d2\u965f\u4c2b, p5:\u4ab3\uc31c\u494c\u34df\ube23)), invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ucef1\u3711\u0b8e\u6d69\u6b0d\u7e3f, var_10_83:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ud36e\u6435\u61a4\u4c2b\ud523::\u392e\u97e6\u156b\u0b8e\u4975\uc31c)))
        }
        
        var_6_92 = and:int(var_6_61:int, ldc:int(-604014855))
        var_11_A5 = mul:int(mul:int(invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4d85\u34df\u4bc8\u72f1\ubded\ub7dc, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc9f6\ub83f\u7330\ufe34\u8258\ucfaf, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))
        
        if (cmpgt:boolean(var_11_A5:int, ldc:int(32768))) {
            athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\ud36e\u6435\u61a4\u4c2b\ud523::\u4bc8\u8df4\ud7e8\ud7e8\u718f\u8413), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(32768)), invokestatic:Integer(Integer::valueOf, var_11_A5:int)))
        }
        
        var_6_2F6 = and:int(var_6_92:int, ldc:int(-1018202441))
        var_12_B9 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (logicalnot:boolean(logicaland:boolean(invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uc31c\u6c52\u5bc4\ud523\u64f2\ub6ab, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uc31c\u6c52\u5bc4\ud523\u64f2\ub6ab, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_9_77:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u839e\u4cd9\u7e3f\uc910\u97e6\u8aa5)))
        }
        
        var_13_123 = invokestatic:ArrayList(Lists::newArrayList)
        var_14_128 = invokestatic:ArrayList(Lists::newArrayList)
        var_15_12D = invokestatic:ArrayList(Lists::newArrayList)
        var_16_132 = invokestatic:LinkedList(Lists::newLinkedList)
        var_17_15C = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_10_83:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_10_83:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_10_83:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)))
        var_18_163 = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
        
        loop {
            if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(16777216)), ldc:int(0))) {
                var_6_2F6 = and:int(var_6_2F6:int, ldc:int(-204638279))
                
                if (cmple:boolean(var_18_163:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                    var_19_1E0 = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(128)), ldc:int(0))) {
                            var_6_2F6 = and:int(var_6_2F6:int, ldc:int(-916619335))
                            
                            if (cmple:boolean(var_19_1E0:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                                var_20_228 = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                                
                                loop {
                                    if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(16)), ldc:int(0))) {
                                        var_6_2F6 = and:int(var_6_2F6:int, ldc:int(-178391631))
                                        
                                        if (cmple:boolean(var_20_228:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                                            var_21_278 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_20_228:int, var_19_1E0:int, var_18_163:int)
                                            var_22_281 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_17_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                                            var_23_295 = initobject:\u839e\u8389\ua562\uc7fe\u76bc\ube23(\u839e\u8389\ua562\uc7fe\u76bc\ube23::<init>, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(-12752), ldc:int(4303)))
                                            var_24_29C = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u839e\u8389\ua562\uc7fe\u76bc\ube23::\u8308\u647c\uc4d2\uafe7\u965f\u120d, var_23_295:\u839e\u8389\ua562\uc7fe\u76bc\ube23)
                                            
                                            if (invokeinterface:boolean(Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>::test, p4:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>, var_23_295:\u839e\u8389\ua562\uc7fe\u76bc\ube23)) {
                                                var_25_2C3 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                                
                                                if (cmpeq:boolean(var_25_2C3:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                                                    loop {
                                                        if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(4096)), ldc:int(0))) {
                                                            var_6_2F6 = and:int(var_6_2F6:int, ldc:int(231603389))
                                                            
                                                            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ud523\u88c5\ua6bd\ud7e8\ua61f\u56bd, var_24_29C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                                if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7e3f\u6bb9\u16f6\ub8be\u6ec6\u516c, var_24_29C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                                    invokeinterface:boolean(List<?>::add, var_15_12D:ArrayList<?>[expected:List<?>], initobject:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u3d4b\u59ec\u6fb0\uc87f\ud158::<init>, var_22_281:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_24_29C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())))
                                                                    invokeinterface:void(Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::addFirst, var_16_132:LinkedList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                                                    looporswitchbreak()
                                                                }
                                                            }
                                                        }
                                                        
                                                        if (cmpeq:boolean(and:int(var_6_2F6:int, ldc:int(134217728)), ldc:int(0))) {
                                                            var_6_2F6 = and:int(var_6_2F6:int, ldc:int(661650871))
                                                            invokeinterface:boolean(List<?>::add, var_13_123:ArrayList<?>[expected:List<?>], initobject:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u3d4b\u59ec\u6fb0\uc87f\ud158::<init>, var_22_281:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_24_29C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())))
                                                            invokeinterface:void(Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::addLast, var_16_132:LinkedList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                                            looporswitchbreak()
                                                        }
                                                        
                                                        var_6_2F6 = and:int(var_6_2F6:int, ldc:int(-622344539))
                                                    }
                                                }
                                                else {
                                                    invokeinterface:boolean(List<?>::add, var_14_128:ArrayList<Object>[expected:List<?>], initobject:?(\u3d4b\u59ec\u6fb0\uc87f\ud158::<init>, var_22_281:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_24_29C:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, var_25_2C3:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))))
                                                    invokeinterface:void(Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::addLast, var_16_132:LinkedList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Deque<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_21_278:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                                }
                                            }
                                            
                                            var_6_2F6 = and:int(var_6_2F6:int, ldc:int(1230862257))
                                            inc:int(var_20_228, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_2F6:int, ldc:int(8388608)), ldc:int(0))) {
                                        looporswitchbreak()
                                    }
                                    
                                    var_6_2F6 = and:int(var_6_2F6:int, ldc:int(71486533))
                                }
                                
                                var_6_2F6 = and:int(var_6_2F6:int, ldc:int(1800404989))
                                inc:int(var_19_1E0, ldc:int(1))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(16777216)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_6_2F6 = and:int(var_6_2F6:int, ldc:int(-1271120653))
                    }
                    
                    var_6_2F6 = and:int(var_6_2F6:int, ldc:int(2079194865))
                    inc:int(var_18_163, ldc:int(1))
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_6_2F6:int, ldc:int(8192)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        var_6_3AF = and:int(var_6_2F6:int, ldc:int(1230993085))
        
        if (cmpeq:boolean(p5:\u4ab3\uc31c\u494c\u34df\ube23, getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\uae87\u983f\u6d69\u12cb\u4975\uf94d))) {
            var_18_39E = invokeinterface:Iterator<Object>(Deque<Object>::iterator, var_16_132:LinkedList<Object>[expected:Deque<Object>])
            
            loop {
                if (cmpne:boolean(and:int(var_6_3AF:int, ldc:int(16777216)), ldc:int(0))) {
                    var_6_3AF = and:int(var_6_3AF:int, ldc:int(-302025481))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_18_39E:Iterator)) {
                        var_19_3F1 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_18_39E:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                        invokestatic:void(\u16f6\ub7dc\u8bb0\ufcaf\u67e9::\u946b\u3bc9\u718f\u3dd3\ub171\u6ec6, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_19_3F1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                        invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_19_3F1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u416d\u1187\ud171\uafe7\u92ee\u6c56)), xor:int(ldc:int(37), ldc:int(39)))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_6_3AF:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_6_3AF = and:int(var_6_3AF:int, ldc:int(1316157040))
            }
            
            var_6_3AF = and:int(var_6_3AF:int, ldc:int(2079324145))
            var_18_3DE = invokeinterface:Iterator<Object>(Deque<Object>::iterator, var_16_132:LinkedList<Object>[expected:Deque<Object>])
            
            while (invokeinterface:boolean(Iterator::hasNext, var_18_3DE:Iterator)) {
                invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_18_3DE:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)), and:int(ldc:int(19), ldc:int(18699)))
            }
        }
        
        var_6_19F = and:int(var_6_3AF:int, ldc:int(2139092727))
        var_18_1A4 = invokestatic:ArrayList(Lists::newArrayList)
        invokeinterface:boolean(List<Object>::addAll, var_18_1A4:ArrayList<Object>[expected:List<Object>], var_13_123:ArrayList<?>[expected:Collection<?>])
        invokeinterface:boolean(List<Object>::addAll, var_18_1A4:ArrayList<Object>[expected:List<Object>], var_14_128:ArrayList<Object>[expected:Collection<?>])
        invokeinterface:boolean(List<Object>::addAll, var_18_1A4:ArrayList<Object>[expected:List<Object>], var_15_12D:ArrayList<?>[expected:Collection<?>])
        var_19_1C9 = invokestatic:List(Lists::reverse, var_18_1A4:ArrayList<\u3d4b\u59ec\u6fb0\uc87f\ud158>[expected:List])
        var_20_1D2 = invokeinterface:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>(List<\u3d4b\u59ec\u6fb0\uc87f\ud158>::iterator, var_19_1C9:List<\u3d4b\u59ec\u6fb0\uc87f\ud158>)
        
        while (invokeinterface:boolean(Iterator::hasNext, var_20_1D2:Iterator)) {
            var_21_48B = checkcast:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3d4b\u59ec\u6fb0\uc87f\ud158.class, invokeinterface:\u3d4b\u59ec\u6fb0\uc87f\ud158(Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>::next, var_20_1D2:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>))
            invokestatic:void(\u16f6\ub7dc\u8bb0\ufcaf\u67e9::\u946b\u3bc9\u718f\u3dd3\ub171\u6ec6, invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_21_48B:\u3d4b\u59ec\u6fb0\uc87f\ud158)))
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_21_48B:\u3d4b\u59ec\u6fb0\uc87f\ud158), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u416d\u1187\ud171\uafe7\u92ee\u6c56)), xor:int(ldc:int(1281), ldc:int(1283)))
        }
        
        var_6_4EA = and:int(var_6_19F:int, ldc:int(-1242728969))
        var_20_46F = and:int(ldc:int(-23318), ldc:int(6677))
        var_21_478 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_18_1A4:ArrayList<Object>[expected:List<Object>])
        
        while (invokeinterface:boolean(Iterator::hasNext, var_21_478:Iterator)) {
            var_22_506 = checkcast:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3d4b\u59ec\u6fb0\uc87f\ud158.class, invokeinterface:\u3d4b\u59ec\u6fb0\uc87f\ud158(Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>::next, var_21_478:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>))
            
            if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_506:\u3d4b\u59ec\u6fb0\uc87f\ud158), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u8640\uf9c5\u183a\u416d\ubefe\u8aa5, var_22_506:\u3d4b\u59ec\u6fb0\uc87f\ud158), and:int(ldc:int(10454), ldc:int(4355)))) {
                inc:int(var_20_46F, ldc:int(1))
            }
            
            var_6_4EA = and:int(var_6_4EA:int, ldc:int(1674442231))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_6_4EA:int, ldc:int(16384)), ldc:int(0))) {
                var_6_4EA = and:int(var_6_4EA:int, ldc:int(1398606216))
                goto(Label_1612)
            }
            
            if (cmpeq:boolean(and:int(var_6_4EA:int, ldc:int(67108864)), ldc:int(0))) {
                var_6_4EA = and:int(var_6_4EA:int, ldc:int(-538970883))
                var_21_4F3 = invokeinterface:Iterator<Object>(List<Object>::iterator, var_14_128:ArrayList<Object>[expected:List<Object>])
                
                while (invokeinterface:boolean(Iterator::hasNext, var_21_4F3:Iterator)) {
                    var_22_58E = checkcast:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3d4b\u59ec\u6fb0\uc87f\ud158.class, invokeinterface:\u3d4b\u59ec\u6fb0\uc87f\ud158(Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>::next, var_21_4F3:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>))
                    var_23_59A = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158))
                    
                    if (cmpne:boolean(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u3d4b\u59ec\u6fb0\uc87f\ud158::\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                        if (cmpne:boolean(var_23_59A:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u3d4b\u59ec\u6fb0\uc87f\ud158::\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(13), ldc:int(6))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158)))
                            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u3d4b\u59ec\u6fb0\uc87f\ud158::\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(8273), ldc:int(8285))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158)))
                            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u3d4b\u59ec\u6fb0\uc87f\ud158::\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(671), ldc:int(1325))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158)))
                            invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u156b\u3dd3\u8d90\u8350\ud523\u836c, var_23_59A:\ub83f\uc9f6\u47c2\u67d0\u7ce1, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u8640\uf9c5\u183a\u416d\ubefe\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), getfield:\uc31c\uc87f\uc246\u3776\ub7dc(\u3d4b\u59ec\u6fb0\uc87f\ud158::\ub7dc\u8d98\u960f\u385b\u64ab\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158))
                            invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6d69\uc229\ubefe\ua3b4\u6c52\u5654, var_23_59A:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                        }
                    }
                    
                    var_6_4EA = and:int(var_6_4EA:int, ldc:int(-134349377))
                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u8640\uf9c5\u183a\u416d\ubefe\u8aa5, var_22_58E:\u3d4b\u59ec\u6fb0\uc87f\ud158), and:int(ldc:int(14434), ldc:int(1154)))
                }
            }
            
            Label_1348:
            
            if (cmpeq:boolean(and:int(var_6_4EA:int, ldc:int(1)), ldc:int(0))) {
                var_6_4EA = and:int(var_6_4EA:int, ldc:int(1787276431))
            }
            else {
                if (cmpeq:boolean(and:int(var_6_4EA:int, ldc:int(128)), ldc:int(0))) {
                    var_6_4EA = and:int(var_6_4EA:int, ldc:int(-391984339))
                    loopcontinue()
                }
                
                var_6_4EA = and:int(var_6_4EA:int, ldc:int(-1988102221))
                var_21_57B = invokeinterface:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>(List<\u3d4b\u59ec\u6fb0\uc87f\ud158>::iterator, var_19_1C9:List<\u3d4b\u59ec\u6fb0\uc87f\ud158>)
                
                while (invokeinterface:boolean(Iterator::hasNext, var_21_57B:Iterator)) {
                    var_22_6D3 = checkcast:\u3d4b\u59ec\u6fb0\uc87f\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u3d4b\u59ec\u6fb0\uc87f\ud158.class, invokeinterface:\u3d4b\u59ec\u6fb0\uc87f\ud158(Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>::next, var_21_57B:Iterator<\u3d4b\u59ec\u6fb0\uc87f\ud158>))
                    invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u8aa5\uc910\ud217\u5db4\uafe7, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u6b0d\u97b7\u12b2\ubf56\u88c5\u7043, var_22_6D3:\u3d4b\u59ec\u6fb0\uc87f\ud158), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u3d4b\u59ec\u6fb0\uc87f\ud158::\u8640\uf9c5\u183a\u416d\ubefe\u8aa5, var_22_6D3:\u3d4b\u59ec\u6fb0\uc87f\ud158)))
                }
            }
            
            Label_1612:
            
            if (cmpne:boolean(and:int(var_6_4EA:int, ldc:int(67108864)), ldc:int(0))) {
                var_6_4EA = and:int(var_6_4EA:int, ldc:int(490381614))
                goto(Label_1348)
            }
            
            if (cmpne:boolean(and:int(var_6_4EA:int, ldc:int(32)), ldc:int(0))) {
                looporswitchbreak()
            }
        }
        
        invokevirtual:void(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\ub19c\uc229\u071d\u40a9\u6b5f\u8308, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\uff55\ub8be\u385b\u92ee\u7330, var_12_B9:\ube23\uc238\u5140\u4cd9\u8aa5), var_8_6C:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_17_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (cmpne:boolean(var_20_46F:int, ldc:int(0))) {
            stack_6B2_1 = loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(8466), ldc:int(8476)))
            expr_6A1 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18592), ldc:int(18593)))
            storeelement:Object(expr_6A1:Object[], and:int(ldc:int(-16246), ldc:int(10053)), invokestatic:Integer[expected:Object](Integer::valueOf, var_20_46F:int))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_6B2_1:String, expr_6A1:Object[]), and:int[expected:boolean](ldc:int(537), ldc:int(2211)))
            return:int(var_20_46F:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ud36e\u6435\u61a4\u4c2b\ud523::\u1187\ub113\u873d\u8413\u836c\u12b2)))
    }
    
    private static int lambda$\u416d\uf9c5\u3776\uceb8\ubefe\u8d98$20(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(9243), ldc:int(4225)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(72), ldc:int(74)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(4875), ldc:int(16403)))), invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(3078), ldc:int(3084)))), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uf9c5\u3776\u718f\u7bad\ub32d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5654\u8df4\u8c8a\u946b\u8389\u71ae$19(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(1576), ldc:int(1577)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(2563), ldc:int(1030)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(16472), ldc:int(16475)))), invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(517), ldc:int(527)))), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\uae87\u983f\u6d69\u12cb\u4975\uf94d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7d52\u6c56\ua3b4\ub32d\u71ae\u527a$18(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(33), ldc:int(7303)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(8338), ldc:int(24138)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(4992), ldc:int(4995)))), invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(58), ldc:int(2638)))), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u0b8e\u392e\u446c\ub18d\ud217\u7e3f$17(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(257), ldc:int(29217)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(8965), ldc:int(8967)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(12299), ldc:int(12296)))), invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(21513), ldc:int(21507)))), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uf9c5\u3776\u718f\u7bad\ub32d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ua068\u71f1\u183a\u624e\u3c25\uc910$16(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(839), ldc:int(28801)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(576), ldc:int(578)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(627), ldc:int(20491)))), getstatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\ud36e\u6435\u61a4\u4c2b\ud523::\ud36e\u34df\u3e2a\ud217\uc229\ua61f), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uf9c5\u3776\u718f\u7bad\ub32d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub18d\u16f6\u4975\u385b\u600f\ub8be$15(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(1157), ldc:int(1156)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(17370), ldc:int(38)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(-28599), ldc:int(-28598)))), getstatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\ud36e\u6435\u61a4\u4c2b\ud523::\ud36e\u34df\u3e2a\ud217\uc229\ua61f), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\uae87\u983f\u6d69\u12cb\u4975\uf94d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub6ab\uc3e3\u416d\u3bd6\ua068\uc2bd$14(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(5138), ldc:int(5139)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(2190), ldc:int(16434)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(35), ldc:int(20099)))), getstatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\ud36e\u6435\u61a4\u4c2b\ud523::\ud36e\u34df\u3e2a\ud217\uc229\ua61f), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uc9f6\u4e72\u1187\u8308\ubb2b)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub70c\u1833\u64f2\u183a\u3dd3\ud36e$13(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud36e\u6435\u61a4\u4c2b\ud523::\u416d\uf995\uae87\uf995\u3776\u600f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(25), ldc:int(451)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(16641), ldc:int(16643)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), xor:int(ldc:int(578), ldc:int(577)))), getstatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\ud36e\u6435\u61a4\u4c2b\ud523::\ud36e\u34df\u3e2a\ud217\uc229\ua61f), getstatic:\u4ab3\uc31c\u494c\u34df\ube23(\u4ab3\uc31c\u494c\u34df\ube23::\u8df4\uf9c5\u3776\u718f\u7bad\ub32d)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u946b\u8d90\u4c04\uae87\u3bd6\u6ec6$12(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u7ce1\u9a18\u965f\uae87\u88c5\u8df4$11(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(10469), ldc:int(21505)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc246\u527a\u965f\u5bc4\u5654\u2dcc$10(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\ua6bd\uae87\u3776\u88c5\uf995\u9033$9(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(284), ldc:int(285)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7ce1\u600f\u946b\ub8be\u4ab3\ubf56$8(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u120d\u3bc9\u8389\uae5d\uc84e\u6d99$7(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(16448), ldc:int(16449)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8413\u3711\u7e3f\u6b5f\uae87\u64ab$6(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u8389\ubf56\u8258\ubded\u9af2\u416d$5(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(13505), ldc:int(1)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc2e8\uceb8\u8709\ua562\u946b\u836c$4(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\uc9f6\u4d85\u8350\u5bc4\u61a4\u5f50$3(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(24576), ldc:int(24577)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3711\u51fa\u6435\uc29a\u494c\ud36e$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(776), ldc:int(778))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud7e8\ub1b9\u071d\u7873\u71ae\u52d3$1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23 p0) {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1461825998), ldc:int(-1393661256))
            
            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u839e\u8389\ua562\uc7fe\u76bc\ube23::\u8308\u647c\uc4d2\uafe7\u965f\u120d, p0:\u839e\u8389\ua562\uc7fe\u76bc\ube23))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1412509954))
                stack_8D_0 = and:int(ldc:int(20597), ldc:int(-22646))
            }
            else {
                stack_8D_0 = and:int(ldc:int(27933), ldc:int(4259))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u97e6\u9937\ua562\u6d99\u4975\uc84e$0(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
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
            stack_8F_1 = loadelement:String(getstatic:String[](\ud36e\u6435\u61a4\u4c2b\ud523::\ub6ab\ucfaf\u4c04\ub171\ud51e\u6bb9), and:int(ldc:int(16431), ldc:int(2127)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(12294), ldc:int(1154)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(9545), ldc:int(-11594)), p0:Object)
            storeelement:Object(expr_78:Object[], xor:int(ldc:int(16640), ldc:int(16641)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
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
    
    public void \ubff1\u4f4a\u392e\u6fb0\u6fb0\u3a62(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-1117910426), ldc:int(557235910))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud36e\u6435\u61a4\u4c2b\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-195057085))
            var_5_81 = and:int(ldc:int(-7879), ldc:int(7812))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2332), ldc:int(2330)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67B:int, ldc:int(1614752591))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(13521), ldc:int(9)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(16784), ldc:int(16785)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DA:int, ldc:int(616009666))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(2640), ldc:int(2641)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1463790533))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(320535334))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(683302746))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2090517836))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2029198560))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1780193334))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(486456302))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-540428474))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1848414011))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(79985737))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1003777572))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1826053955))
                            var_11_EB = and:int(ldc:int(-12644), ldc:int(4449))
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-431897121))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1841847389))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1431826399))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-573106174))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1616550404))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(225921874))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(263026951))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(756902768))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-129751513))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2045927634))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1295507270))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(22025), ldc:int(10405))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(570019531))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-103404120))
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(118020477))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-557811293))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1676653620))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1142311551))
                        var_11_EB = and:int(ldc:int(6326), ldc:int(-6327))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(974763806))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1250282338))
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1899034372))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1215553554))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1501024246))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1235:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(999331162))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(17351673))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(401807609))
                            goto(Label_1110)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(267189427))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-2060888915))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1469489771))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1433556337))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1069468391))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1535)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1155292425))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(351848667))
                        goto(Label_1235)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-874788715))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1010115144))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(2004228802))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1391817992))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1235)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(320347520))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(851985091))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(336506641))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-675393689))
                        var_17_686 = add:int(var_16_119:int, and:int(ldc:int(1089), ldc:int(155)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-1572889918))
                
                if (cmple:boolean(var_5_81 = var_17_686:int, sub:int(var_6_88:int, xor:int(ldc:int(12804), ldc:int(12805))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1745273412))
            goto(Label_0108)
        }
    }
}
