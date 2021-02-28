public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe {
    public static com.mojang.serialization.Codec<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe> \uf94d\u0c95\ubefe\ub83f\ub70c\u0b8e(int p0, int p1, int p2) {
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
    
    private void \uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(int p0, int p1) {
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
            invokespecial:Object(Object::<init>, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            putfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, p0:int)
            putfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe \u92ee\u72f1\u7ce1\uae5d\u3a62\u5d20(int p0) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(initobject:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::<init>, p0:int, and:int(ldc:int(-8723), ldc:int(8722))))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe \u88c5\u5245\u759a\u3711\ud36e\u92ee(int p0, int p1) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(initobject:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::<init>, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public int \u4cd9\ubb2b\u5fe1\u71ae\u6c52\u4f52(java.util.Random p0) {
        var_2_5F : int
        stack_91_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(927227584), ldc:int(-682649710))
            
            if (cmpne:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1244823588))
                stack_91_0 = add:int(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), invokevirtual:int(Random::nextInt, p0:Random, add:int(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), and:int(ldc:int(2059), ldc:int(9009)))))
            }
            else {
                stack_91_0 = getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
            }
            
            return:int(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_D4 : int
        var_4_C2 : \uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe
        stack_102_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-1920334641), ldc:int(-121770787))
        
        if (cmpeq:boolean(this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(1), ldc:int(4593)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(1417844406))
            }
            else {
                var_2_D4 = and:int(var_2_5F:int, ldc:int(-555776753))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe>(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::getClass, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        var_4_C2 = checkcast:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe.class, p0:Object[expected:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe])
                        
                        if (logicaland:boolean(cmpeq:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, var_4_C2:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)), cmpeq:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, var_4_C2:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))) {
                            stack_102_0 = xor:int(ldc:int(12353), ldc:int(12352))
                        }
                        else {
                            var_2_D4 = and:int(var_2_D4:int, ldc:int(-287754115))
                            stack_102_0 = and:int(ldc:int(-7508), ldc:int(5459))
                        }
                        
                        return:boolean(stack_102_0:int)
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_D4:int, ldc:int(2097152)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(7311), ldc:int(-7376)))
            }
            
            var_2_5F = and:int(var_2_D4:int, ldc:int(1046014412))
        }
    }
    
    public int hashCode() {
        expr_67 : Object[] [generated]
        
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
            expr_67 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(6286), ldc:int(16738)))
            storeelement:Object(expr_67:Object[], and:int(ldc:int(-15799), ldc:int(15526)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))
            storeelement:Object(expr_67:Object[], and:int(ldc:int(17), ldc:int(1155)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))
            return:int(invokestatic:int(Objects::hash, expr_67:Object[]))
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(18792), ldc:int(-18793)))), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)), ldc:char(45)), add:int(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe))), ldc:char(93))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\u3e75\uc246\u6bb9\u16f6\u4f52\u9033$7(int p0, int p1, int p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p3) {
        var_4_101 : int
        stack_149_0 : DataResult [generated]
        
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
            var_4_101 = and:int(ldc:int(616901057), ldc:int(1442396653))
            
            if (cmpge:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), p0:int)) {
                if (cmple:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), p1:int)) {
                    if (cmpgt:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), p2:int)) {
                        goto(Label_0244)
                    }
                    
                    stack_149_0 = invokestatic:DataResult(DataResult::success, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe[expected:Object])
                    return:DataResult(stack_149_0:DataResult)
                }
            }
            
            Label_0107:
            
            if (cmpeq:boolean(and:int(var_4_101:int, ldc:int(134217728)), ldc:int(0))) {
                return:DataResult(invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), xor:int(ldc:int(4), ldc:int(7)))), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(19213), ldc:int(4196)))), p0:int), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(2821), ldc:int(13325)))), p1:int), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(1030), ldc:int(18566)))))))
            }
            
            var_4_101 = and:int(var_4_101:int, ldc:int(-1287142921))
            Label_0244:
            
            if (cmpne:boolean(and:int(var_4_101:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0107)
            }
            
            var_4_101 = and:int(var_4_101:int, ldc:int(-153145383))
            stack_149_0 = invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(24705), ldc:int(5929)))), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p3:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), xor:int(ldc:int(265), ldc:int(267)))), p2:int)))
            return:DataResult(stack_149_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Either lambda$\u6c52\u3c25\u88c5\ufcaf\u6d99\u8389$6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0) {
        var_1_5F : int
        stack_86_0 : Either [generated]
        
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
            var_1_5F = and:int(ldc:int(-1420488442), ldc:int(-820660762))
            
            if (cmpne:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1113630337))
                stack_86_0 = invokestatic:Either(Either::right, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe[expected:Object])
            }
            else {
                stack_86_0 = invokestatic:Either(Either::left, invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))
            }
            
            return:Either(stack_86_0:Either)
        }
        
        goto(Label_0006)
    }
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe lambda$\u5db4\u9af2\u67e9\u8350\u6435\u67e9$5(com.mojang.datafixers.util.Either p0) {
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
    
    private static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe lambda$\uc84e\u7049\ub102\u416d\u36d3\u9255$4(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0) {
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
            return:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe(p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\uf94d\u5245\u92ee\ud7e8\u3dd3\u6fb0$3(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0) {
        var_1_5F : int
        stack_9E_0 : DataResult [generated]
        
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
            var_1_5F = and:int(ldc:int(695559112), ldc:int(268265917))
            
            if (cmpge:boolean(getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1328936874))
                stack_9E_0 = invokestatic:DataResult(DataResult::success, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe[expected:Object])
            }
            else {
                stack_9E_0 = invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8c8a\uc4d2\u759a\u4f4a\u4ab3\ucfaf), and:int(ldc:int(8335), ldc:int(18695)))), getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe))))
            }
            
            return:DataResult(stack_9E_0:DataResult)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u34df\u6435\u5140\u7bad\u3e75\ub1b9$2(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Integer lambda$\u759a\u6fb0\u3a62\ua6bd\uc84e\u5140$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u4f52\ub113\u8d90\u965f\u7049\u97b7, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u6cfe\u392e\u36d3\u59ec\u071d\u6ec6$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe::\u8389\uafe7\uc84e\u965f\ud7e8\uceb8, p0:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe)))
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
    
    public void \u36d3\uceb8\ubefe\u8bb0\u4e72\ufe34(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(-37190349), ldc:int(-640755778))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-11750470))
            var_5_81 = and:int(ldc:int(23148), ldc:int(-24173))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8071), ldc:int(8070)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_674:int, ldc:int(-77491598))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(12691), ldc:int(1633)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(160), ldc:int(161)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_DA:int, ldc:int(-69308501))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(5353), ldc:int(2835)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1678819205))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(501770224))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(971820076))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(226819778))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-222523761))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1606297193))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-607364814))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-353956837))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2038562706))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2069520704))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(210194201))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-571974726))
                            var_11_EB = and:int(ldc:int(15436), ldc:int(-31821))
                            goto(Label_1511)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2011610204))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(536779597))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-105173212))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(2056274178))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-538263706))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1978315051))
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(570431086))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-580024390))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1567942546))
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1681096998))
                        goto(Label_1365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1249)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-444055738))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(33625633))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-639048009))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(3137), ldc:int(8967))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(108334585))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(684828760))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-604535380))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-883645085))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-582906498))
                        var_11_EB = and:int(ldc:int(12617), ldc:int(-12762))
                    }
                    
                    Label_1109:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(217638749))
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-367686981))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-92822122))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-922120221))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1815702717))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(756930993))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-579644546))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1365)
                            }
                        }
                    }
                    
                    Label_1249:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1770574584))
                        goto(Label_1522)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1109)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(216086265))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-109195714))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1511)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1365:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1522)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1671398052))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1817391868))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1487991979))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(541689422))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-689147216))
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-44735562))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1511:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1522:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1586440317))
                        goto(Label_1249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1631654194))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1771325336))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1757882693))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(313536560))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1124609231))
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-37350285))
                        var_17_67F = add:int(var_16_119:int, and:int(ldc:int(18471), ldc:int(9217)))
                        looporswitchbreak()
                    }
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-70961233))
                
                if (cmple:boolean(var_5_81 = var_17_67F:int, sub:int(var_6_88:int, xor:int(ldc:int(2242), ldc:int(2243))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-586308614))
            goto(Label_0108)
        }
    }
}
