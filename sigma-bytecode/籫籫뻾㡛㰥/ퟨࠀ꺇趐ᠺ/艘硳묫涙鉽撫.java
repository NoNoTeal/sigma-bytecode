public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab {
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab \u1187\u6c56\u839e\u8640\u8753\u4975(com.mojang.brigadier.StringReader p0, java.lang.Float p1, java.lang.Float p2) {
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
            
            if (cmpne:boolean(p1:Float, aconstnull:Float())) {
                if (cmpne:boolean(p2:Float, aconstnull:Float())) {
                    if (cmpgt:boolean(invokevirtual:float(Float::floatValue, p1:Float), invokevirtual:float(Float::floatValue, p2:Float))) {
                        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::createWithContext, getstatic:SimpleCommandExceptionType(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u0800\u965f\u4c04\u8d90\u6b0d\u0b8e), p0:StringReader[expected:ImmutableStringReader]))
                    }
                }
            }
            
            return:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(initobject:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::<init>, p1:Float, p2:Float))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Double \u8c8a\u67e9\ubf56\u99f7\u516c\u4975(java.lang.Float p0) {
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
            return:Double(ternaryop:Double(cmpne:boolean(p0:Float, aconstnull:Float()), invokestatic:Double(Double::valueOf, mul:double(invokevirtual:double(Float::doubleValue, p0:Float), invokevirtual:double(Float::doubleValue, p0:Float))), aconstnull:Double()))
        }
        
        goto(Label_0006)
    }
    
    private void \u8258\u7873\ubb2b\u6d99\u927d\u64ab(java.lang.Float p0, java.lang.Float p1) {
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
            invokespecial:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>(\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>::<init>, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:\uc2e8\ub113\u3776\u4975\u40a9\u9255<Float>], p0:Float, p1:Float)
            putfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u5654\u983f\ud51e\u600f\u71ae\u446c, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab, invokestatic:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u8c8a\u67e9\ubf56\u99f7\u516c\u4975, p0:Float))
            putfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u527a\u6b5f\u3d64\u647c\u4e72\u6c52, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab, invokestatic:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u8c8a\u67e9\ubf56\u99f7\u516c\u4975, p1:Float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab \u516c\u74b1\u7006\uc246\u0800\u516c(float p0) {
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
            return:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(initobject:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::<init>, invokestatic:Float(Float::valueOf, p0:float), checkcast:Float(java.lang.Float.class, aconstnull:Float())))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9937\u69d9\ua6bd\u8413\u600f\u98a4(float p0) {
        var_2_5F : int
        stack_EA_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1017265588), ldc:int(-365080710))
            
            if (cmpne:boolean(getfield:T extends Number(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\ucb79\u98a4\ud158\u4f52\u6d69\u392e, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab), aconstnull:T extends Number())) {
                if (cmpgt:boolean(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, getfield:T extends Number[expected:Float](\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\ucb79\u98a4\ud158\u4f52\u6d69\u392e, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab))), p0:float)) {
                    return:boolean(and:int[expected:boolean](ldc:int(9243), ldc:int(-9628)))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1033439299))
                }
                else {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-362939575))
                    
                    if (cmpne:boolean(getfield:T extends Number(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u4bc8\uae5d\u8709\u9a18\u67e9\ua6bd, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab), aconstnull:T extends Number())) {
                        if (cmplt:boolean(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, getfield:T extends Number[expected:Float](\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u4bc8\uae5d\u8709\u9a18\u67e9\ua6bd, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab))), p0:float)) {
                            stack_EA_0 = and:int(ldc:int(-23983), ldc:int(6318))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                    stack_EA_0 = and:int(ldc:int(1057), ldc:int(4355))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_EA_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u624e\ubded\u3a62\u965f\ub171\u4e72(double p0) {
        var_3_5F : int
        var_3_72 : int
        stack_EC_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(277225269), ldc:int(997982101))
            
            if (cmpne:boolean(getfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u5654\u983f\ud51e\u600f\u71ae\u446c, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab), aconstnull:Double())) {
                if (cmpgt:boolean(invokevirtual:double(Double::doubleValue, getfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u5654\u983f\ud51e\u600f\u71ae\u446c, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab)), p0:double)) {
                    return:boolean(and:int[expected:boolean](ldc:int(-30096), ldc:int(29967)))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(512)), ldc:int(0))) {
                    var_3_72 = and:int(var_3_5F:int, ldc:int(1627393215))
                }
                else {
                    var_3_72 = and:int(var_3_5F:int, ldc:int(-702612485))
                    
                    if (cmpne:boolean(getfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u527a\u6b5f\u3d64\u647c\u4e72\u6c52, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab), aconstnull:Double())) {
                        if (cmplt:boolean(invokevirtual:double(Double::doubleValue, getfield:Double(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\u527a\u6b5f\u3d64\u647c\u4e72\u6c52, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab)), p0:double)) {
                            stack_EC_0 = and:int(ldc:int(-18566), ldc:int(18565))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_72:int, ldc:int(512)), ldc:int(0))) {
                    stack_EC_0 = xor:int(ldc:int(90), ldc:int(91))
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_72:int, ldc:int(2019288801))
            }
            
            return:boolean(stack_EC_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab \u4c2b\ua61f\u62da\u1833\u6c52\u5bc4(com.google.gson.JsonElement p0) {
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
            return:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(checkcast:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab.class, invokestatic:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\uc2e8\ub113\u3776\u4975\u40a9\u9255<T>::\u4c2b\ua61f\u62da\u1833\u6c52\u5bc4, p0:JsonElement, getstatic:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\ub102\uf94d\ub32d\u8413\u8389\ua3b4), invokedynamic:BiFunction<JsonElement, String, Float>(apply:()Ljava/util/function/BiFunction;), invokedynamic:\ub19c\u836c\u873d\ub19c\u3bd6\u72f1<Float, \u8258\u7873\ubb2b\u6d99\u927d\u64ab>(\ud36e\u4bc8\uafe7\u7330\u718f\u4daf:()L\u494c\u4975\ua068\u0c95\uc84e/\ub19c\u836c\u873d\ub19c\u3bd6\u72f1;))))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab \uc2e8\u3e2a\u8d98\u36d3\u1833\uc246(com.mojang.brigadier.StringReader p0) {
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
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab \uc2e8\u3e2a\u8d98\u36d3\u1833\uc246(com.mojang.brigadier.StringReader p0, java.util.function.Function<java.lang.Float, java.lang.Float> p1) {
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
            return:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(checkcast:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8258\u7873\ubb2b\u6d99\u927d\u64ab.class, invokestatic:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\uc2e8\ub113\u3776\u4975\u40a9\u9255<T>::\uc2e8\u3e2a\u8d98\u36d3\u1833\uc246, p0:StringReader, invokedynamic:\u98a4\ucef1\u62da\u92ee\ud171\u8308<Float, \u8258\u7873\ubb2b\u6d99\u927d\u64ab>(\u64f2\u52d3\ua562\ub83f\u56bd\u6cfe:()L\u51fa\u12cb\u7330\u74b1\u6c52/\u76bc\u4975\ua6bd\u4daf\u8d98/\u98a4\ucef1\u62da\u92ee\ud171\u8308;), invokedynamic:Function<String, Float>(apply:()Ljava/util/function/Function;), invokedynamic:Supplier<DynamicCommandExceptionType>(get:(Lcom/mojang/brigadier/exceptions/BuiltInExceptionProvider;)Ljava/util/function/Supplier;, getstatic:BuiltInExceptionProvider(CommandSyntaxException::BUILT_IN_EXCEPTIONS)), p1:Function<Float, Float>)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Float lambda$\u61a4\uafe7\u34df\u4ab3\ub171\u4e72$0(java.lang.Float p0) {
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
            return:Float(p0:Float)
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
            putstatic:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::\ub102\uf94d\ub32d\u8413\u8389\ua3b4, initobject:\u8258\u7873\ubb2b\u6d99\u927d\u64ab(\u8258\u7873\ubb2b\u6d99\u927d\u64ab::<init>, checkcast:Float(java.lang.Float.class, aconstnull:Float()), checkcast:Float(java.lang.Float.class, aconstnull:Float())))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\u2dcc\u8df4\u8753\u93a2\uc2e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B2 : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6BD : int
        
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
        var_3_6B2 = and:int(ldc:int(633636892), ldc:int(-1109501138))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\u7873\ubb2b\u6d99\u927d\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1077522091))
            var_5_7F = and:int(ldc:int(-9970), ldc:int(9969))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10048), ldc:int(-10049)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_6B2:int, ldc:int(661020602))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, and:int(ldc:int(9239), ldc:int(129)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(4489), ldc:int(1575)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_6B2 = and:int(var_3_CF:int, ldc:int(1029991176))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(11267), ldc:int(593)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-215136210))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(446748810))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(824533926))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1297853282))
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(259839705))
                    }
                    else {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-276847421))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0591)
                            }
                            
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-384268607))
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(969931064))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1100146549))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1126352277))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1292534560))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1151723129))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(2009345536))
                        var_11_E0 = and:int(ldc:int(-2058), ldc:int(2057))
                        goto(Label_1582)
                    }
                    
                    Label_0591:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-2045728792))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1563041169))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1822625691))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1966518501))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1540280028))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1747290))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-772501046))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(371117207))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-930315585))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-560975394))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1435497405))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1591541442))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(710153032))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1522221981))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0878:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1118044254))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-518182785))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-856088980))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(759441171))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = and:int(ldc:int(23049), ldc:int(129))
                                goto(Label_1161)
                            }
                        }
                    }
                    
                    Label_0994:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-736370995))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-425198195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(902959431))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-969096626))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-84093398))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1242134208))
                        var_11_E0 = and:int(ldc:int(-24824), ldc:int(183))
                    }
                    
                    Label_1161:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-315040136))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1738174474))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(2011575862))
                            goto(Label_0591)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(849664289))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(905797646))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1419)
                            }
                        }
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(667082268))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1161)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1802603029))
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-924341831))
                            goto(Label_0591)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1250197801))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1842160760))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                        goto(Label_1582)
                    }
                    
                    Label_1419:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-271590485))
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1989244239))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(907299735))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(602395099))
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(932059683))
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-688203202))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-543066818))
                        loopcontinue()
                    }
                    
                    var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1701105813))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1582:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BD = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1593:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-362353176))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(453460035))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(315420574))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-496096310))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1692526599))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1073937709))
                        var_17_6BD = add:int(var_16_10E:int, and:int(ldc:int(26633), ldc:int(1541)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1480300506))
                
                if (cmple:boolean(var_5_7F = var_17_6BD:int, sub:int(var_6_86:int, and:int(ldc:int(12929), ldc:int(105))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
