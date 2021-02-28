public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3e75\u12cb\u0c95\ub102\u385b\ub113 {
    public void \u3e75\u12cb\u0c95\ub102\u385b\ub113(boolean p0) {
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
    
    public boolean equals(java.lang.Object p0) {
        var_2_CC : int
        stack_E7_0 : int [generated]
        
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
        var_2_CC = and:int(ldc:int(-1408975981), ldc:int(606730378))
        
        if (cmpeq:boolean(this:\u3e75\u12cb\u0c95\ub102\u385b\ub113[expected:Object], p0:Object)) {
            return:boolean(xor:int[expected:boolean](ldc:int(-32760), ldc:int(-32759)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(4096)), ldc:int(0))) {
                var_2_CC = and:int(var_2_CC:int, ldc:int(1164312246))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u3e75\u12cb\u0c95\ub102\u385b\ub113>(\u3e75\u12cb\u0c95\ub102\u385b\ub113::getClass, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        if (cmpne:boolean(getfield:boolean(\u3e75\u12cb\u0c95\ub102\u385b\ub113::\ubefe\ud7e8\u624e\u8d90\u3776\ubefe, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113), getfield:boolean(\u3e75\u12cb\u0c95\ub102\u385b\ub113::\ubefe\ud7e8\u624e\u8d90\u3776\ubefe, checkcast:\u3e75\u12cb\u0c95\ub102\u385b\ub113(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3e75\u12cb\u0c95\ub102\u385b\ub113.class, p0:Object[expected:\u3e75\u12cb\u0c95\ub102\u385b\ub113])))) {
                            var_2_CC = and:int(var_2_CC:int, ldc:int(-945111314))
                            stack_E7_0 = and:int(ldc:int(306), ldc:int(-307))
                        }
                        else {
                            stack_E7_0 = xor:int(ldc:int(1088), ldc:int(1089))
                        }
                        
                        return:boolean(stack_E7_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_CC:int, ldc:int(4096)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-27295), ldc:int(18590)))
            }
            
            var_2_CC = and:int(var_2_CC:int, ldc:int(-229239978))
        }
    }
    
    public int hashCode() {
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
            return:int(invokestatic:int(Boolean::hashCode, getfield:boolean(\u3e75\u12cb\u0c95\ub102\u385b\ub113::\ubefe\ud7e8\u624e\u8d90\u3776\ubefe, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
        var_1_5F : int
        stack_8F_0 : StringBuilder [generated]
        stack_8F_1 : String [generated]
        
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
            var_1_5F = and:int(ldc:int(2101495510), ldc:int(2066724850))
            stack_8F_0 = invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\u3e75\u12cb\u0c95\ub102\u385b\ub113::\ub83f\ub19c\u8350\u759a\u071d\u3504, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113)), ldc:char(91))
            
            if (logicalnot:boolean(getfield:boolean(\u3e75\u12cb\u0c95\ub102\u385b\ub113::\ubefe\ud7e8\u624e\u8d90\u3776\ubefe, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2144268095))
                stack_8F_1 = ldc:String("flat")
            }
            else {
                stack_8F_1 = ldc:String("smooth")
            }
            
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, stack_8F_0:StringBuilder, stack_8F_1:String), ldc:char(93))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u0a06\u4e72\u8308\u36d3\uf9c5\u4179$1() {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, xor:int(ldc:int(5558), ldc:int(2230)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3bc9\u8d90\u3dd3\u7006\u600f\u416d$0(boolean p0) {
        var_1_5F : int
        stack_83_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(509149528), ldc:int(-1778888230))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(375257596))
                stack_83_0 = and:int(ldc:int(15696), ldc:int(8064))
            }
            else {
                stack_83_0 = xor:int(ldc:int(-20131), ldc:int(-21412))
            }
            
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u7873\u4975\u4c2b\uc87f\ubded\u16f6, stack_83_0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_615 : int
        
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
        var_3_60A = and:int(ldc:int(1684233820), ldc:int(-408969379))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u12cb\u0c95\ub102\u385b\ub113[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_60A = and:int(var_3_60A:int, ldc:int(-343415730))
            var_5_7D = and:int(ldc:int(7106), ldc:int(-8163))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3247), ldc:int(3246)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60A:int, ldc:int(1741651951))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(2051), ldc:int(9793)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(21506), ldc:int(21507)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60A = and:int(var_3_D2:int, ldc:int(986125902))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(16473), ldc:int(2177)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(769897107))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1435526735))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-631699062))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1163967137))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-317684921))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-928744240))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(2142251878))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1227924065))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1627365997))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-942478110))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(2050428495))
                            var_11_E3 = and:int(ldc:int(-13210), ldc:int(13081))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1581900907))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-260331083))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1500059667))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(894908119))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(2088754048))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1149049039))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1391627096))
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-496810628))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1896751244))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(34623677))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(2069148886))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-227216061))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1893096849))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-789652653))
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-305961875))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-230710005))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-184324482))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-32446), ldc:int(-32445))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1618128389))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1602050155))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-77393502))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-113872271))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1538527873))
                        var_11_E3 = and:int(ldc:int(-5492), ldc:int(5490))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1196583164))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1809191722))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(424956571))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1183355478))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(557885663))
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1535639939))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1312)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-366010914))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(601973803))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(1631795351))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1095702450))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1440632791))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-211305026))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60A = and:int(var_3_60A:int, ldc:int(-1524375937))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1312:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1232404567))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-708372509))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(353885397))
                        loopcontinue()
                    }
                    
                    var_3_60A = and:int(var_3_60A:int, ldc:int(751541374))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_615 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-762292014))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-1027478130))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(1207555091))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60A = and:int(var_3_60A:int, ldc:int(-504678451))
                        var_17_615 = add:int(var_16_111:int, xor:int(ldc:int(92), ldc:int(93)))
                        looporswitchbreak()
                    }
                    
                    var_3_60A = and:int(var_3_60A:int, ldc:int(-1287200486))
                }
                
                var_3_60A = and:int(var_3_60A:int, ldc:int(583775966))
                
                if (cmple:boolean(var_5_7D = var_17_615:int, sub:int(var_6_84:int, and:int(ldc:int(8305), ldc:int(1157))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_60A:int, ldc:int(64)), ldc:int(0))) {
            var_3_60A = and:int(var_3_60A:int, ldc:int(-1744417438))
            goto(Label_0106)
        }
    }
}
