public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uc7fe\u8389\ub102\uc238\u3711\ucfaf {
    public void \uc7fe\u8389\ub102\uc238\u3711\ucfaf(java.util.OptionalDouble p0) {
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
        var_2_F6 : int
        stack_118_0 : int [generated]
        
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
        var_2_F6 = and:int(ldc:int(971054281), ldc:int(-1946714129))
        
        if (cmpne:boolean(this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf[expected:Object], p0:Object)) {
            loop {
                if (cmpne:boolean(and:int(var_2_F6:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0212)
                }
                
                if (cmpeq:boolean(and:int(var_2_F6:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_F6 = and:int(var_2_F6:int, ldc:int(895448143))
                }
                else {
                    var_2_F6 = and:int(var_2_F6:int, ldc:int(535936953))
                    
                    if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                        if (cmpeq:boolean(invokevirtual:Class<? extends \uc7fe\u8389\ub102\uc238\u3711\ucfaf>(\uc7fe\u8389\ub102\uc238\u3711\ucfaf::getClass, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                            if (invokespecial:boolean(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::equals, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf[expected:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4], p0:Object)) {
                                goto(Label_0212)
                            }
                            
                            stack_118_0 = and:int(ldc:int(-3047), ldc:int(2918))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0132:
                
                if (cmpne:boolean(and:int(var_2_F6:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_F6:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_F6 = and:int(var_2_F6:int, ldc:int(-1197552414))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(-15565), ldc:int(10444)))
                }
                
                Label_0212:
                
                if (cmpeq:boolean(and:int(var_2_F6:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_F6 = and:int(var_2_F6:int, ldc:int(1544269531))
                    goto(Label_0132)
                }
                
                if (cmpne:boolean(and:int(var_2_F6:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_F6 = and:int(var_2_F6:int, ldc:int(-1342210663))
                    stack_118_0 = invokestatic:boolean[expected:int](Objects::equals, getfield:OptionalDouble[expected:Object](\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\u3bc9\u2dcc\u760c\u3e2a\u3776\u40a9, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf), getfield:OptionalDouble[expected:Object](\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\u3bc9\u2dcc\u760c\u3e2a\u3776\u40a9, checkcast:\uc7fe\u8389\ub102\uc238\u3711\ucfaf(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uc7fe\u8389\ub102\uc238\u3711\ucfaf.class, p0:Object[expected:\uc7fe\u8389\ub102\uc238\u3711\ucfaf])))
                    looporswitchbreak()
                }
                
                var_2_F6 = and:int(var_2_F6:int, ldc:int(-935767707))
            }
            
            return:boolean(stack_118_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(8233), ldc:int(8232)))
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
            return:int(invokestatic:int(\u6c56\uafe7\uf995\ud523\u7006\u6b0d::\u7049\uae87\ubded\u927d\uc3e3\u3a62, invokespecial:int(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::hashCode, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf[expected:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4]), getfield:OptionalDouble[expected:Object](\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\u3bc9\u2dcc\u760c\u3e2a\u3776\u40a9, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf)))
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\ub83f\ub19c\u8350\u759a\u071d\u3504, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf)), ldc:char(91)), ternaryop:Serializable[expected:Object](invokevirtual:boolean(OptionalDouble::isPresent, getfield:OptionalDouble(\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\u3bc9\u2dcc\u760c\u3e2a\u3776\u40a9, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf)), invokestatic:Double[expected:Serializable](Double::valueOf, invokevirtual:double(OptionalDouble::getAsDouble, getfield:OptionalDouble(\uc7fe\u8389\ub102\uc238\u3711\ucfaf::\u3bc9\u2dcc\u760c\u3e2a\u3776\u40a9, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf))), ldc:String[expected:Serializable]("window_scale"))), ldc:char(93))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u873d\ua3b4\ua61f\u836c\u59ec\u8bb0$1(java.util.OptionalDouble p0) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, p0:OptionalDouble[expected:Object], invokestatic:OptionalDouble[expected:Object](OptionalDouble::of, ldc:double(1.0))))) {
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, ldc:float(1.0f))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6d69\u7330\u3bd6\ub8be\ub70c\u88c5$0(java.util.OptionalDouble p0) {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(2069825055), ldc:int(-1646375489))
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, p0:OptionalDouble[expected:Object], invokestatic:OptionalDouble[expected:Object](OptionalDouble::of, ldc:double(1.0))))) {
                if (logicalnot:boolean(invokevirtual:boolean(OptionalDouble::isPresent, p0:OptionalDouble))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1424034017))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, invokestatic:float(Math::max, ldc:float(2.5f), mul:float(div:float(i2f:float(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, invokevirtual:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u52d3\u8709\ubf56\uc238\ufcaf\ua562, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6d69\u71ae\ucfaf\u516c\ube23\u8350)))), ldc:float(1920.0f)), ldc:float(2.5f))))
                }
                else {
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ubcb0\u494c\ua562\u69d9\ucfaf\u927d, d2f:float(invokevirtual:double(OptionalDouble::getAsDouble, p0:OptionalDouble)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A3 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_6AE : int
        
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
        var_3_6A3 = and:int(ldc:int(-1229343471), ldc:int(-1078034921))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u8389\ub102\uc238\u3711\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-967739526))
        }
        else {
            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1129793826))
            var_5_85 = and:int(ldc:int(10928), ldc:int(-10929))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3228), ldc:int(-3229)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_6A3:int, ldc:int(-1380434381))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(1052), ldc:int(1053)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_6A3 = and:int(var_3_D2:int, ldc:int(-1372635848))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32727), ldc:int(-32728)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-761601374))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1709388145))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1131319347))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1298731304))
                        goto(Label_0882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1559535929))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1263179502))
                    }
                    else {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-303074146))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0882)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1979276558))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-2105448911))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1153335926))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1903672166))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(260269679))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(816289617))
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1549900838))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1393822569))
                            var_11_E3 = and:int(ldc:int(-5295), ldc:int(5162))
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1859158040))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1611872818))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-465291287))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1569735748))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(152268698))
                        goto(Label_0882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1987021061))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-881872444))
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-193200586))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0882)
                        }
                    }
                    
                    Label_0744:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-575570518))
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-776996448))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-410902442))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1921178244))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(296183506))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-319012999))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0882:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-760792021))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(855122784))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1373655026))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1204891293))
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-759757531))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1918294919))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-46205422))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(9299), ldc:int(773))
                                goto(Label_1170)
                            }
                        }
                    }
                    
                    Label_1020:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-285831841))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1025801997))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1209823216))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-269484129))
                        var_11_E3 = and:int(ldc:int(21077), ldc:int(-21080))
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1439)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1595672306))
                            goto(Label_1020)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(437037443))
                            goto(Label_0882)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(81389004))
                            goto(Label_0744)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(1403304676))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-2128690157))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-315769454))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1439)
                            }
                        }
                    }
                    
                    Label_1299:
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1499221601))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1170)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1710265043))
                            goto(Label_1020)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0882)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(818977191))
                            goto(Label_0744)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-770196006))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-605366923))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1514258766))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1569)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1439:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-271215067))
                        goto(Label_1580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(695631302))
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1344919473))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(969681980))
                        loopcontinue()
                    }
                    
                    var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1266696617))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1569:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AE = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1580:
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-391476843))
                        goto(Label_1439)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1941598764))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-2067569250))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-347644386))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-335052770))
                        goto(Label_0882)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0744)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-428163177))
                        var_17_6AE = add:int(var_16_111:int, and:int(ldc:int(9), ldc:int(4689)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A3 = and:int(var_3_6A3:int, ldc:int(-1498808738))
                
                if (cmple:boolean(var_5_85 = var_17_6AE:int, sub:int(var_6_8C:int, and:int(ldc:int(13745), ldc:int(16907))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6A3:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
