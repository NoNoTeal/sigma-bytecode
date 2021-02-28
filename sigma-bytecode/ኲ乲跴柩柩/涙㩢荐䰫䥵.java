public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u6d99\u3a62\u8350\u4c2b\u4975 {
    public void \u6d99\u3a62\u8350\u4c2b\u4975(java.lang.Object p0, java.lang.Class<?> p1, java.lang.reflect.Method p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ucfaf\u2dcc\uc84e\u6ec6\ubded p3) {
        var_7_A9 : IllegalAccessException
        
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
            invokespecial:Object(Object::<init>, this:\u6d99\u3a62\u8350\u4c2b\u4975)
            putfield:Object(\u6d99\u3a62\u8350\u4c2b\u4975::\ub18d\u0a06\u516c\u40a9\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975, p0:Object)
            putfield:Class<?>(\u6d99\u3a62\u8350\u4c2b\u4975::\ud4fe\u7bad\ud7e8\uc238\u99f7, this:\u6d99\u3a62\u8350\u4c2b\u4975, p1:Class<?>)
            putfield:Method(\u6d99\u3a62\u8350\u4c2b\u4975::\uc238\u64ab\u7006\u8d98\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975, p2:Method)
            putfield:\u56bd\u88c5\u3e75\u3dd3\u9033(\u6d99\u3a62\u8350\u4c2b\u4975::\uff55\u97b7\u97b7\u5245\u71ae, this:\u6d99\u3a62\u8350\u4c2b\u4975, invokestatic:\u56bd\u88c5\u3e75\u3dd3\u9033(\u960f\u3d4b\u8350\u8640\u5d20::\u760c\u6ec6\ucfaf\uf9c5\u3dd3, p2:Method))
            
            try {
                putfield:MethodHandle(\u6d99\u3a62\u8350\u4c2b\u4975::\u8413\u6fb0\uf9c5\u6435\u7bad, this:\u6d99\u3a62\u8350\u4c2b\u4975, invokevirtual:MethodHandle(Lookup::unreflect, invokestatic:Lookup(MethodHandles::lookup), p2:Method))
            }
            catch (java.lang.IllegalAccessException var_7_A9) {
                invokevirtual:void(Throwable::printStackTrace, var_7_A9:IllegalAccessException[expected:Throwable])
            }
            
            putfield:\ucfaf\u2dcc\uc84e\u6ec6\ubded(\u6d99\u3a62\u8350\u4c2b\u4975::\u5f50\u3711\u0c95\ubb2b\u8308, this:\u6d99\u3a62\u8350\u4c2b\u4975, p3:\ucfaf\u2dcc\uc84e\u6ec6\ubded)
            putfield:boolean(\u6d99\u3a62\u8350\u4c2b\u4975::\u2dcc\u760c\ua6bd\uf9c5\u9a18, this:\u6d99\u3a62\u8350\u4c2b\u4975, ternaryop:int[expected:boolean](cmpeq:boolean(invokevirtual:Class<?>(Class<?>::getSuperclass, invokevirtual:Class<?>(Object::getClass, p0:Object)), invokevirtual:Class<? super \u4daf\ud51e\ubb2b\uc2e8\u8c8a>(Class<\u4daf\ud51e\ubb2b\uc2e8\u8c8a>::getSuperclass, ldc:Class<\u4daf\ud51e\ubb2b\uc2e8\u8c8a>(\u51fa\u12cb\u7330\u74b1\u6c52.\u4daf\ud51e\ubb2b\uc2e8\u8c8a.class))), and:int(ldc:int(10249), ldc:int(37)), and:int(ldc:int(23188), ldc:int(-24245))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \ua6bd\u6d99\u8640\u5d20\u71ae() {
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
            return:Object(getfield:Object(\u6d99\u3a62\u8350\u4c2b\u4975::\ub18d\u0a06\u516c\u40a9\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.invoke.MethodHandle \ub70c\u8753\u71ae\uc246\u3d64() {
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
            return:MethodHandle(getfield:MethodHandle(\u6d99\u3a62\u8350\u4c2b\u4975::\u8413\u6fb0\uf9c5\u6435\u7bad, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u56bd\u88c5\u3e75\u3dd3\u9033 \u12cb\ua61f\u12b2\u6bb9\u6fb0() {
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
            return:\u56bd\u88c5\u3e75\u3dd3\u9033(getfield:\u56bd\u88c5\u3e75\u3dd3\u9033(\u6d99\u3a62\u8350\u4c2b\u4975::\uff55\u97b7\u97b7\u5245\u71ae, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.reflect.Method \u7c6b\u7043\u8df4\u120d\u2dcc() {
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
            return:Method(getfield:Method(\u6d99\u3a62\u8350\u4c2b\u4975::\uc238\u64ab\u7006\u8d98\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ucfaf\u2dcc\uc84e\u6ec6\ubded \u69d9\u960f\u960f\u600f\u3d64() {
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
            return:\ucfaf\u2dcc\uc84e\u6ec6\ubded(getfield:\ucfaf\u2dcc\uc84e\u6ec6\ubded(\u6d99\u3a62\u8350\u4c2b\u4975::\u5f50\u3711\u0c95\ubb2b\u8308, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u624e\u8d90\u4cd9\u64f2\u516c() {
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
            return:boolean(getfield:boolean(\u6d99\u3a62\u8350\u4c2b\u4975::\u2dcc\u760c\ua6bd\uf9c5\u9a18, this:\u6d99\u3a62\u8350\u4c2b\u4975))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_4_7C : \u6d99\u3a62\u8350\u4c2b\u4975
        stack_CF_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-1519869190), ldc:int(1568668645))
        
        if (logicalnot:boolean(instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\u6d99\u3a62\u8350\u4c2b\u4975.class, p0:Object))) {
            return:boolean(and:int[expected:boolean](ldc:int(-17905), ldc:int(17888)))
        }
        
        var_4_7C = checkcast:\u6d99\u3a62\u8350\u4c2b\u4975(\u12b2\u4e72\u8df4\u67e9\u67e9.\u6d99\u3a62\u8350\u4c2b\u4975.class, p0:Object[expected:\u6d99\u3a62\u8350\u4c2b\u4975])
        
        if (cmpeq:boolean(getfield:Object(\u6d99\u3a62\u8350\u4c2b\u4975::\ub18d\u0a06\u516c\u40a9\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975), getfield:Object(\u6d99\u3a62\u8350\u4c2b\u4975::\ub18d\u0a06\u516c\u40a9\ub32d, var_4_7C:\u6d99\u3a62\u8350\u4c2b\u4975))) {
            if (cmpeq:boolean(getfield:Method(\u6d99\u3a62\u8350\u4c2b\u4975::\uc238\u64ab\u7006\u8d98\ub32d, this:\u6d99\u3a62\u8350\u4c2b\u4975), getfield:Method(\u6d99\u3a62\u8350\u4c2b\u4975::\uc238\u64ab\u7006\u8d98\ub32d, var_4_7C:\u6d99\u3a62\u8350\u4c2b\u4975))) {
                if (cmpeq:boolean(getfield:\ucfaf\u2dcc\uc84e\u6ec6\ubded(\u6d99\u3a62\u8350\u4c2b\u4975::\u5f50\u3711\u0c95\ubb2b\u8308, this:\u6d99\u3a62\u8350\u4c2b\u4975), getfield:\ucfaf\u2dcc\uc84e\u6ec6\ubded(\u6d99\u3a62\u8350\u4c2b\u4975::\u5f50\u3711\u0c95\ubb2b\u8308, var_4_7C:\u6d99\u3a62\u8350\u4c2b\u4975))) {
                    stack_CF_0 = and:int[expected:boolean](ldc:int(12305), ldc:int(2561))
                    return:boolean(stack_CF_0:boolean)
                }
            }
        }
        
        var_2_5F = and:int(var_2_5F:int, ldc:int(-1242648595))
        stack_CF_0 = and:int[expected:boolean](ldc:int(-16757), ldc:int(16756))
        return:boolean(stack_CF_0:boolean[expected:int])
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
    
    public void \u64ab\u983f\u40a9\ub83f\uae87(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_604 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60F : int
        
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
        var_3_604 = and:int(ldc:int(1128854481), ldc:int(-697305253))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d99\u3a62\u8350\u4c2b\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_604 = and:int(var_3_604:int, ldc:int(-1530823451))
        }
        else {
            var_3_604 = and:int(var_3_604:int, ldc:int(-406586399))
            var_5_85 = and:int(ldc:int(-17208), ldc:int(17207))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18130), ldc:int(17601)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_604:int, ldc:int(2120611809))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(8704), ldc:int(8705)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(33), ldc:int(25217)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_604 = and:int(var_3_D2:int, ldc:int(-562956443))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(12431), ldc:int(18961)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(707796196))
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1846046511))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(10469015))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-868494842))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1542396581))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1079749003))
                    }
                    else {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1271726051))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-140512160))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1404729916))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1421671893))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(359167706))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-948662531))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-321343152))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-692259993))
                        var_11_E3 = and:int(ldc:int(2222), ldc:int(-2223))
                        goto(Label_1434)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-873845922))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1237339730))
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-287521946))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1908755630))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-480184347))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1359361017))
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-253511405))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-250101750))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-803569109))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-881033579))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(1861025733))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1124157260))
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-2071139045))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1179927830))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1198661916))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(1579219953))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(3592), ldc:int(3593))
                                goto(Label_1081)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(2)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1527654516))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1632350028))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1743717302))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-551454335))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(512)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-885286777))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1035862147))
                        var_11_E3 = and:int(ldc:int(8850), ldc:int(-8851))
                    }
                    
                    Label_1081:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1315)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1944351806))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1520645026))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-688786447))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1315)
                            }
                        }
                    }
                    
                    Label_1179:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1510038647))
                        goto(Label_1445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1642572244))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1081)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1594198162))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(331604167))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(2146501639))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-217645239))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1434)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1315:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(2068634900))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(2062215936))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-608757047))
                        loopcontinue()
                    }
                    
                    var_3_604 = and:int(var_3_604:int, ldc:int(1341849455))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1434:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1445:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(248249484))
                        goto(Label_1315)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-455421311))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-123872179))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(512)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1271986129))
                        var_17_60F = add:int(var_16_111:int, xor:int(ldc:int(12298), ldc:int(12299)))
                        looporswitchbreak()
                    }
                }
                
                var_3_604 = and:int(var_3_604:int, ldc:int(-1018758309))
                
                if (cmple:boolean(var_5_85 = var_17_60F:int, sub:int(var_6_8C:int, and:int(ldc:int(13195), ldc:int(81))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
