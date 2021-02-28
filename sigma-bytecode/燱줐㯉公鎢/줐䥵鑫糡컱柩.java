public class \u71f1\uc910\u3bc9\u516c\u93a2.\uc910\u4975\u946b\u7ce1\ucef1\u67e9 {
    public void \uc910\u4975\u946b\u7ce1\ucef1\u67e9(\u51fa\u12cb\u7330\u74b1\u6c52.\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06 p0) {
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
            putfield:\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06(\uc910\u4975\u946b\u7ce1\ucef1\u67e9::\uff55\u0a06\u6d99\u5f50\u4d85\u6c56, this:\uc910\u4975\u946b\u7ce1\ucef1\u67e9, p0:\u8753\u4f4a\ufcaf\uafe7\u5245\u0a06)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uc910\u4975\u946b\u7ce1\ucef1\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private static void lambda$\u4ab3\u61a4\u927d\u759a\ub8be\u4f52$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_1_22F : int
        var_3_6D : int
        var_5_8A : boolean
        stack_24D_0 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 [generated]
        stack_1F8_0 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 [generated]
        stack_175_0 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 [generated]
        stack_FA_0 : \u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 [generated]
        stack_175_1 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean> [generated]
        stack_FA_1 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean> [generated]
        stack_1F8_1 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean> [generated]
        stack_24D_1 : \u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean> [generated]
        stack_172_0 : int [generated]
        stack_F7_0 : int [generated]
        stack_1F5_0 : int [generated]
        stack_24A_0 : int [generated]
        
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
            var_1_22F = and:int(ldc:int(-1648815764), ldc:int(1034614620))
            var_3_6D = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
            invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))))
            var_5_8A = invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u7ce1\uc238\u946b\ubb2b\ua6bd\u12b2, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), invokestatic:Integer(Integer::valueOf, and:int(ldc:int(16513), ldc:int(5153))))
            stack_24D_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_1F8_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_FA_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_1 = stack_FA_1 = stack_1F8_1 = stack_24D_1 = getstatic(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)
            
            if (cmpeq:boolean(var_3_6D:int, ldc:int(0))) {
                stack_172_0 = stack_F7_0 = stack_1F5_0 = and(ldc(1039), ldc(8529))
                goto(Label_0220)
            }
            
            Label_0165:
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0534)
            }
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(1024)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(489497007))
                goto(Label_0403)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0280)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(2046055398))
            stack_172_0 = stack_F7_0 = stack_1F5_0 = and(ldc(3912), ldc(-3913))
            Label_0220:
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0466)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(64)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(2021268427))
                goto(Label_0343)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(1562629077))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, stack_FA_0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, stack_FA_1:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>, invokestatic:Boolean(Boolean::valueOf, stack_F7_0:boolean[expected:int]))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, var_5_8A:boolean))
            stack_24D_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_1F8_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_FA_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_1 = stack_FA_1 = stack_1F8_1 = stack_24D_1 = getstatic(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)
            
            if (cmpeq:boolean(var_3_6D:int, and:int(ldc:int(2049), ldc:int(29761)))) {
                stack_172_0 = stack_F7_0 = stack_1F5_0 = xor(ldc(516), ldc(517))
                goto(Label_0343)
            }
            
            Label_0280:
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(536870912)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(-694394599))
                goto(Label_0534)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(2001150682))
                goto(Label_0403)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(1491408749))
            stack_172_0 = stack_F7_0 = stack_1F5_0 = and(ldc(24930), ldc(-24939))
            Label_0343:
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0466)
            }
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(1024)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(1259617968))
                goto(Label_0220)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(-1699785356))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, stack_175_0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, stack_175_1:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>, invokestatic:Boolean(Boolean::valueOf, stack_172_0:boolean[expected:int]))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, var_5_8A:boolean))
            stack_24D_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_1F8_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_FA_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_1 = stack_FA_1 = stack_1F8_1 = stack_24D_1 = getstatic(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)
            
            if (cmpeq:boolean(var_3_6D:int, and:int(ldc:int(4138), ldc:int(16706)))) {
                stack_172_0 = stack_F7_0 = stack_1F5_0 = and(ldc(517), ldc(7433))
                goto(Label_0466)
            }
            
            Label_0403:
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(562921260))
                goto(Label_0534)
            }
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0280)
            }
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(1024)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(-1522861530))
                goto(Label_0165)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(-1167108241))
            stack_172_0 = stack_F7_0 = stack_1F5_0 = and(ldc(-25612), ldc(24587))
            Label_0466:
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(172978773))
                goto(Label_0343)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(256)), ldc:int(0))) {
                var_1_22F = and:int(var_1_22F:int, ldc:int(678931901))
                goto(Label_0220)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(531463015))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, stack_1F8_0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, stack_1F8_1:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>, invokestatic:Boolean(Boolean::valueOf, stack_1F5_0:boolean[expected:int]))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, var_5_8A:boolean))
            stack_24D_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_1F8_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_FA_0 = p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4
            stack_175_1 = stack_FA_1 = stack_1F8_1 = stack_24D_1 = getstatic(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)
            
            if (cmpeq:boolean(var_3_6D:int, xor:int(ldc:int(-26590), ldc:int(-26591)))) {
                stack_24A_0 = and:int(ldc:int(481), ldc:int(15373))
                goto(Label_0581)
            }
            
            Label_0534:
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0403)
            }
            
            if (cmpeq:boolean(and:int(var_1_22F:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0280)
            }
            
            if (cmpne:boolean(and:int(var_1_22F:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            var_1_22F = and:int(var_1_22F:int, ldc:int(-97701003))
            stack_24A_0 = and:int(ldc:int(8438), ldc:int(-8440))
            Label_0581:
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, stack_24D_0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, stack_24D_1:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>, invokestatic:Boolean(Boolean::valueOf, stack_24A_0:boolean[expected:int]))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, var_5_8A:boolean))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_619 : int
        
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
        var_3_60E = and:int(ldc:int(-1011782545), ldc:int(-1484149770))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc910\u4975\u946b\u7ce1\ucef1\u67e9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
            var_3_60E = and:int(var_3_60E:int, ldc:int(1337290103))
            var_5_7D = and:int(ldc:int(28876), ldc:int(-28877))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17597), ldc:int(-20158)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60E:int, ldc:int(663613806))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(25163), ldc:int(2065)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(4099), ldc:int(8209)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60E = and:int(var_3_CA:int, ldc:int(-2084491138))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32064), ldc:int(-32063)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1280448885))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1179574531))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2022772739))
                    }
                    else {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-942985609))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(803031103))
                        goto(Label_1464)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(532395788))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1766094507))
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1878085605))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1502806425))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1267694127))
                            var_11_DB = and:int(ldc:int(26638), ldc:int(-26959))
                            goto(Label_1453)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-187300911))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-282756438))
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-2037915452))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1168964380))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-465513048))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(599238511))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1920066256))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1782490450))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1944577007))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1477160125))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1877948774))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1770180280))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1000781211))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-435241918))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1869957186))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1860331787))
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1950110786))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-32752), ldc:int(-32751))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1068792631))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(239379711))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1943112468))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1213576911))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1913339133))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-336763666))
                        var_11_DB = and:int(ldc:int(-25041), ldc:int(24784))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1065274383))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(58581540))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1755031531))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1574782683))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-2026189538))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-449897589))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1276972440))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2007461822))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1334)
                            }
                        }
                    }
                    
                    Label_1180:
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(170718096))
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1529957414))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(491858682))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1146080535))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(613678575))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(-1294005164))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(1194902010))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60E = and:int(var_3_60E:int, ldc:int(397110271))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1453)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1464)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(2039071121))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1933197260))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1439729768))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60E = and:int(var_3_60E:int, ldc:int(734358503))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1453:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_619 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1464:
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(976354880))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1180)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(1851461121))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60E = and:int(var_3_60E:int, ldc:int(-1951194969))
                        var_17_619 = add:int(var_16_109:int, and:int(ldc:int(4201), ldc:int(8193)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60E = and:int(var_3_60E:int, ldc:int(-1149141001))
                
                if (cmple:boolean(var_5_7D = var_17_619:int, sub:int(var_6_84:int, and:int(ldc:int(10241), ldc:int(4137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60E:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
